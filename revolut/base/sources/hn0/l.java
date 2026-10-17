package hn0;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import lm0.o;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    public static void a(KClass value) {
        Intrinsics.checkNotNullParameter(value, "value");
        p0 p0Var = o0.f186429a;
        if (!Intrinsics.f(value, p0Var.b(lm0.a.class)) && !Intrinsics.f(value, p0Var.b(lm0.b.class)) && !Intrinsics.f(value, p0Var.b(lm0.c.class)) && !Intrinsics.f(value, p0Var.b(lm0.d.class)) && !Intrinsics.f(value, p0Var.b(lm0.e.class)) && !Intrinsics.f(value, p0Var.b(lm0.f.class)) && !Intrinsics.f(value, p0Var.b(lm0.g.class)) && !Intrinsics.f(value, p0Var.b(lm0.h.class)) && !Intrinsics.f(value, p0Var.b(lm0.i.class)) && !Intrinsics.f(value, p0Var.b(lm0.j.class)) && !Intrinsics.f(value, p0Var.b(lm0.k.class)) && !Intrinsics.f(value, p0Var.b(lm0.l.class)) && !Intrinsics.f(value, p0Var.b(lm0.m.class)) && !Intrinsics.f(value, p0Var.b(o.class)) && !Intrinsics.f(value, p0Var.b(lm0.n.class))) {
            throw new IllegalStateException(j6.a.q("Alias could not be found for ", value.e()));
        }
    }

    public static String b(KClass value) {
        Intrinsics.checkNotNullParameter(value, "value");
        p0 p0Var = o0.f186429a;
        if (Intrinsics.f(value, p0Var.b(lm0.a.class))) {
            return "ATO";
        }
        if (Intrinsics.f(value, p0Var.b(lm0.b.class))) {
            return "AT";
        }
        if (Intrinsics.f(value, p0Var.b(lm0.c.class))) {
            return "BAT";
        }
        if (Intrinsics.f(value, p0Var.b(lm0.d.class))) {
            return "BRC";
        }
        if (Intrinsics.f(value, p0Var.b(lm0.e.class))) {
            return "ED";
        }
        if (Intrinsics.f(value, p0Var.b(lm0.f.class))) {
            return "PC";
        }
        if (Intrinsics.f(value, p0Var.b(lm0.g.class))) {
            return "PCL";
        }
        if (Intrinsics.f(value, p0Var.b(lm0.h.class))) {
            return "PACT";
        }
        if (Intrinsics.f(value, p0Var.b(lm0.i.class))) {
            return "PID";
        }
        if (Intrinsics.f(value, p0Var.b(lm0.j.class))) {
            return "RC";
        }
        if (Intrinsics.f(value, p0Var.b(lm0.k.class))) {
            return "SED";
        }
        if (Intrinsics.f(value, p0Var.b(lm0.l.class))) {
            return "SRC";
        }
        if (Intrinsics.f(value, p0Var.b(lm0.m.class))) {
            return "ST";
        }
        if (Intrinsics.f(value, p0Var.b(o.class))) {
            return "STO";
        }
        if (Intrinsics.f(value, p0Var.b(lm0.n.class))) {
            return "STD";
        }
        throw new IllegalStateException("Alias could not be bound");
    }
}
