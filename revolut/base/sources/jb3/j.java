package jb3;

import com.revolut.feature.cash_topup.impl.data.service.CashTopUpService;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import j2c.n;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes21.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CashTopUpService f172588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hb3.c f172589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fd0.d f172590c;
    public final w4l.f d;

    public j(CashTopUpService service, hb3.c mapper, fd0.d memoryCache, b80.c networkStateRepository) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        this.f172588a = service;
        this.f172589b = mapper;
        this.f172590c = memoryCache;
        final int i = 0;
        final int i2 = 1;
        this.d = new w4l.f(w.k0(networkStateRepository, new Function1(this) { // from class: jb3.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f172586b;

            {
                this.f172586b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                k arg2 = (k) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(arg2, "arg");
                        cb3.a aVar = arg2.f172593c;
                        co3.a aVar2 = arg2.f172592b;
                        int i3 = g.f172587a[aVar.ordinal()];
                        j jVar = this.f172586b;
                        if (i3 != 1) {
                            if (i3 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            d0<List<hb3.e>> locationsEu = jVar.f172588a.getLocationsEu(aVar2.f25486a, aVar2.f25487b);
                            j6k.g gVar = new j6k.g(new e(jVar, arg2, 1), 13);
                            locationsEu.getClass();
                            ufm.i iVar = new ufm.i(locationsEu, gVar, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                            return iVar;
                        }
                        CashTopUpService cashTopUpService = jVar.f172588a;
                        co3.a aVar3 = arg2.f172591a;
                        d0<hb3.f> locations = cashTopUpService.getLocations(aVar3.f25486a + "," + aVar3.f25487b, aVar2.f25486a, aVar2.f25487b);
                        j6k.g gVar2 = new j6k.g(new e(jVar, arg2, 0), 12);
                        locations.getClass();
                        ufm.i iVar2 = new ufm.i(locations, gVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        Intrinsics.checkNotNullParameter(arg2, "location");
                        return (List) this.f172586b.f172590c.c(arg2);
                }
            }
        }), new Function1(this) { // from class: jb3.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f172586b;

            {
                this.f172586b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                k arg2 = (k) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(arg2, "arg");
                        cb3.a aVar = arg2.f172593c;
                        co3.a aVar2 = arg2.f172592b;
                        int i3 = g.f172587a[aVar.ordinal()];
                        j jVar = this.f172586b;
                        if (i3 != 1) {
                            if (i3 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            d0<List<hb3.e>> locationsEu = jVar.f172588a.getLocationsEu(aVar2.f25486a, aVar2.f25487b);
                            j6k.g gVar = new j6k.g(new e(jVar, arg2, 1), 13);
                            locationsEu.getClass();
                            ufm.i iVar = new ufm.i(locationsEu, gVar, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                            return iVar;
                        }
                        CashTopUpService cashTopUpService = jVar.f172588a;
                        co3.a aVar3 = arg2.f172591a;
                        d0<hb3.f> locations = cashTopUpService.getLocations(aVar3.f25486a + "," + aVar3.f25487b, aVar2.f25486a, aVar2.f25487b);
                        j6k.g gVar2 = new j6k.g(new e(jVar, arg2, 0), 12);
                        locations.getClass();
                        ufm.i iVar2 = new ufm.i(locations, gVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        Intrinsics.checkNotNullParameter(arg2, "location");
                        return (List) this.f172586b.f172590c.c(arg2);
                }
            }
        }, new n(this, 25), null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }
}
