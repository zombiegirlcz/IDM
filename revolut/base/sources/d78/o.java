package d78;

import b6i.d0;
import ch.qos.logback.classic.Level;
import com.revolut.data.model.Data;
import com.revolut.feature.junior.accounts.api.JuniorAccountsApi$Toggles$YouthAccountEmptyState;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlinx.coroutines.flow.Flow;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements pfe.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d88.g f111872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jla.h f111873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f111874c;

    public o(d88.g juniorProductAccountsSourceDelegate, jla.h productCatalogueInteractor, gte.a featureToggleInteractor, d88.h youthDiscoverDataSource) {
        Intrinsics.checkNotNullParameter(juniorProductAccountsSourceDelegate, "juniorProductAccountsSourceDelegate");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(youthDiscoverDataSource, "youthDiscoverDataSource");
        this.f111872a = juniorProductAccountsSourceDelegate;
        this.f111873b = productCatalogueInteractor;
        this.f111874c = featureToggleInteractor;
    }

    @Override // pfe.g
    public final Flow a() {
        return new ae8.c(bla.b.b(this.f111873b, ne8.a.f214420c.a()), 2);
    }

    @Override // pfe.g
    public final boolean b() {
        return true;
    }

    @Override // pfe.g
    public final Flow c(ProductSpaceIdentifier spaceIdentifier, pie.v subSpaceIdentifier, sfe.a dataLoadingMode) {
        Intrinsics.checkNotNullParameter(spaceIdentifier, "spaceIdentifier");
        Intrinsics.checkNotNullParameter(subSpaceIdentifier, "subSpaceIdentifier");
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        ProductSpaceIdentifier.Youth youth = spaceIdentifier instanceof ProductSpaceIdentifier.Youth ? (ProductSpaceIdentifier.Youth) spaceIdentifier : null;
        if (youth == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unexpected space identifier for youth space provider. Identifier = " + spaceIdentifier.f89741a);
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
            return new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
        }
        ProductSpaceIdentifier.Youth.State state = youth.f89754c;
        if (Intrinsics.f(state, ProductSpaceIdentifier.Youth.State.Discover.f89756a)) {
            return new go.g(new Data(zhm.u.c(d88.h.b()), null, false, 6, null), 2);
        }
        if (!(state instanceof ProductSpaceIdentifier.Youth.State.Active)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = ((ProductSpaceIdentifier.Youth.State.Active) state).f89755a;
        Intrinsics.checkNotNullParameter("observeJuniorProductAccounts", "name");
        List listC = zhm.u.c("observeJuniorProductAccounts");
        Set setSynchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        Intrinsics.checkNotNullExpressionValue(setSynchronizedSet, "synchronizedSet(...)");
        r10.w wVar = new r10.w(listC, setSynchronizedSet);
        Flow timeoutUnlessEmittedLazy = this.f111872a.b(str, subSpaceIdentifier, c8g.c.C(dataLoadingMode), wVar);
        Data dataP = zi0.c.P(f0.f322471a, false, null, 3);
        b.Companion companion = kotlin.time.b.INSTANCE;
        long jG = kotlin.time.c.g(Level.TRACE_INT, pkm.e.MILLISECONDS);
        co7.a provideSourceName = new co7.a(wVar, 28);
        Intrinsics.checkNotNullParameter(timeoutUnlessEmittedLazy, "$this$timeoutUnlessEmittedLazy");
        Intrinsics.checkNotNullParameter(provideSourceName, "provideSourceName");
        return vkm.q.m(new d0(timeoutUnlessEmittedLazy, jG, provideSourceName, dataP, (Continuation) null, 10));
    }

    @Override // pfe.g
    public final Flow d(sfe.a dataLoadingMode) {
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        w4l.k loadingStrategy = c8g.c.C(dataLoadingMode);
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        w4l.k kVar = !loadingStrategy.equals(w4l.j.f294644c) ? w4l.i.f294643c : loadingStrategy;
        d88.g gVar = this.f111872a;
        vkm.d dVarB = rd0.e.b(nim.a.w(kli.a.h(pd.b.r(zf8.k.a(gVar.f112149a, kVar), new d88.a(gVar, loadingStrategy, 0)), rd0.e.c(((d89.g) gVar.f).e(z79.b.JUNIOR), kotlin.coroutines.g.f186406a)), new d88.b(gVar, 1)));
        return ((jte.d) this.f111874c).c(JuniorAccountsApi$Toggles$YouthAccountEmptyState.f76698c) ? nim.a.v(dVarB, new d6j.b(this, 14)) : dVarB;
    }
}
