package h43;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f149297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f149298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f149299c;

    public p(List items, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f149297a = items;
        this.f149298b = z;
        this.f149299c = z3;
    }

    @Override // cli.p
    public final List c() {
        return this.f149297a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f149297a, pVar.f149297a) && this.f149298b == pVar.f149298b && this.f149299c == pVar.f149299c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f149299c) + j6.a.c(this.f149297a.hashCode() * 31, 31, this.f149298b);
    }
}
