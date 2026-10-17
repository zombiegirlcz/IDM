package vx0;

import aw0.v1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1 f292768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f292769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f292770c;
    public final int d;

    public a(v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        this.f292768a = colorScheme;
        this.f292769b = i;
        this.f292770c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f292768a == aVar.f292768a && this.f292769b == aVar.f292769b && this.f292770c == aVar.f292770c && this.d == aVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + j6.a.b(this.f292770c, j6.a.b(this.f292769b, this.f292768a.hashCode() * 31, 31), 31);
    }
}
