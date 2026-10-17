package cp5;

import an9.t;
import aw0.ma;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.transfer.models.quotes.CreditCardInterest;
import com.revolut.feature.travel.experiences.models.TravelExperiencesPointsOption;
import com.revolut.kompot.navigable.flow.FlowStep;
import dp5.b1;
import dp5.p0;
import dp5.s0;
import efm.r;
import h30.l;
import hha.h;
import hha.i;
import hha.v0;
import hha.w0;
import hl7.b3;
import hl7.e3;
import hl7.h3;
import java.math.BigDecimal;
import java.math.MathContext;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kl7.k0;
import kl7.l0;
import kl7.m0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import kotlinx.coroutines.flow.Flow;
import mp3.k;
import sd0.g;
import sd0.j;
import svi.k;
import tof.a3;
import tof.q;
import u09.v;
import vkm.q0;
import vkm.y;
import zh9.q1;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public static final boolean A(xi0.b bVar) {
        String code;
        if (bVar == null || (code = bVar.f306286a) == null) {
            return false;
        }
        g.f261792c.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        j.a();
        yf.c cVar = g.d;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        xi0.c cVar2 = (xi0.c) ((Map) cVar.b).get(code);
        return (cVar2 != null ? cVar2.f306289b : null) == xi0.e.FIAT;
    }

    public static final boolean B(a3 transaction, boolean z) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        q qVar = transaction.f272597k0;
        return (qVar == null || Intrinsics.f(qVar.f273002c, "DELETED") || transaction.j0 == null || !z) ? false : true;
    }

    public static final boolean C(xi0.b bVar) {
        String code;
        if (bVar != null && (code = bVar.f306286a) != null) {
            xi0.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(code, "code");
            if (a0.H(code, "S:", false) && !a0.y(code, ":CFD", false)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean D(xi0.b bVar) {
        String code;
        if (bVar == null || (code = bVar.f306286a) == null) {
            return false;
        }
        g.f261792c.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        j.a();
        yf.c cVar = g.d;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        xi0.c cVar2 = (xi0.c) ((Map) cVar.b).get(code);
        return cVar2 != null && cVar2.f306289b == xi0.e.CRYPTO && cVar2.k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if ((r0 != null ? r0.f306289b : null) == xi0.e.SECURITY) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean E(xi0.b r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = z(r4)
            r1 = 2
            if (r0 != 0) goto L48
            if (r4 == 0) goto L3c
            java.lang.String r0 = r4.f306286a
            if (r0 == 0) goto L3c
            sd0.g r2 = sd0.g.f261792c
            r2.getClass()
            java.lang.String r2 = "code"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            sd0.j.a()
            yf.c r3 = sd0.g.d
            r3.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.Object r2 = r3.b
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r0 = r2.get(r0)
            xi0.c r0 = (xi0.c) r0
            if (r0 == 0) goto L36
            xi0.e r0 = r0.f306289b
            goto L37
        L36:
            r0 = 0
        L37:
            xi0.e r2 = xi0.e.SECURITY
            if (r0 != r2) goto L3c
            goto L48
        L3c:
            java.lang.String r4 = r4.f306286a
            int r4 = r4.length()
            if (r1 > r4) goto L56
            r0 = 6
            if (r4 >= r0) goto L56
            goto L54
        L48:
            java.lang.String r4 = r4.f306286a
            int r4 = r4.length()
            if (r1 > r4) goto L56
            r0 = 15
            if (r4 >= r0) goto L56
        L54:
            r4 = 1
            return r4
        L56:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: cp5.d.E(xi0.b):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean F(ogd.e r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "query"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.CharSequence r7 = kotlin.text.d0.F0(r7)
            java.lang.String r7 = r7.toString()
            int r0 = r7.length()
            r1 = 1
            if (r0 != 0) goto L1b
            goto L81
        L1b:
            java.lang.String r0 = " "
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r2 = 6
            r3 = 0
            java.util.List r7 = kotlin.text.d0.n0(r7, r0, r3, r2)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r0 = r7 instanceof java.util.Collection
            if (r0 == 0) goto L38
            r2 = r7
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L38
        L36:
            r2 = r3
            goto L53
        L38:
            java.util.Iterator r2 = r7.iterator()
        L3c:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L36
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails r5 = r6.f225109a
            java.lang.String r5 = r5.f86864b
            boolean r4 = jli.g.h(r5, r4)
            if (r4 == 0) goto L3c
            r2 = r1
        L53:
            if (r0 == 0) goto L60
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L60
        L5e:
            r6 = r3
            goto L7b
        L60:
            java.util.Iterator r7 = r7.iterator()
        L64:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails r4 = r6.f225109a
            java.lang.String r4 = r4.f86865c
            boolean r0 = jli.g.h(r4, r0)
            if (r0 == 0) goto L64
            r6 = r1
        L7b:
            if (r2 != 0) goto L81
            if (r6 == 0) goto L80
            goto L81
        L80:
            return r3
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cp5.d.F(ogd.e, java.lang.String):boolean");
    }

    public static final w0 G(v0 v0Var, String value) {
        Object next;
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Iterator<E> it8 = w0.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (a0.z(((w0) next).name(), value, true)) {
                break;
            }
        }
        return (w0) next;
    }

    public static final Pair H(String str) {
        Pair pair;
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iS = d0.S(str, '/', 0, 6);
        if (iS == -1) {
            String strSubstring = str.substring(0, 3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strSubstring2 = str.substring(3, str.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            pair = new Pair(strSubstring, strSubstring2);
        } else {
            String strSubstring3 = str.substring(0, iS);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
            String strSubstring4 = str.substring(iS + 1, str.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
            pair = new Pair(strSubstring3, strSubstring4);
        }
        String str2 = (String) pair.f186385a;
        String str3 = (String) pair.f186386b;
        xi0.b.Companion.getClass();
        return new Pair(xi0.a.a(str2), xi0.a.a(str3));
    }

    public static final w0 I(v0 v0Var, String value) {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        w0 w0VarG = G(v0Var, value);
        if (w0VarG == null || w0VarG == w0.UNKNOWN) {
            return null;
        }
        return w0VarG;
    }

    public static final String J(xi0.b bVar) {
        String str;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        g gVar = g.f261792c;
        String code = bVar.f306286a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        j.a();
        com.bumptech.glide.g gVar2 = g.e;
        gVar2.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        xi0.c cVar = (xi0.c) gVar2.f26094a.get(code);
        return (cVar == null || (str = cVar.f306290c) == null) ? code : str;
    }

    public static final String K(xi0.b bVar) {
        String strA;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        g gVar = g.f261792c;
        String code = bVar.f306286a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        j.a();
        com.bumptech.glide.g gVar2 = g.e;
        gVar2.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        xi0.c cVar = (xi0.c) gVar2.f26094a.get(code);
        return (cVar == null || (strA = cVar.a()) == null) ? code : strA;
    }

    public static final ArrayList L(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<fs3.d> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (fs3.d dVar : list2) {
            arrayList.add(new k(dVar.f137578a, dVar.f137579b));
        }
        return arrayList;
    }

    public static final TravelExperiencesPointsOption M(vzf.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        RevPoints revPointsD = qvb.a.d(aVar.getPoints());
        dj0.d dVarO = mo3.a.o(aVar.getDiscount());
        String strE = aVar.getToken();
        String strC = aVar.getPointsReward();
        return new TravelExperiencesPointsOption(revPointsD, strC != null ? qvb.a.d(strC) : null, dVarO, strE, aVar.getQuoteToken());
    }

    public static final TravelExperiencesPointsOption N(wzf.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        RevPoints revPointsD = qvb.a.d(aVar.getPoints());
        dj0.d dVarV = hx7.a.v(aVar.getDiscount());
        String strE = aVar.getToken();
        String strC = aVar.getPointsReward();
        return new TravelExperiencesPointsOption(revPointsD, strC != null ? qvb.a.d(strC) : null, dVarV, strE, aVar.getQuoteToken());
    }

    public static final gk3.d O(lk3.c cVar) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        List listA = cVar.getCountries();
        if (listA != null) {
            List list = listA;
            arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(com.bumptech.glide.d.c((String) it8.next()));
            }
        } else {
            arrayList = null;
        }
        List<lk3.a> listB = cVar.getFields();
        ArrayList arrayList2 = new ArrayList(w.t(listB, 10));
        for (lk3.a aVar : listB) {
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            gk3.b bVar = gk3.c.Companion;
            String strA = aVar.getInput();
            bVar.getClass();
            arrayList2.add(new gk3.a(gk3.b.a(strA), aVar.getMinLen(), aVar.getMaxLen()));
        }
        return new gk3.d(arrayList, arrayList2);
    }

    public static final gk3.d P(lk3.d dVar) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        List listA = dVar.getCountries();
        if (listA != null) {
            List list = listA;
            arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(com.bumptech.glide.d.c((String) it8.next()));
            }
        } else {
            arrayList = null;
        }
        List<lk3.b> listB = dVar.getFields();
        ArrayList arrayList2 = new ArrayList(w.t(listB, 10));
        for (lk3.b bVar : listB) {
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            gk3.b bVar2 = gk3.c.Companion;
            String strA = bVar.getFieldType();
            bVar2.getClass();
            arrayList2.add(new gk3.a(gk3.b.a(strA), bVar.getMinLen(), bVar.getMaxLen()));
        }
        return new gk3.d(arrayList, arrayList2);
    }

    public static final i Q(h hVar, String dto) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(dto, "dto");
        if (Intrinsics.f(dto, "MONTHLY")) {
            return i.MONTHLY;
        }
        if (Intrinsics.f(dto, "ANNUAL")) {
            return i.ANNUAL;
        }
        throw new IllegalStateException(l.r("Unsupported billing period: ", dto));
    }

    public static final ArrayList R(uj1.d dVar) {
        tj1.d dVar2;
        tj1.e eVar;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        List<uj1.c> list = dVar.f280472a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (uj1.c cVar : list) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            String str = cVar.f280468a;
            String str2 = cVar.f280469b;
            tj1.e[] eVarArrValues = tj1.e.values();
            int length = eVarArrValues.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                dVar2 = null;
                if (i2 >= length) {
                    eVar = null;
                    break;
                }
                eVar = eVarArrValues[i2];
                if (a0.z(eVar.name(), str2, true)) {
                    break;
                }
                i2++;
            }
            if (eVar == null) {
                eVar = tj1.e.UNKNOWN;
            }
            String str3 = cVar.f280470c;
            tj1.d[] dVarArrValues = tj1.d.values();
            int length2 = dVarArrValues.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                tj1.d dVar3 = dVarArrValues[i];
                if (a0.z(dVar3.name(), str3, true)) {
                    dVar2 = dVar3;
                    break;
                }
                i++;
            }
            if (dVar2 == null) {
                dVar2 = tj1.d.UNKNOWN;
            }
            arrayList.add(new tj1.c(str, eVar, dVar2));
        }
        return arrayList;
    }

    public static final k0 S(b3 b3Var) {
        l0 l0Var;
        Intrinsics.checkNotNullParameter(b3Var, "<this>");
        LocalDate localDate = LocalDate.parse(b3Var.f153028a);
        Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
        LocalDate localDate2 = LocalDate.parse(b3Var.f153029b);
        Intrinsics.checkNotNullExpressionValue(localDate2, "parse(...)");
        e3 e3Var = b3Var.f153030c;
        if (e3Var != null) {
            Intrinsics.checkNotNullParameter(e3Var, "<this>");
            l0Var = new l0(e3Var.f153074a, e3Var.f153075b, e3Var.f153076c, e3Var.d, e3Var.e, e3Var.f);
        } else {
            l0Var = null;
        }
        h3 h3Var = b3Var.d;
        Intrinsics.checkNotNullParameter(h3Var, "<this>");
        return new k0(localDate, localDate2, l0Var, new m0(h3Var.f153125a, h3Var.f153126b));
    }

    public static final ko5.i T(s0 s0Var) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        dj0.d dVarO = mo3.a.o(s0Var.f116810a);
        List list = s0Var.f116811b;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(hx7.e.r((dl5.a) it8.next()));
            }
        } else {
            arrayList = null;
        }
        return new ko5.i(dVarO, arrayList);
    }

    public static final ko5.l U(b1 b1Var) {
        ko5.j jVar;
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        String str = b1Var.f116728a;
        long j2 = b1Var.f116729b;
        dp5.v0 v0Var = b1Var.f116730c;
        if (v0Var != null) {
            Intrinsics.checkNotNullParameter(v0Var, "<this>");
            xi0.a aVar = xi0.b.Companion;
            String str2 = v0Var.f116816a;
            aVar.getClass();
            jVar = new ko5.j(v0Var.f116818c, v0Var.d, xi0.a.a(str2), xi0.a.a(v0Var.f116817b));
        } else {
            jVar = null;
        }
        dj0.d dVarO = mo3.a.o(b1Var.d);
        dj0.d dVarO2 = mo3.a.o(b1Var.e);
        p0 p0Var = b1Var.f;
        Intrinsics.checkNotNullParameter(p0Var, "<this>");
        ko5.i iVarT = null;
        ko5.h hVar = new ko5.h(mo3.a.o(p0Var.f116792a), T(p0Var.f116793b));
        s0 s0Var = b1Var.f116731g;
        if (s0Var != null) {
            iVarT = T(s0Var);
        }
        return new ko5.l(str, j2, jVar, dVarO, dVarO2, hVar, iVarT, b1Var.f116732h);
    }

    public static final ncd.i V(qbd.d0 d0Var) {
        ncd.k kVar;
        double d = d0Var.f244176a;
        String str = d0Var.f244177b;
        String str2 = d0Var.f244178c;
        ncd.k[] kVarArrValues = ncd.k.values();
        int length = kVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                kVar = null;
                break;
            }
            kVar = kVarArrValues[i];
            if (a0.z(kVar.name(), str2, true)) {
                break;
            }
            i++;
        }
        if (kVar == null) {
            kVar = ncd.k.UNKNOWN;
        }
        return new ncd.i(d, str, kVar);
    }

    public static final v W(pz8.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        switch (nz8.g.f220999a[gVar.ordinal()]) {
            case 1:
                return v.CRYPTO;
            case 2:
                return v.TRADING;
            case 3:
                return v.FRAUD;
            case 4:
                return v.APP_TIPS;
            case 5:
                return v.PRO;
            case 6:
                return v.YOUTH_TRADING;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String X(i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        int i = gha.a.f143894a[iVar.ordinal()];
        if (i == 1) {
            return "MONTHLY";
        }
        if (i == 2) {
            return "ANNUAL";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final lk3.d Y(gk3.d dVar) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        List list = dVar.f144319a;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(((wi0.b) it8.next()).f297794a);
            }
        } else {
            arrayList = null;
        }
        ArrayList<gk3.a> arrayList2 = dVar.f144320b;
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        for (gk3.a aVar : arrayList2) {
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            arrayList3.add(new lk3.b(aVar.f144316a.name(), aVar.f144317b, aVar.f144318c));
        }
        return new lk3.d(arrayList, arrayList3);
    }

    public static final wzf.a Z(TravelExperiencesPointsOption travelExperiencesPointsOption) {
        Intrinsics.checkNotNullParameter(travelExperiencesPointsOption, "<this>");
        String strW = travelExperiencesPointsOption.f93195a.W();
        jo3.b bVarA = hx7.a.A(travelExperiencesPointsOption.f93196b);
        String str = travelExperiencesPointsOption.f93197c;
        RevPoints revPoints = travelExperiencesPointsOption.d;
        return new wzf.a(strW, str, revPoints != null ? revPoints.W() : null, travelExperiencesPointsOption.e, bVarA);
    }

    public static final yki.a a(yji.l lVar, FlowStep initialStep, List initialBackStack, Function2 controllersFactory) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(initialStep, "initialStep");
        Intrinsics.checkNotNullParameter(initialBackStack, "initialBackStack");
        Intrinsics.checkNotNullParameter(controllersFactory, "controllersFactory");
        return new yki.a(lVar, initialStep, initialBackStack, controllersFactory);
    }

    public static final String a0(soa.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        switch (n11.a.f211200a[cVar.ordinal()]) {
            case 1:
                return "marketing";
            case 2:
                return "crypto_x_marketing";
            case 3:
                return "offers";
            case 4:
                return "cryptocurrencyvolatility";
            case 5:
                return "commoditiesvolatility";
            case 6:
                return "stocks_volatility";
            case 7:
                return "bank_uab";
            case 8:
                return "daily_stock_highlights";
            case 9:
                return "thirdparty";
            case 10:
                return "revpay_delivery_tracking";
            case 11:
                return "revpay_flight_tracking";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static yki.a b(yji.l lVar, FlowStep flowStep, Function2 function2) {
        return a(lVar, flowStep, f0.f322471a, function2);
    }

    public static final dv0.e b0(LocalTime localTime, ma timeFormat) {
        Intrinsics.checkNotNullParameter(localTime, "<this>");
        Intrinsics.checkNotNullParameter(timeFormat, "timeFormat");
        int i = dv0.b.f118012a[timeFormat.ordinal()];
        if (i == 1) {
            return new dv0.d(localTime.getHour(), localTime.getMinute());
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (localTime.getHour() == 0 || localTime.getHour() == 12) {
            return new dv0.c(12, localTime.getMinute(), localTime.getHour() == 0 ? dv0.a.AM : dv0.a.PM);
        }
        return new dv0.c(localTime.getHour() % 12, localTime.getMinute(), localTime.getHour() < 12 ? dv0.a.AM : dv0.a.PM);
    }

    public static final boolean c(CreditCardInterest creditCardInterest) {
        dj0.d dVar;
        if (creditCardInterest == null || (dVar = creditCardInterest.f92271a) == null) {
            return false;
        }
        return dVar.f(dj0.d.e);
    }

    public static final q0 c0(Flow flow, eli.j twoFaErrorHandler) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(twoFaErrorHandler, "twoFaErrorHandler");
        twoFaErrorHandler.getClass();
        Intrinsics.checkNotNullParameter(flow, "flow");
        Continuation continuation = null;
        return new q0(vkm.q.L(flow, Long.MAX_VALUE, new eif.j(twoFaErrorHandler, continuation, 11)), new ec8.c(twoFaErrorHandler, continuation, 14), 1);
    }

    public static String d(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        Object obj2 = pair.f186385a;
        Object obj3 = pair.f186386b;
        if (((xi0.b) obj2).f306286a.length() == 3) {
            xi0.b bVar = (xi0.b) obj3;
            if (bVar.f306286a.length() == 3) {
                return a0.d.r(((xi0.b) pair.f186385a).f306286a, bVar.f306286a);
            }
        }
        return com.google.android.gms.internal.mlkit_vision_face.a.o(((xi0.b) pair.f186385a).f306286a, "/", ((xi0.b) pair.f186386b).f306286a);
    }

    public static final dj0.d d0(xi0.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return new dj0.d(k(bVar), bVar);
    }

    public static final String e(xi0.b bVar) {
        String strA;
        String str;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        g gVar = g.f261792c;
        String code = bVar.f306286a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        j.a();
        com.bumptech.glide.g gVar2 = g.e;
        gVar2.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        Map map = gVar2.f26094a;
        xi0.c cVar = (xi0.c) map.get(code);
        if (cVar != null && (str = cVar.d) != null) {
            return str;
        }
        Intrinsics.checkNotNullParameter(code, "code");
        xi0.c cVar2 = (xi0.c) map.get(code);
        return (cVar2 == null || (strA = cVar2.a()) == null) ? code : strA;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ejb.b f(ejb.b r5, java.util.List r6, java.util.Set r7) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cp5.d.f(ejb.b, java.util.List, java.util.Set):ejb.b");
    }

    public static final r g(r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        r map = rVar.map(new tid.a(new tfh.a(29), 2));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r rVarFilter = map.map(new tid.a(new t(linkedHashSet, 13), 0)).filter(new tid.a(new tfh.a(28), 1));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        return rVarFilter;
    }

    public static final wkm.l h(y yVar, Function0 flowProvider) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Intrinsics.checkNotNullParameter(flowProvider, "flowProvider");
        return vkm.q.Q(yVar, new frd.j(1, null, flowProvider));
    }

    public static final fbm.d i() {
        return new fbm.d(lam.b.d, 1);
    }

    public static final BigDecimal j(xi0.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        BigDecimal bigDecimalPow = new BigDecimal(10.0d).pow(bVar.c(), MathContext.DECIMAL128);
        Intrinsics.checkNotNullExpressionValue(bigDecimalPow, "pow(...)");
        return bigDecimalPow;
    }

    public static final long k(xi0.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return (long) Math.pow(10.0d, bVar.c());
    }

    public static final int l(svi.k kVar) {
        int i;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        if (kVar instanceof svi.j) {
            i = ((svi.j) kVar).f265925b;
        } else {
            if (!(kVar instanceof svi.l)) {
                if (kVar instanceof k.a) {
                    return 0;
                }
                throw new NoWhenBranchMatchedException();
            }
            i = ((svi.l) kVar).f265936b;
        }
        svi.p0 p0VarV = v(kVar);
        int i2 = i + (p0VarV != null ? p0VarV.f265961a : 0);
        svi.e eVarS = s(kVar);
        return i2 + (eVarS != null ? eVarS.f265896a : 0);
    }

    public static final boolean m(svi.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        if (v(kVar) != null) {
            return true;
        }
        if (!(kVar instanceof svi.j)) {
            return kVar instanceof svi.l;
        }
        svi.j jVar = (svi.j) kVar;
        if (jVar.f265925b <= 0) {
            svi.e eVar = jVar.e;
            if ((eVar != null ? eVar.f265896a : 0) <= 0) {
                return false;
            }
        }
        return true;
    }

    public static final String n(xi0.a aVar, String code) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(code, "code");
        g.f261792c.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        j.a();
        com.bumptech.glide.g gVar = g.e;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        xi0.c cVar = (xi0.c) gVar.f26094a.get(code);
        if (cVar != null) {
            return cVar.f306293j;
        }
        return null;
    }

    public static final Integer o(xi0.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        g gVar = g.f261792c;
        String code = bVar.f306286a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        qm.e eVar = gVar.f261794b;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        xi0.c cVar = (xi0.c) ((Map) eVar.f247740b).get(code);
        if (cVar != null) {
            return cVar.f306291g;
        }
        return null;
    }

    public static final int p(xi0.b bVar) {
        Currency currency;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        g gVar = g.f261792c;
        String code = bVar.f306286a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        qm.e eVar = gVar.f261794b;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        xi0.c cVar = (xi0.c) ((Map) eVar.f247740b).get(code);
        if (cVar != null) {
            return cVar.f306288a;
        }
        try {
            currency = Currency.getInstance(code);
        } catch (IllegalArgumentException unused) {
            currency = null;
        }
        if (currency != null) {
            return currency.getDefaultFractionDigits();
        }
        return 2;
    }

    public static final String q(Locale locale, xi0.b bVar) {
        Currency currency;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String str = bVar.f306286a;
        if (str != null) {
            try {
                currency = Currency.getInstance(str);
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                currency = null;
            }
        } else {
            currency = null;
        }
        if (currency != null) {
            return currency.getDisplayName(locale);
        }
        return null;
    }

    public static final BigDecimal r(q1 q1Var) {
        Intrinsics.checkNotNullParameter(q1Var, "<this>");
        BigDecimal bigDecimalMultiply = q1Var.f322324b.multiply(BigDecimal.valueOf(100L));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return bigDecimalMultiply;
    }

    public static final svi.e s(svi.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        if (kVar instanceof svi.j) {
            return ((svi.j) kVar).e;
        }
        if (kVar instanceof svi.l) {
            return ((svi.l) kVar).e;
        }
        if (kVar instanceof k.a) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String t(xi0.a aVar, String code) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(code, "code");
        g.f261792c.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        j.a();
        com.bumptech.glide.g gVar = g.e;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        xi0.c cVar = (xi0.c) gVar.f26094a.get(code);
        if (cVar != null) {
            return cVar.i;
        }
        return null;
    }

    public static final String u(svi.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        if (kVar instanceof svi.j) {
            return ((svi.j) kVar).f265924a;
        }
        if (kVar instanceof svi.l) {
            return ((svi.l) kVar).f265935a;
        }
        if (kVar instanceof k.a) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final svi.p0 v(svi.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        if (kVar instanceof svi.j) {
            return ((svi.j) kVar).f;
        }
        if (kVar instanceof svi.l) {
            return ((svi.l) kVar).f;
        }
        if (kVar instanceof k.a) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final te0.t w(s2b.b bVar, e2b.a orderType, bfl.g side) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(side, "side");
        e2b.a aVar = e2b.a.LIMIT;
        if (orderType == aVar && side == bfl.g.BUY) {
            return (te0.t) bVar.f259286c.getValue();
        }
        if (orderType == aVar && side == bfl.g.SELL) {
            return (te0.t) bVar.f259285b.getValue();
        }
        e2b.a aVar2 = e2b.a.STOP;
        if (orderType == aVar2 && side == bfl.g.BUY) {
            return (te0.t) bVar.e.getValue();
        }
        if (orderType == aVar2 && side == bfl.g.SELL) {
            return (te0.t) bVar.d.getValue();
        }
        throw new IllegalStateException("No setting for this combination " + orderType + " " + side);
    }

    public static final boolean x(svi.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        if (kVar instanceof svi.j) {
            return ((svi.j) kVar).f265927g;
        }
        if (kVar instanceof svi.l) {
            return ((svi.l) kVar).f265938g;
        }
        if (kVar instanceof k.a) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean y(xi0.b bVar) {
        String code;
        if (bVar == null || (code = bVar.f306286a) == null) {
            return false;
        }
        g.f261792c.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        j.a();
        yf.c cVar = g.d;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        xi0.c cVar2 = (xi0.c) ((Map) cVar.b).get(code);
        return (cVar2 != null ? cVar2.f306289b : null) == xi0.e.COMMODITY;
    }

    public static final boolean z(xi0.b bVar) {
        String code;
        if (bVar == null || (code = bVar.f306286a) == null) {
            return false;
        }
        g.f261792c.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        j.a();
        yf.c cVar = g.d;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        xi0.c cVar2 = (xi0.c) ((Map) cVar.b).get(code);
        return (cVar2 != null ? cVar2.f306289b : null) == xi0.e.CRYPTO;
    }
}
