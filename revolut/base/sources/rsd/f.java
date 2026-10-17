package rsd;

import alc.l;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tzg.m;
import wsg.n;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f257052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f257053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xi0.b f257054c;
    public final /* synthetic */ TradingLegalEntityInformation d;

    public /* synthetic */ f(k kVar, xi0.b bVar, TradingLegalEntityInformation tradingLegalEntityInformation, int i) {
        this.f257052a = i;
        this.f257053b = kVar;
        this.f257054c = bVar;
        this.d = tradingLegalEntityInformation;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f257052a) {
            case 0:
                l account = (l) obj2;
                Intrinsics.checkNotNullParameter(account, "account");
                int i = j.f257063c[account.f6204a.ordinal()];
                TradingLegalEntityInformation tradingLegalEntityInformation = this.d;
                if (i == 1) {
                    k kVar = this.f257053b;
                    return nim.a.w(pd.b.r(rd0.e.c(nim.a.v(m.a(kVar.d, WealthAccountType.ROBO), new rpi.e(24)), kotlin.coroutines.g.f186406a), new rgf.m(kVar, this.f257054c, 29)), new g(tradingLegalEntityInformation, 1));
                }
                if (i == 2) {
                    return zi0.c.j(new tsd.i(tsd.a.ROBO));
                }
                if (i == 3 || i == 4) {
                    return zi0.c.j(new tsd.b(tsd.a.ROBO, tradingLegalEntityInformation, n2l.h.f211590a));
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                Boolean roboEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(roboEnabled, "roboEnabled");
                if (!roboEnabled.booleanValue()) {
                    return zi0.c.j(new tsd.l(tsd.a.ROBO));
                }
                k kVar2 = this.f257053b;
                return pd.b.r(kVar2.f257066c.C(w4l.h.f294642c), new f(kVar2, this.f257054c, this.d, 0));
            default:
                Boolean commoditiesEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(commoditiesEnabled, "commoditiesEnabled");
                if (!commoditiesEnabled.booleanValue()) {
                    return zi0.c.j(new tsd.l(tsd.a.COMMODITIES));
                }
                k kVar3 = this.f257053b;
                mu5.f fVar = kVar3.f257068h;
                n nVar = kVar3.f257064a;
                List types = v.k(io3.l.CURRENT, io3.l.BLOCKING);
                Intrinsics.checkNotNullParameter(types, "types");
                return nim.a.w(fVar.e(nVar.T(new v77.a(types, 18), dz5.b.COMMODITY_POCKETS, false), this.f257054c, null), new g(this.d, 0));
        }
    }
}
