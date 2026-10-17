package ujb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f280559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f280560b;

    public /* synthetic */ g(int i, long j2, String str) {
        if (3 != (i & 3)) {
            j1.f(e.f280551a.getDescriptor(), i, 3);
            throw null;
        }
        this.f280559a = j2;
        this.f280560b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f280559a == gVar.f280559a && Intrinsics.f(this.f280560b, gVar.f280560b);
    }

    public final int hashCode() {
        return this.f280560b.hashCode() + (Long.hashCode(this.f280559a) * 31);
    }

    public g(long j2, String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f280559a = j2;
        this.f280560b = status;
    }
}
