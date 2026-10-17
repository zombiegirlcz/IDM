package kbb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.onfido.android.sdk.capture.flow.CaptureStepDataBundle;
import com.onfido.android.sdk.capture.ui.CaptureType;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.backend_driven_limits.api.BackendDrivenLimitsApi$Toggles;
import com.revolut.feature.junior_core.api.R$string;
import com.revolut.feature.transfer.core.impl.quotes.data.network.TransferQuoteService;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.feature.workflow.sso.impl.ui.flow.WorkflowSsoFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.stock_details_overview.StockDetailsOverviewController;
import ffk.t;
import io.reactivex.rxjava3.core.Observable;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import klf.h0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import l8.w;
import l8.x;
import m6i.k0;
import nl.c0;
import nl.q0;
import rlh.d0;
import twb.b0;
import vc.s;
import zhm.y0;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements w, e4i.a, kfm.b, s2h.f, igm.o, xki.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f182549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f182550c;
    public Object d;

    public /* synthetic */ c(Object obj2, int i, Object obj3, Object obj4) {
        this.f182548a = i;
        this.f182549b = obj2;
        this.f182550c = obj3;
        this.d = obj4;
    }

    public static vyg.g S(WidgetisedAnalyticsType widgetisedAnalyticsType) {
        if ((widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.AllInvestAccounts) || (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.AllInvestments) || (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.Brokerage) || (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.Cfd) || (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.JointBrokerage) || (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.Pea) || (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.Robo) || (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.Isa) || (widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.Jisa)) {
            return vyg.g.INVEST;
        }
        if (!(widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.Commodities) && !(widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.Crypto)) {
            throw new NoWhenBranchMatchedException();
        }
        hx7.e.n(new IllegalStateException("No key defined for " + widgetisedAnalyticsType));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof n7i.d0
            if (r0 == 0) goto L13
            r0 = r6
            n7i.d0 r0 = (n7i.d0) r0
            int r1 = r0.f213110x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f213110x = r1
            goto L18
        L13:
            n7i.d0 r0 = new n7i.d0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f213110x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.u
            yhm.o.b(r6)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            java.lang.Object r6 = r4.f182550c
            h6i.q0 r6 = (h6i.q0) r6
            r0.u = r5
            r0.f213110x = r3
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            com.revolut.feature.transfer.core.models.CountryProfile r6 = (com.revolut.feature.transfer.core.models.CountryProfile) r6
            if (r6 != 0) goto L4a
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L4a:
            java.lang.String r6 = r6.f92231a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r6)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kbb.c.A(java.lang.String, gim.c):java.lang.Object");
    }

    @Override // l8.w
    public Bitmap B(BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor(((com.bumptech.glide.load.data.j) this.d).b().getFileDescriptor(), null, options);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
    
        if (r9 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object C(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof rea.b
            if (r0 == 0) goto L13
            r0 = r9
            rea.b r0 = (rea.b) r0
            int r1 = r0.f253561y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f253561y = r1
            goto L18
        L13:
            rea.b r0 = new rea.b
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f253559w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f253561y
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L38
            if (r2 != r3) goto L30
            yhm.o.b(r9)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            goto L81
        L2b:
            r9 = move-exception
            goto L8e
        L2d:
            r9 = move-exception
            goto La4
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            int r2 = r0.v
            int r6 = r0.u
            yhm.o.b(r9)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            goto L5a
        L40:
            yhm.o.b(r9)
            java.lang.Object r9 = r8.f182549b     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            ang.f r9 = (ang.f) r9     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            efm.d0 r9 = r9.f(r4)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            r0.u = r4     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            r0.v = r4     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            r0.f253561y = r5     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            java.lang.Object r9 = nim.a.b(r9, r0)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            if (r9 != r1) goto L58
            goto L80
        L58:
            r2 = r4
            r6 = r2
        L5a:
            do3.n r9 = (do3.n) r9     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            kotlin.jvm.internal.Intrinsics.h(r9)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            wi0.a r7 = wi0.b.Companion     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            r7.getClass()     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            wi0.b r7 = wi0.b.f297770q3     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            boolean r9 = te0.w.S(r9, r7)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            if (r9 == 0) goto L89
            java.lang.Object r9 = r8.d     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            mt8.d r9 = (mt8.d) r9     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            ufm.b r9 = r9.getKyc()     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            r0.u = r6     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            r0.v = r2     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            r0.f253561y = r3     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            java.lang.Object r9 = nim.a.b(r9, r0)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            if (r9 != r1) goto L81
        L80:
            return r1
        L81:
            yt8.c r9 = (yt8.c) r9     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            yt8.i r9 = r9.f316662a     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            boolean r5 = ngm.n.p(r9)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
        L89:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            goto L99
        L8e:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r9, r0)
            r9 = r2
        L99:
            if (r9 == 0) goto L9f
            boolean r4 = r9.booleanValue()
        L9f:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r4)
            return r9
        La4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kbb.c.C(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object D(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof sjb.b
            if (r0 == 0) goto L13
            r0 = r5
            sjb.b r0 = (sjb.b) r0
            int r1 = r0.f263706w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f263706w = r1
            goto L18
        L13:
            sjb.b r0 = new sjb.b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f263706w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f263706w = r3
            java.io.Serializable r5 = r4.x(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            wi0.b r5 = (wi0.b) r5
            if (r5 == 0) goto L49
            java.lang.Object r0 = r4.d
            java.util.Set r0 = (java.util.Set) r0
            boolean r5 = r0.contains(r5)
            r5 = r5 ^ r3
            goto L4a
        L49:
            r5 = 0
        L4a:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kbb.c.D(gim.c):java.lang.Object");
    }

    @Override // l8.w
    public ImageHeaderParser$ImageType E() throws Throwable {
        x xVar;
        List list = (List) this.f182550c;
        com.bumptech.glide.load.data.j jVar = (com.bumptech.glide.load.data.j) this.d;
        f8.f fVar = (f8.f) this.f182549b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c8.f fVar2 = (c8.f) list.get(i);
            x xVar2 = null;
            try {
                xVar = new x(new FileInputStream(jVar.b().getFileDescriptor()), fVar);
            } catch (Throwable th10) {
                th = th10;
            }
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeA = fVar2.a(xVar);
                xVar.release();
                jVar.b();
                if (imageHeaderParser$ImageTypeA != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeA;
                }
            } catch (Throwable th11) {
                th = th11;
                xVar2 = xVar;
                if (xVar2 != null) {
                    xVar2.release();
                }
                jVar.b();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object F(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof sjb.c
            if (r0 == 0) goto L13
            r0 = r5
            sjb.c r0 = (sjb.c) r0
            int r1 = r0.f263707w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f263707w = r1
            goto L18
        L13:
            sjb.c r0 = new sjb.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f263707w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f263707w = r3
            java.io.Serializable r5 = r4.x(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            wi0.b r5 = (wi0.b) r5
            if (r5 == 0) goto L49
            java.lang.Object r0 = r4.f182550c
            java.util.Set r0 = (java.util.Set) r0
            boolean r5 = r0.contains(r5)
            r5 = r5 ^ r3
            goto L4a
        L49:
            r5 = 0
        L4a:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kbb.c.F(gim.c):java.lang.Object");
    }

    public efm.r G(w4l.k loadingStrategy, String walletId, xi0.b currency, io3.l pocketType, io3.i pocketOriginType, wi0.b bVar) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        Intrinsics.checkNotNullParameter(pocketOriginType, "pocketOriginType");
        return ((uea.f) this.f182550c).b(loadingStrategy, walletId, currency, pocketType, pocketOriginType, null, bVar);
    }

    public efm.r H() {
        efm.r rVarSwitchMap = rd0.e.c(new sa6.o(bla.b.b((jla.h) this.d, ne8.a.f214420c.a()), 5), kotlin.coroutines.g.f186406a).switchMap(new tcg.q(6, new te8.g(this, 3)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    public efm.r I() {
        efm.r rVarSwitchMap = rd0.e.c(new sa6.o(bla.b.b((jla.h) this.d, ne8.a.f214420c.a()), 6), kotlin.coroutines.g.f186406a).switchMap(new tcg.q(11, new te8.g(this, 2)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    public wkm.d J() {
        int i = kwg.a.f190330a[((gwg.a) this.d).ordinal()];
        if (i == 1) {
            return ((x8h.k) this.f182549b).b();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        efm.r map = xv5.c.b((xv5.c) this.f182550c).map(new ksb.a(new kvg.j(17), 16));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(map);
    }

    public efm.r K(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        efm.r rVarSwitchMap = rd0.e.c(new sa6.o(bla.b.b((jla.h) this.d, ne8.a.f214420c.a()), 8), kotlin.coroutines.g.f186406a).switchMap(new tcg.q(8, new t8e.c(this, loadingStrategy, 14)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    public efm.r L() {
        efm.r rVarSwitchMap = rd0.e.c(new sa6.o(bla.b.b((jla.h) this.d, ne8.a.f214420c.a()), 9), kotlin.coroutines.g.f186406a).switchMap(new tcg.q(9, new te8.g(this, 1)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    public akg.n M(zel.f screenerInstrumentGroup, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(screenerInstrumentGroup, "screenerInstrumentGroup");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(((yhl.f) ((ugl.c) this.f182549b)).b(sph.o.a(screenerInstrumentGroup), loadingStrategy), new tkm.d(this, screenerInstrumentGroup, 4));
    }

    public wkm.l N(String juniorId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return vkm.q.Q(new sa6.o(bla.b.b((jla.h) this.d, ne8.a.f214420c.a()), 10), new sdi.a(null, this, juniorId, 5));
    }

    public efm.r O(boolean z) {
        efm.r rVarSwitchMap = rd0.e.c(new sa6.o(bla.b.b((jla.h) this.d, ne8.a.f214420c.a()), 11), kotlin.coroutines.g.f186406a).switchMap(new tcg.q(10, new te8.h(this, z, 0)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    public bo8.w P() {
        Flow gVar;
        vkm.d dVarB = rd0.e.b(((ang.f) this.f182549b).k(false));
        vkm.d dVarB2 = rd0.e.b(((t) this.f182550c).q());
        nl2.c cVar = (nl2.c) ((hl2.a) this.d);
        if (((jte.d) cVar.f216988b).c(BackendDrivenLimitsApi$Toggles.FincrimeLimitationsApplied.f63191c)) {
            rl2.d dVar = cVar.f216987a;
            dVar.getClass();
            w4l.h loadingStrategy = w4l.h.f294642c;
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            gVar = new njj.n(dVar.e.b(Unit.f186387a, loadingStrategy), 4);
        } else {
            gVar = new go.g(Boolean.FALSE, 2);
        }
        return new bo8.w(yh5.b.e(dVarB, dVarB2, gVar), 2);
    }

    public Object Q(String str, String str2, b0 b0Var) {
        Object objX = vkm.q.x(vkm.q.H(new ack.o(this, str2, str, (Continuation) null), vkm.q.q(new tse.c(mo3.a.g(((ekg.g) this.d).c(), null, null, 3), this, 13))), b0Var);
        return objX == fim.a.COROUTINE_SUSPENDED ? objX : Unit.f186387a;
    }

    public ua7.f R() {
        return new ua7.f((wa7.m) this.f182549b, (za7.b) this.f182550c, (zja.a) this.d);
    }

    @Override // xki.b
    public Object a(ViewController viewController) {
        throw null;
    }

    @Override // kfm.b
    public void accept(Object obj2, Object obj3) {
        Map map = (Map) obj2;
        Object objApply = ((kfm.o) this.d).apply(obj3);
        Collection collection = (Collection) map.get(objApply);
        if (collection == null) {
            collection = (Collection) ((kfm.o) this.f182549b).apply(objApply);
            map.put(objApply, collection);
        }
        collection.add(((kfm.o) this.f182550c).apply(obj3));
    }

    @Override // igm.o
    public Object apply(Object obj2) {
        switch (this.f182548a) {
            case 9:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((c0) this.f182549b).f216895c.a((Observable) this.f182550c, new CaptureStepDataBundle(CaptureType.FACE, null, null, null, null, null, null, 126, null), !((sl.p) this.d).f264059c);
            default:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return ((q0) this.f182549b).f216941c.a((Observable) this.f182550c, new CaptureStepDataBundle(CaptureType.VIDEO, null, null, null, null, null, null, 126, null), !((sl.q) this.d).f264062c);
        }
    }

    @Override // s2h.f
    public ListSubheaderDelegate b() {
        return (ListSubheaderDelegate) this.f182550c;
    }

    @Override // xki.b
    public xki.c build() {
        s.h((ViewController) this.f182550c, ViewController.class);
        s.h((WorkflowSsoFlowContract$InputData) this.d, WorkflowSsoFlowContract$InputData.class);
        return new ovh.b((ovh.a) this.f182549b, (WorkflowSsoFlowContract$InputData) this.d);
    }

    @Override // e4i.a
    public l4i.a e() {
        return (l4i.a) this.d;
    }

    @Override // l8.w
    public void i() {
    }

    @Override // s2h.f
    public ListCellDelegate l() {
        return (ListCellDelegate) this.f182549b;
    }

    @Override // s2h.f
    public PlainTextDelegate o() {
        return (PlainTextDelegate) this.d;
    }

    @Override // l8.w
    public int q() throws Throwable {
        x xVar;
        List list = (List) this.f182550c;
        com.bumptech.glide.load.data.j jVar = (com.bumptech.glide.load.data.j) this.d;
        f8.f fVar = (f8.f) this.f182549b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c8.f fVar2 = (c8.f) list.get(i);
            x xVar2 = null;
            try {
                xVar = new x(new FileInputStream(jVar.b().getFileDescriptor()), fVar);
            } catch (Throwable th10) {
                th = th10;
            }
            try {
                int iD = fVar2.d(xVar, fVar);
                xVar.release();
                jVar.b();
                if (iD != -1) {
                    return iD;
                }
            } catch (Throwable th11) {
                th = th11;
                xVar2 = xVar;
                if (xVar2 != null) {
                    xVar2.release();
                }
                jVar.b();
                throw th;
            }
        }
        return -1;
    }

    public ldh.m s() {
        Map map = (Map) this.f182549b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(zhm.q0.b(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((hdh.g) entry.getValue()).a());
        }
        return new ldh.m(linkedHashMap, (ldh.i) this.f182550c, (ldh.f) this.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t(w4l.k r15, java.lang.String r16, xi0.b r17, io3.l r18, io3.i r19, gim.c r20) {
        /*
            r14 = this;
            r0 = r20
            boolean r1 = r0 instanceof rea.a
            if (r1 == 0) goto L15
            r1 = r0
            rea.a r1 = (rea.a) r1
            int r2 = r1.f253558w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f253558w = r2
            goto L1a
        L15:
            rea.a r1 = new rea.a
            r1.<init>(r14, r0)
        L1a:
            java.lang.Object r0 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f253558w
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L32
            if (r3 != r4) goto L2a
            yhm.o.b(r0)
            goto L74
        L2a:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L32:
            yhm.o.b(r0)
            java.lang.Object r0 = r14.f182550c
            r6 = r0
            uea.f r6 = (uea.f) r6
            r12 = 0
            r13 = 0
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            r11 = r19
            efm.r r15 = r6.b(r7, r8, r9, r10, r11, r12, r13)
            rd3.k r0 = new rd3.k
            r3 = 15
            r0.<init>(r3)
            efm.r r15 = m70.a.g(r15, r5, r0, r4)
            rd3.m r0 = new rd3.m
            r3 = 16
            r0.<init>(r3)
            rbf.c r3 = new rbf.c
            r6 = 21
            r3.<init>(r0, r6)
            efm.r r15 = r15.map(r3)
            java.lang.String r0 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r0)
            r1.f253558w = r4
            java.lang.Object r0 = nim.a.c(r15, r1)
            if (r0 != r2) goto L74
            return r2
        L74:
            java.lang.String r15 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r15)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r15 = r0.iterator()
        L7f:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L9d
            java.lang.Object r0 = r15.next()
            r1 = r0
            dda.f r1 = (dda.f) r1
            boolean r2 = r1 instanceof dda.d
            if (r2 == 0) goto L93
            dda.d r1 = (dda.d) r1
            goto L94
        L93:
            r1 = r5
        L94:
            if (r1 == 0) goto L99
            java.lang.String r1 = r1.f
            goto L9a
        L99:
            r1 = r5
        L9a:
            if (r1 == 0) goto L7f
            goto L9e
        L9d:
            r0 = r5
        L9e:
            boolean r15 = r0 instanceof dda.d
            if (r15 == 0) goto La5
            dda.d r0 = (dda.d) r0
            goto La6
        La5:
            r0 = r5
        La6:
            if (r0 == 0) goto Lab
            java.lang.String r15 = r0.f
            return r15
        Lab:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kbb.c.t(w4l.k, java.lang.String, xi0.b, io3.l, io3.i, gim.c):java.lang.Object");
    }

    public String u() {
        String link = ((ff8.i) ((ff8.e) this.f182549b)).d.b(new TextLocalisedClause(R$string.junior_app_link_reference, null, null, 14)).toString();
        Intrinsics.checkNotNullParameter(link, "link");
        return link;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object v(com.revolut.shared.feature.move_money.api.model.MoveMoneyRecurringPayment r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kbb.c.v(com.revolut.shared.feature.move_money.api.model.MoveMoneyRecurringPayment, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
    
        if (r10 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object w(com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r9, gim.c r10) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kbb.c.w(com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable x(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof sjb.a
            if (r0 == 0) goto L13
            r0 = r5
            sjb.a r0 = (sjb.a) r0
            int r1 = r0.f263705w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f263705w = r1
            goto L18
        L13:
            sjb.a r0 = new sjb.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f263705w
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
            java.lang.Object r5 = r4.f182549b
            ang.f r5 = (ang.f) r5
            zmg.d r5 = r5.d
            efm.k r5 = r5.c()
            r0.f263705w = r3
            java.lang.Object r5 = nim.a.i(r5, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            do3.n r5 = (do3.n) r5
            if (r5 == 0) goto L4e
            wi0.b r5 = do3.q.y(r5)
            return r5
        L4e:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kbb.c.x(gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc A[LOOP:0: B:31:0x00b6->B:33:0x00bc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object y(gim.c r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kbb.c.y(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object z(io3.d r6, gim.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof n7i.c0
            if (r0 == 0) goto L13
            r0 = r7
            n7i.c0 r0 = (n7i.c0) r0
            int r1 = r0.f213106w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f213106w = r1
            goto L18
        L13:
            n7i.c0 r0 = new n7i.c0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f213106w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L36 java.util.concurrent.CancellationException -> L38
            goto L5b
        L36:
            r6 = move-exception
            goto L60
        L38:
            r6 = move-exception
            goto L85
        L3a:
            yhm.o.b(r7)
            java.lang.Object r7 = r5.f182549b
            cw9.d r7 = (cw9.d) r7
            boolean r7 = r7.a()
            if (r7 == 0) goto L4a
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L4a:
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L36 java.util.concurrent.CancellationException -> L38
            java.lang.Object r7 = r5.d     // Catch: java.lang.Throwable -> L36 java.util.concurrent.CancellationException -> L38
            k7i.i r7 = (k7i.i) r7     // Catch: java.lang.Throwable -> L36 java.util.concurrent.CancellationException -> L38
            java.lang.String r6 = r6.f163145a     // Catch: java.lang.Throwable -> L36 java.util.concurrent.CancellationException -> L38
            r0.f213106w = r4     // Catch: java.lang.Throwable -> L36 java.util.concurrent.CancellationException -> L38
            java.lang.Object r7 = r7.j(r6, r0)     // Catch: java.lang.Throwable -> L36 java.util.concurrent.CancellationException -> L38
            if (r7 != r1) goto L5b
            goto L83
        L5b:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L36 java.util.concurrent.CancellationException -> L38
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L36 java.util.concurrent.CancellationException -> L38
            goto L66
        L60:
            yhm.m$a r7 = yhm.m.INSTANCE
            yhm.n r7 = yhm.o.a(r6)
        L66:
            java.lang.Throwable r6 = yhm.m.a(r7)
            if (r6 == 0) goto L6f
            hx7.e.n(r6)
        L6f:
            boolean r6 = r7 instanceof yhm.n
            if (r6 == 0) goto L74
            r7 = 0
        L74:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L7b
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L7b:
            r0.f213106w = r3
            java.lang.Object r6 = r5.A(r7, r0)
            if (r6 != r1) goto L84
        L83:
            return r1
        L84:
            return r6
        L85:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kbb.c.z(io3.d, gim.c):java.lang.Object");
    }

    public c(h6i.o accountProvider, k0 accountTypeMapper, hd.r secondAccountSelector, jul.o hiddenAccountFilter) {
        this.f182548a = 5;
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(accountTypeMapper, "accountTypeMapper");
        Intrinsics.checkNotNullParameter(secondAccountSelector, "secondAccountSelector");
        Intrinsics.checkNotNullParameter(hiddenAccountFilter, "hiddenAccountFilter");
        this.f182549b = accountProvider;
        this.f182550c = secondAccountSelector;
        this.d = hiddenAccountFilter;
    }

    public c(onh.b retailAndPcwCreditTermsProvider, p56.a retailAndOpenMarketCreditTermsProvider, sa9.b indiaTermsProvider) {
        this.f182548a = 21;
        Intrinsics.checkNotNullParameter(retailAndPcwCreditTermsProvider, "retailAndPcwCreditTermsProvider");
        Intrinsics.checkNotNullParameter(retailAndOpenMarketCreditTermsProvider, "retailAndOpenMarketCreditTermsProvider");
        Intrinsics.checkNotNullParameter(indiaTermsProvider, "indiaTermsProvider");
        this.f182549b = retailAndPcwCreditTermsProvider;
        this.f182550c = retailAndOpenMarketCreditTermsProvider;
        this.d = indiaTermsProvider;
    }

    public c(ang.f userInteractor) {
        this.f182548a = 22;
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f182549b = userInteractor;
        wi0.b.Companion.getClass();
        wi0.b bVar = wi0.b.A;
        wi0.b bVar2 = wi0.b.J2;
        wi0.b[] elements = {bVar, bVar2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f182550c = kotlin.collections.d.y0(elements);
        this.d = y0.b(bVar2);
    }

    public c(Map instrumentTradeActionEventInterceptorFactories, ldh.i tradeCommandBuilder, ldh.f onboardingCommandBuilder) {
        this.f182548a = 3;
        Intrinsics.checkNotNullParameter(instrumentTradeActionEventInterceptorFactories, "instrumentTradeActionEventInterceptorFactories");
        Intrinsics.checkNotNullParameter(tradeCommandBuilder, "tradeCommandBuilder");
        Intrinsics.checkNotNullParameter(onboardingCommandBuilder, "onboardingCommandBuilder");
        this.f182549b = instrumentTradeActionEventInterceptorFactories;
        this.f182550c = tradeCommandBuilder;
        this.d = onboardingCommandBuilder;
    }

    public c(jt0.b commonHeaderProvider, h0 commonDataSource, tlf.l paymentLinkHeaderDetailsProvider) {
        this.f182548a = 24;
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(paymentLinkHeaderDetailsProvider, "paymentLinkHeaderDetailsProvider");
        this.f182549b = commonHeaderProvider;
        this.f182550c = commonDataSource;
        this.d = paymentLinkHeaderDetailsProvider;
    }

    public c(wa7.m hiddenAccountsInteractor, za7.b hiddenAccountsDialogProvider, zja.a productArticleInteractor) {
        this.f182548a = 27;
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountsDialogProvider, "hiddenAccountsDialogProvider");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        this.f182549b = hiddenAccountsInteractor;
        this.f182550c = hiddenAccountsDialogProvider;
        this.d = productArticleInteractor;
    }

    public c(cpf.b transferResultDialogFactory, sw8.a jpMyNumberKycStatusFactory, sf0.h serverErrorParser) {
        this.f182548a = 29;
        Intrinsics.checkNotNullParameter(transferResultDialogFactory, "transferResultDialogFactory");
        Intrinsics.checkNotNullParameter(jpMyNumberKycStatusFactory, "jpMyNumberKycStatusFactory");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f182549b = transferResultDialogFactory;
        this.f182550c = jpMyNumberKycStatusFactory;
        this.d = serverErrorParser;
    }

    public c(x8h.k tradingCurrencyInteractor, xv5.c cryptoCommodityCurrencyInteractor, gwg.a preferredCurrency) {
        this.f182548a = 1;
        Intrinsics.checkNotNullParameter(tradingCurrencyInteractor, "tradingCurrencyInteractor");
        Intrinsics.checkNotNullParameter(cryptoCommodityCurrencyInteractor, "cryptoCommodityCurrencyInteractor");
        Intrinsics.checkNotNullParameter(preferredCurrency, "preferredCurrency");
        this.f182549b = tradingCurrencyInteractor;
        this.f182550c = cryptoCommodityCurrencyInteractor;
        this.d = preferredCurrency;
    }

    public c(TransferQuoteService service, spf.a transferQuoteMapper, cw9.d paymentsProductFeatureChecker) {
        this.f182548a = 19;
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(transferQuoteMapper, "transferQuoteMapper");
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        this.f182549b = service;
        this.f182550c = paymentsProductFeatureChecker;
        this.d = new jpf.a(new d0(this, 24), null, null, null, null, 62);
    }

    public c(cw9.d paymentsProductFeatureChecker, h6i.q0 moveMoneyCountryProfileInteractor, k7i.i transferWalletInteractor) {
        this.f182548a = 8;
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(moveMoneyCountryProfileInteractor, "moveMoneyCountryProfileInteractor");
        Intrinsics.checkNotNullParameter(transferWalletInteractor, "transferWalletInteractor");
        this.f182549b = paymentsProductFeatureChecker;
        this.f182550c = moveMoneyCountryProfileInteractor;
        this.d = transferWalletInteractor;
    }

    public c(jt0.b commonHeaderProvider, h0 commonDataSource, bnf.j transactionBadgeProvider) {
        this.f182548a = 13;
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(transactionBadgeProvider, "transactionBadgeProvider");
        this.f182549b = commonHeaderProvider;
        this.f182550c = commonDataSource;
        this.d = transactionBadgeProvider;
    }

    public c(jx0.a transferCountryProfilesInteractor, cw9.d paymentsProductFeatureChecker, wsg.b newWalletsInteractor) {
        this.f182548a = 17;
        Intrinsics.checkNotNullParameter(transferCountryProfilesInteractor, "transferCountryProfilesInteractor");
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(newWalletsInteractor, "newWalletsInteractor");
        this.f182549b = transferCountryProfilesInteractor;
        this.f182550c = paymentsProductFeatureChecker;
        this.d = newWalletsInteractor;
    }

    public c(ndf.f investSecuritiesOrderDetailsMapper, ssl.c toolbarStateMapper, jdf.g investmentPlanProjectionsMapper) {
        this.f182548a = 15;
        Intrinsics.checkNotNullParameter(investSecuritiesOrderDetailsMapper, "investSecuritiesOrderDetailsMapper");
        Intrinsics.checkNotNullParameter(toolbarStateMapper, "toolbarStateMapper");
        Intrinsics.checkNotNullParameter(investmentPlanProjectionsMapper, "investmentPlanProjectionsMapper");
        this.f182549b = investSecuritiesOrderDetailsMapper;
        this.f182550c = toolbarStateMapper;
        this.d = investmentPlanProjectionsMapper;
    }

    public c(ang.f userInteractor, t pricingPlanInteractor, hl2.a restrictionsInteractor) {
        this.f182548a = 0;
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(restrictionsInteractor, "restrictionsInteractor");
        this.f182549b = userInteractor;
        this.f182550c = pricingPlanInteractor;
        this.d = restrictionsInteractor;
    }

    public c(vvg.b repository, tyg.j widgetisedProductConfigInteractor, zq.a benchmarkInteractor) {
        this.f182548a = 26;
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(widgetisedProductConfigInteractor, "widgetisedProductConfigInteractor");
        Intrinsics.checkNotNullParameter(benchmarkInteractor, "benchmarkInteractor");
        this.f182549b = repository;
        this.f182550c = widgetisedProductConfigInteractor;
        this.d = benchmarkInteractor;
    }

    public c(gte.a featureToggleInteractor, wsg.n walletInteractor, hj8.a juniorProfileInteractor) {
        this.f182548a = 12;
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        this.f182549b = featureToggleInteractor;
        this.f182550c = walletInteractor;
        this.d = juniorProfileInteractor;
    }

    public c(ugl.c screenerInteractor, gte.a featureToggleInteractor, sph.o screenerInstrumentTypeMapper, toh.g screenerEditableMetricsProvider) {
        this.f182548a = 25;
        Intrinsics.checkNotNullParameter(screenerInteractor, "screenerInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(screenerInstrumentTypeMapper, "screenerInstrumentTypeMapper");
        Intrinsics.checkNotNullParameter(screenerEditableMetricsProvider, "screenerEditableMetricsProvider");
        this.f182549b = screenerInteractor;
        this.f182550c = featureToggleInteractor;
        this.d = screenerEditableMetricsProvider;
    }

    public c(o7.b orderQuoteInteractor, bul.s orderQuoteAmountProvider, l4i.a amountConverter) {
        this.f182548a = 4;
        Intrinsics.checkNotNullParameter(orderQuoteInteractor, "orderQuoteInteractor");
        Intrinsics.checkNotNullParameter(orderQuoteAmountProvider, "orderQuoteAmountProvider");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        this.f182549b = orderQuoteInteractor;
        this.f182550c = orderQuoteAmountProvider;
        this.d = amountConverter;
    }

    public c(uea.f pocketDetailsRepository, ang.f userInteractor, mt8.d kycInteractor) {
        this.f182548a = 18;
        Intrinsics.checkNotNullParameter(pocketDetailsRepository, "pocketDetailsRepository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        this.f182550c = pocketDetailsRepository;
        this.f182549b = userInteractor;
        this.d = kycInteractor;
    }

    public c(Context context, lx0.j videoPreloader, ekg.g uiPersonalisationInteractor) {
        this.f182548a = 28;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoPreloader, "videoPreloader");
        Intrinsics.checkNotNullParameter(uiPersonalisationInteractor, "uiPersonalisationInteractor");
        this.f182549b = context;
        this.f182550c = videoPreloader;
        this.d = uiPersonalisationInteractor;
    }

    public c(ff8.e juniorConfigRepository, t pricingPlanInteractor, jla.h productCatalogueInteractor) {
        this.f182548a = 23;
        Intrinsics.checkNotNullParameter(juniorConfigRepository, "juniorConfigRepository");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f182549b = juniorConfigRepository;
        this.f182550c = pricingPlanInteractor;
        this.d = productCatalogueInteractor;
    }

    public c(ael.d0 stocksInteractor, ybl.l tradingConfigInteractor, r3h.a urlToFeatureConfigMapper) {
        this.f182548a = 16;
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(urlToFeatureConfigMapper, "urlToFeatureConfigMapper");
        this.f182549b = stocksInteractor;
        this.f182550c = tradingConfigInteractor;
        this.d = urlToFeatureConfigMapper;
    }

    public c(ovh.a aVar) {
        this.f182548a = 14;
        this.f182549b = aVar;
    }

    public c(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, f8.f fVar) {
        this.f182548a = 2;
        y8.f.c(fVar, "Argument must not be null");
        this.f182549b = fVar;
        y8.f.c(arrayList, "Argument must not be null");
        this.f182550c = arrayList;
        this.d = new com.bumptech.glide.load.data.j(parcelFileDescriptor);
    }

    public c(String primaryRateSuffix, String str, String str2) {
        this.f182548a = 11;
        Intrinsics.checkNotNullParameter(primaryRateSuffix, "primaryRateSuffix");
        this.f182549b = primaryRateSuffix;
        this.f182550c = str;
        this.d = str2;
    }

    public c(StockDetailsOverviewController stockDetailsOverviewController) {
        this.f182548a = 7;
        this.f182549b = stockDetailsOverviewController.l0;
        this.f182550c = stockDetailsOverviewController.S;
        this.d = stockDetailsOverviewController.m0;
    }

    public c(ryc.b bVar, ryc.c cVar) {
        this.f182548a = 20;
        this.f182549b = cVar;
        int i = 29;
        this.f182550c = e4m.b.b(new r7d.o(bVar, this, 1, i));
        this.d = e4m.b.b(new r7d.o(bVar, this, 0, i));
    }
}
