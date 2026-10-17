package bec;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f14780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u6c.y f14781c;

    public h(List paymentMethodList, List favouritePocketIdList, u6c.y savingsNameType) {
        Intrinsics.checkNotNullParameter(paymentMethodList, "paymentMethodList");
        Intrinsics.checkNotNullParameter(favouritePocketIdList, "favouritePocketIdList");
        Intrinsics.checkNotNullParameter(savingsNameType, "savingsNameType");
        this.f14779a = paymentMethodList;
        this.f14780b = favouritePocketIdList;
        this.f14781c = savingsNameType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f14779a, hVar.f14779a) && Intrinsics.f(this.f14780b, hVar.f14780b) && Intrinsics.f(this.f14781c, hVar.f14781c);
    }

    public final int hashCode() {
        return this.f14781c.hashCode() + p.a.d(this.f14779a.hashCode() * 31, 31, this.f14780b);
    }
}
