package t9k;

import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import h30.l;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PeerToPeerRecipient f269047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f269048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f269049c;
    public final Map d;

    public c(PeerToPeerRecipient recipient, long j2, xi0.b targetCurrency, Map configMinAmounts) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(configMinAmounts, "configMinAmounts");
        this.f269047a = recipient;
        this.f269048b = j2;
        this.f269049c = targetCurrency;
        this.d = configMinAmounts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f269047a, cVar.f269047a) && this.f269048b == cVar.f269048b && Intrinsics.f(this.f269049c, cVar.f269049c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + l.j(this.f269049c, a0.d.c(this.f269047a.hashCode() * 31, 31, this.f269048b), 31);
    }
}
