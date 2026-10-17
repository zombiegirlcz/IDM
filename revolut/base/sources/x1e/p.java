package x1e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class p {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f302389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f302390b;

    public /* synthetic */ p(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(n.f302388a.getDescriptor(), i, 3);
            throw null;
        }
        this.f302389a = str;
        this.f302390b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f302389a, pVar.f302389a) && Intrinsics.f(this.f302390b, pVar.f302390b);
    }

    public final int hashCode() {
        return this.f302390b.hashCode() + (this.f302389a.hashCode() * 31);
    }

    public p(String id10, String name) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f302389a = id10;
        this.f302390b = name;
    }
}
