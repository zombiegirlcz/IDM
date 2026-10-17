package jkl;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class j2 {

    @NotNull
    public static final i2 Companion = new i2();
    public static final Lazy[] e = {null, null, yhm.j.c(yhm.k.PUBLICATION, new jj9.b(13)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f175302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f175303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f175304c;
    public final long d;

    public /* synthetic */ j2(int i, String str, String str2, List list, long j2) {
        if (15 != (i & 15)) {
            qlm.j1.f(h2.f175286a.getDescriptor(), i, 15);
            throw null;
        }
        this.f175302a = str;
        this.f175303b = str2;
        this.f175304c = list;
        this.d = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj2;
        return Intrinsics.f(this.f175302a, j2Var.f175302a) && Intrinsics.f(this.f175303b, j2Var.f175303b) && Intrinsics.f(this.f175304c, j2Var.f175304c) && this.d == j2Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + p.a.d(p.a.c(this.f175302a.hashCode() * 31, 31, this.f175303b), 31, this.f175304c);
    }
}
