package axi;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f10967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.a f10968c;

    public q(List items, p pVar, com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.a actionButtonState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actionButtonState, "actionButtonState");
        this.f10966a = items;
        this.f10967b = pVar;
        this.f10968c = actionButtonState;
    }

    @Override // cli.p
    public final List c() {
        return this.f10966a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f10966a, qVar.f10966a) && Intrinsics.f(this.f10967b, qVar.f10967b) && Intrinsics.f(this.f10968c, qVar.f10968c);
    }

    public final int hashCode() {
        int iHashCode = this.f10966a.hashCode() * 31;
        p pVar = this.f10967b;
        return this.f10968c.hashCode() + ((iHashCode + (pVar == null ? 0 : pVar.hashCode())) * 31);
    }
}
