package hr7;

import com.revolut.feature.insurance_car.impl.data.model.RequestedDocument;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RequestedDocument f154786a;

    public d(RequestedDocument document) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.f154786a = document;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f154786a, ((d) obj2).f154786a);
    }

    public final int hashCode() {
        return this.f154786a.hashCode();
    }
}
