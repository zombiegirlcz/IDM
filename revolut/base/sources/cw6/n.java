package cw6;

import cli.o;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceNumberData;
import cul.n2;
import cul.r1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements cli.n {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f109557a = new m(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f109558b = new m(1);

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        FreelancerInvoiceNumberData freelancerInvoiceNumberData;
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f109546a, new n2(29), new r1(13), new cf1.h(14, domainState, this));
        FreelancerInvoice freelancerInvoice = (FreelancerInvoice) domainState.f109546a.getContent();
        boolean z = false;
        if (freelancerInvoice != null && (freelancerInvoiceNumberData = domainState.f109547b) != null) {
            String str = freelancerInvoiceNumberData.f73398a;
            boolean zF = Intrinsics.f(str, freelancerInvoice.f73375b);
            boolean zF2 = Intrinsics.f(freelancerInvoiceNumberData.f73399b, freelancerInvoice.d);
            boolean z3 = freelancerInvoiceNumberData.f73400c;
            if (!d0.W(str) && (!zF || !zF2 || z3)) {
                z = true;
            }
        }
        return new j(list, z);
    }
}
