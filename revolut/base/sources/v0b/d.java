package v0b;

import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import le.u1;
import org.jetbrains.annotations.NotNull;
import xe0.e;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f284776b = r0.k(new Pair("CRYPTO", c1b.c.CRYPTO), new Pair("STOCKS", c1b.c.STOCKS), new Pair("REVX", c1b.c.REVX));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f284777a;

    public d(e storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f284777a = storage;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static String b(c1b.c cVar, String str) {
        return j6.a.s("advanced_charts_", u1.g(cVar, f284776b), "_", str, "_key");
    }

    public final Set a(c1b.c identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        String strB = b(identifier, "INDICATORS");
        return (Set) this.f284777a.v0(h0.f322473a, strB, kii.e.o(d1b.c.class, KTypeProjection.INSTANCE, Set.class));
    }
}
