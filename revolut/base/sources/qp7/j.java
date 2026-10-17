package qp7;

import com.revolut.feature.insurance_common.data.model.Document;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Document f248306a;

    public j(Document document) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.f248306a = document;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f248306a, ((j) obj2).f248306a);
    }

    public final int hashCode() {
        return this.f248306a.hashCode();
    }
}
