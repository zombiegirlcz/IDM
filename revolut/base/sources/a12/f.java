package a12;

import com.revolut.feature.apm.core.api.product.ApmProduct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmProduct f470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f471b;

    public f(ApmProduct apmProduct, List drafts) {
        Intrinsics.checkNotNullParameter(apmProduct, "apmProduct");
        Intrinsics.checkNotNullParameter(drafts, "drafts");
        this.f470a = apmProduct;
        this.f471b = drafts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f470a, fVar.f470a) && Intrinsics.f(this.f471b, fVar.f471b);
    }

    public final int hashCode() {
        return this.f471b.hashCode() + (this.f470a.hashCode() * 31);
    }
}
