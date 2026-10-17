package t6c;

import com.revolut.feature.revolutpay.api.shared.domain.models.revpoints.RevPoints;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f268288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f268289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RevPoints f268290c;

    public e(dj0.d discountAmount, long j2, RevPoints revPoints) {
        Intrinsics.checkNotNullParameter(discountAmount, "discountAmount");
        this.f268288a = discountAmount;
        this.f268289b = j2;
        this.f268290c = revPoints;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f268288a, eVar.f268288a) && RevPoints.a(this.f268289b, eVar.f268289b) && Intrinsics.f(this.f268290c, eVar.f268290c);
    }

    public final int hashCode() {
        int iC = a0.d.c(this.f268288a.hashCode() * 31, 31, this.f268289b);
        RevPoints revPoints = this.f268290c;
        return iC + (revPoints == null ? 0 : Long.hashCode(revPoints.f84427a));
    }
}
