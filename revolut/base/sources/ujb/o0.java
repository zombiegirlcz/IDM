package ujb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class o0 {

    @NotNull
    public static final n0 Companion = new n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f280576b;

    public /* synthetic */ o0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(m0.f280570a.getDescriptor(), i, 3);
            throw null;
        }
        this.f280575a = str;
        this.f280576b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.f280575a, o0Var.f280575a) && Intrinsics.f(this.f280576b, o0Var.f280576b);
    }

    public final int hashCode() {
        return this.f280576b.hashCode() + (this.f280575a.hashCode() * 31);
    }

    public o0(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f280575a = key;
        this.f280576b = value;
    }
}
