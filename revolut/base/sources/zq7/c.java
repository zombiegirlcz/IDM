package zq7;

import com.revolut.feature.insurance_car.impl.data.model.RequestedDocument;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RequestedDocument f324411a;

    public c(RequestedDocument document) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.f324411a = document;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f324411a, ((c) obj2).f324411a);
    }

    public final int hashCode() {
        return this.f324411a.hashCode();
    }
}
