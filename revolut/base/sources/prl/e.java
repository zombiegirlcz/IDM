package prl;

import android.graphics.Outline;
import android.graphics.Path;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.room.util.DBUtil;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.token.OnfidoTokenProvider;
import com.onfido.android.sdk.capture.internal.ui.countryselection.OnfidoSupportedDocumentsRepository;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.javax.inject.Provider;
import com.onfido.workflow.WorkflowConfig;
import com.onfido.workflow.internal.network.WorkflowApi;
import com.revolut.core.ui_kit.views.code.CodeEditor;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.feature.global_markets.domain.Market;
import com.revolut.feature.global_markets.impl.data.network.GlobalMarketsService;
import com.revolut.feature.revolutpay.api.shared.domain.models.payment.PaymentConfiguration;
import com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreenContract$InputData;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.cryptocommoditydetails.impl.data.commodity.network.CommodityPriceTargetsService;
import com.revolut.retail.feature.cryptocommoditydetails.impl.data.network.CryptoDetailsAboutService;
import com.revolut.shared.feature.wealth_discovery.domain.impl.data.network.screener.ScreenerService;
import com.revolut.trading.orders.data.network.services.TradingOrdersService;
import com.revolut.ui.login.pin.LoginActivity;
import efm.f0;
import fmc.z;
import ip0.nb0;
import ip0.pb0;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;
import k77.n;
import k9.v;
import klf.h0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.serialization.json.Json;
import le.u1;
import om4.d0;
import org.bouncycastle.asn1.BERTags;
import prl.e;
import q2j.k;
import rh8.n0;
import s77.c0;
import s77.j;
import s77.p;
import skm.e0;
import skm.p0;
import sl.a0;
import t73.y2;
import t73.z2;
import tcg.q;
import te0.w;
import tnb.g0;
import ufm.i;
import uv5.d;
import uv5.g;
import vc.s;
import wli.x;
import zcj.c;
import zcj.f;
import zcj.h;
import zh9.u0;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements fu0.h, el.b, uc.e, f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f239324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f239325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f239326c;
    public Object d;
    public Object e;

    public e() {
        this.f239324a = 18;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(prl.e r8, uwe.a r9, e93.c r10, gim.c r11) {
        /*
            r8.getClass()
            boolean r0 = r11 instanceof swe.b
            if (r0 == 0) goto L17
            r0 = r11
            swe.b r0 = (swe.b) r0
            int r1 = r0.f266200y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f266200y = r1
        L15:
            r6 = r0
            goto L1d
        L17:
            swe.b r0 = new swe.b
            r0.<init>(r8, r11)
            goto L15
        L1d:
            java.lang.Object r11 = r6.f266198w
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f266200y
            r2 = 1
            r7 = 0
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            e93.c r10 = r6.v
            uwe.a r9 = r6.u
            yhm.o.b(r11)
            goto L66
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            yhm.o.b(r11)
            if (r10 == 0) goto L41
            java.util.ArrayList r11 = r10.f123825b
            goto L42
        L41:
            r11 = r7
        L42:
            if (r11 == 0) goto L4d
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L4b
            goto L4d
        L4b:
            r11 = 0
            goto L4e
        L4d:
            r11 = r2
        L4e:
            r4 = r11 ^ 1
            java.lang.Object r11 = r8.e
            r1 = r11
            hxe.b r1 = (hxe.b) r1
            r6.u = r9
            r6.v = r10
            r6.f266200y = r2
            r3 = 1
            r5 = 0
            r2 = r9
            java.lang.Object r11 = r1.a(r2, r3, r4, r5, r6)
            if (r11 != r0) goto L65
            return r0
        L65:
            r9 = r2
        L66:
            jxe.c r11 = (jxe.c) r11
            if (r11 == 0) goto L6f
            dj0.d r11 = r11.a()
            goto L70
        L6f:
            r11 = r7
        L70:
            dj0.d r3 = pyd.c.M(r11)
            e93.j0 r10 = uwe.h.b(r9, r10)
            if (r10 == 0) goto L7d
            dj0.d r10 = r10.f123877b
            goto L7e
        L7d:
            r10 = r7
        L7e:
            com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutContent$Order r11 = r9.f283629a
            cxe.d r11 = r11.getF90713b()
            dj0.d r11 = r11.f109938a
            dj0.d r1 = pyd.c.H(r11, r10)
            java.lang.Object r8 = r8.d
            sh3.a r8 = (sh3.a) r8
            dj0.d r2 = r9.f283630b
            dj0.d r4 = r9.f283633h
            r5 = 1
            r0 = r8
            ei3.m r0 = (ei3.m) r0
            long r10 = r0.f(r1, r2, r3, r4, r5)
            xi0.b r8 = r1.f115083b
            swe.a r0 = new swe.a
            dj0.d r1 = new dj0.d
            r1.<init>(r10, r8)
            java.lang.String r2 = r8.f306286a
            yte.n r3 = r9.f283634j
            com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.model.CheckoutCardPlan r8 = r9.i
            if (r8 == 0) goto Laf
            yte.b r9 = r8.f90755a
            r4 = r9
            goto Lb0
        Laf:
            r4 = r7
        Lb0:
            if (r8 == 0) goto Lb4
            java.lang.String r7 = r8.f90756b
        Lb4:
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: prl.e.c(prl.e, uwe.a, e93.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(prl.e r5, java.lang.String r6, gim.c r7) {
        /*
            java.lang.Object r0 = r5.d
            te8.e r0 = (te8.e) r0
            boolean r1 = r7 instanceof rh8.j
            if (r1 == 0) goto L17
            r1 = r7
            rh8.j r1 = (rh8.j) r1
            int r2 = r1.f254346x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f254346x = r2
            goto L1c
        L17:
            rh8.j r1 = new rh8.j
            r1.<init>(r5, r7)
        L1c:
            java.lang.Object r5 = r1.v
            fim.a r7 = fim.a.COROUTINE_SUSPENDED
            int r2 = r1.f254346x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r5)
            return r5
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            java.lang.String r6 = r1.u
            yhm.o.b(r5)
            goto L4a
        L3c:
            yhm.o.b(r5)
            r1.u = r6
            r1.f254346x = r4
            java.lang.Object r5 = r0.c(r4, r1)
            if (r5 != r7) goto L4a
            goto L66
        L4a:
            w4l.j r5 = w4l.j.f294644c
            akg.n r5 = r0.a(r6, r5)
            rd3.k r6 = new rd3.k
            r0 = 23
            r6.<init>(r0)
            r0 = 0
            jhi.b r5 = mo3.a.g(r5, r0, r6, r4)
            r1.u = r0
            r1.f254346x = r3
            java.lang.Object r5 = vkm.q.x(r5, r1)
            if (r5 != r7) goto L67
        L66:
            return r7
        L67:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: prl.e.d(prl.e, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
    
        if (r5 == r7) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(prl.e r5, java.lang.String r6, gim.c r7) {
        /*
            java.lang.Object r0 = r5.e
            wsg.n r0 = (wsg.n) r0
            boolean r1 = r7 instanceof rh8.k
            if (r1 == 0) goto L17
            r1 = r7
            rh8.k r1 = (rh8.k) r1
            int r2 = r1.f254349x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f254349x = r2
            goto L1c
        L17:
            rh8.k r1 = new rh8.k
            r1.<init>(r5, r7)
        L1c:
            java.lang.Object r5 = r1.v
            fim.a r7 = fim.a.COROUTINE_SUSPENDED
            int r2 = r1.f254349x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r5)
            goto L76
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            java.lang.String r6 = r1.u
            yhm.o.b(r5)
            goto L4e
        L3c:
            yhm.o.b(r5)
            pfm.a r5 = r0.m0(r4)
            r1.u = r6
            r1.f254349x = r4
            java.lang.Object r5 = nim.a.a(r5, r1)
            if (r5 != r7) goto L4e
            goto L75
        L4e:
            r5 = 0
            r2 = 4
            efm.r r5 = osg.b.a(r0, r6, r5, r2)
            rd3.k r6 = new rd3.k
            r0 = 21
            r6.<init>(r0)
            rd3.k r0 = new rd3.k
            r2 = 22
            r0.<init>(r2)
            efm.r r5 = m70.a.e(r5, r6, r0)
            vkm.d r5 = rd0.e.b(r5)
            r6 = 0
            r1.u = r6
            r1.f254349x = r3
            java.lang.Object r5 = vkm.q.x(r5, r1)
            if (r5 != r7) goto L76
        L75:
            return r7
        L76:
            java.lang.String r6 = "first(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: prl.e.e(prl.e, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // fu0.h
    public void B() {
        fu0.g[] gVarArrB = b();
        Outline outline = (Outline) this.f239326c;
        if (outline == null) {
            outline = new Outline();
            this.f239326c = outline;
        }
        CodeEditor codeEditor = (CodeEditor) this.e;
        int length = gVarArrB.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            fu0.g gVar = gVarArrB[i];
            int i3 = i2 + 1;
            InputText inputText = codeEditor.f59036b[i2];
            int visibility = inputText.getVisibility();
            float radius = BitmapDescriptorFactory.HUE_RED;
            if (visibility == 0) {
                gVar.d(inputText.getLeft(), inputText.getTop(), inputText.getWidth() + inputText.getLeft(), inputText.getHeight() + inputText.getTop());
                outline.setEmpty();
                inputText.w0(outline);
                if (!outline.isEmpty()) {
                    radius = outline.getRadius();
                }
                gVar.f138065c = radius;
                gVar.f138066g = true;
            } else {
                gVar.f138064b = 2;
                Path path = gVar.d;
                if (path != null) {
                    path.reset();
                }
                gVar.f138063a.set(0, 0, 0, 0);
                gVar.f138065c = BitmapDescriptorFactory.HUE_RED;
                gVar.e = 0;
                gVar.f = 0;
            }
            i++;
            i2 = i3;
        }
    }

    @Override // uc.e
    public void a(ZipFile zipFile, HashSet hashSet) {
        ((uc.h) this.e).c((uc.b) this.f239325b, hashSet, new qr0.i(this, 23));
    }

    @Override // fu0.h
    public fu0.g[] b() {
        fu0.g[] gVarArr = (fu0.g[]) this.f239325b;
        if (gVarArr != null) {
            return gVarArr;
        }
        int length = ((CodeEditor) this.e).f59036b.length;
        fu0.g[] gVarArr2 = new fu0.g[length];
        for (int i = 0; i < length; i++) {
            gVarArr2[i] = new fu0.g();
        }
        this.f239325b = gVarArr2;
        return gVarArr2;
    }

    public Object f(u2l.a aVar) {
        this.f239326c = (LoginActivity) aVar;
        return this;
    }

    public LinkedHashMap g() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        sd.a aVar = (sd.a) this.f239325b;
        if (aVar != null) {
            linkedHashMap.put(sd.b.AD_STORAGE, aVar);
        }
        sd.a aVar2 = (sd.a) this.f239326c;
        if (aVar2 != null) {
            linkedHashMap.put(sd.b.ANALYTICS_STORAGE, aVar2);
        }
        sd.a aVar3 = (sd.a) this.d;
        if (aVar3 != null) {
            linkedHashMap.put(sd.b.AD_USER_DATA, aVar3);
        }
        sd.a aVar4 = (sd.a) this.e;
        if (aVar4 != null) {
            linkedHashMap.put(sd.b.AD_PERSONALIZATION, aVar4);
        }
        return linkedHashMap;
    }

    @Override // com.onfido.javax.inject.Provider
    public Object get() {
        switch (this.f239324a) {
            case 19:
                return new sl.d((WorkflowApi) ((z) this.f239325b).get(), (WorkflowConfig) ((f4h.a) this.f239326c).get(), (SchedulersProvider) ((il.g) this.d).get(), (OnfidoTokenProvider) ((il.c) this.e).get());
            default:
                return new a0((OnfidoSupportedDocumentsRepository) ((il.b) this.f239325b).get(), (OnfidoRemoteConfig) ((il.a) this.f239326c).get(), (Json) ((il.c) this.d).get(), (k7i.i) ((kdh.b) this.e).get());
        }
    }

    @Override // fu0.h
    public View getView() {
        return (CodeEditor) this.d;
    }

    public w2l.a h() {
        s.h((LoginActivity) this.f239326c, u2l.a.class);
        s.h((xoi.d) this.e, fsi.g.class);
        return new r41.a((r41.b) this.f239325b, new xoi.j(), (LoginActivity) this.f239326c, (Integer) this.d, (xoi.d) this.e);
    }

    public Object i() {
        this.d = -1;
        return this;
    }

    public e j(xoi.d dVar) {
        this.e = dVar;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(kf8.h r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof rh8.g
            if (r0 == 0) goto L13
            r0 = r8
            rh8.g r0 = (rh8.g) r0
            int r1 = r0.f254336w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f254336w = r1
            goto L18
        L13:
            rh8.g r0 = new rh8.g
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f254336w
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r8)
            return r8
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            yhm.o.b(r8)
            yhm.m r8 = (yhm.m) r8
            java.lang.Object r7 = r8.f314193a
            goto L64
        L3d:
            yhm.o.b(r8)
            goto L51
        L41:
            yhm.o.b(r8)
            java.lang.Object r8 = r6.f239325b
            wh8.b r8 = (wh8.b) r8
            r0.f254336w = r5
            java.lang.Object r8 = r8.a(r7, r0)
            if (r8 != r1) goto L51
            goto L79
        L51:
            pi8.a r8 = (pi8.a) r8
            java.lang.Object r7 = r6.f239326c
            rh8.n0 r7 = (rh8.n0) r7
            java.lang.String r8 = r8.f236459a
            kf8.i r2 = kf8.i.BANKING
            r0.f254336w = r4
            java.lang.Object r7 = r7.a(r8, r2, r0)
            if (r7 != r1) goto L64
            goto L79
        L64:
            yhm.o.b(r7)
            com.revolut.feature.junior_profile.api.models.a r7 = (com.revolut.feature.junior_profile.api.models.a) r7
            ac8.h r8 = new ac8.h
            r2 = 29
            r4 = 0
            r8.<init>(r7, r6, r4, r2)
            r0.f254336w = r3
            java.lang.Object r7 = skm.e0.o(r8, r0)
            if (r7 != r1) goto L7a
        L79:
            return r1
        L7a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: prl.e.k(kf8.h, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (r6 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object l(kf8.h r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof rh8.i
            if (r0 == 0) goto L13
            r0 = r7
            rh8.i r0 = (rh8.i) r0
            int r1 = r0.f254342w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f254342w = r1
            goto L18
        L13:
            rh8.i r0 = new rh8.i
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f254342w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r7)
            yhm.m r7 = (yhm.m) r7
            java.lang.Object r6 = r7.f314193a
            goto L5d
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            yhm.o.b(r7)
            goto L4a
        L3a:
            yhm.o.b(r7)
            java.lang.Object r7 = r5.f239325b
            wh8.b r7 = (wh8.b) r7
            r0.f254342w = r4
            java.lang.Object r7 = r7.a(r6, r0)
            if (r7 != r1) goto L4a
            goto L5c
        L4a:
            pi8.a r7 = (pi8.a) r7
            java.lang.Object r6 = r5.f239326c
            rh8.n0 r6 = (rh8.n0) r6
            java.lang.String r7 = r7.f236459a
            kf8.i r2 = kf8.i.TRADING
            r0.f254342w = r3
            java.lang.Object r6 = r6.a(r7, r2, r0)
            if (r6 != r1) goto L5d
        L5c:
            return r1
        L5d:
            yhm.o.b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: prl.e.l(kf8.h, gim.c):java.lang.Object");
    }

    public void m(Object obj2, com.fasterxml.jackson.core.h hVar, v vVar) {
        p9.f fVar = (p9.f) this.f239326c;
        Object objQ = fVar.q(obj2);
        if (objQ == null) {
            return;
        }
        if (objQ instanceof Map) {
            v9.p pVar = (v9.p) this.e;
            if (pVar != null) {
                pVar.u((Map) objQ, hVar, vVar);
                return;
            } else {
                ((k9.k) this.d).f(objQ, hVar, vVar);
                return;
            }
        }
        vVar.A("Value returned by 'any-getter' " + fVar.getName() + "() not java.util.Map but " + objQ.getClass().getName());
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(gim.c r10, java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: prl.e.n(gim.c, java.lang.String, boolean):java.lang.Object");
    }

    public Object o(Object obj2, gim.c cVar) {
        aii.o oVar = (aii.o) this.f239326c;
        p56.a aVar = (p56.a) this.f239325b;
        boolean z = false;
        if (obj2 instanceof tga.e) {
            tga.e eVar = (tga.e) obj2;
            if (aha.a.b((gte.a) this.d, eVar.f271114a)) {
                wga.c cVar2 = eVar.f271115b.f297275a.f297271c;
                if (cVar2 instanceof wga.a) {
                    return ((x) this.e).L1(((wga.a) cVar2).f297267a, lg0.a.IGNORE, Boolean.FALSE, cVar);
                }
                if (!(cVar2 instanceof wga.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                FeatureCommand featureCommandG = aVar.g(eVar);
                if (featureCommandG != null) {
                    oVar.M0(new aii.v(u0.b(featureCommandG)));
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }
        FeatureCommand featureCommandG2 = aVar.g(obj2);
        if (featureCommandG2 != null) {
            oVar.M0(new aii.v(u0.b(featureCommandG2)));
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // efm.f0
    public void onError(Throwable th10) {
        ifm.b bVar = (ifm.b) this.f239325b;
        if (!((AtomicBoolean) this.d).compareAndSet(false, true)) {
            mo3.a.m(th10);
            return;
        }
        bVar.b((ifm.c) this.e);
        bVar.dispose();
        ((f0) this.f239326c).onError(th10);
    }

    @Override // efm.f0
    public void onSubscribe(ifm.c cVar) {
        this.e = cVar;
        ((ifm.b) this.f239325b).a(cVar);
    }

    @Override // efm.f0
    public void onSuccess(Object obj2) {
        ifm.b bVar = (ifm.b) this.f239325b;
        if (((AtomicBoolean) this.d).compareAndSet(false, true)) {
            bVar.b((ifm.c) this.e);
            bVar.dispose();
            ((f0) this.f239326c).onSuccess(obj2);
        }
    }

    public List p(o9c.s domainState, PaymentConfiguration paymentConfiguration) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (List) iii.c.f(t1.x(domainState.k, domainState.i, domainState.f223227c, domainState.f223228g, domainState.d, domainState.f223229h), new r38.m(this, 25), new r6d.h(21), new q87.z(this, paymentConfiguration, 27));
    }

    public aim.e q() {
        aim.e eVarB = u.b();
        nb0 nb0Var = pb0.Companion;
        eVarB.addAll(u.c(nb0.a(nb0Var, "CHECKOUT_DETAILS_PAYMENT_METHOD_LOADING_LIST_ID", false, 6)));
        if (((RevolutPaySummaryScreenContract$InputData) this.e).getF84525c().getF84334a()) {
            eVarB.addAll(zhm.v.k(nb0.a(nb0Var, "CHECKOUT_DETAILS_SHIPPING_ADDRESS_LOADING_LIST_ID", false, 6), nb0.a(nb0Var, "CHECKOUT_DETAILS_DELIVERY_METHOD_LOADING_LIST_ID", false, 6)));
        }
        r9c.l lVar = (r9c.l) this.d;
        pb0 pb0VarA = nb0.a(nb0Var, "PAYMENT_SCHEDULE_LOADING_LIST_ID", false, 6);
        if (!lVar.f252565a.getE()) {
            pb0VarA = null;
        }
        eVarB.addAll(zhm.v.l(pb0VarA));
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return eVarA;
    }

    public Object r(gim.i iVar) throws Throwable {
        wh8.b bVar = (wh8.b) this.f239325b;
        bVar.getClass();
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, new w76.a(bVar, null, 12), iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    public Object s(gim.i iVar) {
        x4l.c cVar = (x4l.c) this.f239326c;
        Unit unit = Unit.f186387a;
        Object objD = cVar.d(unit, false, iVar);
        return objD == fim.a.COROUTINE_SUSPENDED ? objD : unit;
    }

    public Object t(Bundle bundle) {
        return this;
    }

    public void u(sd.a aVar) {
        this.e = aVar;
    }

    public void v(sd.a aVar) {
        this.f239325b = aVar;
    }

    public void w(sd.a aVar) {
        this.d = aVar;
    }

    public void x(sd.a aVar) {
        this.f239326c = aVar;
    }

    public /* synthetic */ e(Provider provider, Provider provider2, Provider provider3, Provider provider4, int i) {
        this.f239324a = i;
        this.f239325b = provider;
        this.f239326c = provider2;
        this.d = provider3;
        this.e = provider4;
    }

    public e(uc.h hVar, uc.b bVar, HashSet hashSet, AtomicBoolean atomicBoolean) {
        this.f239324a = 28;
        this.e = hVar;
        this.f239325b = bVar;
        this.f239326c = hashSet;
        this.d = atomicBoolean;
    }

    public e(c4h.b investmentsInteractor, c4h.c stockOnboardingInteractor, kpj.f wealthAccountHeaderUiMapper, ufl.b wealthHoldingsClauseFactory) {
        this.f239324a = 1;
        Intrinsics.checkNotNullParameter(investmentsInteractor, "investmentsInteractor");
        Intrinsics.checkNotNullParameter(stockOnboardingInteractor, "stockOnboardingInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        Intrinsics.checkNotNullParameter(wealthHoldingsClauseFactory, "wealthHoldingsClauseFactory");
        this.f239325b = investmentsInteractor;
        this.f239326c = stockOnboardingInteractor;
        this.d = wealthAccountHeaderUiMapper;
        this.e = wealthHoldingsClauseFactory;
    }

    public e(mk0.a personalisationStorage, gte.a featureToggleInteractor, toa.a notificationSettingsInteractor, ybl.k tradingAccountsInteractor) {
        this.f239324a = 15;
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(notificationSettingsInteractor, "notificationSettingsInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        this.f239325b = personalisationStorage;
        this.f239326c = featureToggleInteractor;
        this.d = notificationSettingsInteractor;
        this.e = tradingAccountsInteractor;
    }

    public e(h0 commonDataSource, onh.b bankTransferHeaderMapper, vlf.b commonUiMapper, t1j.b customisedVaultsProvider) {
        this.f239324a = 26;
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(bankTransferHeaderMapper, "bankTransferHeaderMapper");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        Intrinsics.checkNotNullParameter(customisedVaultsProvider, "customisedVaultsProvider");
        this.f239325b = commonDataSource;
        this.f239326c = bankTransferHeaderMapper;
        this.d = commonUiMapper;
        this.e = customisedVaultsProvider;
    }

    public e(q18.c feedElementMapper, jt0.b feedInteractor, oih.j stocksAccountCommandProvider, l3d.h0 watchlistInteractor) {
        this.f239324a = 3;
        Intrinsics.checkNotNullParameter(feedElementMapper, "feedElementMapper");
        Intrinsics.checkNotNullParameter(feedInteractor, "feedInteractor");
        Intrinsics.checkNotNullParameter(stocksAccountCommandProvider, "stocksAccountCommandProvider");
        Intrinsics.checkNotNullParameter(watchlistInteractor, "watchlistInteractor");
        this.f239325b = feedElementMapper;
        this.f239326c = feedInteractor;
        this.d = stocksAccountCommandProvider;
        this.e = watchlistInteractor;
    }

    public e(xw.a fileSignatureCalculator, d4m.a faceExtractor, qw.a cameraKitImageFormatConverter, d4m.a faceLiveValidator) {
        this.f239324a = 14;
        Intrinsics.checkNotNullParameter(fileSignatureCalculator, "fileSignatureCalculator");
        Intrinsics.checkNotNullParameter(faceExtractor, "faceExtractor");
        Intrinsics.checkNotNullParameter(cameraKitImageFormatConverter, "cameraKitImageFormatConverter");
        Intrinsics.checkNotNullParameter(faceLiveValidator, "faceLiveValidator");
        this.f239325b = fileSignatureCalculator;
        this.f239326c = faceExtractor;
        this.d = cameraKitImageFormatConverter;
        this.e = faceLiveValidator;
    }

    public e(oaj.a newlyAddedCryptoInteractor, ish.a0 widgetsUiInteractor, gaj.b assetDestinationProvider, saj.a newlyAddedWidgetCatalogueProvider) {
        this.f239324a = 17;
        Intrinsics.checkNotNullParameter(newlyAddedCryptoInteractor, "newlyAddedCryptoInteractor");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(assetDestinationProvider, "assetDestinationProvider");
        Intrinsics.checkNotNullParameter(newlyAddedWidgetCatalogueProvider, "newlyAddedWidgetCatalogueProvider");
        this.f239325b = newlyAddedCryptoInteractor;
        this.f239326c = widgetsUiInteractor;
        this.d = assetDestinationProvider;
        this.e = newlyAddedWidgetCatalogueProvider;
    }

    public e(dec.d checkoutPaymentMethodMapper, uec.g shippingMapper, r9c.l paymentScheduleMapper, RevolutPaySummaryScreenContract$InputData inputData) {
        this.f239324a = 6;
        Intrinsics.checkNotNullParameter(checkoutPaymentMethodMapper, "checkoutPaymentMethodMapper");
        Intrinsics.checkNotNullParameter(shippingMapper, "shippingMapper");
        Intrinsics.checkNotNullParameter(paymentScheduleMapper, "paymentScheduleMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f239325b = checkoutPaymentMethodMapper;
        this.f239326c = shippingMapper;
        this.d = paymentScheduleMapper;
        this.e = inputData;
    }

    public e(p56.a naviCommandProvider, aii.o eventsDispatcher, gte.a featureToggleInteractor, x deeplinkHandler) {
        this.f239324a = 9;
        Intrinsics.checkNotNullParameter(naviCommandProvider, "naviCommandProvider");
        Intrinsics.checkNotNullParameter(eventsDispatcher, "eventsDispatcher");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f239325b = naviCommandProvider;
        this.f239326c = eventsDispatcher;
        this.d = featureToggleInteractor;
        this.e = deeplinkHandler;
    }

    public e(r10.q userRegisteredIdentitiesInteractor, wsg.b newWalletsInteractor, cw9.d paymentsProductFeatureChecker, ang.f userInteractor) {
        this.f239324a = 21;
        Intrinsics.checkNotNullParameter(userRegisteredIdentitiesInteractor, "userRegisteredIdentitiesInteractor");
        Intrinsics.checkNotNullParameter(newWalletsInteractor, "newWalletsInteractor");
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f239325b = userRegisteredIdentitiesInteractor;
        this.f239326c = newWalletsInteractor;
        this.d = paymentsProductFeatureChecker;
        this.e = userInteractor;
    }

    public e(View decorView, FrameLayout contentView) {
        this.f239324a = 27;
        Intrinsics.checkNotNullParameter(decorView, "decorView");
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        this.f239325b = decorView;
        this.f239326c = contentView;
        this.d = Build.VERSION.SDK_INT >= 30 ? new tv0.e(contentView) : null;
    }

    public e(b80.c networkStateRepository, CryptoDetailsAboutService service, wcj.b dao, d0 memoryCache) {
        this.f239324a = 8;
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f239325b = service;
        this.f239326c = dao;
        this.d = memoryCache;
        final int i = 0;
        uj0.b bVarK0 = w.k0(networkStateRepository, new Function1(this) { // from class: rcj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f253293b;

            {
                this.f253293b = this;
            }

            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                g gVar;
                d dVar;
                uv5.a aVar;
                ArrayList arrayList;
                int i2 = i;
                e eVar = this.f253293b;
                switch (i2) {
                    case 0:
                        xi0.b currency = (xi0.b) obj2;
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        efm.d0<ddj.b> cryptoDetailsAbout = ((CryptoDetailsAboutService) eVar.f239325b).getCryptoDetailsAbout(currency.f306286a);
                        c cVar = c.f;
                        k kVar = new k(19);
                        cryptoDetailsAbout.getClass();
                        i iVar = new i(cryptoDetailsAbout, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        xi0.b currency2 = (xi0.b) obj2;
                        Intrinsics.checkNotNullParameter(currency2, "currency");
                        d0 d0Var = (d0) eVar.d;
                        String symbol = currency2.f306286a;
                        Intrinsics.checkNotNullParameter(symbol, "symbol");
                        return (uv5.b) ((ne0.d) d0Var.f226551b).get(symbol);
                    default:
                        xi0.b currency3 = (xi0.b) obj2;
                        Intrinsics.checkNotNullParameter(currency3, "currency");
                        wcj.b bVar = (wcj.b) eVar.f239326c;
                        zcj.d dVar2 = (zcj.d) DBUtil.performBlocking(bVar.f296420a, true, false, new w38.v(bVar, currency3.f306286a, 21));
                        if (dVar2 == null) {
                            return null;
                        }
                        Object obj3 = bdj.a.f14605a;
                        Intrinsics.checkNotNullParameter(dVar2, "<this>");
                        String str = dVar2.f321274a;
                        String str2 = dVar2.f321275b;
                        String str3 = dVar2.f321276c;
                        String str4 = dVar2.d;
                        zcj.g gVar2 = dVar2.e;
                        if (gVar2 != null) {
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            jo3.b allTimeHigh = gVar2.getAllTimeHigh();
                            dj0.d dVarV = allTimeHigh != null ? hx7.a.v(allTimeHigh) : null;
                            Long circulatingSupply = gVar2.getCirculatingSupply();
                            jo3.b marketCap = gVar2.getMarketCap();
                            dj0.d dVarV2 = marketCap != null ? hx7.a.v(marketCap) : null;
                            Long maxSupply = gVar2.getMaxSupply();
                            Integer popularity = gVar2.getPopularity();
                            jo3.b volume24Hour = gVar2.getVolume24Hour();
                            gVar = new g(dVarV, circulatingSupply, dVarV2, maxSupply, popularity, volume24Hour != null ? hx7.a.v(volume24Hour) : null);
                        } else {
                            gVar = null;
                        }
                        zcj.e eVar2 = dVar2.f;
                        if (eVar2 != null) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            int totalBullishSignals = eVar2.getTotalBullishSignals();
                            int totalNeutralSignals = eVar2.getTotalNeutralSignals();
                            int totalBearishSignals = eVar2.getTotalBearishSignals();
                            String sentiment = eVar2.getSentiment();
                            ?? r142 = bdj.a.f14605a;
                            uv5.c cVar2 = (uv5.c) u1.t(sentiment, uv5.c.UNKNOWN, r142);
                            List signals = eVar2.getSignals();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it8 = signals.iterator();
                            while (it8.hasNext()) {
                                f fVar = (f) it8.next();
                                Intrinsics.checkNotNullParameter(fVar, "<this>");
                                String id10 = fVar.getId();
                                ?? r2 = bdj.a.f14606b;
                                Iterator it9 = it8;
                                uv5.f fVar2 = uv5.f.UNKNOWN;
                                uv5.f fVar3 = (uv5.f) u1.t(id10, fVar2, r2);
                                uv5.e eVar3 = fVar3 != fVar2 ? new uv5.e(fVar3, (uv5.c) u1.t(fVar.getSentiment(), uv5.c.UNKNOWN, r142), fVar.getTitle(), fVar.getDescription(), fVar.getUpdatedAt()) : null;
                                if (eVar3 != null) {
                                    arrayList2.add(eVar3);
                                }
                                it8 = it9;
                            }
                            dVar = new d(totalBullishSignals, totalNeutralSignals, totalBearishSignals, cVar2, arrayList2);
                        } else {
                            dVar = null;
                        }
                        zcj.a aVar2 = dVar2.f321277g;
                        if (aVar2 != null) {
                            Intrinsics.checkNotNullParameter(aVar2, "<this>");
                            aVar = new uv5.a(aVar2.getExpiresAt(), aVar2.getId(), aVar2.getTitle(), aVar2.getBody(), aVar2.getPrompt());
                        } else {
                            aVar = null;
                        }
                        List list = dVar2.f321278h;
                        if (list != null) {
                            List<h> list2 = list;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                            for (h hVar : list2) {
                                Intrinsics.checkNotNullParameter(hVar, "<this>");
                                arrayList3.add(new uv5.h(hVar.getUrl(), hVar.getIconId(), hVar.getLabel()));
                            }
                            arrayList = arrayList3;
                        } else {
                            arrayList = null;
                        }
                        return new uv5.b(str, str2, str3, str4, gVar, dVar, aVar, arrayList);
                }
            }
        });
        final int i2 = 1;
        Function1 function1 = new Function1(this) { // from class: rcj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f253293b;

            {
                this.f253293b = this;
            }

            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                g gVar;
                d dVar;
                uv5.a aVar;
                ArrayList arrayList;
                int i22 = i2;
                e eVar = this.f253293b;
                switch (i22) {
                    case 0:
                        xi0.b currency = (xi0.b) obj2;
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        efm.d0<ddj.b> cryptoDetailsAbout = ((CryptoDetailsAboutService) eVar.f239325b).getCryptoDetailsAbout(currency.f306286a);
                        c cVar = c.f;
                        k kVar = new k(19);
                        cryptoDetailsAbout.getClass();
                        i iVar = new i(cryptoDetailsAbout, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        xi0.b currency2 = (xi0.b) obj2;
                        Intrinsics.checkNotNullParameter(currency2, "currency");
                        d0 d0Var = (d0) eVar.d;
                        String symbol = currency2.f306286a;
                        Intrinsics.checkNotNullParameter(symbol, "symbol");
                        return (uv5.b) ((ne0.d) d0Var.f226551b).get(symbol);
                    default:
                        xi0.b currency3 = (xi0.b) obj2;
                        Intrinsics.checkNotNullParameter(currency3, "currency");
                        wcj.b bVar = (wcj.b) eVar.f239326c;
                        zcj.d dVar2 = (zcj.d) DBUtil.performBlocking(bVar.f296420a, true, false, new w38.v(bVar, currency3.f306286a, 21));
                        if (dVar2 == null) {
                            return null;
                        }
                        Object obj3 = bdj.a.f14605a;
                        Intrinsics.checkNotNullParameter(dVar2, "<this>");
                        String str = dVar2.f321274a;
                        String str2 = dVar2.f321275b;
                        String str3 = dVar2.f321276c;
                        String str4 = dVar2.d;
                        zcj.g gVar2 = dVar2.e;
                        if (gVar2 != null) {
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            jo3.b allTimeHigh = gVar2.getAllTimeHigh();
                            dj0.d dVarV = allTimeHigh != null ? hx7.a.v(allTimeHigh) : null;
                            Long circulatingSupply = gVar2.getCirculatingSupply();
                            jo3.b marketCap = gVar2.getMarketCap();
                            dj0.d dVarV2 = marketCap != null ? hx7.a.v(marketCap) : null;
                            Long maxSupply = gVar2.getMaxSupply();
                            Integer popularity = gVar2.getPopularity();
                            jo3.b volume24Hour = gVar2.getVolume24Hour();
                            gVar = new g(dVarV, circulatingSupply, dVarV2, maxSupply, popularity, volume24Hour != null ? hx7.a.v(volume24Hour) : null);
                        } else {
                            gVar = null;
                        }
                        zcj.e eVar2 = dVar2.f;
                        if (eVar2 != null) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            int totalBullishSignals = eVar2.getTotalBullishSignals();
                            int totalNeutralSignals = eVar2.getTotalNeutralSignals();
                            int totalBearishSignals = eVar2.getTotalBearishSignals();
                            String sentiment = eVar2.getSentiment();
                            ?? r142 = bdj.a.f14605a;
                            uv5.c cVar2 = (uv5.c) u1.t(sentiment, uv5.c.UNKNOWN, r142);
                            List signals = eVar2.getSignals();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it8 = signals.iterator();
                            while (it8.hasNext()) {
                                f fVar = (f) it8.next();
                                Intrinsics.checkNotNullParameter(fVar, "<this>");
                                String id10 = fVar.getId();
                                ?? r2 = bdj.a.f14606b;
                                Iterator it9 = it8;
                                uv5.f fVar2 = uv5.f.UNKNOWN;
                                uv5.f fVar3 = (uv5.f) u1.t(id10, fVar2, r2);
                                uv5.e eVar3 = fVar3 != fVar2 ? new uv5.e(fVar3, (uv5.c) u1.t(fVar.getSentiment(), uv5.c.UNKNOWN, r142), fVar.getTitle(), fVar.getDescription(), fVar.getUpdatedAt()) : null;
                                if (eVar3 != null) {
                                    arrayList2.add(eVar3);
                                }
                                it8 = it9;
                            }
                            dVar = new d(totalBullishSignals, totalNeutralSignals, totalBearishSignals, cVar2, arrayList2);
                        } else {
                            dVar = null;
                        }
                        zcj.a aVar2 = dVar2.f321277g;
                        if (aVar2 != null) {
                            Intrinsics.checkNotNullParameter(aVar2, "<this>");
                            aVar = new uv5.a(aVar2.getExpiresAt(), aVar2.getId(), aVar2.getTitle(), aVar2.getBody(), aVar2.getPrompt());
                        } else {
                            aVar = null;
                        }
                        List list = dVar2.f321278h;
                        if (list != null) {
                            List<h> list2 = list;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                            for (h hVar : list2) {
                                Intrinsics.checkNotNullParameter(hVar, "<this>");
                                arrayList3.add(new uv5.h(hVar.getUrl(), hVar.getIconId(), hVar.getLabel()));
                            }
                            arrayList = arrayList3;
                        } else {
                            arrayList = null;
                        }
                        return new uv5.b(str, str2, str3, str4, gVar, dVar, aVar, arrayList);
                }
            }
        };
        final int i3 = 0;
        Function2 function2 = new Function2(this) { // from class: rcj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f253295b;

            {
                this.f253295b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r26v0 */
            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v5, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v7 */
            /* JADX WARN: Type inference failed for: r5v8 */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                zcj.g gVar;
                String str;
                zcj.e eVar;
                zcj.a aVar;
                ArrayList arrayList;
                int i5 = i3;
                e eVar2 = this.f253295b;
                switch (i5) {
                    case 0:
                        xi0.b code = (xi0.b) obj2;
                        uv5.b content = (uv5.b) obj3;
                        Intrinsics.checkNotNullParameter(code, "code");
                        Intrinsics.checkNotNullParameter(content, "content");
                        d0 d0Var = (d0) eVar2.d;
                        String symbol = code.f306286a;
                        Intrinsics.checkNotNullParameter(symbol, "symbol");
                        Intrinsics.checkNotNullParameter(content, "content");
                        ((ne0.d) d0Var.f226551b).f(symbol, content);
                        break;
                    default:
                        uv5.b content2 = (uv5.b) obj3;
                        Intrinsics.checkNotNullParameter((xi0.b) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(content2, "content");
                        wcj.b bVar = (wcj.b) eVar2.f239326c;
                        Object obj4 = bdj.a.f14605a;
                        Intrinsics.checkNotNullParameter(content2, "<this>");
                        String str2 = content2.f283304a;
                        String str3 = content2.f283305b;
                        String str4 = content2.f283306c;
                        String str5 = content2.d;
                        g gVar2 = content2.e;
                        if (gVar2 != null) {
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            dj0.d dVar = gVar2.f283315a;
                            jo3.b bVarA = dVar != null ? hx7.a.A(dVar) : null;
                            Long l2 = gVar2.f283316b;
                            dj0.d dVar2 = gVar2.f283317c;
                            jo3.b bVarA2 = dVar2 != null ? hx7.a.A(dVar2) : null;
                            Long l3 = gVar2.d;
                            Integer num = gVar2.e;
                            dj0.d dVar3 = gVar2.f;
                            gVar = new zcj.g(bVarA, l2, bVarA2, l3, num, dVar3 != null ? hx7.a.A(dVar3) : null);
                        } else {
                            gVar = null;
                        }
                        d dVar4 = content2.f;
                        if (dVar4 != null) {
                            Intrinsics.checkNotNullParameter(dVar4, "<this>");
                            int i6 = dVar4.f283309a;
                            int i21 = dVar4.f283310b;
                            int i22 = dVar4.f283311c;
                            uv5.c cVar = dVar4.d;
                            ?? r56 = bdj.a.f14605a;
                            String strG = u1.g(cVar, r56);
                            ArrayList arrayList2 = dVar4.e;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                            Iterator it8 = arrayList2.iterator();
                            ?? r59 = r56;
                            while (it8.hasNext()) {
                                uv5.e eVar3 = (uv5.e) it8.next();
                                Intrinsics.checkNotNullParameter(eVar3, "<this>");
                                arrayList3.add(new f(eVar3.e, u1.g(eVar3.f283312a, bdj.a.f14606b), u1.g(eVar3.f283313b, r59), eVar3.f283314c, eVar3.d));
                                it8 = it8;
                                str2 = str2;
                                r59 = r59;
                            }
                            str = str2;
                            eVar = new zcj.e(i6, i21, i22, strG, arrayList3);
                        } else {
                            str = str2;
                            eVar = null;
                        }
                        uv5.a aVar2 = content2.f283307g;
                        if (aVar2 != null) {
                            Intrinsics.checkNotNullParameter(aVar2, "<this>");
                            aVar = new zcj.a(aVar2.e, aVar2.f283301a, aVar2.f283302b, aVar2.f283303c, aVar2.d);
                        } else {
                            aVar = null;
                        }
                        List list = content2.f283308h;
                        if (list != null) {
                            List<uv5.h> list2 = list;
                            ArrayList arrayList4 = new ArrayList(zhm.w.t(list2, 10));
                            for (uv5.h hVar : list2) {
                                Intrinsics.checkNotNullParameter(hVar, "<this>");
                                arrayList4.add(new h(hVar.f283318a, hVar.f283319b, hVar.f283320c));
                            }
                            arrayList = arrayList4;
                        } else {
                            arrayList = null;
                        }
                        zcj.d dVar5 = new zcj.d(str, str3, str4, str5, gVar, eVar, aVar, arrayList);
                        bVar.getClass();
                        DBUtil.performBlocking(bVar.f296420a, false, true, new w38.v(bVar, dVar5, 22));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i5 = 2;
        Function1 function12 = new Function1(this) { // from class: rcj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f253293b;

            {
                this.f253293b = this;
            }

            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                g gVar;
                d dVar;
                uv5.a aVar;
                ArrayList arrayList;
                int i22 = i5;
                e eVar = this.f253293b;
                switch (i22) {
                    case 0:
                        xi0.b currency = (xi0.b) obj2;
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        efm.d0<ddj.b> cryptoDetailsAbout = ((CryptoDetailsAboutService) eVar.f239325b).getCryptoDetailsAbout(currency.f306286a);
                        c cVar = c.f;
                        k kVar = new k(19);
                        cryptoDetailsAbout.getClass();
                        i iVar = new i(cryptoDetailsAbout, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        xi0.b currency2 = (xi0.b) obj2;
                        Intrinsics.checkNotNullParameter(currency2, "currency");
                        d0 d0Var = (d0) eVar.d;
                        String symbol = currency2.f306286a;
                        Intrinsics.checkNotNullParameter(symbol, "symbol");
                        return (uv5.b) ((ne0.d) d0Var.f226551b).get(symbol);
                    default:
                        xi0.b currency3 = (xi0.b) obj2;
                        Intrinsics.checkNotNullParameter(currency3, "currency");
                        wcj.b bVar = (wcj.b) eVar.f239326c;
                        zcj.d dVar2 = (zcj.d) DBUtil.performBlocking(bVar.f296420a, true, false, new w38.v(bVar, currency3.f306286a, 21));
                        if (dVar2 == null) {
                            return null;
                        }
                        Object obj3 = bdj.a.f14605a;
                        Intrinsics.checkNotNullParameter(dVar2, "<this>");
                        String str = dVar2.f321274a;
                        String str2 = dVar2.f321275b;
                        String str3 = dVar2.f321276c;
                        String str4 = dVar2.d;
                        zcj.g gVar2 = dVar2.e;
                        if (gVar2 != null) {
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            jo3.b allTimeHigh = gVar2.getAllTimeHigh();
                            dj0.d dVarV = allTimeHigh != null ? hx7.a.v(allTimeHigh) : null;
                            Long circulatingSupply = gVar2.getCirculatingSupply();
                            jo3.b marketCap = gVar2.getMarketCap();
                            dj0.d dVarV2 = marketCap != null ? hx7.a.v(marketCap) : null;
                            Long maxSupply = gVar2.getMaxSupply();
                            Integer popularity = gVar2.getPopularity();
                            jo3.b volume24Hour = gVar2.getVolume24Hour();
                            gVar = new g(dVarV, circulatingSupply, dVarV2, maxSupply, popularity, volume24Hour != null ? hx7.a.v(volume24Hour) : null);
                        } else {
                            gVar = null;
                        }
                        zcj.e eVar2 = dVar2.f;
                        if (eVar2 != null) {
                            Intrinsics.checkNotNullParameter(eVar2, "<this>");
                            int totalBullishSignals = eVar2.getTotalBullishSignals();
                            int totalNeutralSignals = eVar2.getTotalNeutralSignals();
                            int totalBearishSignals = eVar2.getTotalBearishSignals();
                            String sentiment = eVar2.getSentiment();
                            ?? r142 = bdj.a.f14605a;
                            uv5.c cVar2 = (uv5.c) u1.t(sentiment, uv5.c.UNKNOWN, r142);
                            List signals = eVar2.getSignals();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it8 = signals.iterator();
                            while (it8.hasNext()) {
                                f fVar = (f) it8.next();
                                Intrinsics.checkNotNullParameter(fVar, "<this>");
                                String id10 = fVar.getId();
                                ?? r2 = bdj.a.f14606b;
                                Iterator it9 = it8;
                                uv5.f fVar2 = uv5.f.UNKNOWN;
                                uv5.f fVar3 = (uv5.f) u1.t(id10, fVar2, r2);
                                uv5.e eVar3 = fVar3 != fVar2 ? new uv5.e(fVar3, (uv5.c) u1.t(fVar.getSentiment(), uv5.c.UNKNOWN, r142), fVar.getTitle(), fVar.getDescription(), fVar.getUpdatedAt()) : null;
                                if (eVar3 != null) {
                                    arrayList2.add(eVar3);
                                }
                                it8 = it9;
                            }
                            dVar = new d(totalBullishSignals, totalNeutralSignals, totalBearishSignals, cVar2, arrayList2);
                        } else {
                            dVar = null;
                        }
                        zcj.a aVar2 = dVar2.f321277g;
                        if (aVar2 != null) {
                            Intrinsics.checkNotNullParameter(aVar2, "<this>");
                            aVar = new uv5.a(aVar2.getExpiresAt(), aVar2.getId(), aVar2.getTitle(), aVar2.getBody(), aVar2.getPrompt());
                        } else {
                            aVar = null;
                        }
                        List list = dVar2.f321278h;
                        if (list != null) {
                            List<h> list2 = list;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                            for (h hVar : list2) {
                                Intrinsics.checkNotNullParameter(hVar, "<this>");
                                arrayList3.add(new uv5.h(hVar.getUrl(), hVar.getIconId(), hVar.getLabel()));
                            }
                            arrayList = arrayList3;
                        } else {
                            arrayList = null;
                        }
                        return new uv5.b(str, str2, str3, str4, gVar, dVar, aVar, arrayList);
                }
            }
        };
        final int i6 = 1;
        this.e = new w4l.f(bVarK0, function1, function2, function12, new Function2(this) { // from class: rcj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f253295b;

            {
                this.f253295b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r26v0 */
            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v5, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v7 */
            /* JADX WARN: Type inference failed for: r5v8 */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                zcj.g gVar;
                String str;
                zcj.e eVar;
                zcj.a aVar;
                ArrayList arrayList;
                int i59 = i6;
                e eVar2 = this.f253295b;
                switch (i59) {
                    case 0:
                        xi0.b code = (xi0.b) obj2;
                        uv5.b content = (uv5.b) obj3;
                        Intrinsics.checkNotNullParameter(code, "code");
                        Intrinsics.checkNotNullParameter(content, "content");
                        d0 d0Var = (d0) eVar2.d;
                        String symbol = code.f306286a;
                        Intrinsics.checkNotNullParameter(symbol, "symbol");
                        Intrinsics.checkNotNullParameter(content, "content");
                        ((ne0.d) d0Var.f226551b).f(symbol, content);
                        break;
                    default:
                        uv5.b content2 = (uv5.b) obj3;
                        Intrinsics.checkNotNullParameter((xi0.b) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(content2, "content");
                        wcj.b bVar = (wcj.b) eVar2.f239326c;
                        Object obj4 = bdj.a.f14605a;
                        Intrinsics.checkNotNullParameter(content2, "<this>");
                        String str2 = content2.f283304a;
                        String str3 = content2.f283305b;
                        String str4 = content2.f283306c;
                        String str5 = content2.d;
                        g gVar2 = content2.e;
                        if (gVar2 != null) {
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            dj0.d dVar = gVar2.f283315a;
                            jo3.b bVarA = dVar != null ? hx7.a.A(dVar) : null;
                            Long l2 = gVar2.f283316b;
                            dj0.d dVar2 = gVar2.f283317c;
                            jo3.b bVarA2 = dVar2 != null ? hx7.a.A(dVar2) : null;
                            Long l3 = gVar2.d;
                            Integer num = gVar2.e;
                            dj0.d dVar3 = gVar2.f;
                            gVar = new zcj.g(bVarA, l2, bVarA2, l3, num, dVar3 != null ? hx7.a.A(dVar3) : null);
                        } else {
                            gVar = null;
                        }
                        d dVar4 = content2.f;
                        if (dVar4 != null) {
                            Intrinsics.checkNotNullParameter(dVar4, "<this>");
                            int i66 = dVar4.f283309a;
                            int i21 = dVar4.f283310b;
                            int i22 = dVar4.f283311c;
                            uv5.c cVar = dVar4.d;
                            ?? r56 = bdj.a.f14605a;
                            String strG = u1.g(cVar, r56);
                            ArrayList arrayList2 = dVar4.e;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                            Iterator it8 = arrayList2.iterator();
                            ?? r59 = r56;
                            while (it8.hasNext()) {
                                uv5.e eVar3 = (uv5.e) it8.next();
                                Intrinsics.checkNotNullParameter(eVar3, "<this>");
                                arrayList3.add(new f(eVar3.e, u1.g(eVar3.f283312a, bdj.a.f14606b), u1.g(eVar3.f283313b, r59), eVar3.f283314c, eVar3.d));
                                it8 = it8;
                                str2 = str2;
                                r59 = r59;
                            }
                            str = str2;
                            eVar = new zcj.e(i66, i21, i22, strG, arrayList3);
                        } else {
                            str = str2;
                            eVar = null;
                        }
                        uv5.a aVar2 = content2.f283307g;
                        if (aVar2 != null) {
                            Intrinsics.checkNotNullParameter(aVar2, "<this>");
                            aVar = new zcj.a(aVar2.e, aVar2.f283301a, aVar2.f283302b, aVar2.f283303c, aVar2.d);
                        } else {
                            aVar = null;
                        }
                        List list = content2.f283308h;
                        if (list != null) {
                            List<uv5.h> list2 = list;
                            ArrayList arrayList4 = new ArrayList(zhm.w.t(list2, 10));
                            for (uv5.h hVar : list2) {
                                Intrinsics.checkNotNullParameter(hVar, "<this>");
                                arrayList4.add(new h(hVar.f283318a, hVar.f283319b, hVar.f283320c));
                            }
                            arrayList = arrayList4;
                        } else {
                            arrayList = null;
                        }
                        zcj.d dVar5 = new zcj.d(str, str3, str4, str5, gVar, eVar, aVar, arrayList);
                        bVar.getClass();
                        DBUtil.performBlocking(bVar.f296420a, false, true, new w38.v(bVar, dVar5, 22));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public e(CommodityPriceTargetsService service, ne0.d memoryCache, wcj.a priceTargetsInfoDao, b80.c networkStateRepository) {
        this.f239324a = 25;
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(priceTargetsInfoDao, "priceTargetsInfoDao");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        this.f239325b = service;
        this.e = memoryCache;
        this.f239326c = priceTargetsInfoDao;
        final int i = 0;
        uj0.b bVarK0 = w.k0(networkStateRepository, new Function1(this) { // from class: tcj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f269853b;

            {
                this.f269853b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Pair currencyPair = (Pair) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                        efm.d0<ucj.b> priceTargetsInfo = ((CommodityPriceTargetsService) this.f269853b.f239325b).getPriceTargetsInfo(cp5.d.d(currencyPair));
                        q qVar = new q(2, new tcg.a0(9));
                        priceTargetsInfo.getClass();
                        i iVar = new i(priceTargetsInfo, qVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                        return (ncj.b) ((ne0.d) this.f269853b.e).get(cp5.d.d(currencyPair));
                    default:
                        Intrinsics.checkNotNullParameter(currencyPair, "<destruct>");
                        xi0.b bVar = (xi0.b) currencyPair.f186385a;
                        xi0.b bVar2 = (xi0.b) currencyPair.f186386b;
                        wcj.a aVar = (wcj.a) this.f269853b.f239326c;
                        c cVar = (c) DBUtil.performBlocking(aVar.f296418a, true, false, new vx9.v(aVar, 11, bVar.f306286a, bVar2.f306286a));
                        if (cVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(cVar, "<this>");
                        xi0.b bVar3 = new xi0.b(6, cVar.f321271a, null);
                        Instant instant = cVar.f321273c;
                        List<zcj.b> list = cVar.d;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (zcj.b bVar4 : list) {
                            Intrinsics.checkNotNullParameter(bVar4, "<this>");
                            jo3.b high = bVar4.getHigh();
                            dj0.d dVarV = high != null ? hx7.a.v(high) : null;
                            dj0.d dVarV2 = hx7.a.v(bVar4.getAverage());
                            jo3.b low = bVar4.getLow();
                            dj0.d dVarV3 = low != null ? hx7.a.v(low) : null;
                            LocalDate localDate = LocalDate.parse(bVar4.getDate());
                            Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
                            arrayList.add(new ncj.a(dVarV, dVarV2, dVarV3, localDate, bVar4.getCommentary()));
                        }
                        return new ncj.b(bVar3, instant, arrayList);
                }
            }
        });
        final int i2 = 1;
        Function1 function1 = new Function1(this) { // from class: tcj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f269853b;

            {
                this.f269853b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Pair currencyPair = (Pair) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                        efm.d0<ucj.b> priceTargetsInfo = ((CommodityPriceTargetsService) this.f269853b.f239325b).getPriceTargetsInfo(cp5.d.d(currencyPair));
                        q qVar = new q(2, new tcg.a0(9));
                        priceTargetsInfo.getClass();
                        i iVar = new i(priceTargetsInfo, qVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                        return (ncj.b) ((ne0.d) this.f269853b.e).get(cp5.d.d(currencyPair));
                    default:
                        Intrinsics.checkNotNullParameter(currencyPair, "<destruct>");
                        xi0.b bVar = (xi0.b) currencyPair.f186385a;
                        xi0.b bVar2 = (xi0.b) currencyPair.f186386b;
                        wcj.a aVar = (wcj.a) this.f269853b.f239326c;
                        c cVar = (c) DBUtil.performBlocking(aVar.f296418a, true, false, new vx9.v(aVar, 11, bVar.f306286a, bVar2.f306286a));
                        if (cVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(cVar, "<this>");
                        xi0.b bVar3 = new xi0.b(6, cVar.f321271a, null);
                        Instant instant = cVar.f321273c;
                        List<zcj.b> list = cVar.d;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (zcj.b bVar4 : list) {
                            Intrinsics.checkNotNullParameter(bVar4, "<this>");
                            jo3.b high = bVar4.getHigh();
                            dj0.d dVarV = high != null ? hx7.a.v(high) : null;
                            dj0.d dVarV2 = hx7.a.v(bVar4.getAverage());
                            jo3.b low = bVar4.getLow();
                            dj0.d dVarV3 = low != null ? hx7.a.v(low) : null;
                            LocalDate localDate = LocalDate.parse(bVar4.getDate());
                            Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
                            arrayList.add(new ncj.a(dVarV, dVarV2, dVarV3, localDate, bVar4.getCommentary()));
                        }
                        return new ncj.b(bVar3, instant, arrayList);
                }
            }
        };
        final int i3 = 0;
        Function2 function2 = new Function2(this) { // from class: tcj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f269855b;

            {
                this.f269855b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Pair currencyPair = (Pair) obj2;
                ncj.b domain = (ncj.b) obj3;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ((ne0.d) this.f269855b.e).f(cp5.d.d(currencyPair), domain);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(currencyPair, "<destruct>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        xi0.b toCurrency = (xi0.b) currencyPair.f186386b;
                        wcj.a aVar = (wcj.a) this.f269855b.f239326c;
                        Intrinsics.checkNotNullParameter(domain, "<this>");
                        Intrinsics.checkNotNullParameter(toCurrency, "toCurrency");
                        String str = domain.f214221a.f306286a;
                        String str2 = toCurrency.f306286a;
                        Instant instant = domain.f214222b;
                        List<ncj.a> list = domain.f214223c;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (ncj.a aVar2 : list) {
                            Intrinsics.checkNotNullParameter(aVar2, "<this>");
                            dj0.d dVar = aVar2.f214218a;
                            jo3.b bVarA = null;
                            jo3.b bVarA2 = dVar != null ? hx7.a.A(dVar) : null;
                            jo3.b bVarA3 = hx7.a.A(aVar2.f214219b);
                            dj0.d dVar2 = aVar2.f214220c;
                            if (dVar2 != null) {
                                bVarA = hx7.a.A(dVar2);
                            }
                            String string = aVar2.d.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            arrayList.add(new zcj.b(string, aVar2.e, bVarA2, bVarA3, bVarA));
                        }
                        c cVar = new c(str, str2, instant, arrayList);
                        aVar.getClass();
                        DBUtil.performBlocking(aVar.f296418a, false, true, new w38.v(aVar, cVar, 20));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i5 = 2;
        Function1 function12 = new Function1(this) { // from class: tcj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f269853b;

            {
                this.f269853b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Pair currencyPair = (Pair) obj2;
                switch (i5) {
                    case 0:
                        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                        efm.d0<ucj.b> priceTargetsInfo = ((CommodityPriceTargetsService) this.f269853b.f239325b).getPriceTargetsInfo(cp5.d.d(currencyPair));
                        q qVar = new q(2, new tcg.a0(9));
                        priceTargetsInfo.getClass();
                        i iVar = new i(priceTargetsInfo, qVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                        return (ncj.b) ((ne0.d) this.f269853b.e).get(cp5.d.d(currencyPair));
                    default:
                        Intrinsics.checkNotNullParameter(currencyPair, "<destruct>");
                        xi0.b bVar = (xi0.b) currencyPair.f186385a;
                        xi0.b bVar2 = (xi0.b) currencyPair.f186386b;
                        wcj.a aVar = (wcj.a) this.f269853b.f239326c;
                        c cVar = (c) DBUtil.performBlocking(aVar.f296418a, true, false, new vx9.v(aVar, 11, bVar.f306286a, bVar2.f306286a));
                        if (cVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(cVar, "<this>");
                        xi0.b bVar3 = new xi0.b(6, cVar.f321271a, null);
                        Instant instant = cVar.f321273c;
                        List<zcj.b> list = cVar.d;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (zcj.b bVar4 : list) {
                            Intrinsics.checkNotNullParameter(bVar4, "<this>");
                            jo3.b high = bVar4.getHigh();
                            dj0.d dVarV = high != null ? hx7.a.v(high) : null;
                            dj0.d dVarV2 = hx7.a.v(bVar4.getAverage());
                            jo3.b low = bVar4.getLow();
                            dj0.d dVarV3 = low != null ? hx7.a.v(low) : null;
                            LocalDate localDate = LocalDate.parse(bVar4.getDate());
                            Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
                            arrayList.add(new ncj.a(dVarV, dVarV2, dVarV3, localDate, bVar4.getCommentary()));
                        }
                        return new ncj.b(bVar3, instant, arrayList);
                }
            }
        };
        final int i6 = 1;
        this.d = new w4l.f(bVarK0, function1, function2, function12, new Function2(this) { // from class: tcj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f269855b;

            {
                this.f269855b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Pair currencyPair = (Pair) obj2;
                ncj.b domain = (ncj.b) obj3;
                switch (i6) {
                    case 0:
                        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ((ne0.d) this.f269855b.e).f(cp5.d.d(currencyPair), domain);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(currencyPair, "<destruct>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        xi0.b toCurrency = (xi0.b) currencyPair.f186386b;
                        wcj.a aVar = (wcj.a) this.f269855b.f239326c;
                        Intrinsics.checkNotNullParameter(domain, "<this>");
                        Intrinsics.checkNotNullParameter(toCurrency, "toCurrency");
                        String str = domain.f214221a.f306286a;
                        String str2 = toCurrency.f306286a;
                        Instant instant = domain.f214222b;
                        List<ncj.a> list = domain.f214223c;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (ncj.a aVar2 : list) {
                            Intrinsics.checkNotNullParameter(aVar2, "<this>");
                            dj0.d dVar = aVar2.f214218a;
                            jo3.b bVarA = null;
                            jo3.b bVarA2 = dVar != null ? hx7.a.A(dVar) : null;
                            jo3.b bVarA3 = hx7.a.A(aVar2.f214219b);
                            dj0.d dVar2 = aVar2.f214220c;
                            if (dVar2 != null) {
                                bVarA = hx7.a.A(dVar2);
                            }
                            String string = aVar2.d.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            arrayList.add(new zcj.b(string, aVar2.e, bVarA2, bVarA3, bVarA));
                        }
                        c cVar = new c(str, str2, instant, arrayList);
                        aVar.getClass();
                        DBUtil.performBlocking(aVar.f296418a, false, true, new w38.v(aVar, cVar, 20));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public e(TradingOrdersService ordersService, b80.c networkStateRepository, krl.l investOrdersDao, ne0.d memoryCache) {
        this.f239324a = 0;
        Intrinsics.checkNotNullParameter(ordersService, "ordersService");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        Intrinsics.checkNotNullParameter(investOrdersDao, "investOrdersDao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f239325b = ordersService;
        this.f239326c = networkStateRepository;
        this.d = investOrdersDao;
        this.e = memoryCache;
    }

    public e(kd8.e juniorConsentInteractor, hj8.a juniorProfileInteractor, wsg.n walletInteractor, kbb.c juniorConfigInteractor) {
        this.f239324a = 5;
        Intrinsics.checkNotNullParameter(juniorConsentInteractor, "juniorConsentInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(juniorConfigInteractor, "juniorConfigInteractor");
        this.f239325b = juniorConsentInteractor;
        this.f239326c = juniorProfileInteractor;
        this.d = walletInteractor;
        this.e = juniorConfigInteractor;
    }

    public e(GlobalMarketsService service, ue0.c storage, d7h.a cache) {
        this.f239324a = 23;
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.f239325b = service;
        this.f239326c = storage;
        this.d = cache;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: t77.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ prl.e f268597b;

            {
                this.f268597b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String str;
                String str2;
                s77.g gVar;
                String str3;
                s77.d dVar;
                String str4;
                String str5;
                j jVar;
                LocalDateTime localDateTimeAtStartOfDay;
                LocalDateTime localDateTimeAtStartOfDay2;
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Market market = (Market) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(market, "market");
                        efm.d0<s77.w> marketDetails = ((GlobalMarketsService) this.f268597b.f239325b).getMarketDetails(r77.d.d(market));
                        z2 z2Var = new z2(new y2(14), 9);
                        marketDetails.getClass();
                        ufm.i iVar = new ufm.i(marketDetails, z2Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        Market market2 = (Market) obj2;
                        n marketDetails2 = (n) obj3;
                        Intrinsics.checkNotNullParameter(market2, "market");
                        Intrinsics.checkNotNullParameter(marketDetails2, "marketDetails");
                        d7h.a aVar = (d7h.a) this.f268597b.d;
                        String key = r77.d.e(market2);
                        aVar.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(marketDetails2, "marketDetails");
                        aVar.f111966a.f(key, marketDetails2);
                        break;
                    default:
                        Market market3 = (Market) obj2;
                        n marketDetails3 = (n) obj3;
                        Intrinsics.checkNotNullParameter(market3, "market");
                        Intrinsics.checkNotNullParameter(marketDetails3, "marketDetails");
                        ue0.c cVar = (ue0.c) this.f268597b.f239326c;
                        String strE = r77.d.e(market3);
                        String str6 = "<this>";
                        Intrinsics.checkNotNullParameter(marketDetails3, "<this>");
                        s77.z zVarD = r77.d.d(marketDetails3.f181841a);
                        List list = marketDetails3.f181842b;
                        ArrayList<k77.k> arrayList = marketDetails3.f181843c;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        for (k77.k kVar : arrayList) {
                            arrayList2.add(new p(kVar.f181837a, kVar.f181838b));
                        }
                        ArrayList arrayList3 = marketDetails3.d;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                        Iterator it8 = arrayList3.iterator();
                        while (it8.hasNext()) {
                            k77.p pVar = (k77.p) it8.next();
                            DateTimeFormatter dateTimeFormatter = r77.d.f252039a;
                            Intrinsics.checkNotNullParameter(pVar, str6);
                            String str7 = pVar.f181844a;
                            String str8 = pVar.f181845b;
                            String str9 = pVar.f181846c;
                            k77.d dVar2 = pVar.d;
                            Iterator it9 = it8;
                            String str10 = null;
                            if (dVar2 != null) {
                                dj0.d dVar3 = dVar2.f181828a;
                                Intrinsics.checkNotNullParameter(dVar2, str6);
                                str = str7;
                                str2 = str8;
                                long j2 = dVar3.f115082a;
                                String str11 = dVar2.f181829b.atStartOfDay().format(dateTimeFormatter);
                                Intrinsics.checkNotNullExpressionValue(str11, "format(...)");
                                dj0.d dVar4 = dVar2.f181830c;
                                Long lValueOf = dVar4 != null ? Long.valueOf(dVar4.f115082a) : null;
                                LocalDate localDate = dVar2.d;
                                gVar = new s77.g(j2, lValueOf, str11, dVar3.f115083b.f306286a, (localDate == null || (localDateTimeAtStartOfDay2 = localDate.atStartOfDay()) == null) ? null : localDateTimeAtStartOfDay2.format(dateTimeFormatter));
                            } else {
                                str = str7;
                                str2 = str8;
                                gVar = null;
                            }
                            k77.f fVar = pVar.e;
                            j jVarC = fVar != null ? r77.d.c(fVar) : null;
                            k77.f fVar2 = pVar.f;
                            j jVarC2 = fVar2 != null ? r77.d.c(fVar2) : null;
                            k77.f fVar3 = pVar.f181847g;
                            j jVarC3 = fVar3 != null ? r77.d.c(fVar3) : null;
                            k77.f fVar4 = pVar.f181848h;
                            j jVarC4 = fVar4 != null ? r77.d.c(fVar4) : null;
                            k77.b bVar = pVar.i;
                            if (bVar != null) {
                                Intrinsics.checkNotNullParameter(bVar, str6);
                                BigDecimal bigDecimal = bVar.f181825a;
                                str3 = str6;
                                String str12 = bVar.f181826b.atStartOfDay().format(dateTimeFormatter);
                                Intrinsics.checkNotNullExpressionValue(str12, "format(...)");
                                BigDecimal bigDecimal2 = bVar.f181827c;
                                LocalDate localDate2 = bVar.d;
                                if (localDate2 != null && (localDateTimeAtStartOfDay = localDate2.atStartOfDay()) != null) {
                                    str10 = localDateTimeAtStartOfDay.format(dateTimeFormatter);
                                }
                                dVar = new s77.d(bigDecimal, str12, bigDecimal2, str10);
                                jVar = jVarC;
                                str4 = str;
                                str5 = str2;
                            } else {
                                str3 = str6;
                                dVar = null;
                                str4 = str;
                                str5 = str2;
                                jVar = jVarC;
                            }
                            arrayList4.add(new c0(str4, str5, str9, gVar, jVar, jVarC2, jVarC3, jVarC4, dVar));
                            it8 = it9;
                            str6 = str3;
                        }
                        cVar.G(new s77.w(zVarD, list, arrayList2, arrayList4), strE, wim.z.d(o0.b(s77.w.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: t77.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ prl.e f268599b;

            {
                this.f268599b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Market market = (Market) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(market, "market");
                        d7h.a aVar = (d7h.a) this.f268599b.d;
                        String key = r77.d.e(market);
                        aVar.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (n) aVar.f111966a.get(key);
                    default:
                        Intrinsics.checkNotNullParameter(market, "market");
                        s77.w wVar = (s77.w) j6.a.k(s77.w.class, (ue0.c) this.f268599b.f239326c, r77.d.e(market));
                        if (wVar != null) {
                            return r77.d.b(wVar);
                        }
                        return null;
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: t77.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ prl.e f268597b;

            {
                this.f268597b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String str;
                String str2;
                s77.g gVar;
                String str3;
                s77.d dVar;
                String str4;
                String str5;
                j jVar;
                LocalDateTime localDateTimeAtStartOfDay;
                LocalDateTime localDateTimeAtStartOfDay2;
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Market market = (Market) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(market, "market");
                        efm.d0<s77.w> marketDetails = ((GlobalMarketsService) this.f268597b.f239325b).getMarketDetails(r77.d.d(market));
                        z2 z2Var = new z2(new y2(14), 9);
                        marketDetails.getClass();
                        ufm.i iVar = new ufm.i(marketDetails, z2Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        Market market2 = (Market) obj2;
                        n marketDetails2 = (n) obj3;
                        Intrinsics.checkNotNullParameter(market2, "market");
                        Intrinsics.checkNotNullParameter(marketDetails2, "marketDetails");
                        d7h.a aVar = (d7h.a) this.f268597b.d;
                        String key = r77.d.e(market2);
                        aVar.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(marketDetails2, "marketDetails");
                        aVar.f111966a.f(key, marketDetails2);
                        break;
                    default:
                        Market market3 = (Market) obj2;
                        n marketDetails3 = (n) obj3;
                        Intrinsics.checkNotNullParameter(market3, "market");
                        Intrinsics.checkNotNullParameter(marketDetails3, "marketDetails");
                        ue0.c cVar = (ue0.c) this.f268597b.f239326c;
                        String strE = r77.d.e(market3);
                        String str6 = "<this>";
                        Intrinsics.checkNotNullParameter(marketDetails3, "<this>");
                        s77.z zVarD = r77.d.d(marketDetails3.f181841a);
                        List list = marketDetails3.f181842b;
                        ArrayList<k77.k> arrayList = marketDetails3.f181843c;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        for (k77.k kVar : arrayList) {
                            arrayList2.add(new p(kVar.f181837a, kVar.f181838b));
                        }
                        ArrayList arrayList3 = marketDetails3.d;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                        Iterator it8 = arrayList3.iterator();
                        while (it8.hasNext()) {
                            k77.p pVar = (k77.p) it8.next();
                            DateTimeFormatter dateTimeFormatter = r77.d.f252039a;
                            Intrinsics.checkNotNullParameter(pVar, str6);
                            String str7 = pVar.f181844a;
                            String str8 = pVar.f181845b;
                            String str9 = pVar.f181846c;
                            k77.d dVar2 = pVar.d;
                            Iterator it9 = it8;
                            String str10 = null;
                            if (dVar2 != null) {
                                dj0.d dVar3 = dVar2.f181828a;
                                Intrinsics.checkNotNullParameter(dVar2, str6);
                                str = str7;
                                str2 = str8;
                                long j2 = dVar3.f115082a;
                                String str11 = dVar2.f181829b.atStartOfDay().format(dateTimeFormatter);
                                Intrinsics.checkNotNullExpressionValue(str11, "format(...)");
                                dj0.d dVar4 = dVar2.f181830c;
                                Long lValueOf = dVar4 != null ? Long.valueOf(dVar4.f115082a) : null;
                                LocalDate localDate = dVar2.d;
                                gVar = new s77.g(j2, lValueOf, str11, dVar3.f115083b.f306286a, (localDate == null || (localDateTimeAtStartOfDay2 = localDate.atStartOfDay()) == null) ? null : localDateTimeAtStartOfDay2.format(dateTimeFormatter));
                            } else {
                                str = str7;
                                str2 = str8;
                                gVar = null;
                            }
                            k77.f fVar = pVar.e;
                            j jVarC = fVar != null ? r77.d.c(fVar) : null;
                            k77.f fVar2 = pVar.f;
                            j jVarC2 = fVar2 != null ? r77.d.c(fVar2) : null;
                            k77.f fVar3 = pVar.f181847g;
                            j jVarC3 = fVar3 != null ? r77.d.c(fVar3) : null;
                            k77.f fVar4 = pVar.f181848h;
                            j jVarC4 = fVar4 != null ? r77.d.c(fVar4) : null;
                            k77.b bVar = pVar.i;
                            if (bVar != null) {
                                Intrinsics.checkNotNullParameter(bVar, str6);
                                BigDecimal bigDecimal = bVar.f181825a;
                                str3 = str6;
                                String str12 = bVar.f181826b.atStartOfDay().format(dateTimeFormatter);
                                Intrinsics.checkNotNullExpressionValue(str12, "format(...)");
                                BigDecimal bigDecimal2 = bVar.f181827c;
                                LocalDate localDate2 = bVar.d;
                                if (localDate2 != null && (localDateTimeAtStartOfDay = localDate2.atStartOfDay()) != null) {
                                    str10 = localDateTimeAtStartOfDay.format(dateTimeFormatter);
                                }
                                dVar = new s77.d(bigDecimal, str12, bigDecimal2, str10);
                                jVar = jVarC;
                                str4 = str;
                                str5 = str2;
                            } else {
                                str3 = str6;
                                dVar = null;
                                str4 = str;
                                str5 = str2;
                                jVar = jVarC;
                            }
                            arrayList4.add(new c0(str4, str5, str9, gVar, jVar, jVarC2, jVarC3, jVarC4, dVar));
                            it8 = it9;
                            str6 = str3;
                        }
                        cVar.G(new s77.w(zVarD, list, arrayList2, arrayList4), strE, wim.z.d(o0.b(s77.w.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: t77.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ prl.e f268599b;

            {
                this.f268599b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Market market = (Market) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(market, "market");
                        d7h.a aVar = (d7h.a) this.f268599b.d;
                        String key = r77.d.e(market);
                        aVar.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (n) aVar.f111966a.get(key);
                    default:
                        Intrinsics.checkNotNullParameter(market, "market");
                        s77.w wVar = (s77.w) j6.a.k(s77.w.class, (ue0.c) this.f268599b.f239326c, r77.d.e(market));
                        if (wVar != null) {
                            return r77.d.b(wVar);
                        }
                        return null;
                }
            }
        };
        final int i3 = 2;
        this.e = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: t77.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ prl.e f268597b;

            {
                this.f268597b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String str;
                String str2;
                s77.g gVar;
                String str3;
                s77.d dVar;
                String str4;
                String str5;
                j jVar;
                LocalDateTime localDateTimeAtStartOfDay;
                LocalDateTime localDateTimeAtStartOfDay2;
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Market market = (Market) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(market, "market");
                        efm.d0<s77.w> marketDetails = ((GlobalMarketsService) this.f268597b.f239325b).getMarketDetails(r77.d.d(market));
                        z2 z2Var = new z2(new y2(14), 9);
                        marketDetails.getClass();
                        ufm.i iVar = new ufm.i(marketDetails, z2Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        Market market2 = (Market) obj2;
                        n marketDetails2 = (n) obj3;
                        Intrinsics.checkNotNullParameter(market2, "market");
                        Intrinsics.checkNotNullParameter(marketDetails2, "marketDetails");
                        d7h.a aVar = (d7h.a) this.f268597b.d;
                        String key = r77.d.e(market2);
                        aVar.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(marketDetails2, "marketDetails");
                        aVar.f111966a.f(key, marketDetails2);
                        break;
                    default:
                        Market market3 = (Market) obj2;
                        n marketDetails3 = (n) obj3;
                        Intrinsics.checkNotNullParameter(market3, "market");
                        Intrinsics.checkNotNullParameter(marketDetails3, "marketDetails");
                        ue0.c cVar = (ue0.c) this.f268597b.f239326c;
                        String strE = r77.d.e(market3);
                        String str6 = "<this>";
                        Intrinsics.checkNotNullParameter(marketDetails3, "<this>");
                        s77.z zVarD = r77.d.d(marketDetails3.f181841a);
                        List list = marketDetails3.f181842b;
                        ArrayList<k77.k> arrayList = marketDetails3.f181843c;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        for (k77.k kVar : arrayList) {
                            arrayList2.add(new p(kVar.f181837a, kVar.f181838b));
                        }
                        ArrayList arrayList3 = marketDetails3.d;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                        Iterator it8 = arrayList3.iterator();
                        while (it8.hasNext()) {
                            k77.p pVar = (k77.p) it8.next();
                            DateTimeFormatter dateTimeFormatter = r77.d.f252039a;
                            Intrinsics.checkNotNullParameter(pVar, str6);
                            String str7 = pVar.f181844a;
                            String str8 = pVar.f181845b;
                            String str9 = pVar.f181846c;
                            k77.d dVar2 = pVar.d;
                            Iterator it9 = it8;
                            String str10 = null;
                            if (dVar2 != null) {
                                dj0.d dVar3 = dVar2.f181828a;
                                Intrinsics.checkNotNullParameter(dVar2, str6);
                                str = str7;
                                str2 = str8;
                                long j2 = dVar3.f115082a;
                                String str11 = dVar2.f181829b.atStartOfDay().format(dateTimeFormatter);
                                Intrinsics.checkNotNullExpressionValue(str11, "format(...)");
                                dj0.d dVar4 = dVar2.f181830c;
                                Long lValueOf = dVar4 != null ? Long.valueOf(dVar4.f115082a) : null;
                                LocalDate localDate = dVar2.d;
                                gVar = new s77.g(j2, lValueOf, str11, dVar3.f115083b.f306286a, (localDate == null || (localDateTimeAtStartOfDay2 = localDate.atStartOfDay()) == null) ? null : localDateTimeAtStartOfDay2.format(dateTimeFormatter));
                            } else {
                                str = str7;
                                str2 = str8;
                                gVar = null;
                            }
                            k77.f fVar = pVar.e;
                            j jVarC = fVar != null ? r77.d.c(fVar) : null;
                            k77.f fVar2 = pVar.f;
                            j jVarC2 = fVar2 != null ? r77.d.c(fVar2) : null;
                            k77.f fVar3 = pVar.f181847g;
                            j jVarC3 = fVar3 != null ? r77.d.c(fVar3) : null;
                            k77.f fVar4 = pVar.f181848h;
                            j jVarC4 = fVar4 != null ? r77.d.c(fVar4) : null;
                            k77.b bVar = pVar.i;
                            if (bVar != null) {
                                Intrinsics.checkNotNullParameter(bVar, str6);
                                BigDecimal bigDecimal = bVar.f181825a;
                                str3 = str6;
                                String str12 = bVar.f181826b.atStartOfDay().format(dateTimeFormatter);
                                Intrinsics.checkNotNullExpressionValue(str12, "format(...)");
                                BigDecimal bigDecimal2 = bVar.f181827c;
                                LocalDate localDate2 = bVar.d;
                                if (localDate2 != null && (localDateTimeAtStartOfDay = localDate2.atStartOfDay()) != null) {
                                    str10 = localDateTimeAtStartOfDay.format(dateTimeFormatter);
                                }
                                dVar = new s77.d(bigDecimal, str12, bigDecimal2, str10);
                                jVar = jVarC;
                                str4 = str;
                                str5 = str2;
                            } else {
                                str3 = str6;
                                dVar = null;
                                str4 = str;
                                str5 = str2;
                                jVar = jVarC;
                            }
                            arrayList4.add(new c0(str4, str5, str9, gVar, jVar, jVarC2, jVarC3, jVarC4, dVar));
                            it8 = it9;
                            str6 = str3;
                        }
                        cVar.G(new s77.w(zVarD, list, arrayList2, arrayList4), strE, wim.z.d(o0.b(s77.w.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public e(ang.f userInteractor, l80.e dateProvider, wzi.a incomeSorterInteractor, ge3.a analyticsPocketsInteractor) {
        this.f239324a = 13;
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(incomeSorterInteractor, "incomeSorterInteractor");
        Intrinsics.checkNotNullParameter(analyticsPocketsInteractor, "analyticsPocketsInteractor");
        this.f239325b = userInteractor;
        this.f239326c = dateProvider;
        this.d = incomeSorterInteractor;
        this.e = analyticsPocketsInteractor;
    }

    public e(wh8.b juniorCreationRepository, n0 pollingInteractor, te8.e juniorAccountInteractor, wsg.n walletInteractor) {
        this.f239324a = 10;
        Intrinsics.checkNotNullParameter(juniorCreationRepository, "juniorCreationRepository");
        Intrinsics.checkNotNullParameter(pollingInteractor, "pollingInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountInteractor, "juniorAccountInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f239325b = juniorCreationRepository;
        this.f239326c = pollingInteractor;
        this.d = juniorAccountInteractor;
        this.e = walletInteractor;
    }

    public e(kye.e balanceConverterInteractor, zf8.k juniorAccountInfoProvider, g6e.d subaccountInteractor, djb.n savingsAccountsInteractor) {
        this.f239324a = 16;
        Intrinsics.checkNotNullParameter(balanceConverterInteractor, "balanceConverterInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountInfoProvider, "juniorAccountInfoProvider");
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(savingsAccountsInteractor, "savingsAccountsInteractor");
        this.f239325b = balanceConverterInteractor;
        this.f239326c = juniorAccountInfoProvider;
        this.d = subaccountInteractor;
        this.e = savingsAccountsInteractor;
    }

    public e(u51.a topUpMethodsInteractor, uwe.j checkoutPrerequisitesExtension, sh3.a checkoutInteractor, hxe.b effectiveExtraTopUpResolver) {
        this.f239324a = 22;
        Intrinsics.checkNotNullParameter(topUpMethodsInteractor, "topUpMethodsInteractor");
        Intrinsics.checkNotNullParameter(checkoutPrerequisitesExtension, "checkoutPrerequisitesExtension");
        Intrinsics.checkNotNullParameter(checkoutInteractor, "checkoutInteractor");
        Intrinsics.checkNotNullParameter(effectiveExtraTopUpResolver, "effectiveExtraTopUpResolver");
        this.f239325b = topUpMethodsInteractor;
        this.f239326c = checkoutPrerequisitesExtension;
        this.d = checkoutInteractor;
        this.e = effectiveExtraTopUpResolver;
    }

    public e(te8.e juniorAccountInteractor, hj8.a juniorProfileInteractor, wsg.n walletInteractor, d0 commandFactory) {
        this.f239324a = 11;
        Intrinsics.checkNotNullParameter(juniorAccountInteractor, "juniorAccountInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(commandFactory, "commandFactory");
        this.f239325b = juniorAccountInteractor;
        this.f239326c = juniorProfileInteractor;
        this.d = walletInteractor;
        this.e = commandFactory;
    }

    public e(x4l.c screenerSearchDod, x4l.c screenerCollectionsDod, x4l.c screenerConfigDod, ScreenerService service) {
        this.f239324a = 12;
        Intrinsics.checkNotNullParameter(screenerSearchDod, "screenerSearchDod");
        Intrinsics.checkNotNullParameter(screenerCollectionsDod, "screenerCollectionsDod");
        Intrinsics.checkNotNullParameter(screenerConfigDod, "screenerConfigDod");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f239325b = screenerSearchDod;
        this.f239326c = screenerCollectionsDod;
        this.d = screenerConfigDod;
        this.e = service;
    }

    public e(k9.c cVar, p9.f fVar, k9.k kVar) {
        this.f239324a = 24;
        this.f239326c = fVar;
        this.f239325b = cVar;
        this.d = kVar;
        if (kVar instanceof v9.p) {
            this.e = (v9.p) kVar;
        }
    }

    public e(f0 f0Var, ifm.b bVar, AtomicBoolean atomicBoolean) {
        this.f239324a = 29;
        this.f239326c = f0Var;
        this.f239325b = bVar;
        this.d = atomicBoolean;
    }

    public e(gr6.a freelancerAccountDetailsInteractor, rbh.b pocketPickerAllowedBalanceTypesProvider, g0 tradingCurrencyCompatibilityInteractor, gte.a featureToggleInteractor) {
        this.f239324a = 7;
        Intrinsics.checkNotNullParameter(freelancerAccountDetailsInteractor, "freelancerAccountDetailsInteractor");
        Intrinsics.checkNotNullParameter(pocketPickerAllowedBalanceTypesProvider, "pocketPickerAllowedBalanceTypesProvider");
        Intrinsics.checkNotNullParameter(tradingCurrencyCompatibilityInteractor, "tradingCurrencyCompatibilityInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f239325b = freelancerAccountDetailsInteractor;
        this.f239326c = pocketPickerAllowedBalanceTypesProvider;
        this.d = tradingCurrencyCompatibilityInteractor;
        this.e = featureToggleInteractor;
    }

    public e(r41.b bVar) {
        this.f239324a = 4;
        this.f239325b = bVar;
    }

    public e(CodeEditor codeEditor) {
        this.f239324a = 2;
        this.e = codeEditor;
        this.d = codeEditor;
    }
}
