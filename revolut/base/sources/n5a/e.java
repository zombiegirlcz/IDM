package n5a;

import aw0.u9;
import h30.l;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u9 f212556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f212557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f212558c;
    public final xi0.b d;
    public final boolean e;
    public final gz9.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f212559g;

    public e(u9 recipient, String str, String amountValue, xi0.b currency, boolean z, gz9.g recipientPayment, List transferSuggestions) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(amountValue, "amountValue");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(recipientPayment, "recipientPayment");
        Intrinsics.checkNotNullParameter(transferSuggestions, "transferSuggestions");
        this.f212556a = recipient;
        this.f212557b = str;
        this.f212558c = amountValue;
        this.d = currency;
        this.e = z;
        this.f = recipientPayment;
        this.f212559g = transferSuggestions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f212556a, eVar.f212556a) && Intrinsics.f(this.f212557b, eVar.f212557b) && Intrinsics.f(this.f212558c, eVar.f212558c) && Intrinsics.f(this.d, eVar.d) && this.e == eVar.e && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f212559g, eVar.f212559g);
    }

    public final int hashCode() {
        int iHashCode = this.f212556a.hashCode() * 31;
        String str = this.f212557b;
        return this.f212559g.hashCode() + ((this.f.hashCode() + j6.a.c(l.j(this.d, p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f212558c), 31), 31, this.e)) * 31);
    }
}
