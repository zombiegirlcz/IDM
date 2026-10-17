package v8d;

import com.revolut.core.model.faq.FaqNodeBase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FaqNodeBase f286738a;

    public h(FaqNodeBase node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.f286738a = node;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f286738a, ((h) obj2).f286738a);
    }

    public final int hashCode() {
        return this.f286738a.hashCode();
    }
}
