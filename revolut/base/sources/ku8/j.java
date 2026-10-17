package ku8;

import com.revolut.data.model.Data;
import com.revolut.feature.kyc.impl.choosedocument.model.SelectedKycDocs;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f189740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SelectedKycDocs f189741b;

    public j(Data documents, SelectedKycDocs selectedDocs) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(selectedDocs, "selectedDocs");
        this.f189740a = documents;
        this.f189741b = selectedDocs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f189740a, jVar.f189740a) && Intrinsics.f(this.f189741b, jVar.f189741b);
    }

    public final int hashCode() {
        return this.f189741b.hashCode() + (this.f189740a.hashCode() * 31);
    }
}
