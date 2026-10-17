package dak;

import akl.s;
import com.revolut.feature.credit.pcw_auth.api.models.PcwApplicationStatus;
import com.revolut.retail.feature.pcw_auth.impl.network.services.PcwApplicationService;
import com.youTransactor.uCube.rpc.Constants;
import d73.n;
import efm.d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import ufm.i;

/* JADX INFO: loaded from: classes13.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PcwApplicationService f112548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f112549b;

    public f(PcwApplicationService pcwService, j memoryCache) {
        Intrinsics.checkNotNullParameter(pcwService, "pcwService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f112548a = pcwService;
        this.f112549b = memoryCache;
        final int i = 0;
        final int i2 = 1;
        new w4l.f(new Function2(this) { // from class: dak.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f112547b;

            {
                this.f112547b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String clientId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(clientId, "clientId");
                        d0<aak.a> applicationStatus = this.f112547b.f112548a.getApplicationStatus(clientId);
                        n nVar = new n(new c(0), 11);
                        applicationStatus.getClass();
                        i iVar = new i(applicationStatus, nVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        String clientId2 = (String) obj2;
                        PcwApplicationStatus status = (PcwApplicationStatus) obj3;
                        Intrinsics.checkNotNullParameter(clientId2, "clientId");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f112547b.f112549b.f("PCW_STATUS_CACHE_" + clientId2, status);
                        return Unit.f186387a;
                }
            }
        }, new s(this, 7), new Function2(this) { // from class: dak.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f112547b;

            {
                this.f112547b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String clientId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(clientId, "clientId");
                        d0<aak.a> applicationStatus = this.f112547b.f112548a.getApplicationStatus(clientId);
                        n nVar = new n(new c(0), 11);
                        applicationStatus.getClass();
                        i iVar = new i(applicationStatus, nVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        String clientId2 = (String) obj2;
                        PcwApplicationStatus status = (PcwApplicationStatus) obj3;
                        Intrinsics.checkNotNullParameter(clientId2, "clientId");
                        Intrinsics.checkNotNullParameter(status, "status");
                        this.f112547b.f112549b.f("PCW_STATUS_CACHE_" + clientId2, status);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }
}
