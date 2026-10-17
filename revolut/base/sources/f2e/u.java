package f2e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131722b;

    public /* synthetic */ u(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(s.f131707a.getDescriptor(), i, 3);
            throw null;
        }
        this.f131721a = str;
        this.f131722b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f131721a, uVar.f131721a) && Intrinsics.f(this.f131722b, uVar.f131722b);
    }

    public final int hashCode() {
        return this.f131722b.hashCode() + (this.f131721a.hashCode() * 31);
    }

    public u(String id10, String name) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f131721a = id10;
        this.f131722b = name;
    }
}
