package fe0;

import e4m.e;
import he0.f;
import he0.g;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import kg.o;
import kg.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c implements e {
    public static o a() {
        p pVar = new p();
        pVar.c(new f(), LocalDate.class);
        pVar.c(new g(), LocalTime.class);
        pVar.c(new he0.e(), Instant.class);
        o oVarB = pVar.b();
        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
        return oVarB;
    }

    @Override // phm.a
    public final Object get() {
        return a();
    }
}
