package ff4;

import com.revolut.feature.credit.application.plugins.api.models.config.DocumentViewerScreenConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f134736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final su3.a f134737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DocumentViewerScreenConfig f134738c;

    public p(String documentId, su3.a document, DocumentViewerScreenConfig screenConfig) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        this.f134736a = documentId;
        this.f134737b = document;
        this.f134738c = screenConfig;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f134736a, pVar.f134736a) && Intrinsics.f(this.f134737b, pVar.f134737b) && Intrinsics.f(this.f134738c, pVar.f134738c);
    }

    public final int hashCode() {
        return this.f134738c.hashCode() + ((this.f134737b.hashCode() + (this.f134736a.hashCode() * 31)) * 31);
    }
}
