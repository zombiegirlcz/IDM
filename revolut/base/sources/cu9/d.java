package cu9;

import com.revolut.domain.models.moneyrequest.MoneyRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyRequest f108917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f108918b;

    public d(MoneyRequest moneyRequest, c action) {
        Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f108917a = moneyRequest;
        this.f108918b = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f108917a, dVar.f108917a) && this.f108918b == dVar.f108918b;
    }

    public final int hashCode() {
        return this.f108918b.hashCode() + (this.f108917a.hashCode() * 31);
    }
}
