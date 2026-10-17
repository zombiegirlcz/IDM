package x04;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Lx04/d;", "Lx04/g;", "", "toString", "()Ljava/lang/String;", "Lx04/a;", "a", "Lx04/a;", "()Lx04/a;", "document", "Lx04/b;", "b", "Lx04/b;", "()Lx04/b;", "missingOptionalDocumentConfirmationPopup", "Lx04/e;", "c", "Lx04/e;", "()Lx04/e;", "successPopup", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("document")
    @NotNull
    private final a document;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("missingOptionalDocumentConfirmationPopup")
    private final b missingOptionalDocumentConfirmationPopup;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("successPopup")
    @NotNull
    private final e successPopup;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getDocument() {
        return this.document;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getMissingOptionalDocumentConfirmationPopup() {
        return this.missingOptionalDocumentConfirmationPopup;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e getSuccessPopup() {
        return this.successPopup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.document, dVar.document) && Intrinsics.f(this.missingOptionalDocumentConfirmationPopup, dVar.missingOptionalDocumentConfirmationPopup) && Intrinsics.f(this.successPopup, dVar.successPopup);
    }

    public final int hashCode() {
        int iHashCode = this.document.hashCode() * 31;
        b bVar = this.missingOptionalDocumentConfirmationPopup;
        return this.successPopup.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }
}
