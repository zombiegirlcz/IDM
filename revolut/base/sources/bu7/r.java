package bu7;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new br4.e(25))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f18734c;

    public /* synthetic */ r(int i, String str, String str2, i0 i0Var) {
        if (7 != (i & 7)) {
            j1.f(p.f18730a.getDescriptor(), i, 7);
            throw null;
        }
        this.f18732a = str;
        this.f18733b = str2;
        this.f18734c = i0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f18732a, rVar.f18732a) && Intrinsics.f(this.f18733b, rVar.f18733b) && Intrinsics.f(this.f18734c, rVar.f18734c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f18732a.hashCode() * 31, 31, this.f18733b);
        i0 i0Var = this.f18734c;
        return iC + (i0Var == null ? 0 : i0Var.hashCode());
    }

    public r(String name, String value, i0 i0Var) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f18732a = name;
        this.f18733b = value;
        this.f18734c = i0Var;
    }
}
