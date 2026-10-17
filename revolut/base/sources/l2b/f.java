package l2b;

import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import java.util.List;
import java.util.UUID;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kye.l0;
import pfm.n;
import pfm.z;
import q06.h;
import q06.i;
import q06.j;
import q06.k;
import sri.m;
import wp5.y;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements jf0.d, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f191736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.k f191737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2b.b f191738c;
    public final m4f.b d;
    public final ybl.d e;

    public f(m navigator, ybl.k tradingAccountsInteractor, a2b.b onboardingConfigProvider, m4f.b wealthAddMoneyCommandProvider, ybl.d portfolioInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(onboardingConfigProvider, "onboardingConfigProvider");
        Intrinsics.checkNotNullParameter(wealthAddMoneyCommandProvider, "wealthAddMoneyCommandProvider");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        this.f191736a = navigator;
        this.f191737b = tradingAccountsInteractor;
        this.f191738c = onboardingConfigProvider;
        this.d = wealthAddMoneyCommandProvider;
        this.e = portfolioInteractor;
    }

    public static j b(ParcelableDestination parcelableDestination) {
        return parcelableDestination == null ? new i(new q06.b(ibb.c.f160141b, null)) : new h(parcelableDestination, new q06.b(ibb.c.f160141b, null));
    }

    public static String c(TradingAccount tradingAccount) {
        List listJ;
        List listP0;
        TradingAccount.Portfolio portfolio;
        UUID uuid;
        String string;
        if (tradingAccount != null) {
            if (!com.revolut.shared.feature.wealth.models.trading_accounts.d.e(tradingAccount)) {
                tradingAccount = null;
            }
            if (tradingAccount != null && (listJ = tradingAccount.J()) != null && (listP0 = d0.P0(listJ, new c())) != null && (portfolio = (TradingAccount.Portfolio) d0.d0(listP0)) != null && (uuid = portfolio.f105210a) != null && (string = uuid.toString()) != null && string.length() > 0) {
                return string;
            }
        }
        return null;
    }

    public static String d(TradingAccount tradingAccount) {
        UUID uuid;
        String string;
        TradingAccount.Portfolio portfolio = (TradingAccount.Portfolio) d0.d0(d0.P0(tradingAccount.J(), new d()));
        if (portfolio != null && (uuid = portfolio.f105210a) != null && (string = uuid.toString()) != null) {
            return string;
        }
        m70.a.c(t0.f186434a);
        return "";
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "cfds");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d9, code lost:
    
        if (r10 == r1) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a3 A[Catch: CancellationException -> 0x0033, Exception -> 0x00df, TryCatch #2 {CancellationException -> 0x0033, Exception -> 0x00df, blocks: (B:14:0x002e, B:52:0x00cc, B:20:0x003e, B:38:0x0080, B:21:0x0042, B:57:0x00dc, B:22:0x0047, B:45:0x0098, B:25:0x004e, B:49:0x00a3, B:32:0x0066, B:35:0x006f, B:40:0x0083, B:42:0x008b, B:47:0x009b, B:54:0x00cf), top: B:62:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l2b.f.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        pfm.a aVar;
        pfm.a aVar2;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String strE = deeplink.e(2);
        int iHashCode = strE.hashCode();
        if (iHashCode != -1093603180) {
            if (iHashCode == 21116443) {
                if (strE.equals("onboarding")) {
                    efm.d0 d0VarFirstOrError = m70.a.g(rd0.e.c(zi0.c.w(ybl.k.b(this.f191737b, TradingAccountType.Margin.f105271a, 6)), g.f186406a), null, new l0(24), 1).firstOrError();
                    kxj.e eVar = new kxj.e(new b(this, 1), 26);
                    d0VarFirstOrError.getClass();
                    aVar = new pfm.a(d0VarFirstOrError, eVar, 4);
                    Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                }
                aVar2 = aVar;
            } else if (iHashCode == 519174517 && strE.equals("position-detail")) {
                String strE2 = deeplink.e(3);
                efm.d0 d0VarH = h();
                kxj.e eVar2 = new kxj.e(new a(this, strE2, 2), 28);
                d0VarH.getClass();
                aVar2 = new pfm.a(d0VarH, eVar2, 4);
                Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
            }
            efm.d0 d0VarH2 = h();
            kxj.e eVar3 = new kxj.e(new b(this, 3), 27);
            d0VarH2.getClass();
            aVar = new pfm.a(d0VarH2, eVar3, 4);
            Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
            aVar2 = aVar;
        } else {
            if (strE.equals("add-money")) {
                efm.d0 d0VarH3 = h();
                kxj.e eVar4 = new kxj.e(new b(this, 4), 29);
                d0VarH3.getClass();
                aVar = new pfm.a(d0VarH3, eVar4, 4);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
            } else {
                efm.d0 d0VarH22 = h();
                kxj.e eVar32 = new kxj.e(new b(this, 3), 27);
                d0VarH22.getClass();
                aVar = new pfm.a(d0VarH22, eVar32, 4);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
            }
            aVar2 = aVar;
        }
        z zVarD = aVar2.D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return ue0.e.F(zVarD, Boolean.FALSE);
    }

    public final n g(FeatureCommand featureCommand) {
        n nVar = new n(new fag.g(featureCommand, this, 27), 1);
        Intrinsics.checkNotNullExpressionValue(nVar, "fromCallable(...)");
        return nVar;
    }

    public final efm.d0 h() {
        efm.d0 d0VarFirstOrError = m70.a.g(rd0.e.c(zi0.c.w(ybl.k.h(this.f191737b, TradingAccountType.Margin.f105271a, null, 6)), g.f186406a), null, new l0(28), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public final ufm.i i() {
        efm.d0 d0VarH = h();
        kxj.e eVar = new kxj.e(new b(this, 2), 24);
        d0VarH.getClass();
        ufm.i iVar = new ufm.i(d0VarH, eVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final ufm.i j() {
        efm.d0 d0VarFirstOrError = m70.a.g(rd0.e.c(zi0.c.w(ybl.k.b(this.f191737b, TradingAccountType.Margin.f105271a, 6)), g.f186406a), null, new l0(26), 1).firstOrError();
        kxj.e eVar = new kxj.e(new b(this, 0), 22);
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, eVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final efm.d0 k(String str) {
        if (str.length() == 0) {
            return efm.d0.m(b(null));
        }
        efm.d0 d0VarH = h();
        kxj.e eVar = new kxj.e(new a(this, str, 1), 21);
        d0VarH.getClass();
        return new ufm.i(d0VarH, eVar, 0);
    }
}
