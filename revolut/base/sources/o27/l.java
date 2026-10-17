package o27;

import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.FreelancerOrder;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderPayment;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import nr6.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f221516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f221517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f221518c;
    public final j d;
    public final FreelancerOrder e;
    public final AcquiringOrderPayment f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f221519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f221520h;
    public final a0 i;

    public l(dj0.d amountInput, dj0.d amountToRefund, dj0.d dVar, j focusedField, FreelancerOrder freelancerOrder, AcquiringOrderPayment acquiringOrderPayment, String reason, Data refundData, a0 a0Var) {
        Intrinsics.checkNotNullParameter(amountInput, "amountInput");
        Intrinsics.checkNotNullParameter(amountToRefund, "amountToRefund");
        Intrinsics.checkNotNullParameter(focusedField, "focusedField");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(refundData, "refundData");
        this.f221516a = amountInput;
        this.f221517b = amountToRefund;
        this.f221518c = dVar;
        this.d = focusedField;
        this.e = freelancerOrder;
        this.f = acquiringOrderPayment;
        this.f221519g = reason;
        this.f221520h = refundData;
        this.i = a0Var;
    }

    public static l a(l lVar, dj0.d dVar, dj0.d dVar2, j jVar, String str, Data data, a0 a0Var, int i) {
        if ((i & 1) != 0) {
            dVar = lVar.f221516a;
        }
        dj0.d amountInput = dVar;
        dj0.d amountToRefund = lVar.f221517b;
        if ((i & 4) != 0) {
            dVar2 = lVar.f221518c;
        }
        dj0.d dVar3 = dVar2;
        j focusedField = (i & 8) != 0 ? lVar.d : jVar;
        FreelancerOrder freelancerOrder = lVar.e;
        AcquiringOrderPayment acquiringOrderPayment = lVar.f;
        String reason = (i & 64) != 0 ? lVar.f221519g : str;
        Data refundData = (i & 128) != 0 ? lVar.f221520h : data;
        a0 a0Var2 = (i & 256) != 0 ? lVar.i : a0Var;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(amountInput, "amountInput");
        Intrinsics.checkNotNullParameter(amountToRefund, "amountToRefund");
        Intrinsics.checkNotNullParameter(focusedField, "focusedField");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(refundData, "refundData");
        return new l(amountInput, amountToRefund, dVar3, focusedField, freelancerOrder, acquiringOrderPayment, reason, refundData, a0Var2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f221516a, lVar.f221516a) && Intrinsics.f(this.f221517b, lVar.f221517b) && Intrinsics.f(this.f221518c, lVar.f221518c) && this.d == lVar.d && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && Intrinsics.f(this.f221519g, lVar.f221519g) && Intrinsics.f(this.f221520h, lVar.f221520h) && Intrinsics.f(this.i, lVar.i);
    }

    public final int hashCode() {
        int iC = v7.c(this.f221516a.hashCode() * 31, 31, this.f221517b);
        dj0.d dVar = this.f221518c;
        int iHashCode = (this.d.hashCode() + ((iC + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31;
        FreelancerOrder freelancerOrder = this.e;
        int iHashCode2 = (iHashCode + (freelancerOrder == null ? 0 : freelancerOrder.hashCode())) * 31;
        AcquiringOrderPayment acquiringOrderPayment = this.f;
        int iC2 = kii.e.c(this.f221520h, p.a.c((iHashCode2 + (acquiringOrderPayment == null ? 0 : acquiringOrderPayment.hashCode())) * 31, 31, this.f221519g), 31);
        a0 a0Var = this.i;
        return iC2 + (a0Var != null ? a0Var.hashCode() : 0);
    }
}
