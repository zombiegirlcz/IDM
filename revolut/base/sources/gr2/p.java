package gr2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class p {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145855b;

    public /* synthetic */ p(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(n.f145852a.getDescriptor(), i, 3);
            throw null;
        }
        this.f145854a = str;
        this.f145855b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f145854a, pVar.f145854a) && Intrinsics.f(this.f145855b, pVar.f145855b);
    }

    public final int hashCode() {
        return this.f145855b.hashCode() + (this.f145854a.hashCode() * 31);
    }
}
