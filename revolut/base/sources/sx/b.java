package sx;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.tracking.v3.CameraCaptureContext;
import com.revolut.tracking.v3.CameraCapturePerformance;
import com.revolut.tracking.v3.CancelledCaptureChecks;
import com.revolut.tracking.v3.VisionVerificationContext;
import ev.e;
import ev.f;
import ev.g;
import ev.h;
import ev.i;
import ev.j;
import ev.k;
import ev.l;
import ev.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ss4.z;
import vkm.j2;
import vkm.q;
import zhm.d0;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iy.b f266234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j2 f266235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j2 f266236c;

    public b(iy.b experimentsInteractor) {
        Intrinsics.checkNotNullParameter(experimentsInteractor, "experimentsInteractor");
        this.f266234a = experimentsInteractor;
        this.f266235b = q.c(null);
        this.f266236c = q.c(new c(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
    }

    public static CancelledCaptureChecks a(CameraCaptureContext cameraCaptureContext, ArrayList arrayList) {
        CancelledCaptureChecks.a aVar = (CancelledCaptureChecks.a) cameraCaptureContext.getCancelledCaptureChecks().toBuilder();
        int blurry = (arrayList.contains(h.f129671a) ? 1 : 0) + cameraCaptureContext.getCancelledCaptureChecks().getBlurry();
        aVar.c();
        ((CancelledCaptureChecks) aVar.f49761b).setBlurry(blurry);
        int glare = (arrayList.contains(m.f129676a) ? 1 : 0) + cameraCaptureContext.getCancelledCaptureChecks().getGlare();
        aVar.c();
        ((CancelledCaptureChecks) aVar.f49761b).setGlare(glare);
        int overexposed = (arrayList.contains(i.f129672a) ? 1 : 0) + cameraCaptureContext.getCancelledCaptureChecks().getOverexposed();
        aVar.c();
        ((CancelledCaptureChecks) aVar.f49761b).setOverexposed(overexposed);
        int underexposed = (arrayList.contains(k.f129674a) ? 1 : 0) + cameraCaptureContext.getCancelledCaptureChecks().getUnderexposed();
        aVar.c();
        ((CancelledCaptureChecks) aVar.f49761b).setUnderexposed(underexposed);
        int subjectTooFar = (arrayList.contains(l.f129675a) ? 1 : 0) + cameraCaptureContext.getCancelledCaptureChecks().getSubjectTooFar();
        aVar.c();
        ((CancelledCaptureChecks) aVar.f49761b).setSubjectTooFar(subjectTooFar);
        int subjectTooClose = (arrayList.contains(j.f129673a) ? 1 : 0) + cameraCaptureContext.getCancelledCaptureChecks().getSubjectTooClose();
        aVar.c();
        ((CancelledCaptureChecks) aVar.f49761b).setSubjectTooClose(subjectTooClose);
        int subjectPresent = (arrayList.contains(f.f129669a) ? 1 : 0) + cameraCaptureContext.getCancelledCaptureChecks().getSubjectPresent();
        aVar.c();
        ((CancelledCaptureChecks) aVar.f49761b).setSubjectPresent(subjectPresent);
        int subjectRotated = (arrayList.contains(g.f129670a) ? 1 : 0) + cameraCaptureContext.getCancelledCaptureChecks().getSubjectRotated();
        aVar.c();
        ((CancelledCaptureChecks) aVar.f49761b).setSubjectRotated(subjectRotated);
        int mrzUnreadable = (arrayList.contains(e.f129668a) ? 1 : 0) + cameraCaptureContext.getCancelledCaptureChecks().getMrzUnreadable();
        aVar.c();
        ((CancelledCaptureChecks) aVar.f49761b).setMrzUnreadable(mrzUnreadable);
        w0 w0VarA = aVar.a();
        Intrinsics.checkNotNullExpressionValue(w0VarA, "build(...)");
        return (CancelledCaptureChecks) w0VarA;
    }

    public static int c(xv.l lVar, Function1 function1) {
        Iterable iterableA = lVar.a();
        if ((iterableA instanceof Collection) && ((Collection) iterableA).isEmpty()) {
            return 0;
        }
        Iterator it8 = iterableA.iterator();
        while (it8.hasNext()) {
            if (((Boolean) function1.invoke(it8.next())).booleanValue()) {
                return 1;
            }
        }
        return 0;
    }

    public final String b() {
        iy.a aVar = px.a.e;
        iy.b bVar = this.f266234a;
        String[] elements = {bVar.a(aVar) ? "documentClassificationPrompting" : null, bVar.a(px.a.i) ? "nfcOnTouchActivation" : null, bVar.a(px.a.f240493g) ? "zebraUi" : null, "zebraUiDocuments", bVar.a(px.a.f240494h) ? "zebraUiActiveLiveness" : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d0.k0(d.L(elements), ",", null, null, 0, null, 62);
    }

    public final void d(xv.l detectorResult, gv.d screenFlashState) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(detectorResult, "detectorResult");
        Intrinsics.checkNotNullParameter(screenFlashState, "screenFlashState");
        j2 j2Var = this.f266236c;
        c cVar = (c) j2Var.getValue();
        int i3 = cVar.f266237a + 1;
        int iC = c(detectorResult, new z(19)) + cVar.f266238b;
        int iC2 = c(detectorResult, new z(22)) + cVar.f266239c;
        int iC3 = c(detectorResult, new z(23)) + cVar.d;
        int i5 = cVar.e;
        Iterable<xv.q> iterableA = detectorResult.a();
        if ((iterableA instanceof Collection) && ((Collection) iterableA).isEmpty()) {
            i = 0;
        } else {
            for (xv.q validatorResult : iterableA) {
                Intrinsics.checkNotNullParameter(validatorResult, "validatorResult");
                if ((validatorResult instanceof b10.b) && ((b10.b) validatorResult).f11699a != null) {
                    i = 1;
                    break;
                }
            }
            i = 0;
        }
        int i6 = i + i5;
        int iC4 = c(detectorResult, new z(24)) + cVar.f;
        int iC5 = c(detectorResult, new z(25)) + cVar.f266241h;
        int iC6 = c(detectorResult, new z(26)) + cVar.f266240g;
        int iC7 = c(detectorResult, new z(27)) + cVar.i;
        int i21 = cVar.f266242j;
        Iterable<xv.q> iterableA2 = detectorResult.a();
        if ((iterableA2 instanceof Collection) && ((Collection) iterableA2).isEmpty()) {
            i2 = 0;
        } else {
            for (xv.q validatorResult2 : iterableA2) {
                Intrinsics.checkNotNullParameter(validatorResult2, "validatorResult");
                if (validatorResult2 instanceof x00.c) {
                    i2 = 1;
                    break;
                }
            }
            i2 = 0;
        }
        c cVar2 = new c(i3, iC, iC2, iC3, i6, iC4, iC6, iC5, iC7, i21 + i2, cVar.k + (screenFlashState instanceof gv.c ? 1 : 0), c(detectorResult, new z(18)) + cVar.f266243l, c(detectorResult, new z(20)) + cVar.f266244m, c(detectorResult, new z(21)) + cVar.f266245n);
        j2Var.getClass();
        j2Var.g(null, cVar2);
    }

    public final AnalyticsContext e() {
        return (AnalyticsContext) this.f266235b.getValue();
    }

    public final void f(w0 w0Var) {
        CameraCaptureContext stepCaptureContext;
        boolean z = w0Var instanceof VisionVerificationContext;
        j2 j2Var = this.f266235b;
        if (z) {
            VisionVerificationContext visionVerificationContext = (VisionVerificationContext) w0Var;
            VisionVerificationContext.Inner_context innerContext = visionVerificationContext.getInnerContext();
            if (innerContext != null && (stepCaptureContext = innerContext.getStepCaptureContext()) != null) {
                AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                VisionVerificationContext.a aVar = (VisionVerificationContext.a) visionVerificationContext.toBuilder();
                VisionVerificationContext.Inner_context.a aVar2 = (VisionVerificationContext.Inner_context.a) innerContext.toBuilder();
                CameraCaptureContext.a aVar3 = (CameraCaptureContext.a) stepCaptureContext.toBuilder();
                String strB = b();
                aVar3.c();
                ((CameraCaptureContext) aVar3.f49761b).setExperiment(strB);
                w0 w0VarA = aVar3.a();
                Intrinsics.checkNotNullExpressionValue(w0VarA, "build(...)");
                aVar2.h((CameraCaptureContext) w0VarA);
                aVar.h((VisionVerificationContext.Inner_context) aVar2.a());
                w0 w0VarA2 = aVar.a();
                companion.getClass();
                r6.b.q(AnalyticsContext.Companion.a(w0VarA2), j2Var, null);
            }
        } else if (w0Var instanceof CameraCaptureContext) {
            AnalyticsContext.Companion companion2 = AnalyticsContext.INSTANCE;
            CameraCaptureContext.a aVar4 = (CameraCaptureContext.a) ((CameraCaptureContext) w0Var).toBuilder();
            String strB2 = b();
            aVar4.c();
            ((CameraCaptureContext) aVar4.f49761b).setExperiment(strB2);
            w0 w0VarA3 = aVar4.a();
            Intrinsics.checkNotNullExpressionValue(w0VarA3, "build(...)");
            companion2.getClass();
            r6.b.q(AnalyticsContext.Companion.a((CameraCaptureContext) w0VarA3), j2Var, null);
        }
        c cVar = new c(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        j2 j2Var2 = this.f266236c;
        j2Var2.getClass();
        j2Var2.g(null, cVar);
    }

    public final void g() {
        CameraCaptureContext stepCaptureContext;
        AnalyticsContext analyticsContextE = e();
        if (analyticsContextE != null) {
            w0 w0Var = analyticsContextE.f50296a;
            boolean z = w0Var instanceof VisionVerificationContext;
            j2 j2Var = this.f266236c;
            j2 j2Var2 = this.f266235b;
            if (!z) {
                if (w0Var instanceof CameraCaptureContext) {
                    AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                    c cVar = (c) j2Var.getValue();
                    CameraCaptureContext.a aVar = (CameraCaptureContext.a) ((CameraCaptureContext) w0Var).toBuilder();
                    int i = cVar.f266237a;
                    aVar.c();
                    ((CameraCaptureContext) aVar.f49761b).setClassifiedFrameCount(i);
                    CancelledCaptureChecks.a aVarNewBuilder = CancelledCaptureChecks.newBuilder();
                    int i2 = cVar.f266238b;
                    aVarNewBuilder.c();
                    ((CancelledCaptureChecks) aVarNewBuilder.f49761b).setSubjectPresent(i2);
                    int i3 = cVar.f266239c;
                    aVarNewBuilder.c();
                    ((CancelledCaptureChecks) aVarNewBuilder.f49761b).setSubjectTooFar(i3);
                    int i5 = cVar.d;
                    aVarNewBuilder.c();
                    ((CancelledCaptureChecks) aVarNewBuilder.f49761b).setSubjectTooClose(i5);
                    int i6 = cVar.e;
                    aVarNewBuilder.c();
                    ((CancelledCaptureChecks) aVarNewBuilder.f49761b).setSubjectRotated(i6);
                    int i21 = cVar.f;
                    aVarNewBuilder.c();
                    ((CancelledCaptureChecks) aVarNewBuilder.f49761b).setBlurry(i21);
                    int i22 = cVar.f266240g;
                    aVarNewBuilder.c();
                    ((CancelledCaptureChecks) aVarNewBuilder.f49761b).setUnderexposed(i22);
                    int i32 = cVar.f266241h;
                    aVarNewBuilder.c();
                    ((CancelledCaptureChecks) aVarNewBuilder.f49761b).setOverexposed(i32);
                    int i33 = cVar.i;
                    aVarNewBuilder.c();
                    ((CancelledCaptureChecks) aVarNewBuilder.f49761b).setGlare(i33);
                    int i43 = cVar.f266242j;
                    aVarNewBuilder.c();
                    ((CancelledCaptureChecks) aVarNewBuilder.f49761b).setMrzUnreadable(i43);
                    int i59 = cVar.k;
                    aVarNewBuilder.c();
                    ((CancelledCaptureChecks) aVarNewBuilder.f49761b).setEnableTorch(i59);
                    int i66 = cVar.f266243l;
                    aVarNewBuilder.c();
                    ((CancelledCaptureChecks) aVarNewBuilder.f49761b).setOccluded(i66);
                    int i74 = cVar.f266244m;
                    aVarNewBuilder.c();
                    ((CancelledCaptureChecks) aVarNewBuilder.f49761b).setColorized(i74);
                    int i92 = cVar.f266245n;
                    aVarNewBuilder.c();
                    ((CancelledCaptureChecks) aVarNewBuilder.f49761b).setEyesClosed(i92);
                    CancelledCaptureChecks cancelledCaptureChecks = (CancelledCaptureChecks) aVarNewBuilder.a();
                    aVar.c();
                    ((CameraCaptureContext) aVar.f49761b).setFailedChecksFrameCount(cancelledCaptureChecks);
                    w0 w0VarA = aVar.a();
                    Intrinsics.checkNotNullExpressionValue(w0VarA, "build(...)");
                    companion.getClass();
                    r6.b.q(AnalyticsContext.Companion.a((CameraCaptureContext) w0VarA), j2Var2, null);
                    return;
                }
                return;
            }
            VisionVerificationContext visionVerificationContext = (VisionVerificationContext) w0Var;
            VisionVerificationContext.Inner_context innerContext = visionVerificationContext.getInnerContext();
            if (innerContext == null || (stepCaptureContext = innerContext.getStepCaptureContext()) == null) {
                return;
            }
            AnalyticsContext.Companion companion2 = AnalyticsContext.INSTANCE;
            VisionVerificationContext.a aVar2 = (VisionVerificationContext.a) visionVerificationContext.toBuilder();
            VisionVerificationContext.Inner_context.a aVar3 = (VisionVerificationContext.Inner_context.a) innerContext.toBuilder();
            c cVar2 = (c) j2Var.getValue();
            CameraCaptureContext.a aVar4 = (CameraCaptureContext.a) stepCaptureContext.toBuilder();
            int i96 = cVar2.f266237a;
            aVar4.c();
            ((CameraCaptureContext) aVar4.f49761b).setClassifiedFrameCount(i96);
            CancelledCaptureChecks.a aVarNewBuilder2 = CancelledCaptureChecks.newBuilder();
            int i99 = cVar2.f266238b;
            aVarNewBuilder2.c();
            ((CancelledCaptureChecks) aVarNewBuilder2.f49761b).setSubjectPresent(i99);
            int i100 = cVar2.f266239c;
            aVarNewBuilder2.c();
            ((CancelledCaptureChecks) aVarNewBuilder2.f49761b).setSubjectTooFar(i100);
            int i101 = cVar2.d;
            aVarNewBuilder2.c();
            ((CancelledCaptureChecks) aVarNewBuilder2.f49761b).setSubjectTooClose(i101);
            int i102 = cVar2.e;
            aVarNewBuilder2.c();
            ((CancelledCaptureChecks) aVarNewBuilder2.f49761b).setSubjectRotated(i102);
            int i103 = cVar2.f;
            aVarNewBuilder2.c();
            ((CancelledCaptureChecks) aVarNewBuilder2.f49761b).setBlurry(i103);
            int i104 = cVar2.f266240g;
            aVarNewBuilder2.c();
            ((CancelledCaptureChecks) aVarNewBuilder2.f49761b).setUnderexposed(i104);
            int i105 = cVar2.f266241h;
            aVarNewBuilder2.c();
            ((CancelledCaptureChecks) aVarNewBuilder2.f49761b).setOverexposed(i105);
            int i106 = cVar2.i;
            aVarNewBuilder2.c();
            ((CancelledCaptureChecks) aVarNewBuilder2.f49761b).setGlare(i106);
            int i107 = cVar2.f266242j;
            aVarNewBuilder2.c();
            ((CancelledCaptureChecks) aVarNewBuilder2.f49761b).setMrzUnreadable(i107);
            int i108 = cVar2.k;
            aVarNewBuilder2.c();
            ((CancelledCaptureChecks) aVarNewBuilder2.f49761b).setEnableTorch(i108);
            int i109 = cVar2.f266243l;
            aVarNewBuilder2.c();
            ((CancelledCaptureChecks) aVarNewBuilder2.f49761b).setOccluded(i109);
            int i110 = cVar2.f266244m;
            aVarNewBuilder2.c();
            ((CancelledCaptureChecks) aVarNewBuilder2.f49761b).setColorized(i110);
            int i111 = cVar2.f266245n;
            aVarNewBuilder2.c();
            ((CancelledCaptureChecks) aVarNewBuilder2.f49761b).setEyesClosed(i111);
            CancelledCaptureChecks cancelledCaptureChecks2 = (CancelledCaptureChecks) aVarNewBuilder2.a();
            aVar4.c();
            ((CameraCaptureContext) aVar4.f49761b).setFailedChecksFrameCount(cancelledCaptureChecks2);
            w0 w0VarA2 = aVar4.a();
            Intrinsics.checkNotNullExpressionValue(w0VarA2, "build(...)");
            aVar3.h((CameraCaptureContext) w0VarA2);
            aVar2.h((VisionVerificationContext.Inner_context) aVar3.a());
            w0 w0VarA3 = aVar2.a();
            companion2.getClass();
            r6.b.q(AnalyticsContext.Companion.a(w0VarA3), j2Var2, null);
        }
    }

    public final void h(boolean z) {
        CameraCaptureContext stepCaptureContext;
        AnalyticsContext analyticsContextE = e();
        if (analyticsContextE != null) {
            w0 w0Var = analyticsContextE.f50296a;
            boolean z3 = w0Var instanceof VisionVerificationContext;
            j2 j2Var = this.f266235b;
            if (!z3) {
                if (w0Var instanceof CameraCaptureContext) {
                    AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                    CameraCaptureContext.a aVar = (CameraCaptureContext.a) ((CameraCaptureContext) w0Var).toBuilder();
                    aVar.c();
                    ((CameraCaptureContext) aVar.f49761b).setSuccessfulCapture(z);
                    w0 w0VarA = aVar.a();
                    Intrinsics.checkNotNullExpressionValue(w0VarA, "build(...)");
                    companion.getClass();
                    r6.b.q(AnalyticsContext.Companion.a((CameraCaptureContext) w0VarA), j2Var, null);
                    return;
                }
                return;
            }
            VisionVerificationContext visionVerificationContext = (VisionVerificationContext) w0Var;
            VisionVerificationContext.Inner_context innerContext = visionVerificationContext.getInnerContext();
            if (innerContext == null || (stepCaptureContext = innerContext.getStepCaptureContext()) == null) {
                return;
            }
            AnalyticsContext.Companion companion2 = AnalyticsContext.INSTANCE;
            VisionVerificationContext.a aVar2 = (VisionVerificationContext.a) visionVerificationContext.toBuilder();
            VisionVerificationContext.Inner_context.a aVar3 = (VisionVerificationContext.Inner_context.a) innerContext.toBuilder();
            CameraCaptureContext.a aVar4 = (CameraCaptureContext.a) stepCaptureContext.toBuilder();
            aVar4.c();
            ((CameraCaptureContext) aVar4.f49761b).setSuccessfulCapture(z);
            w0 w0VarA2 = aVar4.a();
            Intrinsics.checkNotNullExpressionValue(w0VarA2, "build(...)");
            aVar3.h((CameraCaptureContext) w0VarA2);
            aVar2.h((VisionVerificationContext.Inner_context) aVar3.a());
            w0 w0VarA3 = aVar2.a();
            companion2.getClass();
            r6.b.q(AnalyticsContext.Companion.a(w0VarA3), j2Var, null);
        }
    }

    public final void i(ww.c framePerformance) {
        CameraCaptureContext stepCaptureContext;
        Intrinsics.checkNotNullParameter(framePerformance, "framePerformance");
        AnalyticsContext analyticsContextE = e();
        if (analyticsContextE != null) {
            w0 w0Var = analyticsContextE.f50296a;
            boolean z = w0Var instanceof VisionVerificationContext;
            j2 j2Var = this.f266235b;
            if (!z) {
                if (w0Var instanceof CameraCaptureContext) {
                    AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                    CameraCaptureContext.a aVar = (CameraCaptureContext.a) ((CameraCaptureContext) w0Var).toBuilder();
                    CameraCapturePerformance.a aVarNewBuilder = CameraCapturePerformance.newBuilder();
                    double d = framePerformance.f300566a;
                    aVarNewBuilder.c();
                    ((CameraCapturePerformance) aVarNewBuilder.f49761b).setTimeUntilFirstValueReceived(d);
                    double d5 = framePerformance.f300567b;
                    aVarNewBuilder.c();
                    ((CameraCapturePerformance) aVarNewBuilder.f49761b).setAverageTimeBetweenValues(d5);
                    CameraCapturePerformance cameraCapturePerformance = (CameraCapturePerformance) aVarNewBuilder.a();
                    aVar.c();
                    ((CameraCaptureContext) aVar.f49761b).setClassificationPerformance(cameraCapturePerformance);
                    w0 w0VarA = aVar.a();
                    Intrinsics.checkNotNullExpressionValue(w0VarA, "build(...)");
                    companion.getClass();
                    r6.b.q(AnalyticsContext.Companion.a((CameraCaptureContext) w0VarA), j2Var, null);
                    return;
                }
                return;
            }
            VisionVerificationContext visionVerificationContext = (VisionVerificationContext) w0Var;
            VisionVerificationContext.Inner_context innerContext = visionVerificationContext.getInnerContext();
            if (innerContext == null || (stepCaptureContext = innerContext.getStepCaptureContext()) == null) {
                return;
            }
            AnalyticsContext.Companion companion2 = AnalyticsContext.INSTANCE;
            VisionVerificationContext.a aVar2 = (VisionVerificationContext.a) visionVerificationContext.toBuilder();
            VisionVerificationContext.Inner_context.a aVar3 = (VisionVerificationContext.Inner_context.a) innerContext.toBuilder();
            CameraCaptureContext.a aVar4 = (CameraCaptureContext.a) stepCaptureContext.toBuilder();
            CameraCapturePerformance.a aVarNewBuilder2 = CameraCapturePerformance.newBuilder();
            double d6 = framePerformance.f300566a;
            aVarNewBuilder2.c();
            ((CameraCapturePerformance) aVarNewBuilder2.f49761b).setTimeUntilFirstValueReceived(d6);
            double d10 = framePerformance.f300567b;
            aVarNewBuilder2.c();
            ((CameraCapturePerformance) aVarNewBuilder2.f49761b).setAverageTimeBetweenValues(d10);
            CameraCapturePerformance cameraCapturePerformance2 = (CameraCapturePerformance) aVarNewBuilder2.a();
            aVar4.c();
            ((CameraCaptureContext) aVar4.f49761b).setClassificationPerformance(cameraCapturePerformance2);
            w0 w0VarA2 = aVar4.a();
            Intrinsics.checkNotNullExpressionValue(w0VarA2, "build(...)");
            aVar3.h((CameraCaptureContext) w0VarA2);
            aVar2.h((VisionVerificationContext.Inner_context) aVar3.a());
            w0 w0VarA3 = aVar2.a();
            companion2.getClass();
            r6.b.q(AnalyticsContext.Companion.a(w0VarA3), j2Var, null);
        }
    }

    public final void j(double d) {
        CameraCaptureContext stepCaptureContext;
        AnalyticsContext analyticsContextE = e();
        if (analyticsContextE != null) {
            w0 w0Var = analyticsContextE.f50296a;
            boolean z = w0Var instanceof VisionVerificationContext;
            j2 j2Var = this.f266235b;
            if (!z) {
                if (w0Var instanceof CameraCaptureContext) {
                    AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                    CameraCaptureContext.a aVar = (CameraCaptureContext.a) ((CameraCaptureContext) w0Var).toBuilder();
                    aVar.c();
                    ((CameraCaptureContext) aVar.f49761b).setCameraInitTime(d);
                    w0 w0VarA = aVar.a();
                    Intrinsics.checkNotNullExpressionValue(w0VarA, "build(...)");
                    companion.getClass();
                    r6.b.q(AnalyticsContext.Companion.a((CameraCaptureContext) w0VarA), j2Var, null);
                    return;
                }
                return;
            }
            VisionVerificationContext visionVerificationContext = (VisionVerificationContext) w0Var;
            VisionVerificationContext.Inner_context innerContext = visionVerificationContext.getInnerContext();
            if (innerContext == null || (stepCaptureContext = innerContext.getStepCaptureContext()) == null) {
                return;
            }
            AnalyticsContext.Companion companion2 = AnalyticsContext.INSTANCE;
            VisionVerificationContext.a aVar2 = (VisionVerificationContext.a) visionVerificationContext.toBuilder();
            VisionVerificationContext.Inner_context.a aVar3 = (VisionVerificationContext.Inner_context.a) innerContext.toBuilder();
            CameraCaptureContext.a aVar4 = (CameraCaptureContext.a) stepCaptureContext.toBuilder();
            aVar4.c();
            ((CameraCaptureContext) aVar4.f49761b).setCameraInitTime(d);
            w0 w0VarA2 = aVar4.a();
            Intrinsics.checkNotNullExpressionValue(w0VarA2, "build(...)");
            aVar3.h((CameraCaptureContext) w0VarA2);
            aVar2.h((VisionVerificationContext.Inner_context) aVar3.a());
            w0 w0VarA3 = aVar2.a();
            companion2.getClass();
            r6.b.q(AnalyticsContext.Companion.a(w0VarA3), j2Var, null);
        }
    }

    public final void k(double d) {
        CameraCaptureContext stepCaptureContext;
        AnalyticsContext analyticsContextE = e();
        if (analyticsContextE != null) {
            w0 w0Var = analyticsContextE.f50296a;
            boolean z = w0Var instanceof VisionVerificationContext;
            j2 j2Var = this.f266235b;
            if (!z) {
                if (w0Var instanceof CameraCaptureContext) {
                    AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                    CameraCaptureContext.a aVar = (CameraCaptureContext.a) ((CameraCaptureContext) w0Var).toBuilder();
                    aVar.c();
                    ((CameraCaptureContext) aVar.f49761b).setFirstSubjectDetectionTime(d);
                    w0 w0VarA = aVar.a();
                    Intrinsics.checkNotNullExpressionValue(w0VarA, "build(...)");
                    companion.getClass();
                    r6.b.q(AnalyticsContext.Companion.a((CameraCaptureContext) w0VarA), j2Var, null);
                    return;
                }
                return;
            }
            VisionVerificationContext visionVerificationContext = (VisionVerificationContext) w0Var;
            VisionVerificationContext.Inner_context innerContext = visionVerificationContext.getInnerContext();
            if (innerContext == null || (stepCaptureContext = innerContext.getStepCaptureContext()) == null) {
                return;
            }
            AnalyticsContext.Companion companion2 = AnalyticsContext.INSTANCE;
            VisionVerificationContext.a aVar2 = (VisionVerificationContext.a) visionVerificationContext.toBuilder();
            VisionVerificationContext.Inner_context.a aVar3 = (VisionVerificationContext.Inner_context.a) innerContext.toBuilder();
            CameraCaptureContext.a aVar4 = (CameraCaptureContext.a) stepCaptureContext.toBuilder();
            aVar4.c();
            ((CameraCaptureContext) aVar4.f49761b).setFirstSubjectDetectionTime(d);
            w0 w0VarA2 = aVar4.a();
            Intrinsics.checkNotNullExpressionValue(w0VarA2, "build(...)");
            aVar3.h((CameraCaptureContext) w0VarA2);
            aVar2.h((VisionVerificationContext.Inner_context) aVar3.a());
            w0 w0VarA3 = aVar2.a();
            companion2.getClass();
            r6.b.q(AnalyticsContext.Companion.a(w0VarA3), j2Var, null);
        }
    }
}
