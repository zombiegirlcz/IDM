package ith;

import aii.r;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.DocumentGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DocumentGroup f168387a;

    public g(DocumentGroup selectedDocumentGroup) {
        Intrinsics.checkNotNullParameter(selectedDocumentGroup, "selectedDocumentGroup");
        this.f168387a = selectedDocumentGroup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f168387a, ((g) obj2).f168387a);
    }

    public final int hashCode() {
        return this.f168387a.hashCode();
    }
}
