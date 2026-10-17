package jh9;

import com.revolut.feature.apm.bills.core.api.model.BillTransferDataV2;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillTransferDataV2 f174165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentData f174166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f174167c;
    public final String d;

    public h(BillTransferDataV2 transferData, PaymentData paymentData, ArrayList fields, String str) {
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.f174165a = transferData;
        this.f174166b = paymentData;
        this.f174167c = fields;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f174165a.equals(hVar.f174165a) && this.f174166b.equals(hVar.f174166b) && this.f174167c.equals(hVar.f174167c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f174167c, (this.f174166b.hashCode() + (this.f174165a.hashCode() * 31)) * 31, 31);
        String str = this.d;
        return iB + (str == null ? 0 : str.hashCode());
    }
}
