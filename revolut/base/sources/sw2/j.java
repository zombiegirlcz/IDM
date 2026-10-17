package sw2;

import com.revolut.data.model.Data;
import com.revolut.feature.cards.models.revolutcard.LocationMismatch;
import com.revolut.feature.cards.models.revolutcard.RevolutCardOtp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f266078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevolutCardOtp f266079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocationMismatch f266080c;
    public final boolean d;
    public final co3.a e;

    public j(Data card, RevolutCardOtp cardOtp, LocationMismatch locationMismatch, boolean z, co3.a aVar) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(cardOtp, "cardOtp");
        Intrinsics.checkNotNullParameter(locationMismatch, "locationMismatch");
        this.f266078a = card;
        this.f266079b = cardOtp;
        this.f266080c = locationMismatch;
        this.d = z;
        this.e = aVar;
    }

    public static j a(j jVar, Data data, co3.a aVar, int i) {
        if ((i & 1) != 0) {
            data = jVar.f266078a;
        }
        Data card = data;
        RevolutCardOtp cardOtp = jVar.f266079b;
        LocationMismatch locationMismatch = jVar.f266080c;
        boolean z = jVar.d;
        if ((i & 16) != 0) {
            aVar = jVar.e;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(cardOtp, "cardOtp");
        Intrinsics.checkNotNullParameter(locationMismatch, "locationMismatch");
        return new j(card, cardOtp, locationMismatch, z, aVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f266078a, jVar.f266078a) && Intrinsics.f(this.f266079b, jVar.f266079b) && Intrinsics.f(this.f266080c, jVar.f266080c) && this.d == jVar.d && Intrinsics.f(this.e, jVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f266080c.hashCode() + ((this.f266079b.hashCode() + (this.f266078a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        co3.a aVar = this.e;
        return iC + (aVar == null ? 0 : aVar.hashCode());
    }
}
