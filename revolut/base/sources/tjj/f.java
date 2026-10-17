package tjj;

import com.revolut.retail.feature.esim.api.model.EsimDescriptorValue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimDescriptorValue.Link f271798a;

    public f(EsimDescriptorValue.Link parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f271798a = parcel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f271798a, ((f) obj2).f271798a);
    }

    public final int hashCode() {
        return this.f271798a.f100253a.hashCode();
    }
}
