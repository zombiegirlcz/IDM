package a9d;

import com.revolut.core.model.faq.FaqNodeBase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FaqNodeBase f2411a;

    public j(FaqNodeBase node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.f2411a = node;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f2411a, ((j) obj2).f2411a);
    }

    public final int hashCode() {
        return this.f2411a.hashCode();
    }
}
