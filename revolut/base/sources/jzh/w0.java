package jzh;

import com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class w0 implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0i.j f179867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0i.h f179868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0i.d f179869c;
    public final r2i.a d;
    public final d0i.m e;

    public w0(d0i.j orderSummaryNavBarMapper, d0i.h orderSummaryMapper, a0i.d tpslDetailsMapper, r2i.a settlementDelayBannerMapper, d0i.m volatilityBannerMapper, d0i.b accountBalanceLimitWarningMapper) {
        Intrinsics.checkNotNullParameter(orderSummaryNavBarMapper, "orderSummaryNavBarMapper");
        Intrinsics.checkNotNullParameter(orderSummaryMapper, "orderSummaryMapper");
        Intrinsics.checkNotNullParameter(tpslDetailsMapper, "tpslDetailsMapper");
        Intrinsics.checkNotNullParameter(settlementDelayBannerMapper, "settlementDelayBannerMapper");
        Intrinsics.checkNotNullParameter(volatilityBannerMapper, "volatilityBannerMapper");
        Intrinsics.checkNotNullParameter(accountBalanceLimitWarningMapper, "accountBalanceLimitWarningMapper");
        this.f179867a = orderSummaryNavBarMapper;
        this.f179868b = orderSummaryMapper;
        this.f179869c = tpslDetailsMapper;
        this.d = settlementDelayBannerMapper;
        this.e = volatilityBannerMapper;
    }

    public static myh.h a(r rVar, u0 u0Var) {
        myh.b bVar = new myh.b(oyh.b.d(rVar.f179847a.f96689a));
        CryptoOrderDraft cryptoOrderDraft = rVar.f179847a;
        CryptoExchangeContract$MoneyDetails cryptoExchangeContract$MoneyDetails = cryptoOrderDraft.f96690b;
        wd6.e eVar = cryptoOrderDraft.e;
        myh.b bVar2 = new myh.b(oyh.b.d(cryptoExchangeContract$MoneyDetails));
        xi0.b bVar3 = cryptoOrderDraft.f96689a.f96683a;
        xi0.b bVar4 = cryptoOrderDraft.f96690b.f96683a;
        wd6.h hVar = cryptoOrderDraft.f;
        int i = v0.f179863b[hVar.ordinal()];
        if (i == 1) {
            return new myh.d(cryptoOrderDraft.e, bVar, bVar2, bVar3, bVar4);
        }
        if (i == 2 || i == 3) {
            if (u0Var == u0.BOTTOM) {
                bVar = bVar2;
            }
            return new myh.f(hVar, eVar, bVar, bVar3);
        }
        if (i == 4) {
            return new myh.e(eVar, bVar2, bVar3);
        }
        if (i == 5) {
            return new myh.g(eVar, bVar, bVar3);
        }
        throw new IllegalStateException(("Unsupported order type: " + hVar).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x06bb  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r68) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2112
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jzh.w0.c(cli.j):cli.o");
    }
}
