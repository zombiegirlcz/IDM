package z1k;

import com.revolut.feature.transfer.models.quotes.TransferAvailability;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f318885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f318886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n9l.a f318887c;
    public final ArrayList d;
    public final TransferAvailability e;
    public final String f;

    public p(h sender, h recipient, n9l.a rate, ArrayList routes, TransferAvailability transferAvailability, String str) {
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(routes, "routes");
        this.f318885a = sender;
        this.f318886b = recipient;
        this.f318887c = rate;
        this.d = routes;
        this.e = transferAvailability;
        this.f = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f318885a.equals(pVar.f318885a) && this.f318886b.equals(pVar.f318886b) && this.f318887c.equals(pVar.f318887c) && this.d.equals(pVar.d) && Intrinsics.f(this.e, pVar.e) && Intrinsics.f(this.f, pVar.f);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (this.f318887c.hashCode() + ((this.f318886b.hashCode() + (this.f318885a.hashCode() * 31)) * 31)) * 31, 31);
        TransferAvailability transferAvailability = this.e;
        int iHashCode = (iB + (transferAvailability == null ? 0 : transferAvailability.hashCode())) * 31;
        String str = this.f;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
