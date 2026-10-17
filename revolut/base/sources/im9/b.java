package im9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f162318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f162319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f162320c;
    public final int d;

    public b(List recipients, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(recipients, "recipients");
        this.f162318a = recipients;
        this.f162319b = i;
        this.f162320c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f162318a, bVar.f162318a) && this.f162319b == bVar.f162319b && this.f162320c == bVar.f162320c && this.d == bVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + j6.a.b(this.f162320c, j6.a.b(this.f162319b, this.f162318a.hashCode() * 31, 31), 31);
    }
}
