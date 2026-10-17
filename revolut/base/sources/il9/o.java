package il9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f162194b;

    public /* synthetic */ o(int i, String str, int i2) {
        if (3 != (i & 3)) {
            j1.f(m.f162192a.getDescriptor(), i, 3);
            throw null;
        }
        this.f162193a = str;
        this.f162194b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f162193a, oVar.f162193a) && this.f162194b == oVar.f162194b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f162194b) + (this.f162193a.hashCode() * 31);
    }
}
