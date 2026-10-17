package neg;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.travel.hotels.api.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class v implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final meg.i f214539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final peg.a f214540b;

    public v(meg.i filtersUIMapper, peg.a appliedFiltersMapper, peg.c smartFiltersMapper) {
        Intrinsics.checkNotNullParameter(filtersUIMapper, "filtersUIMapper");
        Intrinsics.checkNotNullParameter(appliedFiltersMapper, "appliedFiltersMapper");
        Intrinsics.checkNotNullParameter(smartFiltersMapper, "smartFiltersMapper");
        this.f214539a = filtersUIMapper;
        this.f214540b = appliedFiltersMapper;
    }

    public static LargeActionButtonDelegate.Model a(zfi.b bVar) {
        return new LargeActionButtonDelegate.Model(j6.a.q("SEE_ALL_", bVar.c()), LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R$string.hotels_common_see_all, null, null, 14), false, null, null, bVar, null, 744);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        l domainState = (l) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (o) iii.c.f(t1.t(domainState.f214514a, domainState.f214515b), new nd8.i(this, 11), new n87.r(21), new m88.c(domainState, this, 27));
    }
}
