package ntf;

import com.revolut.feature.transfer_reasons.models.additional_info.AdditionalInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdditionalInfo f219026a;

    public j(AdditionalInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.f219026a = info;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f219026a, ((j) obj2).f219026a);
    }

    public final int hashCode() {
        return this.f219026a.hashCode();
    }
}
