package jwd;

import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f178975a;

    public /* synthetic */ c(int i, boolean z) {
        if (1 == (i & 1)) {
            this.f178975a = z;
        } else {
            j1.f(a.f178974a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f178975a == ((c) obj2).f178975a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f178975a);
    }

    public c(boolean z) {
        this.f178975a = z;
    }
}
