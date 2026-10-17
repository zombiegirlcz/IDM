package ek7;

import com.revolut.data.model.Data;
import com.revolut.feature.insurance.api.models.details.CFACExcess;
import com.revolut.feature.insurance.api.models.details.CFACInsuranceDetails;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CFACInsuranceDetails f126961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f126962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f126963c;
    public final String d;
    public final long e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CFACExcess f126964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f126965h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f126966j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f126967l;

    public i(CFACInsuranceDetails insuranceDetails, List expenses, List supportingDocuments, String cancellationReasonDescription, long j2, boolean z, CFACExcess excess, Data calculatedAmountsData, String claimName, boolean z3, boolean z4, boolean z6) {
        Intrinsics.checkNotNullParameter(insuranceDetails, "insuranceDetails");
        Intrinsics.checkNotNullParameter(expenses, "expenses");
        Intrinsics.checkNotNullParameter(supportingDocuments, "supportingDocuments");
        Intrinsics.checkNotNullParameter(cancellationReasonDescription, "cancellationReasonDescription");
        Intrinsics.checkNotNullParameter(excess, "excess");
        Intrinsics.checkNotNullParameter(calculatedAmountsData, "calculatedAmountsData");
        Intrinsics.checkNotNullParameter(claimName, "claimName");
        this.f126961a = insuranceDetails;
        this.f126962b = expenses;
        this.f126963c = supportingDocuments;
        this.d = cancellationReasonDescription;
        this.e = j2;
        this.f = z;
        this.f126964g = excess;
        this.f126965h = calculatedAmountsData;
        this.i = claimName;
        this.f126966j = z3;
        this.k = z4;
        this.f126967l = z6;
    }

    public static i a(i iVar, List list, List list2, Data data, String str, boolean z, boolean z3, boolean z4, int i) {
        CFACInsuranceDetails insuranceDetails = iVar.f126961a;
        List expenses = (i & 2) != 0 ? iVar.f126962b : list;
        List supportingDocuments = (i & 4) != 0 ? iVar.f126963c : list2;
        String cancellationReasonDescription = iVar.d;
        long j2 = iVar.e;
        boolean z6 = iVar.f;
        CFACExcess excess = iVar.f126964g;
        Data calculatedAmountsData = (i & 128) != 0 ? iVar.f126965h : data;
        String claimName = (i & 256) != 0 ? iVar.i : str;
        boolean z11 = (i & 512) != 0 ? iVar.f126966j : z;
        boolean z12 = (i & 1024) != 0 ? iVar.k : z3;
        boolean z29 = (i & 2048) != 0 ? iVar.f126967l : z4;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(insuranceDetails, "insuranceDetails");
        Intrinsics.checkNotNullParameter(expenses, "expenses");
        Intrinsics.checkNotNullParameter(supportingDocuments, "supportingDocuments");
        Intrinsics.checkNotNullParameter(cancellationReasonDescription, "cancellationReasonDescription");
        Intrinsics.checkNotNullParameter(excess, "excess");
        Intrinsics.checkNotNullParameter(calculatedAmountsData, "calculatedAmountsData");
        Intrinsics.checkNotNullParameter(claimName, "claimName");
        return new i(insuranceDetails, expenses, supportingDocuments, cancellationReasonDescription, j2, z6, excess, calculatedAmountsData, claimName, z11, z12, z29);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f126961a, iVar.f126961a) && Intrinsics.f(this.f126962b, iVar.f126962b) && Intrinsics.f(this.f126963c, iVar.f126963c) && Intrinsics.f(this.d, iVar.d) && this.e == iVar.e && this.f == iVar.f && Intrinsics.f(this.f126964g, iVar.f126964g) && Intrinsics.f(this.f126965h, iVar.f126965h) && Intrinsics.f(this.i, iVar.i) && this.f126966j == iVar.f126966j && this.k == iVar.k && this.f126967l == iVar.f126967l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f126967l) + j6.a.c(j6.a.c(p.a.c(kii.e.c(this.f126965h, (this.f126964g.hashCode() + j6.a.c(a0.d.c(p.a.c(p.a.d(p.a.d(this.f126961a.hashCode() * 31, 31, this.f126962b), 31, this.f126963c), 31, this.d), 31, this.e), 31, this.f)) * 31, 31), 31, this.i), 31, this.f126966j), 31, this.k);
    }
}
