package xam;

import adk.i0;
import adk.l0;
import adk.o0;
import adk.s;
import adk.u0;
import adk.v;
import adk.v0;
import adk.y;
import android.content.Context;
import android.content.Intent;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.widget.ImageView;
import android.widget.TextView;
import aw0.s0;
import aw0.t0;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.retail.feature.plan_rewards.api.model.MonthlyDrawHub$BottomSheet;
import com.revolut.retail.feature.plan_rewards.api.model.MonthlyDrawHub$BottomSheetItem;
import eid.e0;
import eid.p;
import gs7.d;
import ind.c0;
import ip0.jp;
import java.math.BigDecimal;
import java.math.MathContext;
import java.time.Instant;
import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;
import k4l.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.flow.Flow;
import lzi.g;
import ms0.h4;
import oq9.h;
import oq9.i;
import oq9.j;
import or0.u;
import q0i.c;
import u80.q;
import ub7.b;
import xck.k;
import yhm.m;
import yhm.n;
import yhm.o;
import yy0.f;
import zb7.d;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.q0;
import zhm.r0;
import zhm.w;
import zm3.l;

/* JADX INFO: loaded from: classes21.dex */
public abstract class a {
    public static final b A(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        String strA = dVar.f320835b.a();
        Set set = dVar.f320836c;
        ArrayList arrayList = new ArrayList(w.t(set, 10));
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            arrayList.add(((zb7.a) it8.next()).f320831a);
        }
        return new b(strA, dVar.d, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r1v2, types: [k4l.e[]] */
    /* JADX WARN: Type inference failed for: r4v0, types: [yhm.n] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Enum] */
    public static final e B(String str) throws Throwable {
        ?? A;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            m.Companion aVar = m.INSTANCE;
            ?? Values = e.values();
            int length = Values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    A = 0;
                    break;
                }
                A = Values[i];
                if (a0.z(A.name(), str, true)) {
                    break;
                }
                i++;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion aVar2 = m.INSTANCE;
            A = o.a(th10);
        }
        Throwable thA = m.a(A);
        if (thA != null) {
            hx7.e.n(thA);
        }
        return (e) (A instanceof n ? 0 : A);
    }

    public static final dj0.d C(c cVar, xi0.b currency) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(currency, "currency");
        if (cVar instanceof q0i.b) {
            return new dj0.d(((q0i.b) cVar).f241280a, currency);
        }
        if (cVar instanceof q0i.a) {
            return q.a(new BigDecimal(((q0i.a) cVar).f241279a, currency.c()), currency);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final jp D(int i) {
        if (i != 0) {
            if (i == 90) {
                return sam.a.f261457c;
            }
            if (i == 180) {
                return sam.c.d;
            }
            if (i == 270) {
                return sam.a.d;
            }
            if (i != 360) {
                throw new IllegalArgumentException(j6.a.l(i, "Cannot convert ", " to absolute Orientation."));
            }
        }
        return sam.c.f261459c;
    }

    public static final k1h.n E(q1h.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i = r1h.a.f251007a[aVar.ordinal()];
        if (i == 1) {
            return k1h.n.DATETIME;
        }
        if (i == 2) {
            return k1h.n.ONLY_TIME;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final e4d.a F(FavouritesAssetTypeKey favouritesAssetTypeKey) {
        Intrinsics.checkNotNullParameter(favouritesAssetTypeKey, "<this>");
        String str = favouritesAssetTypeKey.f86866a;
        switch (str.hashCode()) {
            case 2157622:
                if (str.equals("FIAT")) {
                    return e4d.a.FIAT;
                }
                break;
            case 1300506381:
                if (str.equals("COMMODITY")) {
                    return e4d.a.COMMODITY;
                }
                break;
            case 1731749696:
                if (str.equals("SECURITY")) {
                    return e4d.a.SECURITY;
                }
                break;
            case 1996612801:
                if (str.equals("CRYPTO")) {
                    return e4d.a.CRYPTO;
                }
                break;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(p.a.p("Unable to map assetType=", favouritesAssetTypeKey.f86866a, " to UniversalAssetType"));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "UniversalAssetTypeMapper", null, illegalArgumentException, h0Var);
        return null;
    }

    public static void G(Point[] pointArr, Matrix matrix) {
        int length = pointArr.length;
        float[] fArr = new float[length + length];
        for (int i = 0; i < pointArr.length; i++) {
            Point point = pointArr[i];
            int i2 = i + i;
            fArr[i2] = point.x;
            fArr[i2 + 1] = point.y;
        }
        matrix.mapPoints(fArr);
        for (int i3 = 0; i3 < pointArr.length; i3++) {
            int i5 = i3 + i3;
            pointArr[i3].set((int) fArr[i5], (int) fArr[i5 + 1]);
        }
    }

    public static void H(ArrayList arrayList, Matrix matrix) {
        int size = arrayList.size();
        float[] fArr = new float[size + size];
        for (int i = 0; i < arrayList.size(); i++) {
            int i2 = i + i;
            fArr[i2] = ((PointF) arrayList.get(i)).x;
            fArr[i2 + 1] = ((PointF) arrayList.get(i)).y;
        }
        matrix.mapPoints(fArr);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            int i5 = i3 + i3;
            ((PointF) arrayList.get(i3)).set(fArr[i5], fArr[i5 + 1]);
        }
    }

    public static void I(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public static final String a(Matcher matcher) {
        String strGroup = matcher.group(1);
        if (strGroup != null) {
            return strGroup;
        }
        throw new IllegalStateException("Group 0 does not exist");
    }

    public static long b(AtomicLong atomicLong, long j2) {
        long j3;
        do {
            j3 = atomicLong.get();
            if (j3 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j3, c(j3, j2)));
        return j3;
    }

    public static long c(long j2, long j3) {
        long j5 = j2 + j3;
        if (j5 < 0) {
            return Long.MAX_VALUE;
        }
        return j5;
    }

    public static final void d(s0 s0Var, SmallActionButton button, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        Intrinsics.checkNotNullParameter(button, "button");
        button.setEnabled(s0Var.f10519b);
        button.setText(s0Var.f10518a);
        button.i(h4.SEMIACCENT);
        button.setAnalyticsContext(parcelable);
        button.setIcon(s0Var.f10520c);
        button.setProgressVisible(s0Var.d);
    }

    public static final void e(t0 t0Var, TextView titleView, ImageView endImageView) {
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Intrinsics.checkNotNullParameter(titleView, "titleView");
        Intrinsics.checkNotNullParameter(endImageView, "endImageView");
        ty0.c.b(u.k(titleView).b0(), t0Var.f10536a, titleView, null, null, 12);
        titleView.setMaxLines(t0Var.f10538c);
        knm.b.z(endImageView, t0Var.f10537b != null, null, 14);
        f.e(u.k(endImageView).Q(), t0Var.f10537b, endImageView, null, null, 12);
    }

    public static final boolean f(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(intent, "intent");
        return intent.resolveActivity(context.getPackageManager()) != null;
    }

    public static int g(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 90) {
            return 1;
        }
        if (i == 180) {
            return 2;
        }
        if (i == 270) {
            return 3;
        }
        throw new IllegalArgumentException(a0.d.n("Invalid rotation: ", i));
    }

    public static final Flow h(Function2 block, Flow flow) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return vkm.q.q(vkm.q.Q(flow, new mki.d((Continuation) null, block, 20)));
    }

    public static TextLocalisedQuantityClause i(Period period, int i, int i2) {
        f0 args = f0.f322471a;
        Intrinsics.checkNotNullParameter(period, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        if (jli.e.h(period)) {
            return new TextLocalisedQuantityClause(i, Integer.valueOf(period.getDays()), d0.E0(args, zhm.u.c(Integer.valueOf(period.getDays()))), (Style) null, 8);
        }
        if (jli.e.i(period)) {
            return new TextLocalisedQuantityClause(i2, Integer.valueOf(period.getMonths()), d0.E0(args, zhm.u.c(Integer.valueOf(period.getMonths()))), (Style) null, 8);
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unable to get period clause, the period is neither daily or monthly: " + period);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        return null;
    }

    public static final String j(zm3.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar instanceof l) {
            return ((l) aVar).getCode();
        }
        if (aVar instanceof zm3.f) {
            return ((zm3.f) aVar).f323345a;
        }
        if (aVar instanceof zm3.e) {
            return ((zm3.e) aVar).f323340a;
        }
        if (aVar instanceof zm3.o) {
            return ((zm3.o) aVar).f323376a;
        }
        if (aVar instanceof zm3.n) {
            return ((zm3.n) aVar).f323373a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String k(i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        h hVar = iVar instanceof h ? (h) iVar : null;
        if (hVar != null) {
            return hVar.f227827l;
        }
        return null;
    }

    public static final boolean l(PaymentGroup paymentGroup) {
        Intrinsics.checkNotNullParameter(paymentGroup, "<this>");
        oq9.a aVar = paymentGroup.f;
        return aVar == null || aVar.f227798a.c() == oq9.d.SETTLED;
    }

    public static void m(AtomicLong atomicLong, long j2) {
        long j3;
        long j5;
        do {
            j3 = atomicLong.get();
            if (j3 == Long.MAX_VALUE) {
                return;
            }
            j5 = j3 - j2;
            if (j5 < 0) {
                jb3.l.v(new IllegalStateException(p.a.m(j5, "More produced than requested: ")));
                j5 = 0;
            }
        } while (!atomicLong.compareAndSet(j3, j5));
    }

    public static final lzi.h n(lzi.h hVar, lzi.i periodType, long j2) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(periodType, "periodType");
        int i = c0.f162797a[periodType.ordinal()];
        boolean z = false;
        if (i != 1 && i != 2 && i != 3) {
            if (i == 4) {
                z = hVar instanceof g;
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (((hVar instanceof lzi.c) || (hVar instanceof lzi.e)) && j2 == 1) {
                    z = true;
                }
            }
        }
        if (z) {
            return hVar;
        }
        return null;
    }

    public static final afl.g o(jed.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        String strC = hVar.getLow();
        MathContext mathContext = MathContext.DECIMAL128;
        BigDecimal bigDecimal = new BigDecimal(strC, mathContext);
        xi0.a aVar = xi0.b.Companion;
        String strA = hVar.getCurrency();
        aVar.getClass();
        return new afl.g(new ej0.b(bigDecimal, xi0.a.a(strA)), new ej0.b(new BigDecimal(hVar.getHigh(), mathContext), xi0.a.a(hVar.getCurrency())));
    }

    public static final afl.t0 p(jed.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return new afl.t0(mo3.a.o(gVar.getLow()), mo3.a.o(gVar.getHigh()));
    }

    public static final MonthlyDrawHub$BottomSheet q(v vVar) {
        xck.e eVar;
        String str = vVar.f3437a;
        xck.e[] eVarArrValues = xck.e.values();
        int length = eVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                eVar = null;
                break;
            }
            eVar = eVarArrValues[i];
            if (a0.z(eVar.name(), str, true)) {
                break;
            }
            i++;
        }
        if (eVar == null) {
            eVar = xck.e.BULLET;
        }
        xck.e eVar2 = eVar;
        String str2 = vVar.f3438b;
        String str3 = vVar.f3439c;
        String str4 = vVar.d;
        List<y> list = vVar.e;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (y yVar : list) {
            arrayList.add(new MonthlyDrawHub$BottomSheetItem(yVar.f3454a, yVar.f3455b, yVar.f3456c));
        }
        return new MonthlyDrawHub$BottomSheet(eVar2, str2, str3, str4, arrayList, vVar.f, vVar.f3440g);
    }

    public static final ArrayList r(LinkedHashMap members, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(members, "members");
        List<ar9.m> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (ar9.m mVar : list2) {
            Intrinsics.checkNotNullParameter(mVar, "<this>");
            Intrinsics.checkNotNullParameter(members, "members");
            String str = mVar.f8562a;
            String str2 = mVar.f8563b;
            String str3 = mVar.f8564c;
            String str4 = mVar.d;
            oq9.o nVar = (oq9.o) members.get(str4);
            if (nVar == null) {
                nVar = new oq9.n(str4, mVar.f8564c);
            }
            oq9.o oVar = nVar;
            long j2 = mVar.e;
            xi0.a aVar = xi0.b.Companion;
            String str5 = mVar.f;
            aVar.getClass();
            dj0.d dVar = new dj0.d(j2, xi0.a.a(str5));
            jo3.b bVar = mVar.f8565g;
            arrayList.add(new j(str, str2, str3, oVar, dVar, bVar != null ? hx7.a.v(bVar) : null));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList s(List list) {
        Object gVar;
        zb7.f fVar;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            ub7.c cVar = (ub7.c) it8.next();
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            zb7.e eVar = zb7.f.Companion;
            String tag2 = cVar.getScreenId();
            eVar.getClass();
            Intrinsics.checkNotNullParameter(tag2, "tag");
            zb7.f[] fVarArrValues = zb7.f.values();
            int length = fVarArrValues.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                gVar = null;
                if (i2 >= length) {
                    fVar = null;
                    break;
                }
                zb7.f fVar2 = fVarArrValues[i2];
                if (Intrinsics.f(fVar2.a(), tag2)) {
                    fVar = fVar2;
                    break;
                }
                i2++;
            }
            if (fVar != null) {
                String strB = cVar.getId();
                String tag3 = cVar.getRating();
                if (tag3 != null) {
                    zb7.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(tag3, "tag");
                    zb7.c[] cVarArrValues = zb7.c.values();
                    int length2 = cVarArrValues.length;
                    while (true) {
                        if (i >= length2) {
                            break;
                        }
                        zb7.c cVar2 = cVarArrValues[i];
                        if (Intrinsics.f(cVar2.a(), tag3)) {
                            gVar = cVar2;
                            break;
                        }
                        i++;
                    }
                }
                zb7.c cVar3 = gVar;
                String strC = cVar.getQuestion();
                List<ub7.a> listA = cVar.getCategories();
                ArrayList arrayList2 = new ArrayList(w.t(listA, 10));
                for (ub7.a aVar : listA) {
                    arrayList2.add(new zb7.a(aVar.getId(), aVar.getName()));
                }
                gVar = new zb7.g(strB, fVar, cVar3, strC, arrayList2, cVar.getSurveyEntityId());
            }
            if (gVar != null) {
                arrayList.add(gVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    public static final mid.n t(p pVar) {
        ?? arrayList;
        ?? arrayList2;
        bo3.a aVar;
        ArrayList arrayList3;
        Map mapG;
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        String strC = pVar.getId();
        String strH = pVar.getType();
        String strG = pVar.getTitle();
        if (strG == null) {
            strG = "";
        }
        String str = strG;
        List listF = pVar.getTiles();
        if (listF != null) {
            List list = listF;
            arrayList = new ArrayList(w.t(list, 10));
            int i = 0;
            for (Object obj2 : list) {
                int i2 = i + 1;
                if (i < 0) {
                    zhm.v.s();
                    throw null;
                }
                arrayList.add(lid.j.a((e0) obj2, i2, pVar.getId()));
                i = i2;
            }
        } else {
            arrayList = f0.f322471a;
        }
        List listA = pVar.getActions();
        if (listA != null) {
            List<eid.e> list2 = listA;
            arrayList2 = new ArrayList(w.t(list2, 10));
            for (eid.e eVar : list2) {
                Intrinsics.checkNotNullParameter(eVar, "<this>");
                String strB = eVar.getType();
                eid.h hVarA = eVar.getLoyaltyBadge();
                arrayList2.add(new mid.g(strB, hVarA != null ? lid.b.a(hVarA) : null));
            }
        } else {
            arrayList2 = f0.f322471a;
        }
        eid.w wVarD = pVar.getMapBox();
        if (wVarD != null) {
            Intrinsics.checkNotNullParameter(wVarD, "<this>");
            aVar = new bo3.a(yoj.b.C(wVarD.getTopLeft()), yoj.b.C(wVarD.getBottomRight()));
        } else {
            aVar = null;
        }
        List listE = pVar.getOutlets();
        if (listE != null) {
            List list3 = listE;
            arrayList3 = new ArrayList(w.t(list3, 10));
            Iterator it8 = list3.iterator();
            while (it8.hasNext()) {
                arrayList3.add(yoj.b.F((eid.y) it8.next()));
            }
        } else {
            arrayList3 = null;
        }
        List listB = pVar.getCampaignOffers();
        if (listB != null) {
            List<eid.j> list4 = listB;
            int iB = q0.b(w.t(list4, 10));
            if (iB < 16) {
                iB = 16;
            }
            mapG = new LinkedHashMap(iB);
            for (eid.j jVar : list4) {
                mapG.put(jVar.getId(), lid.c.a(jVar, pVar.getId(), null, null));
            }
        } else {
            mapG = r0.g();
        }
        return new mid.n(strC, strH, str, arrayList, arrayList2, aVar, arrayList3, mapG);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0134 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final r5b.n u(w5b.m5 r29) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xam.a.u(w5b.m5):r5b.n");
    }

    public static final vs7.c v(gs7.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (dVar instanceof gs7.g) {
            return new vs7.a(((gs7.g) dVar).f146335b);
        }
        if (dVar instanceof gs7.j) {
            return new vs7.b(((gs7.j) dVar).f146337b);
        }
        if (dVar instanceof d.b) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final xck.m w(v0 v0Var) {
        xck.n nVar;
        xck.f fVar;
        k kVar;
        ArrayList arrayList;
        xck.g gVar;
        String str;
        xck.c cVar;
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        String str2 = v0Var.f3442a;
        String str3 = v0Var.f3443b;
        String str4 = v0Var.f3444c;
        Instant instant = str4 != null ? Instant.parse(str4) : null;
        Integer num = v0Var.d;
        String str5 = v0Var.e;
        xck.n[] nVarArrValues = xck.n.values();
        int length = nVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                nVar = null;
                break;
            }
            nVar = nVarArrValues[i];
            if (a0.z(nVar.name(), str5, true)) {
                break;
            }
            i++;
        }
        if (nVar == null) {
            nVar = xck.n.UNKNOWN;
        }
        xck.n nVar2 = nVar;
        List<l0> list = v0Var.f;
        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
        for (l0 l0Var : list) {
            s sVar = l0Var.f3403a;
            arrayList2.add(new xck.i(sVar != null ? new xck.d(sVar.f3429a, sVar.f3430b) : null, l0Var.f3404b, l0Var.f3405c, l0Var.d, q(l0Var.e)));
        }
        adk.c0 c0Var = v0Var.f3445g;
        String str6 = c0Var.f3370a;
        List<o0> list2 = c0Var.f3371b;
        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
        for (o0 o0Var : list2) {
            arrayList3.add(new xck.j(o0Var.f3415a, o0Var.f3416b, o0Var.f3417c, q(o0Var.d)));
        }
        xck.f fVar2 = new xck.f(str6, arrayList3);
        adk.f0 f0Var = v0Var.f3446h;
        String str7 = f0Var.f3383a;
        List<o0> list3 = f0Var.f3384b;
        ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
        for (o0 o0Var2 : list3) {
            arrayList4.add(new xck.j(o0Var2.f3415a, o0Var2.f3416b, o0Var2.f3417c, q(o0Var2.d)));
        }
        xck.g gVar2 = new xck.g(str7, arrayList4);
        adk.r0 r0Var = v0Var.i;
        if (r0Var != null) {
            String str8 = r0Var.f3427a;
            List<u0> list4 = r0Var.f3428b;
            ArrayList arrayList5 = new ArrayList(w.t(list4, 10));
            for (u0 u0Var : list4) {
                arrayList5.add(new xck.l(u0Var.f3433a, u0Var.f3434b, u0Var.f3435c, u0Var.e, u0Var.d));
                fVar2 = fVar2;
            }
            fVar = fVar2;
            kVar = new k(str8, arrayList5);
        } else {
            fVar = fVar2;
            kVar = null;
        }
        List list5 = v0Var.f3447j;
        if (list5 != null) {
            List list6 = list5;
            ArrayList arrayList6 = new ArrayList(w.t(list6, 10));
            for (Iterator it8 = list6.iterator(); it8.hasNext(); it8 = it8) {
                i0 i0Var = (i0) it8.next();
                arrayList6.add(new xck.h(i0Var.f3394a, i0Var.f3395b, i0Var.f3396c, i0Var.d, i0Var.e, q(i0Var.f)));
            }
            arrayList = arrayList6;
        } else {
            arrayList = null;
        }
        String str9 = v0Var.k;
        String str10 = v0Var.f3448l;
        String str11 = v0Var.f3449m;
        s sVar2 = v0Var.f3450n;
        xck.d dVar = sVar2 != null ? new xck.d(sVar2.f3429a, sVar2.f3430b) : null;
        adk.p pVar = v0Var.o;
        if (pVar != null) {
            gVar = gVar2;
            str = str2;
            cVar = new xck.c(pVar.f3421a, pVar.f3422b, pVar.f3423c);
        } else {
            gVar = gVar2;
            str = str2;
            cVar = null;
        }
        return new xck.m(str, str3, instant, num, nVar2, arrayList2, fVar, gVar, kVar, arrayList, str9, str10, str11, dVar, cVar, v0Var.f3451p);
    }

    public static final v x(MonthlyDrawHub$BottomSheet monthlyDrawHub$BottomSheet) {
        String strName = monthlyDrawHub$BottomSheet.f102524a.name();
        String str = monthlyDrawHub$BottomSheet.f102525b;
        String str2 = monthlyDrawHub$BottomSheet.f102526c;
        String str3 = monthlyDrawHub$BottomSheet.d;
        ArrayList<MonthlyDrawHub$BottomSheetItem> arrayList = monthlyDrawHub$BottomSheet.e;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (MonthlyDrawHub$BottomSheetItem monthlyDrawHub$BottomSheetItem : arrayList) {
            arrayList2.add(new y(monthlyDrawHub$BottomSheetItem.f102528a, monthlyDrawHub$BottomSheetItem.f102529b, monthlyDrawHub$BottomSheetItem.f102530c));
        }
        return new v(strName, str, str2, str3, monthlyDrawHub$BottomSheet.f, monthlyDrawHub$BottomSheet.f102527g, arrayList2);
    }

    public static final gs7.d y(vs7.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (cVar instanceof vs7.a) {
            return new gs7.g(((vs7.a) cVar).f291734a);
        }
        if (cVar instanceof vs7.b) {
            return new gs7.j(((vs7.b) cVar).f291735a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ArrayList z(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<zb7.g> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (zb7.g gVar : list2) {
            Intrinsics.checkNotNullParameter(gVar, "<this>");
            String str = gVar.f320838a;
            String strA = gVar.f320839b.a();
            zb7.c cVar = gVar.f320840c;
            String strA2 = cVar != null ? cVar.a() : null;
            String str2 = gVar.d;
            ArrayList<zb7.a> arrayList2 = gVar.e;
            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
            for (zb7.a aVar : arrayList2) {
                arrayList3.add(new ub7.a(aVar.f320831a, aVar.f320832b));
            }
            arrayList.add(new ub7.c(str, strA, strA2, str2, gVar.f, arrayList3));
        }
        return arrayList;
    }
}
