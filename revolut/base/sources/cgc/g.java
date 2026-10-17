package cgc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23914c;
    public final h d;

    public g(String id10, String name, int i, h type) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f23912a = id10;
        this.f23913b = name;
        this.f23914c = i;
        this.d = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f23912a, gVar.f23912a) && Intrinsics.f(this.f23913b, gVar.f23913b) && this.f23914c == gVar.f23914c && this.d == gVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.b(this.f23914c, p.a.c(this.f23912a.hashCode() * 31, 31, this.f23913b), 31);
    }
}
