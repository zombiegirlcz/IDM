package fvg;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f138421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f138422b;

    public /* synthetic */ c(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(a.f138420a.getDescriptor(), i, 3);
            throw null;
        }
        this.f138421a = str;
        this.f138422b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f138421a, cVar.f138421a) && Intrinsics.f(this.f138422b, cVar.f138422b);
    }

    public final int hashCode() {
        return this.f138422b.hashCode() + (this.f138421a.hashCode() * 31);
    }
}
