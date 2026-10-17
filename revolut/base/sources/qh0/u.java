package qh0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f246417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f246418b;

    public /* synthetic */ u(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(s.f246416a.getDescriptor(), i, 3);
            throw null;
        }
        this.f246417a = str;
        this.f246418b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f246417a, uVar.f246417a) && Intrinsics.f(this.f246418b, uVar.f246418b);
    }

    public final int hashCode() {
        return this.f246418b.hashCode() + (this.f246417a.hashCode() * 31);
    }

    public u(String id10, String name) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f246417a = id10;
        this.f246418b = name;
    }
}
