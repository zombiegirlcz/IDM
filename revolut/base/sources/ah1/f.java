package ah1;

import com.revolut.shared.cards.model.SharedRevolutCard;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedRevolutCard f4854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jg1.g f4855b;

    public f(SharedRevolutCard card, jg1.g walletType) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(walletType, "walletType");
        this.f4854a = card;
        this.f4855b = walletType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f4854a, fVar.f4854a) && this.f4855b == fVar.f4855b;
    }

    public final int hashCode() {
        return this.f4855b.hashCode() + (this.f4854a.hashCode() * 31);
    }
}
