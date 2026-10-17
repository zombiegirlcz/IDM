package q2j;

import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.AliasType;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentFee;
import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;
import com.revolut.feature.trading_orders.common.models.SourcePocket;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanPageLayoutTerms;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.joda.time.LocalDate;
import pcd.l0;
import vpd.z0;
import vrl.o0;
import x57.b;

/* JADX INFO: loaded from: classes10.dex */
public final class v implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f241694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f241695b;

    public /* synthetic */ v(Object obj2, int i) {
        this.f241694a = i;
        this.f241695b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v94, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        dj0.d dVarV;
        dj0.d dVarV2;
        switch (this.f241694a) {
            case 0:
                int iCompare = ((b83.a) this.f241695b).compare(obj2, obj3);
                return iCompare != 0 ? iCompare : cim.b.b(cp5.d.K(((d) obj2).e()), cp5.d.K(((d) obj3).e()));
            case 1:
                z2h.a aVar = (z2h.a) this.f241695b;
                z2h.i iVar = (z2h.i) obj3;
                if (iVar instanceof z2h.g) {
                    dVarV = ((z2h.g) iVar).f319088c.e;
                } else {
                    if (!(iVar instanceof z2h.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVarV = pyd.c.V(aVar.f319076a.e, ((z2h.h) iVar).f319090b.e.f183174b);
                }
                z2h.i iVar2 = (z2h.i) obj2;
                if (iVar2 instanceof z2h.g) {
                    dVarV2 = ((z2h.g) iVar2).f319088c.e;
                } else {
                    if (!(iVar2 instanceof z2h.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVarV2 = pyd.c.V(aVar.f319076a.e, ((z2h.h) iVar2).f319090b.e.f183174b);
                }
                return cim.b.b(dVarV, dVarV2);
            case 2:
                wi0.b bVar = ((qci.b) obj2).f244789a;
                qci.l lVar = (qci.l) this.f241695b;
                return cim.b.b(Boolean.valueOf(!Intrinsics.f(bVar, lVar.f244803a.f97759g)), Boolean.valueOf(!Intrinsics.f(((qci.b) obj3).f244789a, lVar.f244803a.f97759g)));
            case 3:
                int iCompare2 = ((v) this.f241695b).compare(obj2, obj3);
                return iCompare2 != 0 ? iCompare2 : cim.b.b(((qci.b) obj2).f244790b, ((qci.b) obj3).f244790b);
            case 4:
                ((r8j.g) this.f241695b).getClass();
                io3.l lVar2 = ((io3.d) obj2).e;
                int[] iArr = r8j.f.f252465a;
                int i = iArr[lVar2.ordinal()];
                Integer numValueOf = Integer.valueOf(i != 1 ? i != 2 ? 1 : 2 : 0);
                int i2 = iArr[((io3.d) obj3).e.ordinal()];
                return cim.b.b(numValueOf, Integer.valueOf(i2 != 1 ? i2 != 2 ? 1 : 2 : 0));
            case 5:
                int iCompare3 = ((sa6.r) this.f241695b).compare(obj2, obj3);
                return iCompare3 != 0 ? iCompare3 : cim.b.b(Integer.valueOf(((ba6.l) obj2).f13947p), Integer.valueOf(((ba6.l) obj3).f13947p));
            case 6:
                f01.c cVar = ((stl.c) this.f241695b).f265617a;
                return cim.b.b(cVar.b(((AccountCellItemDelegate.Model) obj2).d).toString(), cVar.b(((AccountCellItemDelegate.Model) obj3).d).toString());
            case 7:
                f01.c cVar2 = ((stl.d) this.f241695b).f265619b;
                return cim.b.b(cVar2.b(((AccountCellItemDelegate.Model) obj2).d).toString(), cVar2.b(((AccountCellItemDelegate.Model) obj3).d).toString());
            case 8:
                int iCompare4 = ((v) this.f241695b).compare(obj2, obj3);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                xi0.a aVar2 = xi0.b.Companion;
                String str = ((x33.a) obj2).f302630a.f65523a.f163147c;
                aVar2.getClass();
                return cim.b.b(cp5.d.e(xi0.a.a(str)), cp5.d.e(xi0.a.a(((x33.a) obj3).f302630a.f65523a.f163147c)));
            case 9:
                int iCompare5 = ((t43.b) this.f241695b).compare(obj2, obj3);
                return iCompare5 != 0 ? iCompare5 : cim.b.b(((x33.a) obj3).f302631b, ((x33.a) obj2).f302631b);
            case 10:
                int iCompare6 = ((uk5.g) this.f241695b).compare(obj2, obj3);
                if (iCompare6 != 0) {
                    return iCompare6;
                }
                wk5.k[] kVarArr = uk5.i.d;
                return cim.b.b(Integer.valueOf(kotlin.collections.d.Y(kVarArr, ((Pair) obj3).f186385a)), Integer.valueOf(kotlin.collections.d.Y(kVarArr, ((Pair) obj2).f186385a)));
            case 11:
                int iCompare7 = ((v) this.f241695b).compare(obj2, obj3);
                return iCompare7 != 0 ? iCompare7 : cim.b.b(((pd5.g) obj2).f235102a.f306286a, ((pd5.g) obj3).f235102a.f306286a);
            case 12:
                int iCompare8 = ((uk5.h) this.f241695b).compare(obj2, obj3);
                if (iCompare8 != 0) {
                    return iCompare8;
                }
                xi0.b[] bVarArr = uk5.i.f280692c;
                return cim.b.b(Integer.valueOf(kotlin.collections.d.Y(bVarArr, ((pd5.g) obj3).f235102a)), Integer.valueOf(kotlin.collections.d.Y(bVarArr, ((pd5.g) obj2).f235102a)));
            case 13:
                int iCompare9 = ((um9.j) this.f241695b).compare(obj2, obj3);
                return iCompare9 != 0 ? iCompare9 : cim.b.b(((kq8.b) obj2).f188336c, ((kq8.b) obj3).f188336c);
            case 14:
                int iCompare10 = ((oh3.e) this.f241695b).compare(obj2, obj3);
                return iCompare10 != 0 ? iCompare10 : cim.b.b(((IncomeSorterDestinationInfo.Crypto.CryptoPocket) obj2).f87459a.f306286a, ((IncomeSorterDestinationInfo.Crypto.CryptoPocket) obj3).f87459a.f306286a);
            case 15:
                int iCompare11 = ((e23.c) this.f241695b).compare(obj2, obj3);
                return iCompare11 != 0 ? iCompare11 : cim.b.b(((sh1.m) obj2).f263378a, ((sh1.m) obj3).f263378a);
            case 16:
                PlanPageLayoutTerms planPageLayoutTerms = (PlanPageLayoutTerms) this.f241695b;
                return cim.b.b(Integer.valueOf(d0.T(planPageLayoutTerms.f102710a, ((TextClause) obj2).f57936a, 0, false, 6)), Integer.valueOf(d0.T(planPageLayoutTerms.f102710a, ((TextClause) obj3).f57936a, 0, false, 6)));
            case 17:
                z0 z0Var = (z0) this.f241695b;
                return cim.b.b(Integer.valueOf(z0.a(z0Var, (mqd.i) obj2)), Integer.valueOf(z0.a(z0Var, (mqd.i) obj3)));
            case 18:
                int iCompare12 = ((o0.a) this.f241695b).compare(obj2, obj3);
                return iCompare12 != 0 ? iCompare12 : cim.b.b(((SourcePocket) obj3).getF91792b(), ((SourcePocket) obj2).getF91792b());
            case 19:
                int iCompare13 = ((wac.b) this.f241695b).compare(obj2, obj3);
                return iCompare13 != 0 ? iCompare13 : cim.b.b(Integer.valueOf(((yac.c) obj2).a()), Integer.valueOf(((yac.c) obj3).a()));
            case 20:
                f01.c cVar3 = ((wyd.c0) this.f241695b).f301245b;
                return cim.b.b(cVar3.b(new CurrencyClause(z92.f.l((io3.d) obj2), null, null, 6)).toString(), cVar3.b(new CurrencyClause(z92.f.l((io3.d) obj3), null, null, 6)).toString());
            case 21:
                int iCompare14 = ((b.a) this.f241695b).compare(obj2, obj3);
                if (iCompare14 != 0) {
                    return iCompare14;
                }
                pcd.s sVar = (pcd.s) obj2;
                l0.Companion.getClass();
                pcd.s sVar2 = (pcd.s) obj3;
                return cim.b.b(l0.proVaults.contains(sVar.e) ? Long.valueOf(sVar.i.getMillis()) : null, l0.proVaults.contains(sVar2.e) ? Long.valueOf(sVar2.i.getMillis()) : null);
            case 22:
                List list = ((x8h.e) this.f241695b).f303334a;
                return cim.b.b(Integer.valueOf(list.indexOf(((xzg.k) obj2).d())), Integer.valueOf(list.indexOf(((xzg.k) obj3).d())));
            case 23:
                AliasType aliasType = ((Alias) obj2).f61878a;
                ?? r06 = this.f241695b;
                Integer num = (Integer) r06.get(aliasType);
                Integer numValueOf2 = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
                Integer num2 = (Integer) r06.get(((Alias) obj3).f61878a);
                return cim.b.b(numValueOf2, Integer.valueOf(num2 != null ? num2.intValue() : Integer.MAX_VALUE));
            case 24:
                xu6.j jVar = (xu6.j) this.f241695b;
                return cim.b.b(Integer.valueOf(jVar.f308971a.indexOf(((AcquiringPaymentFee) obj2).f73366b)), Integer.valueOf(jVar.f308971a.indexOf(((AcquiringPaymentFee) obj3).f73366b)));
            case 25:
                int iCompare15 = ((yd9.j) this.f241695b).compare(obj2, obj3);
                if (iCompare15 != 0) {
                    return iCompare15;
                }
                LocalDate localDate = ((qua.p) obj2).f249314a.f;
                Date date = localDate != null ? localDate.toDate() : null;
                LocalDate localDate2 = ((qua.p) obj3).f249314a.f;
                return cim.b.b(date, localDate2 != null ? localDate2.toDate() : null);
            case 26:
                yea.c cVar4 = (yea.c) this.f241695b;
                return cim.b.b(cVar4.j((yea.a) obj2), cVar4.j((yea.a) obj3));
            case 27:
                int iCompare16 = ((yg6.g) this.f241695b).compare(obj2, obj3);
                return iCompare16 != 0 ? iCompare16 : cim.b.b(((io3.d) obj2).d, ((io3.d) obj3).d);
            case 28:
                int iCompare17 = ((v) this.f241695b).compare(obj2, obj3);
                return iCompare17 != 0 ? iCompare17 : cim.b.b(((io3.d) obj2).f163145a, ((io3.d) obj3).f163145a);
            default:
                z28.r rVar = (z28.r) this.f241695b;
                return cim.b.b(Integer.valueOf(z28.r.a(rVar, (z28.l) obj2).a()), Integer.valueOf(z28.r.a(rVar, (z28.l) obj3).a()));
        }
    }
}
