package rga;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mga.h0;
import mga.j0;
import nii.o0;
import ozc.z;
import qfm.r0;
import skm.p0;
import te0.w;
import wli.x;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends pri.c implements h0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p56.a f254060h;
    public final ln.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wm.e f254061j;
    public final gte.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x f254062l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final sn.a f254063m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final xn.b f254064n;

    public p(p56.a naviCommandProvider, ln.a navigationCommandsDispatcher, wm.e expandableDialogActionDispatcher, gte.a featureToggleInteractor, x deeplinkHandler, sn.a viewableRecordItemCollector, xn.b adsTrackingInteractor) {
        Intrinsics.checkNotNullParameter(naviCommandProvider, "naviCommandProvider");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(expandableDialogActionDispatcher, "expandableDialogActionDispatcher");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(viewableRecordItemCollector, "viewableRecordItemCollector");
        Intrinsics.checkNotNullParameter(adsTrackingInteractor, "adsTrackingInteractor");
        this.f254060h = naviCommandProvider;
        this.i = navigationCommandsDispatcher;
        this.f254061j = expandableDialogActionDispatcher;
        this.k = featureToggleInteractor;
        this.f254062l = deeplinkHandler;
        this.f254063m = viewableRecordItemCollector;
        this.f254064n = adsTrackingInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final pfm.a N(qv0.p r9) {
        /*
            r8 = this;
            wm.e r0 = r8.f254061j
            wm.b$c r1 = wm.b.c.f298571a
            efm.b r0 = r0.c0(r1)
            java.lang.Object r9 = r9.getF55191g()
            java.lang.String r1 = "complete(...)"
            pfm.m r2 = pfm.m.f235744a
            if (r9 != 0) goto L16
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            goto L78
        L16:
            boolean r3 = r9 instanceof tga.e
            ln.a r4 = r8.i
            p56.a r5 = r8.f254060h
            if (r3 == 0) goto L6a
            r3 = r9
            tga.e r3 = (tga.e) r3
            mga.d0 r6 = r3.f271114a
            gte.a r7 = r8.k
            boolean r6 = aha.a.b(r7, r6)
            if (r6 == 0) goto L6a
            wga.i r9 = r3.f271115b
            wga.d r9 = r9.f297275a
            wga.c r9 = r9.f297271c
            boolean r6 = r9 instanceof wga.a
            if (r6 == 0) goto L51
            wga.a r9 = (wga.a) r9
            kotlinx.coroutines.d r1 = skm.p0.f264003c
            r83.g r2 = new r83.g
            r3 = 0
            r4 = 18
            r2.<init>(r8, r9, r3, r4)
            ufm.b r9 = te0.w.o0(r1, r2)
            pfm.h r2 = new pfm.h
            r1 = 4
            r2.<init>(r9, r1)
            java.lang.String r9 = "ignoreElement(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r9)
            goto L78
        L51:
            boolean r9 = r9 instanceof wga.b
            if (r9 == 0) goto L64
            com.revolut.retail.core.navigation.FeatureCommand r9 = r5.g(r3)
            if (r9 != 0) goto L5f
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            goto L78
        L5f:
            pfm.h r2 = r4.a(r9)
            goto L78
        L64:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L6a:
            com.revolut.retail.core.navigation.FeatureCommand r9 = r5.g(r9)
            if (r9 != 0) goto L74
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            goto L78
        L74:
            pfm.h r2 = r4.a(r9)
        L78:
            pfm.a r9 = r0.e(r2)
            java.lang.String r0 = "andThen(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: rga.p.N(qv0.p):pfm.a");
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        j0 view = (j0) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        efm.r rVarFilter = view.T().filter(new rea.j(new rg3.d(4), 9));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        final int i = 1;
        r0 r0VarD = w.D(rVarFilter, new Function1(this) { // from class: rga.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f254057b;

            {
                this.f254057b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        zn.f snapshot = (zn.f) obj2;
                        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
                        p pVar = this.f254057b;
                        pVar.f254064n.f(ifk.b.P(snapshot, pVar.k));
                        return Unit.f186387a;
                    case 1:
                        RowDelegate.Model model = (RowDelegate.Model) obj2;
                        Intrinsics.h(model);
                        return this.f254057b.N(model);
                    default:
                        HighlightTileDelegate.Model model2 = (HighlightTileDelegate.Model) obj2;
                        Intrinsics.h(model2);
                        return this.f254057b.N(model2);
                }
            }
        });
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new o0(13, new qp5.x(new BreadcrumbException(), 14)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new lhi.b(26, function1K), new z(24, n.f254058a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        efm.r rVarFilter2 = view.o0().filter(new rea.j(new rg3.d(5), 10));
        Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
        final int i2 = 2;
        r0 r0VarD2 = w.D(rVarFilter2, new Function1(this) { // from class: rga.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f254057b;

            {
                this.f254057b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        zn.f snapshot = (zn.f) obj2;
                        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
                        p pVar = this.f254057b;
                        pVar.f254064n.f(ifk.b.P(snapshot, pVar.k));
                        return Unit.f186387a;
                    case 1:
                        RowDelegate.Model model = (RowDelegate.Model) obj2;
                        Intrinsics.h(model);
                        return this.f254057b.N(model);
                    default:
                        HighlightTileDelegate.Model model2 = (HighlightTileDelegate.Model) obj2;
                        Intrinsics.h(model2);
                        return this.f254057b.N(model2);
                }
            }
        });
        Function1 function1K2 = K();
        pfm.a aVar3 = new pfm.a(r0VarD2, new o0(13, new qp5.x(new BreadcrumbException(), 15)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new lhi.b(26, function1K2), new z(24, o.f254059a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        if (aha.a.a(this.k)) {
            efm.r rVarC = rd0.e.c(this.f254063m.b(view.g0(), true), p0.f264003c);
            final int i3 = 0;
            Function1 function1 = new Function1(this) { // from class: rga.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p f254057b;

                {
                    this.f254057b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i3) {
                        case 0:
                            zn.f snapshot = (zn.f) obj2;
                            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
                            p pVar = this.f254057b;
                            pVar.f254064n.f(ifk.b.P(snapshot, pVar.k));
                            return Unit.f186387a;
                        case 1:
                            RowDelegate.Model model = (RowDelegate.Model) obj2;
                            Intrinsics.h(model);
                            return this.f254057b.N(model);
                        default:
                            HighlightTileDelegate.Model model2 = (HighlightTileDelegate.Model) obj2;
                            Intrinsics.h(model2);
                            return this.f254057b.N(model2);
                    }
                }
            };
            Function1 function1K3 = K();
            Function0 function0J = J();
            efm.r rVarOnErrorResumeNext = rVarC.onErrorResumeNext(new o0(13, new qp5.x(new BreadcrumbException(), 16)));
            Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
            ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new lhi.b(26, function1), new lhi.b(26, function1K3), new z(24, function0J));
            w.j0(bVar, cVarSubscribe);
            Intrinsics.h(cVarSubscribe);
        }
    }

    @Override // pri.b, pri.e
    public final void l() {
        super.l();
        this.f254064n.a();
    }
}
