package ujb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class x0 {

    @NotNull
    public static final w0 Companion = new w0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f280598b;

    public /* synthetic */ x0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(v0.f280595a.getDescriptor(), i, 3);
            throw null;
        }
        this.f280597a = str;
        this.f280598b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj2;
        return Intrinsics.f(this.f280597a, x0Var.f280597a) && Intrinsics.f(this.f280598b, x0Var.f280598b);
    }

    public final int hashCode() {
        return this.f280598b.hashCode() + (this.f280597a.hashCode() * 31);
    }

    public x0(String title, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f280597a = title;
        this.f280598b = description;
    }
}
