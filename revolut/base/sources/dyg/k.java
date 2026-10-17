package dyg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f121117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f121118b;

    public k(aim.e items, i headerData) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerData, "headerData");
        this.f121117a = items;
        this.f121118b = headerData;
    }

    @Override // cli.p
    public final List c() {
        return this.f121117a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f121117a, kVar.f121117a) && Intrinsics.f(this.f121118b, kVar.f121118b);
    }

    public final int hashCode() {
        return this.f121118b.hashCode() + (this.f121117a.hashCode() * 31);
    }
}
