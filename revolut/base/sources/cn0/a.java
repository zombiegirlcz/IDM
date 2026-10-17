package cn0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import lm0.m;
import mm0.n;
import mm0.o;
import mm0.p;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static List a(mm0.f remove) {
        Intrinsics.checkNotNullParameter(remove, "remove");
        KClass kClassA = remove.a();
        p0 p0Var = o0.f186429a;
        if (Intrinsics.f(kClassA, p0Var.b(p.class))) {
            return u.c(p0Var.b(m.class));
        }
        if (Intrinsics.f(kClassA, p0Var.b(n.class))) {
            return v.k(p0Var.b(lm0.b.class), p0Var.b(lm0.c.class));
        }
        if (Intrinsics.f(kClassA, p0Var.b(mm0.m.class)) || Intrinsics.f(kClassA, p0Var.b(o.a.class))) {
            throw new IllegalStateException("This type of value can not be mapped");
        }
        throw new IllegalArgumentException(String.valueOf(remove.a().m()));
    }
}
