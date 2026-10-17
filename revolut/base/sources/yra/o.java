package yra;

import com.revolut.feature.transfer.core.api.interactor.ReferenceData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReferenceData f316183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f316184b;

    public o(ReferenceData referenceData, String str) {
        Intrinsics.checkNotNullParameter(referenceData, "referenceData");
        this.f316183a = referenceData;
        this.f316184b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f316183a, oVar.f316183a) && Intrinsics.f(this.f316184b, oVar.f316184b);
    }

    public final int hashCode() {
        int iHashCode = this.f316183a.hashCode() * 31;
        String str = this.f316184b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
