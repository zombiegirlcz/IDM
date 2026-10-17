package jpc;

import ael.t;
import ael.y;
import akg.n;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import au0.a2;
import b8d.l0;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.material.textfield.TextInputLayout;
import com.onfido.android.sdk.capture.flow.CaptureStepDataBundle;
import com.onfido.android.sdk.capture.ui.CaptureType;
import com.onfido.api.client.data.DocSide;
import com.revolut.camerakit.core.settings.VideoImuDataCollectionSettings;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.stock_details_overview.StockDetailsOverviewController;
import com.revolut.uicomponent.widgets.support_edit_text.MultipleDrawableMaterialEditText;
import com.revolut.uicomponent.widgets.support_edit_text.RevolutTextInputLayout;
import efm.r;
import f8.f;
import igm.o;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import jid.z;
import kl.b0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlinx.coroutines.flow.Flow;
import kwg.l;
import l8.w;
import l8.x;
import m30.h;
import ml.v;
import n8a.f0;
import nl.q0;
import nl.u;
import sl.q;
import v30.c0;
import v30.j;
import v30.s0;
import vc.s;
import vdl.p0;
import w30.m;
import w4l.i;
import w4l.k;
import xx9.p;
import yhm.m;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements xki.d, w, o, efm.d, jbj.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f177256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f177257c;
    public Object d;

    public /* synthetic */ e(Object obj2, int i, Object obj3, Object obj4) {
        this.f177255a = i;
        this.f177256b = obj2;
        this.f177257c = obj3;
        this.d = obj4;
    }

    public static m k0(j jVar, c0 c0Var) {
        boolean z;
        if (jVar == null) {
            return null;
        }
        switch (h.f202269a[jVar.f.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                z = true;
                break;
            case 5:
            case 6:
            case 7:
                z = false;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        s0 s0Var = jVar.e;
        boolean z3 = s0Var != s0.CANCELED;
        if (z && z3) {
            return new m(jVar.f285785a, s0Var, jVar.f285792m, jVar.f285793n, jVar.o, jVar.f285794p, jVar.f285795q, jVar.i, jVar.f285788g, jVar.f, jVar.f285789h, jVar.f285799w, jVar.f285797s, jVar.f285800x, jVar.f285786b, c0Var);
        }
        return null;
    }

    @Override // l8.w
    public Bitmap B(BitmapFactory.Options options) {
        x xVar = (x) ((zjh.c) this.f177256b).f322830b;
        xVar.reset();
        return BitmapFactory.decodeStream(xVar, null, options);
    }

    @Override // l8.w
    public ImageHeaderParser$ImageType E() {
        List list = (List) this.d;
        x xVar = (x) ((zjh.c) this.f177256b).f322830b;
        xVar.reset();
        return hb9.b.q(list, xVar, (f) this.f177257c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object J(java.lang.String r5, java.lang.String r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof k6i.b
            if (r0 == 0) goto L13
            r0 = r7
            k6i.b r0 = (k6i.b) r0
            int r1 = r0.f181722w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f181722w = r1
            goto L18
        L13:
            k6i.b r0 = new k6i.b
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f181722w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L59
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            java.lang.Object r7 = r4.f177257c
            wsg.n r7 = (wsg.n) r7
            r2 = 0
            efm.r r5 = r7.c0(r5, r6, r2)
            k1f.n r6 = new k1f.n
            r7 = 18
            r6.<init>(r7)
            r7 = 0
            efm.r r5 = m70.a.g(r5, r7, r6, r3)
            efm.d0 r5 = r5.firstOrError()
            java.lang.String r6 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            r0.f181722w = r3
            java.lang.Object r7 = nim.a.b(r5, r0)
            if (r7 != r1) goto L59
            return r1
        L59:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            psg.a r7 = (psg.a) r7
            boolean r5 = ta6.a.A(r7)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: jpc.e.J(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // jbj.c
    public Flow M(wk5.a blockchain, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
        sfm.b bVar = new sfm.b(eda.f.a((rea.m) this.d, currency, null, null, 6), new rbf.c(new r4k.x(this, blockchain, 20), 3), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        return rd0.e.b(bVar);
    }

    public vkm.d O(String portfolioId, xi0.b currency) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        r rVarW = nim.a.w(t.d((t) this.f177257c, portfolioId, true, n9l.b.SEC_3, currency, false, null, 32), new h0() { // from class: jpc.d
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return mif.a.Q(((del.b) obj2).f113708a);
            }
        });
        y yVar = (y) ((ybl.d) this.f177256b);
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        i loadingStrategy = i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        p0 p0Var = yVar.f3682a;
        p0Var.getClass();
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rd0.e.b(nim.a.w(kli.a.h(rVarW, pd.b.r(rd0.e.c(rd0.e.b(p0Var.k.e(portfolioId, loadingStrategy)), g.f186406a), new jp3.b(this, currency, 2))), new jn2.a(25)));
    }

    public vkm.d S(WidgetisedAnalyticsType analyticsType, vyg.c timeframe, iwg.c method, String str) {
        l lVar = (l) this.f177256b;
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        Intrinsics.checkNotNullParameter(timeframe, "timeframe");
        Intrinsics.checkNotNullParameter(method, "calculationMethod");
        tyg.j jVar = (tyg.j) this.d;
        if (!jVar.g(analyticsType)) {
            eel.c timeSpan = timeframe.b();
            Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
            Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
            Intrinsics.checkNotNullParameter(method, "method");
            return rd0.e.b(lVar.e(analyticsType, new kwg.f(lVar, analyticsType, timeSpan, method, str, 0)));
        }
        List analyticsProductTypes = jVar.b(analyticsType);
        eel.c timeSpan2 = timeframe.b();
        Intrinsics.checkNotNullParameter(analyticsProductTypes, "analyticsProductTypes");
        Intrinsics.checkNotNullParameter(timeSpan2, "timeSpan");
        Intrinsics.checkNotNullParameter(method, "method");
        return rd0.e.b(lVar.f(new kwg.c(lVar, analyticsProductTypes, timeSpan2, method, str, 0)));
    }

    public n V(k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        s8a.n nVar = (s8a.n) this.d;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        f0 f0Var = nVar.f260965a;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(f0Var.d.b(Unit.f186387a, loadingStrategy), new s6e.g(23));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
    
        if (r8 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object W(lm3.a r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof nm3.a
            if (r0 == 0) goto L13
            r0 = r8
            nm3.a r0 = (nm3.a) r0
            int r1 = r0.f217162y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f217162y = r1
            goto L18
        L13:
            nm3.a r0 = new nm3.a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f217160w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f217162y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L91
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            vm3.a r7 = r0.v
            lm3.a r2 = r0.u
            yhm.o.b(r8)
            goto L6b
        L3a:
            yhm.o.b(r8)
            java.lang.Object r8 = r6.f177256b
            kge.d r8 = (kge.d) r8
            vm3.a r8 = r8.h(r7)
            if (r8 != 0) goto L4a
            vm3.e r7 = vm3.e.f290527a
            return r7
        L4a:
            java.lang.Object r2 = r6.f177257c
            ogm.i r2 = (ogm.i) r2
            r0.u = r7
            r0.v = r8
            r0.f217162y = r4
            java.lang.Object r2 = r2.f225222b
            cl3.a r2 = (cl3.a) r2
            java.lang.String r4 = r8.f290522b
            wl3.h r2 = (wl3.h) r2
            rfm.w r2 = r2.c(r4)
            java.lang.Object r2 = nim.a.i(r2, r0)
            if (r2 != r1) goto L67
            goto L90
        L67:
            r5 = r2
            r2 = r7
            r7 = r8
            r8 = r5
        L6b:
            zm3.a r8 = (zm3.a) r8
            if (r8 == 0) goto L7f
            boolean r7 = r2.f196867g
            if (r7 == 0) goto L79
            vm3.d r7 = new vm3.d
            r7.<init>(r8)
            return r7
        L79:
            vm3.f r7 = new vm3.f
            r7.<init>(r8)
            return r7
        L7f:
            java.lang.Object r8 = r6.d
            kye.e r8 = (kye.e) r8
            r2 = 0
            r0.u = r2
            r0.v = r2
            r0.f217162y = r3
            java.io.Serializable r8 = r8.p(r7, r0)
            if (r8 != r1) goto L91
        L90:
            return r1
        L91:
            zm3.a r8 = (zm3.a) r8
            vm3.f r7 = new vm3.f
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: jpc.e.W(lm3.a, gim.c):java.lang.Object");
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public Object mo3808a(ViewController viewController) {
        throw null;
    }

    public kw.d a0(String cameraId, VideoImuDataCollectionSettings imuDataCollectionSettings) {
        Object objA;
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        Intrinsics.checkNotNullParameter(imuDataCollectionSettings, "imuDataCollectionSettings");
        String strP = j6.a.p("toString(...)");
        b0 b0Var = (b0) this.f177256b;
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        ax.a aVar = (ax.a) b0Var.f185144b;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        try {
            m.Companion aVar2 = yhm.m.INSTANCE;
            CameraManager cameraManager = (CameraManager) aVar.f10812a.getSystemService(CameraManager.class);
            if (cameraManager == null) {
                objA = null;
            } else {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(cameraId);
                Intrinsics.checkNotNullExpressionValue(cameraCharacteristics, "getCameraCharacteristics(...)");
                objA = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
            }
        } catch (Throwable th10) {
            m.Companion aVar3 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        Integer num = (Integer) (objA instanceof yhm.n ? null : objA);
        kw.d dVar = new kw.d(strP, (num != null && num.intValue() == 1) ? vw.l.CAMERA_SENSOR_REALTIME : vw.l.CAMERA_SENSOR_UNKNOWN_WITH_CALLBACK_ELAPSED_REALTIME, imuDataCollectionSettings.f50744b, (kw.a) this.d);
        dVar.f190183h = ((jw.e) this.f177257c).a(imuDataCollectionSettings.f50744b, new k65.d(1, dVar, kw.d.class, "onMotionSample", "onMotionSample(Lcom/revolut/camerakit/core/camerax/imu/VideoImuMotionSample;)V", 0, 27));
        return dVar;
    }

    @Override // igm.o
    public Object apply(Object obj2) {
        switch (this.f177255a) {
            case 11:
                v documentTypeSelectionResult = (v) obj2;
                Intrinsics.checkNotNullParameter(documentTypeSelectionResult, "documentTypeSelectionResult");
                u uVar = (u) this.f177256b;
                Observable observable = (Observable) this.f177257c;
                CaptureStepDataBundle captureStepDataBundle = new CaptureStepDataBundle(CaptureType.DOCUMENT, documentTypeSelectionResult.f206549a, documentTypeSelectionResult.f206550b, null, DocSide.FRONT, null, null, 104, null);
                sl.n nVar = (sl.n) this.d;
                LinkedHashMap linkedHashMap = nVar.d;
                uVar.getClass();
                boolean z = true;
                if ((linkedHashMap.size() != 1 || ((List) d0.a0(linkedHashMap.values())).size() != 1) && u.a(nVar) == null) {
                    z = false;
                }
                Observable observableFlatMap = uVar.f216952b.a(observable, captureStepDataBundle, z).flatMap(new kdh.b(uVar, nVar, 12));
                Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
                return observableFlatMap;
            default:
                tl.i result = (tl.i) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                return q0.a((q0) this.f177256b, (q) this.f177257c, (Observable) this.d, new Pair(result.f271986a, result.f271987b));
        }
    }

    @Override // jbj.c
    public Flow b(wk5.a blockchain, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
        return new r7b.e(rd0.e.b(((fbj.a) this.f177257c).b(blockchain, currency)), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b0(com.revolut.feature.junior_profile.api.models.JuniorBankingProfile r13, java.lang.String r14, gim.c r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof k6i.c
            if (r0 == 0) goto L13
            r0 = r15
            k6i.c r0 = (k6i.c) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            k6i.c r0 = new k6i.c
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.z
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.B
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.String r13 = r0.f181725y
            java.lang.String r14 = r0.f181724x
            java.lang.String r1 = r0.f181723w
            java.lang.String r2 = r0.v
            java.lang.String r0 = r0.u
            yhm.o.b(r15)
            r8 = r14
            r10 = r0
            r7 = r1
        L33:
            r9 = r13
            r6 = r2
            goto L61
        L36:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3e:
            yhm.o.b(r15)
            java.lang.String r2 = r13.f77103j
            java.lang.String r15 = r13.f77099b
            java.lang.String r4 = r13.f77100c
            java.lang.String r13 = r13.f77101g
            r0.u = r14
            r0.v = r2
            r0.f181723w = r15
            r0.f181724x = r4
            r0.f181725y = r13
            r0.B = r3
            java.lang.Object r0 = r12.J(r2, r14, r0)
            if (r0 != r1) goto L5c
            return r1
        L5c:
            r10 = r14
            r7 = r15
            r15 = r0
            r8 = r4
            goto L33
        L61:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r11 = r15.booleanValue()
            com.revolut.retail.feature.balance.picker.api.models.JuniorInfo r5 = new com.revolut.retail.feature.balance.picker.api.models.JuniorInfo
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: jpc.e.b0(com.revolut.feature.junior_profile.api.models.JuniorBankingProfile, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public xki.e mo3783build() {
        s.h((ViewController) this.f177256b, ViewController.class);
        s.h((IncomeSource) this.f177257c, IncomeSource.class);
        return new jyc.c((IncomeSource) this.f177257c, (List) this.d);
    }

    public o3d.e c(String combinedWatchlistOrderingKey, j60.a bottomExpandableDialog) {
        Intrinsics.checkNotNullParameter(combinedWatchlistOrderingKey, "combinedWatchlistOrderingKey");
        Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
        return new o3d.e((z) this.f177256b, (n3d.e) this.f177257c, bottomExpandableDialog, new TwinHorizontalButtonDelegate(), (ghd.a) this.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (r10 == r2) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
    
        if (r10 == r2) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(java.lang.String r9, gim.c r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f177256b
            hj8.a r0 = (hj8.a) r0
            boolean r1 = r10 instanceof k6i.a
            if (r1 == 0) goto L17
            r1 = r10
            k6i.a r1 = (k6i.a) r1
            int r2 = r1.f181721x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f181721x = r2
            goto L1c
        L17:
            k6i.a r1 = new k6i.a
            r1.<init>(r8, r10)
        L1c:
            java.lang.Object r10 = r1.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f181721x
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L44
            if (r3 == r6) goto L3e
            if (r3 == r5) goto L3a
            if (r3 != r4) goto L32
            yhm.o.b(r10)
            return r10
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            yhm.o.b(r10)
            goto L9c
        L3e:
            java.lang.String r9 = r1.u
            yhm.o.b(r10)
            goto L6d
        L44:
            yhm.o.b(r10)
            java.lang.Object r10 = r8.d
            cw9.d r10 = (cw9.d) r10
            boolean r10 = r10.a()
            if (r10 == 0) goto L80
            nj8.n r0 = (nj8.n) r0
            kotlinx.coroutines.flow.Flow r10 = r0.j()
            k1f.n r0 = new k1f.n
            r3 = 16
            r0.<init>(r3)
            jhi.b r10 = mo3.a.g(r10, r7, r0, r6)
            r1.u = r9
            r1.f181721x = r6
            java.lang.Object r10 = vkm.q.x(r10, r1)
            if (r10 != r2) goto L6d
            goto Lb5
        L6d:
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Object r9 = r10.get(r9)
            kotlin.Pair r9 = (kotlin.Pair) r9
            if (r9 == 0) goto L78
            goto La3
        L78:
            java.util.NoSuchElementException r9 = new java.util.NoSuchElementException
            java.lang.String r10 = "Could not find junior profile by juniorId"
            r9.<init>(r10)
            throw r9
        L80:
            w4l.j r10 = w4l.j.f294644c
            akg.n r9 = hj8.a.a(r0, r9, r10)
            k1f.n r10 = new k1f.n
            r0 = 17
            r10.<init>(r0)
            jhi.b r9 = mo3.a.g(r9, r7, r10, r6)
            r1.u = r7
            r1.f181721x = r5
            java.lang.Object r10 = vkm.q.x(r9, r1)
            if (r10 != r2) goto L9c
            goto Lb5
        L9c:
            com.revolut.feature.junior_profile.api.models.JuniorBankingProfile r10 = (com.revolut.feature.junior_profile.api.models.JuniorBankingProfile) r10
            kotlin.Pair r9 = new kotlin.Pair
            r9.<init>(r7, r10)
        La3:
            java.lang.Object r10 = r9.f186385a
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r9.f186386b
            com.revolut.feature.junior_profile.api.models.JuniorBankingProfile r9 = (com.revolut.feature.junior_profile.api.models.JuniorBankingProfile) r9
            r1.u = r7
            r1.f181721x = r4
            java.lang.Object r9 = r8.b0(r9, r10, r1)
            if (r9 != r2) goto Lb6
        Lb5:
            return r2
        Lb6:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: jpc.e.d(java.lang.String, gim.c):java.lang.Object");
    }

    @Override // l8.w
    public void i() {
        x xVar = (x) ((zjh.c) this.f177256b).f322830b;
        synchronized (xVar) {
            xVar.f192759c = xVar.f192757a.length;
        }
    }

    public void j0(String str) {
        ((TextInputLayout) this.f177257c).setHint((str == null || str.length() == 0) ? "" : (CharSequence) this.d);
    }

    @Override // jbj.c
    public Flow k(xi0.b fallbackCurrency) {
        Intrinsics.checkNotNullParameter(fallbackCurrency, "fallbackCurrency");
        return rd0.e.b(nim.a.w(((bk5.a) this.f177256b).a(fallbackCurrency), new ou5.a(15, fallbackCurrency)));
    }

    @Override // efm.d
    public void onComplete() {
        if (((AtomicBoolean) this.f177257c).compareAndSet(false, true)) {
            ((ifm.b) this.f177256b).dispose();
            ((efm.d) this.d).onComplete();
        }
    }

    @Override // efm.d
    public void onError(Throwable th10) {
        if (!((AtomicBoolean) this.f177257c).compareAndSet(false, true)) {
            mo3.a.m(th10);
        } else {
            ((ifm.b) this.f177256b).dispose();
            ((efm.d) this.d).onError(th10);
        }
    }

    @Override // efm.d
    public void onSubscribe(ifm.c cVar) {
        ((ifm.b) this.f177256b).a(cVar);
    }

    @Override // l8.w
    public int q() {
        List list = (List) this.d;
        x xVar = (x) ((zjh.c) this.f177256b).f322830b;
        xVar.reset();
        return hb9.b.n(list, xVar, (f) this.f177257c);
    }

    public e(MultipleDrawableMaterialEditText editText, RevolutTextInputLayout textInputLayout) {
        this.f177255a = 19;
        Intrinsics.checkNotNullParameter(editText, "editText");
        Intrinsics.checkNotNullParameter(textInputLayout, "textInputLayout");
        this.f177256b = editText;
        this.f177257c = textInputLayout;
        j0(editText.getText().toString());
        editText.addTextChangedListener(new a2(this, 8));
    }

    public e(b0 timestampSourceProvider, jw.e motionService, kw.a artifactAssembler) {
        this.f177255a = 3;
        Intrinsics.checkNotNullParameter(timestampSourceProvider, "timestampSourceProvider");
        Intrinsics.checkNotNullParameter(motionService, "motionService");
        Intrinsics.checkNotNullParameter(artifactAssembler, "artifactAssembler");
        this.f177256b = timestampSourceProvider;
        this.f177257c = motionService;
        this.d = artifactAssembler;
    }

    public e(kge.d descriptorProvideInteractor, ogm.i descriptorSearchInteractor, kye.e descriptorPersistInteractor) {
        this.f177255a = 13;
        Intrinsics.checkNotNullParameter(descriptorProvideInteractor, "descriptorProvideInteractor");
        Intrinsics.checkNotNullParameter(descriptorSearchInteractor, "descriptorSearchInteractor");
        Intrinsics.checkNotNullParameter(descriptorPersistInteractor, "descriptorPersistInteractor");
        this.f177256b = descriptorProvideInteractor;
        this.f177257c = descriptorSearchInteractor;
        this.d = descriptorPersistInteractor;
    }

    public e(udf.a createTradingOrderCommandProvider, d1e.a stockLendingNaviCommandProvider, n3h.e automationsWidgetMapper, b4h.c automationsWidgetInteractor, z5j.d commodityAssetDetailsOrderFlowCommandProvider) {
        this.f177255a = 10;
        Intrinsics.checkNotNullParameter(createTradingOrderCommandProvider, "createTradingOrderCommandProvider");
        Intrinsics.checkNotNullParameter(stockLendingNaviCommandProvider, "stockLendingNaviCommandProvider");
        Intrinsics.checkNotNullParameter(automationsWidgetMapper, "automationsWidgetMapper");
        Intrinsics.checkNotNullParameter(automationsWidgetInteractor, "automationsWidgetInteractor");
        Intrinsics.checkNotNullParameter(commodityAssetDetailsOrderFlowCommandProvider, "commodityAssetDetailsOrderFlowCommandProvider");
        this.f177256b = createTradingOrderCommandProvider;
        this.f177257c = stockLendingNaviCommandProvider;
        this.d = commodityAssetDetailsOrderFlowCommandProvider;
    }

    public e(z presentationModel, n3d.e shotDialogMapper, ghd.a sharedSeparateFavouritesDialogsFactory) {
        this.f177255a = 14;
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(shotDialogMapper, "shotDialogMapper");
        Intrinsics.checkNotNullParameter(sharedSeparateFavouritesDialogsFactory, "sharedSeparateFavouritesDialogsFactory");
        this.f177256b = presentationModel;
        this.f177257c = shotDialogMapper;
        this.d = sharedSeparateFavouritesDialogsFactory;
    }

    public e(k18.c faqProvider, wli.x deeplinkHandler, l0 deeplinkModifier) {
        this.f177255a = 25;
        Intrinsics.checkNotNullParameter(faqProvider, "faqProvider");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(deeplinkModifier, "deeplinkModifier");
        this.f177256b = faqProvider;
        this.f177257c = deeplinkHandler;
        this.d = deeplinkModifier;
    }

    public e(v1d.c mapper, q3d.g presentationModel, v1d.j widgetCatalogueDataProvider) {
        this.f177255a = 18;
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(widgetCatalogueDataProvider, "widgetCatalogueDataProvider");
        this.f177256b = mapper;
        this.f177257c = presentationModel;
        this.d = widgetCatalogueDataProvider;
    }

    public e(kbb.c actionsPanelNavigationExtensionFactory, z5j.d commodityNavigationCommandProvider, kdh.b instrumentActionsInteractor) {
        this.f177255a = 8;
        Intrinsics.checkNotNullParameter(actionsPanelNavigationExtensionFactory, "actionsPanelNavigationExtensionFactory");
        Intrinsics.checkNotNullParameter(commodityNavigationCommandProvider, "commodityNavigationCommandProvider");
        Intrinsics.checkNotNullParameter(instrumentActionsInteractor, "instrumentActionsInteractor");
        this.f177256b = actionsPanelNavigationExtensionFactory;
        this.f177257c = commodityNavigationCommandProvider;
        this.d = instrumentActionsInteractor;
    }

    public e(hj8.a juniorProfileInteractor, wsg.n walletInteractor, cw9.d paymentsProductFeatureChecker) {
        this.f177255a = 2;
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        this.f177256b = juniorProfileInteractor;
        this.f177257c = walletInteractor;
        this.d = paymentsProductFeatureChecker;
    }

    public e(l complexAnalyticsInteractor, sxg.k complexAnalyticsPerformanceContributionProvider, tyg.j widgetisedProductConfigInteractor) {
        this.f177255a = 28;
        Intrinsics.checkNotNullParameter(complexAnalyticsInteractor, "complexAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(complexAnalyticsPerformanceContributionProvider, "complexAnalyticsPerformanceContributionProvider");
        Intrinsics.checkNotNullParameter(widgetisedProductConfigInteractor, "widgetisedProductConfigInteractor");
        this.f177256b = complexAnalyticsInteractor;
        this.f177257c = complexAnalyticsPerformanceContributionProvider;
        this.d = widgetisedProductConfigInteractor;
    }

    public e(om4.d0 transfersPersonalisationInteractor, klf.h0 commonDataSource, r2a.a personalisationUiInfoMapper) {
        this.f177255a = 26;
        Intrinsics.checkNotNullParameter(transfersPersonalisationInteractor, "transfersPersonalisationInteractor");
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(personalisationUiInfoMapper, "personalisationUiInfoMapper");
        this.f177256b = transfersPersonalisationInteractor;
        this.f177257c = commonDataSource;
        this.d = personalisationUiInfoMapper;
    }

    public e(bk5.a blockchainInteractor, fbj.a depositsInteractor, rea.m pocketDetailsInteractor) {
        this.f177255a = 20;
        Intrinsics.checkNotNullParameter(blockchainInteractor, "blockchainInteractor");
        Intrinsics.checkNotNullParameter(depositsInteractor, "depositsInteractor");
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        this.f177256b = blockchainInteractor;
        this.f177257c = depositsInteractor;
        this.d = pocketDetailsInteractor;
    }

    public e(l80.e dateProvider, a61.a commodityPriceTargetsInteractor, rdj.a priceTargetsDialogFactory) {
        this.f177255a = 24;
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(commodityPriceTargetsInteractor, "commodityPriceTargetsInteractor");
        Intrinsics.checkNotNullParameter(priceTargetsDialogFactory, "priceTargetsDialogFactory");
        this.f177256b = dateProvider;
        this.f177257c = commodityPriceTargetsInteractor;
        this.d = priceTargetsDialogFactory;
    }

    public e(d3a.b paymentsSearchInteractor, p recentRecipientInteractor, s8a.n trustedBeneficiariesInteractor) {
        this.f177255a = 23;
        Intrinsics.checkNotNullParameter(paymentsSearchInteractor, "paymentsSearchInteractor");
        Intrinsics.checkNotNullParameter(recentRecipientInteractor, "recentRecipientInteractor");
        Intrinsics.checkNotNullParameter(trustedBeneficiariesInteractor, "trustedBeneficiariesInteractor");
        this.f177256b = paymentsSearchInteractor;
        this.f177257c = recentRecipientInteractor;
        this.d = trustedBeneficiariesInteractor;
    }

    public e(p5k.x breakdownMapper, p5k.a creditCardTransferInterestMapper, fsf.b transferReasonsCommonUiMapper) {
        this.f177255a = 5;
        Intrinsics.checkNotNullParameter(breakdownMapper, "breakdownMapper");
        Intrinsics.checkNotNullParameter(creditCardTransferInterestMapper, "creditCardTransferInterestMapper");
        Intrinsics.checkNotNullParameter(transferReasonsCommonUiMapper, "transferReasonsCommonUiMapper");
        this.f177256b = breakdownMapper;
        this.f177257c = creditCardTransferInterestMapper;
        this.d = transferReasonsCommonUiMapper;
    }

    public e(tsk.t topMoversInteractor, e9h.d performanceAssetsTransformer, adh.a performanceCalculator) {
        this.f177255a = 16;
        Intrinsics.checkNotNullParameter(topMoversInteractor, "topMoversInteractor");
        Intrinsics.checkNotNullParameter(performanceAssetsTransformer, "performanceAssetsTransformer");
        Intrinsics.checkNotNullParameter(performanceCalculator, "performanceCalculator");
        this.f177256b = topMoversInteractor;
        this.f177257c = performanceAssetsTransformer;
    }

    public e(ybl.d portfolioInteractor, t portfolioBalanceInteractor, r10.v blockedForWithdrawalInteractor) {
        this.f177255a = 0;
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(portfolioBalanceInteractor, "portfolioBalanceInteractor");
        Intrinsics.checkNotNullParameter(blockedForWithdrawalInteractor, "blockedForWithdrawalInteractor");
        this.f177256b = portfolioInteractor;
        this.f177257c = portfolioBalanceInteractor;
        this.d = blockedForWithdrawalInteractor;
    }

    public e(v20.o chatRepository, u20.f callRequestRepository, j30.c callsFeatureToggles) {
        this.f177255a = 7;
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(callRequestRepository, "callRequestRepository");
        Intrinsics.checkNotNullParameter(callsFeatureToggles, "callsFeatureToggles");
        this.f177256b = chatRepository;
        this.f177257c = callRequestRepository;
        this.d = callsFeatureToggles;
    }

    public e(xoj.a featuresInteractor, ybl.d portfolioInteractor, ybl.k tradingAccountsInteractor) {
        this.f177255a = 27;
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        this.f177257c = featuresInteractor;
        this.f177256b = portfolioInteractor;
        this.d = tradingAccountsInteractor;
    }

    public e(com.google.protobuf.a aVar, ArrayList arrayList, f fVar) {
        this.f177255a = 4;
        y8.f.c(fVar, "Argument must not be null");
        this.f177257c = fVar;
        y8.f.c(arrayList, "Argument must not be null");
        this.d = arrayList;
        this.f177256b = new zjh.c(aVar, fVar);
    }

    public e(u41.b bVar, u41.a aVar, String str, uce.c cVar) {
        this.f177255a = 29;
        this.f177256b = str;
        this.f177257c = cVar;
        this.d = e4m.b.b(new d2h.b(bVar, 25, aVar, this));
    }

    public e(StockDetailsOverviewController stockDetailsOverviewController) {
        this.f177255a = 9;
        this.f177256b = stockDetailsOverviewController.S;
        this.f177257c = stockDetailsOverviewController.f104053n0;
        this.d = stockDetailsOverviewController.f104054o0;
    }

    public e(jyc.h hVar) {
        this.f177255a = 1;
    }

    public e(ryc.b bVar, ryc.c cVar) {
        this.f177255a = 22;
        this.f177256b = cVar;
        int i = 28;
        this.f177257c = e4m.b.b(new r7d.o(bVar, this, 1, i));
        this.d = e4m.b.b(new r7d.o(bVar, this, 0, i));
    }
}
