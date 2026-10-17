package cmi;

import com.revolut.navigation.deeplink.api.SharedDeeplinkApi$Toggles$DeeplinkUnifiedEnabled;
import com.revolut.navigation.deeplink.api.SharedDeeplinkApi$Toggles$UnifiedDeeplinkConfigBypassEnabled;
import grl.za;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import skm.d0;
import skm.e0;
import yhm.m;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends nri.a implements n, lg0.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hf8.b f25290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ami.f f25291c;
    public final gte.a d;
    public final r10.d e;
    public final wli.v f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fmi.b f25292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u f25293h;
    public final dmi.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final udj.p f25294j;
    public final Lazy k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Lazy f25295l;

    public m(hf8.b constraintsProvider, ami.f deeplinkDestinationHandler, gte.a featureToggleInteractor, r10.d lifecycleReporter, wli.v trampolineActivityNavigatorHolder, fmi.b parser, u stateHolder, dmi.a unifiedDeeplinkConfigProcessor, udj.p unifiedDeeplinkEligibilityChecker) {
        Intrinsics.checkNotNullParameter(constraintsProvider, "constraintsProvider");
        Intrinsics.checkNotNullParameter(deeplinkDestinationHandler, "deeplinkDestinationHandler");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(lifecycleReporter, "lifecycleReporter");
        Intrinsics.checkNotNullParameter(trampolineActivityNavigatorHolder, "trampolineActivityNavigatorHolder");
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(stateHolder, "stateHolder");
        Intrinsics.checkNotNullParameter(unifiedDeeplinkConfigProcessor, "unifiedDeeplinkConfigProcessor");
        Intrinsics.checkNotNullParameter(unifiedDeeplinkEligibilityChecker, "unifiedDeeplinkEligibilityChecker");
        this.f25290b = constraintsProvider;
        this.f25291c = deeplinkDestinationHandler;
        this.d = featureToggleInteractor;
        this.e = lifecycleReporter;
        this.f = trampolineActivityNavigatorHolder;
        this.f25292g = parser;
        this.f25293h = stateHolder;
        this.i = unifiedDeeplinkConfigProcessor;
        this.f25294j = unifiedDeeplinkEligibilityChecker;
        final int i = 0;
        this.k = yhm.j.b(new Function0(this) { // from class: cmi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f25269b;

            {
                this.f25269b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i) {
                    case 0:
                        zC = ((jte.d) this.f25269b.d).c(SharedDeeplinkApi$Toggles$DeeplinkUnifiedEnabled.f98457c);
                        break;
                    default:
                        zC = ((jte.d) this.f25269b.d).c(SharedDeeplinkApi$Toggles$UnifiedDeeplinkConfigBypassEnabled.f98459a);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
        final int i2 = 1;
        this.f25295l = yhm.j.b(new Function0(this) { // from class: cmi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f25269b;

            {
                this.f25269b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i2) {
                    case 0:
                        zC = ((jte.d) this.f25269b.d).c(SharedDeeplinkApi$Toggles$DeeplinkUnifiedEnabled.f98457c);
                        break;
                    default:
                        zC = ((jte.d) this.f25269b.d).c(SharedDeeplinkApi$Toggles$UnifiedDeeplinkConfigBypassEnabled.f98459a);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
    }

    @Override // lg0.b
    public final Object L1(String str, lg0.a aVar, Boolean bool, Continuation continuation) throws Throwable {
        zli.b bVarB;
        if (m3() && (bVarB = this.f25292g.b(str)) != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.DEBUG, "DeeplinkCoordinator", j6.a.q("Process programmatic deeplink ", bVarB.a()), null, null, 16);
            s3(bVarB);
            return t3(bVarB, aVar, wli.q.PROGRAMMATIC, continuation);
        }
        return Boolean.FALSE;
    }

    @Override // od0.e
    public final void clear() {
        u uVar = this.f25293h;
        e0.C(uVar.f25305b, null, d0.UNDISPATCHED, new r(uVar, null, 0), 1);
    }

    @Override // nri.a
    public final void i3() {
        u uVar = this.f25293h;
        uVar.d = e0.g(uVar.f25305b, null, null, new r(uVar, null, 1), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j3(cmi.d r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof cmi.g
            if (r0 == 0) goto L13
            r0 = r8
            cmi.g r0 = (cmi.g) r0
            int r1 = r0.f25276x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25276x = r1
            goto L18
        L13:
            cmi.g r0 = new cmi.g
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f25276x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cmi.d r7 = r0.u
            yhm.o.b(r8)
            goto L41
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            yhm.o.b(r8)
            r0.u = r7
            r0.f25276x = r3
            cmi.u r8 = r6.f25293h
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L41
            return r1
        L41:
            java.util.concurrent.CopyOnWriteArrayList r8 = rd0.d.f253311a
            rd0.c r0 = rd0.c.INFO
            zli.b r8 = r7.f25271a
            java.lang.String r8 = r8.a()
            java.lang.String r1 = "Processing cancelled for: "
            java.lang.String r2 = j6.a.q(r1, r8)
            r4 = 0
            r5 = 16
            java.lang.String r1 = "DeeplinkCoordinator"
            r3 = 0
            rd0.d.b(r0, r1, r2, r3, r4, r5)
            wli.q r7 = r7.f25273c
            wli.q r8 = wli.q.EXTERNAL
            if (r7 != r8) goto L63
            r6.k3()
        L63:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: cmi.m.j3(cmi.d, gim.c):java.lang.Object");
    }

    public final void k3() {
        sri.m mVar = ((wli.w) this.f).f298519a;
        if (mVar == null) {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.INFO, "DeeplinkCoordinator", "Finish trampoline: no navigator", null, null, 16);
        } else {
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.b(rd0.c.INFO, "DeeplinkCoordinator", "Finish trampoline", null, null, 16);
        }
        if (mVar != null) {
            com.google.android.gms.internal.mlkit_vision_face.a.C(null, null, null, 7, mVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l3(java.lang.String r7, clk.b r8, cmc.c r9, gim.c r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof cmi.h
            if (r0 == 0) goto L13
            r0 = r10
            cmi.h r0 = (cmi.h) r0
            int r1 = r0.f25279y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25279y = r1
            goto L18
        L13:
            cmi.h r0 = new cmi.h
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f25277w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f25279y
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            zli.b r7 = r0.v
            clk.b r8 = r0.u
            yhm.o.b(r10)
            goto L5c
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            yhm.o.b(r10)
            boolean r10 = r6.m3()
            if (r10 != 0) goto L3e
            return r4
        L3e:
            fmi.b r10 = r6.f25292g
            zli.b r10 = r10.b(r7)
            if (r10 != 0) goto L4a
            r9.invoke(r7)
            return r4
        L4a:
            r0.u = r8
            r0.v = r10
            r0.f25279y = r3
            udj.p r7 = r6.f25294j
            java.lang.Object r7 = r7.b(r10, r0)
            if (r7 != r1) goto L59
            return r1
        L59:
            r5 = r10
            r10 = r7
            r7 = r5
        L5c:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
            if (r9 != 0) goto L6a
            java.lang.String r9 = "not eligible"
            r8.invoke(r7, r9)
            return r4
        L6a:
            boolean r9 = r6.n3()
            if (r9 == 0) goto L71
            return r7
        L71:
            dmi.a r9 = r6.i
            boolean r9 = r9.a(r7)
            if (r9 != 0) goto L7f
            java.lang.String r9 = "not allowed by config"
            r8.invoke(r7, r9)
            return r4
        L7f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: cmi.m.l3(java.lang.String, clk.b, cmc.c, gim.c):java.lang.Object");
    }

    public final boolean m3() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    public final boolean n3() {
        if (((Boolean) this.f25295l.getValue()).booleanValue()) {
            return true;
        }
        od0.a aVar = od0.a.f224253a;
        return od0.a.c() == od0.l.E2E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0135, code lost:
    
        if (j3(r3, r4) == r5) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x014b, code lost:
    
        if (p3(r3, r4) == r5) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0161, code lost:
    
        if (r7.b(r4) == r5) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum o3(java.lang.String r21, wli.a r22, gim.c r23) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cmi.m.o3(java.lang.String, wli.a, gim.c):java.lang.Enum");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0163, code lost:
    
        if (j3(r12, r2) == r3) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x019c, code lost:
    
        if (j3(r12, r2) == r3) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01d4, code lost:
    
        if (r20.b(r2) == r3) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0253  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00ab -> B:25:0x00b1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p3(cmi.d r25, gim.c r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cmi.m.p3(cmi.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
    
        if (t3(r14, r13, r2, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q3(java.lang.String r13, gim.c r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof cmi.k
            if (r0 == 0) goto L13
            r0 = r14
            cmi.k r0 = (cmi.k) r0
            int r1 = r0.f25286w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25286w = r1
            goto L18
        L13:
            cmi.k r0 = new cmi.k
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f25286w
            java.lang.String r3 = "Process external deeplink "
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r14)
            goto L8c
        L2c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L34:
            yhm.o.b(r14)
            goto L63
        L38:
            yhm.o.b(r14)
            java.util.concurrent.CopyOnWriteArrayList r14 = rd0.d.f253311a
            rd0.c r6 = rd0.c.INFO
            java.lang.String r8 = j6.a.q(r3, r13)
            r10 = 0
            r11 = 16
            java.lang.String r7 = "DeeplinkCoordinator"
            r9 = 0
            rd0.d.b(r6, r7, r8, r9, r10, r11)
            clk.b r14 = new clk.b
            r2 = 8
            r14.<init>(r2)
            cmc.c r2 = new cmc.c
            r6 = 11
            r2.<init>(r6)
            r0.f25286w = r5
            java.lang.Object r14 = r12.l3(r13, r14, r2, r0)
            if (r14 != r1) goto L63
            goto L8b
        L63:
            zli.b r14 = (zli.b) r14
            if (r14 != 0) goto L6a
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            return r13
        L6a:
            java.util.concurrent.CopyOnWriteArrayList r13 = rd0.d.f253311a
            rd0.c r5 = rd0.c.INFO
            java.lang.String r13 = r14.a()
            java.lang.String r7 = j6.a.q(r3, r13)
            r9 = 0
            r10 = 16
            java.lang.String r6 = "DeeplinkCoordinator"
            r8 = 0
            rd0.d.b(r5, r6, r7, r8, r9, r10)
            lg0.a r13 = lg0.a.IGNORE
            wli.q r2 = wli.q.EXTERNAL
            r0.f25286w = r4
            java.lang.Object r13 = r12.t3(r14, r13, r2, r0)
            if (r13 != r1) goto L8c
        L8b:
            return r1
        L8c:
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: cmi.m.q3(java.lang.String, gim.c):java.lang.Object");
    }

    public final void r3(wli.o listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ami.f fVar = this.f25291c;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        fVar.f = listener;
    }

    public final void s3(zli.b deeplink) throws Throwable {
        Object objA;
        try {
            m.Companion companion = yhm.m.INSTANCE;
            r10.d dVar = this.e;
            dVar.getClass();
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            dVar.u0(deeplink, za.Opened);
            objA = Unit.f186387a;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        Throwable thA = yhm.m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0143 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t3(zli.b r18, lg0.a r19, wli.q r20, kotlin.coroutines.Continuation r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cmi.m.t3(zli.b, lg0.a, wli.q, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void u3(wli.o listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ami.f fVar = this.f25291c;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (fVar.f == listener) {
            fVar.f = null;
        }
    }

    @Override // lg0.b
    public final boolean y1(String url2) {
        zli.b deeplink;
        Intrinsics.checkNotNullParameter(url2, "url");
        if (!m3() || (deeplink = this.f25292g.b(url2)) == null) {
            return false;
        }
        ami.f fVar = this.f25291c;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ami.l lVar = fVar.f6445a;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (lVar.a(deeplink) == null) {
            jf0.c deeplink2 = n14.k.M(deeplink);
            if (fVar.f6446b.n(deeplink2) == null) {
                uli.b bVar = fVar.f6447c;
                Intrinsics.checkNotNullParameter(deeplink2, "deeplink");
                return !Intrinsics.f(bVar.c(deeplink2), bVar.f281028j);
            }
        }
        return true;
    }
}
