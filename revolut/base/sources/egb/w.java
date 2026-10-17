package egb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class w {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f125621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f125622b;

    public /* synthetic */ w(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(u.f125620a.getDescriptor(), i, 3);
            throw null;
        }
        this.f125621a = str;
        this.f125622b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f125621a, wVar.f125621a) && Intrinsics.f(this.f125622b, wVar.f125622b);
    }

    public final int hashCode() {
        return this.f125622b.hashCode() + (this.f125621a.hashCode() * 31);
    }
}
