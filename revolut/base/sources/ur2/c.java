package ur2;

import ang.f;
import efm.d0;
import efm.r;
import java.io.IOException;
import jla.h;
import kotlin.jvm.internal.Intrinsics;
import ne0.o;
import or2.e;
import or2.g;
import q97.g3;
import qr2.l;
import te0.w;
import ufm.i;
import up5.k;
import yua.q;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f282236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final or2.b f282237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xua.a f282238c;
    public final h d;
    public final Object e;

    public c(f userInteractor, or2.b repository, xua.a recurringPaymentInteractor, h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f282236a = userInteractor;
        this.f282237b = repository;
        this.f282238c = recurringPaymentInteractor;
        this.d = productCatalogueInteractor;
        this.e = w.y0(new a(this, 0));
    }

    public static /* synthetic */ r c(c cVar, String str, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        return cVar.b(str, false);
    }

    public final pfm.r a(String transactionGroupId) {
        Intrinsics.checkNotNullParameter(transactionGroupId, "transactionId");
        g gVar = (g) this.f282237b;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(transactionGroupId, "transactionGroupId");
        d0<l> d0VarBlockMerchant = gVar.f228050c.blockMerchant(new pr2.a(transactionGroupId), "MANAGE_YOUTH_BLOCKED_MERCHANT");
        e eVar = new e(new or2.c(gVar, 7), 1);
        d0VarBlockMerchant.getClass();
        pfm.a aVar = new pfm.a(new i(d0VarBlockMerchant, eVar, 1), new oq3.f(25, new or2.c(gVar, 0)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return w.g0(aVar);
    }

    public final r b(String str, boolean z) {
        r rVarSwitchMap = rd0.e.c(new g3(mo3.a.g(this.f282236a.j(w4l.h.f294642c), null, new k(15), 1), 25), kotlin.coroutines.g.f186406a).switchMap(new up5.d0(9, new pud.b(this, z, str, 20)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    public final pfm.a d(String merchantBlockageId, String transactionGroupId) throws IOException {
        Intrinsics.checkNotNullParameter(merchantBlockageId, "merchantBlockageId");
        Intrinsics.checkNotNullParameter(transactionGroupId, "transactionId");
        g gVar = (g) this.f282237b;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(merchantBlockageId, "merchantBlockageId");
        Intrinsics.checkNotNullParameter(transactionGroupId, "transactionGroupId");
        efm.b bVarDeleteBlockedMerchant = gVar.f228050c.deleteBlockedMerchant(merchantBlockageId, zhm.d0.k0(v.k("SUBSCRIPTION_BRAND_BLOCK", "MANAGE_YOUTH_BLOCKED_MERCHANT"), ",", null, null, 0, null, 62));
        pfm.h hVar = new pfm.h(new o(gVar, merchantBlockageId, 18), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        pfm.a aVarE = bVarDeleteBlockedMerchant.e(hVar);
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        pfm.a aVarE2 = w.g0(aVarE).e(ue0.e.v(((q) this.f282238c).t(true)));
        Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
        return aVarE2;
    }
}
