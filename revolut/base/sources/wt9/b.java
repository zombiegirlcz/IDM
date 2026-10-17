package wt9;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;
import rfm.j;
import rfm.w;
import xng.l;
import xt9.f;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f299843a;

    public b(f repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f299843a = repository;
    }

    public final w a(String qrCode) {
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        f fVar = this.f299843a;
        d0<Response<xt9.c>> qrCodeV2 = fVar.f308781a.getQrCodeV2(new xt9.b(qrCode));
        xt1.a aVar = new xt1.a(6, new l(fVar, 20));
        qrCodeV2.getClass();
        j jVar = new j(qrCodeV2, aVar, 2);
        Intrinsics.checkNotNullExpressionValue(jVar, "flatMapMaybe(...)");
        return te0.w.h0(jVar);
    }
}
