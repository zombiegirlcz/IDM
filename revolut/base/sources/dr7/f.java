package dr7;

import com.revolut.feature.insurance_car.impl.data.model.RequestedDocument;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RequestedDocument f117093a;

    public f(RequestedDocument document) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.f117093a = document;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f117093a, ((f) obj2).f117093a);
    }

    public final int hashCode() {
        return this.f117093a.hashCode();
    }
}
