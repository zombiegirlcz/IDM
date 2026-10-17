package mth;

import com.revolut.shared.feature.workflow.engine.api.models.workflow.DocumentGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f208833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DocumentGroup f208834b;

    public j(wi0.b selectedCitizenship, DocumentGroup selectedDocumentGroup) {
        Intrinsics.checkNotNullParameter(selectedCitizenship, "selectedCitizenship");
        Intrinsics.checkNotNullParameter(selectedDocumentGroup, "selectedDocumentGroup");
        this.f208833a = selectedCitizenship;
        this.f208834b = selectedDocumentGroup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f208833a, jVar.f208833a) && Intrinsics.f(this.f208834b, jVar.f208834b);
    }

    public final int hashCode() {
        return this.f208834b.hashCode() + (this.f208833a.f297794a.hashCode() * 31);
    }
}
