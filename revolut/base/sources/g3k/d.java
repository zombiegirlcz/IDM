package g3k;

import ang.f;
import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceRouteId;
import efm.d0;
import efm.r;
import g1i.i0;
import i3k.e;
import i3k.m;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kq2.g;
import ufm.i;
import w4l.h;
import w4l.k;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f140303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f140304b;

    public d(e repository, f userInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f140303a = repository;
        this.f140304b = userInteractor;
    }

    public static /* synthetic */ sfm.b b(d dVar, wi0.b bVar, xi0.b bVar2, xi0.b bVar3, RemittanceRouteId remittanceRouteId, String str, int i) {
        if ((i & 16) != 0) {
            str = null;
        }
        return dVar.a(bVar, bVar2, bVar3, remittanceRouteId, str, h.f294642c, null);
    }

    public static r c(d dVar) {
        return ((m) dVar.f140303a).k.f(Unit.f186387a, false);
    }

    public final sfm.b a(wi0.b recipientCountry, xi0.b sourceCurrency, xi0.b targetCurrency, RemittanceRouteId routeId, String str, k loadingStrategy, g gVar) {
        Intrinsics.checkNotNullParameter(recipientCountry, "recipientCountry");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(routeId, "routeId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        d0 d0VarF = this.f140304b.f(false);
        c cVar = c.f;
        sfm.b bVar = new sfm.b(new i(d0VarF, new dug.e(24), 1), new i0(16, new aqd.f(this, recipientCountry, targetCurrency, sourceCurrency, routeId, str, loadingStrategy, gVar, 1)), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        return bVar;
    }
}
