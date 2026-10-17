package xn6;

import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExternalInstitution f307323a;

    public h(ExternalInstitution institution) {
        Intrinsics.checkNotNullParameter(institution, "institution");
        this.f307323a = institution;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f307323a, ((h) obj2).f307323a);
    }

    public final int hashCode() {
        return this.f307323a.hashCode();
    }
}
