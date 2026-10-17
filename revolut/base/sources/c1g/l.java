package c1g;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0g.b f20495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f20496b;

    public l(i0g.b repository, wsg.n walletInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f20495a = repository;
        this.f20496b = walletInteractor;
    }

    public final efm.r a(String str, TravelExperienceDatesSelection datesSelection, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-travel-experiences-api-models-search-LocationId-DestinationId$-destinationId$0");
        Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        w4l.h hVar = w4l.h.f294642c;
        return pd.b.r(this.f20496b.J(AccountId.Personal.f51414a, hVar), new a5b.b(this, str, datesSelection, loadingStrategy, 14));
    }
}
