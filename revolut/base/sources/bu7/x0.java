package bu7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class x0 {

    @NotNull
    public static final w0 Companion = new w0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18749c;

    public /* synthetic */ x0(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(v0.f18743a.getDescriptor(), i, 7);
            throw null;
        }
        this.f18747a = str;
        this.f18748b = str2;
        this.f18749c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj2;
        return Intrinsics.f(this.f18747a, x0Var.f18747a) && Intrinsics.f(this.f18748b, x0Var.f18748b) && Intrinsics.f(this.f18749c, x0Var.f18749c);
    }

    public final int hashCode() {
        int iHashCode = this.f18747a.hashCode() * 31;
        String str = this.f18748b;
        return this.f18749c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public x0(String name, String str, String description) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f18747a = name;
        this.f18748b = str;
        this.f18749c = description;
    }
}
