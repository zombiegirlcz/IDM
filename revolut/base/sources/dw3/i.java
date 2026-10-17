package dw3;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements e4m.e {
    public static kg.o a() {
        h.Companion.getClass();
        kg.p pVar = new kg.p();
        he0.m mVar = new he0.m("type", g24.h.class, true, false);
        mVar.c(g24.e.class, "RESUME");
        mVar.c(g24.c.class, "CANCEL");
        mVar.c(g24.d.class, "DEEPLINK");
        mVar.c(g24.f.class, "POPUP");
        mVar.c(g24.g.class, "PROMPT");
        Intrinsics.checkNotNullExpressionValue(mVar, "registerSubtype(...)");
        ArrayList arrayList = pVar.e;
        arrayList.add(mVar);
        he0.m mVar2 = new he0.m("type", h24.d.class, true, false);
        mVar2.c(h24.c.class, "START_APPLICATION");
        mVar2.c(h24.b.class, "DEEPLINK");
        Intrinsics.checkNotNullExpressionValue(mVar2, "registerSubtype(...)");
        arrayList.add(mVar2);
        arrayList.add(f24.c.a());
        arrayList.add(f24.l.a());
        kg.o oVarB = pVar.b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }

    @Override // phm.a
    public final Object get() {
        return a();
    }
}
