package ujb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class l0 {

    @NotNull
    public static final k0 Companion = new k0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f280569b;

    public /* synthetic */ l0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(j0.f280563a.getDescriptor(), i, 3);
            throw null;
        }
        this.f280568a = str;
        this.f280569b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f280568a, l0Var.f280568a) && Intrinsics.f(this.f280569b, l0Var.f280569b);
    }

    public final int hashCode() {
        return this.f280569b.hashCode() + (this.f280568a.hashCode() * 31);
    }

    public l0(String title, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f280568a = title;
        this.f280569b = description;
    }
}
