package c5h;

import java.math.BigDecimal;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f21554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f21555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f21556c;

    public d(f minQty, ArrayList fees, BigDecimal vatRate) {
        Intrinsics.checkNotNullParameter(minQty, "minQty");
        Intrinsics.checkNotNullParameter(fees, "fees");
        Intrinsics.checkNotNullParameter(vatRate, "vatRate");
        this.f21554a = minQty;
        this.f21555b = fees;
        this.f21556c = vatRate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f21554a.equals(dVar.f21554a) && this.f21555b.equals(dVar.f21555b) && Intrinsics.f(this.f21556c, dVar.f21556c);
    }

    public final int hashCode() {
        return this.f21556c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f21555b, this.f21554a.hashCode() * 31, 31);
    }
}
