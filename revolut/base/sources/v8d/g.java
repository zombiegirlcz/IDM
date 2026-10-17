package v8d;

import com.revolut.core.model.faq.FaqNodeBase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FaqNodeBase f286737a;

    public g(FaqNodeBase node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.f286737a = node;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f286737a, ((g) obj2).f286737a);
    }

    public final int hashCode() {
        return this.f286737a.hashCode();
    }
}
