package k8d;

import com.revolut.core.model.faq.FaqNodeBase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends com.revolut.feature.shared.help_centre.impl.faq.screens.list.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FaqNodeBase f182116a;

    public j(FaqNodeBase node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.f182116a = node;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f182116a, ((j) obj2).f182116a);
    }

    public final int hashCode() {
        return this.f182116a.hashCode();
    }
}
