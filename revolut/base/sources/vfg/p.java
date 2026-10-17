package vfg;

import android.view.View;
import cli.y;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.snackbar.ContentViewCallback;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.CatalogueProductDetailsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.bond_details.BondDetailsController;
import e8h.n0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import vkm.j2;
import ymk.u;
import zc0.x2;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements rfe.p, kfm.o, n2h.g, zp0.c, yl0.a, ContentViewCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f288632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f288633b;

    public /* synthetic */ p() {
        this.f288632a = 15;
    }

    @Override // n2h.g
    public efm.r C0() {
        BondDetailsController bondDetailsController = (BondDetailsController) this.f288633b;
        KProperty[] kPropertyArr = BondDetailsController.H0;
        return bondDetailsController.d3().d.d();
    }

    @Override // n2h.g
    public efm.r G0() {
        BondDetailsController bondDetailsController = (BondDetailsController) this.f288633b;
        KProperty[] kPropertyArr = BondDetailsController.H0;
        return bondDetailsController.d3().d.c();
    }

    @Override // yl0.a
    public rm0.i a() {
        rm0.q qVar = (rm0.q) this.f288633b;
        rm0.r rVar = rm0.r.V2_OAEP;
        hn0.a aVar = hn0.a.f154013a;
        rm0.b bVar = (rm0.b) qVar;
        rm0.i iVarE = bVar.e(new hn0.k(aVar, rVar));
        return !(iVarE instanceof rm0.c) ? iVarE : bVar.e(new hn0.k(aVar, rm0.r.V1_PKCS1));
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentIn(int i, int i2) {
        View view = (View) this.f288633b;
        view.setAlpha(BitmapDescriptorFactory.HUE_RED);
        view.animate().alpha(1.0f).setDuration(i2).setStartDelay(i).start();
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentOut(int i, int i2) {
        View view = (View) this.f288633b;
        view.setAlpha(1.0f);
        view.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(i2).setStartDelay(i).start();
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public /* synthetic */ Object apply(Object obj2) {
        switch (this.f288632a) {
            case 2:
                return ((vx5.r) this.f288633b).invoke(obj2);
            case 3:
                return ((vx5.r) this.f288633b).invoke(obj2);
            case 4:
            case 6:
            case 7:
            case 8:
            case 11:
            case 12:
            default:
                return ((x2) this.f288633b).invoke(obj2);
            case 5:
                return ((vx5.r) this.f288633b).invoke(obj2);
            case 9:
                return ((x94.q) this.f288633b).invoke(obj2);
            case 10:
                return ((x94.q) this.f288633b).invoke(obj2);
            case 13:
                return ((xnd.c) this.f288633b).invoke(obj2);
            case 14:
                return ((xy7.n) this.f288633b).invoke(obj2);
        }
    }

    @Override // rfe.p
    public Object b(gim.c cVar) {
        Object objC = ((vie.i) this.f288633b).c(false, cVar);
        return objC == fim.a.COROUTINE_SUSPENDED ? objC : Unit.f186387a;
    }

    public yb.s c() {
        return new yb.s((yb.r) this.f288633b);
    }

    public boolean d() {
        return ((wt2.b) this.f288633b).f299765a.d("security_hub.not_calling_banner", null) == bla.c.ENABLED;
    }

    public efm.r e(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        qrk.a aVar = (qrk.a) this.f288633b;
        xsk.h.Companion.getClass();
        vkm.d dVarA = qrk.a.a(aVar, ref2, xsk.a.f308552b, 4, 4);
        h0 h0Var = h0.f322473a;
        return rd0.e.c(new uf0.b(new Flow[]{rd0.e.n(dVarA, h0Var), rd0.e.n(qrk.a.a(aVar, ref2, xsk.a.f308553c, 4, 4), h0Var)}, 18), kotlin.coroutines.g.f186406a);
    }

    public wn.a f() {
        return new wn.a((xn.b) this.f288633b);
    }

    public u g() {
        return new u(((wa7.m) this.f288633b).k(), this, 7);
    }

    public void h(yb.r rVar) {
        this.f288633b = rVar;
    }

    @Override // zp0.c
    public void k(String extractedValue, String formattedValue, boolean z) {
        String str;
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.a aVar = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.a) ((CatalogueProductDetailsScreen) this.f288633b).R2();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        w80.b bVar = aVar.f60825p;
        y yVar = aVar.f60829t;
        xi0.b bVar2 = ((ye1.i) ((j2) yVar.f22677a).getValue()).f312745a;
        if (bVar2 == null || (str = bVar2.f306286a) == null) {
            return;
        }
        aVar.H2(yVar, new oe1.j(formattedValue, bVar.b(formattedValue, str), z ? od1.b.AMOUNT : od1.b.NONE, 1));
    }

    public /* synthetic */ p(ViewController viewController, int i) {
        this.f288632a = i;
        this.f288633b = viewController;
    }

    public p(vx5.r function) {
        this.f288632a = 2;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f288633b = function;
    }

    public p(vx5.r function, byte b4) {
        this.f288632a = 3;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f288633b = function;
    }

    public p(vx5.r function, char c2) {
        this.f288632a = 5;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f288633b = function;
    }

    public p(x94.q function) {
        this.f288632a = 9;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f288633b = function;
    }

    public p(x94.q function, byte b4) {
        this.f288632a = 10;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f288633b = function;
    }

    public p(xnd.c function) {
        this.f288632a = 13;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f288633b = function;
    }

    public p(xy7.n function) {
        this.f288632a = 14;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f288633b = function;
    }

    public p(x2 function) {
        this.f288632a = 27;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f288633b = function;
    }

    public p(lr.e repository) {
        this.f288632a = 19;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f288633b = repository;
    }

    public p(wt2.b availabilityConfiguration) {
        this.f288632a = 26;
        Intrinsics.checkNotNullParameter(availabilityConfiguration, "availabilityConfiguration");
        this.f288633b = availabilityConfiguration;
    }

    public p(u1l.g repository) {
        this.f288632a = 22;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f288633b = repository;
    }

    public p(xn.b adsTrackingInteractor) {
        this.f288632a = 6;
        Intrinsics.checkNotNullParameter(adsTrackingInteractor, "adsTrackingInteractor");
        this.f288633b = adsTrackingInteractor;
    }

    public p(lfg.l repository) {
        this.f288632a = 0;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f288633b = repository;
    }

    public p(n0 repository) {
        this.f288632a = 8;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f288633b = repository;
    }

    public p(je0.d objectMapper) {
        this.f288632a = 4;
        Intrinsics.checkNotNullParameter(objectMapper, "objectMapper");
        this.f288633b = objectMapper;
    }

    public p(rm0.q cipherProvider) {
        this.f288632a = 17;
        Intrinsics.checkNotNullParameter(cipherProvider, "cipherProvider");
        hn0.a alias = hn0.a.f154013a;
        Intrinsics.checkNotNullParameter(alias, "alias");
        this.f288633b = cipherProvider;
    }

    public p(yoc.m roboTransactionResourcesProvider, yoc.e transactionMapper) {
        this.f288632a = 18;
        Intrinsics.checkNotNullParameter(roboTransactionResourcesProvider, "roboTransactionResourcesProvider");
        Intrinsics.checkNotNullParameter(transactionMapper, "transactionMapper");
        this.f288633b = roboTransactionResourcesProvider;
    }

    public p(jt0.b juniorAllowanceRecurringPaymentInteractor) {
        this.f288632a = 21;
        Intrinsics.checkNotNullParameter(juniorAllowanceRecurringPaymentInteractor, "juniorAllowanceRecurringPaymentInteractor");
        this.f288633b = juniorAllowanceRecurringPaymentInteractor;
    }

    public p(vie.i preferencesInteractor) {
        this.f288632a = 1;
        Intrinsics.checkNotNullParameter(preferencesInteractor, "preferencesInteractor");
        this.f288633b = preferencesInteractor;
    }

    public p(wa7.m hiddenAccountsInteractor, xa7.a hiddenAccountEntryPointItemMapper) {
        this.f288632a = 24;
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountEntryPointItemMapper, "hiddenAccountEntryPointItemMapper");
        this.f288633b = hiddenAccountsInteractor;
    }

    public p(yhl.g tradeDiscoveryInteractor) {
        this.f288632a = 25;
        Intrinsics.checkNotNullParameter(tradeDiscoveryInteractor, "tradeDiscoveryInteractor");
        this.f288633b = tradeDiscoveryInteractor;
    }

    public p(qrk.a interactor) {
        this.f288632a = 12;
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f288633b = interactor;
    }

    public p(wl0.c biometricHelper) {
        this.f288632a = 11;
        Intrinsics.checkNotNullParameter(biometricHelper, "biometricHelper");
        this.f288633b = biometricHelper;
    }

    public p(qd0.b languageProvider) {
        this.f288632a = 23;
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f288633b = languageProvider;
    }

    public p(View content) {
        this.f288632a = 20;
        Intrinsics.checkNotNullParameter(content, "content");
        this.f288633b = content;
    }
}
