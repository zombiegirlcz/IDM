package q9c;

import com.revolut.feature.revolutpay.impl.domain.models.payment_schedule.PaymentScheduleSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t6c.f f243877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentScheduleSelection f243878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f243879c;
    public final String d;

    public s(t6c.f fVar, PaymentScheduleSelection selectedPaymentSchedule, boolean z, String str) {
        Intrinsics.checkNotNullParameter(selectedPaymentSchedule, "selectedPaymentSchedule");
        this.f243877a = fVar;
        this.f243878b = selectedPaymentSchedule;
        this.f243879c = z;
        this.d = str;
    }

    public static s a(s sVar, t6c.f fVar, PaymentScheduleSelection selectedPaymentSchedule, boolean z, String str, int i) {
        if ((i & 1) != 0) {
            fVar = sVar.f243877a;
        }
        if ((i & 2) != 0) {
            selectedPaymentSchedule = sVar.f243878b;
        }
        if ((i & 4) != 0) {
            z = sVar.f243879c;
        }
        if ((i & 8) != 0) {
            str = sVar.d;
        }
        sVar.getClass();
        Intrinsics.checkNotNullParameter(selectedPaymentSchedule, "selectedPaymentSchedule");
        return new s(fVar, selectedPaymentSchedule, z, str);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f243877a, sVar.f243877a) && Intrinsics.f(this.f243878b, sVar.f243878b) && this.f243879c == sVar.f243879c && Intrinsics.f(this.d, sVar.d);
    }

    public final int hashCode() {
        t6c.f fVar = this.f243877a;
        int iC = j6.a.c((this.f243878b.hashCode() + ((fVar == null ? 0 : fVar.hashCode()) * 31)) * 31, 31, this.f243879c);
        String str = this.d;
        return iC + (str != null ? str.hashCode() : 0);
    }
}
