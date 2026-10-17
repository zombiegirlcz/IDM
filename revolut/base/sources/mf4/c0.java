package mf4;

import com.revolut.feature.credit.application.plugins.api.models.config.DocumentViewerScreenConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f204845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final su3.a f204846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DocumentViewerScreenConfig f204847c;

    public c0(String documentId, su3.a document, DocumentViewerScreenConfig screenConfig) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        this.f204845a = documentId;
        this.f204846b = document;
        this.f204847c = screenConfig;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f204845a, c0Var.f204845a) && Intrinsics.f(this.f204846b, c0Var.f204846b) && Intrinsics.f(this.f204847c, c0Var.f204847c);
    }

    public final int hashCode() {
        return this.f204847c.hashCode() + ((this.f204846b.hashCode() + (this.f204845a.hashCode() * 31)) * 31);
    }
}
