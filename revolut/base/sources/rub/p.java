package rub;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class p {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257527a;

    public /* synthetic */ p(int i, String str) {
        if (1 == (i & 1)) {
            this.f257527a = str;
        } else {
            j1.f(n.f257526a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f257527a, ((p) obj2).f257527a);
    }

    public final int hashCode() {
        return this.f257527a.hashCode();
    }
}
