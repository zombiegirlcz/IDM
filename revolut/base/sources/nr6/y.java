package nr6;

import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderCard;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f218588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pr6.j f218589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AcquiringOrderCard f218590c;
    public final String d;

    public y(String id10, pr6.j jVar, AcquiringOrderCard acquiringOrderCard, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f218588a = id10;
        this.f218589b = jVar;
        this.f218590c = acquiringOrderCard;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f218588a, yVar.f218588a) && this.f218589b == yVar.f218589b && Intrinsics.f(this.f218590c, yVar.f218590c) && Intrinsics.f(this.d, yVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f218588a.hashCode() * 31;
        pr6.j jVar = this.f218589b;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        AcquiringOrderCard acquiringOrderCard = this.f218590c;
        int iHashCode3 = (iHashCode2 + (acquiringOrderCard == null ? 0 : acquiringOrderCard.hashCode())) * 31;
        String str = this.d;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }
}
