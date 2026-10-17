package pak;

import al4.m;
import android.R;
import android.content.Context;
import android.graphics.Matrix;
import android.view.WindowManager;
import au0.l5;
import aw0.v1;
import aw0.y9;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvd;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.mlkit.vision.text.Text;
import com.revolut.core.ui_kit.delegates.ContextualLineChartDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.lightprompt.LightPromptViewModel;
import com.revolut.core.ui_kit.views.lightprompt.LightPromptFullScreenView;
import com.revolut.feature.apm.core.api.product.ApmBizum;
import com.revolut.feature.apm.core.ui.api.navigation.ApmNewContactNavigation$InputData;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.payinstore.impl.ui.screen.PayInStoreScreen;
import com.revolut.feature_pdf_view.PdfViewFeatureConfiguration;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import efm.y;
import f7j.p;
import fjm.j;
import io.reactivex.rxjava3.disposables.Disposable;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kfm.o;
import koi.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import om4.r1;
import q50.t;
import qn9.q;
import qp5.x;
import sgm.t5;
import skm.e0;
import t1h.l;
import wsg.n;
import zh9.u0;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class h implements o, y50.a, zzu, zp0.c, kfm.g, l, igm.g, vt0.a, igm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f234572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f234573b;

    public /* synthetic */ h() {
        this.f234572a = 20;
    }

    public static TextLocalisedClause h(ql4.g gVar) {
        int i = tm4.a.f272155a[gVar.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.credit_card_instalment_document_amortisation_table, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.credit_card_instalment_document_addendum_title, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    public rga.a a(String tag2) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        return new rga.a((rga.c) this.f234573b, tag2);
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f234572a) {
            case 9:
                ((j) this.f234573b).invoke(obj2);
                break;
            case 22:
                t5 t5Var = (t5) this.f234573b;
                t5Var.getClass();
                jgm.b.d(t5Var, (Disposable) obj2);
                break;
            default:
                ((y) this.f234573b).onNext(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object obj2) {
        switch (this.f234572a) {
            case 0:
                return ((e) this.f234573b).invoke(obj2);
            case 8:
                return ((x) this.f234573b).invoke(obj2);
            case 10:
                return ((x) this.f234573b).invoke(obj2);
            case 11:
                return ((x) this.f234573b).invoke(obj2);
            default:
                Object objApply = ((igm.o) ((tgm.d) this.f234573b).f271208c).apply(new Object[]{obj2});
                Objects.requireNonNull(objApply, "The zipper returned a null value");
                return objApply;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable b(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof rr9.b
            if (r0 == 0) goto L13
            r0 = r5
            rr9.b r0 = (rr9.b) r0
            int r1 = r0.f256742w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f256742w = r1
            goto L18
        L13:
            rr9.b r0 = new rr9.b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f256742w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            java.lang.Object r5 = r4.f234573b
            fk3.a r5 = (fk3.a) r5
            ik3.c r5 = (ik3.c) r5
            efm.r r5 = r5.n()
            r0.f256742w = r3
            java.lang.Object r5 = nim.a.c(r5, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            com.revolut.data.model.Data r5 = (com.revolut.data.model.Data) r5
            java.lang.Object r5 = r5.getContent()
            java.util.Set r5 = (java.util.Set) r5
            if (r5 == 0) goto L52
            java.util.Collection r5 = (java.util.Collection) r5
            goto L54
        L52:
            zhm.f0 r5 = zhm.f0.f322471a
        L54:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = zhm.w.t(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L65:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L77
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            xi0.a r2 = xi0.b.Companion
            t61.a.A(r2, r1, r0)
            goto L65
        L77:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r0 = r0.iterator()
        L80:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L97
            java.lang.Object r1 = r0.next()
            r2 = r1
            xi0.b r2 = (xi0.b) r2
            boolean r2 = cp5.d.A(r2)
            if (r2 == 0) goto L80
            r5.add(r1)
            goto L80
        L97:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pak.h.b(gim.c):java.io.Serializable");
    }

    public BridgeDestination c(String facilityId, String instalmentId, gs4.j document) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(instalmentId, "planId");
        Intrinsics.checkNotNullParameter(document, "document");
        m mVar = (m) this.f234573b;
        ql4.g documentType = document.f146322a;
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(instalmentId, "instalmentId");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        String baseUrl = ((r1) mVar).f226682h.getBaseUrl();
        return u0.c(new PdfViewFeatureConfiguration(v0.a.i(p.a.t(baseUrl, "/credit/", facilityId, "/instalments/", instalmentId), "/documents?type=", documentType.name()), h(document.f146322a), true, false, 56));
    }

    public c12.g d(hrf.f transferDirection, String str) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        n02.b bVar = n02.b.BIZUM;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_new_contact_title, u.c(ApmBizum.f61808c.e()), null, 12);
        wi0.b.Companion.getClass();
        return new c12.g(new ApmNewContactNavigation$InputData(bVar, (List) null, transferDirection, textLocalisedClause, wi0.b.f297750h0, (List) null, str, 66), (c12.f) this.f234573b);
    }

    @Override // t1h.l
    public t1h.o e(j60.a bottomExpandableDialogControllerExtension) {
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        return new rhh.h((rhh.a) this.f234573b, bottomExpandableDialogControllerExtension);
    }

    public BridgeDestination f(String facilityId, int i, dj0.d totalRepayable, String quoteIdentifier, ql4.g documentType, Set transactionIds, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(totalRepayable, "totalRepayable");
        Intrinsics.checkNotNullParameter(quoteIdentifier, "quoteIdentifier");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
        return u0.c(new PdfViewFeatureConfiguration(((r1) ((m) this.f234573b)).h(facilityId, i, totalRepayable, quoteIdentifier, documentType, transactionIds, dVar != null ? Long.valueOf(dVar.f115082a) : null), h(documentType), true, false, 56));
    }

    public boolean g() {
        return ((jla.h) this.f234573b).d("REVOLUT_PAY.payment_processing", null) == bla.c.ENABLED;
    }

    @Override // y50.a
    public void h1(fx.d dVar, koi.c delegatesManager) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(delegatesManager, "delegatesManager");
        k kVarC = delegatesManager.c(ContextualLineChartDelegate.class);
        if (kVarC == null) {
            kVarC = new ContextualLineChartDelegate();
            delegatesManager.a(kVarC);
        }
        e0.C(dVar.f138715a, null, null, new q03.m(rd0.e.b(((ContextualLineChartDelegate) kVarC).k), new t(this), null, 13), 3);
    }

    public void i(v1 v1Var) {
        y9 y9Var;
        LightPromptFullScreenView lightPromptFullScreenView = (LightPromptFullScreenView) this.f234573b;
        int i = LightPromptFullScreenView.f59148s;
        lightPromptFullScreenView.getClass();
        int i2 = v1Var == null ? -1 : sx0.a.f266246a[v1Var.ordinal()];
        if (i2 == -1) {
            y9Var = y9.THEME;
        } else if (i2 == 1) {
            y9Var = y9.DARK;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            y9Var = y9.LIGHT;
        }
        lightPromptFullScreenView.f = y9Var;
        lightPromptFullScreenView.f59152g = dx0.c.TRANSPARENT;
        lightPromptFullScreenView.a();
    }

    public void j() {
        LightPromptFullScreenView lightPromptFullScreenView = (LightPromptFullScreenView) this.f234573b;
        lightPromptFullScreenView.f59154j = false;
        vt0.m mVarD = lightPromptFullScreenView.d();
        mVarD.setAlpha(1.0f);
        mVarD.animate().setDuration(lightPromptFullScreenView.getResources().getInteger(R.integer.config_shortAnimTime)).alpha(BitmapDescriptorFactory.HUE_RED).setListener(new l5(mVarD, 23));
    }

    @Override // zp0.c
    public void k(String extractedValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        q qVar = (q) ((PayInStoreScreen) this.f234573b).T2();
        qVar.getClass();
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        qVar.x2(new b4b.x(5, qVar.f247893q.d(formattedValue)));
    }

    public void l() {
        LightPromptFullScreenView lightPromptFullScreenView = (LightPromptFullScreenView) this.f234573b;
        lightPromptFullScreenView.f59154j = true;
        vt0.m mVarD = lightPromptFullScreenView.d();
        mVarD.setAlpha(1.0f);
        lightPromptFullScreenView.e(mVarD);
        lightPromptFullScreenView.f = y9.THEME;
        lightPromptFullScreenView.f59152g = dx0.c.TRANSPARENT;
        lightPromptFullScreenView.a();
        vt0.h hVar = lightPromptFullScreenView.f59151c;
        if (hVar != null) {
            hVar.setVisibility(lightPromptFullScreenView.e instanceof LightPromptViewModel.V1Content ? 0 : 8);
        }
        vt0.d dVar = lightPromptFullScreenView.d;
        if (dVar != null) {
            dVar.setVisibility(lightPromptFullScreenView.e instanceof LightPromptViewModel.V2Content ? 0 : 8);
        }
    }

    public void m() {
        slm.k kVar = (slm.k) this.f234573b;
        kVar.getClass();
        slm.f fVar = slm.f.f264254c;
        byte[] array = kVar.f264272c.array();
        Intrinsics.checkNotNullExpressionValue(array, "array(...)");
        fVar.getClass();
        Intrinsics.checkNotNullParameter(array, "array");
        Intrinsics.checkNotNullParameter(array, "array");
        synchronized (fVar) {
            try {
                int i = fVar.f264261b;
                if (array.length + i < slm.e.f264252a) {
                    fVar.f264261b = i + (array.length / 2);
                    fVar.f264260a.addLast(array);
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
    public Object zza(Object obj2) {
        zzvd zzvdVar = (zzvd) obj2;
        zzvdVar.zzb();
        zzvdVar.zza();
        return new Text.Line(zzvdVar, (Matrix) this.f234573b);
    }

    public h(j function) {
        this.f234572a = 9;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f234573b = function;
    }

    public /* synthetic */ h(Object obj2, int i) {
        this.f234572a = i;
        this.f234573b = obj2;
    }

    public h(e function) {
        this.f234572a = 0;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f234573b = function;
    }

    public h(x function) {
        this.f234572a = 8;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f234573b = function;
    }

    public h(x function, byte b4) {
        this.f234572a = 10;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f234573b = function;
    }

    public h(x function, char c2) {
        this.f234572a = 11;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f234573b = function;
    }

    public h(rul.e eventsSender) {
        this.f234572a = 24;
        Intrinsics.checkNotNullParameter(eventsSender, "eventsSender");
        this.f234573b = eventsSender;
    }

    public h(rhh.a mapper) {
        this.f234572a = 15;
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f234573b = mapper;
    }

    public h(vje.a storiesProvider) {
        this.f234572a = 6;
        Intrinsics.checkNotNullParameter(storiesProvider, "storiesProvider");
        this.f234573b = storiesProvider;
    }

    public h(n walletInteractor) {
        this.f234572a = 16;
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f234573b = walletInteractor;
    }

    public h(com.revolut.retail.feature.api.userauth.navigation.a userOnboardingNavigationProvider) {
        this.f234572a = 21;
        Intrinsics.checkNotNullParameter(userOnboardingNavigationProvider, "userOnboardingNavigationProvider");
        this.f234573b = userOnboardingNavigationProvider;
    }

    public h(p targetPriceBuilder) {
        this.f234572a = 19;
        Intrinsics.checkNotNullParameter(targetPriceBuilder, "targetPriceBuilder");
        this.f234573b = targetPriceBuilder;
    }

    public h(fk3.a configurationInteractor) {
        this.f234572a = 17;
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f234573b = configurationInteractor;
    }

    public h(q50.u model) {
        this.f234572a = 3;
        Intrinsics.checkNotNullParameter(model, "model");
        this.f234573b = model;
    }

    public h(xoj.a featuresInteractor) {
        this.f234572a = 13;
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        this.f234573b = featuresInteractor;
    }

    public h(c12.f apmNewContactExtension) {
        this.f234572a = 18;
        Intrinsics.checkNotNullParameter(apmNewContactExtension, "apmNewContactExtension");
        this.f234573b = apmNewContactExtension;
    }

    public h(jla.h productCatalogueInteractor) {
        this.f234572a = 4;
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f234573b = productCatalogueInteractor;
    }

    public h(eof.b mapper) {
        this.f234572a = 1;
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f234573b = mapper;
    }

    public h(m creditCardInstalmentInteractor) {
        this.f234572a = 29;
        Intrinsics.checkNotNullParameter(creditCardInstalmentInteractor, "creditCardInstalmentInteractor");
        this.f234573b = creditCardInstalmentInteractor;
    }

    public h(Context context) {
        this.f234572a = 12;
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("window");
        Intrinsics.i(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f234573b = ((WindowManager) systemService).getDefaultDisplay();
    }

    public h(rga.c holder) {
        this.f234572a = 14;
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.f234573b = holder;
    }

    public h(w7f.e riskLevelStateMapper) {
        this.f234572a = 26;
        Intrinsics.checkNotNullParameter(riskLevelStateMapper, "riskLevelStateMapper");
        this.f234573b = riskLevelStateMapper;
    }

    public h(InputStream stream) {
        this.f234572a = 23;
        Intrinsics.checkNotNullParameter(stream, "stream");
        this.f234573b = new slm.k(stream, Charsets.UTF_8);
    }
}
