package e9d;

import com.revolut.core.model.faq.FaqNodeBase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FaqNodeBase f123956a;

    public l(FaqNodeBase node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.f123956a = node;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f123956a, ((l) obj2).f123956a);
    }

    public final int hashCode() {
        return this.f123956a.hashCode();
    }
}
