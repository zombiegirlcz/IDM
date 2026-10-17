package g6g;

import cli.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f140942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f140943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f140944c;

    public d(int i, List bounds, boolean z) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.f140942a = bounds;
        this.f140943b = i;
        this.f140944c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f140942a, dVar.f140942a) && this.f140943b == dVar.f140943b && this.f140944c == dVar.f140944c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f140944c) + j6.a.b(this.f140943b, this.f140942a.hashCode() * 31, 31);
    }
}
