package i06;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f157296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f157297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f157298c;

    public k(aim.e items, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f157296a = items;
        this.f157297b = z;
        this.f157298c = z3;
    }

    @Override // cli.p
    public final List c() {
        return this.f157296a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f157296a, kVar.f157296a) && this.f157297b == kVar.f157297b && this.f157298c == kVar.f157298c;
    }

    public final int hashCode() {
        return j6.a.c(j6.a.c(this.f157296a.hashCode() * 31, 31, this.f157297b), 31, this.f157298c);
    }
}
