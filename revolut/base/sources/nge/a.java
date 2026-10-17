package nge;

import jge.n;
import kotlin.jvm.internal.Intrinsics;
import pie.v;
import uie.i;
import uie.j;
import vc.s;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f215137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qie.a f215138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rj1.e f215139c;
    public final n d;

    public a(i iVar, qie.a aVar, rj1.e eVar, n nVar) {
        this.f215137a = iVar;
        this.f215138b = aVar;
        this.f215139c = eVar;
        this.d = nVar;
    }

    public final b9k.f a() {
        h defaultAccountResolver = new h();
        j dependenciesApi = this.f215137a.f280394a;
        Intrinsics.checkNotNullParameter(dependenciesApi, "dependenciesApi");
        b accountVisibilityFilter = new b((vie.a) dependenciesApi.a().f13500c);
        d analyticsScreenNameProvider = new d();
        vie.h tabCreditAvailabilityInteractor = this.f215138b.a();
        s.j(tabCreditAvailabilityInteractor);
        f fVar = g.Companion;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(tabCreditAvailabilityInteractor, "tabCreditAvailabilityInteractor");
        rfe.d productSpacesSelectionPolicy = new rfe.d(tabCreditAvailabilityInteractor.a() ? y0.b(v.CREDIT) : h0.f322473a, y0.b(pie.a.CREDIT_HUB));
        c showSwitchingButtonPolicy = new c();
        fVar.getClass();
        qm.e advisedComponentsInteractor = this.f215139c.a();
        kge.d accountNotificationRepository = new kge.d((dge.b) this.d.e.get(), new ne0.d());
        Intrinsics.checkNotNullParameter(defaultAccountResolver, "defaultAccountResolver");
        Intrinsics.checkNotNullParameter(accountVisibilityFilter, "accountVisibilityFilter");
        Intrinsics.checkNotNullParameter(analyticsScreenNameProvider, "analyticsScreenNameProvider");
        Intrinsics.checkNotNullParameter(productSpacesSelectionPolicy, "productSpacesSelectionPolicy");
        Intrinsics.checkNotNullParameter(showSwitchingButtonPolicy, "showSwitchingButtonPolicy");
        qge.c tabNoContentLeftHandler = qge.c.f245790a;
        Intrinsics.checkNotNullParameter(tabNoContentLeftHandler, "tabNoContentLeftHandler");
        Intrinsics.checkNotNullParameter(advisedComponentsInteractor, "advisedComponentsInteractor");
        Intrinsics.checkNotNullParameter(accountNotificationRepository, "accountNotificationRepository");
        Intrinsics.checkNotNullParameter(defaultAccountResolver, "defaultAccountResolver");
        Intrinsics.checkNotNullParameter(accountVisibilityFilter, "accountVisibilityFilter");
        Intrinsics.checkNotNullParameter(analyticsScreenNameProvider, "analyticsScreenNameProvider");
        Intrinsics.checkNotNullParameter(productSpacesSelectionPolicy, "productSpacesSelectionPolicy");
        Intrinsics.checkNotNullParameter(showSwitchingButtonPolicy, "showSwitchingButtonPolicy");
        qge.c tabNoContentLeftHandler2 = qge.c.f245790a;
        Intrinsics.checkNotNullParameter(tabNoContentLeftHandler2, "tabNoContentLeftHandler");
        Intrinsics.checkNotNullParameter(advisedComponentsInteractor, "advisedComponentsInteractor");
        Intrinsics.checkNotNullParameter(accountNotificationRepository, "accountNotificationRepository");
        b9k.f fVar2 = new b9k.f();
        fVar2.f13817b = defaultAccountResolver;
        fVar2.f13816a = accountVisibilityFilter;
        fVar2.f13818c = analyticsScreenNameProvider;
        fVar2.d = productSpacesSelectionPolicy;
        fVar2.e = showSwitchingButtonPolicy;
        fVar2.f = advisedComponentsInteractor;
        fVar2.f13819g = accountNotificationRepository;
        return fVar2;
    }
}
