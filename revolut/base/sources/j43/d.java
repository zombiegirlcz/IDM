package j43;

import com.revolut.feature.cards.models.card.PocketWithSubaccount;
import h93.f0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f171281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PocketWithSubaccount f171282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f171283c;
    public final boolean d;
    public final boolean e;

    public d(f0 card, PocketWithSubaccount pocketWithSubaccount, List cardPayments, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(pocketWithSubaccount, "pocketWithSubaccount");
        Intrinsics.checkNotNullParameter(cardPayments, "cardPayments");
        this.f171281a = card;
        this.f171282b = pocketWithSubaccount;
        this.f171283c = cardPayments;
        this.d = z;
        this.e = z3;
    }

    public static d a(d dVar, f0 f0Var, boolean z, int i) {
        if ((i & 1) != 0) {
            f0Var = dVar.f171281a;
        }
        f0 card = f0Var;
        PocketWithSubaccount pocketWithSubaccount = dVar.f171282b;
        List cardPayments = dVar.f171283c;
        boolean z3 = dVar.d;
        if ((i & 16) != 0) {
            z = dVar.e;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(pocketWithSubaccount, "pocketWithSubaccount");
        Intrinsics.checkNotNullParameter(cardPayments, "cardPayments");
        return new d(card, pocketWithSubaccount, cardPayments, z3, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f171281a, dVar.f171281a) && Intrinsics.f(this.f171282b, dVar.f171282b) && Intrinsics.f(this.f171283c, dVar.f171283c) && this.d == dVar.d && this.e == dVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(p.a.d((this.f171282b.hashCode() + (this.f171281a.hashCode() * 31)) * 31, 31, this.f171283c), 31, this.d);
    }
}
