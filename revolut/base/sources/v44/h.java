package v44;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f285948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f285949b;

    public h(String documentId, ArrayList selectedClauses) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        Intrinsics.checkNotNullParameter(selectedClauses, "selectedClauses");
        this.f285948a = documentId;
        this.f285949b = selectedClauses;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f285948a, hVar.f285948a) && this.f285949b.equals(hVar.f285949b);
    }

    public final int hashCode() {
        return this.f285949b.hashCode() + (this.f285948a.hashCode() * 31);
    }
}
