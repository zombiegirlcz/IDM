package com.revolut.feature.topup_screen.impl.google_pay.flow;

import aue.d;
import com.revolut.domain.models.topup.TopUpContext;
import com.revolut.feature.topup_screen.api.descriptor.GooglePayFlowDescriptor$InputData;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import e1f.c;
import io3.l;
import kotlin.jvm.internal.Intrinsics;
import ni0.g;
import oki.h;
import yki.i;
import zr5.k;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends h implements zze.b {
    public final d A;
    public final i B;
    public final GooglePayFlowDescriptor$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c0f.b f91037p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d0f.a f91038q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f91039r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ni0.a f91040s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y51.a f91041t;
    public final b0f.a u;
    public final c0f.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final gte.a f91042w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final rve.h f91043x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final vte.b f91044y;
    public final xye.d z;

    public b(GooglePayFlowDescriptor$InputData inputData, c0f.b activityResultObserver, d0f.a googlePayHelper, g msWalletPaymentDataFactory, y51.a externalCardsInteractor, b0f.a googlePayFeeDialogMapper, c0f.d topUpPaymentObserver, gte.a featureToggleInteractor, rve.h externalCardVerificationInteractor, vte.b topUpLimitsInteractor, xye.d topUpLimitsControllerInputFactory, d topUpLimitUiModelMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(activityResultObserver, "activityResultObserver");
        Intrinsics.checkNotNullParameter(googlePayHelper, "googlePayHelper");
        Intrinsics.checkNotNullParameter(msWalletPaymentDataFactory, "msWalletPaymentDataFactory");
        ni0.a msWalletConstants = ni0.a.f215612a;
        Intrinsics.checkNotNullParameter(msWalletConstants, "msWalletConstants");
        Intrinsics.checkNotNullParameter(externalCardsInteractor, "externalCardsInteractor");
        Intrinsics.checkNotNullParameter(googlePayFeeDialogMapper, "googlePayFeeDialogMapper");
        Intrinsics.checkNotNullParameter(topUpPaymentObserver, "topUpPaymentObserver");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(externalCardVerificationInteractor, "externalCardVerificationInteractor");
        Intrinsics.checkNotNullParameter(topUpLimitsInteractor, "topUpLimitsInteractor");
        Intrinsics.checkNotNullParameter(topUpLimitsControllerInputFactory, "topUpLimitsControllerInputFactory");
        Intrinsics.checkNotNullParameter(topUpLimitUiModelMapper, "topUpLimitUiModelMapper");
        this.o = inputData;
        this.f91037p = activityResultObserver;
        this.f91038q = googlePayHelper;
        this.f91039r = msWalletPaymentDataFactory;
        this.f91040s = msWalletConstants;
        this.f91041t = externalCardsInteractor;
        this.u = googlePayFeeDialogMapper;
        this.v = topUpPaymentObserver;
        this.f91042w = featureToggleInteractor;
        this.f91043x = externalCardVerificationInteractor;
        this.f91044y = topUpLimitsInteractor;
        this.z = topUpLimitsControllerInputFactory;
        this.A = topUpLimitUiModelMapper;
        this.B = d8l.d.a(this, new zo2.h(this, 25));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008e, code lost:
    
        if (r9 == r2) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable I2(com.revolut.feature.topup_screen.impl.google_pay.flow.b r7, dj0.d r8, gim.c r9) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.google_pay.flow.b.I2(com.revolut.feature.topup_screen.impl.google_pay.flow.b, dj0.d, gim.c):java.io.Serializable");
    }

    public static final ute.a J2(b bVar, xze.d dVar) {
        GooglePayFlowDescriptor$InputData googlePayFlowDescriptor$InputData = bVar.o;
        dj0.d dVar2 = googlePayFlowDescriptor$InputData.f90496a;
        String str = dVar.f309965c;
        String str2 = dVar.f309964b;
        String str3 = dVar.f309963a;
        TopUpTarget topUpTarget = googlePayFlowDescriptor$InputData.f90497b;
        l lVarB = c.b(topUpTarget);
        TopUpContext topUpContextD = googlePayFlowDescriptor$InputData.f90498c;
        if (topUpContextD == null) {
            topUpContextD = c.d(topUpTarget);
        }
        return new ute.a(dVar2, str2, str, str3, lVarB, topUpContextD);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K2(com.revolut.feature.topup_screen.impl.google_pay.flow.b r25, ute.a r26, com.revolut.feature.topup_screen.api.google_pay.models.GooglePayFee r27, gim.c r28) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.google_pay.flow.b.K2(com.revolut.feature.topup_screen.impl.google_pay.flow.b, ute.a, com.revolut.feature.topup_screen.api.google_pay.models.GooglePayFee, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ef, code lost:
    
        if (M2(r3, r7, r1) == r2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012b, code lost:
    
        if (M2(r3, r7, r1) == r2) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L2(ute.a r15, com.revolut.feature.topup_screen.api.google_pay.models.GooglePayFee r16, java.lang.String r17, gim.c r18) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.google_pay.flow.b.L2(ute.a, com.revolut.feature.topup_screen.api.google_pay.models.GooglePayFee, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new k(this, null, 24), new zg8.d(1, this, b.class, "handleGenericFlowError", "handleGenericFlowError(Ljava/lang/Throwable;)Z", 0, 23));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M2(ute.a r10, com.revolut.feature.topup_screen.api.google_pay.models.GooglePayFee r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.google_pay.flow.b.M2(ute.a, com.revolut.feature.topup_screen.api.google_pay.models.GooglePayFee, gim.c):java.lang.Object");
    }

    @Override // yki.g
    public final yki.b s() {
        return this.B;
    }
}
