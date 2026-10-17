package aj9;

import dj9.c0;
import dj9.l;
import dj9.n;
import dj9.q;
import dj9.u;
import dj9.w;
import dj9.x;
import dj9.y;
import he0.m;
import java.util.ArrayList;
import kg.o;
import kg.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private a() {
    }

    public static o a(o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        p pVar = new p(gson);
        m mVarB = m.b(u.class, "status");
        mVarB.c(u.a.class, "off");
        mVarB.c(u.b.class, "on");
        Intrinsics.checkNotNullExpressionValue(mVarB, "registerSubtype(...)");
        ArrayList arrayList = pVar.e;
        arrayList.add(mVarB);
        m mVar = new m("type", q.class, false, true);
        mVar.c(q.a.class, "ENTRY_PROMO");
        mVar.c(q.b.class, "FEE_LIMIT_PROMO");
        mVar.c(q.c.class, "FALLBACK_SUBTYPE_LABEL");
        Intrinsics.checkNotNullExpressionValue(mVar, "registerFallbackSubtype(...)");
        arrayList.add(mVar);
        m mVar2 = new m("type", c0.class, false, true);
        mVar2.c(c0.a.class, "CLOSE_TO_FEE_LIMIT_PROMO");
        mVar2.c(c0.b.class, "FALLBACK_SUBTYPE_LABEL");
        Intrinsics.checkNotNullExpressionValue(mVar2, "registerFallbackSubtype(...)");
        arrayList.add(mVar2);
        m mVar3 = new m("blockReason", y.class, true, true);
        mVar3.c(x.class, "NOT_AVAILABLE");
        mVar3.c(w.class, "FALLBACK_SUBTYPE_LABEL");
        Intrinsics.checkNotNullExpressionValue(mVar3, "registerFallbackSubtype(...)");
        arrayList.add(mVar3);
        m mVarB2 = m.b(n.class, "type");
        mVarB2.c(dj9.m.class, "INTEREST_FEE");
        mVarB2.c(l.class, "FLAT_FEE");
        Intrinsics.checkNotNullExpressionValue(mVarB2, "registerSubtype(...)");
        arrayList.add(mVarB2);
        o oVarB = pVar.b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }
}
