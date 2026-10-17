package nr6;

import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderPayment;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f218585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f218586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f218587c;
    public final dj0.d d;
    public final ArrayList e;

    public w(ArrayList payments, ArrayList refunds, ArrayList fees, dj0.d netAmount) {
        Intrinsics.checkNotNullParameter(payments, "payments");
        Intrinsics.checkNotNullParameter(refunds, "refunds");
        Intrinsics.checkNotNullParameter(fees, "fees");
        Intrinsics.checkNotNullParameter(netAmount, "netAmount");
        this.f218585a = payments;
        this.f218586b = refunds;
        this.f218587c = fees;
        this.d = netAmount;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : payments) {
            AcquiringOrderPayment acquiringOrderPayment = (AcquiringOrderPayment) obj2;
            if (acquiringOrderPayment.f73359h) {
                pr6.j.Companion.getClass();
                if (!pr6.j.NON_REFUNDABLE_METHODS.contains(acquiringOrderPayment.k)) {
                    arrayList.add(obj2);
                }
            }
        }
        this.e = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return this.f218585a.equals(wVar.f218585a) && this.f218586b.equals(wVar.f218586b) && this.f218587c.equals(wVar.f218587c) && this.d.equals(wVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f218587c, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f218586b, this.f218585a.hashCode() * 31, 31), 31);
    }
}
