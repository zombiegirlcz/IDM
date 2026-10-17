package com.revolut.biometric_verification.impl.ui.flow.launcher;

import aw0.o9;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocument;
import com.revolut.biometric_verification.api.models.BiometricVerificationStep;
import com.revolut.biometric_verification.api.navigation.BiometricVerificationFlowProvider$InputData;
import com.revolut.biometric_verification.impl.domain.models.dynamic_instructions.BiometricVerificationUserInput;
import com.revolut.biometric_verification.impl.ui.flow.launcher.BiometricVerificationLauncherFlowContract$FlowState;
import com.revolut.biometric_verification.impl.ui.flow.launcher.BiometricVerificationLauncherFlowContract$Step;
import com.revolut.camerakit.core.camerax.extras.model.ResultInternal;
import com.revolut.camerakit.revolut.ui.R$string;
import com.revolut.core.network.exceptions.HandledNetworkException;
import com.revolut.core.network.exceptions.NetworkConnectException;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.nfc_reader_documents.NfcDocument$PassportRaw;
import com.revolut.tracking.v3.VisionVerificationContext;
import dz6.n;
import eh3.s;
import eq4.g;
import es.a0;
import es.f;
import gs.a;
import gs.r;
import io.reactivex.exceptions.CompositeException;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import lr.p;
import nii.y0;
import nii.z;
import nq.b0;
import nq.c0;
import nq.d0;
import nq.e0;
import nq.g0;
import nq.i0;
import nq.j0;
import nq.l0;
import nq.t;
import nq.v;
import nq.w;
import nq.y;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.q;
import vkm.q0;
import vkm.t0;
import vkm.v1;
import vkm.z1;
import vr.j;
import vr.l;
import vw.m;
import vw.o;
import xv.u;
import yki.i;
import zhm.f0;
import zhm.h0;
import zhm.r0;
import zr.e;
import zr.k;

/* JADX INFO: loaded from: classes17.dex */
public final class d extends h implements es.b {

    @NotNull
    public static final f Companion = new f();
    public final t1j.b A;
    public final hs.a B;
    public final ds.c C;
    public final z1 D;
    public final z1 E;
    public final z1 F;
    public final z1 G;
    public l H;
    public final a0 I;
    public final String J;
    public final w0 K;
    public final qki.d L;
    public final i M;
    public final BiometricVerificationFlowProvider$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mw.a f50482p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f50483q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final sr.a f50484r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ds.a f50485s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final zr.l f50486t;
    public final py.d u;
    public final e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final fkg.a f50487w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final r f50488x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final jx0.a f50489y;
    public final tul.b z;

