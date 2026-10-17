package av8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f9952b;

    public k(List docs, wi0.b citizenship) {
        Intrinsics.checkNotNullParameter(docs, "docs");
        Intrinsics.checkNotNullParameter(citizenship, "citizenship");
        this.f9951a = docs;
        this.f9952b = citizenship;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f9951a, kVar.f9951a) && Intrinsics.f(this.f9952b, kVar.f9952b);
    }

    public final int hashCode() {
        return this.f9952b.f297794a.hashCode() + (this.f9951a.hashCode() * 31);
    }
}
