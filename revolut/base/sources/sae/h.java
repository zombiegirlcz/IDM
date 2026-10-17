package sae;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f261386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f261387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f261388c;

    public h(p payment, ArrayList balanceGroups, dj0.d allCashBalancesAmount) {
        Intrinsics.checkNotNullParameter(payment, "payment");
        Intrinsics.checkNotNullParameter(balanceGroups, "balanceGroups");
        Intrinsics.checkNotNullParameter(allCashBalancesAmount, "allCashBalancesAmount");
        this.f261386a = payment;
        this.f261387b = balanceGroups;
        this.f261388c = allCashBalancesAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f261386a, hVar.f261386a) && this.f261387b.equals(hVar.f261387b) && this.f261388c.equals(hVar.f261388c);
    }

    public final int hashCode() {
        return this.f261388c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f261387b, this.f261386a.hashCode() * 31, 31);
    }
}
