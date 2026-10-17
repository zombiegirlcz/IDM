package hyd;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class s0 {

    @NotNull
    public static final r0 Companion = new r0();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new hul.c(24))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f156829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f156830c;

    public /* synthetic */ s0(int i, String str, String str2, List list) {
        if (5 != (i & 5)) {
            j1.f(q0.f156824a.getDescriptor(), i, 5);
            throw null;
        }
        this.f156828a = str;
        if ((i & 2) == 0) {
            this.f156829b = null;
        } else {
            this.f156829b = str2;
        }
        this.f156830c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return Intrinsics.f(this.f156828a, s0Var.f156828a) && Intrinsics.f(this.f156829b, s0Var.f156829b) && Intrinsics.f(this.f156830c, s0Var.f156830c);
    }

    public final int hashCode() {
        int iHashCode = this.f156828a.hashCode() * 31;
        String str = this.f156829b;
        return this.f156830c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
