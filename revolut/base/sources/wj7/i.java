package wj7;

import com.revolut.feature.insurance.api.models.details.CFACPaymentCanceller;
import com.revolut.feature.insurance.api.models.details.CFACPaymentPurpose;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f297978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f297979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CFACPaymentPurpose f297980c;
    public final Long d;
    public final Long e;
    public final CFACPaymentCanceller f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f297981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f297982h;
    public final boolean i;

    public i(a3 transaction, dj0.d dVar, CFACPaymentPurpose cFACPaymentPurpose, Long l2, Long l3, CFACPaymentCanceller cFACPaymentCanceller, List documents, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f297978a = transaction;
        this.f297979b = dVar;
        this.f297980c = cFACPaymentPurpose;
        this.d = l2;
        this.e = l3;
        this.f = cFACPaymentCanceller;
        this.f297981g = documents;
        this.f297982h = z;
        this.i = z3;
    }

    public static i a(i iVar, dj0.d dVar, CFACPaymentPurpose cFACPaymentPurpose, Long l2, Long l3, CFACPaymentCanceller cFACPaymentCanceller, ArrayList arrayList, boolean z, int i) {
        a3 transaction = iVar.f297978a;
        if ((i & 2) != 0) {
            dVar = iVar.f297979b;
        }
        dj0.d dVar2 = dVar;
        if ((i & 4) != 0) {
            cFACPaymentPurpose = iVar.f297980c;
        }
        CFACPaymentPurpose cFACPaymentPurpose2 = cFACPaymentPurpose;
        if ((i & 8) != 0) {
            l2 = iVar.d;
        }
        Long l4 = l2;
        if ((i & 16) != 0) {
            l3 = iVar.e;
        }
        Long l5 = l3;
        CFACPaymentCanceller cFACPaymentCanceller2 = (i & 32) != 0 ? iVar.f : cFACPaymentCanceller;
        List documents = (i & 64) != 0 ? iVar.f297981g : arrayList;
        boolean z3 = iVar.f297982h;
        boolean z4 = (i & 256) != 0 ? iVar.i : z;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(documents, "documents");
        return new i(transaction, dVar2, cFACPaymentPurpose2, l4, l5, cFACPaymentCanceller2, documents, z3, z4);
    }

    public final boolean c() {
        dj0.d dVar = this.f297979b;
        return dVar != null && dVar.f(this.f297978a.k.a());
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f297978a, iVar.f297978a) && Intrinsics.f(this.f297979b, iVar.f297979b) && Intrinsics.f(this.f297980c, iVar.f297980c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f297981g, iVar.f297981g) && this.f297982h == iVar.f297982h && this.i == iVar.i;
    }

    public final int hashCode() {
        int iHashCode = this.f297978a.hashCode() * 31;
        dj0.d dVar = this.f297979b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        CFACPaymentPurpose cFACPaymentPurpose = this.f297980c;
        int iHashCode3 = (iHashCode2 + (cFACPaymentPurpose == null ? 0 : cFACPaymentPurpose.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.e;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        CFACPaymentCanceller cFACPaymentCanceller = this.f;
        return Boolean.hashCode(this.i) + j6.a.c(p.a.d((iHashCode5 + (cFACPaymentCanceller != null ? cFACPaymentCanceller.hashCode() : 0)) * 31, 31, this.f297981g), 31, this.f297982h);
    }
}
