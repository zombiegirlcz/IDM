package du7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class h5 {

    @NotNull
    public static final a5 Companion = new a5();
    public static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new e2(13)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f117699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d5 f117700c;

    public /* synthetic */ h5(int i, String str, List list, d5 d5Var) {
        if (7 != (i & 7)) {
            qlm.j1.f(u4.f117865a.getDescriptor(), i, 7);
            throw null;
        }
        this.f117698a = str;
        this.f117699b = list;
        this.f117700c = d5Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h5)) {
            return false;
        }
        h5 h5Var = (h5) obj2;
        return Intrinsics.f(this.f117698a, h5Var.f117698a) && Intrinsics.f(this.f117699b, h5Var.f117699b) && Intrinsics.f(this.f117700c, h5Var.f117700c);
    }

    public final int hashCode() {
        int iHashCode = this.f117698a.hashCode() * 31;
        List list = this.f117699b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        d5 d5Var = this.f117700c;
        return iHashCode2 + (d5Var != null ? d5Var.hashCode() : 0);
    }
}
