package tck;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f269857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f269858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f269859c;
    public final int d;

    public /* synthetic */ c(int i, int i2, long j2, long j3, String str) {
        if (15 != (i & 15)) {
            j1.f(a.f269856a.getDescriptor(), i, 15);
            throw null;
        }
        this.f269857a = str;
        this.f269858b = j2;
        this.f269859c = j3;
        this.d = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f269857a, cVar.f269857a) && this.f269858b == cVar.f269858b && this.f269859c == cVar.f269859c && this.d == cVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + a0.d.c(a0.d.c(this.f269857a.hashCode() * 31, 31, this.f269858b), 31, this.f269859c);
    }
}
