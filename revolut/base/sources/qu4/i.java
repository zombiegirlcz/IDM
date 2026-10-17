package qu4;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.repay_with_review.AutoPayAction;
import dx4.z2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f249223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f249224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f249225c;
    public final Data d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f249226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f249227h;
    public final z2 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AutoPayAction f249228j;
    public final Data k;

    public i() {
        this(null, 2047);
    }

    public static i a(i iVar, String str, dj0.d dVar, boolean z, Data data, String str2, String str3, boolean z3, boolean z4, z2 z2Var, AutoPayAction autoPayAction, Data data2, int i) {
        if ((i & 1) != 0) {
            str = iVar.f249223a;
        }
        String str4 = str;
        if ((i & 2) != 0) {
            dVar = iVar.f249224b;
        }
        dj0.d dVar2 = dVar;
        if ((i & 4) != 0) {
            z = iVar.f249225c;
        }
        boolean z6 = z;
        Data repaymentDetails = (i & 8) != 0 ? iVar.d : data;
        String str5 = (i & 16) != 0 ? iVar.e : str2;
        String str6 = (i & 32) != 0 ? iVar.f : str3;
        boolean z11 = (i & 64) != 0 ? iVar.f249226g : z3;
        boolean z12 = (i & 128) != 0 ? iVar.f249227h : z4;
        z2 z2Var2 = (i & 256) != 0 ? iVar.i : z2Var;
        AutoPayAction autoPayAction2 = (i & 512) != 0 ? iVar.f249228j : autoPayAction;
        Data autopayPayments = (i & 1024) != 0 ? iVar.k : data2;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(repaymentDetails, "repaymentDetails");
        Intrinsics.checkNotNullParameter(autoPayAction2, "autoPayAction");
        Intrinsics.checkNotNullParameter(autopayPayments, "autopayPayments");
        return new i(str4, dVar2, z6, repaymentDetails, str5, str6, z11, z12, z2Var2, autoPayAction2, autopayPayments);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f249223a, iVar.f249223a) && Intrinsics.f(this.f249224b, iVar.f249224b) && this.f249225c == iVar.f249225c && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && this.f249226g == iVar.f249226g && this.f249227h == iVar.f249227h && Intrinsics.f(this.i, iVar.i) && this.f249228j == iVar.f249228j && Intrinsics.f(this.k, iVar.k);
    }

    public final int hashCode() {
        String str = this.f249223a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        dj0.d dVar = this.f249224b;
        int iC = kii.e.c(this.d, j6.a.c((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f249225c), 31);
        String str2 = this.e;
        int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iC2 = j6.a.c(j6.a.c((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f249226g), 31, this.f249227h);
        z2 z2Var = this.i;
        return this.k.hashCode() + ((this.f249228j.hashCode() + ((iC2 + (z2Var != null ? z2Var.hashCode() : 0)) * 31)) * 31);
    }

    public i(String str, dj0.d dVar, boolean z, Data repaymentDetails, String str2, String str3, boolean z3, boolean z4, z2 z2Var, AutoPayAction autoPayAction, Data autopayPayments) {
        Intrinsics.checkNotNullParameter(repaymentDetails, "repaymentDetails");
        Intrinsics.checkNotNullParameter(autoPayAction, "autoPayAction");
        Intrinsics.checkNotNullParameter(autopayPayments, "autopayPayments");
        this.f249223a = str;
        this.f249224b = dVar;
        this.f249225c = z;
        this.d = repaymentDetails;
        this.e = str2;
        this.f = str3;
        this.f249226g = z3;
        this.f249227h = z4;
        this.i = z2Var;
        this.f249228j = autoPayAction;
        this.k = autopayPayments;
    }

    public /* synthetic */ i(AutoPayAction autoPayAction, int i) {
        this(null, null, false, new Data(null, null, true, 3, null), null, null, false, false, null, (i & 512) != 0 ? AutoPayAction.NOT_AVAILABLE : autoPayAction, new Data(null, null, false, 7, null));
    }
}