    public d(BiometricVerificationFlowProvider$InputData inputData, mw.a cameraKitMediaCleaner, k biometricVerificationInteractor, sr.a visionResourcesInteractor, ds.a biometricVerificationDialogMapper, zr.l biometricVerificationMediaManager, py.d cameraKitFlowStateHandler, e documentFlowStateHandler, fkg.a previewlessSelfieMediaMapper, r biometricVerificationPollingReportExtension, t31.b deviceFingerprintApi, jx0.a jwtDecoder, tul.b putDefferedUpload, t1j.b putPostVerificationToken, hs.a instructionsStrategy, ds.c errorDialogMapper, bm0.a cryptoWrapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cameraKitMediaCleaner, "cameraKitMediaCleaner");
        Intrinsics.checkNotNullParameter(biometricVerificationInteractor, "biometricVerificationInteractor");
        Intrinsics.checkNotNullParameter(visionResourcesInteractor, "visionResourcesInteractor");
        Intrinsics.checkNotNullParameter(biometricVerificationDialogMapper, "biometricVerificationDialogMapper");
        Intrinsics.checkNotNullParameter(biometricVerificationMediaManager, "biometricVerificationMediaManager");
        Intrinsics.checkNotNullParameter(cameraKitFlowStateHandler, "cameraKitFlowStateHandler");
        Intrinsics.checkNotNullParameter(documentFlowStateHandler, "documentFlowStateHandler");
        Intrinsics.checkNotNullParameter(previewlessSelfieMediaMapper, "previewlessSelfieMediaMapper");
        Intrinsics.checkNotNullParameter(biometricVerificationPollingReportExtension, "biometricVerificationPollingReportExtension");
        Intrinsics.checkNotNullParameter(deviceFingerprintApi, "deviceFingerprintApi");
        Intrinsics.checkNotNullParameter(jwtDecoder, "jwtDecoder");
        Intrinsics.checkNotNullParameter(putDefferedUpload, "putDefferedUpload");
        Intrinsics.checkNotNullParameter(putPostVerificationToken, "putPostVerificationToken");
        Intrinsics.checkNotNullParameter(instructionsStrategy, "instructionsStrategy");
        Intrinsics.checkNotNullParameter(errorDialogMapper, "errorDialogMapper");
        Intrinsics.checkNotNullParameter(cryptoWrapper, "cryptoWrapper");
        this.o = inputData;
        this.f50482p = cameraKitMediaCleaner;
        this.f50483q = biometricVerificationInteractor;
        this.f50484r = visionResourcesInteractor;
        this.f50485s = biometricVerificationDialogMapper;
        this.f50486t = biometricVerificationMediaManager;
        this.u = cameraKitFlowStateHandler;
        this.v = documentFlowStateHandler;
        this.f50487w = previewlessSelfieMediaMapper;
        this.f50488x = biometricVerificationPollingReportExtension;
        this.f50489y = jwtDecoder;
        this.z = putDefferedUpload;
        this.A = putPostVerificationToken;
        this.B = instructionsStrategy;
        this.C = errorDialogMapper;
        this.D = q.b(0, 7, null);
        this.E = q.b(0, 7, null);
        this.F = q.b(0, 7, null);
        this.G = q.b(0, 7, null);
        String str = inputData.f50453a;
        this.I = new a0(str, biometricVerificationInteractor, deviceFingerprintApi);
        rr.a aVarJ = jwtDecoder.j(str);
        String str2 = aVarJ != null ? aVarJ.f256600a.f256605a : null;
        this.J = str2;
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        VisionVerificationContext.a aVarNewBuilder = VisionVerificationContext.newBuilder();
        String strA = inputData.f50454b.a();
        aVarNewBuilder.c();
        ((VisionVerificationContext) aVarNewBuilder.f49761b).setSource(strA);
        String strB = cryptoWrapper.b(str);
        aVarNewBuilder.c();
        ((VisionVerificationContext) aVarNewBuilder.f49761b).setTokenHash(strB);
        if (str2 != null) {
            aVarNewBuilder.c();
            ((VisionVerificationContext) aVarNewBuilder.f49761b).setVerificationId(str2);
        }
        Unit unit = Unit.f186387a;
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        this.K = AnalyticsContext.Companion.a(w0VarA);
        this.L = hx7.e.b(this, new BiometricVerificationLauncherFlowContract$FlowState(null, f0.f322471a, h0.f322473a, null, null));
        this.M = d8l.d.a(this, new s(this, 23));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.biometric_verification.impl.ui.flow.launcher.d r4, vr.l r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof es.l
            if (r0 == 0) goto L13
            r0 = r6
            es.l r0 = (es.l) r0
            int r1 = r0.f128760w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128760w = r1
            goto L18
        L13:
            es.l r0 = new es.l
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f128760w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3f
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            r4.H = r5
            hs.a r6 = r4.B
            r0.f128760w = r3
            java.lang.Object r6 = r6.b(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            r5 = r6
            vr.i r5 = (vr.i) r5
            r5 = 0
            r4.H = r5
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.biometric_verification.impl.ui.flow.launcher.d.I2(com.revolut.biometric_verification.impl.ui.flow.launcher.d, vr.l, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.biometric_verification.impl.ui.flow.launcher.d r4, vr.l r5, gim.c r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof es.m
            if (r0 == 0) goto L16
            r0 = r6
            es.m r0 = (es.m) r0
            int r1 = r0.f128761w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f128761w = r1
            goto L1b
        L16:
            es.m r0 = new es.m
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f128761w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L42
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            yhm.o.b(r6)
            r4.H = r5
            hs.a r6 = r4.B
            r0.f128761w = r3
            java.lang.Object r6 = r6.c(r5, r0)
            if (r6 != r1) goto L42
            return r1
        L42:
            r5 = r6
            vr.i r5 = (vr.i) r5
            r5 = 0
            r4.H = r5
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.biometric_verification.impl.ui.flow.launcher.d.J2(com.revolut.biometric_verification.impl.ui.flow.launcher.d, vr.l, gim.c):java.lang.Object");
    }

    public static final Object K2(d dVar, l lVar, gim.i iVar) throws Throwable {
        if (dVar.B.d()) {
            dVar.l2(new es.k(dVar, lVar, null, 1), new eif.c(1, dVar, d.class, "handleFetchNextInstructionsError", "handleFetchNextInstructionsError(Ljava/lang/Throwable;)Z", 0, 14));
            return Unit.f186387a;
        }
        z1 z1Var = dVar.E;
        Unit unit = Unit.f186387a;
        Object objEmit = z1Var.emit(unit, iVar);
        return objEmit == fim.a.COROUTINE_SUSPENDED ? objEmit : unit;
    }

    public static final boolean L2(d dVar, Throwable th10) {
        dVar.getClass();
        return dVar.R2(th10, new eq8.b(dVar, new a76.c(0, dVar, d.class, "retryNextInstruction", "retryNextInstruction()V", 0, 15)));
    }

    public static final Object M2(d dVar, vr.i iVar, gim.i iVar2) throws Throwable {
        Pair pair;
        z zVar;
        Pair pair2;
        if (iVar instanceof vr.h) {
            z1 z1Var = dVar.E;
            Unit unit = Unit.f186387a;
            Object objEmit = z1Var.emit(unit, iVar2);
            return objEmit == fim.a.COROUTINE_SUSPENDED ? objEmit : unit;
        }
        if (iVar instanceof vr.f) {
            dVar.H2(dVar.L, new g(iVar, 11));
            dVar.T2(((vr.f) iVar).f291441a);
        } else {
            if (!(iVar instanceof vr.a)) {
                dVar.getClass();
                throw new NoWhenBranchMatchedException();
            }
            vr.a error = (vr.a) iVar;
            ds.c cVar = dVar.C;
            boolean z = dVar.M.d() instanceof BiometricVerificationLauncherFlowContract$Step.Document;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(error, "error");
            vr.e eVar = error.f291435a;
            Continuation continuation = null;
            if (eVar instanceof vr.c) {
                int i = ds.b.f117173a[((vr.c) eVar).f291438a.ordinal()];
                if (i == 1 || i == 2) {
                    pair2 = z ? new Pair(Integer.valueOf(R$string.vision_polling_document_default_error_title), Integer.valueOf(R$string.vision_polling_document_default_error_description)) : new Pair(Integer.valueOf(R$string.vision_error_bad_submission_title), Integer.valueOf(R$string.vision_error_bad_submission_description));
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pair2 = new Pair(Integer.valueOf(R$string.vision_error_bad_submission_title), null);
                }
                int iIntValue = ((Number) pair2.f186385a).intValue();
                Integer num = (Integer) pair2.f186386b;
                pair = new Pair(new TextLocalisedClause(iIntValue, null, null, 14), num != null ? new TextLocalisedClause(num.intValue(), null, null, 14) : null);
            } else {
                if (!(eVar instanceof vr.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                vr.d dVar2 = (vr.d) eVar;
                TextClause textClause = new TextClause(dVar2.f291439a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str = dVar2.f291440b;
                pair = new Pair(textClause, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null);
            }
            boolean z3 = error.f291437c != null;
            int i2 = ds.b.f117174b[error.f291436b.ordinal()];
            Object obj2 = pair.f186385a;
            Object obj3 = pair.f186386b;
            if (i2 == 1) {
                zVar = new z((Clause) obj2, (Clause) obj3, new TextLocalisedClause(R$string.vision_error_bad_submission_action_request_manual_review, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756);
            } else if (i2 == 2) {
                zVar = new z((Clause) obj2, (Clause) obj3, z3 ? new TextLocalisedClause(R$string.vision_error_generic_action_try_again, null, null, 14) : new TextLocalisedClause(R$string.vision_error_bad_submission_action_request_manual_review, null, null, 14), z3 ? new TextLocalisedClause(R$string.vision_error_bad_submission_action_request_manual_review, null, null, 14) : null, null, null, false, null, null, null, null, null, null, 32724);
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                zVar = new z((Clause) obj2, (Clause) obj3, z3 ? new TextLocalisedClause(R$string.vision_error_generic_action_try_again, null, null, 14) : new TextLocalisedClause(R$string.camera_capture_tips_dismiss, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756);
            }
            yji.l.a1(dVar, dVar.V2(new y0(null, zVar, false, 5)), null, null, new chf.a(dVar, error, continuation, 22), 3);
        }
        return Unit.f186387a;
    }

    public static final Object N2(d dVar, i0 i0Var, gim.i iVar) throws Throwable {
        e eVar = dVar.v;
        py.d dVar2 = dVar.u;
        dVar.f50486t.c(i0Var.f());
        if (i0Var instanceof c0) {
            Object objA = dVar2.a(new py.a(null), iVar);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
        }
        boolean z = i0Var instanceof d0;
        zr.c cVar = zr.c.f324505a;
        if (z) {
            Object objEmit = eVar.f324506a.emit(cVar, iVar);
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (objEmit != aVar) {
                objEmit = Unit.f186387a;
            }
            return objEmit == aVar ? objEmit : Unit.f186387a;
        }
        if (i0Var instanceof nq.h0) {
            Object objA2 = dVar2.a(new py.a(null), iVar);
            return objA2 == fim.a.COROUTINE_SUSPENDED ? objA2 : Unit.f186387a;
        }
        if (i0Var instanceof g0) {
            h.D2(dVar.M);
            return Unit.f186387a;
        }
        if (!(i0Var instanceof nq.f0)) {
            if (!(i0Var instanceof e0)) {
                throw new NoWhenBranchMatchedException();
            }
            Object objA3 = dVar2.a(new py.a(null), iVar);
            return objA3 == fim.a.COROUTINE_SUSPENDED ? objA3 : Unit.f186387a;
        }
        Object objEmit2 = eVar.f324506a.emit(cVar, iVar);
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        if (objEmit2 != aVar2) {
            objEmit2 = Unit.f186387a;
        }
        return objEmit2 == aVar2 ? objEmit2 : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O2(com.revolut.biometric_verification.impl.ui.flow.launcher.d r10, java.util.List r11, gim.c r12) throws java.lang.Throwable {
        /*
            boolean r0 = r12 instanceof es.t
            if (r0 == 0) goto L13
            r0 = r12
            es.t r0 = (es.t) r0
            int r1 = r0.f128772y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128772y = r1
            goto L18
        L13:
            es.t r0 = new es.t
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f128770w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f128772y
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.util.Iterator r11 = r0.v
            java.lang.String r2 = r0.u
            yhm.o.b(r12)
            r8 = r2
            goto L4e
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            yhm.o.b(r12)
            hs.a r12 = r10.B
            boolean r12 = r12.e()
            if (r12 != 0) goto L42
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L42:
            java.lang.String r12 = r10.J
            if (r12 != 0) goto L49
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L49:
            java.util.Iterator r11 = r11.iterator()
            r8 = r12
        L4e:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L98
            java.lang.Object r12 = r11.next()
            nq.t r12 = (nq.t) r12
            boolean r2 = r12 instanceof nq.o
            if (r2 == 0) goto L4e
            nq.o r12 = (nq.o) r12
            vw.a r12 = r12.f218323c
            if (r12 == 0) goto L4e
            tul.b r2 = r10.z
            java.nio.ByteBuffer r7 = r12.f292570a
            r0.getClass()
            r0.u = r8
            r0.v = r11
            r0.f128772y = r3
            java.lang.Object r12 = r2.f274637b
            r6 = r12
            lr.e r6 = (lr.e) r6
            r6.getClass()
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            lb0.b0 r4 = new lb0.b0
            r5 = 27
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object r12 = skm.e0.J(r12, r4, r0)
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            if (r12 != r2) goto L8e
            goto L90
        L8e:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L90:
            if (r12 != r2) goto L93
            goto L95
        L93:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L95:
            if (r12 != r1) goto L4e
            return r1
        L98:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.biometric_verification.impl.ui.flow.launcher.d.O2(com.revolut.biometric_verification.impl.ui.flow.launcher.d, java.util.List, gim.c):java.lang.Object");
    }

    public static final l P2(d dVar, i0 i0Var) {
        if (i0Var instanceof d0) {
            BiometricVerificationDocument biometricVerificationDocument = ((d0) i0Var).f218287c;
            return new j(new BiometricVerificationUserInput.DocumentUserInput(biometricVerificationDocument.f50375a, biometricVerificationDocument.f50376b, false));
        }
        if (i0Var instanceof nq.f0) {
            BiometricVerificationDocument biometricVerificationDocument2 = ((nq.f0) i0Var).d;
            return new j(new BiometricVerificationUserInput.DocumentUserInput(biometricVerificationDocument2.f50375a, biometricVerificationDocument2.f50376b, false));
        }
        if ((i0Var instanceof c0) || (i0Var instanceof e0) || (i0Var instanceof g0) || (i0Var instanceof nq.h0)) {
            return vr.k.f291446a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, new q0(this.D, new es.s(this, null, 0), 1), null, null, null, 7);
        yji.l.a1(this, q.Q(q.q(new dfj.f(this.L.B(new eqd.h(15)), 18)), new n(continuation, this, 17)), null, null, null, 7);
        yji.l.a1(this, new q0(this.E, new es.q(this, continuation, 1), 1), null, null, null, 7);
        yji.l.a1(this, q.Q(new t0(this.G, 1), new eh9.j(continuation, this, 3)), null, null, new es.s(this, null, 1), 3);
    }

    @Override // yki.j
    public final void M0() {
        Set set;
        rr.a aVarJ = this.f50489y.j(this.o.f50453a);
        if (aVarJ == null || (set = aVarJ.f256600a.f256606b) == null) {
            set = h0.f322473a;
        }
        H2(this.L, new a83.d0(17, set));
        this.f50482p.a();
        l2(new es.j(this, null), new eif.c(1, this, d.class, "handleFetchInitialInstructionsError", "handleFetchInitialInstructionsError(Ljava/lang/Throwable;)Z", 0, 12));
    }

    public final void Q2(vr.a aVar) {
        l jVar;
        int i = es.h.f128756a[aVar.f291436b.ordinal()];
        if (i == 1 || i == 2) {
            jVar = vr.k.f291446a;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            jVar = new j(new BiometricVerificationUserInput.SelfieUserInput(true));
        }
        l2(new es.k(this, jVar, null, 0), new eif.c(1, this, d.class, "handleFetchNextInstructionsError", "handleFetchNextInstructionsError(Ljava/lang/Throwable;)Z", 0, 13));
    }

    public final boolean R2(Throwable th10, Function0 function0) {
        boolean z;
        Intrinsics.checkNotNullParameter(th10, "<this>");
        if (th10 instanceof CompositeException) {
            List list = ((CompositeException) th10).f163108a;
            Intrinsics.checkNotNullExpressionValue(list, "getExceptions(...)");
            List list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                z = false;
            } else {
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    if (((Throwable) it8.next()) instanceof HandledNetworkException) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
        } else {
            z = th10 instanceof HandledNetworkException;
        }
        if (z) {
            s1();
            return false;
        }
        Intrinsics.checkNotNullParameter(th10, "<this>");
        if (!czi.c.x(401, th10)) {
            function0.invoke();
            return true;
        }
        this.f50485s.getClass();
        yji.l.a1(this, V2(ds.a.a()), null, null, new es.n(this, null, 0), 3);
        return true;
    }

    public final void S2(final j0 j0Var) {
        boolean z = j0Var instanceof b0;
        int i = 2;
        zr.l lVar = this.f50486t;
        Continuation continuation = null;
        if (z) {
            b0 b0Var = (b0) j0Var;
            if (b0Var instanceof y) {
                Unit unit = Unit.f186387a;
                return;
            }
            if (b0Var instanceof nq.z) {
                this.f50485s.getClass();
                yji.l.a1(this, V2(ds.a.a()), null, null, new es.n(this, null, 1), 3);
                return;
            } else {
                if (!(b0Var instanceof nq.a0)) {
                    throw new NoWhenBranchMatchedException();
                }
                lVar.c(((nq.a0) j0Var).f218282a);
                l2(new es.q(this, continuation, i), new yi5.b(26));
                Unit unit2 = Unit.f186387a;
                return;
            }
        }
        boolean z3 = j0Var instanceof nq.f0;
        final int i2 = 0;
        BiometricVerificationFlowProvider$InputData biometricVerificationFlowProvider$InputData = this.o;
        k kVar = this.f50483q;
        qki.d dVar = this.L;
        if (!z3) {
            if (!(j0Var instanceof i0)) {
                throw new NoWhenBranchMatchedException();
            }
            if (j0Var instanceof d0) {
                final int i3 = 1;
                H2(dVar, new Function1() { // from class: es.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        switch (i3) {
                            case 0:
                                BiometricVerificationLauncherFlowContract$FlowState update = (BiometricVerificationLauncherFlowContract$FlowState) obj2;
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                return BiometricVerificationLauncherFlowContract$FlowState.a(update, ((nq.f0) j0Var).d, null, null, null, null, 30);
                            default:
                                BiometricVerificationLauncherFlowContract$FlowState update2 = (BiometricVerificationLauncherFlowContract$FlowState) obj2;
                                Intrinsics.checkNotNullParameter(update2, "$this$update");
                                return BiometricVerificationLauncherFlowContract$FlowState.a(update2, ((nq.d0) j0Var).f218287c, null, null, null, null, 30);
                        }
                    }
                });
            }
            List<String> listF = ((i0) j0Var).f();
            ArrayList arrayList = new ArrayList();
            for (String str : listF) {
                t tVarA = lVar.a(str);
                Pair pair = tVarA == null ? null : new Pair(str, tVarA);
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            Map mapT = r0.t(arrayList);
            String verificationToken = biometricVerificationFlowProvider$InputData.f50453a;
            Map mediaToUpload = X2(mapT);
            kVar.getClass();
            Intrinsics.checkNotNullParameter(verificationToken, "verificationToken");
            Intrinsics.checkNotNullParameter(mediaToUpload, "mediaToUpload");
            p pVar = kVar.f324516a;
            Intrinsics.checkNotNullParameter(verificationToken, "verificationToken");
            Intrinsics.checkNotNullParameter(mediaToUpload, "mediaToUpload");
            yji.l.a1(this, new vkm.y(new es.q(this, continuation, 0), new zr.i(t1.E(new v1(new km2.n(pVar, mediaToUpload, verificationToken, (Continuation) null))), kVar, 0)), new es.p(this, j0Var, null, 1), null, new dp4.p(this, mapT, j0Var, continuation, 19), 2);
            return;
        }
        H2(dVar, new Function1() { // from class: es.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        BiometricVerificationLauncherFlowContract$FlowState update = (BiometricVerificationLauncherFlowContract$FlowState) obj2;
                        Intrinsics.checkNotNullParameter(update, "$this$update");
                        return BiometricVerificationLauncherFlowContract$FlowState.a(update, ((nq.f0) j0Var).d, null, null, null, null, 30);
                    default:
                        BiometricVerificationLauncherFlowContract$FlowState update2 = (BiometricVerificationLauncherFlowContract$FlowState) obj2;
                        Intrinsics.checkNotNullParameter(update2, "$this$update");
                        return BiometricVerificationLauncherFlowContract$FlowState.a(update2, ((nq.d0) j0Var).f218287c, null, null, null, null, 30);
                }
            }
        });
        j2 j2Var = (j2) dVar.f22677a;
        nq.f0 f0Var = (nq.f0) j0Var;
        List<String> list = f0Var.f218292b;
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : list) {
            t tVarA2 = lVar.a(str2);
            Pair pair2 = tVarA2 == null ? null : new Pair(str2, tVarA2);
            if (pair2 != null) {
                arrayList2.add(pair2);
            }
        }
        Map mapT2 = r0.t(arrayList2);
        l2(new es.n(this, null, 2), new yi5.b(26));
        String verificationToken2 = biometricVerificationFlowProvider$InputData.f50453a;
        NfcDocument$PassportRaw data = f0Var.f218293c;
        Map mediaToUpload2 = X2(mapT2);
        String str3 = ((BiometricVerificationLauncherFlowContract$FlowState) j2Var.getValue()).d;
        Integer num = ((BiometricVerificationLauncherFlowContract$FlowState) j2Var.getValue()).e;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(verificationToken2, "verificationToken");
        Intrinsics.checkNotNullParameter(data, "documentRawData");
        Intrinsics.checkNotNullParameter(mediaToUpload2, "mediaToUpload");
        p pVar2 = kVar.f324516a;
        Intrinsics.checkNotNullParameter(verificationToken2, "verificationToken");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(mediaToUpload2, "mediaToUpload");
        yji.l.a1(this, new zr.i(t1.E(new v1(new ac8.h(15, pVar2, mediaToUpload2, verificationToken2, str3, num, data, (Continuation) null))), kVar, 1), new es.p(this, j0Var, null, 0), null, new e38.c(this, j0Var, continuation, 23), 2);
    }

    public final void T2(BiometricVerificationStep biometricVerificationStep) {
        if (biometricVerificationStep instanceof BiometricVerificationStep.ActiveLiveness) {
            h.t2(this, this.M, new BiometricVerificationLauncherFlowContract$Step.ActiveLiveness((BiometricVerificationStep.ActiveLiveness) biometricVerificationStep), false, null, false, 12);
            return;
        }
        if (biometricVerificationStep instanceof BiometricVerificationStep.Document) {
            h.t2(this, this.M, new BiometricVerificationLauncherFlowContract$Step.Document((BiometricVerificationStep.Document) biometricVerificationStep), false, null, false, 12);
            return;
        }
        if (biometricVerificationStep instanceof BiometricVerificationStep.Selfie) {
            h.t2(this, this.M, new BiometricVerificationLauncherFlowContract$Step.Selfie((BiometricVerificationStep.Selfie) biometricVerificationStep), false, null, false, 12);
        } else if (biometricVerificationStep instanceof BiometricVerificationStep.PreviewlessSelfie) {
            h.t2(this, this.M, new BiometricVerificationLauncherFlowContract$Step.PreviewlessSelfie((BiometricVerificationStep.PreviewlessSelfie) biometricVerificationStep), false, null, false, 12);
        } else {
            if (!(biometricVerificationStep instanceof BiometricVerificationStep.SelfieSearch)) {
                throw new NoWhenBranchMatchedException();
            }
            h.t2(this, this.M, new BiometricVerificationLauncherFlowContract$Step.SelfieSearch((BiometricVerificationStep.SelfieSearch) biometricVerificationStep), false, null, false, 12);
        }
    }

    public final void U2(i0 i0Var, Throwable th10) {
        boolean z;
        y0 y0VarE;
        y0 y0VarD;
        Intrinsics.checkNotNullParameter(th10, "<this>");
        if (th10 instanceof CompositeException) {
            List list = ((CompositeException) th10).f163108a;
            Intrinsics.checkNotNullExpressionValue(list, "getExceptions(...)");
            List list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                z = false;
            } else {
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    if (((Throwable) it8.next()) instanceof NetworkConnectException) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
        } else {
            z = th10 instanceof NetworkConnectException;
        }
        Continuation continuation = null;
        ds.a aVar = this.f50485s;
        if (!z) {
            Intrinsics.checkNotNullParameter(th10, "<this>");
            if (!czi.c.x(408, th10)) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, "Upload media failed with:", th10, h0Var);
                if (i0Var instanceof c0) {
                    aVar.getClass();
                    y0VarD = new y0(null, new z(new TextLocalisedClause(R$string.vision_upload_error_rejection_active_liveness_title, null, null, 14), new TextLocalisedClause(R$string.vision_upload_error_rejection_active_liveness_description, null, null, 14), new TextLocalisedClause(R$string.vision_upload_error_rejection_active_liveness_action, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32500), false, 5);
                } else if (i0Var instanceof d0) {
                    aVar.getClass();
                    y0VarD = new y0(null, new z(new TextLocalisedClause(R$string.vision_upload_error_rejection_document_title, null, null, 14), new TextLocalisedClause(R$string.vision_upload_please_retake, null, null, 14), new TextLocalisedClause(R$string.vision_upload_retake_photo, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32500), false, 5);
                } else if ((i0Var instanceof nq.h0) || (i0Var instanceof g0)) {
                    aVar.getClass();
                    y0VarD = ds.a.d();
                } else if (i0Var instanceof nq.f0) {
                    aVar.getClass();
                    y0VarD = new y0(null, new z(new TextLocalisedClause(R$string.vision_upload_error_rejection_nfc_title, null, null, 14), new TextLocalisedClause(R$string.vision_upload_nfc_please_retake, null, null, 14), new TextLocalisedClause(R$string.vision_upload_retake_nfc, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32500), false, 5);
                } else {
                    if (!(i0Var instanceof e0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.getClass();
                    y0VarD = ds.a.d();
                }
                yji.l.a1(this, V2(y0VarD), null, null, new eif.j(this, i0Var, continuation, 27), 3);
                return;
            }
        }
        if (i0Var instanceof c0) {
            aVar.getClass();
            y0VarE = new y0(null, new z(new TextLocalisedClause(R$string.vision_upload_error_internet_connection_active_liveness_title, null, null, 14), new TextLocalisedClause(R$string.camera_capture_error_internet_connection, null, null, 14), new TextLocalisedClause(R$string.vision_upload_retry, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32500), false, 5);
        } else if (i0Var instanceof d0) {
            aVar.getClass();
            y0VarE = new y0(null, new z(new TextLocalisedClause(R$string.vision_upload_error_internet_connection_document_title, null, null, 14), new TextLocalisedClause(R$string.camera_capture_error_internet_connection, null, null, 14), new TextLocalisedClause(R$string.vision_upload_retry, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32500), false, 5);
        } else if ((i0Var instanceof nq.h0) || (i0Var instanceof g0)) {
            aVar.getClass();
            y0VarE = ds.a.e();
        } else if (i0Var instanceof nq.f0) {
            aVar.getClass();
            y0VarE = new y0(null, new z(new TextLocalisedClause(R$string.vision_upload_error_internet_connection_nfc_title, null, null, 14), new TextLocalisedClause(R$string.camera_capture_error_internet_connection, null, null, 14), new TextLocalisedClause(R$string.vision_upload_retry, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32500), false, 5);
        } else {
            if (!(i0Var instanceof e0)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar.getClass();
            y0VarE = ds.a.e();
        }
        yji.l.a1(this, V2(y0VarE), null, null, new e38.c(this, i0Var, continuation, 24), 3);
    }

    public final Flow V2(y0 y0Var) {
        return X1(y0.a(y0Var, null, this.o.f50456g, 3));
    }

    public final boolean W2() {
        return this.M.d() instanceof BiometricVerificationLauncherFlowContract$Step.PreviewlessSelfie;
    }

    public final Map X2(Map map) {
        Iterator it8;
        Object obj2;
        t sVar;
        t kVar;
        Object obj3;
        qki.d dVar = this.L;
        String str = ((BiometricVerificationLauncherFlowContract$FlowState) ((j2) dVar.f22677a).getValue()).d;
        Integer num = ((BiometricVerificationLauncherFlowContract$FlowState) ((j2) dVar.f22677a).getValue()).e;
        if (str == null && num == null) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(zhm.q0.b(map.size()));
        Iterator it9 = map.entrySet().iterator();
        while (it9.hasNext()) {
            Map.Entry entry = (Map.Entry) it9.next();
            Object key = entry.getKey();
            t tVar = (t) entry.getValue();
            if (tVar instanceof nq.n) {
                nq.n nVar = (nq.n) tVar;
                v vVar = nVar.f218319a;
                w scanType = vVar.f218332a;
                List list = vVar.f218333b;
                float f = vVar.f218334c;
                String str2 = str;
                int i = vVar.d;
                Integer num2 = num;
                String experiment = vVar.e;
                ResultInternal resultInternal = vVar.f;
                boolean z = vVar.f218335g;
                Iterable validationResults = vVar.f218337j;
                Intrinsics.checkNotNullParameter(scanType, "scanType");
                Intrinsics.checkNotNullParameter(experiment, "experiment");
                Intrinsics.checkNotNullParameter(validationResults, "validationResults");
                it8 = it9;
                v metadata = new v(scanType, list, f, i, experiment, resultInternal, z, str2, num2, validationResults);
                ByteBuffer bytes = nVar.f218320b;
                Intrinsics.checkNotNullParameter(metadata, "metadata");
                Intrinsics.checkNotNullParameter(bytes, "bytes");
                sVar = new nq.n(metadata, bytes);
                obj3 = key;
                str = str2;
                num = num2;
            } else {
                it8 = it9;
                String str3 = str;
                Integer num3 = num;
                if (tVar instanceof nq.r) {
                    nq.r rVar = (nq.r) tVar;
                    l0 l0Var = rVar.f218327a;
                    w scanType2 = l0Var.f218310a;
                    String str4 = l0Var.f218311b;
                    String str5 = l0Var.f218312c;
                    List list2 = l0Var.d;
                    long j2 = l0Var.e;
                    String videoSignature = l0Var.f;
                    Integer num4 = l0Var.f218313g;
                    int i2 = l0Var.f218314h;
                    String str6 = l0Var.i;
                    boolean z3 = l0Var.f218315j;
                    String experiment2 = l0Var.k;
                    ResultInternal resultInternal2 = l0Var.f218316l;
                    long j3 = l0Var.f218317m;
                    Intrinsics.checkNotNullParameter(scanType2, "scanType");
                    Intrinsics.checkNotNullParameter(videoSignature, "videoSignature");
                    Intrinsics.checkNotNullParameter(experiment2, "experiment");
                    obj2 = key;
                    l0 metadata2 = new l0(scanType2, str4, str5, list2, j2, videoSignature, num4, i2, str6, z3, experiment2, resultInternal2, j3, str3, num3);
                    str = str3;
                    num = num3;
                    o payload = rVar.f218328b;
                    Intrinsics.checkNotNullParameter(metadata2, "metadata");
                    Intrinsics.checkNotNullParameter(payload, "payload");
                    sVar = new nq.r(metadata2, payload);
                } else {
                    obj2 = key;
                    str = str3;
                    num = num3;
                    if (tVar instanceof nq.h) {
                        nq.h hVar = (nq.h) tVar;
                        w scanType3 = hVar.f218298a.f218289a;
                        Intrinsics.checkNotNullParameter(scanType3, "scanType");
                        nq.f metadata3 = new nq.f(scanType3, str, num);
                        FloatBuffer embedding = hVar.f218299b;
                        Intrinsics.checkNotNullParameter(metadata3, "metadata");
                        Intrinsics.checkNotNullParameter(embedding, "embedding");
                        sVar = new nq.h(metadata3, embedding);
                    } else if (tVar instanceof nq.o) {
                        nq.o oVar = (nq.o) tVar;
                        nq.a metadata4 = nq.a.a(oVar.f218321a, str, num);
                        ByteBuffer image = oVar.f218322b;
                        vw.a aVar = oVar.f218323c;
                        Intrinsics.checkNotNullParameter(metadata4, "metadata");
                        Intrinsics.checkNotNullParameter(image, "image");
                        sVar = new nq.o(metadata4, image, aVar);
                    } else if (tVar instanceof nq.j) {
                        nq.j jVar = (nq.j) tVar;
                        nq.a metadata5 = nq.a.a(jVar.f218302a, str, num);
                        ByteBuffer image2 = jVar.f218303b;
                        Intrinsics.checkNotNullParameter(metadata5, "metadata");
                        Intrinsics.checkNotNullParameter(image2, "image");
                        sVar = new nq.j(metadata5, image2);
                    } else {
                        if (tVar instanceof nq.p) {
                            nq.p pVar = (nq.p) tVar;
                            String id10 = pVar.f218324a;
                            w originalScanType = pVar.f218325b;
                            byte[] imageData = pVar.f218326c;
                            Intrinsics.checkNotNullParameter(id10, "id");
                            Intrinsics.checkNotNullParameter(originalScanType, "originalScanType");
                            Intrinsics.checkNotNullParameter(imageData, "imageData");
                            kVar = new nq.p(id10, originalScanType, imageData, str, num);
                        } else if (tVar instanceof nq.g) {
                            ByteBuffer bytes2 = ((nq.g) tVar).f218294a;
                            Intrinsics.checkNotNullParameter(bytes2, "bytes");
                            sVar = new nq.g(bytes2, str, num);
                        } else if (tVar instanceof nq.l) {
                            m artifact = ((nq.l) tVar).f218307a;
                            Intrinsics.checkNotNullParameter(artifact, "artifact");
                            sVar = new nq.l(artifact, str, num);
                        } else if (tVar instanceof nq.k) {
                            nq.k kVar2 = (nq.k) tVar;
                            List frameStatistics = kVar2.f218304a;
                            gv.o modelsVersions = kVar2.f218305b;
                            Intrinsics.checkNotNullParameter(frameStatistics, "frameStatistics");
                            Intrinsics.checkNotNullParameter(modelsVersions, "modelsVersions");
                            kVar = new nq.k(frameStatistics, modelsVersions, str, num);
                        } else {
                            if (!(tVar instanceof nq.s)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            u snapshot = ((nq.s) tVar).f218329a;
                            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
                            sVar = new nq.s(snapshot, str, num);
                        }
                        sVar = kVar;
                    }
                }
                obj3 = obj2;
            }
            linkedHashMap.put(obj3, sVar);
            it9 = it8;
        }
        return linkedHashMap;
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.L;
    }

    @Override // yji.l
    public final aii.n o2(aii.m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof a.c;
        es.g gVar = es.g.f128755a;
        if (z) {
            C2(new oq.c(W2()));
            return gVar;
        }
        if (event instanceof a.b) {
            C2(new oq.b(W2()));
            return gVar;
        }
        if (!(event instanceof a.C0845a)) {
            return super.o2(event);
        }
        C2(new oq.d(W2()));
        return gVar;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.M;
    }
}
