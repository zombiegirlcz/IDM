package jwi;

import gwi.m3;
import gwi.o;
import gwi.p0;
import gwi.p3;
import iwi.f;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.t;
import le.u1;
import svi.j;
import svi.k;
import svi.l;
import svi.q0;
import svi.x;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f179011a = r0.k(new Pair("ACTIVE", x.ACTIVE), new Pair("SUSPENDED", x.SUSPENDED));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f179012b = r0.k(new Pair("NORMAL", svi.r0.NORMAL), new Pair("METAL", svi.r0.METAL), new Pair("PRIVATE", svi.r0.PRIVATE), new Pair("ULTRA", svi.r0.ULTRA));

    public static final svi.e a(o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        int i = oVar.f147481a;
        List<p3> list = oVar.f147482b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (p3 p3Var : list) {
            Intrinsics.checkNotNullParameter(p3Var, "<this>");
            int i2 = p3Var.f147494a;
            String str = p3Var.f147495b;
            Instant instantOfEpochMilli = Instant.ofEpochMilli(p3Var.f147496c);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
            arrayList.add(new q0(i2, str, instantOfEpochMilli));
        }
        return new svi.e(i, arrayList);
    }

    public static final svi.e b(f.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int totalCount = aVar.getTotalCount();
        List<f.c> rewards = aVar.getRewards();
        ArrayList arrayList = new ArrayList(w.t(rewards, 10));
        for (f.c cVar : rewards) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            int count = cVar.getCount();
            String description = cVar.getDescription();
            Instant instantOfEpochMilli = Instant.ofEpochMilli(cVar.getExpirationDate());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
            arrayList.add(new q0(count, description, instantOfEpochMilli));
        }
        return new svi.e(totalCount, arrayList);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Map] */
    public static final k c(p0 p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "<this>");
        String str = p0Var.f147488b;
        String str2 = p0Var.f147492j;
        String str3 = p0Var.i;
        o oVar = p0Var.f147491h;
        m3 m3Var = p0Var.f147490g;
        String str4 = p0Var.d;
        boolean zF = Intrinsics.f(str, "LIMITED");
        ?? r92 = f179011a;
        if (zF) {
            String str5 = p0Var.f147487a;
            int i = p0Var.f147489c;
            Long l2 = p0Var.f;
            return new j(str5, i, (x) u1.t(str4, x.ACTIVE, r92), l2 != null ? oi0.d.Y(l2.longValue()) : null, oVar != null ? a(oVar) : null, m3Var != null ? e(m3Var) : null, Intrinsics.f(str3, "collinson"), h(str2));
        }
        if (!Intrinsics.f(str, "UNLIMITED")) {
            throw new IllegalStateException(t.e("\n                    Unsupported lounge pass type: " + p0Var.f147488b + ".\n                    Must be either LIMITED or UNLIMITED.\n                "));
        }
        return new l(p0Var.f147487a, p0Var.f147489c, p0Var.e, (x) u1.t(str4, x.ACTIVE, r92), oVar != null ? a(oVar) : null, m3Var != null ? e(m3Var) : null, Intrinsics.f(str3, "collinson"), h(str2));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public static final k d(iwi.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        f.d existingPass = fVar.getExistingPass();
        if (existingPass == null) {
            return k.a.f265929a;
        }
        String type = existingPass.getType();
        boolean zF = Intrinsics.f(type, "LIMITED");
        ?? r2 = f179011a;
        if (zF) {
            String id10 = existingPass.getId();
            int passes = existingPass.getPasses();
            Long lastPurchaseDate = existingPass.getLastPurchaseDate();
            LocalDateTime localDateTimeY = lastPurchaseDate != null ? oi0.d.Y(lastPurchaseDate.longValue()) : null;
            x xVar = (x) u1.t(existingPass.getState(), x.ACTIVE, r2);
            f.b recurringPasses = existingPass.getRecurringPasses();
            svi.p0 p0VarF = recurringPasses != null ? f(recurringPasses) : null;
            f.a giftedPasses = existingPass.getGiftedPasses();
            return new j(id10, passes, xVar, localDateTimeY, giftedPasses != null ? b(giftedPasses) : null, p0VarF, existingPass.getCollinson(), h(existingPass.getWalletStyle()));
        }
        if (!Intrinsics.f(type, "UNLIMITED")) {
            throw new IllegalStateException(t.e("\n                    Unsupported lounge pass type: " + existingPass.getType() + " when deserializing from Entity.\n                    Must be either LIMITED or UNLIMITED.\n                "));
        }
        String id11 = existingPass.getId();
        int passes2 = existingPass.getPasses();
        x xVar2 = (x) u1.t(existingPass.getState(), x.ACTIVE, r2);
        int freeCompanionEntries = existingPass.getFreeCompanionEntries();
        f.b recurringPasses2 = existingPass.getRecurringPasses();
        svi.p0 p0VarF2 = recurringPasses2 != null ? f(recurringPasses2) : null;
        f.a giftedPasses2 = existingPass.getGiftedPasses();
        return new l(id11, passes2, freeCompanionEntries, xVar2, giftedPasses2 != null ? b(giftedPasses2) : null, p0VarF2, existingPass.getCollinson(), h(existingPass.getWalletStyle()));
    }

    public static final svi.p0 e(m3 m3Var) {
        Intrinsics.checkNotNullParameter(m3Var, "<this>");
        int i = m3Var.f147467a;
        int i2 = m3Var.f147468b;
        Instant instantOfEpochMilli = Instant.ofEpochMilli(m3Var.f147469c);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
        return new svi.p0(i, i2, instantOfEpochMilli, m3Var.d, m3Var.e);
    }

    public static final svi.p0 f(f.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        int remaining = bVar.getRemaining();
        int total = bVar.getTotal();
        Instant instantOfEpochMilli = Instant.ofEpochMilli(bVar.getRenewalDate());
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
        return new svi.p0(remaining, total, instantOfEpochMilli, bVar.getPlanName(), bVar.getPurchaseEnabled());
    }

    public static final f.a g(svi.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        int i = eVar.f265896a;
        ArrayList<q0> arrayList = eVar.f265897b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (q0 q0Var : arrayList) {
            Intrinsics.checkNotNullParameter(q0Var, "<this>");
            arrayList2.add(new f.c(q0Var.f265965a, q0Var.f265967c.toEpochMilli(), q0Var.f265966b));
        }
        return new f.a(i, arrayList2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static final svi.r0 h(String str) {
        if (str != null) {
            svi.r0 r0Var = (svi.r0) u1.t(str, svi.r0.NORMAL, f179012b);
            if (r0Var != null) {
                return r0Var;
            }
        }
        return svi.r0.NORMAL;
    }
}
