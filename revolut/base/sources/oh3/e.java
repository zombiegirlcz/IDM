package oh3;

import ahe.z0;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedFilter;
import do3.n;
import java.util.Comparator;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import lnd.n0;
import m2j.s;
import oq9.o;
import org.joda.time.DateTime;
import rv1.r;
import uqh.c0;
import uqh.t;
import zel.g;
import zh9.q;
import zh9.y;
import zq5.i0;
import zq5.j0;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f225282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f225283c;

    public /* synthetic */ e(Object obj2, Object obj3, int i) {
        this.f225281a = i;
        this.f225283c = obj2;
        this.f225282b = obj3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        dj0.d dVar;
        dj0.d dVar2;
        switch (this.f225281a) {
            case 0:
                int iCompare = ((s) this.f225283c).compare(obj2, obj3);
                if (iCompare != 0) {
                    return iCompare;
                }
                cim.a aVar = (cim.a) this.f225282b;
                k1j.a f99407g = ((BalanceWrapper) obj3).getF99407g();
                k1j.a aVar2 = k1j.a.POCKETS;
                return aVar.compare(Boolean.valueOf(f99407g == aVar2), Boolean.valueOf(((BalanceWrapper) obj2).getF99407g() == aVar2));
            case 1:
                int iCompare2 = ((s) this.f225283c).compare(obj2, obj3);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                cim.a aVar3 = (cim.a) this.f225282b;
                k1j.a f99407g2 = ((BalanceWrapper) obj3).getF99407g();
                k1j.a aVar4 = k1j.a.JOINT_ACCOUNT;
                return aVar3.compare(Boolean.valueOf(f99407g2 == aVar4), Boolean.valueOf(((BalanceWrapper) obj2).getF99407g() == aVar4));
            case 2:
                int iCompare3 = ((e) this.f225283c).compare(obj2, obj3);
                if (iCompare3 != 0) {
                    return iCompare3;
                }
                cim.a aVar5 = (cim.a) this.f225282b;
                k1j.a f99407g3 = ((BalanceWrapper) obj3).getF99407g();
                k1j.a aVar6 = k1j.a.JOINT_VAULTS;
                return aVar5.compare(Boolean.valueOf(f99407g3 == aVar6), Boolean.valueOf(((BalanceWrapper) obj2).getF99407g() == aVar6));
            case 3:
                int iCompare4 = ((e) this.f225283c).compare(obj2, obj3);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                cim.a aVar7 = (cim.a) this.f225282b;
                k1j.a f99407g4 = ((BalanceWrapper) obj3).getF99407g();
                k1j.a aVar8 = k1j.a.JOINT_SAVINGS;
                return aVar7.compare(Boolean.valueOf(f99407g4 == aVar8), Boolean.valueOf(((BalanceWrapper) obj2).getF99407g() == aVar8));
            case 4:
                int iCompare5 = ((s) this.f225283c).compare(obj2, obj3);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                cim.a aVar9 = (cim.a) this.f225282b;
                k1j.a f99407g5 = ((BalanceWrapper) obj3).getF99407g();
                k1j.a aVar10 = k1j.a.PRO;
                return aVar9.compare(Boolean.valueOf(f99407g5 == aVar10), Boolean.valueOf(((BalanceWrapper) obj2).getF99407g() == aVar10));
            case 5:
                int iCompare6 = ((s) this.f225283c).compare(obj2, obj3);
                if (iCompare6 != 0) {
                    return iCompare6;
                }
                cim.a aVar11 = (cim.a) this.f225282b;
                k1j.a f99407g6 = ((BalanceWrapper) obj3).getF99407g();
                k1j.a aVar12 = k1j.a.CREDIT_CARDS;
                return aVar11.compare(Boolean.valueOf(f99407g6 == aVar12), Boolean.valueOf(((BalanceWrapper) obj2).getF99407g() == aVar12));
            case 6:
                int iCompare7 = ((s) this.f225283c).compare(obj2, obj3);
                if (iCompare7 != 0) {
                    return iCompare7;
                }
                cim.a aVar13 = (cim.a) this.f225282b;
                k1j.a f99407g7 = ((BalanceWrapper) obj3).getF99407g();
                k1j.a aVar14 = k1j.a.POCKETS;
                return aVar13.compare(Boolean.valueOf(f99407g7 == aVar14), Boolean.valueOf(((BalanceWrapper) obj2).getF99407g() == aVar14));
            case 7:
                int iCompare8 = ((e) this.f225283c).compare(obj2, obj3);
                if (iCompare8 != 0) {
                    return iCompare8;
                }
                cim.a aVar15 = (cim.a) this.f225282b;
                k1j.a f99407g8 = ((BalanceWrapper) obj3).getF99407g();
                k1j.a aVar16 = k1j.a.VAULTS;
                return aVar15.compare(Boolean.valueOf(f99407g8 == aVar16), Boolean.valueOf(((BalanceWrapper) obj2).getF99407g() == aVar16));
            case 8:
                int iCompare9 = ((e) this.f225283c).compare(obj2, obj3);
                if (iCompare9 != 0) {
                    return iCompare9;
                }
                cim.a aVar17 = (cim.a) this.f225282b;
                k1j.a f99407g9 = ((BalanceWrapper) obj3).getF99407g();
                k1j.a aVar18 = k1j.a.SAVINGS;
                return aVar17.compare(Boolean.valueOf(f99407g9 == aVar18), Boolean.valueOf(((BalanceWrapper) obj2).getF99407g() == aVar18));
            case 9:
                int iCompare10 = ((e) this.f225283c).compare(obj2, obj3);
                if (iCompare10 != 0) {
                    return iCompare10;
                }
                cim.a aVar19 = (cim.a) this.f225282b;
                k1j.a f99407g10 = ((BalanceWrapper) obj3).getF99407g();
                k1j.a aVar20 = k1j.a.COMMODITIES;
                return aVar19.compare(Boolean.valueOf(f99407g10 == aVar20), Boolean.valueOf(((BalanceWrapper) obj2).getF99407g() == aVar20));
            case 10:
                int iCompare11 = ((e) this.f225283c).compare(obj2, obj3);
                if (iCompare11 != 0) {
                    return iCompare11;
                }
                cim.a aVar21 = (cim.a) this.f225282b;
                k1j.a f99407g11 = ((BalanceWrapper) obj3).getF99407g();
                k1j.a aVar22 = k1j.a.CRYPTO;
                return aVar21.compare(Boolean.valueOf(f99407g11 == aVar22), Boolean.valueOf(((BalanceWrapper) obj2).getF99407g() == aVar22));
            case 11:
                int iCompare12 = ((s) this.f225283c).compare(obj2, obj3);
                if (iCompare12 != 0) {
                    return iCompare12;
                }
                cim.a aVar23 = (cim.a) this.f225282b;
                k1j.a f99407g12 = ((BalanceWrapper) obj3).getF99407g();
                k1j.a aVar24 = k1j.a.JOINT_ACCOUNT;
                return aVar23.compare(Boolean.valueOf(f99407g12 == aVar24), Boolean.valueOf(((BalanceWrapper) obj2).getF99407g() == aVar24));
            case 12:
                int iCompare13 = ((e) this.f225283c).compare(obj2, obj3);
                if (iCompare13 != 0) {
                    return iCompare13;
                }
                cim.a aVar25 = (cim.a) this.f225282b;
                k1j.a f99407g13 = ((BalanceWrapper) obj3).getF99407g();
                k1j.a aVar26 = k1j.a.JOINT_VAULTS;
                return aVar25.compare(Boolean.valueOf(f99407g13 == aVar26), Boolean.valueOf(((BalanceWrapper) obj2).getF99407g() == aVar26));
            case 13:
                int iCompare14 = ((e) this.f225283c).compare(obj2, obj3);
                if (iCompare14 != 0) {
                    return iCompare14;
                }
                cim.a aVar27 = (cim.a) this.f225282b;
                k1j.a f99407g14 = ((BalanceWrapper) obj3).getF99407g();
                k1j.a aVar28 = k1j.a.JOINT_SAVINGS;
                return aVar27.compare(Boolean.valueOf(f99407g14 == aVar28), Boolean.valueOf(((BalanceWrapper) obj2).getF99407g() == aVar28));
            case 14:
                int iCompare15 = ((s) this.f225283c).compare(obj2, obj3);
                if (iCompare15 != 0) {
                    return iCompare15;
                }
                cim.a aVar29 = (cim.a) this.f225282b;
                k1j.a f99407g15 = ((BalanceWrapper) obj3).getF99407g();
                k1j.a aVar30 = k1j.a.CREDIT_CARDS;
                return aVar29.compare(Boolean.valueOf(f99407g15 == aVar30), Boolean.valueOf(((BalanceWrapper) obj2).getF99407g() == aVar30));
            case 15:
                int iCompare16 = ((n0) this.f225283c).compare(obj2, obj3);
                if (iCompare16 != 0) {
                    return iCompare16;
                }
                cim.a aVar31 = (cim.a) this.f225282b;
                k1j.a f99407g16 = ((BalanceWrapper) obj3).getF99407g();
                k1j.a aVar32 = k1j.a.PRO;
                return aVar31.compare(Boolean.valueOf(f99407g16 == aVar32), Boolean.valueOf(((BalanceWrapper) obj2).getF99407g() == aVar32));
            case 16:
                int iCompare17 = ((s) this.f225283c).compare(obj2, obj3);
                if (iCompare17 != 0) {
                    return iCompare17;
                }
                cim.a aVar33 = (cim.a) this.f225282b;
                k1j.a f99407g17 = ((BalanceWrapper) obj3).getF99407g();
                k1j.a aVar34 = k1j.a.POCKETS;
                return aVar33.compare(Boolean.valueOf(f99407g17 == aVar34), Boolean.valueOf(((BalanceWrapper) obj2).getF99407g() == aVar34));
            case 17:
                int iCompare18 = ((e) this.f225283c).compare(obj2, obj3);
                if (iCompare18 != 0) {
                    return iCompare18;
                }
                cim.a aVar35 = (cim.a) this.f225282b;
                k1j.a f99407g18 = ((BalanceWrapper) obj3).getF99407g();
                k1j.a aVar36 = k1j.a.VAULTS;
                return aVar35.compare(Boolean.valueOf(f99407g18 == aVar36), Boolean.valueOf(((BalanceWrapper) obj2).getF99407g() == aVar36));
            case 18:
                int iCompare19 = ((e) this.f225283c).compare(obj2, obj3);
                if (iCompare19 != 0) {
                    return iCompare19;
                }
                cim.a aVar37 = (cim.a) this.f225282b;
                k1j.a f99407g19 = ((BalanceWrapper) obj3).getF99407g();
                k1j.a aVar38 = k1j.a.SAVINGS;
                return aVar37.compare(Boolean.valueOf(f99407g19 == aVar38), Boolean.valueOf(((BalanceWrapper) obj2).getF99407g() == aVar38));
            case 19:
                int iCompare20 = ((e) this.f225283c).compare(obj2, obj3);
                if (iCompare20 != 0) {
                    return iCompare20;
                }
                cim.a aVar39 = (cim.a) this.f225282b;
                k1j.a f99407g20 = ((BalanceWrapper) obj3).getF99407g();
                k1j.a aVar40 = k1j.a.COMMODITIES;
                return aVar39.compare(Boolean.valueOf(f99407g20 == aVar40), Boolean.valueOf(((BalanceWrapper) obj2).getF99407g() == aVar40));
            case 20:
                int iCompare21 = ((e) this.f225283c).compare(obj2, obj3);
                if (iCompare21 != 0) {
                    return iCompare21;
                }
                cim.a aVar41 = (cim.a) this.f225282b;
                k1j.a f99407g21 = ((BalanceWrapper) obj3).getF99407g();
                k1j.a aVar42 = k1j.a.CRYPTO;
                return aVar41.compare(Boolean.valueOf(f99407g21 == aVar42), Boolean.valueOf(((BalanceWrapper) obj2).getF99407g() == aVar42));
            case 21:
                PaymentGroup paymentGroup = (PaymentGroup) this.f225282b;
                hr9.b bVar = (hr9.b) obj2;
                o oVar = bVar.f154791a;
                n nVar = (n) this.f225283c;
                hr9.b bVar2 = (hr9.b) obj3;
                return cim.b.b(Integer.valueOf(oi0.d.G(oVar, nVar) ? -1 : paymentGroup.d.indexOf(bVar.f154791a)), Integer.valueOf(oi0.d.G(bVar2.f154791a, nVar) ? -1 : paymentGroup.d.indexOf(bVar2.f154791a)));
            case 22:
                Alias alias = (Alias) obj2;
                r rVar = (r) this.f225283c;
                av1.d dVar3 = (av1.d) this.f225282b;
                Alias alias2 = dVar3.f9873a;
                rVar.getClass();
                Alias alias3 = (Alias) obj3;
                return cim.b.b(Integer.valueOf(Intrinsics.f(alias, alias2) ? 0 : r.d(alias.f61878a)), Integer.valueOf(Intrinsics.f(alias3, dVar3.f9873a) ? 0 : r.d(alias3.f61878a)));
            case 23:
                f01.c cVar = ((stl.b) this.f225282b).f265616a;
                int iCompare22 = ((stl.a) this.f225283c).compare(obj2, obj3);
                return iCompare22 != 0 ? iCompare22 : cim.b.b(cVar.b(((AccountCellItemDelegate.Model) ((Pair) obj2).f186385a).d).toString(), cVar.b(((AccountCellItemDelegate.Model) ((Pair) obj3).f186385a).d).toString());
            case 24:
                long jValueOf = 0L;
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f225282b;
                int iCompare23 = ((z0) this.f225283c).compare(obj2, obj3);
                if (iCompare23 != 0) {
                    return iCompare23;
                }
                BalanceWrapper.PocketBalanceWrapper pocketBalanceWrapper = (BalanceWrapper.PocketBalanceWrapper) linkedHashMap.get(((IncomeSorterDestinationInfo.Crypto.CryptoPocket) obj3).f87459a.f306286a);
                Long lValueOf = (pocketBalanceWrapper == null || (dVar2 = pocketBalanceWrapper.k) == null) ? 0L : Long.valueOf(dVar2.f115082a);
                BalanceWrapper.PocketBalanceWrapper pocketBalanceWrapper2 = (BalanceWrapper.PocketBalanceWrapper) linkedHashMap.get(((IncomeSorterDestinationInfo.Crypto.CryptoPocket) obj2).f87459a.f306286a);
                if (pocketBalanceWrapper2 != null && (dVar = pocketBalanceWrapper2.k) != null) {
                    jValueOf = Long.valueOf(dVar.f115082a);
                }
                return cim.b.b(lValueOf, jValueOf);
            case 25:
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.f225282b;
                int iCompare24 = ((e) this.f225283c).compare(obj2, obj3);
                if (iCompare24 != 0) {
                    return iCompare24;
                }
                cw5.b bVar3 = (cw5.b) linkedHashMap2.get(((IncomeSorterDestinationInfo.Crypto.CryptoPocket) obj3).f87459a.f306286a);
                Long lValueOf2 = bVar3 != null ? Long.valueOf(bVar3.f109535b) : null;
                cw5.b bVar4 = (cw5.b) linkedHashMap2.get(((IncomeSorterDestinationInfo.Crypto.CryptoPocket) obj2).f87459a.f306286a);
                return cim.b.b(lValueOf2, bVar4 != null ? Long.valueOf(bVar4.f109535b) : null);
            case 26:
                iph.a aVar43 = ((c0) this.f225283c).f282136b;
                g f105167a = ((ScreenerSelectedFilter) obj2).getF105167a();
                t tVar = (t) this.f225282b;
                return cim.b.b(Integer.valueOf(aVar43.a(f105167a, tVar.f282175a)), Integer.valueOf(aVar43.a(((ScreenerSelectedFilter) obj3).getF105167a(), tVar.f282175a)));
            case 27:
                wsg.n nVar2 = (wsg.n) this.f225283c;
                xi0.a aVar44 = xi0.b.Companion;
                String str = ((io3.d) obj3).f163147c;
                aVar44.getClass();
                xi0.b bVarA = xi0.a.a(str);
                AccountId accountId = (AccountId) this.f225282b;
                DateTime dateTimeA = nVar2.A(bVarA, accountId);
                Long lValueOf3 = dateTimeA != null ? Long.valueOf(dateTimeA.getMillis()) : 0L;
                DateTime dateTimeA2 = nVar2.A(xi0.a.a(((io3.d) obj2).f163147c), accountId);
                return cim.b.b(lValueOf3, dateTimeA2 != null ? Long.valueOf(dateTimeA2.getMillis()) : 0L);
            case 28:
                y yVar = (y) obj2;
                y yVar2 = (y) obj3;
                zh9.t tVar2 = (zh9.t) this.f225282b;
                int i = zh9.r.f322325a[((q) this.f225283c).ordinal()];
                if (i == 1) {
                    return tVar2.compare(yVar, yVar2);
                }
                if (i == 2) {
                    return tVar2.compare(yVar2, yVar);
                }
                throw new NoWhenBranchMatchedException();
            default:
                j0 j0Var = (j0) this.f225282b;
                int iCompare25 = ((zh9.t) this.f225283c).compare(obj2, obj3);
                return iCompare25 != 0 ? iCompare25 : cim.b.b(j0.b(j0Var, (i0) obj2), j0.b(j0Var, (i0) obj3));
        }
    }

    public e(q order) {
        this.f225281a = 28;
        Intrinsics.checkNotNullParameter(order, "order");
        this.f225283c = order;
        this.f225282b = new zh9.t(new zh9.t(new zh9.s(), 0), 1);
    }
}
