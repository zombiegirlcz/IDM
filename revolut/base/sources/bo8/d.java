package bo8;

import com.revolut.feature.junior_payment_links.api.model.PaymentLinkCustomAmountBundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17310c;
    public final String d;
    public final String e;
    public final PaymentLinkCustomAmountBundle f;

    public d(String juniorId, String firstName, String lastName, String username, String receiveTransferUrl, PaymentLinkCustomAmountBundle amountBundle) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(receiveTransferUrl, "receiveTransferUrl");
        Intrinsics.checkNotNullParameter(amountBundle, "amountBundle");
        this.f17308a = juniorId;
        this.f17309b = firstName;
        this.f17310c = lastName;
        this.d = username;
        this.e = receiveTransferUrl;
        this.f = amountBundle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f17308a, dVar.f17308a) && Intrinsics.f(this.f17309b, dVar.f17309b) && Intrinsics.f(this.f17310c, dVar.f17310c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.f17308a.hashCode() * 31, 31, this.f17309b), 31, this.f17310c), 31, this.d), 31, this.e);
    }
}
