package ove;

import afj.y3;
import android.app.Activity;
import android.content.Context;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.LifecycleOwner;
import b9.w2;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import com.google.common.collect.ImmutableSet;
import com.revolut.camerakit.client.api.models.CameraKitClientSettings;
import com.revolut.camerakit.client.api.models.CameraKitUiSettings;
import com.revolut.camerakit.ui.views.view.CameraKitPreviewView;
import com.revolut.feature.apm.core.ui.api.navigation.ApmNewAliasNavigation$InputData;
import com.revolut.feature.apm.core.ui.api.navigation.ApmNewContactNavigation$InputData;
import com.revolut.feature.apm.core.ui.api.navigation.ApmRecipientListInputData;
import com.revolut.feature.apm.core.ui.api.navigation.pending_payments.ApmConsentNavigation$InputData;
import com.revolut.feature.payments.profile.impl.data.network.passes.DigitalPassService;
import com.revolut.feature.payments.profile.impl.ui_kompot.flow.PaymentProfileFlowContract$InputData;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.PeerToPeerChatScreenContract$InputData;
import com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.screen.TransferOnlyChatScreenContract$InputData;
import com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.transfer_with_chat_flow.TransferOnlyChatToTransferFlowContract$InputData;
import com.revolut.feature.topup_screen.impl.flows.checkout.flow.CheckoutFlowContract$InputData;
import com.revolut.feature.topup_screen.impl.flows.cvv.screen.CvvScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import et6.h1;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import qgk.k3;
import retrofit2.Retrofit;
import rp0.g1;
import rp0.x0;
import t80.e;

