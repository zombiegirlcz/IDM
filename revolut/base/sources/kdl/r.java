package kdl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f182919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f182920b;

    public /* synthetic */ r(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(p.f182918a.getDescriptor(), i, 3);
            throw null;
        }
        this.f182919a = str;
        this.f182920b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f182919a, rVar.f182919a) && Intrinsics.f(this.f182920b, rVar.f182920b);
    }

    public final int hashCode() {
        return this.f182920b.hashCode() + (this.f182919a.hashCode() * 31);
    }
}
