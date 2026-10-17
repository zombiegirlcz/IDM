package n93;

import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f213560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StatusViewConfiguration f213561b;

    public h(f0 revolutCard, StatusViewConfiguration statusViewConfiguration) {
        Intrinsics.checkNotNullParameter(revolutCard, "revolutCard");
        Intrinsics.checkNotNullParameter(statusViewConfiguration, "statusViewConfiguration");
        this.f213560a = revolutCard;
        this.f213561b = statusViewConfiguration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f213560a, hVar.f213560a) && Intrinsics.f(this.f213561b, hVar.f213561b);
    }

    public final int hashCode() {
        return this.f213561b.hashCode() + (this.f213560a.hashCode() * 31);
    }
}
