package j05;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f169948b;

    public /* synthetic */ a0(int i, String str, Integer num) {
        if (3 != (i & 3)) {
            j1.f(y.f169981a.getDescriptor(), i, 3);
            throw null;
        }
        this.f169947a = str;
        this.f169948b = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f169947a, a0Var.f169947a) && Intrinsics.f(this.f169948b, a0Var.f169948b);
    }

    public final int hashCode() {
        int iHashCode = this.f169947a.hashCode() * 31;
        Integer num = this.f169948b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
