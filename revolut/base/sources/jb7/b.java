package jb7;

import com.revolut.feature.hidden_accounts.api.domain.HiddenAccountsConfig;
import ie7.h;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import qfe.j;
import qfe.l;
import qfe.m;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f172599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wa7.m f172600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f172601c;

    public b(m spaceContentModelsProvider, wa7.m hiddenAccountsInteractor, f hideableAccountsSpaceFilter) {
        Intrinsics.checkNotNullParameter(spaceContentModelsProvider, "spaceContentModelsProvider");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        Intrinsics.checkNotNullParameter(hideableAccountsSpaceFilter, "hideableAccountsSpaceFilter");
        this.f172599a = spaceContentModelsProvider;
        this.f172600b = hiddenAccountsInteractor;
        this.f172601c = hideableAccountsSpaceFilter;
    }

    @Override // jb7.d
    public final Flow a(HiddenAccountsConfig config, na7.b accountType, l filterType) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        boolean zF = Intrinsics.f(filterType, j.f245295a);
        m mVar = this.f172599a;
        return zF ? new h(mVar.a(sfe.a.CACHE_ONLY, filterType), this, 8) : new t38.e(mVar.a(sfe.a.CACHE_ONLY, filterType), 24, this.f172600b.i(accountType), new j40.d(this, null, 2));
    }
}
