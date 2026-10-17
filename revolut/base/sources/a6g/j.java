package a6g;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1692c;

    public j(List items, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f1690a = items;
        this.f1691b = z;
        this.f1692c = z3;
    }

    @Override // cli.p
    public final List c() {
        return this.f1690a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f1690a, jVar.f1690a) && this.f1691b == jVar.f1691b && this.f1692c == jVar.f1692c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1692c) + j6.a.c(this.f1690a.hashCode() * 31, 31, this.f1691b);
    }
}
