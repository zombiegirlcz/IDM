package pf4;

import com.revolut.feature.credit.application.plugins.api.models.config.DocumentViewerScreenConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final su3.a f235446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DocumentViewerScreenConfig f235447c;

    public k(String documentId, su3.a document, DocumentViewerScreenConfig screenConfig) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        this.f235445a = documentId;
        this.f235446b = document;
        this.f235447c = screenConfig;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f235445a, kVar.f235445a) && Intrinsics.f(this.f235446b, kVar.f235446b) && Intrinsics.f(this.f235447c, kVar.f235447c);
    }

    public final int hashCode() {
        return this.f235447c.hashCode() + ((this.f235446b.hashCode() + (this.f235445a.hashCode() * 31)) * 31);
    }
}
