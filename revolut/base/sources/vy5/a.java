package vy5;

import com.revolut.feature.tab.accounts.api.model.ProductAccountListAction;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f293130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f293131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProductAccountListAction f293132c;
    public final boolean d;

    public a(boolean z, List features, ProductAccountListAction productAccountListAction, boolean z3) {
        Intrinsics.checkNotNullParameter(features, "features");
        this.f293130a = z;
        this.f293131b = features;
        this.f293132c = productAccountListAction;
        this.d = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f293130a == aVar.f293130a && Intrinsics.f(this.f293131b, aVar.f293131b) && Intrinsics.f(this.f293132c, aVar.f293132c) && this.d == aVar.d;
    }

    public final int hashCode() {
        int iD = p.a.d(Boolean.hashCode(this.f293130a) * 31, 31, this.f293131b);
        ProductAccountListAction productAccountListAction = this.f293132c;
        return Boolean.hashCode(this.d) + ((iD + (productAccountListAction == null ? 0 : productAccountListAction.hashCode())) * 31);
    }
}
