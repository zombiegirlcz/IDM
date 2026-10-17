package mth;

import com.revolut.data.model.Data;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.DocumentGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f208830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f208831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DocumentGroup f208832c;

    public i(wi0.b selectedCitizenship, Data applicableDocuments, DocumentGroup documentGroup) {
        Intrinsics.checkNotNullParameter(selectedCitizenship, "selectedCitizenship");
        Intrinsics.checkNotNullParameter(applicableDocuments, "applicableDocuments");
        this.f208830a = selectedCitizenship;
        this.f208831b = applicableDocuments;
        this.f208832c = documentGroup;
    }

    public static i a(i iVar, wi0.b selectedCitizenship, Data applicableDocuments, DocumentGroup documentGroup, int i) {
        if ((i & 1) != 0) {
            selectedCitizenship = iVar.f208830a;
        }
        if ((i & 2) != 0) {
            applicableDocuments = iVar.f208831b;
        }
        if ((i & 4) != 0) {
            documentGroup = iVar.f208832c;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(selectedCitizenship, "selectedCitizenship");
        Intrinsics.checkNotNullParameter(applicableDocuments, "applicableDocuments");
        return new i(selectedCitizenship, applicableDocuments, documentGroup);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f208830a, iVar.f208830a) && Intrinsics.f(this.f208831b, iVar.f208831b) && Intrinsics.f(this.f208832c, iVar.f208832c);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f208831b, this.f208830a.f297794a.hashCode() * 31, 31);
        DocumentGroup documentGroup = this.f208832c;
        return iC + (documentGroup == null ? 0 : documentGroup.hashCode());
    }
}
