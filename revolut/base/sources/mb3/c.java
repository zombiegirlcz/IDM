package mb3;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements e4m.e {
    public static kg.o a() {
        b.Companion.getClass();
        kg.p pVar = new kg.p();
        pVar.c(new he0.a(), DateTime.class);
        kg.o oVarB = pVar.b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }

    @Override // phm.a
    public final Object get() {
        return a();
    }
}
