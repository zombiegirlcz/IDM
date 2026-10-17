package kcd;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.domain.models.user.UserCompanyRegion;
import com.revolut.feature.cashback.impl.R$string;
import com.revolut.feature.cashback.impl.ui.pocket.details.CashbackPocketDetailsScreen;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import ecd.s4;
import h30.l;
import hdh.d;
import ip0.pb0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jel.b0;
import kce.p;
import kgh.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import nel.n;
import nel.r0;
import nel.s0;
import nel.t0;
import nel.u0;
import nel.v0;
import nel.w0;
import od0.i;
import od3.x0;
import rlm.f;
import tlm.e;
import tlm.h;
import ybd.n0;
import ybd.z;
import yp0.b;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.u;
import zhm.w;
import zi0.c;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182701a;

    public /* synthetic */ a(int i) {
        this.f182701a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        d cVar;
        d aVar;
        switch (this.f182701a) {
            case 0:
                f Json = (f) obj2;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                e eVar = Json.f255103h;
                tlm.f fVar = new tlm.f();
                p0 p0Var = o0.f186429a;
                fVar.b(p0Var.b(z.class), new k9h.d(27));
                fVar.b(p0Var.b(n0.class), new k9h.d(28));
                fVar.b(p0Var.b(s4.class), new k9h.d(29));
                Unit unit = Unit.f186387a;
                tlm.d dVarA = h.a(eVar, fVar.a());
                Intrinsics.checkNotNullParameter(dVarA, "<set-?>");
                Json.f255103h = dVarA;
                return Unit.f186387a;
            case 1:
                Map it8 = (Map) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return c.P(it8, false, null, 3);
            case 2:
                Data it9 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return (it9.getContent() != null || it9.getLoading()) ? it9 : Data.copy$default(it9, f0.f322471a, null, false, 6, null);
            case 3:
                fo3.c it10 = (fo3.c) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.d;
            case 4:
                Map it11 = (Map) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return c.P(it11, false, null, 3);
            case 5:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return d0.E0((List) pair.f186386b, (List) pair.f186385a);
            case 6:
                List it12 = (List) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return d0.P0(it12, new p());
            case 7:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 8:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 11:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 12:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 13:
                CellDetailsActionDelegate.Model it13 = (CellDetailsActionDelegate.Model) obj2;
                KProperty[] kPropertyArr = CashbackPocketDetailsScreen.g0;
                Intrinsics.checkNotNullParameter(it13, "it");
                Object obj3 = it13.f51787l;
                if (obj3 instanceof String) {
                    return (String) obj3;
                }
                return null;
            case 14:
                ListSubheaderDelegate.Model it14 = (ListSubheaderDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = CashbackPocketDetailsScreen.g0;
                Intrinsics.checkNotNullParameter(it14, "it");
                Object obj4 = it14.f52715m;
                if (obj4 instanceof x0) {
                    return (x0) obj4;
                }
                return null;
            case 15:
                ty0.a it15 = (ty0.a) obj2;
                KProperty[] kPropertyArr3 = CashbackPocketDetailsScreen.g0;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Boolean.valueOf(it15.d instanceof bbj.d);
            case 16:
                ty0.a it16 = (ty0.a) obj2;
                KProperty[] kPropertyArr4 = CashbackPocketDetailsScreen.g0;
                Intrinsics.checkNotNullParameter(it16, "it");
                Object obj5 = it16.d;
                Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.retail.feature.crypto_commodities.disclaimer.mapper.api.DisclosuresLinkParcel");
                return (bbj.d) obj5;
            case 17:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return b.g(u.c(new pb0("ID_PLAN_CASHBACK_ITEM")), new ListSubheaderDelegate.Model("ID_TOTAL_CASHBACK_HEADER_ITEM", (Image) null, (Clause) new TextLocalisedClause(R$string.cashback_product_plan_total_cashback_sheet_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 19:
                l71.d userCompany = (l71.d) obj2;
                Intrinsics.checkNotNullParameter(userCompany, "userCompany");
                UserCompanyRegion userCompanyRegionA = userCompany.a();
                String str = userCompany.f192500c;
                wi0.b bVarJ = l71.f.j(userCompanyRegionA);
                if (bVarJ != null) {
                    return new wc6.b(bVarJ);
                }
                if (userCompany.a() == UserCompanyRegion.EEA) {
                    return new wc6.c(str);
                }
                throw new IllegalStateException(j6.a.q("Cannot determine base legal entity country, region = ", str));
            case 20:
                Map instrumentStateDetailsByRef = (Map) obj2;
                Intrinsics.checkNotNullParameter(instrumentStateDetailsByRef, "instrumentStateDetailsByRef");
                LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(instrumentStateDetailsByRef.size()));
                for (Map.Entry entry : instrumentStateDetailsByRef.entrySet()) {
                    Object key = entry.getKey();
                    List<w0> list = (List) entry.getValue();
                    ArrayList arrayList = new ArrayList(w.t(list, 10));
                    for (w0 w0Var : list) {
                        if ((w0Var instanceof t0) || (w0Var instanceof u0) || (w0Var instanceof s0)) {
                            n nVarN = w0Var.n();
                            v0 v0Var = (v0) w0Var;
                            TradingAccount account = v0Var.getAccount();
                            if ((account instanceof TradingAccount.TaxAdvantage.Isa) || (account instanceof TradingAccount.TaxAdvantage.Pea) || (account instanceof TradingAccount.TaxAdvantage.JIsa) || (account instanceof TradingAccount.GIA) || (account instanceof TradingAccount.Margin)) {
                                boolean z = true;
                                boolean z3 = v0Var.a() || (v0Var instanceof t0) || (v0Var instanceof u0);
                                if (!v0Var.b() && !(v0Var instanceof u0)) {
                                    z = false;
                                }
                                if (z3 || z) {
                                    cVar = new hdh.c(v0Var, z3, z);
                                } else {
                                    aVar = new hdh.a(new r0(nVarN));
                                }
                            } else {
                                if (!(account instanceof TradingAccount.TaxAdvantage.Unknown) && !(account instanceof TradingAccount.MoneyMarketFunds) && !(account instanceof TradingAccount.Robo) && !(account instanceof TradingAccount.PaperTrading) && !(account instanceof TradingAccount.Unknown)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar = new hdh.a(new r0(nVarN));
                            }
                            cVar = aVar;
                        } else if (w0Var instanceof nel.q0) {
                            cVar = new hdh.b((nel.q0) w0Var);
                        } else {
                            if (!(w0Var instanceof r0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cVar = new hdh.a(new r0(((r0) w0Var).f214615a));
                        }
                        arrayList.add(cVar);
                    }
                    linkedHashMap.put(key, new hdh.e(arrayList));
                }
                return linkedHashMap;
            case 21:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                RevPointsPocketState revPointsPocketState = (RevPointsPocketState) pair2.f186385a;
                List list2 = (List) pair2.f186386b;
                if (revPointsPocketState instanceof RevPointsPocketState.Active) {
                    return new ddi.f(((RevPointsPocketState.Active) revPointsPocketState).f97790b, list2);
                }
                if (revPointsPocketState instanceof RevPointsPocketState.Inactive) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            case 22:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.TRUE;
            case 23:
                Intrinsics.checkNotNullParameter((ng6.b) obj2, "it");
                return null;
            case 24:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                Data data = (Data) pair3.f186385a;
                i iVar = (i) pair3.f186386b;
                try {
                    Object content = data.getContent();
                    return new Data(content != null ? new Pair((b9e.c) content, iVar.f224257a) : null, data.getError(), data.getLoading());
                } catch (Throwable th10) {
                    return new Data(null, th10, data.getLoading());
                }
            case 25:
                j it17 = (j) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.d;
            case 26:
                return l.q("it", (i) obj2);
            case 27:
                j it18 = (j) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return it18.f183993b;
            case 28:
                n it19 = (n) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return ifk.b.i(it19);
            default:
                jel.c it20 = (jel.c) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                if (it20 instanceof b0) {
                    return (b0) it20;
                }
                return null;
        }
    }

    public /* synthetic */ a(kdh.b bVar) {
        this.f182701a = 20;
    }
}
