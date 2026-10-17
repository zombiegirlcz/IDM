package pud;

import ack.o;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.card_payment_method.api.declaration.SelectPaymentMethodInputData;
import com.revolut.feature.cryptocommodity_invest.api.R$string;
import com.revolut.feature.cryptocommodity_invest.models.SortingType;
import com.revolut.feature.trading_add_ons.TradingAddOnsApi$Toggles;
import efm.d0;
import h6e.f;
import io3.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lbf.j;
import lbf.p;
import ny5.i;
import skm.p0;
import te0.w;
import vgf.r;
import vkm.j2;
import vuc.m;
import vx5.k;
import vx5.x;
import wsg.n;
import zhm.f0;
import zhm.h0;
import zhm.r0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f239860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f239861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f239862c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(Object obj2, Object obj3, boolean z, int i) {
        this.f239860a = i;
        this.f239862c = obj2;
        this.d = obj3;
        this.f239861b = z;
    }

    private final Object a(Object obj2) {
        com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a aVar = (com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a) this.f239862c;
        String str = (String) this.d;
        r update = (r) obj2;
        Intrinsics.checkNotNullParameter(update, "$this$update");
        LinkedHashMap linkedHashMapZ = r0.z(((r) ((j2) aVar.J.f22677a).getValue()).e);
        linkedHashMapZ.put(str, Boolean.valueOf(this.f239861b));
        Unit unit = Unit.f186387a;
        return r.a(update, null, null, null, null, linkedHashMapZ, null, false, false, false, false, null, null, 4079);
    }

    private final Object b(Object obj2) {
        vhc.g gVar = (vhc.g) this.d;
        jf0.c cVar = (jf0.c) this.f239862c;
        Pair pair = (Pair) obj2;
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        Boolean bool = (Boolean) pair.f186385a;
        Boolean bool2 = (Boolean) pair.f186386b;
        if (!bool.booleanValue()) {
            return d0.m(Boolean.FALSE);
        }
        return w.o0(p0.f264003c, new o(gVar, bool2, cVar, this.f239861b, (Continuation) null, 27));
    }

    private final Object c(Object obj2) {
        Data data = (Data) this.f239862c;
        com.revolut.feature.security_hub.impl.ui.linked_wallets.host.a aVar = (com.revolut.feature.security_hub.impl.ui.linked_wallets.host.a) this.d;
        vuc.f fVar = (vuc.f) obj2;
        boolean zBooleanValue = data.getError() != null;
        vuc.d dVar = (vuc.d) data.getContent();
        Boolean boolValueOf = dVar != null ? Boolean.valueOf(dVar.f292315c) : null;
        if (boolValueOf != null) {
            zBooleanValue = boolValueOf.booleanValue();
        }
        return vuc.f.a(fVar, this.f239861b ? v.k(aVar.J2(m.WALLETS, data), aVar.J2(m.MERCHANTS, data)) : u.c(aVar.J2(m.WALLETS, data)), zBooleanValue, null, false, 12);
    }

    private final Object d(Object obj2) {
        CompositeClause compositeClauseC;
        List listA;
        x xVar = (x) this.f239862c;
        List list = (List) this.d;
        ny5.v cryptoSorting = (ny5.v) obj2;
        Intrinsics.checkNotNullParameter(cryptoSorting, "cryptoSorting");
        i iVar = xVar.f292835l;
        vx5.d dVar = xVar.f292837n;
        int size = list.size();
        ((k) dVar).getClass();
        List list2 = null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_discovery_cryptos, u.c(Integer.valueOf(size)), null, 12);
        if (this.f239861b) {
            compositeClauseC = null;
        } else {
            SortingType sortingType = cryptoSorting.f220677a;
            Intrinsics.checkNotNullParameter(sortingType, "sortingType");
            compositeClauseC = hn5.c.c(sortingType);
        }
        ArrayList arrayList = cryptoSorting.f220678b;
        if (arrayList.isEmpty()) {
            ny5.c cVar = xVar.k;
            List list3 = list;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator it8 = list3.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    if (cp5.d.y((xi0.b) it8.next())) {
                        list2 = x.u;
                        break;
                    }
                }
            }
            if (list2 == null) {
                list2 = f0.f322471a;
            }
            listA = cVar.a(list, list2);
        } else {
            xVar.f292841s.getClass();
            listA = ny5.u.b(arrayList, list);
        }
        return ny5.d.s(iVar, textLocalisedClause, compositeClauseC, listA, gw5.a.ROWS, null, null, 976);
    }

    private final Object e(Object obj2) {
        h6e.f fVar;
        w43.i iVar = (w43.i) this.f239862c;
        AccountId accountId = (AccountId) this.d;
        List pockets = (List) obj2;
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : pockets) {
            if (cp5.d.A(z92.f.l((io3.d) obj3))) {
                arrayList.add(obj3);
            }
        }
        n6e.b bVar = iVar.e;
        if (this.f239861b) {
            fVar = f.C0861f.f149641a;
        } else if (accountId instanceof AccountId.Joint) {
            fVar = f.d.f149639a;
        } else {
            if (!(accountId instanceof AccountId.Personal)) {
                throw new NoWhenBranchMatchedException();
            }
            fVar = f.e.f149640a;
        }
        return g6e.a.a(bVar, arrayList, fVar, null, true, 4);
    }

    private final Object g(Object obj2) {
        final w43.i iVar = (w43.i) this.f239862c;
        n nVar = iVar.f294509b;
        SelectPaymentMethodInputData.UseCase useCase = (SelectPaymentMethodInputData.UseCase) this.d;
        final xi0.b baseCurrency = (xi0.b) obj2;
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        AccountId f65249b = useCase.getF65249b();
        boolean z = this.f239861b;
        l lVar = z ? l.MERCHANT : l.CURRENT;
        w4l.h hVar = w4l.h.f294642c;
        final int i = 0;
        efm.r rVarR = pd.b.r(nim.a.w(osg.b.g(nVar, hVar, lVar, null, null, null, null, f65249b, 60), new w29.a(16)), new Function1() { // from class: w43.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                List pocketsInfo = (List) obj3;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(pocketsInfo, "pocketsInfo");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(pocketsInfo, "pocketsInfo");
                        break;
                }
                return iVar.g(pocketsInfo, baseCurrency);
            }
        });
        AccountId f65249b2 = useCase.getF65249b();
        final int i2 = 1;
        efm.r rVarF0 = w.f0(pd.b.s(kli.a.h(rVarR, pd.b.r(!iVar.f294511g.a("REVOLUT_CARD.link_to_pocket") ? zi0.c.j(f0.f322471a) : rd0.e.c(boh.f.e(rd0.e.b(osg.b.g(nVar, hVar, l.SAVINGS, null, null, null, null, f65249b2, 60)), new b(iVar, f65249b2, z, 26)), kotlin.coroutines.g.f186406a), new Function1() { // from class: w43.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                List pocketsInfo = (List) obj3;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(pocketsInfo, "pocketsInfo");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(pocketsInfo, "pocketsInfo");
                        break;
                }
                return iVar.g(pocketsInfo, baseCurrency);
            }
        })), new w43.b(useCase, iVar, baseCurrency, z, 0)));
        h0 h0Var = h0.f322473a;
        return ue0.e.p(ue0.e.q(rVarF0, h0Var), h0Var);
    }

    private final Object h(Object obj2) {
        Object next;
        Object next2;
        wbf.n nVar = (wbf.n) this.f239862c;
        lbf.f fVar = (lbf.f) this.d;
        Pair pair = (Pair) obj2;
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        List list = (List) pair.f186385a;
        List list2 = (List) pair.f186386b;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((lbf.m) next).f193681b == fVar) {
                break;
            }
        }
        lbf.m mVar = (lbf.m) next;
        if (mVar == null) {
            efm.r rVarJust = efm.r.just(new Data(null, new IllegalStateException("code " + fVar + " not found"), false, 5, null));
            Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
            return rVarJust;
        }
        if (this.f239861b) {
            if (((jte.d) nVar.f296156c).c(TradingAddOnsApi$Toggles.TradingProRevamp.f91661c)) {
                List list3 = mVar.d;
                ArrayList features = new ArrayList();
                for (Object obj3 : list3) {
                    if (!wbf.n.d.contains((lbf.k) obj3)) {
                        features.add(obj3);
                    }
                }
                String id10 = mVar.f193680a;
                lbf.f code = mVar.f193681b;
                List billing = mVar.f193682c;
                List products = mVar.e;
                List pricingPlanProducts = mVar.f;
                String str = mVar.f193683g;
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(code, "code");
                Intrinsics.checkNotNullParameter(billing, "billing");
                Intrinsics.checkNotNullParameter(features, "features");
                Intrinsics.checkNotNullParameter(products, "products");
                Intrinsics.checkNotNullParameter(pricingPlanProducts, "pricingPlanProducts");
                mVar = new lbf.m(id10, code, billing, features, products, pricingPlanProducts, str);
            }
        }
        Iterator it9 = list2.iterator();
        while (true) {
            if (!it9.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it9.next();
            if (Intrinsics.f(((j) next2).f193677a, mVar.f193680a)) {
                break;
            }
        }
        j jVar = (j) next2;
        if (jVar == null) {
            efm.r rVarJust2 = efm.r.just(new Data(new p(mVar, null), null, false, 6, null));
            Intrinsics.checkNotNullExpressionValue(rVarJust2, "just(...)");
            return rVarJust2;
        }
        efm.r rVarJust3 = efm.r.just(new Data(new p(mVar, jVar), null, false, 6, null));
        Intrinsics.h(rVarJust3);
        return rVarJust3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0885  */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v15, types: [com.revolut.feature.backend_flow.domain.models.BackendScreen] */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r41) {
        /*
            Method dump skipped, instruction units count: 3360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pud.b.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ b(Object obj2, jf0.c cVar, boolean z, int i) {
        this.f239860a = i;
        this.d = obj2;
        this.f239862c = cVar;
        this.f239861b = z;
    }

    public /* synthetic */ b(Object obj2, boolean z, Object obj3, int i) {
        this.f239860a = i;
        this.f239862c = obj2;
        this.f239861b = z;
        this.d = obj3;
    }

    public /* synthetic */ b(boolean z, Object obj2, Object obj3, int i) {
        this.f239860a = i;
        this.f239861b = z;
        this.f239862c = obj2;
        this.d = obj3;
    }
}
