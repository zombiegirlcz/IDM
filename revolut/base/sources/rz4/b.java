package rz4;

import efm.d0;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import mfm.f;
import rfm.j;
import rfm.w;
import rfm.y;
import ryd.k;
import uyd.z;
import uyh.t;
import uz4.c;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f258509a;

    public b(c creditRepository) {
        Intrinsics.checkNotNullParameter(creditRepository, "creditRepository");
        this.f258509a = creditRepository;
    }

    public final y a(String facilityId, String applicationId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        c cVar = this.f258509a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        d0<tz4.c> forbearanceApplicationById = cVar.f284588a.getForbearanceApplicationById(facilityId, applicationId);
        z zVar = new z(22, new t(3));
        forbearanceApplicationById.getClass();
        j jVar = new j(forbearanceApplicationById, zVar, 2);
        Intrinsics.checkNotNullExpressionValue(jVar, "flatMapMaybe(...)");
        w wVarH0 = te0.w.h0(jVar);
        ryd.j jVar2 = new ryd.j(new k(6), 12);
        dfm.c cVar2 = f.d;
        y yVar = new y(wVarH0, cVar2, jVar2, cVar2, f.f205043c);
        Intrinsics.checkNotNullExpressionValue(yVar, "doOnSuccess(...)");
        return yVar;
    }

    public final r b(String facilityId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        c cVar = this.f258509a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return cVar.e.e(facilityId, loadingStrategy);
    }
}
