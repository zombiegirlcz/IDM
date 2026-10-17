package h93;

import com.revolut.feature.cards.models.card.PocketWithSubaccount;
import h93.i;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Days;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes21.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f150146a = zhm.v.k(r.EXPIRED, r.BLOCKED, r.LOCKED, r.LOST);

    public static final int a(f0 f0Var) {
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        LocalDate localDateNow = LocalDate.now();
        LocalDate localDate = f0Var.f150120q;
        if (localDate == null) {
            localDate = localDateNow;
        }
        return Days.daysBetween(localDateNow, localDate).getDays();
    }

    public static final boolean b(f0 f0Var) {
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        return f0Var.d && f0Var.f == r.CREATED;
    }

    public static final String c(f0 f0Var) {
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        LocalDate localDate = f0Var.f150120q;
        if (localDate != null) {
            return localDate.toString("MM/YY");
        }
        return null;
    }

    public static final boolean d(f0 f0Var) {
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        h hVar = f0Var.k;
        return Intrinsics.f(hVar.f150140n, "PRIORITY") || Intrinsics.f(hVar.f150140n, "LIGHTNING") || hVar.f150134c != null;
    }

    public static final boolean e(f0 f0Var) {
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        return f0Var.x() && f0Var.f150123t != c0.DECLINED_BY_FRAUD_DETECTOR_TRANSACTION;
    }

    public static final boolean f(f0 f0Var) {
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        return f150146a.contains(f0Var.f);
    }

    public static final c93.b g(f0 f0Var, e93.f cardDesign) {
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        Intrinsics.checkNotNullParameter(cardDesign, "cardDesign");
        return new c93.b(f0Var.f150110a, cardDesign);
    }

    public static final i h(f0 f0Var, LinkedHashMap pocketsMap) {
        io3.d dVar;
        List list;
        i93.h hVar;
        String str;
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        Intrinsics.checkNotNullParameter(pocketsMap, "pocketsMap");
        i93.c cVar = f0Var.f150113g;
        PocketWithSubaccount pocketWithSubaccount = (cVar == null || (list = cVar.f) == null || (hVar = (i93.h) zhm.d0.d0(list)) == null || (str = hVar.f159559a) == null) ? null : (PocketWithSubaccount) pocketsMap.get(str);
        String str2 = (pocketWithSubaccount == null || (dVar = pocketWithSubaccount.f65523a) == null) ? null : dVar.f163147c;
        String str3 = pocketWithSubaccount != null ? pocketWithSubaccount.f65524b : null;
        i93.c cVar2 = f0Var.f150113g;
        if ((cVar2 != null ? cVar2.f159553h : null) == i93.d.ALL_CRYPTO) {
            return i.b.f150147a;
        }
        if (str3 != null) {
            return new j(str3);
        }
        if (str2 != null) {
            return new k(str2);
        }
        return null;
    }

    public static final String i(f0 f0Var) {
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        return f0Var.d ? j6.a.q("disposable_", f0Var.f150114h.f13639a.f13615a) : f0Var.f150110a;
    }
}
