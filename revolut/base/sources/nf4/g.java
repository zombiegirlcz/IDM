package nf4;

import com.revolut.feature.credit.application.plugins.api.models.config.DocumentViewerScreenConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f214808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final su3.a f214809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DocumentViewerScreenConfig f214810c;

    public g(String documentId, su3.a document, DocumentViewerScreenConfig screenConfig) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        this.f214808a = documentId;
        this.f214809b = document;
        this.f214810c = screenConfig;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f214808a, gVar.f214808a) && Intrinsics.f(this.f214809b, gVar.f214809b) && Intrinsics.f(this.f214810c, gVar.f214810c);
    }

    public final int hashCode() {
        return this.f214810c.hashCode() + ((this.f214809b.hashCode() + (this.f214808a.hashCode() * 31)) * 31);
    }
}
