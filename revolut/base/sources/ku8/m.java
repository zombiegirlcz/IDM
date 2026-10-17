package ku8;

import com.revolut.feature.kyc.impl.choosedocument.model.SelectedKycDocs;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectedKycDocs f189744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final my8.o f189745b;

    public m(SelectedKycDocs selectedDocs, my8.o kycDocs) {
        Intrinsics.checkNotNullParameter(selectedDocs, "selectedDocs");
        Intrinsics.checkNotNullParameter(kycDocs, "kycDocs");
        this.f189744a = selectedDocs;
        this.f189745b = kycDocs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f189744a, mVar.f189744a) && Intrinsics.f(this.f189745b, mVar.f189745b);
    }

    public final int hashCode() {
        return this.f189745b.hashCode() + (this.f189744a.hashCode() * 31);
    }
}
