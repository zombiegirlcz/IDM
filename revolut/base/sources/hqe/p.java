package hqe;

import com.revolut.data.model.Data;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import com.revolut.feature.teen.accounts.api.TeenAccountsApi$Toggles$TeenGuardianHub;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import pie.v;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class p implements pfe.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f154692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f154693b;

    public p(o teenProductAccountsSourceDelegate, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(teenProductAccountsSourceDelegate, "teenProductAccountsSourceDelegate");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f154692a = teenProductAccountsSourceDelegate;
        this.f154693b = featureToggleInteractor;
    }

    @Override // pfe.g
    public final Flow a() {
        return new go.g(Boolean.valueOf(((jte.d) this.f154693b).c(TeenAccountsApi$Toggles$TeenGuardianHub.f90321c)), 2);
    }

    @Override // pfe.g
    public final boolean b() {
        return true;
    }

    @Override // pfe.g
    public final Flow c(ProductSpaceIdentifier spaceIdentifier, v subSpaceIdentifier, sfe.a dataLoadingMode) {
        Intrinsics.checkNotNullParameter(spaceIdentifier, "spaceIdentifier");
        Intrinsics.checkNotNullParameter(subSpaceIdentifier, "subSpaceIdentifier");
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        ProductSpaceIdentifier.Teen teen = spaceIdentifier instanceof ProductSpaceIdentifier.Teen ? (ProductSpaceIdentifier.Teen) spaceIdentifier : null;
        if (teen != null) {
            w4l.k loadingStrategy = c8g.c.C(dataLoadingMode);
            String value = teen.f89752c;
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            Intrinsics.checkNotNullParameter(value, "$v$c$com-revolut-feature-identity-auth-domain-model-RegisteredIdentityId$-teenRegisteredIdentityId$0");
            return this.f154692a.b(value, loadingStrategy);
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unexpected space identifier for teen space provider. Identifier = " + spaceIdentifier.f89741a);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        return new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
    }

    @Override // pfe.g
    public final Flow d(sfe.a dataLoadingMode) {
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        w4l.k loadingStrategy = c8g.c.C(dataLoadingMode);
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return this.f154692a.b(null, loadingStrategy);
    }
}
