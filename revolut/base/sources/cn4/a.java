package cn4;

import he0.f;
import he0.i;
import he0.m;
import io4.b;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import kg.o;
import kg.p;
import kotlin.jvm.internal.Intrinsics;
import nx4.r0;
import ro4.c;
import yn4.d;
import yn4.e;
import yn4.g;
import yn4.h;
import yn4.j;
import yn4.k;
import yn4.l;

/* JADX INFO: loaded from: classes13.dex */
public final class a {
    private a() {
    }

    public static o a(o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        gson.getClass();
        p pVar = new p(gson);
        Intrinsics.checkNotNullExpressionValue(pVar, "newBuilder(...)");
        r0.a(pVar);
        pVar.c(new f(), LocalDate.class);
        pVar.c(new i(), LocalDateTime.class);
        pVar.c(new he0.o(), ZonedDateTime.class);
        m mVar = new m("reason", l.class, true, true);
        mVar.c(yn4.f.class, "CC_HAS_ACTIVE_FORBEARANCE");
        mVar.c(j.class, "CC_EXCEEDED_MAX_TDPD");
        mVar.c(yn4.i.class, "CC_IS_LATE");
        mVar.c(e.class, "CC_EXCEEDED_BALANCE_UTILIZATION");
        mVar.c(h.class, "CC_IS_DEACTIVATING");
        mVar.c(d.class, "CURRENT_DATE_OUTSIDE_GRACE_PERIOD");
        mVar.c(g.class, "INSUFFICIENT_REMAINING_STATEMENT_BALANCE");
        mVar.c(k.class, "FALLBACK_SUBTYPE_LABEL");
        Intrinsics.checkNotNullExpressionValue(mVar, "registerFallbackSubtype(...)");
        ArrayList arrayList = pVar.e;
        arrayList.add(mVar);
        m mVar2 = new m("type", ro4.d.class, true, false);
        mVar2.c(c.class, "REPAYMENT_PREFERENCE");
        Intrinsics.checkNotNullExpressionValue(mVar2, "registerSubtype(...)");
        arrayList.add(mVar2);
        m mVar3 = new m("feature", on4.k.class, true, true);
        mVar3.c(on4.i.class, "MOVE_MONEY");
        mVar3.c(on4.j.class, "FALLBACK_SUBTYPE_LABEL");
        Intrinsics.checkNotNullExpressionValue(mVar3, "registerFallbackSubtype(...)");
        arrayList.add(mVar3);
        m mVar4 = new m("type", io4.e.class, true, false);
        mVar4.c(io4.d.class, "LABELS");
        mVar4.c(b.class, "ACTION");
        mVar4.c(io4.c.class, "ICON_WITH_LABEL");
        Intrinsics.checkNotNullExpressionValue(mVar4, "registerSubtype(...)");
        arrayList.add(mVar4);
        m mVar5 = new m("type", io4.k.class, true, false);
        mVar5.c(io4.h.class, "CONTEXTUAL");
        mVar5.c(io4.i.class, "DEEPLINK");
        mVar5.c(io4.j.class, "DIALOGUE");
        Intrinsics.checkNotNullExpressionValue(mVar5, "registerSubtype(...)");
        arrayList.add(mVar5);
        o oVarB = pVar.b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }
}
