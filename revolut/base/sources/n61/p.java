package n61;

import com.revolut.domain.models.beneficiary.ConfirmationResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f212698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f212699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConfirmationResult f212700c;
    public final boolean d;

    public p(boolean z, ArrayList arrayList, ConfirmationResult confirmationResult, boolean z3) {
        this.f212698a = z;
        this.f212699b = arrayList;
        this.f212700c = confirmationResult;
        this.d = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f212698a == pVar.f212698a && Intrinsics.f(this.f212699b, pVar.f212699b) && Intrinsics.f(this.f212700c, pVar.f212700c) && this.d == pVar.d;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f212698a) * 31;
        List list = this.f212699b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        ConfirmationResult confirmationResult = this.f212700c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (confirmationResult != null ? confirmationResult.hashCode() : 0)) * 31);
    }
}
