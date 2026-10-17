package r1e;

import ael.t;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jmrtd.cbeff.ISO781611;
import qz9.u;
import x8h.k;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f250984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f250985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f250986c;
    public final ybl.k d;
    public final tfl.a e;
    public final CdnImage f;

    public f(t portfolioBalanceInteractor, k displayCurrencyInteractor, g intentFactory, ybl.k tradingAccountsInteractor, tfl.a wealthCoreClauseFactory) {
        Intrinsics.checkNotNullParameter(portfolioBalanceInteractor, "portfolioBalanceInteractor");
        Intrinsics.checkNotNullParameter(displayCurrencyInteractor, "displayCurrencyInteractor");
        Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(wealthCoreClauseFactory, "wealthCoreClauseFactory");
        this.f250984a = portfolioBalanceInteractor;
        this.f250985b = displayCurrencyInteractor;
        this.f250986c = intentFactory;
        this.d = tradingAccountsInteractor;
        this.e = wealthCoreClauseFactory;
        this.f = com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D239", new ImageTransformations(null, new CircleTransformation(Float.valueOf(1.0f), Integer.valueOf(R$attr.uikit_colorGreyTone50_10), false, 12), null, null, null, null, null, ISO781611.SMT_TAG), null, null, 28);
    }

    public final Flow a(TradingAccount tradingAccount, boolean z) {
        String string = com.revolut.shared.feature.wealth.models.trading_accounts.d.l(tradingAccount).f105210a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return boh.f.e(this.f250985b.b(), new pud.b(this, string, z, 5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        if (r8 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof r1e.e
            if (r0 == 0) goto L13
            r0 = r8
            r1e.e r0 = (r1e.e) r0
            int r1 = r0.f250983w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f250983w = r1
            goto L18
        L13:
            r1e.e r0 = new r1e.e
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f250983w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L82
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L32:
            yhm.o.b(r8)
            goto L57
        L36:
            yhm.o.b(r8)
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType$Gia r8 = com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType.Gia.f105270a
            r2 = 6
            ybl.k r5 = r7.d
            r6 = 0
            akg.n r8 = ybl.k.h(r5, r8, r6, r2)
            qz9.u r2 = new qz9.u
            r5 = 12
            r2.<init>(r5)
            jhi.b r8 = mo3.a.g(r8, r6, r2, r4)
            r0.f250983w = r4
            java.lang.Object r8 = vkm.q.x(r8, r0)
            if (r8 != r1) goto L57
            goto L81
        L57:
            od0.i r8 = (od0.i) r8
            java.lang.Object r2 = r8.f224257a
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r2 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount) r2
            if (r2 == 0) goto L91
            cfl.b r2 = r2.getD()
            if (r2 == 0) goto L91
            boolean r2 = com.revolut.shared.feature.wealth.models.trading_accounts.d.d(r2)
            if (r2 != r4) goto L91
            java.lang.Object r8 = r8.c()
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r8 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount) r8
            kotlinx.coroutines.flow.Flow r8 = r7.a(r8, r4)
            vkm.v1 r8 = c8g.a.D(r8)
            r0.f250983w = r3
            java.lang.Object r8 = vkm.q.E(r8, r0)
            if (r8 != r1) goto L82
        L81:
            return r1
        L82:
            com.revolut.data.model.Data r8 = (com.revolut.data.model.Data) r8
            java.lang.Throwable r8 = r8.getError()
            if (r8 != 0) goto L8b
            goto L91
        L8b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r8)
            throw r0
        L91:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: r1e.f.b(gim.c):java.lang.Object");
    }

    public final jhi.b c() {
        return mo3.a.g(zi0.c.w(rd0.e.n(boh.f.e(ybl.k.h(this.d, TradingAccountType.Gia.f105270a, null, 6), new c(this, 0)), h0.f322473a)), null, new u(12), 1);
    }
}
