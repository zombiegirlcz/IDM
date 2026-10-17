package p02;

import ip0.v7;
import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f231467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f231468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f231469c;
    public final dj0.d d;
    public final String e;
    public final LocalDateTime f;

    public a(String id10, c paymentMethod, d payer, dj0.d amount, String str, LocalDateTime updateDate) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(payer, "payer");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(updateDate, "updateDate");
        this.f231467a = id10;
        this.f231468b = paymentMethod;
        this.f231469c = payer;
        this.d = amount;
        this.e = str;
        this.f = updateDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f231467a, aVar.f231467a) && this.f231468b == aVar.f231468b && Intrinsics.f(this.f231469c, aVar.f231469c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f);
    }

    public final int hashCode() {
        int iC = v7.c((this.f231469c.hashCode() + ((this.f231468b.hashCode() + (this.f231467a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        String str = this.e;
        return this.f.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }
}
