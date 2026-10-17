package t6c;

import com.revolut.feature.revolutpay.api.shared.domain.models.payment_options.Cashback;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f268291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f268292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f268293c;
    public final Cashback d;

    public f(dj0.d payAmount, e eVar, k kVar, Cashback cashback) {
        Intrinsics.checkNotNullParameter(payAmount, "payAmount");
        this.f268291a = payAmount;
        this.f268292b = eVar;
        this.f268293c = kVar;
        this.d = cashback;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f268291a, fVar.f268291a) && Intrinsics.f(this.f268292b, fVar.f268292b) && Intrinsics.f(this.f268293c, fVar.f268293c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f268291a.hashCode() * 31;
        e eVar = this.f268292b;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        k kVar = this.f268293c;
        int iHashCode3 = (iHashCode2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        Cashback cashback = this.d;
        return iHashCode3 + (cashback != null ? cashback.hashCode() : 0);
    }
}
