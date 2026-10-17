package ana;

import a08.q;
import a08.r;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.profile.impl.ui.details.emailverification.email.EmailScreenFragment;
import com.revolut.revolut.feature_fourthline_impl.R;
import efm.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ofm.h;
import org.jetbrains.annotations.NotNull;
import rfm.m;
import te0.s;
import te0.w;
import tpi.j;
import yma.p;
import ypi.i;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends bsi.a implements b {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f6613j;
    public final xpi.g k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p f6614l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final rpi.c f6615m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j f6616n;

    public g(i nextButtonView, xpi.g navBarWithToolbarView, p presentationModel, rpi.c keyboardView, j progressView) {
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        Intrinsics.checkNotNullParameter(navBarWithToolbarView, "navBarWithToolbarView");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(keyboardView, "keyboardView");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        this.f6613j = nextButtonView;
        this.k = navBarWithToolbarView;
        this.f6614l = presentationModel;
        this.f6615m = keyboardView;
        this.f6616n = progressView;
    }

    @Override // pri.a
    public final void N(rri.a aVar) {
        c view = (c) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        this.f6613j.setVisible(false);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R.string.profile_personal_details_email_title, null, null, 14);
        xpi.c cVar = (xpi.c) this.k;
        cVar.n0(textLocalisedClause);
        cVar.p0(new TextLocalisedClause(R.string.profile_personal_details_email_title, null, null, 14));
        cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        p pVar = this.f6614l;
        te0.e eVarX0 = ((yma.g) pVar.d).x0();
        s sVar = s.f270018a;
        k kVarFirstElement = eVarX0.c(sVar).firstElement();
        Intrinsics.checkNotNullExpressionValue(kVarFirstElement, "firstElement(...)");
        k kVarV = mo3.a.v(o70.a.h(kVarFirstElement), this.f6616n);
        Intrinsics.checkNotNullExpressionValue(kVarV, "withProgress(...)");
        amh.j jVar = new amh.j(this, view, 5);
        Function0 function0J = J();
        m mVar = new m(kVarV, new r(4, new a2i.j(new BreadcrumbException(), 15)), 2);
        Intrinsics.checkNotNullExpressionValue(mVar, "onErrorResumeNext(...)");
        a0d.g gVar = new a0d.g(2, jVar);
        akl.s sVar2 = this.i;
        rfm.b bVar = new rfm.b(gVar, new a0d.g(2, sVar2), new q(5, function0J));
        mVar.i(bVar);
        Intrinsics.checkNotNullExpressionValue(bVar, "subscribe(...)");
        ifm.b bVar2 = this.f239031a;
        w.j0(bVar2, bVar);
        yma.c cVar2 = pVar.d;
        yma.g gVar2 = (yma.g) cVar2;
        te0.j jVar2 = gVar2.f314911g;
        KProperty[] kPropertyArr = yma.g.k;
        k kVarFirstElement2 = jVar2.getValue(gVar2, kPropertyArr[4]).c(sVar).firstElement();
        Intrinsics.checkNotNullExpressionValue(kVarFirstElement2, "firstElement(...)");
        rfm.w wVarH = o70.a.h(kVarFirstElement2);
        an4.f fVar = new an4.f(this, 4);
        Function0 function0J2 = J();
        m mVar2 = new m(wVarH, new r(4, new a2i.j(new BreadcrumbException(), 16)), 2);
        Intrinsics.checkNotNullExpressionValue(mVar2, "onErrorResumeNext(...)");
        rfm.b bVar3 = new rfm.b(new a0d.g(2, fVar), new a0d.g(2, sVar2), new q(5, function0J2));
        mVar2.i(bVar3);
        Intrinsics.checkNotNullExpressionValue(bVar3, "subscribe(...)");
        w.j0(bVar2, bVar3);
        yma.g gVar3 = (yma.g) cVar2;
        efm.r rVarC = gVar3.e.getValue(gVar3, kPropertyArr[2]).c(sVar);
        efm.r rVarC2 = ((yma.g) cVar2).x0().c(sVar);
        yma.g gVar4 = (yma.g) cVar2;
        efm.r map = w.m(rVarC, rVarC2, gVar4.f314911g.getValue(gVar4, kPropertyArr[4]).c(sVar)).map(new ai0.j(new amf.i(13), 16));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarF = o70.a.f(map);
        a08.e eVar = new a08.e(1, this.f6613j, i.class, "setEnabled", "setEnabled(Z)V", 0, 15);
        Function0 function0J3 = J();
        efm.r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new r(4, new a2i.j(new BreadcrumbException(), 17)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new a0d.g(2, eVar), new a0d.g(2, sVar2), new q(5, function0J3));
        w.j0(bVar2, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        efm.b bVarFlatMapCompletable = ((EmailScreenFragment) view).g0.e.f121375b.map(new ai0.j(new amf.i(14), 17)).flatMapCompletable(new ai0.j(new a08.e(1, this.f6614l, p.class, "updateEmail", "updateEmail(Ljava/lang/String;)Lio/reactivex/Completable;", 0, 16), 18));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        r rVar = new r(4, new a2i.j(new BreadcrumbException(), 18));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar2 = new pfm.a(bVarFlatMapCompletable, rVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        h hVarW = aVar2.w(new a0d.g(2, sVar2), new q(5, f.f6612a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(bVar2, hVarW);
    }
}
