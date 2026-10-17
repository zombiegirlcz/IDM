package jp9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f177234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f177235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f177236c;

    public /* synthetic */ c(int i, String str, String str2, long j2) {
        if (7 != (i & 7)) {
            j1.f(a.f177233a.getDescriptor(), i, 7);
            throw null;
        }
        this.f177234a = str;
        this.f177235b = j2;
        this.f177236c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f177234a, cVar.f177234a) && this.f177235b == cVar.f177235b && Intrinsics.f(this.f177236c, cVar.f177236c);
    }

    public final int hashCode() {
        return this.f177236c.hashCode() + a0.d.c(this.f177234a.hashCode() * 31, 31, this.f177235b);
    }
}
