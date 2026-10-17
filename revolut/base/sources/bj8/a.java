package bj8;

import com.revolut.feature.junior_payment_links.api.model.PaymentLinkCustomAmountBundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15580c;
    public final String d;
    public final fo3.c e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PaymentLinkCustomAmountBundle f15581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f15582h;

    public a(String juniorId, String firstName, String fullName, String username, fo3.c wallet, String link, PaymentLinkCustomAmountBundle customAmountBundle, String receiveTransferUrl) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(wallet, "wallet");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(customAmountBundle, "customAmountBundle");
        Intrinsics.checkNotNullParameter(receiveTransferUrl, "receiveTransferUrl");
        this.f15578a = juniorId;
        this.f15579b = firstName;
        this.f15580c = fullName;
        this.d = username;
        this.e = wallet;
        this.f = link;
        this.f15581g = customAmountBundle;
        this.f15582h = receiveTransferUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f15578a, aVar.f15578a) && Intrinsics.f(this.f15579b, aVar.f15579b) && Intrinsics.f(this.f15580c, aVar.f15580c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f15581g, aVar.f15581g) && Intrinsics.f(this.f15582h, aVar.f15582h);
    }

    public final int hashCode() {
        return this.f15582h.hashCode() + ((this.f15581g.hashCode() + p.a.c((this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f15578a.hashCode() * 31, 31, this.f15579b), 31, this.f15580c), 31, this.d)) * 31, 31, this.f)) * 31);
    }
}
