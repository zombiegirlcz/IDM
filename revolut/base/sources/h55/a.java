package h55;

import he0.f;
import he0.i;
import he0.m;
import i55.f0;
import i55.g0;
import i55.q;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import kg.o;
import kg.p;
import kotlin.jvm.internal.Intrinsics;
import pt3.d;

/* JADX INFO: loaded from: classes13.dex */
public final class a {
    private a() {
    }

    public static o a(o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        p pVar = new p(gson);
        Intrinsics.checkNotNullExpressionValue(pVar, "newBuilder(...)");
        kt3.a.a(pVar);
        m mVarB = m.b(g0.class, "state");
        mVarB.c(g0.f.class, "PLANNED");
        mVarB.c(g0.c.class, "HEALTHY");
        mVarB.c(g0.g.class, "REPAID");
        mVarB.c(g0.d.class, "OUTSTANDING");
        mVarB.c(g0.e.class, "OVERDUE");
        mVarB.c(g0.b.class, "FORBEARANCE");
        mVarB.c(g0.h.class, "TERMINATED");
        mVarB.c(g0.a.class, "CANCELLED");
        Intrinsics.checkNotNullExpressionValue(mVarB, "registerSubtype(...)");
        ArrayList arrayList = pVar.e;
        arrayList.add(mVarB);
        m mVarB2 = m.b(f0.b.class, "breakdownType");
        mVarB2.c(f0.b.C0909b.class, "HEALTHY");
        mVarB2.c(f0.b.d.class, "UNHEALTHY_PARTIAL");
        mVarB2.c(f0.b.c.class, "UNHEALTHY_FULL");
        Intrinsics.checkNotNullExpressionValue(mVarB2, "registerSubtype(...)");
        arrayList.add(mVarB2);
        m mVarB3 = m.b(q.class, "type");
        mVarB3.c(q.c.class, "INSURED");
        mVarB3.c(q.a.class, "ELIGIBLE");
        mVarB3.c(q.b.class, "INELIGIBLE");
        Intrinsics.checkNotNullExpressionValue(mVarB3, "registerSubtype(...)");
        arrayList.add(mVarB3);
        arrayList.add(d.a());
        pVar.c(new f(), LocalDate.class);
        pVar.c(new i(), LocalDateTime.class);
        pVar.c(new he0.o(), ZonedDateTime.class);
        o oVarB = pVar.b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }
}
