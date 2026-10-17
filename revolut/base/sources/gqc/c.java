package gqc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145621b;

    public /* synthetic */ c(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(a.f145615a.getDescriptor(), i, 3);
            throw null;
        }
        this.f145620a = str;
        this.f145621b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f145620a, cVar.f145620a) && Intrinsics.f(this.f145621b, cVar.f145621b);
    }

    public final int hashCode() {
        return this.f145621b.hashCode() + (this.f145620a.hashCode() * 31);
    }
}
