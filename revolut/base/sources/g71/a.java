package g71;

import com.revolut.domain.models.topup.methods.TopupMethodType;
import dj0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopupMethodType f141070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f141071b;

    public a(TopupMethodType topupMethodType, d amount) {
        Intrinsics.checkNotNullParameter(topupMethodType, "topupMethodType");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f141070a = topupMethodType;
        this.f141071b = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f141070a == aVar.f141070a && Intrinsics.f(this.f141071b, aVar.f141071b);
    }

    public final int hashCode() {
        return this.f141071b.hashCode() + (this.f141070a.hashCode() * 31);
    }
}
