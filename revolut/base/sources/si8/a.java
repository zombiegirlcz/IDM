package si8;

import com.revolut.feature.junior_payment_links.api.model.PaymentLinkCustomAmountBundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f263525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f263526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f263527c;
    public final String d;
    public final String e;
    public final PaymentLinkCustomAmountBundle f;

    public a(String juniorId, String firstName, String fullName, String username, String receiveTransferUrl, PaymentLinkCustomAmountBundle amountBundle) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(receiveTransferUrl, "receiveTransferUrl");
        Intrinsics.checkNotNullParameter(amountBundle, "amountBundle");
        this.f263525a = juniorId;
        this.f263526b = firstName;
        this.f263527c = fullName;
        this.d = username;
        this.e = receiveTransferUrl;
        this.f = amountBundle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f263525a, aVar.f263525a) && Intrinsics.f(this.f263526b, aVar.f263526b) && Intrinsics.f(this.f263527c, aVar.f263527c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.f263525a.hashCode() * 31, 31, this.f263526b), 31, this.f263527c), 31, this.d), 31, this.e);
    }
}
