package lol;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f197472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f197473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f197474c;

    public j(List items, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f197472a = items;
        this.f197473b = z;
        this.f197474c = z3;
    }

    @Override // jki.n
    public final List c() {
        return this.f197472a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f197472a, jVar.f197472a) && this.f197473b == jVar.f197473b && this.f197474c == jVar.f197474c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f197474c) + j6.a.c(this.f197472a.hashCode() * 31, 31, this.f197473b);
    }
}
