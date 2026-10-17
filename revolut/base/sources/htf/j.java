package htf;

import com.revolut.feature.transfer_reasons.models.additional_info.AdditionalInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdditionalInfo f155371a;

    public j(AdditionalInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.f155371a = info;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f155371a, ((j) obj2).f155371a);
    }

    public final int hashCode() {
        return this.f155371a.hashCode();
    }
}
