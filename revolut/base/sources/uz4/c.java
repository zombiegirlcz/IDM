package uz4;

import com.revolut.feature.credit.forbearance.application.impl.network.ForbearanceApplicationService;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import ehe.n;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import r10.f;
import t90.g;
import ufm.i;
import uyd.y;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ForbearanceApplicationService f284588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f284589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f284590c;
    public final f d;
    public final w4l.f e;

    public c(ForbearanceApplicationService api2, g backendFlowMapper, j memoryCache, f networkUrlBuilder) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(backendFlowMapper, "backendFlowMapper");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(networkUrlBuilder, "networkUrlBuilder");
        this.f284588a = api2;
        this.f284589b = backendFlowMapper;
        this.f284590c = memoryCache;
        this.d = networkUrlBuilder;
        final int i = 1;
        final int i2 = 0;
        this.e = new w4l.f(new Function2(this) { // from class: uz4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f284587b;

            {
                this.f284587b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i3 = i;
                c cVar = this.f284587b;
                switch (i3) {
                    case 0:
                        String facilityId = (String) obj2;
                        List applications = (List) obj3;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(applications, "applications");
                        n.z("FORBEARANCE_APPLICATIONS_KEY-", facilityId, cVar.f284590c, applications);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String facilityId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        d0<List<tz4.c>> forbearanceApplications = cVar.f284588a.getForbearanceApplications(facilityId2);
                        b bVar = b.f;
                        y yVar = new y(2);
                        forbearanceApplications.getClass();
                        i iVar = new i(forbearanceApplications, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                }
            }
        }, new uu9.b(this, 17), new Function2(this) { // from class: uz4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f284587b;

            {
                this.f284587b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i3 = i2;
                c cVar = this.f284587b;
                switch (i3) {
                    case 0:
                        String facilityId = (String) obj2;
                        List applications = (List) obj3;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(applications, "applications");
                        n.z("FORBEARANCE_APPLICATIONS_KEY-", facilityId, cVar.f284590c, applications);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String facilityId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        d0<List<tz4.c>> forbearanceApplications = cVar.f284588a.getForbearanceApplications(facilityId2);
                        b bVar = b.f;
                        y yVar = new y(2);
                        forbearanceApplications.getClass();
                        i iVar = new i(forbearanceApplications, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }
}
