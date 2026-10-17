package a9d;

import com.revolut.core.model.faq.FaqNodeBase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FaqNodeBase f2412a;

    public k(FaqNodeBase node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.f2412a = node;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f2412a, ((k) obj2).f2412a);
    }

    public final int hashCode() {
        return this.f2412a.hashCode();
    }
}
