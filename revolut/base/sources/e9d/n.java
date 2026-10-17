package e9d;

import com.revolut.core.model.faq.FaqNodeBase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FaqNodeBase f123958a;

    public n(FaqNodeBase node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.f123958a = node;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f123958a, ((n) obj2).f123958a);
    }

    public final int hashCode() {
        return this.f123958a.hashCode();
    }
}
