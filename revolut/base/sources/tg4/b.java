package tg4;

import c84.t;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.impl.ui.product_articles.ProductArticlesFlowContract$Step;
import com.revolut.feature.credit.core.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import oki.h;
import sqd.h0;
import yki.l;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.product_articles.a f271059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f271060c;

    public /* synthetic */ b(com.revolut.feature.credit.application.plugins.impl.ui.product_articles.a aVar, l lVar, int i) {
        this.f271058a = i;
        this.f271059b = aVar;
        this.f271060c = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f271058a) {
            case 0:
                yja.b result = (yja.b) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                int i = c.f271061a[result.ordinal()];
                Continuation continuation = null;
                com.revolut.feature.credit.application.plugins.impl.ui.product_articles.a aVar = this.f271059b;
                if (i == 1 || i == 2) {
                    aVar.l2(new h0(aVar, continuation, 23), new yi5.b(26));
                } else if (i == 3) {
                    t.J2(aVar, false, null, new b(aVar, this.f271060c, 1), 3);
                } else {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    yji.l.b1(aVar, aVar.X1(new y0(null, new z(new TextLocalisedClause(R$string.credit_error_subtitle, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, 7);
                }
                return Unit.f186387a;
            default:
                hq3.d closeResult = (hq3.d) obj2;
                Intrinsics.checkNotNullParameter(closeResult, "closeResult");
                if (Intrinsics.f(closeResult, hq3.a.f154589a)) {
                    h.t2(this.f271059b, this.f271060c, ProductArticlesFlowContract$Step.ProductArticles.f68238a, false, null, true, 4);
                }
                return Unit.f186387a;
        }
    }
}
