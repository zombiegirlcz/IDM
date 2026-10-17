package pgi;

import android.net.Uri;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.feature_pdf_view.PdfViewFeatureConfiguration;
import com.revolut.feature_web_view.presentation.WebViewActivity;
import com.revolut.feature_web_view.presentation.WebViewContract$WebViewConfiguration;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ozc.z;
import pb2.v;
import pfk.h0;
import skm.p0;
import te0.w;
import wli.x;

/* JADX INFO: loaded from: classes10.dex */
public final class s extends pri.b implements i {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WebViewContract$WebViewConfiguration f235970h;
    public final l i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x f235971j;
    public final sri.m k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f80.a f235972l;

    public s(WebViewContract$WebViewConfiguration config, l presentationModel, x deepLinkRouter, sri.m navigator, f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(deepLinkRouter, "deepLinkRouter");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f235970h = config;
        this.i = presentationModel;
        this.f235971j = deepLinkRouter;
        this.k = navigator;
        this.f235972l = uriHelper;
    }

    @Override // pgi.i
    public final void B(String str, String str2, String str3, String str4) {
        f80.a aVar = this.f235972l;
        Uri uriF = str != null ? ((f80.b) aVar).f(str) : null;
        Uri uriF2 = str2 != null ? ((f80.b) aVar).f(str2) : null;
        if (uriF == null || uriF2 == null || uriF.getHost() == null || !Intrinsics.f(uriF.getHost(), uriF2.getHost()) || uriF.getScheme() == null || !Intrinsics.f(uriF.getScheme(), uriF2.getScheme())) {
            return;
        }
        NaviCommand naviCommandA = this.i.a(uriF, str3 != null ? ((f80.b) aVar).f(str3) : null, str4);
        sri.m mVar = this.k;
        if (naviCommandA != null) {
            mVar.c(r6.b.g(null, null, null, 7, naviCommandA));
        } else {
            com.google.android.gms.internal.mlkit_vision_face.a.C(null, null, null, 7, mVar);
        }
    }

    @Override // pri.b, pri.e
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void h(j view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        efm.b bVarD = this.i.d(this.f235970h.i);
        Function1 function1K = K();
        m3l.d dVar = new m3l.d(15, new p2i.l(new BreadcrumbException(), 28));
        bVarD.getClass();
        pfm.a aVar = new pfm.a(bVarD, dVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new o9h.d(7, function1K), new z(9, r.f235969a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        efm.r rVarSwitchMap = ((WebViewActivity) view).z0.startWith(Unit.f186387a).switchMap(new pfa.c(new v(this, 18), 18));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        efm.r rVarF = o70.a.f(rVarSwitchMap);
        v vVar = new v(view, 19);
        Function1 function1K2 = K();
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new m3l.d(15, new p2i.l(new BreadcrumbException(), 27)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new o9h.d(7, vVar), new o9h.d(7, function1K2), new z(9, function0J));
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
    }

    @Override // pri.b, pri.e
    public final void l() {
        super.l();
        this.i.c(this.f235970h.i);
    }

    @Override // pgi.i
    public final boolean u(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        efm.r rVarFromCallable = efm.r.fromCallable(new p(url2, this, 0));
        Intrinsics.checkNotNullExpressionValue(rVarFromCallable, "fromCallable(...)");
        efm.r rVarC = o70.a.c(rVarFromCallable);
        efm.r rVarX = w.o0(p0.f264003c, new pdi.j(this, url2, null, 10)).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        efm.r rVarFromCallable2 = efm.r.fromCallable(new p(url2, this, 1));
        Intrinsics.checkNotNullExpressionValue(rVarFromCallable2, "fromCallable(...)");
        efm.r rVarFilter = efm.r.concatArray(rVarC, rVarX, o70.a.c(rVarFromCallable2)).takeUntil(new pfa.c(new h0(17), 19)).filter(new pfa.c(new h0(18), 20));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        efm.r rVarF = o70.a.f(rVarFilter);
        efm.r rVarFromCallable3 = efm.r.fromCallable(new p(this, url2));
        Intrinsics.checkNotNullExpressionValue(rVarFromCallable3, "fromCallable(...)");
        efm.r rVarSwitchIfEmpty = rVarF.switchIfEmpty(o70.a.c(rVarFromCallable3));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchIfEmpty, "switchIfEmpty(...)");
        efm.r rVarE = ue0.e.E(rVarSwitchIfEmpty, Boolean.TRUE);
        p5e.h hVar = new p5e.h(this, url2, 21);
        Function1 function1K = K();
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarE.onErrorResumeNext(new m3l.d(15, new p2i.l(new BreadcrumbException(), 29)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new o9h.d(7, hVar), new o9h.d(7, function1K), new z(9, function0J));
        w.j0(this.f239031a, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        return true;
    }

    @Override // pgi.i
    public final void y(String url2, String contentType) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        if (contentType.equals("application/pdf")) {
            FinishCommand finishCommand = new FinishCommand(null, null, null, 7);
            WebViewContract$WebViewConfiguration webViewContract$WebViewConfiguration = this.f235970h;
            this.k.c(com.revolut.retail.core.navigation.a.c(finishCommand, new FeatureCommand(new PdfViewFeatureConfiguration(url2, webViewContract$WebViewConfiguration.f98175b, false, webViewContract$WebViewConfiguration.f98184q, 28))));
        }
    }
}
