package tr2;

import kotlin.jvm.internal.Intrinsics;
import rr2.b;

/* JADX INFO: loaded from: classes21.dex */
public abstract class c implements e4m.e {
    public static kg.o a(kg.o gson) {
        a.Companion.getClass();
        Intrinsics.checkNotNullParameter(gson, "gson");
        kg.p pVar = new kg.p(gson);
        he0.m mVar = new he0.m("type", rr2.b.class, false, true);
        mVar.c(b.a.class, "BLOCKED");
        mVar.c(b.c.class, "UNBLOCKED");
        Intrinsics.checkNotNullExpressionValue(mVar, "registerSubtype(...)");
        pVar.e.add(mVar);
        kg.o oVarB = pVar.b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }
}
