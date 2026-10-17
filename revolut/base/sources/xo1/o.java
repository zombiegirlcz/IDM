package xo1;

import com.revolut.feature.apm.bills.core.api.model.BillWarning;
import java.time.LocalDate;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f307585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f307586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f307587c;
    public final BillWarning d;
    public final String e;

    public o(dj0.d amount, ArrayList fields, LocalDate localDate, BillWarning billWarning, String str) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.f307585a = amount;
        this.f307586b = fields;
        this.f307587c = localDate;
        this.d = billWarning;
        this.e = str;
    }

    @Override // xo1.q
    /* JADX INFO: renamed from: a */
    public final BillWarning getE() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f307585a.equals(oVar.f307585a) && this.f307586b.equals(oVar.f307586b) && Intrinsics.f(this.f307587c, oVar.f307587c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f307586b, this.f307585a.hashCode() * 31, 31);
        LocalDate localDate = this.f307587c;
        int iHashCode = (iB + (localDate == null ? 0 : localDate.hashCode())) * 31;
        BillWarning billWarning = this.d;
        int iHashCode2 = (iHashCode + (billWarning == null ? 0 : billWarning.hashCode())) * 31;
        String str = this.e;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
