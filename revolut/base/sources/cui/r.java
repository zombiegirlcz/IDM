package cui;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class r implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f109022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f109023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.a f109024c;

    public r(List items, q qVar, com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.a actionButtonState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actionButtonState, "actionButtonState");
        this.f109022a = items;
        this.f109023b = qVar;
        this.f109024c = actionButtonState;
    }

    @Override // cli.p
    public final List c() {
        return this.f109022a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f109022a, rVar.f109022a) && Intrinsics.f(this.f109023b, rVar.f109023b) && Intrinsics.f(this.f109024c, rVar.f109024c);
    }

    public final int hashCode() {
        int iHashCode = this.f109022a.hashCode() * 31;
        q qVar = this.f109023b;
        return this.f109024c.hashCode() + ((iHashCode + (qVar == null ? 0 : qVar.hashCode())) * 31);
    }
}
