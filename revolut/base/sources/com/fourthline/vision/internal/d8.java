package com.fourthline.vision.internal;

import com.fourthline.vision.internal.h6;
import com.fourthline.vision.selfie.SelfieScannerWarning;
import com.fourthline.vision.selfie.internal.domain.steps.HeadMetadata;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class d8 implements q7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f36102c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f36103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f36104b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d8(@NotNull Function0<Integer> requiredHeadDirectionFactory, @NotNull Function1<? super HeadMetadata, Unit> onHeadMoved) {
        Intrinsics.checkNotNullParameter(requiredHeadDirectionFactory, "requiredHeadDirectionFactory");
        Intrinsics.checkNotNullParameter(onHeadMoved, "onHeadMoved");
        this.f36103a = requiredHeadDirectionFactory;
        this.f36104b = onHeadMoved;
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

    private final boolean isInBounds(Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            int iIntValue2 = ((Number) this.f36103a.invoke()).intValue() % 360;
            int i = iIntValue2 - 10;
            if (iIntValue <= iIntValue2 + 10 && i <= iIntValue) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fourthline.vision.internal.q7
    public /* bridge */ /* synthetic */ Object process(Object obj2, Continuation continuation) {
        return process((List<? extends h6>) obj2, (Continuation<? super List<? extends SelfieScannerWarning>>) continuation);
    }

    @Override // com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    public /* bridge */ void start() {
        super.start();
    }

    @Override // com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    public /* bridge */ void stop() {
        super.stop();
    }

    public Object process(@NotNull List<? extends h6> list, @NotNull Continuation<? super List<? extends SelfieScannerWarning>> continuation) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof h6.b) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj3 = arrayList.get(i2);
            i2++;
            h6.b bVar = (h6.b) obj3;
            arrayList2.add(new HeadMetadata(new Float(bVar.getYaw()), new Float(bVar.getPitch()), calculateDirection(bVar.getYaw(), bVar.getPitch())));
        }
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj4 = arrayList2.get(i3);
            i3++;
            this.f36104b.invoke((HeadMetadata) obj4);
        }
        ArrayList arrayList3 = new ArrayList();
        int size3 = arrayList2.size();
        int i5 = 0;
        boolean z = false;
        while (i5 < size3) {
            Object obj5 = arrayList2.get(i5);
            i5++;
            if (z) {
                arrayList3.add(obj5);
            } else if (!isInBounds(((HeadMetadata) obj5).getDirection())) {
                arrayList3.add(obj5);
                z = true;
            }
        }
        ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
        int size4 = arrayList3.size();
        while (i < size4) {
            Object obj6 = arrayList3.get(i);
            i++;
            arrayList4.add(SelfieScannerWarning.FACE_YAW_TOO_BIG);
        }
        return zhm.d0.d1(arrayList4);
    }
}
