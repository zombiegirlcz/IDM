package qka;

import aii.r;
import com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor;
import com.revolut.feature.product_article.api.models.ProductArticleDestinationInterceptor;
import com.revolut.kompot.common.StackDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import rd0.d;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements qii.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductArticleCommandInterceptor f246973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProductArticleDestinationInterceptor f246974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f246975c;

    public b(ProductArticleCommandInterceptor productArticleCommandInterceptor, ProductArticleDestinationInterceptor productArticleDestinationInterceptor) {
        this.f246973a = productArticleCommandInterceptor;
        this.f246974b = productArticleDestinationInterceptor;
    }

    public static void b(qii.b bVar, NaviCommand naviCommand, StackDestination stackDestination) {
        if (stackDestination != null) {
            knm.b.j(bVar.l1(), stackDestination);
        } else if (naviCommand != null) {
            knm.b.j(bVar.l1(), u0.b(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), naviCommand)));
        } else {
            bVar.J2();
            Unit unit = Unit.f186387a;
        }
    }

    @Override // qii.a
    public final void a(r rVar, qii.b wrapperFlowModel) {
        yja.b result = (yja.b) rVar;
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(wrapperFlowModel, "wrapperFlowModel");
        int i = a.f246972a[result.ordinal()];
        ProductArticleDestinationInterceptor productArticleDestinationInterceptor = this.f246974b;
        ProductArticleCommandInterceptor productArticleCommandInterceptor = this.f246973a;
        if (i == 1) {
            if (!this.f246975c) {
                b(wrapperFlowModel, productArticleCommandInterceptor != null ? productArticleCommandInterceptor.d : null, productArticleDestinationInterceptor != null ? productArticleDestinationInterceptor.d : null);
                this.f246975c = true;
                return;
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("More than one error results. May lead to navigation duplication");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                d.a(rd0.c.WARNING, "ProductArticleCommandInterceptorResultHandler", null, illegalStateException, h0Var);
                return;
            }
        }
        if (i == 2) {
            b(wrapperFlowModel, productArticleCommandInterceptor != null ? productArticleCommandInterceptor.f81268a : null, productArticleDestinationInterceptor != null ? productArticleDestinationInterceptor.f81271a : null);
        } else if (i == 3) {
            b(wrapperFlowModel, productArticleCommandInterceptor != null ? productArticleCommandInterceptor.f81269b : null, productArticleDestinationInterceptor != null ? productArticleDestinationInterceptor.f81272b : null);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            b(wrapperFlowModel, productArticleCommandInterceptor != null ? productArticleCommandInterceptor.f81270c : null, productArticleDestinationInterceptor != null ? productArticleDestinationInterceptor.f81273c : null);
        }
    }
}
