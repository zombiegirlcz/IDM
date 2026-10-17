package ol0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f226296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f226297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f226298c;
    public final int d;

    public l(List children, boolean z, int i, int i2) {
        Intrinsics.checkNotNullParameter(children, "children");
        this.f226296a = z;
        this.f226297b = i;
        this.f226298c = children;
        this.d = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f226296a == lVar.f226296a && this.f226297b == lVar.f226297b && Intrinsics.f(this.f226298c, lVar.f226298c) && this.d == lVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + p.a.d(j6.a.b(this.f226297b, Boolean.hashCode(this.f226296a) * 31, 31), 31, this.f226298c);
    }
}
