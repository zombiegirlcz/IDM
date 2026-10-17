package v6l;

import com.revolut.feature.cards.models.revolutcard.ReactivationEligibility;
import com.revolut.feature.cards.models.revolutcard.TerminatedCard;
import ip0.v7;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import v6l.h0;
import yhm.m;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f286507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f286508b;

    public /* synthetic */ v(b1 b1Var, int i) {
        this.f286507a = i;
        this.f286508b = b1Var;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        String str2;
        Object objA;
        Object objA2;
        h93.l0 l0VarA;
        h93.j0 j0VarA;
        switch (this.f286507a) {
            case 0:
                b1 b1Var = this.f286508b;
                h93.f0 card = (h93.f0) obj2;
                Intrinsics.checkNotNullParameter(card, "card");
                return b1Var.o(card).f(te0.w.j(card));
            case 1:
                b1 b1Var2 = this.f286508b;
                u6l.j it8 = (u6l.j) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(b1Var2.f286431m.contains(u1.u(it8.getState(), u6l.k.f277675a)));
            case 2:
                b1 b1Var3 = this.f286508b;
                h93.f0 it9 = (h93.f0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return b1Var3.o(it9).f(te0.w.j(it9));
            case 3:
                b1 b1Var4 = this.f286508b;
                od0.i it10 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                h93.f0 f0Var = (h93.f0) it10.f224257a;
                if (f0Var != null) {
                    return b1Var4.o(f0Var);
                }
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "RevolutCardRepositoryImpl", "Failed to update card locally. Fallback to re-fetch", null, h0Var);
                b1Var4.f286430l.d = true;
                return b1Var4.f286432n.g(h0.a.f286452a, true);
            case 4:
                b1 b1Var5 = this.f286508b;
                h93.f0 card2 = (h93.f0) obj2;
                Intrinsics.checkNotNullParameter(card2, "card");
                b1Var5.getClass();
                return pd.b.n(skm.p0.f264003c, new v0(card2, b1Var5, null)).f(te0.w.j(card2));
            case 5:
                b1 b1Var6 = this.f286508b;
                String cardId = (String) obj2;
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                return (h93.o0) v7.r("TERMINATED_CARD_CHARGEBACK_CACHE_KEY", cardId, b1Var6.f286426c);
            case 6:
                b1 b1Var7 = this.f286508b;
                String cardId2 = (String) obj2;
                Intrinsics.checkNotNullParameter(cardId2, "cardId");
                p6l.x xVar = (p6l.x) b1Var7.f286425b.T2(j6.a.q("TERMINATED_CARD_CHARGEBACK_CACHE_KEY", cardId2), b1.B);
                if (xVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(xVar, "<this>");
                return new h93.o0(xVar.getTransactionIds());
            case 7:
                b1 b1Var8 = this.f286508b;
                String cardId3 = (String) obj2;
                Intrinsics.checkNotNullParameter(cardId3, "cardId");
                String str3 = (String) v7.r("CARD_PIN_MEM_CACHE_KEY", cardId3, b1Var8.f286426c);
                if (str3 != null) {
                    return new h93.l(str3, false);
                }
                return null;
            case 8:
                b1 b1Var9 = this.f286508b;
                String cardId4 = (String) obj2;
                Intrinsics.checkNotNullParameter(cardId4, "cardId");
                u6l.g gVarA = b1Var9.e.a(cardId4, false);
                if (gVarA == null || (str = gVarA.f277652a) == null) {
                    return null;
                }
                return new h93.l(str, false);
            case 9:
                b1 b1Var10 = this.f286508b;
                h0 params = (h0) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return b1.c(params, (List) b1Var10.f286426c.get("REVOLUT_CARD_MEM_CACHE_KEY"));
            case 10:
                b1 b1Var11 = this.f286508b;
                String cardId5 = (String) obj2;
                Intrinsics.checkNotNullParameter(cardId5, "cardId");
                String str4 = (String) v7.r("CARD_PREVIOUS_PIN_MEM_CACHE_KEY", cardId5, b1Var11.f286426c);
                if (str4 != null) {
                    return new h93.l(str4, false);
                }
                return null;
            case 11:
                b1 b1Var12 = this.f286508b;
                String cardId6 = (String) obj2;
                Intrinsics.checkNotNullParameter(cardId6, "cardId");
                u6l.g gVarA2 = b1Var12.e.a(cardId6, true);
                if (gVarA2 == null || (str2 = gVarA2.f277652a) == null) {
                    return null;
                }
                return new h93.l(str2, false);
            case 12:
                b1 b1Var13 = this.f286508b;
                String cardId7 = (String) obj2;
                Intrinsics.checkNotNullParameter(cardId7, "cardId");
                return (h93.y) v7.r("PIN_STATUS_CACHE_KEY", cardId7, b1Var13.f286426c);
            case 13:
                b1 b1Var14 = this.f286508b;
                String cardId8 = (String) obj2;
                Intrinsics.checkNotNullParameter(cardId8, "cardId");
                p6l.l lVar = (p6l.l) b1Var14.f286425b.T2(j6.a.q("PIN_STATUS_CACHE_KEY", cardId8), b1.C);
                if (lVar != null) {
                    return g4i.a.D(lVar);
                }
                return null;
            case 14:
                b1 b1Var15 = this.f286508b;
                String cardId9 = (String) obj2;
                Intrinsics.checkNotNullParameter(cardId9, "cardId");
                return (Boolean) v7.r("TERMINATION_ELIGIBILITY_CACHE_KEY", cardId9, b1Var15.f286426c);
            case 15:
                b1 b1Var16 = this.f286508b;
                String cardId10 = (String) obj2;
                Intrinsics.checkNotNullParameter(cardId10, "cardId");
                return (Boolean) b1Var16.f286425b.T2(j6.a.q("TERMINATION_ELIGIBILITY_CACHE_KEY", cardId10), b1.D);
            case 16:
                b1 b1Var17 = this.f286508b;
                String id10 = (String) obj2;
                Intrinsics.checkNotNullParameter(id10, "id");
                return (h93.g0) v7.r("REVOLUT_CARDS_DETAILS_KEY_", id10, b1Var17.f286426c);
            case 17:
                b1 b1Var18 = this.f286508b;
                String cardId11 = (String) obj2;
                Intrinsics.checkNotNullParameter(cardId11, "id");
                xm0.a aVar = b1Var18.e.f268382a;
                Intrinsics.checkNotNullParameter(cardId11, "cardId");
                try {
                    m.Companion companion = yhm.m.INSTANCE;
                    objA = aVar.a("pan_" + cardId11);
                    break;
                } catch (Throwable th10) {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    objA = yhm.o.a(th10);
                }
                if (objA instanceof yhm.n) {
                    objA = null;
                }
                String str5 = (String) objA;
                try {
                    objA2 = aVar.a("cvv_" + cardId11);
                    break;
                } catch (Throwable th11) {
                    m.Companion companion3 = yhm.m.INSTANCE;
                    objA2 = yhm.o.a(th11);
                }
                if (objA2 instanceof yhm.n) {
                    objA2 = null;
                }
                String str6 = (String) objA2;
                if (str5 == null || str6 == null) {
                    return null;
                }
                return new h93.g0(cardId11, str5, str6, false);
            case 18:
                b1 b1Var19 = this.f286508b;
                h0 params2 = (h0) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                return b1.c(params2, b1Var19.h());
            case 19:
                b1 b1Var20 = this.f286508b;
                String design = (String) obj2;
                Intrinsics.checkNotNullParameter(design, "design");
                return (i93.c) v7.r("DISPOSABLE_CARD_SETTINGS_MEM_KEY", design, b1Var20.f286426c);
            case 20:
                b1 b1Var21 = this.f286508b;
                String design2 = (String) obj2;
                Intrinsics.checkNotNullParameter(design2, "design");
                u6l.d dVar = (u6l.d) b1Var21.f286425b.T2("DISPOSABLE_CARD_SETTINGS_STORAGE_KEY" + design2, u6l.d.class);
                if (dVar != null) {
                    return u6l.k.b(dVar);
                }
                return null;
            case 21:
                b1 b1Var22 = this.f286508b;
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return (List) b1Var22.f286426c.get("SUGGESTED_CARDHOLDER_NAMES_MEM_CACHE_KEY");
            case 22:
                b1 b1Var23 = this.f286508b;
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return (List) b1Var23.f286425b.T2("SUGGESTED_CARDHOLDER_NAMES_STORAGE_KEY", b1.E);
            case 23:
                b1 b1Var24 = this.f286508b;
                String token = (String) obj2;
                Intrinsics.checkNotNullParameter(token, "token");
                return (h93.f0) v7.r("REVOLUT_CARD_BY_TOKEN_MEM_CACHE_KEY", token, b1Var24.f286426c);
            case 24:
                b1 b1Var25 = this.f286508b;
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return (List) b1Var25.f286426c.get("REVOLUT_TERMINATED_CARDS_MEM_CACHE_KEY");
            case 25:
                b1 b1Var26 = this.f286508b;
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                List list = (List) b1Var26.f286425b.T2("REVOLUT_TERMINATED_CARDS_STORAGE_KEY", b1.A);
                if (list == null) {
                    return null;
                }
                List<u6l.n> list2 = list;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                for (u6l.n nVar : list2) {
                    Object obj3 = u6l.k.f277675a;
                    Intrinsics.checkNotNullParameter(nVar, "<this>");
                    String id11 = nVar.getId();
                    String walletId = nVar.getWalletId();
                    b93.j jVar = new b93.j(new b93.b(nVar.getCardCode()), nVar.getBrand());
                    String lastFour = nVar.getLastFour();
                    LocalDate localDate = LocalDate.parse(nVar.getExpiryDate());
                    Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
                    long updatedDate = nVar.getUpdatedDate();
                    String label = nVar.getLabel();
                    u6l.i reactivation = nVar.getReactivation();
                    Intrinsics.checkNotNullParameter(reactivation, "<this>");
                    boolean allowed = reactivation.getAllowed();
                    h93.m0 m0Var = h93.n0.Companion;
                    String reason = reactivation.getReason();
                    m0Var.getClass();
                    ReactivationEligibility reactivationEligibility = new ReactivationEligibility(allowed, h93.m0.a(reason));
                    boolean recentlyTerminated = nVar.getRecentlyTerminated();
                    String subProductType = nVar.getSubProductType();
                    if (subProductType != null) {
                        h93.l0.Companion.getClass();
                        l0VarA = h93.k0.a(subProductType);
                    } else {
                        l0VarA = null;
                    }
                    String productType = nVar.getProductType();
                    if (productType != null) {
                        h93.j0.Companion.getClass();
                        j0VarA = h93.i0.a(productType);
                    } else {
                        j0VarA = null;
                    }
                    arrayList.add(new TerminatedCard(id11, walletId, jVar, lastFour, localDate, updatedDate, label, reactivationEligibility, recentlyTerminated, l0VarA, j0VarA, nVar.getCardName()));
                }
                return arrayList;
            case 26:
                qe0.s sVar = this.f286508b.f286430l;
                Unit unit = Unit.f186387a;
                sVar.f(unit);
                return unit;
            case 27:
                b1 b1Var27 = this.f286508b;
                h93.f0 it11 = (h93.f0) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return b1Var27.o(it11);
            case 28:
                b1 b1Var28 = this.f286508b;
                h93.f0 it12 = (h93.f0) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return b1Var28.o(it12);
            default:
                qe0.s sVar2 = this.f286508b.f286430l;
                Unit unit2 = Unit.f186387a;
                sVar2.f(unit2);
                return unit2;
        }
    }
}
