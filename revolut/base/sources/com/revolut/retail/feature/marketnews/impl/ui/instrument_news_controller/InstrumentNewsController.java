package com.revolut.retail.feature.marketnews.impl.ui.instrument_news_controller;

import aii.q;
import android.view.View;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.delegates.NewsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.marketnews.impl.R$layout;
import com.revolut.retail.feature.marketnews.impl.ui.instrument_news_controller.InstrumentNewsController;
import com.revolut.retail.feature.marketnews.impl.ui.instrument_news_controller.InstrumentNewsControllerContract$InputData;
import dli.a;
import dli.c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import prk.e0;
import te0.w;
import wuk.g;
import xki.e;
import yph.b;
import z0f.k;
import z0k.h;
import z0k.i;
import z0k.j;
import z0k.l;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/marketnews/impl/ui/instrument_news_controller/InstrumentNewsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lz0k/l;", "feature_market_news_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InstrumentNewsController extends ViewController<q> implements a {
    public final InstrumentNewsControllerContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final FullScreenStateDelegate O;
    public final NewsDelegate P;
    public final TextDelegate Q;
    public final Object R;
    public final g S;

    public InstrumentNewsController(InstrumentNewsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: z0k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstrumentNewsController f318623b;

            {
                this.f318623b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InstrumentNewsController instrumentNewsController = this.f318623b;
                switch (i2) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(instrumentNewsController.m2()).a().get(l0k.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l0k.c.class, " is not found"));
                        }
                        l0k.c cVar = ((l0k.c) aVar2.b()).o;
                        InstrumentNewsControllerContract$InputData instrumentNewsControllerContract$InputData = instrumentNewsController.K;
                        wuk.g gVar = instrumentNewsController.S;
                        qji.b bVarU2 = instrumentNewsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.marketnews.api.navigation.descriptor.InstrumentNewsDescriptor.InstrumentNewsParentComponent");
                        puk.d dVar = (puk.d) ((e0) ((quk.a) bVarU2)).f239097q.get();
                        instrumentNewsControllerContract$InputData.getClass();
                        gVar.getClass();
                        dVar.getClass();
                        return new l0k.a(cVar, instrumentNewsControllerContract$InputData, gVar, dVar);
                    case 1:
                        return (j) ((l0k.a) instrumentNewsController.L.getValue()).f191256g.get();
                    default:
                        InstrumentNewsController instrumentNewsController2 = this.f318623b;
                        return dli.f.a(instrumentNewsController2, instrumentNewsController2.d(), v.k(instrumentNewsController2.O, new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), instrumentNewsController2.P, new NewsLoadingDelegate(), instrumentNewsController2.Q), 0, null, new koi.h(null, false, true, 3), null, 44);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: z0k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstrumentNewsController f318623b;

            {
                this.f318623b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InstrumentNewsController instrumentNewsController = this.f318623b;
                switch (i22) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(instrumentNewsController.m2()).a().get(l0k.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l0k.c.class, " is not found"));
                        }
                        l0k.c cVar = ((l0k.c) aVar2.b()).o;
                        InstrumentNewsControllerContract$InputData instrumentNewsControllerContract$InputData = instrumentNewsController.K;
                        wuk.g gVar = instrumentNewsController.S;
                        qji.b bVarU2 = instrumentNewsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.marketnews.api.navigation.descriptor.InstrumentNewsDescriptor.InstrumentNewsParentComponent");
                        puk.d dVar = (puk.d) ((e0) ((quk.a) bVarU2)).f239097q.get();
                        instrumentNewsControllerContract$InputData.getClass();
                        gVar.getClass();
                        dVar.getClass();
                        return new l0k.a(cVar, instrumentNewsControllerContract$InputData, gVar, dVar);
                    case 1:
                        return (j) ((l0k.a) instrumentNewsController.L.getValue()).f191256g.get();
                    default:
                        InstrumentNewsController instrumentNewsController2 = this.f318623b;
                        return dli.f.a(instrumentNewsController2, instrumentNewsController2.d(), v.k(instrumentNewsController2.O, new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), instrumentNewsController2.P, new NewsLoadingDelegate(), instrumentNewsController2.Q), 0, null, new koi.h(null, false, true, 3), null, 44);
                }
            }
        });
        this.N = R$layout.screen_instrument_news;
        this.O = new FullScreenStateDelegate();
        this.P = new NewsDelegate();
        this.Q = new TextDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: z0k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstrumentNewsController f318623b;

            {
                this.f318623b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InstrumentNewsController instrumentNewsController = this.f318623b;
                switch (i22) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(instrumentNewsController.m2()).a().get(l0k.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l0k.c.class, " is not found"));
                        }
                        l0k.c cVar = ((l0k.c) aVar2.b()).o;
                        InstrumentNewsControllerContract$InputData instrumentNewsControllerContract$InputData = instrumentNewsController.K;
                        wuk.g gVar = instrumentNewsController.S;
                        qji.b bVarU2 = instrumentNewsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.marketnews.api.navigation.descriptor.InstrumentNewsDescriptor.InstrumentNewsParentComponent");
                        puk.d dVar = (puk.d) ((e0) ((quk.a) bVarU2)).f239097q.get();
                        instrumentNewsControllerContract$InputData.getClass();
                        gVar.getClass();
                        dVar.getClass();
                        return new l0k.a(cVar, instrumentNewsControllerContract$InputData, gVar, dVar);
                    case 1:
                        return (j) ((l0k.a) instrumentNewsController.L.getValue()).f191256g.get();
                    default:
                        InstrumentNewsController instrumentNewsController2 = this.f318623b;
                        return dli.f.a(instrumentNewsController2, instrumentNewsController2.d(), v.k(instrumentNewsController2.O, new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), instrumentNewsController2.P, new NewsLoadingDelegate(), instrumentNewsController2.Q), 0, null, new koi.h(null, false, true, 3), null, 44);
                }
            }
        });
        this.S = new g(this, 4);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((l) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l0k.a) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NewsDelegate newsDelegate = this.P;
        Continuation continuation = null;
        ViewController.P2(this, new b(rd0.e.b(newsDelegate.p()), 25), new i(this, continuation, 0), 3);
        int i = 1;
        ViewController.P2(this, new k(new b(rd0.e.b(newsDelegate.q()), 26), i), new i(this, continuation, i), 3);
        int i2 = 2;
        ViewController.P2(this, new k(new b(rd0.e.b(newsDelegate.r()), 27), i2), new i(this, continuation, i2), 3);
        ViewController.P2(this, new b(rd0.e.b(this.O.f52371h.f121375b), 24), new h(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final j d() {
        return (j) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
