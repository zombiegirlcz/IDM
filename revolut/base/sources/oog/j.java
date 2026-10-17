package oog;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f227105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f227107c;

    public j(List items, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f227105a = items;
        this.f227106b = z;
        this.f227107c = z3;
    }

    @Override // cli.p
    public final List c() {
        return this.f227105a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f227105a, jVar.f227105a) && this.f227106b == jVar.f227106b && this.f227107c == jVar.f227107c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227107c) + j6.a.c(this.f227105a.hashCode() * 31, 31, this.f227106b);
    }
}
