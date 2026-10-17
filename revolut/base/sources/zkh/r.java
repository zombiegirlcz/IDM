package zkh;

import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import z0h.o1;

/* JADX INFO: loaded from: classes10.dex */
public final class r implements z87.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tzg.m f323029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0h.d f323030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z0h.a f323031c;
    public final lih.a d;
    public final o97.r e;

    public r(tzg.m wealthAccountsInteractor, z0h.d disclaimersDataProvider, z0h.a clauseDestinationProvider, lih.a footerMapper) {
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(disclaimersDataProvider, "disclaimersDataProvider");
        Intrinsics.checkNotNullParameter(clauseDestinationProvider, "clauseDestinationProvider");
        Intrinsics.checkNotNullParameter(footerMapper, "footerMapper");
        this.f323029a = wealthAccountsInteractor;
        this.f323030b = disclaimersDataProvider;
        this.f323031c = clauseDestinationProvider;
        this.d = footerMapper;
        this.e = o97.r.WEALTH_DISCLAIMER;
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        if (searchQuery.length() == 0) {
            z0h.d dVar = this.f323030b;
            return rd0.e.c(new ymk.u(yh5.b.e(dVar.w0(), dVar.s1(), tzg.m.c(this.f323029a, null, null, 3)), this, 10), kotlin.coroutines.g.f186406a);
        }
        efm.r rVarJust = efm.r.just(zi0.c.P(zhm.u.c(new o97.e0(zhm.f0.f322471a)), false, null, 3));
        Intrinsics.h(rVarJust);
        return rVarJust;
    }

    @Override // z87.f
    public final o97.r h() {
        return this.e;
    }

    @Override // z87.f
    public final Object l(String str, o97.y yVar, Continuation continuation) {
        Object obj2 = yVar.f223136b;
        NaviCommand naviCommandI0 = this.f323031c.I0(obj2 instanceof o1 ? (o1) obj2 : null);
        return naviCommandI0 != null ? new o97.l(naviCommandI0) : o97.e.f223096a;
    }
}
