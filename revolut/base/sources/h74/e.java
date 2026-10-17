package h74;

import com.revolut.feature.credit.application.plugins.api.models.config.DocumentViewerScreenConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f149846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final su3.a f149847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DocumentViewerScreenConfig f149848c;

    public e(String documentId, su3.a document, DocumentViewerScreenConfig screenConfig) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        this.f149846a = documentId;
        this.f149847b = document;
        this.f149848c = screenConfig;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f149846a, eVar.f149846a) && Intrinsics.f(this.f149847b, eVar.f149847b) && Intrinsics.f(this.f149848c, eVar.f149848c);
    }

    public final int hashCode() {
        return this.f149848c.hashCode() + ((this.f149847b.hashCode() + (this.f149846a.hashCode() * 31)) * 31);
    }
}
