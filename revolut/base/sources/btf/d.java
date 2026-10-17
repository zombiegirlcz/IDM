package btf;

import aii.r;
import com.revolut.feature.transfer_reasons.models.additional_info.AdditionalInfoFieldOption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdditionalInfoFieldOption f18573a;

    public d(AdditionalInfoFieldOption option) {
        Intrinsics.checkNotNullParameter(option, "option");
        this.f18573a = option;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f18573a, ((d) obj2).f18573a);
    }

    public final int hashCode() {
        return this.f18573a.hashCode();
    }
}
