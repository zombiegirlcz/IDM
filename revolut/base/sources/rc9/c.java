package rc9;

import akl.s;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit_core.displayers.image.models.TextImage;
import com.revolut.feature.blue_prompt.fullscreen.BluePromptActivity;
import com.revolut.feature.onboarding.impl.revolut_card_ready.RevolutCardReadyContract$Configuration;
import efm.d0;
import efm.r;
import ja3.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import ms0.j0;
import o9h.d;
import ofm.h;
import qp5.x;
import rbj.g;
import sri.m;
import te0.w;
import tpi.j;
import ue0.e;
import ufm.i;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends bsi.a implements ms2.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f253236j;
    public final j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m f253237l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final tri.c f253238m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RevolutCardReadyContract$Configuration f253239n;
    public final li0.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextImage f253240p;

    public c(f cardBitmapDisplayer, j progressView, m navigator, tri.c backButtonView, RevolutCardReadyContract$Configuration configuration, li0.b tapAndPayClient) {
        Intrinsics.checkNotNullParameter(cardBitmapDisplayer, "cardBitmapDisplayer");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(backButtonView, "backButtonView");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(tapAndPayClient, "tapAndPayClient");
        this.f253236j = cardBitmapDisplayer;
        this.k = progressView;
        this.f253237l = navigator;
        this.f253238m = backButtonView;
        this.f253239n = configuration;
        this.o = tapAndPayClient;
        m70.a.c(t0.f186434a);
        this.f253240p = new TextImage("", 0, 0, 0, 0, 0, 206);
    }

    @Override // pri.a
    public final void N(rri.a aVar) {
        ms2.f view = (ms2.f) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        ihm.f fVar = this.f253238m.f273801b;
        BluePromptActivity bluePromptActivity = (BluePromptActivity) view;
        r map = bluePromptActivity.b1().q().map(new j0(new mqg.b(25), 17));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r map2 = bluePromptActivity.b1().f53054h.f121375b.map(new j0(new mqg.b(24), 16));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        r rVarMerge = r.merge(fVar, map, map2);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        pfm.a aVar2 = new pfm.a(w.D(rVarMerge, new a(this, 0)), new d(16, new x(new BreadcrumbException(), 13)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        b function = b.f253235a;
        Intrinsics.checkNotNullParameter(function, "function");
        a1l.c cVar = new a1l.c(16);
        s sVar = this.i;
        h hVarW = aVar2.w(new nw8.d(9, sVar), cVar);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        d0 d0VarFirstOrError = m70.a.g(this.f253236j.c(this.f253239n.f78570a.f150110a), null, new rbh.j(11), 1).firstOrError();
        rbf.c cVar2 = new rbf.c(new g(2), 15);
        d0VarFirstOrError.getClass();
        i iVar = new i(d0VarFirstOrError, cVar2, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        i iVar2 = new i(e.F(iVar, this.f253240p), new rbf.c(new a(this, 1), 16), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        d0 d0VarW = mo3.a.w(o70.a.i(iVar2), this.k);
        qi3.i iVar3 = new qi3.i(1, bluePromptActivity, ms2.f.class, "showPrompt", "showPrompt(Lcom/revolut/feature/blue_prompt/BluePromptModel;)V", 0, 29);
        i iVar4 = new i(d0VarW, new d(16, new x(new BreadcrumbException(), 12)), 2);
        Intrinsics.checkNotNullExpressionValue(iVar4, "onErrorResumeNext(...)");
        ofm.i iVar5 = new ofm.i(new nw8.d(9, iVar3), new nw8.d(9, sVar), 0);
        iVar4.q(iVar5);
        Intrinsics.checkNotNullExpressionValue(iVar5, "subscribe(...)");
        w.j0(bVar, iVar5);
    }
}
