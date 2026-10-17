package k50;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class a1 {

    @NotNull
    public static final a Companion = new a();
    public static final a1 f = new a1(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f181021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f181022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f181023c;
    public final int d;
    public final Lazy e;

    public static final class a {
        private a() {
        }
    }

    public a1() {
        this(0);
    }

    public static a1 a(a1 a1Var, String query, List matches, int i, int i2) {
        boolean z = (i2 & 1) != 0 ? a1Var.f181021a : true;
        if ((i2 & 2) != 0) {
            query = a1Var.f181022b;
        }
        if ((i2 & 4) != 0) {
            matches = a1Var.f181023c;
        }
        if ((i2 & 8) != 0) {
            i = a1Var.d;
        }
        a1Var.getClass();
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(matches, "matches");
        return new a1(i, query, matches, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj2;
        return this.f181021a == a1Var.f181021a && Intrinsics.f(this.f181022b, a1Var.f181022b) && Intrinsics.f(this.f181023c, a1Var.f181023c) && this.d == a1Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + p.a.d(p.a.c(Boolean.hashCode(this.f181021a) * 31, 31, this.f181022b), 31, this.f181023c);
    }

    public a1(int i, String query, List matches, boolean z) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(matches, "matches");
        this.f181021a = z;
        this.f181022b = query;
        this.f181023c = matches;
        this.d = i;
        this.e = yhm.j.b(new jj2.a(this, 24));
    }

    public a1(int i) {
        this(0, "", zhm.f0.f322471a, false);
    }
}
