package bs7;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18075b;

    public /* synthetic */ f(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(d.f18073a.getDescriptor(), i, 3);
            throw null;
        }
        this.f18074a = str;
        this.f18075b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f18074a, fVar.f18074a) && Intrinsics.f(this.f18075b, fVar.f18075b);
    }

    public final int hashCode() {
        int iHashCode = this.f18074a.hashCode() * 31;
        String str = this.f18075b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