/* JADX INFO: loaded from: classes8.dex */
public final class w implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f230166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f230167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f230168c;
    public final Object d;

    public /* synthetic */ w(Object obj2, Object obj3, int i, int i2) {
        this.f230166a = i2;
        this.f230167b = obj2;
        this.d = obj3;
        this.f230168c = i;
    }

    private final Object a() {
        ey.b bVar = (ey.b) this.f230167b;
        ey.d dVar = (ey.d) this.d;
        int i = this.f230168c;
        switch (i) {
            case 0:
                oy.b bVar2 = dVar.f130490b;
                oy.a extension = (oy.a) dVar.i.get();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 1:
                return olc.c.b(dVar.f130490b, (com.revolut.kompot.navigable.a) dVar.f130493h.get());
            case 2:
                xy.b bVar3 = dVar.f130491c;
                xy.a extension2 = (xy.a) dVar.E.get();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                vc.s.k(extension2);
                return extension2;
            case 3:
                return xhi.f.e(dVar.f130491c, (com.revolut.kompot.navigable.a) dVar.f130493h.get(), (yy.c) dVar.D.get());
            case 4:
                xv.h hVar = (xv.h) dVar.u.get();
                pv.a aVar = (pv.a) dVar.v.get();
                sx.a aVar2 = (sx.a) bVar.f130480g.k.get();
                vc.s.j(aVar2);
                py.d dVarB = bVar.f130480g.b();
                vc.s.j(dVarB);
                return new yy.c(hVar, aVar, aVar2, dVarB, (dv.a) dVar.A.get(), (ww.b) dVar.B.get(), new sy.d0(), (pw.c) dVar.C.get());
            case 5:
                vy.a aVar3 = dVar.d;
                ey.b bVar4 = (ey.b) dVar.L;
                w2 w2VarA = bVar.d.a();
                u00.d dVar2 = bVar4.e;
                vy.a inputData = dVar.d;
                oz.d dVar3 = oz.e.Companion;
                dVar3.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                Set set = inputData.e;
                vc.s.k(set);
                LinkedHashSet linkedHashSetH = dw3.l.h(dVar2, set, (dx.l) dVar.f130495l.get(), bVar4.f);
                xv.d dVar4 = (xv.d) dVar.f130502t.get();
                LifecycleOwner lifecycleOwner = (LifecycleOwner) dVar.f130496m.get();
                dx.l lVar = (dx.l) dVar.f130495l.get();
                iy.b experimentsInteractor = bVar4.f130481h.a();
                dVar3.getClass();
                Intrinsics.checkNotNullParameter(experimentsInteractor, "experimentsInteractor");
                boolean zA = experimentsInteractor.a(px.a.f240490a);
                iy.b experimentsInteractor2 = bVar4.f130481h.a();
                dVar3.getClass();
                Intrinsics.checkNotNullParameter(experimentsInteractor2, "experimentsInteractor");
                iy.a experiment = px.a.f240492c;
                boolean zA2 = experimentsInteractor2.a(experiment);
                iy.b experimentsInteractor3 = bVar4.f130481h.a();
                dVar3.getClass();
                Intrinsics.checkNotNullParameter(experimentsInteractor3, "experimentsInteractor");
                Intrinsics.checkNotNullParameter(experiment, "experiment");
                return oyj.c.a(aVar3, w2VarA, linkedHashSetH, dVar4, lifecycleOwner, lVar, zA, zA2);
            case 6:
                dx.m mVar = (dx.m) dVar.k.get();
                dw3.l.u(mVar);
                return mVar;
            case 7:
                return dw3.l.s((com.revolut.kompot.navigable.a) dVar.f130493h.get());
            case 8:
                return dw3.l.b((sw.d) dVar.f130501s.get());
            case 9:
                tw.a aVarA = bVar.f130480g.a();
                e4m.e eVar = dVar.f130496m;
                ey.b bVar5 = (ey.b) dVar.L;
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) eVar.get();
                PreviewView previewView = (PreviewView) dVar.o.get();
                yw.h hVar2 = (yw.h) dVar.f130500r.get();
                oz.d dVar5 = oz.e.Companion;
                iy.b experimentsInteractor4 = bVar5.f130481h.a();
                dVar5.getClass();
                Intrinsics.checkNotNullParameter(experimentsInteractor4, "experimentsInteractor");
                boolean zA3 = experimentsInteractor4.a(px.a.f240490a);
                f4h.a featuresInteractor = new f4h.a(bVar5.f130478b);
                dVar5.getClass();
                Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
                vw.b bVarU = featuresInteractor.u();
                f4h.a featuresInteractor2 = new f4h.a(bVar5.f130478b);
                dVar5.getClass();
                Intrinsics.checkNotNullParameter(featuresInteractor2, "featuresInteractor");
                vw.c cVarR = featuresInteractor2.r();
                f4h.a featuresInteractor3 = new f4h.a(bVar5.f130478b);
                dVar5.getClass();
                Intrinsics.checkNotNullParameter(featuresInteractor3, "featuresInteractor");
                vw.d dVarJ = featuresInteractor3.j();
                f4h.a featuresInteractor4 = new f4h.a(bVar5.f130478b);
                dVar5.getClass();
                Intrinsics.checkNotNullParameter(featuresInteractor4, "featuresInteractor");
                return dw3.l.d(aVarA, lifecycleOwner2, previewView, hVar2, zA3, bVarU, cVarR, dVarJ, featuresInteractor4.g());
            case 10:
                return wy.d.a();
            case 11:
                return dw3.l.t((CameraKitPreviewView) dVar.f130497n.get());
            case 12:
                return dw3.l.f((com.revolut.kompot.navigable.a) dVar.f130493h.get());
            case 13:
                yw.f impl = (yw.f) dVar.f130499q.get();
                Intrinsics.checkNotNullParameter(impl, "impl");
                vc.s.k(impl);
                return impl;
            case 14:
                return oyj.c.c((pz.a) dVar.f130498p.get(), new f4h.a(((ey.b) dVar.L).f130478b));
            case 15:
                CameraKitClientSettings cameraKitClientSettings = dVar.e;
                Intrinsics.checkNotNullParameter(cameraKitClientSettings, "cameraKitClientSettings");
                return new pz.b(cameraKitClientSettings);
            case 16:
                return dw3.l.e(bVar.i);
            case 17:
                nv.a aVar4 = bVar.i;
                e4m.e eVar2 = dVar.f130503w;
                ey.b bVar6 = (ey.b) dVar.L;
                dv.m mVar2 = (dv.m) eVar2.get();
                xv.c cVar = (xv.c) dVar.f130504x.get();
                CameraKitClientSettings cameraKitClientSettings2 = dVar.e;
                xv.h hVar3 = (xv.h) dVar.u.get();
                LifecycleOwner lifecycleOwner3 = (LifecycleOwner) dVar.f130496m.get();
                CameraKitUiSettings cameraKitUiSettings = dVar.f130492g;
                pv.a aVar5 = (pv.a) dVar.v.get();
                ww.b bVar7 = (ww.b) dVar.f130505y.get();
                dx.m mVar3 = (dx.m) dVar.k.get();
                fv.e eVar3 = bVar.f130482j;
                yw.h hVar4 = (yw.h) dVar.z.get();
                oz.d dVar6 = oz.e.Companion;
                f4h.a featuresInteractor5 = new f4h.a(bVar6.f130478b);
                dVar6.getClass();
                Intrinsics.checkNotNullParameter(featuresInteractor5, "featuresInteractor");
                vw.b bVarU2 = featuresInteractor5.u();
                f4h.a featuresInteractor6 = new f4h.a(bVar6.f130478b);
                dVar6.getClass();
                Intrinsics.checkNotNullParameter(featuresInteractor6, "featuresInteractor");
                vw.c cVarR2 = featuresInteractor6.r();
                f4h.a featuresInteractor7 = new f4h.a(bVar6.f130478b);
                dVar6.getClass();
                Intrinsics.checkNotNullParameter(featuresInteractor7, "featuresInteractor");
                return dw3.l.c(aVar4, mVar2, cVar, cameraKitClientSettings2, hVar3, lifecycleOwner3, cameraKitUiSettings, aVar5, bVar7, mVar3, eVar3, hVar4, bVarU2, cVarR2, featuresInteractor7.j());
            case 18:
                return dw3.l.g(bVar.i, dVar.f, dVar.f130492g);
            case 19:
                return dw3.l.a((sw.d) dVar.f130501s.get());
            case 20:
                return dw3.l.r((sw.d) dVar.f130501s.get());
            case 21:
                yw.h impl2 = (yw.h) dVar.f130500r.get();
                Intrinsics.checkNotNullParameter(impl2, "impl");
                vc.s.k(impl2);
                return impl2;
            case 22:
                return dw3.l.q((sw.d) dVar.f130501s.get());
            case 23:
                return dw3.l.k((sw.d) dVar.f130501s.get());
            case 24:
                yy.c cVar2 = (yy.c) dVar.D.get();
                yf6.b.h(cVar2);
                return cVar2;
            case 25:
                fz.b bVar8 = new fz.b((fz.c) dVar.H.get(), (com.revolut.kompot.navigable.a) dVar.f130493h.get());
                gsi.d.i(bVar8);
                return bVar8;
            case 26:
                return wpg.v.k((LifecycleOwner) dVar.f130496m.get());
            case 27:
                uy.a aVar6 = new uy.a();
                dv.a aVar7 = (dv.a) dVar.A.get();
                xv.h hVar5 = (xv.h) dVar.u.get();
                vy.a aVar8 = dVar.d;
                py.d dVarB2 = bVar.f130480g.b();
                vc.s.j(dVarB2);
                yy.c cVar3 = (yy.c) dVar.D.get();
                dz.a aVar9 = new dz.a();
                ty.h hVar6 = new ty.h();
                ty.i iVar = new ty.i();
                qd0.b bVarN = ((ey.b) dVar.L).f130479c.n();
                vc.s.j(bVarN);
                return new com.revolut.camerakit.revolut.ui.flow.steps.camera.a(aVar6, aVar7, hVar5, aVar8, dVarB2, cVar3, aVar9, hVar6, iVar, new zy.f(new ybh.c0(bVarN, new ez.a())), (cli.n) dVar.J.get());
            case 28:
                qy.a aVar10 = (qy.a) bVar.f130483l.get();
                vy.a aVar11 = dVar.d;
                qd0.b bVarN2 = bVar.f130479c.n();
                vc.s.j(bVarN2);
                return new sy.c0(aVar10, aVar11, bVarN2);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        ey.b bVar = (ey.b) this.f230167b;
        oz.c cVar = (oz.c) this.d;
        int i = this.f230168c;
        switch (i) {
            case 0:
                oy.b bVar2 = cVar.f231079a;
                oy.a extension = (oy.a) cVar.i.get();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 1:
                return olc.c.b(cVar.f231079a, (com.revolut.kompot.navigable.a) cVar.f231083h.get());
            case 2:
                xy.b bVar3 = cVar.f231080b;
                xy.a extension2 = (xy.a) cVar.E.get();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                vc.s.k(extension2);
                return extension2;
            case 3:
                return xhi.f.e(cVar.f231080b, (com.revolut.kompot.navigable.a) cVar.f231083h.get(), (yy.c) cVar.D.get());
            case 4:
                xv.h hVar = (xv.h) cVar.u.get();
                pv.a aVar = (pv.a) cVar.v.get();
                sx.a aVar2 = (sx.a) bVar.f130480g.k.get();
                vc.s.j(aVar2);
                py.d dVarB = bVar.f130480g.b();
                vc.s.j(dVarB);
                return new yy.c(hVar, aVar, aVar2, dVarB, (dv.a) cVar.A.get(), (ww.b) cVar.B.get(), new sy.d0(), (pw.c) cVar.C.get());
            case 5:
                vy.a aVar3 = cVar.f231081c;
                ey.b bVar4 = cVar.f231082g;
                w2 w2VarA = bVar.d.a();
                u00.d dVar = bVar4.e;
                vy.a inputData = cVar.f231081c;
                oz.d dVar2 = oz.e.Companion;
                dVar2.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                Set set = inputData.e;
                vc.s.k(set);
                LinkedHashSet linkedHashSetH = dw3.l.h(dVar, set, (dx.l) cVar.f231085l.get(), bVar4.f);
                xv.d dVar3 = (xv.d) cVar.f231092t.get();
                LifecycleOwner lifecycleOwner = (LifecycleOwner) cVar.f231086m.get();
                dx.l lVar = (dx.l) cVar.f231085l.get();
                iy.b experimentsInteractor = bVar4.f130481h.a();
                dVar2.getClass();
                Intrinsics.checkNotNullParameter(experimentsInteractor, "experimentsInteractor");
                boolean zA = experimentsInteractor.a(px.a.f240490a);
                iy.b experimentsInteractor2 = bVar4.f130481h.a();
                dVar2.getClass();
                Intrinsics.checkNotNullParameter(experimentsInteractor2, "experimentsInteractor");
                iy.a experiment = px.a.f240492c;
                boolean zA2 = experimentsInteractor2.a(experiment);
                iy.b experimentsInteractor3 = bVar4.f130481h.a();
                dVar2.getClass();
                Intrinsics.checkNotNullParameter(experimentsInteractor3, "experimentsInteractor");
                Intrinsics.checkNotNullParameter(experiment, "experiment");
                return oyj.c.a(aVar3, w2VarA, linkedHashSetH, dVar3, lifecycleOwner, lVar, zA, zA2);
            case 6:
                dx.m mVar = (dx.m) cVar.k.get();
                dw3.l.u(mVar);
                return mVar;
            case 7:
                return dw3.l.s((com.revolut.kompot.navigable.a) cVar.f231083h.get());
            case 8:
                return dw3.l.b((sw.d) cVar.f231091s.get());
            case 9:
                tw.a aVarA = bVar.f130480g.a();
                e4m.e eVar = cVar.f231086m;
                ey.b bVar5 = cVar.f231082g;
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) eVar.get();
                PreviewView previewView = (PreviewView) cVar.o.get();
                yw.h hVar2 = (yw.h) cVar.f231090r.get();
                oz.d dVar4 = oz.e.Companion;
                iy.b experimentsInteractor4 = bVar5.f130481h.a();
                dVar4.getClass();
                Intrinsics.checkNotNullParameter(experimentsInteractor4, "experimentsInteractor");
                boolean zA3 = experimentsInteractor4.a(px.a.f240490a);
                f4h.a featuresInteractor = new f4h.a(bVar5.f130478b);
                dVar4.getClass();
                Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
                vw.b bVarU = featuresInteractor.u();
                f4h.a featuresInteractor2 = new f4h.a(bVar5.f130478b);
                dVar4.getClass();
                Intrinsics.checkNotNullParameter(featuresInteractor2, "featuresInteractor");
                vw.c cVarR = featuresInteractor2.r();
                f4h.a featuresInteractor3 = new f4h.a(bVar5.f130478b);
                dVar4.getClass();
                Intrinsics.checkNotNullParameter(featuresInteractor3, "featuresInteractor");
                vw.d dVarJ = featuresInteractor3.j();
                f4h.a featuresInteractor4 = new f4h.a(bVar5.f130478b);
                dVar4.getClass();
                Intrinsics.checkNotNullParameter(featuresInteractor4, "featuresInteractor");
                return dw3.l.d(aVarA, lifecycleOwner2, previewView, hVar2, zA3, bVarU, cVarR, dVarJ, featuresInteractor4.g());
            case 10:
                bz.b.Companion.getClass();
                return new fz.c();
            case 11:
                return dw3.l.t((CameraKitPreviewView) cVar.f231087n.get());
            case 12:
                return dw3.l.f((com.revolut.kompot.navigable.a) cVar.f231083h.get());
            case 13:
                yw.f impl = (yw.f) cVar.f231089q.get();
                Intrinsics.checkNotNullParameter(impl, "impl");
                vc.s.k(impl);
                return impl;
            case 14:
                return oyj.c.c((pz.a) cVar.f231088p.get(), new f4h.a(cVar.f231082g.f130478b));
            case 15:
                CameraKitClientSettings cameraKitClientSettings = cVar.d;
                Intrinsics.checkNotNullParameter(cameraKitClientSettings, "cameraKitClientSettings");
                return new pz.b(cameraKitClientSettings);
            case 16:
                return dw3.l.e(bVar.i);
            case 17:
                nv.a aVar4 = bVar.i;
                e4m.e eVar2 = cVar.f231093w;
                ey.b bVar6 = cVar.f231082g;
                dv.m mVar2 = (dv.m) eVar2.get();
                xv.c cVar2 = (xv.c) cVar.f231094x.get();
                CameraKitClientSettings cameraKitClientSettings2 = cVar.d;
                xv.h hVar3 = (xv.h) cVar.u.get();
                LifecycleOwner lifecycleOwner3 = (LifecycleOwner) cVar.f231086m.get();
                CameraKitUiSettings cameraKitUiSettings = cVar.f;
                pv.a aVar5 = (pv.a) cVar.v.get();
                ww.b bVar7 = (ww.b) cVar.f231095y.get();
                dx.m mVar3 = (dx.m) cVar.k.get();
                fv.e eVar3 = bVar.f130482j;
                yw.h hVar4 = (yw.h) cVar.z.get();
                oz.d dVar5 = oz.e.Companion;
                f4h.a featuresInteractor5 = new f4h.a(bVar6.f130478b);
                dVar5.getClass();
                Intrinsics.checkNotNullParameter(featuresInteractor5, "featuresInteractor");
                vw.b bVarU2 = featuresInteractor5.u();
                f4h.a featuresInteractor6 = new f4h.a(bVar6.f130478b);
                dVar5.getClass();
                Intrinsics.checkNotNullParameter(featuresInteractor6, "featuresInteractor");
                vw.c cVarR2 = featuresInteractor6.r();
                f4h.a featuresInteractor7 = new f4h.a(bVar6.f130478b);
                dVar5.getClass();
                Intrinsics.checkNotNullParameter(featuresInteractor7, "featuresInteractor");
                return dw3.l.c(aVar4, mVar2, cVar2, cameraKitClientSettings2, hVar3, lifecycleOwner3, cameraKitUiSettings, aVar5, bVar7, mVar3, eVar3, hVar4, bVarU2, cVarR2, featuresInteractor7.j());
            case 18:
                return dw3.l.g(bVar.i, cVar.e, cVar.f);
            case 19:
                return dw3.l.a((sw.d) cVar.f231091s.get());
            case 20:
                return dw3.l.r((sw.d) cVar.f231091s.get());
            case 21:
                yw.h impl2 = (yw.h) cVar.f231090r.get();
                Intrinsics.checkNotNullParameter(impl2, "impl");
                vc.s.k(impl2);
                return impl2;
            case 22:
                return dw3.l.q((sw.d) cVar.f231091s.get());
            case 23:
                return dw3.l.k((sw.d) cVar.f231091s.get());
            case 24:
                yy.c cVar3 = (yy.c) cVar.D.get();
                yf6.b.h(cVar3);
                return cVar3;
            case 25:
                fz.b bVar8 = new fz.b((fz.c) cVar.H.get(), (com.revolut.kompot.navigable.a) cVar.f231083h.get());
                gsi.d.i(bVar8);
                return bVar8;
            case 26:
                LifecycleOwner lifecycleOwner4 = (LifecycleOwner) cVar.f231086m.get();
                bz.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(lifecycleOwner4, "lifecycleOwner");
                fz.c cVar4 = (fz.c) lifecycleOwner4;
                vc.s.k(cVar4);
                return cVar4;
            case 27:
                cVar.getClass();
                cz.a faceInFrameValidationResultMapper = new cz.a();
                cz.c imageQualityValidatorResultMapper = new cz.c();
                Intrinsics.checkNotNullParameter(faceInFrameValidationResultMapper, "faceInFrameValidationResultMapper");
                Intrinsics.checkNotNullParameter(imageQualityValidatorResultMapper, "imageQualityValidatorResultMapper");
                return new az.k(new a3e.u(new r39.a(), e4m.b.a(cVar.f231082g.f130483l)), cVar.f231081c, (yy.c) cVar.D.get(), (dv.a) cVar.A.get(), (xv.h) cVar.u.get(), new uy.a());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        oz9.d dVar = (oz9.d) this.d;
        oz9.c cVar = (oz9.c) this.f230167b;
        int i = this.f230168c;
        switch (i) {
            case 0:
                g6k.e extension = (g6k.e) dVar.f231149h.get();
                h6k.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 1:
                return new g6k.e((j60.a) dVar.e.get(), (g6k.f) dVar.f231148g.get());
            case 2:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) dVar.d.get();
                he2.b dialogHostFinder = ehe.n.r();
                h6k.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
                return new j60.c(controller, new rp0.m(), dialogHostFinder);
            case 3:
                ytf.a aVar = cVar.f231139r;
                pqi.a aVar2 = cVar.u;
                tv9.a aVar3 = cVar.f231135m;
                utf.a aVarA = aVar.a();
                vc.s.j(aVarA);
                vv9.a aVarA2 = ((s6k.b) aVar3).a();
                vc.s.j(aVarA2);
                vv9.b bVarB = ((s6k.b) aVar3).b();
                vc.s.j(bVarB);
                wv9.c cVarD = ((s6k.b) aVar3).d();
                vc.s.j(cVarD);
                bqf.g gVarF = cVar.f231132h.f();
                zof.f fVarD = cVar.f231140s.d();
                vc.s.j(fVarD);
                i5k.a aVar4 = (i5k.a) dVar.f.get();
                gte.a aVarB = cVar.f231133j.b();
                vc.s.j(aVarB);
                return new g6k.r(aVarA, aVarA2, bVarB, cVarD, gVarF, fVarD, aVar4, aVarB, aVar2.e(), (j60.a) dVar.e.get(), aVar2.g());
            case 4:
                l80.h hVarV = cVar.f231141t.v();
                vc.s.j(hVarV);
                return new i5k.d(hVarV);
            case 5:
                wj0.a idempotencyKeyHolder = ((nj0.d) cVar.G).i();
                vc.s.j(idempotencyKeyHolder);
                l80.e dateProvider = cVar.f231141t.h();
                vc.s.j(dateProvider);
                h6k.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
                Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                return new m60.b(idempotencyKeyHolder, dateProvider, "payments_money_request");
            case 6:
                wj0.a idempotencyKeyHolder2 = ((nj0.d) cVar.G).i();
                vc.s.j(idempotencyKeyHolder2);
                l80.e dateProvider2 = cVar.f231141t.h();
                vc.s.j(dateProvider2);
                h6k.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(idempotencyKeyHolder2, "idempotencyKeyHolder");
                Intrinsics.checkNotNullParameter(dateProvider2, "dateProvider");
                return new m60.b(idempotencyKeyHolder2, dateProvider2, "payments_apm_money_request");
            case 7:
                Object extension2 = (g6k.f) dVar.f231148g.get();
                h6k.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                yji.n nVar = (yji.n) extension2;
                vc.s.k(nVar);
                return nVar;
            case 8:
                r10.f factory = cVar.H.a();
                h6k.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.d();
            case 9:
                Object extension3 = (m0a.g) dVar.o.get();
                o0a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension3, "extension");
                yji.n nVar2 = (yji.n) extension3;
                vc.s.k(nVar2);
                return nVar2;
            case 10:
                return new m0a.k(dVar.b(), cVar.f231144y.a(), (iz9.c) cVar.S.get(), (g6k.a) dVar.f231148g.get(), (wz9.a) dVar.f231153n.get(), new vz9.o((iz9.c) dVar.f231147c.S.get()));
            case 11:
                ife.d dVar2 = (ife.d) cVar.z.f204992b.get();
                vc.s.j(dVar2);
                return new wz9.a(dVar2);
            case 12:
                wz9.a extension4 = (wz9.a) dVar.f231153n.get();
                o0a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension4, "extension");
                vc.s.k(extension4);
                return extension4;
            case 13:
                return new com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.flow.b(dVar.f231145a, dVar.b(), new om4.d0(((n2a.a) dVar.f231147c.E).b(), new rz9.a()), dVar.f231146b);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        oz9.c cVar = (oz9.c) this.f230167b;
        oz9.e eVar = (oz9.e) this.d;
        int i = this.f230168c;
        switch (i) {
            case 0:
                g6k.e eVar2 = (g6k.e) eVar.f231161h.get();
                gsi.d.a(eVar2);
                return eVar2;
            case 1:
                return new g6k.e((j60.a) eVar.e.get(), (g6k.f) eVar.f231160g.get());
            case 2:
                return gsi.d.D((com.revolut.kompot.navigable.a) eVar.d.get(), kxa.j.o(new nji.b()));
            case 3:
                ytf.a aVar = cVar.f231139r;
                pqi.a aVar2 = cVar.u;
                tv9.a aVar3 = cVar.f231135m;
                utf.a aVarA = aVar.a();
                vc.s.j(aVarA);
                vv9.a aVarA2 = ((s6k.b) aVar3).a();
                vc.s.j(aVarA2);
                vv9.b bVarB = ((s6k.b) aVar3).b();
                vc.s.j(bVarB);
                wv9.c cVarD = ((s6k.b) aVar3).d();
                vc.s.j(cVarD);
                bqf.g gVarF = cVar.f231132h.f();
                zof.f fVarD = cVar.f231140s.d();
                vc.s.j(fVarD);
                i5k.a aVar4 = (i5k.a) eVar.f.get();
                gte.a aVarB = cVar.f231133j.b();
                vc.s.j(aVarB);
                return new g6k.r(aVarA, aVarA2, bVarB, cVarD, gVarF, fVarD, aVar4, aVarB, aVar2.e(), (j60.a) eVar.e.get(), aVar2.g());
            case 4:
                l80.h hVarV = cVar.f231141t.v();
                vc.s.j(hVarV);
                return new i5k.d(hVarV);
            case 5:
                return gsi.d.h((j60.a) eVar.e.get());
            case 6:
                return kxa.j.k((j60.a) eVar.f231163l.get());
            case 7:
                return ehe.n.s((com.revolut.kompot.navigable.a) eVar.d.get(), (rp0.m) eVar.k.get());
            case 8:
                return new rp0.m();
            case 9:
                Object extension = (m0a.g) eVar.o.get();
                s0a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.n nVar = (yji.n) extension;
                vc.s.k(nVar);
                return nVar;
            case 10:
                oz9.c cVar2 = eVar.f231159c;
                x2k.e eVar3 = new x2k.e();
                lo5.p pVarB = ((yo5.w) cVar2.v).b();
                vc.s.j(pVarB);
                oy1.b bVarB2 = cVar2.f231142w.b();
                un9.a aVarD = cVar2.f231143x.d();
                vc.s.j(aVarD);
                return new m0a.k(new q0a.b(eVar3, pVarB, bVarB2, aVarD), cVar.f231144y.a(), (iz9.c) cVar.S.get(), (g6k.a) eVar.f231160g.get(), (wz9.a) eVar.f231165n.get(), new vz9.o((iz9.c) eVar.f231159c.S.get()));
            case 11:
                ife.d dVar = (ife.d) cVar.z.f204992b.get();
                vc.s.j(dVar);
                return new wz9.a(dVar);
            case 12:
                Object extension2 = (m0a.l) eVar.f231167q.get();
                s0a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                yji.n nVar2 = (yji.n) extension2;
                vc.s.k(nVar2);
                return nVar2;
            case 13:
                j60.a aVar5 = (j60.a) eVar.f231163l.get();
                jo5.a aVar6 = (jo5.a) ((yo5.w) cVar.v).J.get();
                vc.s.j(aVar6);
                return new m0a.n(aVar5, aVar6, new se5.a());
            case 14:
                wz9.a extension3 = (wz9.a) eVar.f231165n.get();
                s0a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension3, "extension");
                vc.s.k(extension3);
                return extension3;
            case 15:
                return gsi.d.b((g6k.f) eVar.f231160g.get());
            case 16:
                i5k.a aVar7 = (i5k.a) eVar.f.get();
                j5k.b.a(aVar7);
                return aVar7;
            case 17:
                oz9.c cVar3 = eVar.f231159c;
                oz9.c cVar4 = eVar.f231159c;
                kge.d dVar2 = new kge.d((iz9.c) cVar3.S.get(), (iz9.a) cVar3.T.get());
                d3j.b bVarE = ((b3j.p) cVar4.f231131g).e();
                lra.d dVarB = ((jqa.p) cVar4.A).b();
                vc.s.j(dVarB);
                aa6.c cVarB = cVar4.B.b();
                vc.s.j(cVarB);
                ap5.b bVarE2 = ((yo5.w) cVar4.v).e();
                vc.s.j(bVarE2);
                fy1.r rVar = (fy1.r) ((ey1.e) cVar4.C).B.get();
                vc.s.j(rVar);
                co9.b bVarB3 = cVar4.f231143x.b();
                vc.s.j(bVarB3);
                l0a.l lVar = new l0a.l(bVarE, dVarB, cVarB, bVarE2, rVar, bVarB3);
                m0a.g gVar = (m0a.g) eVar.o.get();
                l0a.d dVar3 = new l0a.d(cVar4.f231142w.a());
                pa6.m mVar = cVar4.B;
                ry1.e eVar4 = cVar4.f231142w;
                fa6.a aVarD2 = mVar.d();
                vc.s.j(aVarD2);
                t70.b bVarG = cVar4.f231141t.g();
                vc.s.j(bVarG);
                sy1.d dVarA = eVar4.a();
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) eVar4.k).c();
                vc.s.j(aVarC);
                l0a.f fVar = new l0a.f(aVarD2, bVarG, new l0a.b(dVarA, new py1.d(aVarC)));
                l0a.g gVar2 = new l0a.g();
                tx9.f fVarC = cVar.D.c();
                vc.s.j(fVarC);
                m0a.l lVar2 = (m0a.l) eVar.f231167q.get();
                om4.d0 d0Var = new om4.d0(((n2a.a) cVar4.E).b(), new rz9.a());
                yz9.c cVar5 = eVar.f231157a;
                c0a.a aVar8 = new c0a.a();
                TransferOnlyChatScreenContract$InputData transferOnlyChatScreenContract$InputData = eVar.f231158b;
                r0a.a aVar9 = new r0a.a(((b3j.p) cVar4.f231131g).h());
                kbb.c cVarC = cVar4.c();
                com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) cVar4.f231129b).c();
                vc.s.j(aVarC2);
                return new r0a.y(dVar2, lVar, gVar, dVar3, fVar, gVar2, fVarC, lVar2, d0Var, cVar5, aVar8, transferOnlyChatScreenContract$InputData, aVar9, new k7i.i(cVarC, aVarC2), (cli.n) eVar.v.get());
            case 18:
                oz9.c cVar6 = eVar.f231159c;
                oz9.c cVar7 = eVar.f231159c;
                fa6.a aVarD3 = cVar6.B.d();
                vc.s.j(aVarD3);
                kgm.i iVar = new kgm.i(b3j.p.f(), new kl.b0(b3j.p.c(), b3j.p.d()));
                aqa.c cVarC2 = ((jqa.p) cVar6.A).c();
                vc.s.j(cVarC2);
                io5.b bVarA = ((yo5.w) cVar6.v).a();
                vc.s.j(bVarA);
                lx1.i iVarD = ((ey1.e) cVar6.C).d();
                vc.s.j(iVarD);
                tn9.a aVarC3 = cVar6.f231143x.c();
                vc.s.j(aVarC3);
                p0a.d dVar4 = new p0a.d(aVarD3, iVar, cVarC2, bVarA, iVarD, aVarC3);
                nu9.a aVar10 = cVar7.F;
                ru9.o oVar = (ru9.o) aVar10.f219245t.get();
                vc.s.j(oVar);
                ru9.l0 l0Var = (ru9.l0) aVar10.f219244s.get();
                vc.s.j(l0Var);
                p0a.a aVar11 = new p0a.a(oVar, l0Var);
                com.revolut.domain.interactors.transactions.a aVarC4 = ((bjf.a) cVar7.f231142w.k).c();
                vc.s.j(aVarC4);
                py1.d apmChatDelegate = new py1.d(aVarC4);
                Intrinsics.checkNotNullParameter(apmChatDelegate, "apmChatDelegate");
                p0a.c cVar8 = new p0a.c();
                t2j.a aVar12 = cVar.f231131g;
                return new r0a.z(dVar4, aVar11, cVar8, new m3j.o());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        oz9.c cVar = (oz9.c) this.f230167b;
        oz9.h hVar = (oz9.h) this.d;
        int i = this.f230168c;
        switch (i) {
            case 0:
                g6k.e eVar = (g6k.e) hVar.f231189l.get();
                gsi.d.a(eVar);
                return eVar;
            case 1:
                return new g6k.e((j60.a) hVar.i.get(), (g6k.f) hVar.k.get());
            case 2:
                return gsi.d.D((com.revolut.kompot.navigable.a) hVar.f231186h.get(), kxa.j.o(new nji.b()));
            case 3:
                ytf.a aVar = cVar.f231139r;
                pqi.a aVar2 = cVar.u;
                tv9.a aVar3 = cVar.f231135m;
                utf.a aVarA = aVar.a();
                vc.s.j(aVarA);
                vv9.a aVarA2 = ((s6k.b) aVar3).a();
                vc.s.j(aVarA2);
                vv9.b bVarB = ((s6k.b) aVar3).b();
                vc.s.j(bVarB);
                wv9.c cVarD = ((s6k.b) aVar3).d();
                vc.s.j(cVarD);
                bqf.g gVarF = cVar.f231132h.f();
                zof.f fVarD = cVar.f231140s.d();
                vc.s.j(fVarD);
                i5k.a aVar4 = (i5k.a) hVar.f231188j.get();
                gte.a aVarB = cVar.f231133j.b();
                vc.s.j(aVarB);
                return new g6k.r(aVarA, aVarA2, bVarB, cVarD, gVarF, fVarD, aVar4, aVarB, aVar2.e(), (j60.a) hVar.i.get(), aVar2.g());
            case 4:
                l80.h hVarV = cVar.f231141t.v();
                vc.s.j(hVarV);
                return new i5k.d(hVarV);
            case 5:
                return gsi.d.h((j60.a) hVar.i.get());
            case 6:
                Object impl = (j60.a) hVar.o.get();
                i7k.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(impl, "impl");
                yji.d dVar = (yji.d) impl;
                vc.s.k(dVar);
                return dVar;
            case 7:
                return hy1.g.B((com.revolut.kompot.navigable.a) hVar.f231186h.get(), kxa.j.o(new nji.b()));
            case 8:
                n60.b bVar = (n60.b) hVar.f231193q.get();
                o5k.i.m(bVar);
                return bVar;
            case 9:
                return o5k.i.r((com.revolut.kompot.navigable.a) hVar.f231186h.get());
            case 10:
                n60.a aVar5 = (n60.a) hVar.f231195s.get();
                o5k.i.l(aVar5);
                return aVar5;
            case 11:
                return o5k.i.q((com.revolut.kompot.navigable.a) hVar.f231186h.get());
            case 12:
                j9i.d extension = (j9i.d) hVar.v.get();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 13:
                o9i.a aVar6 = hVar.f231180b;
                oz9.c cVar2 = hVar.f231185g;
                o9i.c cVar3 = hVar.d;
                o9i.b bVar2 = hVar.f231182c;
                Retrofit retrofitF = ((nj0.d) cVar2.G).f();
                o5k.i.x(retrofitF);
                q9i.d dVarE = o5k.i.e(aVar6, o5k.i.c(bVar2, o5k.i.y(cVar3, retrofitF), new l9i.a(), new p9i.a()));
                Retrofit retrofitF2 = ((nj0.d) cVar2.G).f();
                o5k.i.x(retrofitF2);
                return jr9.h.w(new r9i.e(new q9i.b(dVarE, o5k.i.f(aVar6, o5k.i.d(bVar2, o5k.i.y(cVar3, retrofitF2), new l9i.a(), new p9i.a()))), new r9i.a()), hVar.e, (j9i.a) hVar.u.get());
            case 14:
                return a0a.f.a();
            case 15:
                return kxa.j.k((j60.a) hVar.f231199y.get());
            case 16:
                return ehe.n.s((com.revolut.kompot.navigable.a) hVar.f231186h.get(), (rp0.m) hVar.f231198x.get());
            case 17:
                return new rp0.m();
            case 18:
                qu9.b extension2 = (qu9.b) hVar.A.get();
                a0a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                vc.s.k(extension2);
                return extension2;
            case 19:
                qu9.a factory = (qu9.a) cVar.F.f219246w.get();
                vc.s.j(factory);
                a0a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return new qu9.b(factory.f249275a, factory.f249276b, factory.f249277c);
            case 20:
                e0a.c0 extension3 = (e0a.c0) hVar.C.get();
                a0a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension3, "extension");
                vc.s.k(extension3);
                return extension3;
            case 21:
                iz9.e eVar2 = (iz9.e) cVar.V.get();
                tx9.f fVarC = cVar.D.c();
                vc.s.j(fVarC);
                PeerToPeerChatScreenContract$InputData peerToPeerChatScreenContract$InputData = hVar.f;
                pu9.b bVar3 = (pu9.b) cVar.F.B.get();
                vc.s.j(bVar3);
                return new e0a.c0(eVar2, fVarC, peerToPeerChatScreenContract$InputData, bVar3);
            case 22:
                e0a.l extension4 = (e0a.l) hVar.E.get();
                a0a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension4, "extension");
                vc.s.k(extension4);
                return extension4;
            case 23:
                return new e0a.l((j9i.d) hVar.v.get(), (n60.b) hVar.f231193q.get(), cVar.i.a());
            case 24:
                e0a.b0 extension5 = (e0a.b0) hVar.H.get();
                a0a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension5, "extension");
                vc.s.k(extension5);
                return extension5;
            case 25:
                nu9.a aVar7 = cVar.F;
                nu9.a aVar8 = cVar.F;
                iu9.b bVar4 = (iu9.b) aVar7.u.get();
                vc.s.j(bVar4);
                j60.a aVar9 = (j60.a) hVar.f231199y.get();
                iu9.a aVar10 = (iu9.a) aVar8.f219248y.get();
                vc.s.j(aVar10);
                iz9.e eVar3 = (iz9.e) cVar.V.get();
                ang.f fVarE = cVar.e.e();
                gte.a aVarB2 = cVar.f231133j.b();
                vc.s.j(aVarB2);
                pu9.c cVar4 = new pu9.c();
                lz0.g gVar = (lz0.g) hVar.G.get();
                cu9.o oVar = (cu9.o) aVar8.F.get();
                vc.s.j(oVar);
                return new e0a.b0(bVar4, aVar9, aVar10, eVar3, fVarE, aVarB2, cVar4, gVar, oVar);
            case 26:
                z70.a contextProvider = cVar.f231141t.f();
                vc.s.j(contextProvider);
                a0a.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
                lz0.g gVarC0 = jh.d.f(contextProvider.getContext()).c0();
                vc.s.k(gVarC0);
                return gVarC0;
            case 27:
                Object extension6 = (e0a.e) hVar.K.get();
                a0a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension6, "extension");
                yji.n nVar = (yji.n) extension6;
                vc.s.k(nVar);
                return nVar;
            case 28:
                return new e0a.i(hVar.f, cVar.f231138q.a(), hVar.c(), (iz9.c) cVar.S.get(), (wz9.a) hVar.J.get(), cVar.f231144y.a());
            case 29:
                ife.d dVar2 = (ife.d) cVar.z.f204992b.get();
                vc.s.j(dVar2);
                return new wz9.a(dVar2);
            case 30:
                Object extension7 = (e0a.r) hVar.O.get();
                a0a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension7, "extension");
                yji.n nVar2 = (yji.n) extension7;
                vc.s.k(nVar2);
                return nVar2;
            case 31:
                nu9.a aVar11 = cVar.F;
                nu9.a aVar12 = cVar.F;
                cu9.n nVar3 = (cu9.n) aVar11.v.get();
                vc.s.j(nVar3);
                j60.a aVar13 = (j60.a) hVar.f231199y.get();
                k61.a aVarE = cVar.f231136n.e();
                vc.s.j(aVarE);
                p7k.b bVar5 = new p7k.b();
                g1 g1Var = (g1) hVar.M.get();
                c70.a aVarZ = cVar.f231141t.z();
                vc.s.j(aVarZ);
                iz9.e eVar4 = (iz9.e) cVar.V.get();
                du9.b bVarA = aVar12.a();
                vc.s.j(bVarA);
                rp0.l0 l0Var = (rp0.l0) hVar.N.get();
                lv9.d dVarD = cVar.f231128a.d();
                vc.s.j(dVarD);
                wu9.c cVar5 = (wu9.c) aVar12.E.get();
                vc.s.j(cVar5);
                return new e0a.w(nVar3, aVar13, aVarE, bVar5, g1Var, aVarZ, eVar4, bVarA, l0Var, dVarD, cVar5, ((s41.a) cVar.J).d(), new vz9.o((iz9.c) hVar.f231185g.S.get()), hVar.f);
            case 32:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) hVar.f231186h.get();
                a0a.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return x0.a(g1.Companion, controller.D2());
            case 33:
                com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) hVar.f231186h.get();
                a0a.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller2, "controller");
                return new rp0.l0(controller2.m2());
            case 34:
                Object extension8 = (e0a.m) hVar.U.get();
                a0a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension8, "extension");
                yji.n nVar4 = (yji.n) extension8;
                vc.s.k(nVar4);
                return nVar4;
            case 35:
                g6k.a aVar14 = (g6k.a) hVar.k.get();
                h7k.a aVar15 = (h7k.a) hVar.R.get();
                k61.a aVarE2 = cVar.f231136n.e();
                vc.s.j(aVarE2);
                return new e0a.q(aVar14, aVar15, aVarE2, new p7k.b(), (g0a.a) hVar.S.get(), (h0a.c) hVar.T.get(), ((s41.a) cVar.J).d());
            case 36:
                j60.a aVar16 = (j60.a) hVar.o.get();
                k61.a aVarE3 = cVar.f231136n.e();
                vc.s.j(aVarE3);
                return new h7k.i(aVar16, aVarE3, new j7k.a(), cVar.u.e(), (f01.a) hVar.Q.get());
            case 37:
                return hy1.g.u((com.revolut.kompot.navigable.a) hVar.f231186h.get());
            case 38:
                g0a.h hVar2 = new g0a.h();
                tbk.e eVar5 = (tbk.e) cVar.K.u.get();
                vc.s.j(eVar5);
                iz9.e eVar6 = (iz9.e) cVar.V.get();
                j60.a aVar17 = (j60.a) hVar.f231199y.get();
                wj0.a aVarI = ((nj0.d) cVar.G).i();
                vc.s.j(aVarI);
                return new g0a.g(hVar2, eVar5, eVar6, aVar17, aVarI);
            case 39:
                return new h0a.e(new h0a.b(((k3) hVar.f231185g.L).b()), cVar.M.b(), (iz9.e) cVar.V.get());
            case 40:
                Object extension9 = (g0a.a) hVar.S.get();
                a0a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension9, "extension");
                yji.n nVar5 = (yji.n) extension9;
                vc.s.k(nVar5);
                return nVar5;
            case 41:
                Object extension10 = (h0a.c) hVar.T.get();
                a0a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension10, "extension");
                yji.n nVar6 = (yji.n) extension10;
                vc.s.k(nVar6);
                return nVar6;
            case 42:
                f0a.c extension11 = (f0a.c) hVar.Y.get();
                a0a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension11, "extension");
                vc.s.k(extension11);
                return extension11;
            case 43:
                return new f0a.c(new f0a.b(), (j60.a) hVar.f231199y.get(), ((c21.b) cVar.N).c(), cVar.k.f());
            case 44:
                i0a.b extension12 = (i0a.b) hVar.f231179a0.get();
                a0a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension12, "extension");
                vc.s.k(extension12);
                return extension12;
            case 45:
                iz9.e eVar7 = (iz9.e) cVar.V.get();
                qz9.g gVar2 = (qz9.g) cVar.X.get();
                wl3.u uVarF = cVar.k.f();
                l80.e eVarH = cVar.f231141t.h();
                vc.s.j(eVarH);
                hj8.a aVarA3 = cVar.O.a();
                vc.s.j(aVarA3);
                return new i0a.b(eVar7, gVar2, uVarF, eVarH, aVarA3);
            case 46:
                wz9.a extension13 = (wz9.a) hVar.J.get();
                a0a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension13, "extension");
                vc.s.k(extension13);
                return extension13;
            case 47:
                return gsi.d.b((g6k.f) hVar.k.get());
            case 48:
                i5k.a aVar18 = (i5k.a) hVar.f231188j.get();
                j5k.b.a(aVar18);
                return aVar18;
            case 49:
                Object extension14 = (h7k.a) hVar.R.get();
                i7k.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension14, "extension");
                yji.n nVar7 = (yji.n) extension14;
                vc.s.k(nVar7);
                return nVar7;
            case 50:
                oz9.c cVar6 = hVar.f231185g;
                oz9.c cVar7 = hVar.f231185g;
                iz9.e eVar8 = (iz9.e) cVar6.V.get();
                hu9.a aVar19 = (hu9.a) cVar6.F.f219241p.get();
                vc.s.j(aVar19);
                r10.f fVar = new r10.f(aVar19, hVar.b());
                o7.d dVar3 = new o7.d(hVar.b());
                lv9.d dVarD2 = cVar6.f231128a.d();
                vc.s.j(dVarD2);
                c0a.b bVar6 = new c0a.b(eVar8, fVar, dVar3, dVarD2, new zjh.f(((n2a.a) cVar6.E).c()), ((oz9.b) hVar.j0).f231126b, new c0a.a());
                b0a.i iVar = new b0a.i(((c21.b) cVar7.N).c(), cVar7.k.f(), (iz9.e) cVar7.V.get(), (iz9.c) cVar7.S.get());
                b0a.k kVarB = hVar.b();
                r10.v vVar = new r10.v(hVar.b(), hVar.c(), new a61.a(hVar.b(), cVar7.i.a()));
                n8b.a aVarA4 = cVar7.P.a();
                vc.s.j(aVarA4);
                mp.p pVar = new mp.p(kVarB, vVar, aVarA4);
                e0a.l lVar = (e0a.l) hVar.E.get();
                e0a.b0 b0Var = (e0a.b0) hVar.H.get();
                j60.a aVar20 = (j60.a) hVar.f231199y.get();
                e0a.c0 c0Var = (e0a.c0) hVar.C.get();
                e0a.e eVar9 = (e0a.e) hVar.K.get();
                e0a.r rVar = (e0a.r) hVar.O.get();
                e0a.m mVar = (e0a.m) hVar.U.get();
                f0a.c cVar8 = (f0a.c) hVar.Y.get();
                i0a.b bVar7 = (i0a.b) hVar.f231179a0.get();
                i0a.c cVar9 = new i0a.c();
                g81.a aVarC = cVar.Q.c();
                vc.s.j(aVarC);
                b81.c cVarB = cVar.Q.b();
                wu9.h hVar3 = (wu9.h) cVar.F.o.get();
                vc.s.j(hVar3);
                qu9.b bVar8 = (qu9.b) hVar.A.get();
                rp0.l0 l0Var2 = (rp0.l0) hVar.N.get();
                kbb.c cVarC = cVar7.c();
                com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) cVar7.f231129b).c();
                vc.s.j(aVarC2);
                return new com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d(bVar6, iVar, pVar, lVar, b0Var, aVar20, c0Var, eVar9, rVar, mVar, cVar8, bVar7, cVar9, aVarC, cVarB, hVar3, bVar8, l0Var2, new k7i.i(cVarC, aVarC2), hVar.f, (cli.n) hVar.g0.get());
            case 51:
                oz9.c cVar10 = hVar.f231185g;
                oz9.c cVar11 = hVar.f231185g;
                nu9.a aVar21 = cVar10.F;
                ru9.o oVar2 = (ru9.o) aVar21.f219245t.get();
                vc.s.j(oVar2);
                ru9.l0 l0Var3 = (ru9.l0) aVar21.f219244s.get();
                vc.s.j(l0Var3);
                du9.b bVarA2 = aVar21.a();
                vc.s.j(bVarA2);
                j0a.d dVar4 = new j0a.d(oVar2, l0Var3, bVarA2, new j0a.a());
                nu9.a aVar22 = cVar11.F;
                q8b.a aVar23 = cVar11.P;
                du9.b bVarA3 = aVar22.a();
                vc.s.j(bVarA3);
                j0a.a aVar24 = new j0a.a();
                n8b.a aVarA5 = aVar23.a();
                vc.s.j(aVarA5);
                k0a.c cVar12 = new k0a.c();
                dl3.f fVarC2 = cVar11.k.c();
                vc.s.j(fVarC2);
                j0a.b bVar9 = new j0a.b(fVarC2);
                gte.a aVarB3 = cVar11.f231133j.b();
                vc.s.j(aVarB3);
                k0a.b bVar10 = new k0a.b(aVarA5, cVar12, bVar9, aVarB3, new j0a.c());
                n8b.a aVarA6 = aVar23.a();
                vc.s.j(aVarA6);
                j0a.e eVar10 = new j0a.e(bVarA3, aVar24, bVar10, new k0a.a(aVarA6));
                j0a.f fVar2 = new j0a.f();
                j0a.g gVar3 = new j0a.g();
                j0a.h hVar4 = new j0a.h();
                dl3.f fVarC3 = cVar11.k.c();
                vc.s.j(fVarC3);
                return new com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.e(dVar4, eVar10, fVar2, gVar3, hVar4, new j0a.i(new j0a.b(fVarC3), new j0a.c()));
            case 52:
                hVar.getClass();
                return new vz9.l(new nd.l(new vz9.m()));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        oz9.c cVar = (oz9.c) this.f230167b;
        oz9.h hVar = (oz9.h) this.d;
        int i = this.f230168c;
        switch (i) {
            case 0:
                g6k.e eVar = (g6k.e) hVar.f231189l.get();
                gsi.d.a(eVar);
                return eVar;
            case 1:
                return new g6k.e((j60.a) hVar.i.get(), (g6k.f) hVar.k.get());
            case 2:
                return gsi.d.D((com.revolut.kompot.navigable.a) hVar.f231186h.get(), kxa.j.o(new nji.b()));
            case 3:
                ytf.a aVar = cVar.f231139r;
                pqi.a aVar2 = cVar.u;
                tv9.a aVar3 = cVar.f231135m;
                utf.a aVarA = aVar.a();
                vc.s.j(aVarA);
                vv9.a aVarA2 = ((s6k.b) aVar3).a();
                vc.s.j(aVarA2);
                vv9.b bVarB = ((s6k.b) aVar3).b();
                vc.s.j(bVarB);
                wv9.c cVarD = ((s6k.b) aVar3).d();
                vc.s.j(cVarD);
                bqf.g gVarF = cVar.f231132h.f();
                zof.f fVarD = cVar.f231140s.d();
                vc.s.j(fVarD);
                i5k.a aVar4 = (i5k.a) hVar.f231188j.get();
                gte.a aVarB = cVar.f231133j.b();
                vc.s.j(aVarB);
                return new g6k.r(aVarA, aVarA2, bVarB, cVarD, gVarF, fVarD, aVar4, aVarB, aVar2.e(), (j60.a) hVar.i.get(), aVar2.g());
            case 4:
                l80.h hVarV = cVar.f231141t.v();
                vc.s.j(hVarV);
                return new i5k.d(hVarV);
            case 5:
                return gsi.d.h((j60.a) hVar.i.get());
            case 6:
                Object impl = (j60.a) hVar.o.get();
                i7k.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(impl, "impl");
                yji.d dVar = (yji.d) impl;
                vc.s.k(dVar);
                return dVar;
            case 7:
                return hy1.g.B((com.revolut.kompot.navigable.a) hVar.f231186h.get(), kxa.j.o(new nji.b()));
            case 8:
                n60.b bVar = (n60.b) hVar.f231193q.get();
                o5k.i.m(bVar);
                return bVar;
            case 9:
                return o5k.i.r((com.revolut.kompot.navigable.a) hVar.f231186h.get());
            case 10:
                n60.a aVar5 = (n60.a) hVar.f231195s.get();
                o5k.i.l(aVar5);
                return aVar5;
            case 11:
                return o5k.i.q((com.revolut.kompot.navigable.a) hVar.f231186h.get());
            case 12:
                j9i.d extension = (j9i.d) hVar.v.get();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 13:
                o9i.a aVar6 = hVar.f231180b;
                oz9.c cVar2 = hVar.f231185g;
                o9i.c cVar3 = hVar.d;
                o9i.b bVar2 = hVar.f231182c;
                Retrofit retrofitF = ((nj0.d) cVar2.G).f();
                o5k.i.x(retrofitF);
                q9i.d dVarE = o5k.i.e(aVar6, o5k.i.c(bVar2, o5k.i.y(cVar3, retrofitF), new l9i.a(), new p9i.a()));
                Retrofit retrofitF2 = ((nj0.d) cVar2.G).f();
                o5k.i.x(retrofitF2);
                return jr9.h.w(new r9i.e(new q9i.b(dVarE, o5k.i.f(aVar6, o5k.i.d(bVar2, o5k.i.y(cVar3, retrofitF2), new l9i.a(), new p9i.a()))), new r9i.a()), hVar.e, (j9i.a) hVar.u.get());
            case 14:
                return a0a.f.a();
            case 15:
                return kxa.j.k((j60.a) hVar.f231199y.get());
            case 16:
                return ehe.n.s((com.revolut.kompot.navigable.a) hVar.f231186h.get(), (rp0.m) hVar.f231198x.get());
            case 17:
                return new rp0.m();
            case 18:
                qu9.b extension2 = (qu9.b) hVar.A.get();
                a0a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                vc.s.k(extension2);
                return extension2;
            case 19:
                qu9.a factory = (qu9.a) cVar.F.f219246w.get();
                vc.s.j(factory);
                a0a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return new qu9.b(factory.f249275a, factory.f249276b, factory.f249277c);
            case 20:
                e0a.c0 extension3 = (e0a.c0) hVar.C.get();
                a0a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension3, "extension");
                vc.s.k(extension3);
                return extension3;
            case 21:
                iz9.e eVar2 = (iz9.e) cVar.V.get();
                tx9.f fVarC = cVar.D.c();
                vc.s.j(fVarC);
                PeerToPeerChatScreenContract$InputData peerToPeerChatScreenContract$InputData = hVar.f;
                pu9.b bVar3 = (pu9.b) cVar.F.B.get();
                vc.s.j(bVar3);
                return new e0a.c0(eVar2, fVarC, peerToPeerChatScreenContract$InputData, bVar3);
            case 22:
                e0a.l extension4 = (e0a.l) hVar.E.get();
                a0a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension4, "extension");
                vc.s.k(extension4);
                return extension4;
            case 23:
                return new e0a.l((j9i.d) hVar.v.get(), (n60.b) hVar.f231193q.get(), cVar.i.a());
            case 24:
                e0a.b0 extension5 = (e0a.b0) hVar.H.get();
                a0a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension5, "extension");
                vc.s.k(extension5);
                return extension5;
            case 25:
                nu9.a aVar7 = cVar.F;
                nu9.a aVar8 = cVar.F;
                iu9.b bVar4 = (iu9.b) aVar7.u.get();
                vc.s.j(bVar4);
                j60.a aVar9 = (j60.a) hVar.f231199y.get();
                iu9.a aVar10 = (iu9.a) aVar8.f219248y.get();
                vc.s.j(aVar10);
                iz9.e eVar3 = (iz9.e) cVar.V.get();
                ang.f fVarE = cVar.e.e();
                gte.a aVarB2 = cVar.f231133j.b();
                vc.s.j(aVarB2);
                pu9.c cVar4 = new pu9.c();
                lz0.g gVar = (lz0.g) hVar.G.get();
                cu9.o oVar = (cu9.o) aVar8.F.get();
                vc.s.j(oVar);
                return new e0a.b0(bVar4, aVar9, aVar10, eVar3, fVarE, aVarB2, cVar4, gVar, oVar);
            case 26:
                z70.a contextProvider = cVar.f231141t.f();
                vc.s.j(contextProvider);
                a0a.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
                lz0.g gVarC0 = jh.d.f(contextProvider.getContext()).c0();
                vc.s.k(gVarC0);
                return gVarC0;
            case 27:
                Object extension6 = (e0a.e) hVar.K.get();
                a0a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension6, "extension");
                yji.n nVar = (yji.n) extension6;
                vc.s.k(nVar);
                return nVar;
            case 28:
                return new e0a.i(hVar.f, cVar.f231138q.a(), hVar.c(), (iz9.c) cVar.S.get(), (wz9.a) hVar.J.get(), cVar.f231144y.a());
            case 29:
                ife.d dVar2 = (ife.d) cVar.z.f204992b.get();
                vc.s.j(dVar2);
                return new wz9.a(dVar2);
            case 30:
                Object extension7 = (e0a.r) hVar.O.get();
                a0a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension7, "extension");
                yji.n nVar2 = (yji.n) extension7;
                vc.s.k(nVar2);
                return nVar2;
            case 31:
                nu9.a aVar11 = cVar.F;
                nu9.a aVar12 = cVar.F;
                cu9.n nVar3 = (cu9.n) aVar11.v.get();
                vc.s.j(nVar3);
                j60.a aVar13 = (j60.a) hVar.f231199y.get();
                k61.a aVarE = cVar.f231136n.e();
                vc.s.j(aVarE);
                p7k.b bVar5 = new p7k.b();
                g1 g1Var = (g1) hVar.M.get();
                c70.a aVarZ = cVar.f231141t.z();
                vc.s.j(aVarZ);
                iz9.e eVar4 = (iz9.e) cVar.V.get();
                du9.b bVarA = aVar12.a();
                vc.s.j(bVarA);
                rp0.l0 l0Var = (rp0.l0) hVar.N.get();
                lv9.d dVarD = cVar.f231128a.d();
                vc.s.j(dVarD);
                wu9.c cVar5 = (wu9.c) aVar12.E.get();
                vc.s.j(cVar5);
                return new e0a.w(nVar3, aVar13, aVarE, bVar5, g1Var, aVarZ, eVar4, bVarA, l0Var, dVarD, cVar5, ((s41.a) cVar.J).d(), new vz9.o((iz9.c) hVar.f231185g.S.get()), hVar.f);
            case 32:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) hVar.f231186h.get();
                a0a.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return x0.a(g1.Companion, controller.D2());
            case 33:
                com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) hVar.f231186h.get();
                a0a.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller2, "controller");
                return new rp0.l0(controller2.m2());
            case 34:
                Object extension8 = (e0a.m) hVar.U.get();
                a0a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension8, "extension");
                yji.n nVar4 = (yji.n) extension8;
                vc.s.k(nVar4);
                return nVar4;
            case 35:
                g6k.a aVar14 = (g6k.a) hVar.k.get();
                h7k.a aVar15 = (h7k.a) hVar.R.get();
                k61.a aVarE2 = cVar.f231136n.e();
                vc.s.j(aVarE2);
                return new e0a.q(aVar14, aVar15, aVarE2, new p7k.b(), (g0a.a) hVar.S.get(), (h0a.c) hVar.T.get(), ((s41.a) cVar.J).d());
            case 36:
                j60.a aVar16 = (j60.a) hVar.o.get();
                k61.a aVarE3 = cVar.f231136n.e();
                vc.s.j(aVarE3);
                return new h7k.i(aVar16, aVarE3, new j7k.a(), cVar.u.e(), (f01.a) hVar.Q.get());
            case 37:
                return hy1.g.u((com.revolut.kompot.navigable.a) hVar.f231186h.get());
            case 38:
                g0a.h hVar2 = new g0a.h();
                tbk.e eVar5 = (tbk.e) cVar.K.u.get();
                vc.s.j(eVar5);
                iz9.e eVar6 = (iz9.e) cVar.V.get();
                j60.a aVar17 = (j60.a) hVar.f231199y.get();
                wj0.a aVarI = ((nj0.d) cVar.G).i();
                vc.s.j(aVarI);
                return new g0a.g(hVar2, eVar5, eVar6, aVar17, aVarI);
            case 39:
                return new h0a.e(new h0a.b(((k3) hVar.f231185g.L).b()), cVar.M.b(), (iz9.e) cVar.V.get());
            case 40:
                Object extension9 = (g0a.a) hVar.S.get();
                a0a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension9, "extension");
                yji.n nVar5 = (yji.n) extension9;
                vc.s.k(nVar5);
                return nVar5;
            case 41:
                Object extension10 = (h0a.c) hVar.T.get();
                a0a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension10, "extension");
                yji.n nVar6 = (yji.n) extension10;
                vc.s.k(nVar6);
                return nVar6;
            case 42:
                f0a.c extension11 = (f0a.c) hVar.Y.get();
                a0a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension11, "extension");
                vc.s.k(extension11);
                return extension11;
            case 43:
                return new f0a.c(new f0a.b(), (j60.a) hVar.f231199y.get(), ((c21.b) cVar.N).c(), cVar.k.f());
            case 44:
                i0a.b extension12 = (i0a.b) hVar.f231179a0.get();
                a0a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension12, "extension");
                vc.s.k(extension12);
                return extension12;
            case 45:
                iz9.e eVar7 = (iz9.e) cVar.V.get();
                qz9.g gVar2 = (qz9.g) cVar.X.get();
                wl3.u uVarF = cVar.k.f();
                l80.e eVarH = cVar.f231141t.h();
                vc.s.j(eVarH);
                hj8.a aVarA3 = cVar.O.a();
                vc.s.j(aVarA3);
                return new i0a.b(eVar7, gVar2, uVarF, eVarH, aVarA3);
            case 46:
                wz9.a extension13 = (wz9.a) hVar.J.get();
                a0a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension13, "extension");
                vc.s.k(extension13);
                return extension13;
            case 47:
                return gsi.d.b((g6k.f) hVar.k.get());
            case 48:
                i5k.a aVar18 = (i5k.a) hVar.f231188j.get();
                j5k.b.a(aVar18);
                return aVar18;
            case 49:
                Object extension14 = (h7k.a) hVar.R.get();
                i7k.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension14, "extension");
                yji.n nVar7 = (yji.n) extension14;
                vc.s.k(nVar7);
                return nVar7;
            case 50:
                oz9.c cVar6 = hVar.f231185g;
                oz9.c cVar7 = hVar.f231185g;
                iz9.e eVar8 = (iz9.e) cVar6.V.get();
                hu9.a aVar19 = (hu9.a) cVar6.F.f219241p.get();
                vc.s.j(aVar19);
                r10.f fVar = new r10.f(aVar19, hVar.b());
                o7.d dVar3 = new o7.d(hVar.b());
                lv9.d dVarD2 = cVar6.f231128a.d();
                vc.s.j(dVarD2);
                c0a.b bVar6 = new c0a.b(eVar8, fVar, dVar3, dVarD2, new zjh.f(((n2a.a) cVar6.E).c()), (yz9.c) ((oz9.a) hVar.j0).d.get(), new c0a.a());
                b0a.i iVar = new b0a.i(((c21.b) cVar7.N).c(), cVar7.k.f(), (iz9.e) cVar7.V.get(), (iz9.c) cVar7.S.get());
                b0a.k kVarB = hVar.b();
                r10.v vVar = new r10.v(hVar.b(), hVar.c(), new a61.a(hVar.b(), cVar7.i.a()));
                n8b.a aVarA4 = cVar7.P.a();
                vc.s.j(aVarA4);
                mp.p pVar = new mp.p(kVarB, vVar, aVarA4);
                e0a.l lVar = (e0a.l) hVar.E.get();
                e0a.b0 b0Var = (e0a.b0) hVar.H.get();
                j60.a aVar20 = (j60.a) hVar.f231199y.get();
                e0a.c0 c0Var = (e0a.c0) hVar.C.get();
                e0a.e eVar9 = (e0a.e) hVar.K.get();
                e0a.r rVar = (e0a.r) hVar.O.get();
                e0a.m mVar = (e0a.m) hVar.U.get();
                f0a.c cVar8 = (f0a.c) hVar.Y.get();
                i0a.b bVar7 = (i0a.b) hVar.f231179a0.get();
                i0a.c cVar9 = new i0a.c();
                g81.a aVarC = cVar.Q.c();
                vc.s.j(aVarC);
                b81.c cVarB = cVar.Q.b();
                wu9.h hVar3 = (wu9.h) cVar.F.o.get();
                vc.s.j(hVar3);
                qu9.b bVar8 = (qu9.b) hVar.A.get();
                rp0.l0 l0Var2 = (rp0.l0) hVar.N.get();
                kbb.c cVarC = cVar7.c();
                com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) cVar7.f231129b).c();
                vc.s.j(aVarC2);
                return new com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d(bVar6, iVar, pVar, lVar, b0Var, aVar20, c0Var, eVar9, rVar, mVar, cVar8, bVar7, cVar9, aVarC, cVarB, hVar3, bVar8, l0Var2, new k7i.i(cVarC, aVarC2), hVar.f, (cli.n) hVar.g0.get());
            case 51:
                oz9.c cVar10 = hVar.f231185g;
                oz9.c cVar11 = hVar.f231185g;
                nu9.a aVar21 = cVar10.F;
                ru9.o oVar2 = (ru9.o) aVar21.f219245t.get();
                vc.s.j(oVar2);
                ru9.l0 l0Var3 = (ru9.l0) aVar21.f219244s.get();
                vc.s.j(l0Var3);
                du9.b bVarA2 = aVar21.a();
                vc.s.j(bVarA2);
                j0a.d dVar4 = new j0a.d(oVar2, l0Var3, bVarA2, new j0a.a());
                nu9.a aVar22 = cVar11.F;
                q8b.a aVar23 = cVar11.P;
                du9.b bVarA3 = aVar22.a();
                vc.s.j(bVarA3);
                j0a.a aVar24 = new j0a.a();
                n8b.a aVarA5 = aVar23.a();
                vc.s.j(aVarA5);
                k0a.c cVar12 = new k0a.c();
                dl3.f fVarC2 = cVar11.k.c();
                vc.s.j(fVarC2);
                j0a.b bVar9 = new j0a.b(fVarC2);
                gte.a aVarB3 = cVar11.f231133j.b();
                vc.s.j(aVarB3);
                k0a.b bVar10 = new k0a.b(aVarA5, cVar12, bVar9, aVarB3, new j0a.c());
                n8b.a aVarA6 = aVar23.a();
                vc.s.j(aVarA6);
                j0a.e eVar10 = new j0a.e(bVarA3, aVar24, bVar10, new k0a.a(aVarA6));
                j0a.f fVar2 = new j0a.f();
                j0a.g gVar3 = new j0a.g();
                j0a.h hVar4 = new j0a.h();
                dl3.f fVarC3 = cVar11.k.c();
                vc.s.j(fVarC3);
                return new com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.e(dVar4, eVar10, fVar2, gVar3, hVar4, new j0a.i(new j0a.b(fVarC3), new j0a.c()));
            case 52:
                hVar.getClass();
                return new vz9.l(new nd.l(new vz9.m()));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object g() {
        ozj.b bVar = (ozj.b) this.f230167b;
        ozj.a aVar = (ozj.a) this.d;
        int i = this.f230168c;
        switch (i) {
            case 0:
                return new tpi.i((rpi.c) aVar.f231360c.get(), gsi.c.a(aVar.f231358a));
            case 1:
                return new rpi.b(bq.i.b(aVar.f231358a));
            case 2:
                return new rpi.h(bq.i.b(aVar.f231358a));
            case 3:
                return new k3l.d(bq.i.b(aVar.f231358a));
            case 4:
                return new cqi.j(bq.i.f(aVar.f231358a));
            case 5:
                return new en.c(ImmutableSet.of((ln.d) aVar.f231359b.f231372j.get()), bq.i.l(aVar.f231358a));
            case 6:
                return new iri.g((iri.j) bVar.i.get(), (iri.m) bVar.k.get(), bq.i.f(aVar.f231358a), bq.i.l(aVar.f231358a));
            case 7:
                return new iri.l((iri.m) bVar.k.get(), bq.i.f(aVar.f231358a), (iri.d) aVar.f231363j.get());
            case 8:
                return new iri.d(bq.i.f(aVar.f231358a));
            case 9:
                return new nzj.o((tpi.j) aVar.d.get(), (k3l.b) aVar.f.get(), (mzj.b) aVar.f231365m.get(), (nzj.c) bVar.f231374m.get(), (nzj.i) bVar.f231375n.get(), bq.i.d(aVar.f231358a));
            case 10:
                e4m.e eVar = aVar.f231361g;
                ozj.b bVar2 = aVar.f231359b;
                cqi.h hVar = (cqi.h) eVar.get();
                f9b.f fVar = (f9b.f) aVar.f231364l.get();
                mzj.a aVar2 = (mzj.a) bVar.f231373l.get();
                nzj.c cVar = (nzj.c) bVar.f231374m.get();
                efk.a aVar3 = bVar2.f231367a;
                ffk.t tVarF = aVar3.f();
                vc.s.j(tVarF);
                ffk.j jVarG = aVar3.g();
                vc.s.j(jVarG);
                mt8.d dVarB = bVar2.f231369c.b();
                vc.s.j(dVarB);
                al2.a aVar4 = new al2.a();
                qd0.b bVarN = bVar2.e.n();
                vc.s.j(bVarN);
                zyj.a aVarA = ezj.n.a();
                wtc.x xVar = new wtc.x();
                gte.a aVarB = bVar2.d.b();
                vc.s.j(aVarB);
                hzj.m mVar = new hzj.m(new hzj.e(aVar4, bVarN, aVarA, xVar, aVarB), ezj.n.a());
                l61.a aVarB2 = bVar2.f.b();
                vc.s.j(aVarB2);
                a5h.g gVar = new a5h.g(tVarF, jVarG, dVarB, mVar, aVarB2);
                zj2.a aVar5 = new zj2.a();
                gte.a aVarB3 = bVar2.d.b();
                vc.s.j(aVarB3);
                return new mzj.n(hVar, fVar, aVar2, cVar, gVar, new mzj.g(aVar5, aVarB3));
            case 11:
                return bq.i.t(aVar.f231358a);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object h() {
        p12.d dVar = (p12.d) this.f230167b;
        p12.f fVar = (p12.f) this.d;
        int i = this.f230168c;
        switch (i) {
            case 0:
                return f60.i.a((e60.a) fVar.f231649l.get());
            case 1:
                com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) fVar.e.get();
                g60.a aVarA = f60.e.a((com.revolut.kompot.navigable.a) fVar.e.get());
                Activity activityA = f60.b.a((com.revolut.kompot.navigable.a) fVar.e.get());
                t80.b bVarJ = fVar.j();
                com.revolut.kompot.navigable.a aVar2 = (com.revolut.kompot.navigable.a) fVar.e.get();
                f60.h.a(aVar2);
                d4m.a aVarA2 = e4m.b.a(fVar.f);
                nli.a aVar3 = new nli.a((t80.c) fVar.f231646g.get(), f60.b.a((com.revolut.kompot.navigable.a) fVar.e.get()));
                t80.b bVarJ2 = fVar.j();
                zk0.b bVarL = fVar.f231644b.f231629a.l();
                vc.s.j(bVarL);
                return f60.j.a(aVar, new t80.v(aVarA, activityA, bVarJ, aVar2, aVarA2, aVar3, new oli.c(bVarJ2, bVarL, new nli.a((t80.c) fVar.f231646g.get(), f60.b.a((com.revolut.kompot.navigable.a) fVar.e.get())), f60.e.a((com.revolut.kompot.navigable.a) fVar.e.get()), fVar.s()), new oli.g(f60.d.a(f60.b.a((com.revolut.kompot.navigable.a) fVar.e.get())), pli.b.a(f60.d.a(f60.b.a((com.revolut.kompot.navigable.a) fVar.e.get()))), new ami.n(e4m.b.a(fVar.f231647h), 1), e4m.b.a(fVar.f), fVar.j(), new nli.a((t80.c) fVar.f231646g.get(), f60.b.a((com.revolut.kompot.navigable.a) fVar.e.get())), new i90.b(), fVar.q(), fVar.s()), fVar.s()), f60.g.a(), (rp0.m) fVar.i.get(), (e60.t) fVar.k.get(), new nji.b());
            case 2:
                com.revolut.kompot.navigable.a aVar4 = (com.revolut.kompot.navigable.a) fVar.e.get();
                f60.h.a(aVar4);
                return pli.c.a(new ks0.n(aVar4));
            case 3:
                return n32.o.a();
            case 4:
                return t96.a.a();
            case 5:
                return f60.c.a();
            case 6:
                aii.o oVar = (aii.o) fVar.f231648j.get();
                y80.a aVarR = dVar.f231629a.r();
                vc.s.j(aVarR);
                return new e60.y(oVar, aVarR, fVar.q(), Optional.empty());
            case 7:
                e60.t tVar = (e60.t) fVar.k.get();
                f60.f.a(tVar);
                return tVar;
            case 8:
                return new com.revolut.feature.apm.core.ui.impl.ui.qr.pager.a(fVar.f231643a, (e60.a) fVar.f231649l.get(), (cli.n) fVar.o.get());
            case 9:
                return new qee.s((n32.i) dVar.f231633h.get());
            case 10:
                return n32.p.a();
            case 11:
                return new n32.g((e60.a) fVar.f231649l.get(), new uc.d((xq2.d) fVar.f231653q.get(), fVar.f231644b.d.e(), new ar2.e(), new zq2.k(), new zq2.j()));
            case 12:
                return n32.n.a();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object i() {
        p12.g gVar = (p12.g) this.d;
        int i = this.f230168c;
        switch (i) {
            case 0:
                return f60.i.a((e60.a) gVar.f231665l.get());
            case 1:
                com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) gVar.e.get();
                g60.a aVarA = f60.e.a((com.revolut.kompot.navigable.a) gVar.e.get());
                Activity activityA = f60.b.a((com.revolut.kompot.navigable.a) gVar.e.get());
                t80.b bVarC = gVar.c();
                com.revolut.kompot.navigable.a aVar2 = (com.revolut.kompot.navigable.a) gVar.e.get();
                f60.h.a(aVar2);
                d4m.a aVarA2 = e4m.b.a(gVar.f);
                nli.a aVar3 = new nli.a((t80.c) gVar.f231662g.get(), f60.b.a((com.revolut.kompot.navigable.a) gVar.e.get()));
                t80.b bVarC2 = gVar.c();
                zk0.b bVarL = gVar.f231660b.f231629a.l();
                vc.s.j(bVarL);
                return f60.j.a(aVar, new t80.v(aVarA, activityA, bVarC, aVar2, aVarA2, aVar3, new oli.c(bVarC2, bVarL, new nli.a((t80.c) gVar.f231662g.get(), f60.b.a((com.revolut.kompot.navigable.a) gVar.e.get())), f60.e.a((com.revolut.kompot.navigable.a) gVar.e.get()), gVar.q()), new oli.g(f60.d.a(f60.b.a((com.revolut.kompot.navigable.a) gVar.e.get())), pli.b.a(f60.d.a(f60.b.a((com.revolut.kompot.navigable.a) gVar.e.get()))), new ami.n(e4m.b.a(gVar.f231663h), 1), e4m.b.a(gVar.f), gVar.c(), new nli.a((t80.c) gVar.f231662g.get(), f60.b.a((com.revolut.kompot.navigable.a) gVar.e.get())), new i90.b(), gVar.j(), gVar.q()), gVar.q()), f60.g.a(), (rp0.m) gVar.i.get(), (e60.t) gVar.k.get(), new nji.b());
            case 2:
                com.revolut.kompot.navigable.a aVar4 = (com.revolut.kompot.navigable.a) gVar.e.get();
                f60.h.a(aVar4);
                return pli.c.a(new ks0.n(aVar4));
            case 3:
                return n32.o.a();
            case 4:
                return t96.a.a();
            case 5:
                return f60.c.a();
            case 6:
                aii.o oVar = (aii.o) gVar.f231664j.get();
                y80.a aVarR = ((p12.d) this.f230167b).f231629a.r();
                vc.s.j(aVarR);
                return new e60.y(oVar, aVarR, gVar.j(), Optional.empty());
            case 7:
                e60.t tVar = (e60.t) gVar.k.get();
                f60.f.a(tVar);
                return tVar;
            case 8:
                return new com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.a(gVar.f231659a, (e60.a) gVar.f231665l.get());
            case 9:
                return n32.p.a();
            case 10:
                return new n32.g((e60.a) gVar.f231665l.get(), new uc.d((xq2.d) gVar.f231668p.get(), gVar.f231660b.d.e(), new ar2.e(), new zq2.k(), new zq2.j()));
            case 11:
                return n32.n.a();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object j() {
        p12.d dVar = (p12.d) this.f230167b;
        l70.e eVar = dVar.f231629a;
        p12.i iVar = (p12.i) this.d;
        int i = this.f230168c;
        if (i == 0) {
            c70.a aVarZ = eVar.z();
            vc.s.j(aVarZ);
            return new q32.k(aVarZ, dVar.f231631c.e(), (cli.n) iVar.e.get(), iVar.f231681c);
        }
        if (i == 1) {
            return new q32.n(eVar.d(), (c90.c) iVar.d.get());
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        ViewController controller = iVar.f231680b;
        r32.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new c90.c(controller.m2());
    }

    private final Object k() {
        p12.d dVar = (p12.d) this.f230167b;
        l70.e eVar = dVar.f231629a;
        p12.i iVar = (p12.i) this.d;
        int i = this.f230168c;
        if (i == 0) {
            c70.a aVarZ = eVar.z();
            vc.s.j(aVarZ);
            return new q32.k(aVarZ, dVar.f231631c.e(), (cli.n) iVar.e.get(), iVar.f231681c);
        }
        if (i == 1) {
            return new q32.n(eVar.d(), (c90.c) iVar.d.get());
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        ViewController controller = iVar.f231680b;
        r32.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new c90.c(controller.m2());
    }

    private final Object l() {
        p12.r rVar = (p12.r) this.d;
        int i = this.f230168c;
        switch (i) {
            case 0:
                return f0k.d.p((e60.a) rVar.k.get());
            case 1:
                com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) rVar.d.get();
                g60.a aVarA = f60.v.a((com.revolut.kompot.navigable.a) rVar.d.get());
                Activity activityA = f60.t.a((com.revolut.kompot.navigable.a) rVar.d.get());
                t80.b bVarB = rVar.b();
                com.revolut.kompot.navigable.a aVar2 = (com.revolut.kompot.navigable.a) rVar.d.get();
                f60.y.a(aVar2);
                d4m.a aVarA2 = e4m.b.a(rVar.e);
                nli.a aVar3 = new nli.a((t80.c) rVar.f.get(), f60.t.a((com.revolut.kompot.navigable.a) rVar.d.get()));
                t80.b bVarB2 = rVar.b();
                zk0.b bVarL = rVar.f231750b.o.l();
                vc.s.j(bVarL);
                return v1.c.q(aVar, new t80.v(aVarA, activityA, bVarB, aVar2, aVarA2, aVar3, new oli.c(bVarB2, bVarL, new nli.a((t80.c) rVar.f.get(), f60.t.a((com.revolut.kompot.navigable.a) rVar.d.get())), f60.v.a((com.revolut.kompot.navigable.a) rVar.d.get()), rVar.j()), new oli.g(f60.u.a(f60.t.a((com.revolut.kompot.navigable.a) rVar.d.get())), v1.c.e((com.revolut.kompot.navigable.a) rVar.d.get()), new ami.n(e4m.b.a(rVar.f231752g), 1), e4m.b.a(rVar.e), rVar.b(), new nli.a((t80.c) rVar.f.get(), f60.t.a((com.revolut.kompot.navigable.a) rVar.d.get())), new i90.b(), rVar.c(), rVar.j()), rVar.j()), f60.x.a(), (rp0.m) rVar.f231753h.get(), (e60.t) rVar.f231754j.get());
            case 2:
                com.revolut.kompot.navigable.a aVar4 = (com.revolut.kompot.navigable.a) rVar.d.get();
                f60.y.a(aVar4);
                return pli.c.a(new ks0.n(aVar4));
            case 3:
                c22.b.Companion.getClass();
                return new t80.c(new e.a("APM"), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
            case 4:
                return t96.a.a();
            case 5:
                return f60.z.a();
            case 6:
                aii.o oVar = (aii.o) rVar.i.get();
                y80.a aVarR = ((p12.v) this.f230167b).o.r();
                vc.s.j(aVarR);
                return new e60.y(oVar, aVarR, rVar.c(), Optional.empty());
            case 7:
                e60.t tVar = (e60.t) rVar.f231754j.get();
                f60.w.a(tVar);
                return tVar;
            case 8:
                return new b22.m((e60.a) rVar.k.get(), rVar.f231749a, (cli.n) rVar.f231757n.get());
            case 9:
                return new b22.n();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object m() {
        int i = this.f230168c;
        if (i == 0) {
            return new j32.g((sri.m) ((p12.v) this.f230167b).P.get(), (cli.n) ((p12.t) this.d).f231766a.get());
        }
        if (i == 1) {
            return new j32.h();
        }
        throw new AssertionError(i);
    }

    private final Object n() {
        int i = this.f230168c;
        if (i == 0) {
            p12.u uVar = (p12.u) this.d;
            return new l32.h(uVar.f231771a, (tak.d) uVar.f231772b.get());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        oz1.c cVar = (oz1.c) ((lz1.m) ((p12.v) this.f230167b).e).A.get();
        vc.s.j(cVar);
        return new l32.e(cVar);
    }

    private final Object o() {
        p12.y yVar = (p12.y) this.d;
        p12.v vVar = (p12.v) this.f230167b;
        int i = this.f230168c;
        if (i == 0) {
            Object extension = yVar.f231822a;
            p22.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            yji.n nVar = (yji.n) extension;
            vc.s.k(nVar);
            return nVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new AssertionError(i);
            }
            p22.b.Companion.getClass();
            return new zzl.c();
        }
        ApmNewAliasNavigation$InputData apmNewAliasNavigation$InputData = yVar.f231823b;
        com.revolut.feature.apm.core.ui.api.navigation.a aVar = yVar.f231822a;
        v02.c cVarC = vVar.f231786p.c();
        vc.s.j(cVarC);
        z80.b bVarS = vVar.o.s();
        vc.s.j(bVarS);
        ang.f fVarE = vVar.H.e();
        e4m.e eVar = vVar.O;
        z80.b bVarS2 = yVar.f231824c.o.s();
        vc.s.j(bVarS2);
        return new o22.n(apmNewAliasNavigation$InputData, aVar, cVarC, bVarS, fVarE, eVar, new o22.p(bVarS2, (zzl.b) yVar.e.get()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object p() {
        p12.v vVar = (p12.v) this.f230167b;
        p12.z zVar = (p12.z) this.d;
        c12.f extension = zVar.f231827a;
        p12.v vVar2 = zVar.f231829c;
        int i = this.f230168c;
        if (i == 0) {
            r22.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            yji.n nVar = (yji.n) extension;
            vc.s.k(nVar);
            return nVar;
        }
        if (i != 1) {
            if (i == 2) {
                r22.b.Companion.getClass();
                return new zzl.c();
            }
            if (i != 3) {
                throw new AssertionError(i);
            }
            ApmNewContactNavigation$InputData apmNewContactNavigation$InputData = zVar.f231828b;
            z80.b bVarS = vVar2.o.s();
            vc.s.j(bVarS);
            return new q22.o(apmNewContactNavigation$InputData, new utk.f(extension, bVarS, (zzl.b) zVar.e.get()));
        }
        ApmNewContactNavigation$InputData apmNewContactNavigation$InputData2 = zVar.f231828b;
        lx1.c cVar = (lx1.c) ((ey1.e) vVar2.f).z.get();
        vc.s.j(cVar);
        z80.b bVarS2 = vVar2.o.s();
        vc.s.j(bVarS2);
        kge.d dVar = new kge.d(cVar, bVarS2);
        c12.f fVar = zVar.f231827a;
        kz9.a aVarA = vVar2.f231790t.a();
        vc.s.j(aVarA);
        return new com.revolut.feature.apm.core.ui.impl.ui.new_contact.a(apmNewContactNavigation$InputData2, dVar, fVar, new s22.b(fVar, aVarA), (pn3.a) vVar.N.get(), vVar.O, (zzl.b) zVar.e.get(), (cli.n) zVar.f.get());
    }

    private final Object q() {
        p12.v vVar = (p12.v) this.f230167b;
        p12.c0 c0Var = (p12.c0) this.d;
        p12.v vVar2 = c0Var.f231627b;
        int i = this.f230168c;
        if (i == 0) {
            d2a.a model = (d2a.a) c0Var.f231628c.get();
            a42.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(model, "model");
            vc.s.k(model);
            return model;
        }
        if (i == 1) {
            p2a.a factory = vVar.B.a();
            vc.s.j(factory);
            a42.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(factory, "factory");
            return factory.a();
        }
        if (i != 2) {
            if (i != 3) {
                throw new AssertionError(i);
            }
            m3j.j jVarD = b3j.p.d();
            b6k.c cVar = new b6k.c();
            yof.a aVarA = vVar2.u.a();
            vc.s.j(aVarA);
            m3j.h hVarB = ((b3j.p) vVar2.E).b();
            whf.n nVarB = vVar2.f231793y.b();
            vc.s.j(nVarB);
            b42.b bVar = new b42.b(cVar, aVarA, hVarB, new b42.d(nVarB), new r2a.b(), vVar2.F.a());
            z80.b bVarS = vVar.o.s();
            vc.s.j(bVarS);
            return new bof.r(jVarD, bVar, bVarS);
        }
        djf.c cVar2 = vVar2.f231793y;
        lx1.b bVar2 = vVar2.f;
        uw1.b bVar3 = vVar2.e;
        whf.b bVarA = cVar2.a();
        vc.s.j(bVarA);
        r10.a aVarA2 = vVar2.a();
        lz1.m mVar = (lz1.m) bVar3;
        yw1.a aVar = (yw1.a) mVar.D.get();
        vc.s.j(aVar);
        iz1.l lVar = (iz1.l) mVar.J.get();
        vc.s.j(lVar);
        ey1.e eVar = (ey1.e) bVar2;
        lx1.d dVarB = eVar.b();
        vc.s.j(dVarB);
        lx1.i iVarD = eVar.d();
        vc.s.j(iVarD);
        z32.h hVar = new z32.h(bVarA, aVarA2, aVar, lVar, dVarB, iVarD, vVar2.D, ((c21.b) vVar2.f231785n).a());
        lx1.i iVarD2 = ((ey1.e) vVar.f).d();
        vc.s.j(iVarD2);
        return new com.revolut.feature.apm.core.ui.impl.ui.recipients.details.a(hVar, iVarD2, (d2a.a) c0Var.f231628c.get(), c0Var.f231626a, (cli.n) c0Var.e.get());
    }

    @Override // phm.a
    public final Object get() {
        Object uVar;
        Object yVar;
        Object gVar;
        Object yVar2;
        Object cVar;
        switch (this.f230166a) {
            case 0:
                t tVar = (t) this.f230167b;
                x xVar = (x) this.d;
                CvvScreenContract$InputData cvvScreenContract$InputData = xVar.f230170b;
                int i = this.f230168c;
                if (i == 0) {
                    return new oxe.n((cli.n) xVar.f230171c.get(), cvvScreenContract$InputData, (y51.a) tVar.U.get());
                }
                if (i != 1) {
                    throw new AssertionError(i);
                }
                n8b.a aVarA = tVar.E.a();
                vc.s.j(aVarA);
                return new oxe.p(cvvScreenContract$InputData, aVarA);
            case 1:
                t tVar2 = (t) this.f230167b;
                x xVar2 = (x) this.d;
                CvvScreenContract$InputData cvvScreenContract$InputData2 = xVar2.f230170b;
                int i2 = this.f230168c;
                if (i2 == 0) {
                    return new oxe.n((cli.n) xVar2.f230171c.get(), cvvScreenContract$InputData2, (y51.a) tVar2.U.get());
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                n8b.a aVarA2 = tVar2.E.a();
                vc.s.j(aVarA2);
                return new oxe.p(cvvScreenContract$InputData2, aVarA2);
            case 2:
                d0 d0Var = (d0) this.f230167b;
                b0 b0Var = (b0) this.d;
                int i3 = this.f230168c;
                switch (i3) {
                    case 0:
                        return agk.b.B(b0Var.f230030a, (zfk.c) b0Var.f230034h.get(), (xfk.b) b0Var.e.get(), (bgk.a) b0Var.f.get(), (wfk.a) b0Var.f230033g.get(), (bgk.a) b0Var.i.get());
                    case 1:
                        agk.a aVar = b0Var.f230030a;
                        mhk.a aVarC = d0Var.f230048a.c();
                        vc.s.j(aVarC);
                        return y3.C(aVar, aVarC, (xfk.b) b0Var.e.get(), (bgk.a) b0Var.f.get(), (wfk.a) b0Var.f230033g.get());
                    case 2:
                        agk.a aVar2 = b0Var.f230030a;
                        fhk.a aVarB = d0Var.f230048a.b();
                        vc.s.j(aVarB);
                        return y3.b(aVar2, aVarB);
                    case 3:
                        agk.a aVar3 = b0Var.f230030a;
                        ohk.a aVarD = d0Var.f230048a.d();
                        vc.s.j(aVarD);
                        return y3.D(aVar3, aVarD);
                    case 4:
                        agk.a aVar4 = b0Var.f230030a;
                        dhk.a aVarA3 = d0Var.f230048a.a();
                        vc.s.j(aVarA3);
                        return y3.z(aVar4, aVarA3);
                    case 5:
                        agk.a aVar5 = b0Var.f230030a;
                        ohk.a aVarD2 = d0Var.f230048a.d();
                        vc.s.j(aVarD2);
                        return agk.b.y(aVar5, aVarD2);
                    case 6:
                        CheckoutFlowContract$InputData checkoutFlowContract$InputData = b0Var.f230031b;
                        d0 d0Var2 = b0Var.f230032c;
                        rwe.a aVar6 = (rwe.a) b0Var.k.get();
                        wwe.a aVar7 = (wwe.a) b0Var.f230036l.get();
                        u51.a aVarA4 = d0Var2.f230049b.a();
                        vc.s.j(aVarA4);
                        uwe.j jVar = (uwe.j) b0Var.f230038n.get();
                        sh3.a aVarA5 = d0Var2.f230050c.a();
                        vc.s.j(aVarA5);
                        hxe.a aVar8 = new hxe.a();
                        te8.d0 d0Var3 = (te8.d0) d0Var2.k.A.get();
                        vc.s.j(d0Var3);
                        prl.e eVar = new prl.e(aVarA4, jVar, aVarA5, new hxe.b(aVar8, new fmc.z(d0Var3)));
                        je6.h hVarC = ((xf6.t) d0Var2.f230054l).c();
                        vc.s.j(hVarC);
                        com.revolut.feature.topup_screen.impl.flows.topup.flow.data.h hVar = new com.revolut.feature.topup_screen.impl.flows.topup.flow.data.h(hVarC, new oye.c(new sze.d(new sze.b())));
                        qve.w wVar = d0Var.f230049b;
                        t tVar3 = d0Var.e;
                        u51.a aVarA6 = wVar.a();
                        vc.s.j(aVarA6);
                        fmc.z zVar = new fmc.z(d0Var2.f230055m.a(), new sze.d(new sze.b()));
                        ph3.b bVar = (ph3.b) d0Var.f230056n.f5178p.get();
                        vc.s.j(bVar);
                        qh3.a aVar9 = (qh3.a) b0Var.o.get();
                        sh3.a aVarA7 = d0Var.f230050c.a();
                        vc.s.j(aVarA7);
                        wsg.n nVarB = d0Var.f.b();
                        wsg.n nVarB2 = d0Var2.f.b();
                        h1 h1VarN = d0Var2.f230057p.n();
                        vc.s.j(h1VarN);
                        et6.h hVar2 = (et6.h) d0Var2.f230058q.f291729t.get();
                        vc.s.j(hVar2);
                        uve.c cVar2 = new uve.c(nVarB2, h1VarN, hVar2);
                        qh3.b bVar2 = (qh3.b) b0Var.f230039p.get();
                        sf0.h hVarB = d0Var2.f230059r.b();
                        vc.s.j(hVarB);
                        zte.b bVar3 = (zte.b) d0Var2.e.f230127h0.get();
                        vc.s.j(bVar3);
                        jul.o oVar = new jul.o(hVarB, bVar3);
                        wj0.a aVarI = ((nj0.d) d0Var.f230060s).i();
                        vc.s.j(aVarI);
                        zte.b bVar4 = (zte.b) tVar3.f230127h0.get();
                        vc.s.j(bVar4);
                        twe.a aVar10 = new twe.a();
                        qd0.b languageProvider = d0Var2.f230061t.n();
                        vc.s.j(languageProvider);
                        xwe.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                        usc.a aVar11 = new usc.a(v80.b.b(languageProvider, false, false, 14));
                        qq8.b bVarD = ((oq8.a) d0Var.u).d();
                        o7.b bVar5 = new o7.b((vte.b) tVar3.l0.get());
                        xye.d dVar = new xye.d();
                        aue.d dVar2 = new aue.d();
                        com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) d0Var.v).c();
                        vc.s.j(aVarC2);
                        return new com.revolut.feature.topup_screen.impl.flows.checkout.flow.e(checkoutFlowContract$InputData, aVar6, aVar7, eVar, hVar, aVarA6, zVar, bVar, aVar9, aVarA7, nVarB, cVar2, bVar2, oVar, aVarI, bVar4, aVar10, aVar11, bVarD, bVar5, dVar, dVar2, aVarC2);
                    case 7:
                        return new rwe.a();
                    case 8:
                        return new wwe.a();
                    case 9:
                        CheckoutFlowContract$InputData checkoutFlowContract$InputData2 = b0Var.f230031b;
                        d0 d0Var4 = b0Var.f230032c;
                        twe.a aVar12 = new twe.a();
                        bi3.d dVar3 = d0Var4.f230050c;
                        sh3.a aVarA8 = dVar3.a();
                        vc.s.j(aVarA8);
                        exe.p pVar = new exe.p(aVarA8, new zjh.c(d0Var4.d.a()));
                        sh3.a aVarA9 = dVar3.a();
                        vc.s.j(aVarA9);
                        zwe.a aVar13 = (zwe.a) d0Var4.e.g0.get();
                        vc.s.j(aVar13);
                        wsg.n nVarB3 = d0Var4.f.b();
                        mt8.d dVarB = d0Var4.f230051g.b();
                        vc.s.j(dVarB);
                        q89.e eVarA = d0Var4.f230052h.a();
                        vc.s.j(eVarA);
                        ixe.a aVar14 = new ixe.a();
                        rwe.a aVar15 = (rwe.a) b0Var.k.get();
                        qwe.s sVar = (qwe.s) b0Var.f230037m.get();
                        nyb.k kVarC = d0Var4.i.c();
                        vc.s.j(kVarC);
                        uwe.g gVar2 = new uwe.g(checkoutFlowContract$InputData2, aVar12, pVar, aVarA9, aVar13, nVarB3, dVarB, eVarA, aVar14, aVar15, sVar, kVarC);
                        gte.a aVarB2 = d0Var4.f230053j.b();
                        vc.s.j(aVarB2);
                        return new uwe.j(gVar2, new hxe.d(aVarB2, d0Var4.d.a(), b0Var.f230031b));
                    case 10:
                        return new qwe.s();
                    case 11:
                        wh3.a provider = d0Var.o.a();
                        vc.s.j(provider);
                        zfk.c planSubscriberControllerModelExtension = (zfk.c) b0Var.f230034h.get();
                        xwe.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(provider, "provider");
                        Intrinsics.checkNotNullParameter(planSubscriberControllerModelExtension, "planSubscriberControllerModelExtension");
                        Intrinsics.checkNotNullParameter(planSubscriberControllerModelExtension, "planSubscriberControllerModelExtension");
                        return new wh3.i(provider.f297363c, provider.d, planSubscriberControllerModelExtension);
                    case 12:
                        wh3.a provider2 = d0Var.o.a();
                        vc.s.j(provider2);
                        xwe.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(provider2, "provider");
                        return new wh3.l(provider2.f, provider2.f297364g);
                    case 13:
                        wj0.a idempotencyKeyHolder = ((nj0.d) d0Var.f230060s).i();
                        vc.s.j(idempotencyKeyHolder);
                        l80.e dateProvider = d0Var.f230061t.h();
                        vc.s.j(dateProvider);
                        xwe.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
                        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                        return new m60.b(idempotencyKeyHolder, dateProvider, "payments_peer_to_peer_transfer");
                    default:
                        throw new AssertionError(i3);
                }
            case 3:
                ow9.a aVar16 = (ow9.a) this.f230167b;
                ow9.d dVar4 = (ow9.d) this.d;
                int i5 = this.f230168c;
                switch (i5) {
                    case 0:
                        return kxa.j.l((j60.a) dVar4.d.get());
                    case 1:
                        return h30.l.p((com.revolut.kompot.navigable.a) dVar4.f230337b.get(), (rp0.m) dVar4.f230338c.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        uVar = new epg.u((jki.p) dVar4.f230340h.get(), (cpg.a) aVar16.e.get(), (j60.a) dVar4.d.get());
                        break;
                    case 4:
                        return new anl.j((epg.m) dVar4.f230339g.get());
                    case 5:
                        qd0.b bVarN = aVar16.f230328a.n();
                        vc.s.j(bVarN);
                        uVar = new epg.f((epg.b) dVar4.f.get(), bVarN);
                        break;
                    case 6:
                        return new epg.c();
                    default:
                        throw new AssertionError(i5);
                }
                return uVar;
            case 4:
                ow9.e eVar2 = (ow9.e) this.f230167b;
                ow9.f fVar = (ow9.f) this.d;
                int i6 = this.f230168c;
                switch (i6) {
                    case 0:
                        return kxa.j.r((j60.a) fVar.f230361g.get());
                    case 1:
                        return kxa.j.p((com.revolut.kompot.navigable.a) fVar.e.get(), (rp0.m) fVar.f.get(), new j60.e());
                    case 2:
                        return new rp0.m();
                    case 3:
                        return f60.i.a((e60.a) fVar.o.get());
                    case 4:
                        com.revolut.kompot.navigable.a aVar17 = (com.revolut.kompot.navigable.a) fVar.e.get();
                        g60.a aVarA10 = f60.e.a((com.revolut.kompot.navigable.a) fVar.e.get());
                        Activity activityA = f60.b.a((com.revolut.kompot.navigable.a) fVar.e.get());
                        t80.b bVarB = fVar.b();
                        com.revolut.kompot.navigable.a aVar18 = (com.revolut.kompot.navigable.a) fVar.e.get();
                        f60.h.a(aVar18);
                        d4m.a aVarA11 = e4m.b.a(fVar.i);
                        nli.a aVar19 = new nli.a((t80.c) fVar.f230363j.get(), f60.b.a((com.revolut.kompot.navigable.a) fVar.e.get()));
                        t80.b bVarB2 = fVar.b();
                        zk0.b bVarL = fVar.f230359b.f230341a.l();
                        vc.s.j(bVarL);
                        return f60.j.a(aVar17, new t80.v(aVarA10, activityA, bVarB, aVar18, aVarA11, aVar19, new oli.c(bVarB2, bVarL, new nli.a((t80.c) fVar.f230363j.get(), f60.b.a((com.revolut.kompot.navigable.a) fVar.e.get())), f60.e.a((com.revolut.kompot.navigable.a) fVar.e.get()), fVar.j()), new oli.g(f60.d.a(f60.b.a((com.revolut.kompot.navigable.a) fVar.e.get())), pli.b.a(f60.d.a(f60.b.a((com.revolut.kompot.navigable.a) fVar.e.get()))), new ami.n(e4m.b.a(fVar.k), 1), e4m.b.a(fVar.i), fVar.b(), new nli.a((t80.c) fVar.f230363j.get(), f60.b.a((com.revolut.kompot.navigable.a) fVar.e.get())), new i90.b(), fVar.c(), fVar.j()), fVar.j()), f60.g.a(), (rp0.m) fVar.f230364l.get(), (e60.t) fVar.f230366n.get(), new nji.b());
                    case 5:
                        com.revolut.kompot.navigable.a aVar20 = (com.revolut.kompot.navigable.a) fVar.e.get();
                        f60.h.a(aVar20);
                        return pli.c.a(new ks0.n(aVar20));
                    case 6:
                        ww9.a.Companion.getClass();
                        return new t80.c(new e.a("Profile"), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
                    case 7:
                        return t96.a.a();
                    case 8:
                        return f60.c.a();
                    case 9:
                        aii.o oVar2 = (aii.o) fVar.f230365m.get();
                        y80.a aVarR = eVar2.f230341a.r();
                        vc.s.j(aVarR);
                        yVar = new e60.y(oVar2, aVarR, fVar.c(), Optional.empty());
                        return yVar;
                    case 10:
                        Object interactor = (ex1.a) ((lz1.m) eVar2.f230342b).m0.get();
                        vc.s.j(interactor);
                        ww9.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(interactor, "interactor");
                        return (yji.n) interactor;
                    case 11:
                        e60.t tVar4 = (e60.t) fVar.f230366n.get();
                        f60.f.a(tVar4);
                        return tVar4;
                    case 12:
                        PaymentProfileFlowContract$InputData paymentProfileFlowContract$InputData = fVar.f230358a;
                        vw9.o oVar3 = new vw9.o();
                        d6k.d dVar5 = (d6k.d) fVar.f230370s.get();
                        j60.a aVar21 = (j60.a) fVar.f230361g.get();
                        uw1.c cVarD = ((lz1.m) eVar2.f230342b).d();
                        vc.s.j(cVarD);
                        ex1.a aVar22 = (ex1.a) ((lz1.m) eVar2.f230342b).m0.get();
                        vc.s.j(aVar22);
                        vw9.a aVar23 = (vw9.a) fVar.f230371t.get();
                        e60.a aVar24 = (e60.a) fVar.o.get();
                        ow9.e eVar3 = fVar.f230359b;
                        q8b.a aVar25 = eVar3.f230344g;
                        n8b.a countryInteractor = aVar25.a();
                        vc.s.j(countryInteractor);
                        uw1.c apmFeatureChecker = ((lz1.m) eVar3.f230342b).d();
                        vc.s.j(apmFeatureChecker);
                        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
                        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
                        smd.s sVar2 = new smd.s();
                        sVar2.f264432a = countryInteractor;
                        sVar2.f264433b = apmFeatureChecker;
                        n8b.a aVarA12 = aVar25.a();
                        vc.s.j(aVarA12);
                        yVar = new com.revolut.feature.payments.profile.impl.ui_kompot.flow.b(paymentProfileFlowContract$InputData, oVar3, dVar5, aVar21, cVarD, aVar22, aVar23, aVar24, new kxk.o(sVar2, new com.revolut.feature.payments.profile.impl.ui_kompot.flow.c(aVarA12)));
                        return yVar;
                    case 13:
                        ang.f fVarE = eVar2.f230343c.e();
                        cu8.r0 r0VarA = eVar2.d.a();
                        v5k.a aVar26 = new v5k.a();
                        j60.a aVar27 = (j60.a) fVar.f230361g.get();
                        ow9.e eVar4 = fVar.f230359b;
                        sf0.h hVarB2 = eVar4.e.b();
                        vc.s.j(hVarB2);
                        v60.e eVarA2 = eVar4.f.a();
                        vc.s.j(eVarA2);
                        gVar = new d6k.g(fVarE, r0VarA, aVar26, aVar27, new d6k.b(hVarB2, eVarA2));
                        return gVar;
                    case 14:
                        return new vw9.a();
                    case 15:
                        Object extension = (d6k.d) fVar.f230370s.get();
                        d6k.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension, "extension");
                        yji.n nVar = (yji.n) extension;
                        vc.s.k(nVar);
                        return nVar;
                    case 16:
                        vq1.a factory = (vq1.a) eVar2.f230345h.f273482b.get();
                        vc.s.j(factory);
                        vo1.c billsFeatureChecker = ((up1.e) eVar2.i).a();
                        vc.s.j(billsFeatureChecker);
                        uq1.a pagoPAInteractor = (uq1.a) eVar2.f230345h.e.get();
                        vc.s.j(pagoPAInteractor);
                        ww9.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        Intrinsics.checkNotNullParameter(billsFeatureChecker, "billsFeatureChecker");
                        Intrinsics.checkNotNullParameter(pagoPAInteractor, "pagoPAInteractor");
                        Intrinsics.checkNotNullParameter(billsFeatureChecker, "billsFeatureChecker");
                        Intrinsics.checkNotNullParameter(pagoPAInteractor, "pagoPAInteractor");
                        gVar = new vq1.d(pagoPAInteractor, billsFeatureChecker);
                        return gVar;
                    case 17:
                        gVar = new z2j.g(((b3j.p) eVar2.f230346j).e(), new x2k.e());
                        return gVar;
                    case 18:
                        ww9.c.Companion.getClass();
                        return new xq2.d(xq2.e.QR_CODE);
                    case 19:
                        ww9.c.Companion.getClass();
                        return new cv.c(cv.a.BACK);
                    default:
                        throw new AssertionError(i6);
                }
            case 5:
                ow9.e eVar5 = (ow9.e) this.f230167b;
                ow9.h hVar3 = (ow9.h) this.d;
                int i21 = this.f230168c;
                switch (i21) {
                    case 0:
                        return f0k.d.p((e60.a) hVar3.k.get());
                    case 1:
                        com.revolut.kompot.navigable.a aVar28 = (com.revolut.kompot.navigable.a) hVar3.f230379c.get();
                        g60.a aVarA13 = f60.v.a((com.revolut.kompot.navigable.a) hVar3.f230379c.get());
                        Activity activityA2 = f60.t.a((com.revolut.kompot.navigable.a) hVar3.f230379c.get());
                        t80.g gVar3 = (t80.g) hVar3.d.get();
                        com.revolut.kompot.navigable.a aVar29 = (com.revolut.kompot.navigable.a) hVar3.f230379c.get();
                        f60.y.a(aVar29);
                        d4m.a aVarA14 = e4m.b.a(hVar3.e);
                        nli.a aVar30 = new nli.a((t80.c) hVar3.f.get(), f60.t.a((com.revolut.kompot.navigable.a) hVar3.f230379c.get()));
                        t80.g gVar4 = (t80.g) hVar3.d.get();
                        zk0.b bVarL2 = hVar3.f230377a.f230341a.l();
                        vc.s.j(bVarL2);
                        return v1.c.q(aVar28, new t80.v(aVarA13, activityA2, gVar3, aVar29, aVarA14, aVar30, new oli.c(gVar4, bVarL2, new nli.a((t80.c) hVar3.f.get(), f60.t.a((com.revolut.kompot.navigable.a) hVar3.f230379c.get())), f60.v.a((com.revolut.kompot.navigable.a) hVar3.f230379c.get()), hVar3.c()), new oli.g(f60.u.a(f60.t.a((com.revolut.kompot.navigable.a) hVar3.f230379c.get())), v1.c.e((com.revolut.kompot.navigable.a) hVar3.f230379c.get()), new ami.n(e4m.b.a(hVar3.f230380g), 1), e4m.b.a(hVar3.e), (t80.g) hVar3.d.get(), new nli.a((t80.c) hVar3.f.get(), f60.t.a((com.revolut.kompot.navigable.a) hVar3.f230379c.get())), new i90.b(), hVar3.b(), hVar3.c()), hVar3.c()), f60.x.a(), (rp0.m) hVar3.f230381h.get(), (e60.t) hVar3.f230382j.get());
                    case 2:
                        l70.e eVar6 = eVar5.f230341a;
                        l70.e eVar7 = eVar5.f230341a;
                        f80.a aVarX = eVar6.x();
                        vc.s.j(aVarX);
                        l80.e eVarH = eVar7.h();
                        vc.s.j(eVarH);
                        zk0.b bVarL3 = eVar7.l();
                        vc.s.j(bVarL3);
                        return new t80.b(aVarX, eVarH, bVarL3);
                    case 3:
                        com.revolut.kompot.navigable.a aVar31 = (com.revolut.kompot.navigable.a) hVar3.f230379c.get();
                        f60.y.a(aVar31);
                        return pli.c.a(new ks0.n(aVar31));
                    case 4:
                        zw9.b.Companion.getClass();
                        return new t80.c(new e.a("profile_onboarding"), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
                    case 5:
                        return t96.a.a();
                    case 6:
                        return f60.z.a();
                    case 7:
                        aii.o oVar4 = (aii.o) hVar3.i.get();
                        y80.a aVarR2 = eVar5.f230341a.r();
                        vc.s.j(aVarR2);
                        yVar2 = new e60.y(oVar4, aVarR2, hVar3.b(), Optional.empty());
                        break;
                    case 8:
                        e60.t tVar5 = (e60.t) hVar3.f230382j.get();
                        f60.w.a(tVar5);
                        return tVar5;
                    case 9:
                        cli.n nVar2 = (cli.n) hVar3.f230386p.get();
                        ang.f fVarE2 = eVar5.f230343c.e();
                        e60.a aVar32 = (e60.a) hVar3.k.get();
                        cpa.a aVar33 = (cpa.a) eVar5.f230357y.f128128b.get();
                        vc.s.j(aVar33);
                        yVar2 = new yw9.w(nVar2, fVarE2, aVar32, aVar33, (qw9.f) eVar5.E.get(), (cpg.a) eVar5.F.get());
                        break;
                    case 10:
                        return new yw9.a0((yw9.f) hVar3.o.get());
                    case 11:
                        epg.b bVar6 = (epg.b) hVar3.f230385n.get();
                        qd0.b bVarN2 = eVar5.f230341a.n();
                        vc.s.j(bVarN2);
                        yVar2 = new yw9.y(bVar6, bVarN2);
                        break;
                    case 12:
                        return new epg.c();
                    default:
                        throw new AssertionError(i21);
                }
                return yVar2;
            case 6:
                ow9.i iVar = (ow9.i) this.d;
                ow9.e eVar8 = (ow9.e) this.f230167b;
                pqi.a aVar34 = eVar8.v;
                int i22 = this.f230168c;
                if (i22 != 0) {
                    if (i22 == 1) {
                        return new tw9.g(eVar8.f230341a.d(), new gw9.a());
                    }
                    throw new AssertionError(i22);
                }
                tqi.g gVarE = aVar34.e();
                gw9.a aVar35 = new gw9.a();
                f01.c cVarG = aVar34.g();
                Context context = eVar8.f230355w;
                fi0.c provider3 = new fi0.c();
                ow9.o.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(provider3, "provider");
                Intrinsics.checkNotNullParameter(context, "context");
                return new tw9.i(gVarE, aVar35, cVarG, new fi0.b(context, 0), new ogm.i(new kye.e((DigitalPassService) iVar.f230389b.A.get())), iVar.f230388a, (cli.n) iVar.f230390c.get());
            case 7:
                ox7.b bVar7 = (ox7.b) this.f230167b;
                ox7.a aVar36 = (ox7.a) this.d;
                int i32 = this.f230168c;
                switch (i32) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI = bq.i.i(aVar36.f230643a);
                        BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(aVar36.f230643a);
                        t70.g gVarO = bVar7.f230661b.o();
                        vc.s.j(gVarO);
                        return new npi.c(contextI, baseDelegatesActivityF, gVarO);
                    case 2:
                        return new tpi.i((rpi.c) aVar36.f.get(), gsi.c.a(aVar36.f230643a));
                    case 3:
                        return new rpi.b(bq.i.b(aVar36.f230643a));
                    case 4:
                        return new rpi.h(bq.i.b(aVar36.f230643a));
                    case 5:
                        iri.j jVar2 = (iri.j) bVar7.f230663g.get();
                        nx7.a0 a0VarE = aVar36.e();
                        xoi.d dVar6 = aVar36.f230643a;
                        return new iri.g(jVar2, a0VarE, bq.i.f(dVar6), bq.i.l(dVar6));
                    case 6:
                        return new iri.l(aVar36.e(), bq.i.f(aVar36.f230643a), (iri.d) aVar36.f230648j.get());
                    case 7:
                        return new iri.d(bq.i.f(aVar36.f230643a));
                    case 8:
                        return new opi.b(bq.i.f(aVar36.f230643a));
                    case 9:
                        return new en.c(ImmutableSet.of((ln.d) aVar36.f230644b.f230672s.get()), bq.i.l(aVar36.f230643a));
                    case 10:
                        aVar36.getClass();
                        return new xpi.c(xpi.f.d, bq.i.b(aVar36.f230643a));
                    case 11:
                        aVar36.getClass();
                        return new iqi.b(iqi.g.f167870b, bq.i.b(aVar36.f230643a));
                    case 12:
                        aVar36.getClass();
                        return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) bVar7.f230673t.get(), bVar7.d());
                    case 13:
                        um.c cVar3 = (um.c) bVar7.u.get();
                        aVar36.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(6);
                        ox7.b bVar8 = aVar36.f230644b;
                        builderBuilderWithExpectedSize.add(bVar8.f230675x.get());
                        hn.h hVar4 = (hn.h) bVar8.f230676y.get();
                        t70.g gVarO2 = bVar8.f230661b.o();
                        vc.s.j(gVarO2);
                        builderBuilderWithExpectedSize.add(new jn.a(hVar4, gVarO2));
                        builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                        builderBuilderWithExpectedSize.add(bVar8.h());
                        builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                        builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(aVar36.f230653q)));
                        return new in.e(cVar3, builderBuilderWithExpectedSize.build(), bVar7.d());
                    case 14:
                        return bq.i.t(aVar36.f230643a);
                    case 15:
                        aVar36.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(4);
                        builderBuilderWithExpectedSize2.add(aVar36.f230644b.H.get());
                        builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                        builderBuilderWithExpectedSize2.add(aVar36.f230655s.get());
                        builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(aVar36.f230646g)));
                        return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) bVar7.f230674w.get(), bVar7.d());
                    case 16:
                        return new zm.a();
                    case 17:
                        aVar36.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                        builderBuilderWithExpectedSize3.add(aVar36.f230644b.h());
                        return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) bVar7.f230676y.get(), (npi.f) aVar36.e.get());
                    case 18:
                        return new gn.c((lpi.e) aVar36.v.get(), (sm.e) bVar7.J.get(), ImmutableSet.copyOf((Collection) gn.e.a()), bVar7.d());
                    case 19:
                        return new lpi.b(bq.i.i(aVar36.f230643a), bq.i.j(aVar36.f230643a));
                    case 20:
                        aVar36.getClass();
                        return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) bVar7.K.get(), bVar7.d());
                    case 21:
                        aVar36.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize4 = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize4.addAll((Iterable) g3l.f.a());
                        return new g3l.c(j6.a.g(aVar36.f230644b.f230675x, builderBuilderWithExpectedSize4), (g3l.g) bVar7.v.get(), (k3l.b) aVar36.f230659y.get(), bVar7.d());
                    case 22:
                        return new k3l.d(bq.i.b(aVar36.f230643a));
                    case 23:
                        return new wm.l((opi.d) aVar36.f230649l.get(), (wm.a) bVar7.L.get(), ImmutableSet.copyOf((Collection) xm.b.a()), bVar7.d());
                    case 24:
                        e4m.e eVar9 = aVar36.f230651n;
                        xoi.d dVar7 = aVar36.f230643a;
                        nx7.u uVar2 = new nx7.u((xpi.g) eVar9.get(), (iqi.h) aVar36.o.get(), bq.i.e(dVar7), (rpi.c) aVar36.f.get(), (nx7.c) bVar7.M.get(), (nx7.b) bVar7.H.get(), (mm.d) bVar7.I.get());
                        kli.a.p(uVar2, bq.i.d(dVar7));
                        return uVar2;
                    default:
                        throw new AssertionError(i32);
                }
            case 8:
                ox7.b bVar9 = (ox7.b) this.f230167b;
                ox7.f fVar2 = (ox7.f) this.d;
                int i33 = this.f230168c;
                switch (i33) {
                    case 0:
                        ypi.h hVar5 = fVar2.f230686b;
                        fsi.g gVar5 = fVar2.f230685a;
                        return new ypi.e(hVar5, bq.i.b(gVar5), bq.i.o(gVar5), bq.i.g(gVar5));
                    case 1:
                        return new hqi.f(fVar2.f230687c, bq.i.b(fVar2.f230685a));
                    case 2:
                        return kpi.f.a();
                    case 3:
                        Context contextI2 = bq.i.i(fVar2.f230685a);
                        BaseDelegatesActivity baseDelegatesActivityF2 = bq.i.f(fVar2.f230685a);
                        t70.g gVarO3 = bVar9.f230661b.o();
                        vc.s.j(gVarO3);
                        cVar = new npi.c(contextI2, baseDelegatesActivityF2, gVarO3);
                        break;
                    case 4:
                        return new tpi.i((rpi.c) fVar2.f230690j.get(), gsi.c.a(fVar2.f230685a));
                    case 5:
                        return new rpi.b(bq.i.b(fVar2.f230685a));
                    case 6:
                        return new rpi.h(bq.i.b(fVar2.f230685a));
                    case 7:
                        cVar = new iri.g((iri.j) bVar9.f230663g.get(), (iri.m) bVar9.f230664h.get(), bq.i.f(fVar2.f230685a), bq.i.l(fVar2.f230685a));
                        break;
                    case 8:
                        cVar = new iri.l((iri.m) bVar9.f230664h.get(), bq.i.f(fVar2.f230685a), (iri.d) fVar2.f230693n.get());
                        break;
                    case 9:
                        return new iri.d(bq.i.f(fVar2.f230685a));
                    case 10:
                        return new opi.b(bq.i.f(fVar2.f230685a));
                    case 11:
                        return new mx7.f((mx7.g) bVar9.f230668n.get(), bq.i.l(fVar2.f230685a), (f9b.f) fVar2.f230695q.get(), (tpi.j) fVar2.k.get(), (opi.d) fVar2.f230694p.get(), (qi3.r) bVar9.o.get(), fVar2.d, (ypi.i) fVar2.f.get(), (hqi.l) fVar2.f230688g.get(), bq.i.o(fVar2.f230685a));
                    case 12:
                        return bq.i.t(fVar2.f230685a);
                    default:
                        throw new AssertionError(i33);
                }
                return cVar;
            case 9:
                return a();
            case 10:
                return b();
            case 11:
                oz9.c cVar4 = (oz9.c) this.f230167b;
                int i43 = this.f230168c;
                if (i43 != 0) {
                    if (i43 == 1) {
                        return new yz9.f(cVar4.a());
                    }
                    throw new AssertionError(i43);
                }
                y8k.e eVar10 = new y8k.e();
                oz9.a aVar37 = (oz9.a) this.d;
                return new com.revolut.feature.payments.social.impl.presentation.p2p_kompot.flow.a(eVar10, aVar37.f231122a, (yz9.c) aVar37.d.get());
            case 12:
                return c();
            case 13:
                return d();
            case 14:
                oz9.f fVar3 = (oz9.f) this.d;
                int i59 = this.f230168c;
                if (i59 != 0) {
                    if (i59 == 1) {
                        return new yz9.f(((oz9.c) this.f230167b).a());
                    }
                    throw new AssertionError(i59);
                }
                TransferOnlyChatToTransferFlowContract$InputData transferOnlyChatToTransferFlowContract$InputData = fVar3.f231172a;
                oz9.c cVar5 = fVar3.f231173b;
                x2k.e eVar11 = new x2k.e();
                lo5.p pVarB = ((yo5.w) cVar5.v).b();
                vc.s.j(pVarB);
                oy1.b bVarB3 = cVar5.f231142w.b();
                un9.a aVarD3 = cVar5.f231143x.d();
                vc.s.j(aVarD3);
                return new com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.transfer_with_chat_flow.a(transferOnlyChatToTransferFlowContract$InputData, new q0a.b(eVar11, pVarB, bVarB3, aVarD3), (yz9.c) fVar3.f231174c.get());
            case 15:
                return e();
            case 16:
                return f();
            case 17:
                return g();
            case 18:
                return h();
            case 19:
                return i();
            case 20:
                return j();
            case 21:
                return k();
            case 22:
                return l();
            case 23:
                p12.v vVar = (p12.v) this.f230167b;
                p12.s sVar3 = (p12.s) this.d;
                int i66 = this.f230168c;
                if (i66 != 0) {
                    if (i66 == 1) {
                        return new h32.l();
                    }
                    throw new AssertionError(i66);
                }
                ApmConsentNavigation$InputData apmConsentNavigation$InputData = sVar3.f231760a;
                oz1.c cVar6 = (oz1.c) ((lz1.m) vVar.e).A.get();
                vc.s.j(cVar6);
                return new h32.k(apmConsentNavigation$InputData, cVar6, (sri.m) vVar.P.get(), (cli.n) sVar3.f231761b.get());
            case 24:
                return m();
            case 25:
                return n();
            case 26:
                return o();
            case 27:
                return p();
            case 28:
                return q();
            default:
                p12.d0 d0Var5 = (p12.d0) this.d;
                p12.v vVar2 = (p12.v) this.f230167b;
                lx1.b bVar10 = vVar2.f;
                int i74 = this.f230168c;
                if (i74 == 0) {
                    Object extension2 = d0Var5.f231634a;
                    d42.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension2, "extension");
                    yji.n nVar3 = (yji.n) extension2;
                    vc.s.k(nVar3);
                    return nVar3;
                }
                if (i74 != 1) {
                    if (i74 != 2) {
                        throw new AssertionError(i74);
                    }
                    ApmRecipientListInputData apmRecipientListInputData = d0Var5.f231635b;
                    lx1.i iVarD = ((ey1.e) bVar10).d();
                    vc.s.j(iVarD);
                    dl3.f fVarC = vVar2.A.c();
                    vc.s.j(fVarC);
                    return new c42.n(apmRecipientListInputData, iVarD, fVarC);
                }
                ApmRecipientListInputData apmRecipientListInputData2 = d0Var5.f231635b;
                c12.z zVar2 = d0Var5.f231634a;
                pn3.a aVar38 = (pn3.a) vVar2.N.get();
                vz1.j jVarI = ((lz1.m) vVar2.e).i();
                vc.s.j(jVarI);
                lx1.d dVarB2 = ((ey1.e) bVar10).b();
                vc.s.j(dVarB2);
                return new c42.l(apmRecipientListInputData2, zVar2, aVar38, jVarI, dVarB2, (cli.n) d0Var5.d.get());
        }
    }
}
