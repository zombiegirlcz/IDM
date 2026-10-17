package t66;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d26.f f268255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s46.c f268256b;

    public /* synthetic */ c(int i, d26.f fVar, s46.c cVar) {
        if (3 != (i & 3)) {
            j1.f(a.f268254a.getDescriptor(), i, 3);
            throw null;
        }
        this.f268255a = fVar;
        this.f268256b = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f268255a, cVar.f268255a) && Intrinsics.f(this.f268256b, cVar.f268256b);
    }

    public final int hashCode() {
        return this.f268256b.hashCode() + (this.f268255a.hashCode() * 31);
    }
}
