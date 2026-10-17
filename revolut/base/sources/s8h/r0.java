package s8h;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.time.Instant;
import java.util.Iterator;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class r0 implements jf0.d, q06.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f261032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.k f261033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FeatureCommand f261034c;

    public r0(sri.m navigator, ybl.k tradingAccountsInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        this.f261032a = navigator;
        this.f261033b = tradingAccountsInteractor;
        this.f261034c = new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160141b.f83420a, null), null, null, 6)));
    }

    public static String b(TradingAccount tradingAccount) {
        Object next;
        UUID uuid;
        Iterator it8 = tradingAccount.J().iterator();
        if (it8.hasNext()) {
            next = it8.next();
            if (it8.hasNext()) {
                Instant instant = ((TradingAccount.Portfolio) next).f105212c;
                do {
                    Object next2 = it8.next();
                    Instant instant2 = ((TradingAccount.Portfolio) next2).f105212c;
                    if (instant.compareTo(instant2) > 0) {
                        next = next2;
                        instant = instant2;
                    }
                } while (it8.hasNext());
            }
        } else {
            next = null;
        }
        TradingAccount.Portfolio portfolio = (TradingAccount.Portfolio) next;
        if (portfolio == null || (uuid = portfolio.f105210a) == null) {
            return null;
        }
        return uuid.toString();
    }

    public static boolean d(jf0.c cVar) {
        return Intrinsics.f(cVar.e(1), "trading") && Intrinsics.f(cVar.e(2), "statements") && Intrinsics.f(cVar.e(3), "pnl");
    }

    public static boolean g(jf0.c cVar) {
        return Intrinsics.f(cVar.e(1), "trading") && Intrinsics.f(cVar.e(2), "statements") && Intrinsics.f(cVar.e(3), "rpnl");
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return d(deeplink) || g(deeplink);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0098, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r7, gim.c r8) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s8h.r0.c(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof s8h.q0
            if (r0 == 0) goto L13
            r0 = r6
            s8h.q0 r0 = (s8h.q0) r0
            int r1 = r0.f261030x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f261030x = r1
            goto L1a
        L13:
            s8h.q0 r0 = new s8h.q0
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f261030x
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            jf0.c r5 = r0.u
            yhm.o.b(r6)
            goto L4b
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r6)
            java.util.HashMap r6 = r5.d
            java.lang.String r2 = "accountId"
            java.lang.Object r6 = r6.get(r2)
            java.lang.String r6 = (java.lang.String) r6
            r0.u = r5
            r0.f261030x = r3
            java.lang.Object r6 = r4.c(r6, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            com.revolut.feature.wealth.api.domain.model.statement.StatementProduct r6 = (com.revolut.feature.wealth.api.domain.model.statement.StatementProduct) r6
            r0 = 0
            if (r6 != 0) goto L51
            goto L74
        L51:
            boolean r1 = d(r5)
            if (r1 == 0) goto L5a
            com.revolut.feature.wealth.api.domain.model.statement.StatementType$Account r5 = com.revolut.feature.wealth.api.domain.model.statement.StatementType.Account.f95315a
            goto L62
        L5a:
            boolean r5 = g(r5)
            if (r5 == 0) goto L74
            com.revolut.feature.wealth.api.domain.model.statement.StatementType$Pnl r5 = com.revolut.feature.wealth.api.domain.model.statement.StatementType.Pnl.f95316a
        L62:
            q06.h r1 = new q06.h
            com.revolut.feature.wealth.ui.api.navigation.statement.AccountsStatementDestination r2 = new com.revolut.feature.wealth.ui.api.navigation.statement.AccountsStatementDestination
            r2.<init>(r6, r5)
            q06.b r5 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r6 = ibb.c.f160141b
            r5.<init>(r6, r0)
            r1.<init>(r2, r5)
            return r1
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s8h.r0.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return ue0.e.F(te0.w.o0(kotlin.coroutines.g.f186406a, new l10.m(this, deeplink, z, (Continuation) null, 20)), Boolean.FALSE);
    }
}
