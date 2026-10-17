package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.retail.core.navigation.DummyCommand;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a1 implements sv3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fmc.z f210578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zfe.e f210579b;

    public a1(fmc.z creditCardExitPluginInteractor, zfe.e newAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(creditCardExitPluginInteractor, "creditCardExitPluginInteractor");
        Intrinsics.checkNotNullParameter(newAccountDestinationResolver, "newAccountDestinationResolver");
        this.f210578a = creditCardExitPluginInteractor;
        this.f210579b = newAccountDestinationResolver;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r10, gim.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof mz3.z0
            if (r0 == 0) goto L13
            r0 = r11
            mz3.z0 r0 = (mz3.z0) r0
            int r1 = r0.f210712x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f210712x = r1
            goto L18
        L13:
            mz3.z0 r0 = new mz3.z0
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f210712x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.retail.core.navigation.FeatureCommand r10 = r0.u
            yhm.o.b(r11)
            goto L6b
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            yhm.o.b(r11)
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r11 = new com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main
            com.revolut.feature.tab.accounts.models.ProductId r2 = com.revolut.feature.tab.accounts.models.ProductId.CREDIT
            com.revolut.feature.tab.accounts.models.ProductAccountId r4 = new com.revolut.feature.tab.accounts.models.ProductAccountId
            com.revolut.feature.credit.models.CreditAccountType$CreditCard r5 = new com.revolut.feature.credit.models.CreditAccountType$CreditCard
            r5.<init>(r10)
            r4.<init>(r10, r5)
            r11.<init>(r4, r2)
            com.revolut.retail.core.navigation.FeatureCommand r10 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$WithInnerConfiguration r2 = new com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$WithInnerConfiguration
            s49.a r4 = s49.a.SINGLE_TOP
            com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration r5 = new com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration
            com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId$MainContainerTabId r6 = u49.a.f277275a
            r7 = 6
            r8 = 0
            r5.<init>(r6, r8, r8, r7)
            r2.<init>(r4, r5)
            r10.<init>(r2)
            r0.u = r10
            r0.f210712x = r3
            zfe.d r2 = zfe.e.Companion
            zfe.e r2 = r9.f210579b
            cge.e r2 = (cge.e) r2
            java.lang.Object r11 = r2.a(r11, r8, r0)
            if (r11 != r1) goto L6b
            return r1
        L6b:
            r2 = r11
            com.revolut.kompot.common.ParcelableDestination r2 = (com.revolut.kompot.common.ParcelableDestination) r2
            com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig r0 = new com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
            r3 = 0
            r1 = 0
            r4 = 0
            r5 = 0
            r6 = 61
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.revolut.retail.core.navigation.FeatureCommand r11 = new com.revolut.retail.core.navigation.FeatureCommand
            r11.<init>(r0)
            com.revolut.retail.core.navigation.CompositeCommand r10 = com.revolut.retail.core.navigation.a.c(r10, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: mz3.a1.a(java.lang.String, gim.c):java.lang.Object");
    }

    @Override // sv3.b
    public final efm.d0 c(PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        kotlinx.coroutines.d dVar = skm.p0.f264003c;
        Continuation continuation = null;
        rfm.f0 f0VarF = ue0.e.v(pd.b.n(dVar, new mx5.g(payload, this, continuation, 3))).f(te0.w.o0(dVar, new mpd.p(this, payload, continuation, 16)));
        Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
        return ue0.e.F(f0VarF, DummyCommand.f98635a);
    }
}
