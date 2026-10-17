package w5b;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class m0 {

    @NotNull
    public static final l0 Companion = new l0();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new w56.a(9))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f294920c;

    public /* synthetic */ m0(int i, String str, String str2, List list) {
        if (7 != (i & 7)) {
            qlm.j1.f(k0.f294894a.getDescriptor(), i, 7);
            throw null;
        }
        this.f294918a = str;
        this.f294919b = str2;
        this.f294920c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f294918a, m0Var.f294918a) && Intrinsics.f(this.f294919b, m0Var.f294919b) && Intrinsics.f(this.f294920c, m0Var.f294920c);
    }

    public final int hashCode() {
        int iHashCode = this.f294918a.hashCode() * 31;
        String str = this.f294919b;
        return this.f294920c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
