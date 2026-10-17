package sb5;

import ac5.g;
import ac5.h;
import ac5.i;
import ac5.l;
import ac5.n;
import ac5.s;
import ac5.t;
import ac5.u;
import ac5.v;
import ac5.w;
import he0.e;
import he0.f;
import he0.m;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import kg.o;
import kg.p;
import kotlin.jvm.internal.Intrinsics;
import ub5.j;
import wb5.f;

/* JADX INFO: loaded from: classes21.dex */
public final class a {
    private a() {
    }

    public static o a(o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        p pVar = new p(gson);
        pVar.c(new f(), LocalDate.class);
        pVar.c(new e(), Instant.class);
        m mVar = new m("paymentType", j.class, false, true);
        mVar.c(j.a.class, "backup_card");
        mVar.c(j.b.class, "FALLBACK_SUBTYPE_LABEL");
        Intrinsics.checkNotNullExpressionValue(mVar, "registerFallbackSubtype(...)");
        ArrayList arrayList = pVar.e;
        arrayList.add(mVar);
        m mVar2 = new m("type", ac5.o.class, false, true);
        mVar2.c(n.class, "REVOLUT_POCKET");
        mVar2.c(ac5.m.class, "DIRECT_DEBIT");
        mVar2.c(l.class, "BACKUP_CARD");
        Intrinsics.checkNotNullExpressionValue(mVar2, "registerSubtype(...)");
        arrayList.add(mVar2);
        m mVar3 = new m("paymentType", w.class, false, true);
        mVar3.c(u.class, "REVOLUT_POCKET");
        mVar3.c(t.class, "DIRECT_DEBIT");
        mVar3.c(s.class, "BACKUP_CARD");
        mVar3.c(v.class, "FALLBACK_SUBTYPE_LABEL");
        Intrinsics.checkNotNullExpressionValue(mVar3, "registerFallbackSubtype(...)");
        arrayList.add(mVar3);
        m mVar4 = new m("type", ac5.j.class, false, false);
        mVar4.c(h.class, "STATEMENT_BALANCE");
        mVar4.c(g.class, "MIN_REPAYMENT");
        mVar4.c(ac5.f.class, "FIXED");
        mVar4.c(i.class, "FALLBACK_SUBTYPE_LABEL");
        Intrinsics.checkNotNullExpressionValue(mVar4, "registerFallbackSubtype(...)");
        arrayList.add(mVar4);
        m mVar5 = new m("paymentType", wb5.f.class, false, true);
        mVar5.c(f.a.class, "backup_card");
        mVar5.c(f.b.class, "FALLBACK_SUBTYPE_LABEL");
        Intrinsics.checkNotNullExpressionValue(mVar5, "registerFallbackSubtype(...)");
        arrayList.add(mVar5);
        o oVarB = pVar.b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }
}
