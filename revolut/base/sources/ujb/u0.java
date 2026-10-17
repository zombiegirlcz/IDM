package ujb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class u0 {

    @NotNull
    public static final t0 Companion = new t0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f280592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f280593c;

    public /* synthetic */ u0(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(s0.f280588a.getDescriptor(), i, 7);
            throw null;
        }
        this.f280591a = str;
        this.f280592b = str2;
        this.f280593c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj2;
        return Intrinsics.f(this.f280591a, u0Var.f280591a) && Intrinsics.f(this.f280592b, u0Var.f280592b) && Intrinsics.f(this.f280593c, u0Var.f280593c);
    }

    public final int hashCode() {
        return this.f280593c.hashCode() + p.a.c(this.f280591a.hashCode() * 31, 31, this.f280592b);
    }

    public u0(String type, String title, String description) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f280591a = type;
        this.f280592b = title;
        this.f280593c = description;
    }
}
