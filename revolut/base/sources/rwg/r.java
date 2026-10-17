package rwg;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f257938c = {null, yhm.j.c(yhm.k.PUBLICATION, new rr4.a(28))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f257940b;

    public /* synthetic */ r(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(p.f257937a.getDescriptor(), i, 3);
            throw null;
        }
        this.f257939a = str;
        this.f257940b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f257939a, rVar.f257939a) && Intrinsics.f(this.f257940b, rVar.f257940b);
    }

    public final int hashCode() {
        return this.f257940b.hashCode() + (this.f257939a.hashCode() * 31);
    }
}
