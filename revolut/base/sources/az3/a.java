package az3;

import dj0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11385c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f11386g;

    public a(d payment, String title, String secondDescription, String paymentName, String str, String buttonTitle, String insufficientFundsButtonTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(secondDescription, "secondDescription");
        Intrinsics.checkNotNullParameter(paymentName, "paymentName");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(insufficientFundsButtonTitle, "insufficientFundsButtonTitle");
        Intrinsics.checkNotNullParameter(payment, "payment");
        this.f11383a = title;
        this.f11384b = secondDescription;
        this.f11385c = paymentName;
        this.d = str;
        this.e = buttonTitle;
        this.f = insufficientFundsButtonTitle;
        this.f11386g = payment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f11383a, aVar.f11383a) && Intrinsics.f(this.f11384b, aVar.f11384b) && Intrinsics.f(this.f11385c, aVar.f11385c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f11386g, aVar.f11386g);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f11383a.hashCode() * 31, 31, this.f11384b), 31, this.f11385c);
        String str = this.d;
        return this.f11386g.hashCode() + p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
    }
}
