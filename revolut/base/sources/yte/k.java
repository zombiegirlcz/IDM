package yte;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class k {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f316717a;

    public /* synthetic */ k(int i, j jVar) {
        if (1 == (i & 1)) {
            this.f316717a = jVar;
        } else {
            j1.f(f.f316712a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f316717a, ((k) obj2).f316717a);
    }

    public final int hashCode() {
        return this.f316717a.hashCode();
    }
}
