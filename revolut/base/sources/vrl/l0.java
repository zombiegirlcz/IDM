package vrl;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: classes12.dex */
public final class l0 implements ddf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f291648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f291649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wsg.n f291650c;
    public final ybl.k d;
    public final wzg.a e;
    public final ybl.l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kpj.f f291651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m2j.j f291652h;
    public final z8h.g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CoroutineScope f291653j;
    public final Object k;

    public l0(n0 sourcePocketRulesInteractor, d0 sourcePocketExchangeRateConverter, wsg.n walletInteractor, ybl.k tradingAccountsInteractor, wzg.a cashHoldingsInteractor, ybl.l tradingConfigInteractor, kpj.f wealthAccountHeaderUiMapper, m2j.j balancesInteractor, z8h.g wealthCombinedBuyingPowerInteractor, CoroutineScope appCoroutineScope) {
        Intrinsics.checkNotNullParameter(sourcePocketRulesInteractor, "sourcePocketRulesInteractor");
        Intrinsics.checkNotNullParameter(sourcePocketExchangeRateConverter, "sourcePocketExchangeRateConverter");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(cashHoldingsInteractor, "cashHoldingsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        Intrinsics.checkNotNullParameter(balancesInteractor, "balancesInteractor");
        Intrinsics.checkNotNullParameter(wealthCombinedBuyingPowerInteractor, "wealthCombinedBuyingPowerInteractor");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        this.f291648a = sourcePocketRulesInteractor;
        this.f291649b = sourcePocketExchangeRateConverter;
        this.f291650c = walletInteractor;
        this.d = tradingAccountsInteractor;
        this.e = cashHoldingsInteractor;
        this.f = tradingConfigInteractor;
        this.f291651g = wealthAccountHeaderUiMapper;
        this.f291652h = balancesInteractor;
        this.i = wealthCombinedBuyingPowerInteractor;
        this.f291653j = appCoroutineScope;
        this.k = te0.w.y0(new vch.a(this, 23));
    }

    public static j0 b(kel.b bVar, xi0.b bVar2, List list) {
        return list == null ? new j0(yoj.b.c(bVar, bVar2), false) : list.contains(yoj.b.f(bVar)) ? new j0(bVar.e, true) : new j0(bVar.d, false);
    }

    public static TextLocalisedClause d(m4l.l lVar) {
        int i = k0.f291647b[lVar.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.wealth_trading_pocket_picker_section_investment, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.wealth_trading_pocket_picker_section_personal, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Flow a(List defaultGroupConfigs, xdf.g context) {
        Intrinsics.checkNotNullParameter(defaultGroupConfigs, "defaultGroupConfigs");
        Intrinsics.checkNotNullParameter(context, "context");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        List<m4l.k> list = defaultGroupConfigs;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (m4l.k groupConfig : list) {
            Intrinsics.checkNotNullParameter(groupConfig, "groupConfig");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            xdf.g gVar = context;
            arrayList.add(c(groupConfig.f202770a, groupConfig.f202772c, gVar, groupConfig.f202771b, loadingStrategy));
            context = gVar;
        }
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(nim.a.A(rd0.e.n((Flow) it8.next(), zhm.h0.f322473a), new vq0.g(26)));
        }
        return vkm.q.q(nim.a.v(boh.f.e(nim.a.v(zh9.u0.k(arrayList2), new vq0.g(27)), new h0(this, 0)), new vq0.g(28)));
    }

    public final Flow c(final l4l.a source, List rules, xdf.g context, m4l.j jVar, w4l.k loadingStrategy) {
        Flow flowV;
        xi0.b bVar;
        nel.n nVar = context.f304433a;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(rules, "rules");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        int i = k0.f291646a[source.ordinal()];
        m2j.j jVar2 = this.f291652h;
        ybl.l lVar = this.f;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(source, "source");
                final int i2 = 0;
                flowV = nim.a.v(f(source, jVar, new i0(2)), new Function1() { // from class: vrl.e0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        List pockets = (List) obj2;
                        switch (i2) {
                            case 0:
                                Intrinsics.checkNotNullParameter(pockets, "pockets");
                                return Optional.of(new xdf.h(new TextLocalisedClause(R$string.wealth_trading_pocket_picker_group_accounts, null, null, 14), source, pockets));
                            default:
                                Intrinsics.checkNotNullParameter(pockets, "pockets");
                                return Optional.of(new xdf.h(new TextLocalisedClause(R$string.wealth_trading_pocket_picker_group_crypto, null, null, 14), source, pockets));
                        }
                    }
                });
                break;
            case 2:
                Intrinsics.checkNotNullParameter(source, "source");
                flowV = nim.a.v(zh9.u0.m(f(source, jVar, new i0(0)), ybl.l.d(lVar)), new g0(this, source, 1));
                break;
            case 3:
                Intrinsics.checkNotNullParameter(source, "source");
                final int i3 = 1;
                flowV = nim.a.v(f(source, jVar, new vq0.g(24)), new Function1() { // from class: vrl.e0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        List pockets = (List) obj2;
                        switch (i3) {
                            case 0:
                                Intrinsics.checkNotNullParameter(pockets, "pockets");
                                return Optional.of(new xdf.h(new TextLocalisedClause(R$string.wealth_trading_pocket_picker_group_accounts, null, null, 14), source, pockets));
                            default:
                                Intrinsics.checkNotNullParameter(pockets, "pockets");
                                return Optional.of(new xdf.h(new TextLocalisedClause(R$string.wealth_trading_pocket_picker_group_crypto, null, null, 14), source, pockets));
                        }
                    }
                });
                break;
            case 4:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                flowV = nim.a.v(rd0.e.b(i1j.e.a(jVar2, new i1j.c(), loadingStrategy)), new f0(source, jVar, 3));
                break;
            case 5:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                flowV = nim.a.v(rd0.e.b(i1j.e.a(jVar2, i1j.b.f157643a, loadingStrategy)), new f0(source, jVar, 0));
                break;
            case 6:
                bVar = nVar != null ? nVar.i : null;
                cfl.j tradingAccountHolderType = cfl.j.PERSONAL;
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(tradingAccountHolderType, "tradingAccountHolderType");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                flowV = e(bVar, source, jVar, loadingStrategy, new vq5.x(tradingAccountHolderType, 8));
                break;
            case 7:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                flowV = boh.f.e(zh9.u0.m(nim.a.v(ybl.k.k(this.d, null, null, cfl.k.f23744a, 3), new v1.m(7, new i0(1))), ybl.l.d(lVar)), new ryd.f(this, context, jVar, loadingStrategy, source, 11));
                break;
            case 8:
                bVar = nVar != null ? nVar.i : null;
                cfl.j tradingAccountHolderType2 = cfl.j.PERSONAL_JOINT;
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(tradingAccountHolderType2, "tradingAccountHolderType");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                flowV = e(bVar, source, jVar, loadingStrategy, new vq5.x(tradingAccountHolderType2, 8));
                break;
            case 9:
                bVar = nVar != null ? nVar.i : null;
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                flowV = e(bVar, source, jVar, loadingStrategy, new vq0.g(23));
                break;
            case 10:
                bVar = nVar != null ? nVar.i : null;
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                flowV = e(bVar, source, jVar, loadingStrategy, new vq5.x(jVar, 6));
                break;
            case 11:
                bVar = nVar != null ? nVar.i : null;
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                flowV = e(bVar, source, jVar, loadingStrategy, new vq0.g(22));
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return boh.f.e(nim.a.v(flowV, new n(this, rules, 2)), new h0(this, 1));
    }

    public final Flow e(xi0.b bVar, l4l.a source, m4l.j jVar, w4l.k loadingStrategy, Function1 predicate) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return boh.f.e(boh.f.e(nim.a.v(ybl.k.k(this.d, null, null, cfl.k.f23744a, 3), new v1.m(7, predicate)), new ryd.f(this, loadingStrategy, bVar, jVar, source, 12)), new g0(this, source, 0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final Flow f(l4l.a aVar, m4l.j jVar, Function1 function1) {
        return vkm.q.q(nim.a.v((SharedFlow) this.k.getValue(), new uyh.w(function1, 24, aVar, jVar)));
    }
}
