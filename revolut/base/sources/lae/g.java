package lae;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f193367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f193368b;

    public g(Data card, Data subscriptions) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        this.f193367a = card;
        this.f193368b = subscriptions;
    }

    public static g a(g gVar, Data card, Data subscriptions, int i) {
        if ((i & 1) != 0) {
            card = gVar.f193367a;
        }
        if ((i & 2) != 0) {
            subscriptions = gVar.f193368b;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        return new g(card, subscriptions);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f193367a, gVar.f193367a) && Intrinsics.f(this.f193368b, gVar.f193368b);
    }

    public final int hashCode() {
        return this.f193368b.hashCode() + (this.f193367a.hashCode() * 31);
    }
}
