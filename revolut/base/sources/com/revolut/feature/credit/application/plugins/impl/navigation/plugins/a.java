package com.revolut.feature.credit.application.plugins.impl.navigation.plugins;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.initialization_contract.PluginLaunchInstructions;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.KontomatikIncomeCheckEntryPoint;
import com.revolut.feature.credit.application.plugins.impl.navigation.plugins.KontomatikPluginLaunchInstructions;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.KontomatikIncomeCheckFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.KontomatikIncomeCheckFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.spinner.SpinnerFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.spinner.SpinnerRootFlow;
import com.revolut.retail.core.navigation.FeatureCommand;
import hw3.e;
import hz3.c;
import io3.h;
import ju3.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import pz3.d;
import xq3.j;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements sv3.b, oz3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f66936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f66937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f66938c;
    public final c d;
    public final sj4.a e;

    public a(j creditApplicationInteractor, e creditApplicationConfigInteractor, d factory, c creditApplicationCommandFactory, sj4.a expireMapper) {
        Intrinsics.checkNotNullParameter(creditApplicationInteractor, "creditApplicationInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationConfigInteractor, "creditApplicationConfigInteractor");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(creditApplicationCommandFactory, "creditApplicationCommandFactory");
        Intrinsics.checkNotNullParameter(expireMapper, "expireMapper");
        this.f66936a = creditApplicationInteractor;
        this.f66937b = creditApplicationConfigInteractor;
        this.f66938c = factory;
        this.d = creditApplicationCommandFactory;
        this.e = expireMapper;
    }

    public static g d(CreditApplicationStatusNavigationConfig creditApplicationStatusNavigationConfig) {
        return !creditApplicationStatusNavigationConfig.f66191a ? g.BOTTOM_SHEET : g.STATUS_DIALOG;
    }

    public static FeatureCommand e(PluginPayload pluginPayload, KontomatikIncomeCheckEntryPoint kontomatikIncomeCheckEntryPoint) {
        return new FeatureCommand(new CreditApplicationKompotFeatureConfig.KontomatikIncomeCheck(false, h.R(pluginPayload, ""), kontomatikIncomeCheckEntryPoint, null));
    }

    @Override // oz3.b
    public final PluginFlowControllerV2 a(PluginPayload pluginPayload) {
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        PluginLaunchInstructions pluginLaunchInstructions = pluginPayload.e;
        if (!(pluginLaunchInstructions instanceof KontomatikPluginLaunchInstructions)) {
            throw new IllegalStateException(m72.b.r("Can't find plugin configuration: ", o0.f186429a.b(KontomatikPluginLaunchInstructions.class)));
        }
        KontomatikPluginLaunchInstructions kontomatikPluginLaunchInstructions = (KontomatikPluginLaunchInstructions) pluginLaunchInstructions;
        if (kontomatikPluginLaunchInstructions instanceof KontomatikPluginLaunchInstructions.IncomeCheck) {
            return new KontomatikIncomeCheckFlow(new KontomatikIncomeCheckFlowContract$InputData(false, h.R(pluginPayload, ""), ((KontomatikPluginLaunchInstructions.IncomeCheck) kontomatikPluginLaunchInstructions).f66922a));
        }
        if (kontomatikPluginLaunchInstructions instanceof KontomatikPluginLaunchInstructions.Spinner) {
            return new SpinnerRootFlow(new SpinnerFlowContract$InputData(((KontomatikPluginLaunchInstructions.Spinner) kontomatikPluginLaunchInstructions).f66923a, h.R(pluginPayload, "")));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oz3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(it3.d r6, com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig r7, grl.r2 r8, wi0.b r9, java.lang.String r10, kotlin.coroutines.Continuation r11) {
        /*
            r5 = this;
            boolean r0 = r11 instanceof mz3.l1
            if (r0 == 0) goto L13
            r0 = r11
            mz3.l1 r0 = (mz3.l1) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L1a
        L13:
            mz3.l1 r0 = new mz3.l1
            gim.c r11 = (gim.c) r11
            r0.<init>(r5, r11)
        L1a:
            java.lang.Object r11 = r0.z
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.B
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            com.revolut.feature.credit.application.models.plugins.PluginPayload$a r6 = r0.f210631y
            java.lang.String r10 = r0.f210630x
            wi0.b r9 = r0.f210629w
            grl.r2 r8 = r0.v
            it3.d r7 = r0.u
            yhm.o.b(r11)
            goto L5b
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            yhm.o.b(r11)
            com.revolut.feature.credit.application.models.plugins.PluginPayload$a r11 = com.revolut.feature.credit.application.models.plugins.PluginPayload.INSTANCE
            com.revolut.feature.credit.application.models.plugins.PluginPayload r2 = com.revolut.feature.credit.application.models.plugins.PluginPayload.Companion.b(r11, r6, r8, r9, r10)
            r0.u = r6
            r0.v = r8
            r0.f210629w = r9
            r0.f210630x = r10
            r0.f210631y = r11
            r0.B = r3
            java.lang.Object r7 = r5.f(r2, r7, r0)
            if (r7 != r1) goto L57
            return r1
        L57:
            r4 = r7
            r7 = r6
            r6 = r11
            r11 = r4
        L5b:
            com.revolut.feature.credit.application.plugins.impl.navigation.plugins.KontomatikPluginLaunchInstructions r11 = (com.revolut.feature.credit.application.plugins.impl.navigation.plugins.KontomatikPluginLaunchInstructions) r11
            r6.getClass()
            com.revolut.feature.credit.application.models.plugins.PluginPayload r6 = com.revolut.feature.credit.application.models.plugins.PluginPayload.Companion.a(r7, r8, r9, r10, r11)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.navigation.plugins.a.b(it3.d, com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig, grl.r2, wi0.b, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x011a  */
    @Override // sv3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final efm.d0 c(com.revolut.feature.credit.application.models.plugins.PluginPayload r9, com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig r10) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.navigation.plugins.a.c(com.revolut.feature.credit.application.models.plugins.PluginPayload, com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig):efm.d0");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e9, code lost:
    
        if (r12 == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0118, code lost:
    
        if (r12 == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011a, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.revolut.feature.credit.application.models.plugins.PluginPayload r10, com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.navigation.plugins.a.f(com.revolut.feature.credit.application.models.plugins.PluginPayload, com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig, gim.c):java.lang.Object");
    }
}
