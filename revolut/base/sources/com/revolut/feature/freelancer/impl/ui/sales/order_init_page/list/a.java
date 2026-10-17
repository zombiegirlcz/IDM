package com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list;

import cli.j;
import com.revolut.feature.freelancer.common.models.sale.FreelancerSalesFilters$CompoundFreelancerSalesFilter;
import cs6.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements j {

    @NotNull
    public static final C0494a Companion = new C0494a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final FreelancerSalesFilters$CompoundFreelancerSalesFilter f74189g = new FreelancerSalesFilters$CompoundFreelancerSalesFilter(g.PAYMENT_LINKS, 254);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tad.a f74190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FreelancerSalesFilters$CompoundFreelancerSalesFilter f74191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f74192c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.a$a, reason: collision with other inner class name */
    public static final class C0494a {
        private C0494a() {
        }
    }

    public a() {
        this(0);
    }

    public static a a(a aVar, tad.a aVar2, FreelancerSalesFilters$CompoundFreelancerSalesFilter freelancerSalesFilters$CompoundFreelancerSalesFilter, String str, boolean z, boolean z3, int i) {
        if ((i & 1) != 0) {
            aVar2 = aVar.f74190a;
        }
        tad.a paginationData = aVar2;
        if ((i & 2) != 0) {
            freelancerSalesFilters$CompoundFreelancerSalesFilter = aVar.f74191b;
        }
        FreelancerSalesFilters$CompoundFreelancerSalesFilter filter = freelancerSalesFilters$CompoundFreelancerSalesFilter;
        if ((i & 4) != 0) {
            str = aVar.f74192c;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            z = aVar.d;
        }
        boolean z4 = z;
        if ((i & 16) != 0) {
            z3 = aVar.e;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(paginationData, "paginationData");
        Intrinsics.checkNotNullParameter(filter, "filter");
        return new a(paginationData, filter, str2, z4, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f74190a, aVar.f74190a) && Intrinsics.f(this.f74191b, aVar.f74191b) && Intrinsics.f(this.f74192c, aVar.f74192c) && this.d == aVar.d && this.e == aVar.e;
    }

    public final int hashCode() {
        int iHashCode = (this.f74191b.hashCode() + (this.f74190a.hashCode() * 31)) * 31;
        String str = this.f74192c;
        return Boolean.hashCode(this.e) + j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(tad.a r2, com.revolut.feature.freelancer.common.models.sale.FreelancerSalesFilters$CompoundFreelancerSalesFilter r3, java.lang.String r4, boolean r5, boolean r6) {
        /*
            r1 = this;
            java.lang.String r0 = "paginationData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "filter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.f74190a = r2
            r1.f74191b = r3
            r1.f74192c = r4
            r1.d = r5
            r1.e = r6
            int r2 = r3.b()
            if (r2 > 0) goto L2a
            if (r4 != 0) goto L21
            java.lang.String r4 = ""
        L21:
            boolean r2 = kotlin.text.d0.W(r4)
            if (r2 != 0) goto L28
            goto L2a
        L28:
            r2 = 0
            goto L2b
        L2a:
            r2 = 1
        L2b:
            r1.f = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.a.<init>(tad.a, com.revolut.feature.freelancer.common.models.sale.FreelancerSalesFilters$CompoundFreelancerSalesFilter, java.lang.String, boolean, boolean):void");
    }

    public /* synthetic */ a(int i) {
        this(new tad.a(0), f74189g, null, false, false);
    }
}
