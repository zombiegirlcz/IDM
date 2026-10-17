package phe;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey;
import jhe.l;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import om4.r0;
import vge.c1;
import vkm.q;
import xge.j;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f236296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f236297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f236298c;
    public final ohe.b d;

    public i(c1 productDataSourcesInteractor, j spacesProvider, l onHoldDecorator) {
        Intrinsics.checkNotNullParameter(productDataSourcesInteractor, "productDataSourcesInteractor");
        Intrinsics.checkNotNullParameter(spacesProvider, "spacesProvider");
        Intrinsics.checkNotNullParameter(onHoldDecorator, "onHoldDecorator");
        this.f236296a = productDataSourcesInteractor;
        this.f236297b = spacesProvider;
        this.f236298c = onHoldDecorator;
        this.d = new ohe.b(new TotalWealthCategoryKey.Youth("__tw_youth_promo__"), f0.f322471a, (Clause) null, 12);
    }

    @Override // phe.b
    public final Flow a(sfe.a dataLoadingMode) {
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        return q.Q(q.q(new olf.e((Flow) this.f236297b.d.getValue(), 14)), new r0(null, this, dataLoadingMode, 6));
    }
}
