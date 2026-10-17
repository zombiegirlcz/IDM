package rx6;

import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.sale.FreelancerSalesFilters$CompoundFreelancerSalesFilter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements cli.j {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature.freelancer.api.navigation.c f258044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FreelancerSalesFilters$CompoundFreelancerSalesFilter f258045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f258046c;
    public final String d;
    public final Data e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f258047g;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m(com.revolut.feature.freelancer.api.navigation.c r2, com.revolut.feature.freelancer.common.models.sale.FreelancerSalesFilters$CompoundFreelancerSalesFilter r3, boolean r4, java.lang.String r5, com.revolut.data.model.Data r6, boolean r7) {
        /*
            r1 = this;
            java.lang.String r0 = "mode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "filter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "invoiceData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r1.<init>()
            r1.f258044a = r2
            r1.f258045b = r3
            r1.f258046c = r4
            r1.d = r5
            r1.e = r6
            r1.f = r7
            int r2 = r3.b()
            if (r2 > 0) goto L31
            if (r5 != 0) goto L28
            java.lang.String r5 = ""
        L28:
            boolean r2 = kotlin.text.d0.W(r5)
            if (r2 != 0) goto L2f
            goto L31
        L2f:
            r2 = 0
            goto L32
        L31:
            r2 = 1
        L32:
            r1.f258047g = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rx6.m.<init>(com.revolut.feature.freelancer.api.navigation.c, com.revolut.feature.freelancer.common.models.sale.FreelancerSalesFilters$CompoundFreelancerSalesFilter, boolean, java.lang.String, com.revolut.data.model.Data, boolean):void");
    }

    public static m a(m mVar, FreelancerSalesFilters$CompoundFreelancerSalesFilter freelancerSalesFilters$CompoundFreelancerSalesFilter, boolean z, String str, Data invoiceData, boolean z3, int i) {
        FreelancerSalesFilters$CompoundFreelancerSalesFilter filter = freelancerSalesFilters$CompoundFreelancerSalesFilter;
        com.revolut.feature.freelancer.api.navigation.c mode = mVar.f258044a;
        if ((i & 2) != 0) {
            filter = mVar.f258045b;
        }
        if ((i & 4) != 0) {
            z = mVar.f258046c;
        }
        if ((i & 8) != 0) {
            str = mVar.d;
        }
        if ((i & 16) != 0) {
            invoiceData = mVar.e;
        }
        if ((i & 32) != 0) {
            z3 = mVar.f;
        }
        boolean z4 = z3;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(invoiceData, "invoiceData");
        Data data = invoiceData;
        String str2 = str;
        return new m(mode, filter, z, str2, data, z4);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f258044a == mVar.f258044a && Intrinsics.f(this.f258045b, mVar.f258045b) && this.f258046c == mVar.f258046c && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && this.f == mVar.f;
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f258045b.hashCode() + (this.f258044a.hashCode() * 31)) * 31, 31, this.f258046c);
        String str = this.d;
        return Boolean.hashCode(this.f) + kii.e.c(this.e, (iC + (str == null ? 0 : str.hashCode())) * 31, 31);
    }
}
