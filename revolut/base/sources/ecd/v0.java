package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class v0 {

    @NotNull
    public static final u0 Companion = new u0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124687b;

    public /* synthetic */ v0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(t0.f124673a.getDescriptor(), i, 3);
            throw null;
        }
        this.f124686a = str;
        this.f124687b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return Intrinsics.f(this.f124686a, v0Var.f124686a) && Intrinsics.f(this.f124687b, v0Var.f124687b);
    }

    public final int hashCode() {
        int iHashCode = this.f124686a.hashCode() * 31;
        String str = this.f124687b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public v0(String title, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f124686a = title;
        this.f124687b = str;
    }
}
