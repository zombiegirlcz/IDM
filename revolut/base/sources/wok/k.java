package wok;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f298951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f298952b;

    public k(j jVar, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f298951a = jVar;
        this.f298952b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f298952b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f298951a, kVar.f298951a) && Intrinsics.f(this.f298952b, kVar.f298952b);
    }

    public final int hashCode() {
        j jVar = this.f298951a;
        return this.f298952b.hashCode() + ((jVar == null ? 0 : jVar.hashCode()) * 31);
    }
}
