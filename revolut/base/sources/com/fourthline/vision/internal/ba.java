package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.internal.domain.steps.HeadMetadata;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ba {
    private static final a d = new a(null);
    public static final int e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f36008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f36010c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public ba(@NotNull Function0<? extends List<Integer>> stepAngles) {
        Intrinsics.checkNotNullParameter(stepAngles, "stepAngles");
        this.f36008a = stepAngles;
        this.f36010c = zhm.f0.f322471a;
    }

    private final Integer calculateDirection(float f, float f4) {
        if (Math.abs(f) <= 10.0f && Math.abs(f4) <= 10.0f) {
            return null;
        }
        float degrees = (float) Math.toDegrees((float) Math.atan2(-f, f4));
        if (degrees < BitmapDescriptorFactory.HUE_RED) {
            degrees += 360;
        }
        return Integer.valueOf((int) degrees);
    }

    private final boolean isInBounds(Integer num, int i) {
        if (num != null) {
            int iIntValue = num.intValue();
            int i2 = i % 360;
            int i3 = i2 - 10;
            if (iIntValue <= i2 + 10 && i3 <= iIntValue) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final List<Integer> getSteps() {
        return this.f36010c;
    }

    public final void process(@NotNull mh.a input, @NotNull Function1<? super HeadMetadata, Unit> onHeadMoved, @NotNull Function1<? super Integer, Unit> onStepUpdate, @NotNull Function1<? super Integer, Unit> onStepSuccess, @NotNull Function0<Unit> onAllStepsSuccess) {
        Integer num;
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(onHeadMoved, "onHeadMoved");
        Intrinsics.checkNotNullParameter(onStepUpdate, "onStepUpdate");
        Intrinsics.checkNotNullParameter(onStepSuccess, "onStepSuccess");
        Intrinsics.checkNotNullParameter(onAllStepsSuccess, "onAllStepsSuccess");
        Float fValueOf = Float.valueOf(input.f205336g);
        float f = input.f;
        HeadMetadata headMetadata = new HeadMetadata(fValueOf, Float.valueOf(f), calculateDirection(input.f205336g, f));
        onHeadMoved.invoke(headMetadata);
        Integer num2 = (Integer) zhm.d0.e0(this.f36009b, this.f36010c);
        if (num2 != null) {
            if (isInBounds(headMetadata.getDirection(), num2.intValue())) {
                onStepSuccess.invoke(Integer.valueOf(this.f36009b));
                List list = (List) this.f36008a.invoke();
                if (list != null) {
                    int i = this.f36009b + 1;
                    this.f36009b = i;
                    num = (Integer) zhm.d0.e0(i, list);
                } else {
                    num = null;
                }
                if (num == null) {
                    onAllStepsSuccess.invoke();
                } else {
                    onStepUpdate.invoke(num);
                }
            }
        }
    }

    public final void reset() {
        this.f36010c = zhm.f0.f322471a;
        this.f36009b = 0;
    }

    public final void setSteps(@NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f36010c = list;
    }

    public final void start() {
        List list = (List) this.f36008a.invoke();
        if (list == null) {
            throw new IllegalStateException("Can't start without angles provided!");
        }
        this.f36010c = list;
    }
}
