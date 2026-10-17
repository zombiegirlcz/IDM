package m05;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class b0 {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f201053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f201054b;

    public /* synthetic */ b0(int i, String str, Integer num) {
        if (3 != (i & 3)) {
            j1.f(z.f201088a.getDescriptor(), i, 3);
            throw null;
        }
        this.f201053a = str;
        this.f201054b = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f201053a, b0Var.f201053a) && Intrinsics.f(this.f201054b, b0Var.f201054b);
    }

    public final int hashCode() {
        int iHashCode = this.f201053a.hashCode() * 31;
        Integer num = this.f201054b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public b0(String snapshotDate, Integer num) {
        Intrinsics.checkNotNullParameter(snapshotDate, "snapshotDate");
        this.f201053a = snapshotDate;
        this.f201054b = num;
    }
}
