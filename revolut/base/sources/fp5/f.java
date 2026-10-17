package fp5;

import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;
import lo5.p;
import ufm.i;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final po5.a f137058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zja.a f137059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ap5.b f137060c;
    public final uj5.b d;

    public f(po5.a cryptoWithdrawEnabledStateChecker, zja.a productArticleInteractor, ap5.b cryptoWithdrawInteractor, uj5.b restrictedActionNavigationProvider) {
        Intrinsics.checkNotNullParameter(cryptoWithdrawEnabledStateChecker, "cryptoWithdrawEnabledStateChecker");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(cryptoWithdrawInteractor, "cryptoWithdrawInteractor");
        Intrinsics.checkNotNullParameter(restrictedActionNavigationProvider, "restrictedActionNavigationProvider");
        this.f137058a = cryptoWithdrawEnabledStateChecker;
        this.f137059b = productArticleInteractor;
        this.f137060c = cryptoWithdrawInteractor;
        this.d = restrictedActionNavigationProvider;
        new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId("crypto", null), null, null, 6)));
    }

    public final i a(CryptoAddress address, xi0.b bVar, CompositeCommand compositeCommand) {
        Intrinsics.checkNotNullParameter(address, "address");
        i iVar = new i(this.f137058a.b(new b(address, 0)), new fjj.b(new c(this, address, bVar, compositeCommand), 16), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(xi0.b r6, com.revolut.feature.crypto.withdraw.api.models.SupportedSendRecipientInput r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof fp5.d
            if (r0 == 0) goto L13
            r0 = r8
            fp5.d r0 = (fp5.d) r0
            int r1 = r0.f137054w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f137054w = r1
            goto L18
        L13:
            fp5.d r0 = new fp5.d
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f137054w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L5a
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r8)
            ap5.b r8 = r5.f137060c
            pfm.z r8 = r8.k()
            eed.i r2 = new eed.i
            r4 = 21
            r2.<init>(r5, r4, r6, r7)
            fjj.b r6 = new fjj.b
            r7 = 14
            r6.<init>(r2, r7)
            ufm.i r7 = new ufm.i
            r2 = 0
            r7.<init>(r8, r6, r2)
            java.lang.String r6 = "flatMap(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            r0.f137054w = r3
            java.lang.Object r8 = nim.a.b(r7, r0)
            if (r8 != r1) goto L5a
            return r1
        L5a:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: fp5.f.b(xi0.b, com.revolut.feature.crypto.withdraw.api.models.SupportedSendRecipientInput, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r18) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fp5.f.c(gim.c):java.lang.Object");
    }
}
