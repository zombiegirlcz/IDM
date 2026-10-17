package yy;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.tracking.v3.CameraCaptureContext;
import com.revolut.tracking.v3.CameraCapturePerformance;
import com.revolut.tracking.v3.CameraCaptureTorch;
import com.revolut.tracking.v3.CancelledCaptureChecks;
import com.revolut.tracking.v3.VisionVerificationContext;
import dv.f;
import gim.i;
import grl.s1;
import gv.n;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes16.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f317733w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f317733w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a aVar = new a(this.f317733w, continuation, 0);
                aVar.v = obj2;
                return aVar;
            case 1:
                a aVar2 = new a(this.f317733w, continuation, 1);
                aVar2.v = obj2;
                return aVar2;
            case 2:
                a aVar3 = new a(this.f317733w, continuation, 2);
                aVar3.v = obj2;
                return aVar3;
            case 3:
                a aVar4 = new a(this.f317733w, continuation, 3);
                aVar4.v = obj2;
                return aVar4;
            default:
                a aVar5 = new a(this.f317733w, continuation, 4);
                aVar5.v = obj2;
                return aVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((a) create((ev.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((a) create((py.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((a) create((ww.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((a) create((ww.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((a) create((dv.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CameraCaptureContext stepCaptureContext;
        CameraCaptureContext stepCaptureContext2;
        CameraCaptureContext stepCaptureContext3;
        CameraCaptureContext stepCaptureContext4;
        s1 s1Var;
        CameraCaptureContext stepCaptureContext5;
        CameraCaptureContext stepCaptureContext6;
        CameraCaptureContext stepCaptureContext7;
        int i = this.u;
        c cVar = this.f317733w;
        switch (i) {
            case 0:
                sx.a aVar = cVar.f317737n;
                ev.d dVar = (ev.d) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (dVar instanceof ev.a) {
                    ArrayList reasons = ((ev.a) dVar).f129665a;
                    sx.b bVar = (sx.b) aVar;
                    j2 j2Var = bVar.f266235b;
                    Intrinsics.checkNotNullParameter(reasons, "reasons");
                    AnalyticsContext analyticsContextE = bVar.e();
                    if (analyticsContextE != null) {
                        w0 w0Var = analyticsContextE.f50296a;
                        if (w0Var instanceof VisionVerificationContext) {
                            VisionVerificationContext visionVerificationContext = (VisionVerificationContext) w0Var;
                            VisionVerificationContext.Inner_context innerContext = visionVerificationContext.getInnerContext();
                            if (innerContext != null && (stepCaptureContext3 = innerContext.getStepCaptureContext()) != null) {
                                AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                                VisionVerificationContext.a aVar3 = (VisionVerificationContext.a) visionVerificationContext.toBuilder();
                                VisionVerificationContext.Inner_context.a aVar4 = (VisionVerificationContext.Inner_context.a) innerContext.toBuilder();
                                CameraCaptureContext.a aVar5 = (CameraCaptureContext.a) stepCaptureContext3.toBuilder();
                                CancelledCaptureChecks cancelledCaptureChecksA = sx.b.a(stepCaptureContext3, reasons);
                                aVar5.c();
                                ((CameraCaptureContext) aVar5.f49761b).setCancelledCaptureChecks(cancelledCaptureChecksA);
                                w0 w0VarA = aVar5.a();
                                Intrinsics.checkNotNullExpressionValue(w0VarA, "build(...)");
                                aVar4.h((CameraCaptureContext) w0VarA);
                                aVar3.h((VisionVerificationContext.Inner_context) aVar4.a());
                                w0 w0VarA2 = aVar3.a();
                                companion.getClass();
                                r6.b.q(AnalyticsContext.Companion.a(w0VarA2), j2Var, null);
                            }
                        } else if (w0Var instanceof CameraCaptureContext) {
                            AnalyticsContext.Companion companion2 = AnalyticsContext.INSTANCE;
                            CameraCaptureContext cameraCaptureContext = (CameraCaptureContext) w0Var;
                            CameraCaptureContext.a aVar6 = (CameraCaptureContext.a) cameraCaptureContext.toBuilder();
                            CancelledCaptureChecks cancelledCaptureChecksA2 = sx.b.a(cameraCaptureContext, reasons);
                            aVar6.c();
                            ((CameraCaptureContext) aVar6.f49761b).setCancelledCaptureChecks(cancelledCaptureChecksA2);
                            w0 w0VarA3 = aVar6.a();
                            Intrinsics.checkNotNullExpressionValue(w0VarA3, "build(...)");
                            companion2.getClass();
                            r6.b.q(AnalyticsContext.Companion.a((CameraCaptureContext) w0VarA3), j2Var, null);
                        }
                    }
                } else if (dVar instanceof ev.c) {
                    sx.b bVar2 = (sx.b) aVar;
                    j2 j2Var2 = bVar2.f266235b;
                    AnalyticsContext analyticsContextE2 = bVar2.e();
                    if (analyticsContextE2 != null) {
                        w0 w0Var2 = analyticsContextE2.f50296a;
                        if (w0Var2 instanceof VisionVerificationContext) {
                            VisionVerificationContext visionVerificationContext2 = (VisionVerificationContext) w0Var2;
                            VisionVerificationContext.Inner_context innerContext2 = visionVerificationContext2.getInnerContext();
                            if (innerContext2 != null && (stepCaptureContext2 = innerContext2.getStepCaptureContext()) != null) {
                                AnalyticsContext.Companion companion3 = AnalyticsContext.INSTANCE;
                                VisionVerificationContext.a aVar7 = (VisionVerificationContext.a) visionVerificationContext2.toBuilder();
                                VisionVerificationContext.Inner_context.a aVar8 = (VisionVerificationContext.Inner_context.a) innerContext2.toBuilder();
                                CameraCaptureContext.a aVar9 = (CameraCaptureContext.a) stepCaptureContext2.toBuilder();
                                int manualCaptureAttempts = stepCaptureContext2.getManualCaptureAttempts() + 1;
                                aVar9.c();
                                ((CameraCaptureContext) aVar9.f49761b).setManualCaptureAttempts(manualCaptureAttempts);
                                w0 w0VarA4 = aVar9.a();
                                Intrinsics.checkNotNullExpressionValue(w0VarA4, "build(...)");
                                aVar8.h((CameraCaptureContext) w0VarA4);
                                aVar7.h((VisionVerificationContext.Inner_context) aVar8.a());
                                w0 w0VarA5 = aVar7.a();
                                companion3.getClass();
                                r6.b.q(AnalyticsContext.Companion.a(w0VarA5), j2Var2, null);
                            }
                        } else if (w0Var2 instanceof CameraCaptureContext) {
                            AnalyticsContext.Companion companion4 = AnalyticsContext.INSTANCE;
                            CameraCaptureContext cameraCaptureContext2 = (CameraCaptureContext) w0Var2;
                            CameraCaptureContext.a aVar10 = (CameraCaptureContext.a) cameraCaptureContext2.toBuilder();
                            int manualCaptureAttempts2 = cameraCaptureContext2.getManualCaptureAttempts() + 1;
                            aVar10.c();
                            ((CameraCaptureContext) aVar10.f49761b).setManualCaptureAttempts(manualCaptureAttempts2);
                            w0 w0VarA6 = aVar10.a();
                            Intrinsics.checkNotNullExpressionValue(w0VarA6, "build(...)");
                            companion4.getClass();
                            r6.b.q(AnalyticsContext.Companion.a((CameraCaptureContext) w0VarA6), j2Var2, null);
                        }
                    }
                } else {
                    if (!(dVar instanceof ev.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sx.b bVar3 = (sx.b) aVar;
                    j2 j2Var3 = bVar3.f266235b;
                    AnalyticsContext analyticsContextE3 = bVar3.e();
                    if (analyticsContextE3 != null) {
                        w0 w0Var3 = analyticsContextE3.f50296a;
                        if (w0Var3 instanceof VisionVerificationContext) {
                            VisionVerificationContext visionVerificationContext3 = (VisionVerificationContext) w0Var3;
                            VisionVerificationContext.Inner_context innerContext3 = visionVerificationContext3.getInnerContext();
                            if (innerContext3 != null && (stepCaptureContext = innerContext3.getStepCaptureContext()) != null) {
                                AnalyticsContext.Companion companion5 = AnalyticsContext.INSTANCE;
                                VisionVerificationContext.a aVar11 = (VisionVerificationContext.a) visionVerificationContext3.toBuilder();
                                VisionVerificationContext.Inner_context.a aVar12 = (VisionVerificationContext.Inner_context.a) innerContext3.toBuilder();
                                CameraCaptureContext.a aVar13 = (CameraCaptureContext.a) stepCaptureContext.toBuilder();
                                int automaticCaptureAttempts = stepCaptureContext.getAutomaticCaptureAttempts() + 1;
                                aVar13.c();
                                ((CameraCaptureContext) aVar13.f49761b).setAutomaticCaptureAttempts(automaticCaptureAttempts);
                                w0 w0VarA7 = aVar13.a();
                                Intrinsics.checkNotNullExpressionValue(w0VarA7, "build(...)");
                                aVar12.h((CameraCaptureContext) w0VarA7);
                                aVar11.h((VisionVerificationContext.Inner_context) aVar12.a());
                                w0 w0VarA8 = aVar11.a();
                                companion5.getClass();
                                r6.b.q(AnalyticsContext.Companion.a(w0VarA8), j2Var3, null);
                            }
                        } else if (w0Var3 instanceof CameraCaptureContext) {
                            AnalyticsContext.Companion companion6 = AnalyticsContext.INSTANCE;
                            CameraCaptureContext cameraCaptureContext3 = (CameraCaptureContext) w0Var3;
                            CameraCaptureContext.a aVar14 = (CameraCaptureContext.a) cameraCaptureContext3.toBuilder();
                            int automaticCaptureAttempts2 = cameraCaptureContext3.getAutomaticCaptureAttempts() + 1;
                            aVar14.c();
                            ((CameraCaptureContext) aVar14.f49761b).setAutomaticCaptureAttempts(automaticCaptureAttempts2);
                            w0 w0VarA9 = aVar14.a();
                            Intrinsics.checkNotNullExpressionValue(w0VarA9, "build(...)");
                            companion6.getClass();
                            r6.b.q(AnalyticsContext.Companion.a((CameraCaptureContext) w0VarA9), j2Var3, null);
                        }
                    }
                }
                return Unit.f186387a;
            case 1:
                py.c cVar2 = (py.c) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (cVar2 instanceof py.a) {
                    ((sx.b) cVar.f317737n).h(false);
                }
                return Unit.f186387a;
            case 2:
                ww.c framePerformance = (ww.c) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                sx.b bVar4 = (sx.b) cVar.f317737n;
                j2 j2Var4 = bVar4.f266235b;
                Intrinsics.checkNotNullParameter(framePerformance, "framePerformance");
                AnalyticsContext analyticsContextE4 = bVar4.e();
                if (analyticsContextE4 != null) {
                    w0 w0Var4 = analyticsContextE4.f50296a;
                    if (w0Var4 instanceof VisionVerificationContext) {
                        VisionVerificationContext visionVerificationContext4 = (VisionVerificationContext) w0Var4;
                        VisionVerificationContext.Inner_context innerContext4 = visionVerificationContext4.getInnerContext();
                        if (innerContext4 != null && (stepCaptureContext4 = innerContext4.getStepCaptureContext()) != null) {
                            AnalyticsContext.Companion companion7 = AnalyticsContext.INSTANCE;
                            VisionVerificationContext.a aVar17 = (VisionVerificationContext.a) visionVerificationContext4.toBuilder();
                            VisionVerificationContext.Inner_context.a aVar18 = (VisionVerificationContext.Inner_context.a) innerContext4.toBuilder();
                            CameraCaptureContext.a aVar19 = (CameraCaptureContext.a) stepCaptureContext4.toBuilder();
                            CameraCapturePerformance.a aVarNewBuilder = CameraCapturePerformance.newBuilder();
                            double d = framePerformance.f300566a;
                            aVarNewBuilder.c();
                            ((CameraCapturePerformance) aVarNewBuilder.f49761b).setTimeUntilFirstValueReceived(d);
                            double d5 = framePerformance.f300567b;
                            aVarNewBuilder.c();
                            ((CameraCapturePerformance) aVarNewBuilder.f49761b).setAverageTimeBetweenValues(d5);
                            CameraCapturePerformance cameraCapturePerformance = (CameraCapturePerformance) aVarNewBuilder.a();
                            aVar19.c();
                            ((CameraCaptureContext) aVar19.f49761b).setFramePerformance(cameraCapturePerformance);
                            w0 w0VarA10 = aVar19.a();
                            Intrinsics.checkNotNullExpressionValue(w0VarA10, "build(...)");
                            aVar18.h((CameraCaptureContext) w0VarA10);
                            aVar17.h((VisionVerificationContext.Inner_context) aVar18.a());
                            w0 w0VarA11 = aVar17.a();
                            companion7.getClass();
                            r6.b.q(AnalyticsContext.Companion.a(w0VarA11), j2Var4, null);
                        }
                    } else if (w0Var4 instanceof CameraCaptureContext) {
                        AnalyticsContext.Companion companion8 = AnalyticsContext.INSTANCE;
                        CameraCaptureContext.a aVar20 = (CameraCaptureContext.a) ((CameraCaptureContext) w0Var4).toBuilder();
                        CameraCapturePerformance.a aVarNewBuilder2 = CameraCapturePerformance.newBuilder();
                        double d6 = framePerformance.f300566a;
                        aVarNewBuilder2.c();
                        ((CameraCapturePerformance) aVarNewBuilder2.f49761b).setTimeUntilFirstValueReceived(d6);
                        double d10 = framePerformance.f300567b;
                        aVarNewBuilder2.c();
                        ((CameraCapturePerformance) aVarNewBuilder2.f49761b).setAverageTimeBetweenValues(d10);
                        CameraCapturePerformance cameraCapturePerformance2 = (CameraCapturePerformance) aVarNewBuilder2.a();
                        aVar20.c();
                        ((CameraCaptureContext) aVar20.f49761b).setFramePerformance(cameraCapturePerformance2);
                        w0 w0VarA12 = aVar20.a();
                        Intrinsics.checkNotNullExpressionValue(w0VarA12, "build(...)");
                        companion8.getClass();
                        r6.b.q(AnalyticsContext.Companion.a((CameraCaptureContext) w0VarA12), j2Var4, null);
                    }
                }
                return Unit.f186387a;
            case 3:
                ww.c cVar3 = (ww.c) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((sx.b) cVar.f317737n).i(cVar3);
                return Unit.f186387a;
            default:
                sx.a aVar22 = cVar.f317737n;
                dv.i iVar = (dv.i) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (iVar instanceof f) {
                    long j2 = cVar.f317740r.f266542a.get();
                    cVar.f317741s.getClass();
                    double dCurrentTimeMillis = (System.currentTimeMillis() - j2) / ((double) 1000);
                    sx.b bVar5 = (sx.b) aVar22;
                    j2 j2Var5 = bVar5.f266235b;
                    AnalyticsContext analyticsContextE5 = bVar5.e();
                    if (analyticsContextE5 != null) {
                        w0 w0Var5 = analyticsContextE5.f50296a;
                        if (w0Var5 instanceof VisionVerificationContext) {
                            VisionVerificationContext visionVerificationContext5 = (VisionVerificationContext) w0Var5;
                            VisionVerificationContext.Inner_context innerContext5 = visionVerificationContext5.getInnerContext();
                            if (innerContext5 != null && (stepCaptureContext7 = innerContext5.getStepCaptureContext()) != null) {
                                AnalyticsContext.Companion companion9 = AnalyticsContext.INSTANCE;
                                VisionVerificationContext.a aVar24 = (VisionVerificationContext.a) visionVerificationContext5.toBuilder();
                                VisionVerificationContext.Inner_context.a aVar25 = (VisionVerificationContext.Inner_context.a) innerContext5.toBuilder();
                                CameraCaptureContext.a aVar26 = (CameraCaptureContext.a) stepCaptureContext7.toBuilder();
                                aVar26.c();
                                ((CameraCaptureContext) aVar26.f49761b).setTimeToSuccessfulCapture(dCurrentTimeMillis);
                                w0 w0VarA13 = aVar26.a();
                                Intrinsics.checkNotNullExpressionValue(w0VarA13, "build(...)");
                                aVar25.h((CameraCaptureContext) w0VarA13);
                                aVar24.h((VisionVerificationContext.Inner_context) aVar25.a());
                                w0 w0VarA14 = aVar24.a();
                                companion9.getClass();
                                r6.b.q(AnalyticsContext.Companion.a(w0VarA14), j2Var5, null);
                            }
                        } else if (w0Var5 instanceof CameraCaptureContext) {
                            AnalyticsContext.Companion companion10 = AnalyticsContext.INSTANCE;
                            CameraCaptureContext.a aVar27 = (CameraCaptureContext.a) ((CameraCaptureContext) w0Var5).toBuilder();
                            aVar27.c();
                            ((CameraCaptureContext) aVar27.f49761b).setTimeToSuccessfulCapture(dCurrentTimeMillis);
                            w0 w0VarA15 = aVar27.a();
                            Intrinsics.checkNotNullExpressionValue(w0VarA15, "build(...)");
                            companion10.getClass();
                            r6.b.q(AnalyticsContext.Companion.a((CameraCaptureContext) w0VarA15), j2Var5, null);
                        }
                    }
                    ((sx.b) aVar22).h(true);
                    ((sx.b) aVar22).g();
                    n nVar = ((f) iVar).f118005b;
                    gv.d flashState = nVar.f147026c;
                    sx.b bVar6 = (sx.b) aVar22;
                    j2 j2Var6 = bVar6.f266235b;
                    Intrinsics.checkNotNullParameter(flashState, "flashState");
                    if ((flashState instanceof gv.a) || (flashState instanceof gv.b)) {
                        s1Var = s1.DISABLED;
                    } else {
                        if (!(flashState instanceof gv.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        s1Var = ((gv.c) flashState).f147003a ? s1.AUTOMATIC : s1.MANUAL;
                    }
                    AnalyticsContext analyticsContextE6 = bVar6.e();
                    if (analyticsContextE6 != null) {
                        w0 w0Var6 = analyticsContextE6.f50296a;
                        if (w0Var6 instanceof VisionVerificationContext) {
                            VisionVerificationContext visionVerificationContext6 = (VisionVerificationContext) w0Var6;
                            VisionVerificationContext.Inner_context innerContext6 = visionVerificationContext6.getInnerContext();
                            if (innerContext6 != null && (stepCaptureContext6 = innerContext6.getStepCaptureContext()) != null) {
                                AnalyticsContext.Companion companion11 = AnalyticsContext.INSTANCE;
                                VisionVerificationContext.a aVar28 = (VisionVerificationContext.a) visionVerificationContext6.toBuilder();
                                VisionVerificationContext.Inner_context.a aVar29 = (VisionVerificationContext.Inner_context.a) innerContext6.toBuilder();
                                CameraCaptureContext.a aVar30 = (CameraCaptureContext.a) stepCaptureContext6.toBuilder();
                                CameraCaptureTorch.a aVarNewBuilder3 = CameraCaptureTorch.newBuilder();
                                aVarNewBuilder3.c();
                                ((CameraCaptureTorch) aVarNewBuilder3.f49761b).setMode(s1Var);
                                CameraCaptureTorch cameraCaptureTorch = (CameraCaptureTorch) aVarNewBuilder3.a();
                                aVar30.c();
                                ((CameraCaptureContext) aVar30.f49761b).setTorch(cameraCaptureTorch);
                                w0 w0VarA16 = aVar30.a();
                                Intrinsics.checkNotNullExpressionValue(w0VarA16, "build(...)");
                                aVar29.h((CameraCaptureContext) w0VarA16);
                                aVar28.h((VisionVerificationContext.Inner_context) aVar29.a());
                                w0 w0VarA17 = aVar28.a();
                                companion11.getClass();
                                r6.b.q(AnalyticsContext.Companion.a(w0VarA17), j2Var6, null);
                            }
                        } else if (w0Var6 instanceof CameraCaptureContext) {
                            AnalyticsContext.Companion companion12 = AnalyticsContext.INSTANCE;
                            CameraCaptureContext.a aVar31 = (CameraCaptureContext.a) ((CameraCaptureContext) w0Var6).toBuilder();
                            CameraCaptureTorch.a aVarNewBuilder4 = CameraCaptureTorch.newBuilder();
                            aVarNewBuilder4.c();
                            ((CameraCaptureTorch) aVarNewBuilder4.f49761b).setMode(s1Var);
                            CameraCaptureTorch cameraCaptureTorch2 = (CameraCaptureTorch) aVarNewBuilder4.a();
                            aVar31.c();
                            ((CameraCaptureContext) aVar31.f49761b).setTorch(cameraCaptureTorch2);
                            w0 w0VarA18 = aVar31.a();
                            Intrinsics.checkNotNullExpressionValue(w0VarA18, "build(...)");
                            companion12.getClass();
                            r6.b.q(AnalyticsContext.Companion.a((CameraCaptureContext) w0VarA18), j2Var6, null);
                        }
                    }
                    gv.e captureReason = nVar.d;
                    sx.b bVar7 = (sx.b) aVar22;
                    j2 j2Var7 = bVar7.f266235b;
                    Intrinsics.checkNotNullParameter(captureReason, "captureReason");
                    boolean z = captureReason == gv.e.SHUTTER_BUTTON_CLICKED;
                    AnalyticsContext analyticsContextE7 = bVar7.e();
                    if (analyticsContextE7 != null) {
                        w0 w0Var7 = analyticsContextE7.f50296a;
                        if (w0Var7 instanceof VisionVerificationContext) {
                            VisionVerificationContext visionVerificationContext7 = (VisionVerificationContext) w0Var7;
                            VisionVerificationContext.Inner_context innerContext7 = visionVerificationContext7.getInnerContext();
                            if (innerContext7 != null && (stepCaptureContext5 = innerContext7.getStepCaptureContext()) != null) {
                                AnalyticsContext.Companion companion13 = AnalyticsContext.INSTANCE;
                                VisionVerificationContext.a aVar32 = (VisionVerificationContext.a) visionVerificationContext7.toBuilder();
                                VisionVerificationContext.Inner_context.a aVar33 = (VisionVerificationContext.Inner_context.a) innerContext7.toBuilder();
                                CameraCaptureContext.a aVar34 = (CameraCaptureContext.a) stepCaptureContext5.toBuilder();
                                aVar34.c();
                                ((CameraCaptureContext) aVar34.f49761b).setManualCaptureMode(z);
                                w0 w0VarA19 = aVar34.a();
                                Intrinsics.checkNotNullExpressionValue(w0VarA19, "build(...)");
                                aVar33.h((CameraCaptureContext) w0VarA19);
                                aVar32.h((VisionVerificationContext.Inner_context) aVar33.a());
                                w0 w0VarA20 = aVar32.a();
                                companion13.getClass();
                                r6.b.q(AnalyticsContext.Companion.a(w0VarA20), j2Var7, null);
                            }
                        } else if (w0Var7 instanceof CameraCaptureContext) {
                            AnalyticsContext.Companion companion14 = AnalyticsContext.INSTANCE;
                            CameraCaptureContext.a aVar35 = (CameraCaptureContext.a) ((CameraCaptureContext) w0Var7).toBuilder();
                            aVar35.c();
                            ((CameraCaptureContext) aVar35.f49761b).setManualCaptureMode(z);
                            w0 w0VarA21 = aVar35.a();
                            Intrinsics.checkNotNullExpressionValue(w0VarA21, "build(...)");
                            companion14.getClass();
                            r6.b.q(AnalyticsContext.Companion.a((CameraCaptureContext) w0VarA21), j2Var7, null);
                        }
                    }
                }
                return Unit.f186387a;
        }
    }
}
