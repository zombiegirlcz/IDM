package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.retail.core.navigation.DummyCommand;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a0 implements sv3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fmc.z f210576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zfe.e f210577b;

    public a0(fmc.z creditCardExitPluginInteractor, zfe.e newAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(creditCardExitPluginInteractor, "creditCardExitPluginInteractor");
        Intrinsics.checkNotNullParameter(newAccountDestinationResolver, "newAccountDestinationResolver");
        this.f210576a = creditCardExitPluginInteractor;
        this.f210577b = newAccountDestinationResolver;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(mz3.a0 r9, java.lang.String r10, gim.c r11) {
        /*
            boolean r0 = r11 instanceof mz3.z
            if (r0 == 0) goto L13
            r0 = r11
            mz3.z r0 = (mz3.z) r0
            int r1 = r0.f210710x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f210710x = r1
            goto L18
        L13:
            mz3.z r0 = new mz3.z
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f210710x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.retail.core.navigation.FeatureCommand r9 = r0.u
            yhm.o.b(r11)
            goto L6c
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
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
            zfe.e r9 = r9.f210577b
            r0.u = r10
            r0.f210710x = r3
            zfe.d r2 = zfe.e.Companion
            cge.e r9 = (cge.e) r9
            java.lang.Object r11 = r9.a(r11, r8, r0)
            if (r11 != r1) goto L6b
            return r1
        L6b:
            r9 = r10
        L6c:
            r2 = r11
            com.revolut.kompot.common.ParcelableDestination r2 = (com.revolut.kompot.common.ParcelableDestination) r2
            com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig r0 = new com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
            r3 = 0
            r1 = 0
            r4 = 0
            r5 = 0
            r6 = 61
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.revolut.retail.core.navigation.FeatureCommand r10 = new com.revolut.retail.core.navigation.FeatureCommand
            r10.<init>(r0)
            com.revolut.retail.core.navigation.CompositeCommand r9 = com.revolut.retail.core.navigation.a.c(r9, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: mz3.a0.a(mz3.a0, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // sv3.b
    public final efm.d0 c(PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        Continuation continuation = null;
        ufm.i iVar = new ufm.i(new pfm.z(ue0.e.v(pd.b.n(skm.p0.f264003c, new mx5.g(this, payload, continuation, 1))), 0, new i(payload, 5), continuation), new s(new mt9.c(this, payload, 20), 1), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return ue0.e.F(iVar, DummyCommand.f98635a);
    }
}
