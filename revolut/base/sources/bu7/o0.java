package bu7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class o0 extends i0 {

    @NotNull
    public static final n0 Companion = new n0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18729c;

    public /* synthetic */ o0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(m0.f18725a.getDescriptor(), i, 3);
            throw null;
        }
        this.f18728b = str;
        this.f18729c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.f18728b, o0Var.f18728b) && Intrinsics.f(this.f18729c, o0Var.f18729c);
    }

    public final int hashCode() {
        return this.f18729c.hashCode() + (this.f18728b.hashCode() * 31);
    }

    public o0(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f18728b = name;
        this.f18729c = value;
    }
}
