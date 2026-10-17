package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.LivenessCheckType;
import com.fourthline.vision.selfie.SelfieScannerStep;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class xc implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f37101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final td f37102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f37103c;
    private final td d;
    private final LivenessCheckType e;
    private final Function0 f;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LivenessCheckType.values().length];
            try {
                iArr[LivenessCheckType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LivenessCheckType.HEAD_TURN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public xc(@NotNull List<? extends SelfieScannerStep> configuredSteps, @NotNull td mandatoryStepInteractor, @NotNull List<? extends td> legacyLivenessSteps, @NotNull td randomnessLivenessStep, @NotNull LivenessCheckType livenessCheckType, @NotNull Function0<Boolean> randomnessLivenessEnabled) {
        Intrinsics.checkNotNullParameter(configuredSteps, "configuredSteps");
        Intrinsics.checkNotNullParameter(mandatoryStepInteractor, "mandatoryStepInteractor");
        Intrinsics.checkNotNullParameter(legacyLivenessSteps, "legacyLivenessSteps");
        Intrinsics.checkNotNullParameter(randomnessLivenessStep, "randomnessLivenessStep");
        Intrinsics.checkNotNullParameter(livenessCheckType, "livenessCheckType");
        Intrinsics.checkNotNullParameter(randomnessLivenessEnabled, "randomnessLivenessEnabled");
        this.f37101a = configuredSteps;
        this.f37102b = mandatoryStepInteractor;
        this.f37103c = legacyLivenessSteps;
        this.d = randomnessLivenessStep;
        this.e = livenessCheckType;
        this.f = randomnessLivenessEnabled;
    }

    @Override // com.fourthline.vision.internal.d2
    public /* bridge */ void subscribe(Function2<? super List<? extends td>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        super.subscribe(function2);
    }

    @Override // com.fourthline.vision.internal.d2
    @NotNull
    public List<td> get() {
        if (!this.f37101a.isEmpty()) {
            ArrayList arrayListN = zhm.v.n(this.f37102b);
            if (this.f37101a.contains(SelfieScannerStep.ORCHESTRATED_LIVENESS)) {
                arrayListN.add(this.d);
                return arrayListN;
            }
            arrayListN.addAll(this.f37103c);
            return arrayListN;
        }
        int i = a.$EnumSwitchMapping$0[this.e.ordinal()];
        if (i == 1) {
            return zhm.u.c(this.f37102b);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return zhm.d0.E0(((Boolean) this.f.invoke()).booleanValue() ? zhm.u.c(this.d) : this.f37103c, zhm.u.c(this.f37102b));
    }
}
