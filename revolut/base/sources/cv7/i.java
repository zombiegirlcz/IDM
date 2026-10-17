package cv7;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_embedded.api.models.RemoteDocument;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f109302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RemoteDocument f109303b;

    public i(TextLocalisedClause name, RemoteDocument document) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(document, "document");
        this.f109302a = name;
        this.f109303b = document;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f109302a.equals(iVar.f109302a) && Intrinsics.f(this.f109303b, iVar.f109303b);
    }

    public final int hashCode() {
        return this.f109303b.hashCode() + (this.f109302a.hashCode() * 31);
    }
}
