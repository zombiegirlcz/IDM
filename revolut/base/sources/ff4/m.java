package ff4;

import com.revolut.feature.credit.application.plugins.api.models.action_button.Action;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Action f134729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f134730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f134731c;
    public final fu3.a d;

    public m(Action action, Long l2, Long l3, fu3.a aVar) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f134729a = action;
        this.f134730b = l2;
        this.f134731c = l3;
        this.d = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f134729a, mVar.f134729a) && Intrinsics.f(this.f134730b, mVar.f134730b) && Intrinsics.f(this.f134731c, mVar.f134731c) && this.d == mVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f134729a.hashCode() * 31;
        Long l2 = this.f134730b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f134731c;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        fu3.a aVar = this.d;
        return iHashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }
}
