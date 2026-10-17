package ujb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f280565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f280566c;
    public final int d;

    public /* synthetic */ k(int i, int i2, int i3, int i5, String str) {
        if (15 != (i & 15)) {
            j1.f(i.f280562a.getDescriptor(), i, 15);
            throw null;
        }
        this.f280564a = str;
        this.f280565b = i2;
        this.f280566c = i3;
        this.d = i5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f280564a, kVar.f280564a) && this.f280565b == kVar.f280565b && this.f280566c == kVar.f280566c && this.d == kVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + j6.a.b(this.f280566c, j6.a.b(this.f280565b, this.f280564a.hashCode() * 31, 31), 31);
    }

    public k(String status, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f280564a = status;
        this.f280565b = i;
        this.f280566c = i2;
        this.d = i3;
    }
}
