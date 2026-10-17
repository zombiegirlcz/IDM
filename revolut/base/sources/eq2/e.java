package eq2;

import com.revolut.feature.bank_account_switching.impl.domain.joint_account.JointAccountData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JointAccountData f128225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wn2.a f128226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mn2.a f128227c;
    public final wn2.d d;

    public e(JointAccountData jointAccountData, wn2.a selection, mn2.a serviceType, wn2.d dVar) {
        Intrinsics.checkNotNullParameter(jointAccountData, "jointAccountData");
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(serviceType, "serviceType");
        this.f128225a = jointAccountData;
        this.f128226b = selection;
        this.f128227c = serviceType;
        this.d = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f128225a, eVar.f128225a) && this.f128226b == eVar.f128226b && this.f128227c == eVar.f128227c && this.d == eVar.d;
    }

    public final int hashCode() {
        int iHashCode = (this.f128227c.hashCode() + ((this.f128226b.hashCode() + (this.f128225a.hashCode() * 31)) * 31)) * 31;
        wn2.d dVar = this.d;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
