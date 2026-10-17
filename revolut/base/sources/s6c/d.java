package s6c;

import com.revolut.feature.revolutpay.api.shared.domain.models.payment_options.PayLaterOffer;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements l {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f260217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f260218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f260219c;
    public final p d;
    public final dj0.d e;
    public final PayLaterOffer f;

    public d(dj0.d total, dj0.d totalWithoutRedemption, dj0.d subtotal, p pVar, dj0.d dVar, PayLaterOffer payLaterOffer) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(totalWithoutRedemption, "totalWithoutRedemption");
        Intrinsics.checkNotNullParameter(subtotal, "subtotal");
        this.f260217a = total;
        this.f260218b = totalWithoutRedemption;
        this.f260219c = subtotal;
        this.d = pVar;
        this.e = dVar;
        this.f = payLaterOffer;
    }

    @Override // s6c.l
    public final dj0.d a() {
        return this.f260217a;
    }

    @Override // s6c.l
    public final dj0.d b() {
        return this.e;
    }

    @Override // s6c.l
    public final dj0.d c() {
        return this.f260219c;
    }

    @Override // s6c.l
    public final dj0.d d() {
        return this.f260218b;
    }

    @Override // s6c.l
    public final p e() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f260217a, dVar.f260217a) && Intrinsics.f(this.f260218b, dVar.f260218b) && Intrinsics.f(this.f260219c, dVar.f260219c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f);
    }

    @Override // s6c.l
    public final dj0.d f() {
        return this.f260217a;
    }

    @Override // s6c.l
    public final PayLaterOffer g() {
        return this.f;
    }

    public final int hashCode() {
        int iC = v7.c(v7.c(this.f260217a.hashCode() * 31, 31, this.f260218b), 31, this.f260219c);
        p pVar = this.d;
        int iHashCode = (iC + (pVar == null ? 0 : pVar.hashCode())) * 31;
        dj0.d dVar = this.e;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        PayLaterOffer payLaterOffer = this.f;
        return iHashCode2 + (payLaterOffer != null ? payLaterOffer.hashCode() : 0);
    }
}
