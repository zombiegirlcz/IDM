package sxi;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f266510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.retail.feature.airportlounges.impl.ui.screens.lounge_details.a f266511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f266512c;

    public m(h header, com.revolut.retail.feature.airportlounges.impl.ui.screens.lounge_details.a button, List items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f266510a = header;
        this.f266511b = button;
        this.f266512c = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f266512c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f266510a, mVar.f266510a) && Intrinsics.f(this.f266511b, mVar.f266511b) && Intrinsics.f(this.f266512c, mVar.f266512c);
    }

    public final int hashCode() {
        return this.f266512c.hashCode() + ((this.f266511b.hashCode() + (this.f266510a.hashCode() * 31)) * 31);
    }
}
