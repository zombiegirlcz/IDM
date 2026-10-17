package v04;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.appcompat.app.AppCompatActivity;
import ar9.h;
import au3.k;
import aw0.o9;
import cnb.f;
import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.domain.models.user.UserCompanyRegion;
import com.revolut.feature.backend_flow.domain.models.HtmlStringItem;
import com.revolut.feature.cards.models.revolutcard.TerminatedCard;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardDirectDebitMandate;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawLimits;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.review.FiatCryptoWithdrawLimits;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature_travel_hotels_models.location.Coordinates;
import com.revolut.feature_travel_hotels_models.location.Country;
import com.revolut.feature_travel_hotels_models.location.HotelsLocation;
import com.revolut.feature_travel_hotels_models.property.Distance;
import com.revolut.feature_travel_hotels_models.property.HotelsPointsRedeemOption;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyGuestReviewScore;
import com.revolut.feature_travel_hotels_models.property.OverallPrice;
import com.revolut.feature_travel_hotels_models.property.PriceFee;
import com.revolut.feature_travel_hotels_models.property.Window;
import com.revolut.feature_travel_hotels_models.property.room.RoomOccupancy;
import com.revolut.feature_travel_hotels_models.property.search.Child;
import com.revolut.feature_travel_hotels_models.property.search.HotelsPropertyRoomOccupancy;
import dfl.r;
import dj0.d;
import dx4.a1;
import dx4.y0;
import f24.e;
import f24.g;
import f24.i;
import grl.b6;
import grl.d6;
import h93.f0;
import h93.j0;
import h93.l0;
import hx7.l;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k4l.r0;
import ko5.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import kotlin.text.z;
import le.u1;
import npg.j;
import org.joda.time.LocalTime;
import pcd.h0;
import retrofit2.HttpException;
import ulm.i1;
import ulm.j1;
import yei.q;
import zc0.n3;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public abstract class b {
    public static final dt3.c A(pr3.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String text = aVar.getText();
        String action = aVar.getAction();
        dt3.b bVar = null;
        if (action != null) {
            dt3.b[] bVarArrValues = dt3.b.values();
            int length = bVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                dt3.b bVar2 = bVarArrValues[i];
                if (a0.z(bVar2.name(), action, true)) {
                    bVar = bVar2;
                    break;
                }
                i++;
            }
        }
        return new dt3.c(text, bVar);
    }

    public static final j B(f fVar) {
        h0 h0Var;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        String str = fVar.f25377a;
        String str2 = fVar.f25378b;
        d dVarO = mo3.a.o(fVar.f25379c);
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(fVar.e), ZoneId.systemDefault());
        Intrinsics.checkNotNullExpressionValue(localDateTimeOfInstant, "ofInstant(...)");
        String str3 = fVar.f.f25376a;
        String str4 = fVar.d;
        h0[] h0VarArrValues = h0.values();
        int length = h0VarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                h0Var = null;
                break;
            }
            h0Var = h0VarArrValues[i];
            if (a0.z(h0Var.name(), str4, true)) {
                break;
            }
            i++;
        }
        if (h0Var == null) {
            h0Var = h0.ACTIVE;
        }
        return new j(str, str2, dVarO, h0Var, localDateTimeOfInstant, str3);
    }

    public static final oq9.d C(h hVar) {
        int i = br9.b.f17954b[hVar.ordinal()];
        if (i == 1) {
            return oq9.d.OWE;
        }
        if (i == 2) {
            return oq9.d.OWED;
        }
        if (i == 3) {
            return oq9.d.SETTLED;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final f24.j D(k kVar) {
        g gVar;
        if (kVar instanceof au3.j) {
            ArrayList arrayList = ((au3.j) kVar).f9480a;
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                arrayList2.add(D((k) it8.next()));
            }
            return new i(arrayList2);
        }
        if (!(kVar instanceof au3.i)) {
            throw new NoWhenBranchMatchedException();
        }
        au3.i iVar = (au3.i) kVar;
        String str = iVar.f9477a;
        String str2 = iVar.f9478b;
        a1 a1Var = iVar.f9479c;
        g eVar = null;
        String strB = a1Var != null ? a1Var.b() : null;
        au3.h hVar = iVar.d;
        if (hVar != null) {
            if (hVar instanceof au3.f) {
                eVar = new e(((au3.f) hVar).f9475a);
            } else {
                if (hVar instanceof au3.e) {
                    gVar = f24.d.f131428a;
                } else {
                    if (!(hVar instanceof au3.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gVar = f24.f.f131430a;
                }
                eVar = gVar;
            }
        }
        return new f24.h(str, str2, strB, eVar);
    }

    public static final h E(oq9.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        int i = br9.b.f17955c[dVar.ordinal()];
        if (i == 1) {
            return h.SETTLED_UP;
        }
        if (i == 2) {
            return h.OWE;
        }
        if (i == 3) {
            return h.OWED;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ep5.c F(CryptoWithdrawLimits cryptoWithdrawLimits) {
        Intrinsics.checkNotNullParameter(cryptoWithdrawLimits, "<this>");
        jo3.a aVarP = mo3.a.p(cryptoWithdrawLimits.f71092a);
        jo3.a aVarP2 = mo3.a.p(cryptoWithdrawLimits.f71093b);
        jo3.a aVarP3 = mo3.a.p(cryptoWithdrawLimits.f71094c);
        jo3.a aVarP4 = mo3.a.p(cryptoWithdrawLimits.d);
        o oVar = cryptoWithdrawLimits.e;
        String strName = oVar != null ? oVar.name() : null;
        Long l2 = cryptoWithdrawLimits.f;
        d dVar = cryptoWithdrawLimits.f71095g;
        return new ep5.c(aVarP, aVarP2, aVarP3, aVarP4, strName, l2, dVar != null ? mo3.a.p(dVar) : null);
    }

    public static final CompositeClause G(f0 f0Var, String str, Style style, boolean z, Boolean bool) {
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        return H(new vf0.h(f0Var.f150114h.f13639a, f0Var.I, f0Var.H, f0Var.G), str, style, z, bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.core.ui_kit.models.CompositeClause H(vf0.h r14, java.lang.String r15, com.revolut.core.ui_kit.models.Style r16, boolean r17, java.lang.Boolean r18) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.Object r0 = r14.f288433a
            b93.b r0 = (b93.b) r0
            java.lang.Object r1 = r14.f288434b
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r14.f288435c
            h93.j0 r2 = (h93.j0) r2
            java.lang.Object r14 = r14.d
            h93.l0 r14 = (h93.l0) r14
            h93.l0 r3 = h93.l0.MEXICO_MCY
            r4 = 14
            r5 = 0
            if (r14 != r3) goto L33
            com.revolut.core.ui_kit.models.CompositeClause r6 = new com.revolut.core.ui_kit.models.CompositeClause
            com.revolut.core.ui_kit.models.TextLocalisedClause r14 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r0 = com.revolut.feature.cards_core.R$string.card_label_mexico_mcy
            r14.<init>(r0, r5, r5, r4)
            java.util.List r7 = zhm.u.c(r14)
            r10 = 0
            r11 = 10
            r8 = 0
            r9 = r16
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L33:
            r3 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            yhm.r r6 = new yhm.r
            r6.<init>(r0, r2, r14)
            r14 = r17
            r2 = r18
            java.lang.Integer r14 = m(r6, r14, r2)
            if (r14 == 0) goto L5c
            int r14 = r14.intValue()
            com.revolut.core.ui_kit.models.TextLocalisedClause r2 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            r2.<init>(r14, r5, r5, r4)
            r1.add(r2)
            com.revolut.core.ui_kit.models.DotDividerClause r14 = new com.revolut.core.ui_kit.models.DotDividerClause
            r14.<init>(r5)
            r1.add(r14)
        L5c:
            if (r15 == 0) goto L77
            boolean r14 = kotlin.text.d0.W(r15)
            if (r14 != 0) goto L66
            r7 = r15
            goto L67
        L66:
            r7 = r5
        L67:
            if (r7 == 0) goto L77
            com.revolut.core.ui_kit.models.TextClause r6 = new com.revolut.core.ui_kit.models.TextClause
            r12 = 0
            r13 = 126(0x7e, float:1.77E-43)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
        L75:
            r5 = r6
            goto La1
        L77:
            if (r3 == 0) goto L91
            boolean r14 = kotlin.text.d0.W(r3)
            if (r14 != 0) goto L81
            r7 = r3
            goto L82
        L81:
            r7 = r5
        L82:
            if (r7 == 0) goto L91
            com.revolut.core.ui_kit.models.TextClause r6 = new com.revolut.core.ui_kit.models.TextClause
            r12 = 0
            r13 = 126(0x7e, float:1.77E-43)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            goto L75
        L91:
            java.lang.Integer r14 = n(r0)
            if (r14 == 0) goto La1
            int r14 = r14.intValue()
            com.revolut.core.ui_kit.models.TextLocalisedClause r0 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            r0.<init>(r14, r5, r5, r4)
            r5 = r0
        La1:
            if (r5 == 0) goto La6
            r1.add(r5)
        La6:
            com.revolut.core.ui_kit.models.CompositeClause r0 = new com.revolut.core.ui_kit.models.CompositeClause
            r4 = 0
            r5 = 10
            r2 = 0
            r3 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v04.b.H(vf0.h, java.lang.String, com.revolut.core.ui_kit.models.Style, boolean, java.lang.Boolean):com.revolut.core.ui_kit.models.CompositeClause");
    }

    public static CompositeClause I(TerminatedCard terminatedCard, String str, int i) {
        Boolean bool = Boolean.TRUE;
        Intrinsics.checkNotNullParameter(terminatedCard, "<this>");
        return H(new vf0.h(terminatedCard.f65549c.f13639a, terminatedCard.f65553l, terminatedCard.k, terminatedCard.f65552j), str, null, false, bool);
    }

    public static /* synthetic */ CompositeClause J(f0 f0Var, String str, Custom custom, Boolean bool, int i) {
        if ((i & 2) != 0) {
            custom = null;
        }
        if ((i & 8) != 0) {
            bool = Boolean.TRUE;
        }
        return G(f0Var, str, custom, false, bool);
    }

    public static final aul.b K(r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        int i = aul.c.f9862b[rVar.ordinal()];
        if (i == 1) {
            return aul.b.FIAT;
        }
        if (i == 2) {
            return aul.b.SECURITY;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final CryptoWithdrawLimits L(FiatCryptoWithdrawLimits fiatCryptoWithdrawLimits, cp5.e side) {
        Intrinsics.checkNotNullParameter(fiatCryptoWithdrawLimits, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        int i = cp5.b.f107875a[side.ordinal()];
        if (i == 1) {
            return new CryptoWithdrawLimits(fiatCryptoWithdrawLimits.f71185a.f71113b, fiatCryptoWithdrawLimits.f71186b.f71113b, fiatCryptoWithdrawLimits.f71187c.f71113b, fiatCryptoWithdrawLimits.d.f71113b, fiatCryptoWithdrawLimits.e, fiatCryptoWithdrawLimits.f, null);
        }
        if (i == 2) {
            return new CryptoWithdrawLimits(fiatCryptoWithdrawLimits.f71185a.f71112a, fiatCryptoWithdrawLimits.f71186b.f71112a, fiatCryptoWithdrawLimits.f71187c.f71112a, fiatCryptoWithdrawLimits.d.f71112a, fiatCryptoWithdrawLimits.e, fiatCryptoWithdrawLimits.f, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String M(RoomOccupancy roomOccupancy) {
        Intrinsics.checkNotNullParameter(roomOccupancy, "<this>");
        StringBuilder sb6 = new StringBuilder();
        sb6.append(roomOccupancy.f98119a);
        Iterator it8 = roomOccupancy.f98120b.iterator();
        while (it8.hasNext()) {
            int iIntValue = ((Number) it8.next()).intValue();
            sb6.append("-");
            sb6.append(iIntValue);
        }
        return sb6.toString();
    }

    public static final String N(HotelsPropertyRoomOccupancy hotelsPropertyRoomOccupancy) {
        Intrinsics.checkNotNullParameter(hotelsPropertyRoomOccupancy, "<this>");
        StringBuilder sb6 = new StringBuilder();
        sb6.append(hotelsPropertyRoomOccupancy.f98127a);
        for (Child child : hotelsPropertyRoomOccupancy.f98128b) {
            sb6.append("-");
            sb6.append(child.f98125a);
        }
        return sb6.toString();
    }

    public static final b6 O(bfl.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        int i = x2f.a.f302549b[gVar.ordinal()];
        if (i == 1) {
            return b6.BUY;
        }
        if (i == 2) {
            return b6.SELL;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final d6 P(r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        int i = x2f.a.f302548a[r0Var.ordinal()];
        if (i == 1) {
            return d6.MARKET;
        }
        if (i == 2) {
            return d6.LIMIT;
        }
        if (i == 3) {
            return d6.STOP;
        }
        if (i == 4) {
            return d6.RECURRING;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TextLocalisedClause Q(Clause clause, int i) {
        Intrinsics.checkNotNullParameter(clause, "<this>");
        return new TextLocalisedClause(i, u.c(clause), null, 12);
    }

    public static final j1 a(j1 j1Var, String accessToken) {
        Intrinsics.checkNotNullParameter(j1Var, "<this>");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        i1 i1VarB = j1Var.b();
        String str = j1Var.f281096b;
        if (nim.a.B(str)) {
            i1VarB.c(str, new xj0.h(j1Var.d));
        }
        pz5.c.Companion.getClass();
        i1VarB.b("Authorization", pz5.b.a(accessToken));
        return new j1(i1VarB);
    }

    public static final com.bumptech.glide.j b(com.bumptech.glide.j jVar, Function1 function1, Function0 function0) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        if (function1 == null && function0 == null) {
            return jVar;
        }
        com.bumptech.glide.j jVarN = jVar.N(new qz0.e(function1, function0, 1));
        Intrinsics.h(jVarN);
        return jVarN;
    }

    public static final boolean c(l71.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return !(dVar.a() == UserCompanyRegion.ES);
    }

    public static final AppCompatActivity d(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (context instanceof AppCompatActivity) {
            return (AppCompatActivity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
        return d(baseContext);
    }

    public static final int e(String roomOccupancy) {
        Integer numM;
        Intrinsics.checkNotNullParameter(roomOccupancy, "roomOccupancy");
        List listN0 = d0.n0(roomOccupancy, new String[]{","}, 0, 6);
        ArrayList<List> arrayList = new ArrayList(w.t(listN0, 10));
        Iterator it8 = listN0.iterator();
        while (it8.hasNext()) {
            arrayList.add(d0.n0((String) it8.next(), new String[]{"-"}, 0, 6));
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (List list : arrayList) {
            String str = (String) zhm.d0.d0(list);
            arrayList2.add(Integer.valueOf(zhm.d0.V(list, 1).size() + ((str == null || (numM = z.m(str)) == null) ? 0 : numM.intValue())));
        }
        return zhm.d0.T0(arrayList2);
    }

    public static final int f(zel.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        int i = vph.k.f291215a[fVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final List g(String str) {
        HotelsPropertyRoomOccupancy hotelsPropertyRoomOccupancy;
        if (str == null) {
            return zhm.f0.f322471a;
        }
        List listN0 = d0.n0(str, new String[]{","}, 0, 6);
        ArrayList<List> arrayList = new ArrayList(w.t(listN0, 10));
        Iterator it8 = listN0.iterator();
        while (it8.hasNext()) {
            arrayList.add(d0.n0((String) it8.next(), new String[]{"-"}, 0, 6));
        }
        ArrayList arrayList2 = new ArrayList();
        for (List list : arrayList) {
            String str2 = (String) zhm.d0.d0(list);
            if (str2 != null) {
                int i = Integer.parseInt(str2);
                List listV = zhm.d0.V(list, 1);
                ArrayList arrayList3 = new ArrayList(w.t(listV, 10));
                Iterator it9 = listV.iterator();
                while (it9.hasNext()) {
                    arrayList3.add(new Child(Integer.valueOf(Integer.parseInt((String) it9.next()))));
                }
                hotelsPropertyRoomOccupancy = new HotelsPropertyRoomOccupancy(i, arrayList3);
            } else {
                hotelsPropertyRoomOccupancy = null;
            }
            if (hotelsPropertyRoomOccupancy != null) {
                arrayList2.add(hotelsPropertyRoomOccupancy);
            }
        }
        return arrayList2;
    }

    public static final boolean h(Throwable th10) {
        return th10 instanceof HttpException ? ((HttpException) th10).code() == 410 : (th10 instanceof ServerErrorException) && ((ServerErrorException) th10).e == 410;
    }

    public static final boolean i(do3.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        int i = yfb.a.f313205a[gVar.ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean j(cjl.b bVar, cjl.b bVar2) {
        return bVar == bVar2 || bVar == null || bVar2 == null;
    }

    public static final Clause k(b93.b bVar, String str) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        if (str != null) {
            String str2 = !d0.W(str) ? str : null;
            if (str2 != null) {
                return new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 124);
            }
        }
        Integer numN = n(bVar);
        if (numN != null) {
            return new TextLocalisedClause(numN.intValue(), null, null, 10);
        }
        return null;
    }

    public static Clause l(f0 f0Var) {
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        return f0Var.G == l0.MEXICO_MCY ? new TextLocalisedClause(R$string.card_label_mexico_mcy, null, null, 10) : !d0.W(f0Var.I) ? new TextClause(f0Var.I, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : k(f0Var.f150114h.f13639a, f0Var.f150111b);
    }

    public static final Integer m(yhm.r rVar, boolean z, Boolean bool) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        b93.b bVar = (b93.b) rVar.f314201a;
        j0 j0Var = (j0) rVar.f314202b;
        l0 l0Var = (l0) rVar.f314203c;
        if (l.o(bVar) || l0Var == l0.CREDIT) {
            return Integer.valueOf(R$string.card_name_prefix_credit);
        }
        if (l.r(bVar) || j0Var == j0.PRO) {
            return Integer.valueOf(R$string.card_name_prefix_pro);
        }
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        b93.b.Companion.getClass();
        if (!bVar.equals(b93.b.U1) && !bVar.equals(b93.b.V1) && !bVar.equals(b93.b.W1) && !bVar.equals(b93.b.X1)) {
            b93.b bVar2 = b93.b.Y1;
            if (!bVar.equals(bVar2) && !bVar.equals(bVar2) && !bVar.equals(b93.b.Z1) && !bVar.equals(b93.b.f13535a2) && !bVar.equals(b93.b.f13541b2) && !bVar.equals(b93.b.c2) && !bVar.equals(b93.b.f13548d2) && !bVar.equals(b93.b.e2) && !bVar.equals(b93.b.f13555f2) && !bVar.equals(b93.b.T1) && !bVar.equals(b93.b.f13559g2) && !bVar.equals(b93.b.j2) && !bVar.equals(b93.b.p2) && !bVar.equals(b93.b.f13574m2) && !bVar.equals(b93.b.i2) && !bVar.equals(b93.b.l2) && !bVar.equals(b93.b.r2) && !bVar.equals(b93.b.f13583o2) && !bVar.equals(b93.b.h2) && !bVar.equals(b93.b.f13570k2) && !bVar.equals(b93.b.f13589q2) && !bVar.equals(b93.b.f13579n2) && !bVar.equals(b93.b.E2) && !bVar.equals(b93.b.s2) && !bVar.equals(b93.b.t2) && !bVar.equals(b93.b.u2) && !bVar.equals(b93.b.v2) && !bVar.equals(b93.b.f13606w2) && !bVar.equals(b93.b.f13610x2) && !bVar.equals(b93.b.y2) && !bVar.equals(b93.b.f13614z2) && !bVar.equals(b93.b.A2) && !bVar.equals(b93.b.B2) && !bVar.equals(b93.b.C2) && !bVar.equals(b93.b.D2) && j0Var != j0.JOINT_ACCOUNT) {
                l0 l0Var2 = l0.BRAZIL_GLOBAL;
                if (l0Var == l0Var2 && z) {
                    return Integer.valueOf(R$string.card_name_prefix_global);
                }
                if (l0Var == l0Var2) {
                    return Integer.valueOf(R$string.card_name_prefix_global_debit);
                }
                l0 l0Var3 = l0.BRAZIL_LOCAL;
                if (l0Var == l0Var3 && Intrinsics.f(bool, Boolean.FALSE)) {
                    return Integer.valueOf(R$string.card_name_prefix_local_debit);
                }
                if (l0Var == l0Var3 && Intrinsics.f(bool, Boolean.TRUE)) {
                    return Integer.valueOf(R$string.card_name_prefix_combo);
                }
                if (l0Var == l0.INDIA_GLOBAL) {
                    return Integer.valueOf(R$string.card_name_prefix_multi_currency);
                }
                return null;
            }
        }
        return Integer.valueOf(R$string.card_name_prefix_joint);
    }

    public static final Integer n(b93.b bVar) {
        if (bVar == null) {
            return null;
        }
        b93.b.Companion.getClass();
        if (bVar.equals(b93.b.f13538b) || bVar.equals(b93.b.f13543c) || bVar.equals(b93.b.H1) || bVar.equals(b93.b.K0) || bVar.equals(b93.b.f13601v0) || bVar.equals(b93.b.l0) || bVar.equals(b93.b.J2)) {
            return Integer.valueOf(R$string.card_name_standard);
        }
        if (bVar.equals(b93.b.z)) {
            return Integer.valueOf(R$string.card_name_standard);
        }
        if (bVar.equals(b93.b.f13580n4)) {
            return Integer.valueOf(R$string.card_name_copper);
        }
        if (Intrinsics.f(bVar, b93.b.f13584o4)) {
            return Integer.valueOf(R$string.card_name_copper_black);
        }
        if (Intrinsics.f(bVar, b93.b.d) || Intrinsics.f(bVar, b93.b.P1) || Intrinsics.f(bVar, b93.b.N0) || Intrinsics.f(bVar, b93.b.u2) || Intrinsics.f(bVar, b93.b.f13581o0)) {
            return Integer.valueOf(R$string.card_name_rose_gold);
        }
        if (Intrinsics.f(bVar, b93.b.f13587p4)) {
            return Integer.valueOf(R$string.card_name_rose_gold_black);
        }
        if (Intrinsics.f(bVar, b93.b.e) || Intrinsics.f(bVar, b93.b.Q1)) {
            return Integer.valueOf(R$string.card_name_silver);
        }
        if (Intrinsics.f(bVar, b93.b.f13591q4)) {
            return Integer.valueOf(R$string.card_name_black_silver);
        }
        if (Intrinsics.f(bVar, b93.b.f) || Intrinsics.f(bVar, b93.b.R1) || Intrinsics.f(bVar, b93.b.L2) || Intrinsics.f(bVar, b93.b.M0) || Intrinsics.f(bVar, b93.b.t2) || Intrinsics.f(bVar, b93.b.f13577n0)) {
            return Integer.valueOf(R$string.card_name_space_grey);
        }
        if (Intrinsics.f(bVar, b93.b.f13561h) || Intrinsics.f(bVar, b93.b.M2) || Intrinsics.f(bVar, b93.b.O0) || Intrinsics.f(bVar, b93.b.v2) || Intrinsics.f(bVar, b93.b.p0)) {
            return Integer.valueOf(R$string.card_name_lavender);
        }
        if (Intrinsics.f(bVar, b93.b.Q)) {
            return Integer.valueOf(R$string.card_name_ezylet);
        }
        if (Intrinsics.f(bVar, b93.b.R)) {
            return Integer.valueOf(R$string.card_name_primetel);
        }
        if (Intrinsics.f(bVar, b93.b.f13575m4)) {
            return Integer.valueOf(R$string.card_name_booking);
        }
        if (Intrinsics.f(bVar, b93.b.S)) {
            return Integer.valueOf(R$string.card_name_hellas_direct);
        }
        if (Intrinsics.f(bVar, b93.b.f13557g) || Intrinsics.f(bVar, b93.b.O1) || Intrinsics.f(bVar, b93.b.N2) || Intrinsics.f(bVar, b93.b.Q0) || Intrinsics.f(bVar, b93.b.R0) || Intrinsics.f(bVar, b93.b.f13610x2) || Intrinsics.f(bVar, b93.b.f13593r0)) {
            return Integer.valueOf(R$string.card_name_metal_black);
        }
        if (Intrinsics.f(bVar, b93.b.v) || Intrinsics.f(bVar, b93.b.M1) || Intrinsics.f(bVar, b93.b.Q2) || Intrinsics.f(bVar, b93.b.S0) || Intrinsics.f(bVar, b93.b.y2) || Intrinsics.f(bVar, b93.b.f13595s0)) {
            return Integer.valueOf(R$string.card_name_metal_rose_gold);
        }
        if (Intrinsics.f(bVar, b93.b.f13611y) || Intrinsics.f(bVar, b93.b.N1) || Intrinsics.f(bVar, b93.b.O2) || Intrinsics.f(bVar, b93.b.P0) || Intrinsics.f(bVar, b93.b.f13606w2) || Intrinsics.f(bVar, b93.b.q0)) {
            return Integer.valueOf(R$string.card_name_metal_gold);
        }
        if (Intrinsics.f(bVar, b93.b.f13604w) || Intrinsics.f(bVar, b93.b.K1)) {
            return Integer.valueOf(R$string.card_name_metal_silver);
        }
        if (Intrinsics.f(bVar, b93.b.f13607x) || Intrinsics.f(bVar, b93.b.L1) || Intrinsics.f(bVar, b93.b.P2) || Intrinsics.f(bVar, b93.b.U0) || Intrinsics.f(bVar, b93.b.A2) || Intrinsics.f(bVar, b93.b.u0)) {
            return Integer.valueOf(R$string.card_name_metal_space_grey);
        }
        if (Intrinsics.f(bVar, b93.b.i) || Intrinsics.f(bVar, b93.b.T0) || Intrinsics.f(bVar, b93.b.f13614z2) || Intrinsics.f(bVar, b93.b.f13598t0) || Intrinsics.f(bVar, b93.b.R2)) {
            return Integer.valueOf(R$string.card_name_metal_lavender);
        }
        if (Intrinsics.f(bVar, b93.b.G0) || Intrinsics.f(bVar, b93.b.B2) || Intrinsics.f(bVar, b93.b.u)) {
            return Integer.valueOf(R$string.card_name_ultra);
        }
        if (Intrinsics.f(bVar, b93.b.C2) || Intrinsics.f(bVar, b93.b.I0) || Intrinsics.f(bVar, b93.b.A)) {
            return Integer.valueOf(R$string.card_name_private_original);
        }
        if (Intrinsics.f(bVar, b93.b.H0) || Intrinsics.f(bVar, b93.b.B)) {
            return Integer.valueOf(R$string.card_name_private_exclusive);
        }
        if (Intrinsics.f(bVar, b93.b.W) || Intrinsics.f(bVar, b93.b.X) || Intrinsics.f(bVar, b93.b.Y) || Intrinsics.f(bVar, b93.b.Z) || Intrinsics.f(bVar, b93.b.f13534a0) || Intrinsics.f(bVar, b93.b.c0) || Intrinsics.f(bVar, b93.b.f13539b0) || Intrinsics.f(bVar, b93.b.f13546d0) || Intrinsics.f(bVar, b93.b.f13551e0) || Intrinsics.f(bVar, b93.b.g0) || Intrinsics.f(bVar, b93.b.f13562h0) || Intrinsics.f(bVar, b93.b.y0) || Intrinsics.f(bVar, b93.b.A0) || Intrinsics.f(bVar, b93.b.f13605w0) || Intrinsics.f(bVar, b93.b.D0) || Intrinsics.f(bVar, b93.b.V0) || Intrinsics.f(bVar, b93.b.W0) || Intrinsics.f(bVar, b93.b.X0) || Intrinsics.f(bVar, b93.b.Y0) || Intrinsics.f(bVar, b93.b.Z0) || Intrinsics.f(bVar, b93.b.a1) || Intrinsics.f(bVar, b93.b.f13540b1) || Intrinsics.f(bVar, b93.b.f13544c1) || Intrinsics.f(bVar, b93.b.S2) || Intrinsics.f(bVar, b93.b.T2) || Intrinsics.f(bVar, b93.b.U2) || Intrinsics.f(bVar, b93.b.V2) || Intrinsics.f(bVar, b93.b.W2) || Intrinsics.f(bVar, b93.b.X2) || Intrinsics.f(bVar, b93.b.Y2) || Intrinsics.f(bVar, b93.b.Z2) || Intrinsics.f(bVar, b93.b.f13536a3) || Intrinsics.f(bVar, b93.b.f13542b3)) {
            return Integer.valueOf(R$string.card_name_virtual_standard);
        }
        if (Intrinsics.f(bVar, b93.b.f0)) {
            return Integer.valueOf(R$string.card_name_dufry_red_virtual);
        }
        if (Intrinsics.f(bVar, b93.b.i0) || Intrinsics.f(bVar, b93.b.c3) || Intrinsics.f(bVar, b93.b.z0) || Intrinsics.f(bVar, b93.b.B0) || Intrinsics.f(bVar, b93.b.f13608x0) || Intrinsics.f(bVar, b93.b.E0) || Intrinsics.f(bVar, b93.b.E2)) {
            return Integer.valueOf(R$string.card_name_disposable);
        }
        if (Intrinsics.f(bVar, b93.b.f13573m) || Intrinsics.f(bVar, b93.b.f13576n)) {
            return Integer.valueOf(R$string.card_name_charity);
        }
        if (Intrinsics.f(bVar, b93.b.f13588q) || Intrinsics.f(bVar, b93.b.K2) || Intrinsics.f(bVar, b93.b.L0) || Intrinsics.f(bVar, b93.b.s2) || Intrinsics.f(bVar, b93.b.m0)) {
            return Integer.valueOf(R$string.card_name_magenta);
        }
        if (Intrinsics.f(bVar, b93.b.f13563h1) || Intrinsics.f(bVar, b93.b.f13569k1) || Intrinsics.f(bVar, b93.b.f13554f1) || Intrinsics.f(bVar, b93.b.f13552e1) || Intrinsics.f(bVar, b93.b.f13558g1) || Intrinsics.f(bVar, b93.b.f13547d1)) {
            return Integer.valueOf(R$string.card_name_flag);
        }
        if (Intrinsics.f(bVar, b93.b.f13592r)) {
            return Integer.valueOf(R$string.card_name_whale);
        }
        if (Intrinsics.f(bVar, b93.b.f13594s)) {
            return Integer.valueOf(R$string.card_name_lambo);
        }
        if (Intrinsics.f(bVar, b93.b.f13597t)) {
            return Integer.valueOf(R$string.card_name_moon);
        }
        if (Intrinsics.f(bVar, b93.b.o)) {
            return Integer.valueOf(R$string.card_name_daffodil);
        }
        if (Intrinsics.f(bVar, b93.b.f13585p)) {
            return Integer.valueOf(R$string.card_name_poppy);
        }
        if (Intrinsics.f(bVar, b93.b.f13566j)) {
            return Integer.valueOf(R$string.card_name_glow);
        }
        if (Intrinsics.f(bVar, b93.b.D2) || Intrinsics.f(bVar, b93.b.k)) {
            return Integer.valueOf(R$string.card_name_metal_gold24k);
        }
        if (Intrinsics.f(bVar, b93.b.f13572l)) {
            return Integer.valueOf(R$string.card_name_sunset);
        }
        if (Intrinsics.f(bVar, b93.b.f13578n1)) {
            return Integer.valueOf(R$string.card_name_chromatic);
        }
        if (Intrinsics.f(bVar, b93.b.f13582o1)) {
            return Integer.valueOf(R$string.card_name_sdmn_metal);
        }
        if (Intrinsics.f(bVar, b93.b.f13586p1)) {
            return Integer.valueOf(R$string.card_name_sdmn_space_grey);
        }
        if (Intrinsics.f(bVar, b93.b.f13596s1)) {
            return Integer.valueOf(R$string.card_name_dufry_original);
        }
        if (Intrinsics.f(bVar, b93.b.f13599t1)) {
            return Integer.valueOf(R$string.card_name_dufry_metal);
        }
        if (!Intrinsics.f(bVar, b93.b.C) && !Intrinsics.f(bVar, b93.b.D) && !Intrinsics.f(bVar, b93.b.E) && !Intrinsics.f(bVar, b93.b.F)) {
            if (Intrinsics.f(bVar, b93.b.G)) {
                return Integer.valueOf(R$string.card_name_junior_glow);
            }
            if (Intrinsics.f(bVar, b93.b.H) || Intrinsics.f(bVar, b93.b.I) || Intrinsics.f(bVar, b93.b.J)) {
                return Integer.valueOf(R$string.card_name_rev_u18_physical);
            }
            if (Intrinsics.f(bVar, b93.b.K) || Intrinsics.f(bVar, b93.b.L) || Intrinsics.f(bVar, b93.b.M) || Intrinsics.f(bVar, b93.b.N) || Intrinsics.f(bVar, b93.b.O) || Intrinsics.f(bVar, b93.b.P)) {
                return Integer.valueOf(R$string.card_shortname_u18_virtual);
            }
            if (Intrinsics.f(bVar, b93.b.T1)) {
                return Integer.valueOf(R$string.card_name_standard);
            }
            if (Intrinsics.f(bVar, b93.b.U1) || Intrinsics.f(bVar, b93.b.V1) || Intrinsics.f(bVar, b93.b.W1) || Intrinsics.f(bVar, b93.b.X1) || Intrinsics.f(bVar, b93.b.Y1) || Intrinsics.f(bVar, b93.b.Z1) || Intrinsics.f(bVar, b93.b.f13535a2) || Intrinsics.f(bVar, b93.b.f13541b2) || Intrinsics.f(bVar, b93.b.c2) || Intrinsics.f(bVar, b93.b.f13548d2) || Intrinsics.f(bVar, b93.b.e2) || Intrinsics.f(bVar, b93.b.f13555f2)) {
                return Integer.valueOf(R$string.card_name_virtual_standard);
            }
            if (Intrinsics.f(bVar, b93.b.f13559g2) || Intrinsics.f(bVar, b93.b.j2) || Intrinsics.f(bVar, b93.b.f13574m2) || Intrinsics.f(bVar, b93.b.p2)) {
                return Integer.valueOf(R$string.card_name_joint_infinity_duo_left);
            }
            if (Intrinsics.f(bVar, b93.b.h2) || Intrinsics.f(bVar, b93.b.f13570k2) || Intrinsics.f(bVar, b93.b.f13579n2) || Intrinsics.f(bVar, b93.b.f13589q2)) {
                return Integer.valueOf(R$string.card_name_joint_infinity_duo_right);
            }
            if (Intrinsics.f(bVar, b93.b.i2) || Intrinsics.f(bVar, b93.b.l2) || Intrinsics.f(bVar, b93.b.f13583o2) || Intrinsics.f(bVar, b93.b.r2)) {
                return Integer.valueOf(R$string.card_name_joint_infinity_solo);
            }
            if (Intrinsics.f(bVar, b93.b.C0)) {
                return Integer.valueOf(R$string.card_name_standard);
            }
            if (Intrinsics.f(bVar, b93.b.J0)) {
                return Integer.valueOf(R$string.card_name_space_grey);
            }
            if (Intrinsics.f(bVar, b93.b.F0)) {
                return Integer.valueOf(R$string.card_name_metal);
            }
            if (Intrinsics.f(bVar, b93.b.j0)) {
                return Integer.valueOf(R$string.card_name_black);
            }
            if (Intrinsics.f(bVar, b93.b.f13568k0)) {
                return Integer.valueOf(R$string.card_name_white);
            }
            if (Intrinsics.f(bVar, b93.b.S1)) {
                return Integer.valueOf(R$string.card_name_prefix_pay_later);
            }
            if (Intrinsics.f(bVar, b93.b.f13602v1)) {
                return Integer.valueOf(R$string.card_name_clear_sky);
            }
            if (Intrinsics.f(bVar, b93.b.f13609x1)) {
                return Integer.valueOf(R$string.card_name_paris_olympics);
            }
            if (Intrinsics.f(bVar, b93.b.F2) || Intrinsics.f(bVar, b93.b.G2) || Intrinsics.f(bVar, b93.b.H2)) {
                return Integer.valueOf(R$string.card_name_crypto);
            }
            if (Intrinsics.f(bVar, b93.b.I2)) {
                return Integer.valueOf(R$string.card_name_crypto_blockchain);
            }
            if (Intrinsics.f(bVar, b93.b.A1) || Intrinsics.f(bVar, b93.b.f13612y1)) {
                return Integer.valueOf(R$string.card_name_revolutionary);
            }
            if (Intrinsics.f(bVar, b93.b.f13549d3)) {
                return Integer.valueOf(R$string.card_name_aries);
            }
            if (Intrinsics.f(bVar, b93.b.f13553e3)) {
                return Integer.valueOf(R$string.card_name_taurus);
            }
            if (Intrinsics.f(bVar, b93.b.f13556f3)) {
                return Integer.valueOf(R$string.card_name_gemini);
            }
            if (Intrinsics.f(bVar, b93.b.g3)) {
                return Integer.valueOf(R$string.card_name_leo);
            }
            if (Intrinsics.f(bVar, b93.b.h3)) {
                return Integer.valueOf(R$string.card_name_capricorn);
            }
            if (Intrinsics.f(bVar, b93.b.i3)) {
                return Integer.valueOf(R$string.card_name_libra);
            }
            if (Intrinsics.f(bVar, b93.b.j3)) {
                return Integer.valueOf(R$string.card_name_cancer);
            }
            if (Intrinsics.f(bVar, b93.b.k3)) {
                return Integer.valueOf(R$string.card_name_aquarius);
            }
            if (Intrinsics.f(bVar, b93.b.l3)) {
                return Integer.valueOf(R$string.card_name_sagittarius);
            }
            if (Intrinsics.f(bVar, b93.b.m3)) {
                return Integer.valueOf(R$string.card_name_scorpio);
            }
            if (Intrinsics.f(bVar, b93.b.n3)) {
                return Integer.valueOf(R$string.card_name_virgo);
            }
            if (Intrinsics.f(bVar, b93.b.o3)) {
                return Integer.valueOf(R$string.card_name_pisces);
            }
            if (Intrinsics.f(bVar, b93.b.p3)) {
                return Integer.valueOf(R$string.card_name_virtual_clocktower);
            }
            if (Intrinsics.f(bVar, b93.b.f13590q3)) {
                return Integer.valueOf(R$string.card_name_virtual_liberty);
            }
            if (Intrinsics.f(bVar, b93.b.r3)) {
                return Integer.valueOf(R$string.card_name_virtual_underground);
            }
            if (Intrinsics.f(bVar, b93.b.s3)) {
                return Integer.valueOf(R$string.card_name_virtual_tower);
            }
            if (Intrinsics.f(bVar, b93.b.t3)) {
                return Integer.valueOf(R$string.card_name_virtual_voltage);
            }
            if (Intrinsics.f(bVar, b93.b.f13600u3)) {
                return Integer.valueOf(R$string.card_name_virtual_pagoda);
            }
            if (Intrinsics.f(bVar, b93.b.f13603v3)) {
                return Integer.valueOf(R$string.card_name_virtual_skyscraper);
            }
            if (Intrinsics.f(bVar, b93.b.w3)) {
                return Integer.valueOf(R$string.card_name_virtual_transit);
            }
            if (Intrinsics.f(bVar, b93.b.x3)) {
                return Integer.valueOf(R$string.card_name_virtual_concrete);
            }
            if (Intrinsics.f(bVar, b93.b.f13613y3)) {
                return Integer.valueOf(R$string.card_name_virtual_overhead);
            }
            if (Intrinsics.f(bVar, b93.b.z3)) {
                return Integer.valueOf(R$string.card_name_virtual_palace);
            }
            if (Intrinsics.f(bVar, b93.b.A3)) {
                return Integer.valueOf(R$string.card_name_virtual_rainbow);
            }
            if (Intrinsics.f(bVar, b93.b.B3)) {
                return Integer.valueOf(R$string.card_name_virtual_rainbow2);
            }
            if (Intrinsics.f(bVar, b93.b.C3)) {
                return Integer.valueOf(R$string.card_name_virtual_lesbian);
            }
            if (Intrinsics.f(bVar, b93.b.D3)) {
                return Integer.valueOf(R$string.card_name_virtual_transgender);
            }
            if (Intrinsics.f(bVar, b93.b.E3)) {
                return Integer.valueOf(R$string.card_name_virtual_bisexual);
            }
            if (Intrinsics.f(bVar, b93.b.F3)) {
                return Integer.valueOf(R$string.card_name_virtual_pansexual);
            }
            if (Intrinsics.f(bVar, b93.b.G3)) {
                return Integer.valueOf(R$string.card_name_virtual_nonbinary);
            }
            if (Intrinsics.f(bVar, b93.b.H3)) {
                return Integer.valueOf(R$string.card_name_virtual_genderqueer);
            }
            if (Intrinsics.f(bVar, b93.b.I3)) {
                return Integer.valueOf(R$string.card_name_virtual_intersex);
            }
            if (Intrinsics.f(bVar, b93.b.J3)) {
                return Integer.valueOf(R$string.card_name_virtual_genderfluid);
            }
            if (Intrinsics.f(bVar, b93.b.K3)) {
                return Integer.valueOf(R$string.card_name_virtual_aromantic);
            }
            if (Intrinsics.f(bVar, b93.b.L3)) {
                return Integer.valueOf(R$string.card_name_virtual_asexual);
            }
            if (Intrinsics.f(bVar, b93.b.M3)) {
                return Integer.valueOf(R$string.card_name_virtual_polysexual);
            }
            if (Intrinsics.f(bVar, b93.b.N3)) {
                return Integer.valueOf(R$string.card_name_virtual_neutrois);
            }
            if (Intrinsics.f(bVar, b93.b.O3)) {
                return Integer.valueOf(R$string.card_name_virtual_androgyne);
            }
            if (Intrinsics.f(bVar, b93.b.P3)) {
                return Integer.valueOf(R$string.card_name_virtual_bear);
            }
            if (Intrinsics.f(bVar, b93.b.Q3)) {
                return Integer.valueOf(R$string.card_name_virtual_agender);
            }
            if (Intrinsics.f(bVar, b93.b.R3)) {
                return Integer.valueOf(R$string.card_name_virtual_light01);
            }
            if (Intrinsics.f(bVar, b93.b.S3)) {
                return Integer.valueOf(R$string.card_name_virtual_light02);
            }
            if (Intrinsics.f(bVar, b93.b.T3)) {
                return Integer.valueOf(R$string.card_name_virtual_light03);
            }
            if (Intrinsics.f(bVar, b93.b.U3)) {
                return Integer.valueOf(R$string.card_name_virtual_light04);
            }
            if (Intrinsics.f(bVar, b93.b.V3)) {
                return Integer.valueOf(R$string.card_name_virtual_light05);
            }
            if (Intrinsics.f(bVar, b93.b.W3)) {
                return Integer.valueOf(R$string.card_name_virtual_light06);
            }
            if (Intrinsics.f(bVar, b93.b.X3)) {
                return Integer.valueOf(R$string.card_name_virtual_light07);
            }
            if (Intrinsics.f(bVar, b93.b.Y3)) {
                return Integer.valueOf(R$string.card_name_virtual_light08);
            }
            if (Intrinsics.f(bVar, b93.b.Z3)) {
                return Integer.valueOf(R$string.card_name_virtual_light09);
            }
            if (Intrinsics.f(bVar, b93.b.f13537a4)) {
                return Integer.valueOf(R$string.card_name_virtual_light10);
            }
            if (Intrinsics.f(bVar, b93.b.b4)) {
                return Integer.valueOf(R$string.card_name_virtual_light11);
            }
            if (Intrinsics.f(bVar, b93.b.f13545c4)) {
                return Integer.valueOf(R$string.card_name_virtual_pug);
            }
            if (Intrinsics.f(bVar, b93.b.f13550d4)) {
                return Integer.valueOf(R$string.card_name_virtual_bichon);
            }
            if (Intrinsics.f(bVar, b93.b.e4)) {
                return Integer.valueOf(R$string.card_name_virtual_shiba_inu);
            }
            if (Intrinsics.f(bVar, b93.b.f4)) {
                return Integer.valueOf(R$string.card_name_virtual_corgi);
            }
            if (Intrinsics.f(bVar, b93.b.f13560g4)) {
                return Integer.valueOf(R$string.card_name_virtual_dachshund);
            }
            if (Intrinsics.f(bVar, b93.b.f13564h4)) {
                return Integer.valueOf(R$string.card_name_virtual_french_bull);
            }
            if (Intrinsics.f(bVar, b93.b.f13565i4)) {
                return Integer.valueOf(R$string.card_name_virtual_golden_ret);
            }
            if (Intrinsics.f(bVar, b93.b.f13567j4)) {
                return Integer.valueOf(R$string.card_name_virtual_greyhound);
            }
            if (Intrinsics.f(bVar, b93.b.f13571k4)) {
                return Integer.valueOf(R$string.card_name_virtual_boston_t);
            }
            if (Intrinsics.f(bVar, b93.b.l4)) {
                return Integer.valueOf(R$string.card_name_virtual_labradoodle);
            }
            if (Intrinsics.f(bVar, b93.b.C1)) {
                return Integer.valueOf(R$string.card_name_chrome_metal);
            }
            return null;
        }
        return Integer.valueOf(R$string.card_name_junior_original);
    }

    public static final HtmlClause o(HtmlStringItem htmlStringItem, n3 n3Var) {
        Intrinsics.checkNotNullParameter(htmlStringItem, "<this>");
        return new HtmlClause(3, 12, (Integer) null, n3Var, htmlStringItem.f63481a);
    }

    public static final k p(f24.j jVar) {
        a1 a1VarA;
        au3.h hVar;
        au3.h fVar = null;
        if (jVar instanceof i) {
            List<f24.j> items = ((i) jVar).getItems();
            ArrayList arrayList = new ArrayList();
            for (f24.j jVar2 : items) {
                k kVarP = jVar2 != null ? p(jVar2) : null;
                if (kVarP != null) {
                    arrayList.add(kVarP);
                }
            }
            return new au3.j(arrayList);
        }
        if (!(jVar instanceof f24.h)) {
            throw new NoWhenBranchMatchedException();
        }
        f24.h hVar2 = (f24.h) jVar;
        String strD = hVar2.getTitle();
        String strB = hVar2.getDescription();
        String strC = hVar2.getIcon();
        if (strC != null) {
            a1.Companion.getClass();
            a1VarA = y0.a(strC);
        } else {
            a1VarA = null;
        }
        g gVarA = hVar2.getAction();
        if (gVarA != null) {
            if (gVarA instanceof e) {
                fVar = new au3.f(((e) gVarA).getUrl());
            } else {
                if (gVarA instanceof f24.d) {
                    hVar = au3.e.f9474a;
                } else {
                    if (!(gVarA instanceof f24.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hVar = au3.g.f9476a;
                }
                fVar = hVar;
            }
        }
        return new au3.i(strD, strB, a1VarA, fVar);
    }

    public static final au3.l q(f24.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        String strA = kVar.getIllustration();
        String strD = kVar.getTitle();
        String strC = kVar.getSubtitle();
        List<f24.j> listB = kVar.getItems();
        ArrayList arrayList = new ArrayList();
        for (f24.j jVar : listB) {
            k kVarP = jVar != null ? p(jVar) : null;
            if (kVarP != null) {
                arrayList.add(kVarP);
            }
        }
        return new au3.l(strA, strD, strC, arrayList);
    }

    public static final CreditCardDirectDebitMandate r(ac5.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return new CreditCardDirectDebitMandate(eVar.getMandateId(), nb5.g.valueOf(eVar.getAccountNumberFormat()), eVar.getAccountNumber(), eVar.getBankName(), eVar.getSelected());
    }

    public static final CryptoWithdrawLimits s(dp5.d0 d0Var) {
        o oVar;
        o oVar2;
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        d dVarO = mo3.a.o(d0Var.f116738a);
        d dVarO2 = mo3.a.o(d0Var.f116739b);
        d dVarO3 = mo3.a.o(d0Var.f116740c);
        d dVarO4 = mo3.a.o(d0Var.d);
        String str = d0Var.e;
        if (str != null) {
            o[] oVarArrValues = o.values();
            int length = oVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    oVar2 = null;
                    break;
                }
                oVar2 = oVarArrValues[i];
                if (a0.z(oVar2.name(), str, true)) {
                    break;
                }
                i++;
            }
            if (oVar2 == null) {
                oVar2 = o.UNKNOWN;
            }
            oVar = oVar2;
        } else {
            oVar = null;
        }
        Long l2 = d0Var.f;
        jo3.a aVar = d0Var.f116741g;
        return new CryptoWithdrawLimits(dVarO, dVarO2, dVarO3, dVarO4, oVar, l2, aVar != null ? mo3.a.o(aVar) : null);
    }

    public static final CryptoWithdrawLimits t(ep5.c cVar) {
        o oVar;
        o oVar2;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        d dVarO = mo3.a.o(cVar.f128078a);
        d dVarO2 = mo3.a.o(cVar.f128079b);
        d dVarO3 = mo3.a.o(cVar.f128080c);
        d dVarO4 = mo3.a.o(cVar.d);
        String str = cVar.e;
        if (str != null) {
            o[] oVarArrValues = o.values();
            int length = oVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    oVar2 = null;
                    break;
                }
                oVar2 = oVarArrValues[i];
                if (a0.z(oVar2.name(), str, true)) {
                    break;
                }
                i++;
            }
            if (oVar2 == null) {
                oVar2 = o.UNKNOWN;
            }
            oVar = oVar2;
        } else {
            oVar = null;
        }
        Long l2 = cVar.f;
        jo3.a aVar = cVar.f128081g;
        return new CryptoWithdrawLimits(dVarO, dVarO2, dVarO3, dVarO4, oVar, l2, aVar != null ? mo3.a.o(aVar) : null);
    }

    public static final HotelsLocation u(pfi.a aVar) {
        ffi.a aVar2;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String strD = aVar.getId();
        String strH = aVar.getType();
        ffi.a[] aVarArrValues = ffi.a.values();
        int length = aVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                aVar2 = null;
                break;
            }
            aVar2 = aVarArrValues[i];
            if (a0.z(aVar2.name(), strH, true)) {
                break;
            }
            i++;
        }
        if (aVar2 == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Unknown HotelsLocation type ", aVar.getType()));
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
            aVar2 = ffi.a.UNKNOWN;
        }
        ffi.a aVar3 = aVar2;
        String strF = aVar.getName();
        String strC = aVar.getDescription();
        String strE = aVar.getImageUrl();
        ofi.g gVarB = aVar.getCountry();
        Object obj2 = lfi.a.f194929a;
        Intrinsics.checkNotNullParameter(gVarB, "<this>");
        Country country = new Country(gVarB.getCode(), gVarB.getName());
        Integer numG = aVar.getPropertyCount();
        ofi.f fVarA = aVar.getCoordinates();
        Intrinsics.checkNotNullParameter(fVarA, "<this>");
        double dB = fVarA.getLatitude();
        double dC = fVarA.getLongitude();
        rfi.b bVarA = fVarA.getAccuracyRadius();
        return new HotelsLocation(strD, aVar3, strF, strC, strE, country, numG, new Coordinates(dB, dC, bVarA != null ? lfi.a.b(bVarA) : null), aVar.getIsDistrict());
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public static final Distance v(xei.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return new Distance(dVar.getValue(), (ufi.a) u1.u(dVar.getUnit(), lfi.a.f194930b));
    }

    public static final HotelsPointsRedeemOption w(xei.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        String strE = hVar.getToken();
        RevPoints revPointsA = qvb.a.a(hVar.getPoints());
        d dVarU = boh.f.u(hVar.getDiscount());
        Double dC = hVar.getPointsReward();
        return new HotelsPointsRedeemOption(revPointsA, dC != null ? qvb.a.a(dC.doubleValue()) : null, dVarU, strE, hVar.getQuoteToken());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    public static final HotelsPropertyGuestReviewScore x(q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        double d = qVar.getValue();
        Double dE = qVar.getValue10Scale();
        return new HotelsPropertyGuestReviewScore(d, dE != null ? dE.doubleValue() : qVar.getValue() * 2.0d, qVar.getTitle(), qVar.getName(), (ufi.c) u1.u(qVar.getCategory(), lfi.a.d));
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Map] */
    public static final OverallPrice y(xei.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        d dVarU = boh.f.u(gVar.getBasePrice());
        d dVarU2 = boh.f.u(gVar.getInclusivePrice());
        xei.f fVarE = gVar.getStrikethroughPrice();
        d dVarU3 = fVarE != null ? boh.f.u(fVarE) : null;
        List<xei.j> listC = gVar.getFees();
        ArrayList arrayList = new ArrayList(w.t(listC, 10));
        for (xei.j jVar : listC) {
            Intrinsics.checkNotNullParameter(jVar, "<this>");
            arrayList.add(new PriceFee((ufi.b) u1.u(jVar.getType(), lfi.a.e), jVar.getDescription(), jVar.getIncludedInPrice(), boh.f.u(jVar.getValue())));
        }
        xei.f fVarB = gVar.getCardOnFile();
        return new OverallPrice(dVarU, dVarU2, dVarU3, arrayList, fVarB != null ? boh.f.u(fVarB) : null);
    }

    public static final Window z(yei.a0 a0Var) {
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        String start = a0Var.getStart();
        LocalTime localTime = start != null ? new LocalTime(start) : null;
        String end2 = a0Var.getEnd();
        return new Window(localTime, end2 != null ? new LocalTime(end2) : null);
    }
}
