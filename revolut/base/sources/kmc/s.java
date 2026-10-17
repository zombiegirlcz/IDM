package kmc;

import com.revolut.feature.robo.api.RoboApi$Toggles;
import com.revolut.feature.robo.impl.ui.flow.onboarding.OnboardingFlowContract$Input;
import com.revolut.feature.robo.impl.ui.flow.onboarding.OnboardingFlowContract$State;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import k7c.l0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nii.c0;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes6.dex */
public final class s extends oki.h implements b {
    public final OnboardingFlowContract$Input o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zjh.f f185775p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final emc.e f185776q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n f185777r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ybl.k f185778s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final qmc.b f185779t;
    public final h u;
    public final gte.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f185780w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f185781x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final qki.d f185782y;
    public final yki.i z;

    @NotNull
    public static final l Companion = new l();
    public static final c0 A = new c0(null, null, null, true, null, false, false, null, 1903);

    public s(OnboardingFlowContract$State initialState, OnboardingFlowContract$Input input, zjh.f roboPortfolioInteractor, emc.e templatesInteractor, n submitDataBuilder, ybl.k tradingAccountsInteractor, qmc.b roboContextProvider, h addMoneyNaviCommandProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(roboPortfolioInteractor, "roboPortfolioInteractor");
        Intrinsics.checkNotNullParameter(templatesInteractor, "templatesInteractor");
        Intrinsics.checkNotNullParameter(submitDataBuilder, "submitDataBuilder");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(roboContextProvider, "roboContextProvider");
        Intrinsics.checkNotNullParameter(addMoneyNaviCommandProvider, "addMoneyNaviCommandProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = input;
        this.f185775p = roboPortfolioInteractor;
        this.f185776q = templatesInteractor;
        this.f185777r = submitDataBuilder;
        this.f185778s = tradingAccountsInteractor;
        this.f185779t = roboContextProvider;
        this.u = addMoneyNaviCommandProvider;
        this.v = featureToggleInteractor;
        final int i = 0;
        this.f185780w = w.y0(new Function0(this) { // from class: kmc.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f185753b;

            {
                this.f185753b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i) {
                    case 0:
                        zC = ((jte.d) this.f185753b.v).c(RoboApi$Toggles.RoboPortfolioDetailsScreenRevamp.f85023c);
                        break;
                    default:
                        zC = ((jte.d) this.f185753b.v).c(WealthUiApi$Toggles.RoboStrategies.f95863c);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
        final int i2 = 1;
        this.f185781x = w.y0(new Function0(this) { // from class: kmc.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f185753b;

            {
                this.f185753b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i2) {
                    case 0:
                        zC = ((jte.d) this.f185753b.v).c(RoboApi$Toggles.RoboPortfolioDetailsScreenRevamp.f85023c);
                        break;
                    default:
                        zC = ((jte.d) this.f185753b.v).c(WealthUiApi$Toggles.RoboStrategies.f95863c);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
        this.f185782y = hx7.e.b(this, initialState);
        this.z = d8l.d.a(this, new f(this, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        if (((ael.q0) r11).r(false, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(kmc.s r11, com.revolut.feature.robo.impl.ui.flow.onboarding.OnboardingFlowContract$State r12, gim.c r13) throws java.lang.Throwable {
        /*
            boolean r0 = r13 instanceof kmc.p
            if (r0 == 0) goto L13
            r0 = r13
            kmc.p r0 = (kmc.p) r0
            int r1 = r0.f185772w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f185772w = r1
            goto L18
        L13:
            kmc.p r0 = new kmc.p
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f185772w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r13)
            goto L83
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            yhm.o.b(r13)
            goto L78
        L36:
            yhm.o.b(r13)
            zjh.f r13 = r11.f185775p
            com.revolut.feature.robo.impl.ui.flow.onboarding.OnboardingFlowContract$Input r2 = r11.o
            java.lang.String r9 = r2.f85119b
            kmc.n r2 = r11.f185777r
            r2.getClass()
            java.lang.String r2 = "currentState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r2)
            alc.a r8 = new alc.a
            com.revolut.feature.wealth.models.robo.Template r12 = r12.f85123c
            if (r12 == 0) goto L86
            java.lang.String r12 = r12.f95706a
            r8.<init>(r12)
            r0.f185772w = r4
            java.lang.Object r12 = r13.f322835b
            r7 = r12
            k18.c r7 = (k18.c) r7
            lr.l r5 = new lr.l
            r6 = 26
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r12, r5, r0)
            if (r12 != r1) goto L6e
            goto L70
        L6e:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L70:
            if (r12 != r1) goto L73
            goto L75
        L73:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L75:
            if (r12 != r1) goto L78
            goto L82
        L78:
            ybl.k r11 = r11.f185778s
            r0.f185772w = r3
            java.lang.Object r11 = ybl.k.c(r11, r0)
            if (r11 != r1) goto L83
        L82:
            return r1
        L83:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L86:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Required value was null."
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kmc.s.I2(kmc.s, com.revolut.feature.robo.impl.ui.flow.onboarding.OnboardingFlowContract$State, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new l0(this, null, 21), new yi5.b(26));
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.f185782y;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.z;
    }
}
