package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.initialization_contract.PluginLaunchInstructions;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.models.config.ManualUnderwritingScreenConfig;
import com.revolut.feature.credit.application.plugins.impl.navigation.plugins.ManualUnderwritingPluginFactory$ManualUnderwritingPluginLaunchInstructions;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.ManualUnderwritingContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.ManualUnderwritingRootFlow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class y1 extends oz3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hw3.d0 f210706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hw3.e f210707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kpj.f f210708c;

    public y1(hw3.d0 manualUnderwritingInteractor, hw3.e creditApplicationConfigInteractor, kpj.f manualUnderwritingPluginWaitingCommandFactory) {
        Intrinsics.checkNotNullParameter(manualUnderwritingInteractor, "manualUnderwritingInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationConfigInteractor, "creditApplicationConfigInteractor");
        Intrinsics.checkNotNullParameter(manualUnderwritingPluginWaitingCommandFactory, "manualUnderwritingPluginWaitingCommandFactory");
        this.f210706a = manualUnderwritingInteractor;
        this.f210707b = creditApplicationConfigInteractor;
        this.f210708c = manualUnderwritingPluginWaitingCommandFactory;
    }

    @Override // oz3.a
    public final efm.d0 d(ks3.c cVar, PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        ws3.a state = (ws3.a) cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        ufm.i iVar = new ufm.i(this.f210707b.b(ju3.a.MANUAL_UNDERWRITING, payload.f66247a.f168328j), new s(new ja3.d(state, this, navigationConfig, payload, 27), 13), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    @Override // oz3.a
    public final PluginFlowControllerV2 f(ks3.c cVar, PluginPayload pluginPayload) {
        ws3.a state = (ws3.a) cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        PluginLaunchInstructions pluginLaunchInstructions = pluginPayload.e;
        if (pluginLaunchInstructions instanceof ManualUnderwritingPluginFactory$ManualUnderwritingPluginLaunchInstructions) {
            return new ManualUnderwritingRootFlow(new ManualUnderwritingContract$InputData(((ManualUnderwritingPluginFactory$ManualUnderwritingPluginLaunchInstructions) pluginLaunchInstructions).f66924a, io3.h.R(pluginPayload, "")));
        }
        throw new IllegalStateException(m72.b.r("Can't find plugin configuration: ", kotlin.jvm.internal.o0.f186429a.b(ManualUnderwritingPluginFactory$ManualUnderwritingPluginLaunchInstructions.class)));
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(ws3.a r8, it3.d r9, com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mz3.y1.g(ws3.a, it3.d, com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oz3.a
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(ws3.a r5, it3.d r6, com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig r7, grl.r2 r8, wi0.b r9, java.lang.String r10, gim.c r11) {
        /*
            r4 = this;
            boolean r0 = r11 instanceof mz3.x1
            if (r0 == 0) goto L13
            r0 = r11
            mz3.x1 r0 = (mz3.x1) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            mz3.x1 r0 = new mz3.x1
            r0.<init>(r4, r11)
        L18:
            java.lang.Object r11 = r0.f210704y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.String r10 = r0.f210703x
            wi0.b r9 = r0.f210702w
            grl.r2 r8 = r0.v
            it3.d r6 = r0.u
            yhm.o.b(r11)
            goto L4b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            yhm.o.b(r11)
            r0.u = r6
            r0.v = r8
            r0.f210702w = r9
            r0.f210703x = r10
            r0.A = r3
            java.lang.Object r11 = r4.g(r5, r6, r7, r0)
            if (r11 != r1) goto L4b
            return r1
        L4b:
            com.revolut.feature.credit.application.plugins.impl.navigation.plugins.ManualUnderwritingPluginFactory$ManualUnderwritingPluginLaunchInstructions r11 = (com.revolut.feature.credit.application.plugins.impl.navigation.plugins.ManualUnderwritingPluginFactory$ManualUnderwritingPluginLaunchInstructions) r11
            com.revolut.feature.credit.application.models.plugins.PluginPayload$a r5 = com.revolut.feature.credit.application.models.plugins.PluginPayload.INSTANCE
            r5.getClass()
            com.revolut.feature.credit.application.models.plugins.PluginPayload r5 = com.revolut.feature.credit.application.models.plugins.PluginPayload.Companion.a(r6, r8, r9, r10, r11)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mz3.y1.e(ws3.a, it3.d, com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig, grl.r2, wi0.b, java.lang.String, gim.c):java.lang.Object");
    }

    public final ufm.c i(CreditApplicationStatusNavigationConfig navigationConfig, ManualUnderwritingScreenConfig screenConfig, PluginPayload payload) {
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        Intrinsics.checkNotNullParameter(payload, "payload");
        ufm.c cVar = new ufm.c(new a80.b(payload, this.f210708c, navigationConfig, screenConfig, 6), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}
