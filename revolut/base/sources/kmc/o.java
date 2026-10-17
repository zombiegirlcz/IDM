package kmc;

import com.revolut.feature.robo.impl.ui.flow.onboarding.OnboardingFlowContract$Step;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f185770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f185771b;

    static {
        int[] iArr = new int[OnboardingFlowContract$Step.values().length];
        try {
            iArr[OnboardingFlowContract$Step.TEMPLATES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OnboardingFlowContract$Step.PROJECTIONS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OnboardingFlowContract$Step.STRATEGY_REVEAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[OnboardingFlowContract$Step.AGREEMENTS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f185770a = iArr;
        int[] iArr2 = new int[ilc.a.values().length];
        try {
            iArr2[ilc.a.EEA.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        f185771b = iArr2;
    }
}
