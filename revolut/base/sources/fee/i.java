package fee;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f134596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.feature.support.impl.transfer_tracker.ui.inbound_transaction_list.a f134597b;

    public i(List items, com.revolut.feature.support.impl.transfer_tracker.ui.inbound_transaction_list.a navbarState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navbarState, "navbarState");
        this.f134596a = items;
        this.f134597b = navbarState;
    }

    @Override // cli.p
    public final List c() {
        return this.f134596a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f134596a, iVar.f134596a) && Intrinsics.f(this.f134597b, iVar.f134597b);
    }

    public final int hashCode() {
        return this.f134597b.hashCode() + (this.f134596a.hashCode() * 31);
    }
}
