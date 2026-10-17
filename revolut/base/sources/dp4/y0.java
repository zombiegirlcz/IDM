package dp4;

import android.graphics.drawable.Drawable;
import android.media.MediaRecorder;
import android.os.SystemClock;
import com.android.installreferrer.api.InstallReferrerClient;
import com.revolut.core.ui_kit.views.ChatInputView;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import mx0.d4;
import mx0.k4;
import skm.a2;
import yhm.m;

/* JADX INFO: loaded from: classes22.dex */
public final class y0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f116717w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f116718x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f116719y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(int i, com.revolut.feature.workflow.engine.onboarding.impl.workflow.a aVar, int i2, Set set, Continuation continuation) {
        super(2, continuation);
        this.u = 14;
        this.v = i;
        this.f116719y = aVar;
        this.f116717w = i2;
        this.f116718x = set;
    }

    private final Object b(Object obj2) throws Throwable {
        Object objA;
        kl.b0 b0Var;
        oo0.l reason = (oo0.l) this.f116718x;
        xrg.d dVar = (xrg.d) this.f116719y;
        d70.c elements = dVar.f308351y;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            a2 a2Var = dVar.f308347s;
            if (a2Var != null) {
                a2Var.f(null);
            }
            dVar.f308347s = null;
            a2 a2Var2 = dVar.f308345q;
            if (a2Var2 != null) {
                a2Var2.f(null);
            }
            dVar.f308345q = null;
            a2 a2Var3 = dVar.f308346r;
            if (a2Var3 != null) {
                a2Var3.f(null);
            }
            dVar.f308346r = null;
            d90.f fVar = dVar.v;
            if (fVar == null) {
                return Unit.f186387a;
            }
            d90.b bVar = fVar.f112329c;
            d90.b bVar2 = d90.b.STARTED;
            if (bVar == bVar2) {
                this.v = 1;
                MediaRecorder mediaRecorder = fVar.f112327a;
                if (bVar != bVar2) {
                    throw new IllegalStateException("Check failed.");
                }
                try {
                    m.Companion companion = yhm.m.INSTANCE;
                    mediaRecorder.stop();
                    mediaRecorder.release();
                    fVar.f112328b.getClass();
                    fVar.f = SystemClock.elapsedRealtime() - fVar.e;
                    fVar.f112329c = d90.b.STOPPED;
                    fVar.d = null;
                    objA = Unit.f186387a;
                } catch (Throwable th10) {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    objA = yhm.o.a(th10);
                }
                Throwable thA = yhm.m.a(objA);
                if (thA != null && (thA instanceof CancellationException)) {
                    throw thA;
                }
                Throwable thA2 = yhm.m.a(objA);
                if (thA2 != null) {
                    fVar.b(thA2);
                }
                if (Unit.f186387a == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        d90.f fVar2 = dVar.v;
        long jA = fVar2 != null ? fVar2.a() : 0L;
        File file = dVar.u;
        elements.getClass();
        Intrinsics.checkNotNullParameter(elements, "other");
        d70.c amplitudes = new d70.c(elements.f111733b);
        Intrinsics.checkNotNullParameter(elements, "elements");
        amplitudes.c(amplitudes.f111733b, elements);
        Intrinsics.checkNotNullParameter(amplitudes, "amplitudes");
        int i2 = amplitudes.f111733b;
        if (i2 != 100) {
            if (i2 == 0) {
                amplitudes = new d70.c(new byte[100]);
            } else if (i2 >= 100) {
                int i3 = 100;
                d70.c cVar = new d70.c(100);
                int i5 = 0;
                while (i5 < i3) {
                    int i6 = amplitudes.f111733b;
                    int i21 = (i5 * i6) / i3;
                    i5++;
                    int i22 = (i6 * i5) / i3;
                    int i32 = 0;
                    int i33 = 0;
                    for (int i43 = i21; i43 < i22; i43++) {
                        byte bA = amplitudes.a(i43);
                        i33 += bA * bA;
                        i32++;
                    }
                    i3 = 100;
                    cVar.b((byte) kotlin.ranges.f.g(rim.d.b(i32 > 0 ? Math.sqrt(((double) i33) / ((double) i32)) : 0.0d), 0, 100));
                }
                amplitudes = cVar;
            } else if (i2 == 1) {
                byte[] bArr = new byte[100];
                for (int i59 = 0; i59 < 100; i59++) {
                    bArr[i59] = amplitudes.a(0);
                }
                amplitudes = new d70.c(bArr);
            } else {
                d70.c cVar2 = new d70.c(100);
                int i66 = amplitudes.f111733b - 1;
                float f = i66 / 99;
                int i74 = 0;
                for (int i92 = 100; i74 < i92; i92 = 100) {
                    float f4 = i74 * f;
                    int i96 = (int) f4;
                    if (i96 > i66) {
                        i96 = i66;
                    }
                    int i99 = i96 + 1;
                    if (i99 > i66) {
                        i99 = i66;
                    }
                    float f5 = f4 - i96;
                    cVar2.b((byte) kotlin.ranges.f.g(rim.d.c((amplitudes.a(i99) - r7) * f5) + amplitudes.a(i96), 0, 100));
                    i74++;
                }
                amplitudes = cVar2;
            }
        }
        int i100 = amplitudes.f111733b;
        long j2 = i100 != 0 ? jA / ((long) i100) : 0L;
        dVar.v = null;
        dVar.u = null;
        elements.f111733b = 0;
        int iMax = Math.max(dVar.f308350x, 0);
        byte[] bArr2 = elements.f111732a;
        if (bArr2.length > iMax) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr2, iMax);
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
            elements.f111732a = bArrCopyOf;
        }
        boolean z = (reason == oo0.l.CancelledByUser || reason == oo0.l.Error || reason == oo0.l.StoppedByLifecycle || jA < 2000) ? false : true;
        if (z && file != null) {
            oo0.g preview = new oo0.g(file, new oo0.m(j2, amplitudes), jA);
            int i101 = this.f116717w;
            if (i101 == 0) {
                dVar.f3(preview);
            } else if (i101 == 1 && (b0Var = dVar.f308344p) != null) {
                Intrinsics.checkNotNullParameter(reason, "reason");
                Intrinsics.checkNotNullParameter(preview, "preview");
                ChatInputView chatInputView = (ChatInputView) b0Var.f185144b;
                switch (k4.f209789a[chatInputView.f58448b0.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        urg.a aVar2 = chatInputView.m0;
                        if (aVar2 == null) {
                            Intrinsics.r("recordAudioViewModel");
                            throw null;
                        }
                        aVar2.c3(preview);
                        break;
                        break;
                    case 5:
                    case 6:
                        chatInputView.f58461o0 = preview;
                        ihm.b bVar3 = chatInputView.f58450d0;
                        od0.i.Companion.getClass();
                        bVar3.onNext(od0.h.a(preview));
                        if (reason == oo0.l.MaxDurationReached) {
                            chatInputView.performHapticFeedback(1);
                        }
                        chatInputView.Z(d4.PREVIEW, false);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        } else if (z) {
            r6.b.D("Recording stopped successfully but currentOutputFile was null.");
            kl.b0 b0Var2 = dVar.f308344p;
            if (b0Var2 != null) {
                ChatInputView chatInputView2 = (ChatInputView) b0Var2.f185144b;
                d4 d4Var = d4.CANCELLED;
                int i102 = ChatInputView.I0;
                chatInputView2.Z(d4Var, false);
            }
        } else {
            if (file != null) {
                dVar.T2(new xnl.f(dVar, file, null, 8), new yi5.b(27));
            }
            kl.b0 b0Var3 = dVar.f308344p;
            if (b0Var3 != null) {
                ChatInputView chatInputView3 = (ChatInputView) b0Var3.f185144b;
                d4 d4Var2 = d4.CANCELLED;
                int i103 = ChatInputView.I0;
                chatInputView3.Z(d4Var2, false);
            }
        }
        return Unit.f186387a;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new y0((c1) this.f116719y, (String) this.f116718x, this.f116717w, continuation, 0);
            case 1:
                return new y0((egf.c) this.f116719y, (String) this.f116718x, continuation);
            case 2:
                return new y0((com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_banner_grid_spare_change.a) this.f116719y, (yvh.b) this.f116718x, this.f116717w, continuation, 2);
            case 3:
                return new y0((com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.b) this.f116719y, (ai4.h) this.f116718x, this.f116717w, continuation, 3);
            case 4:
                return new y0((com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_grid_spare_change.a) this.f116719y, (yvh.b) this.f116718x, this.f116717w, continuation, 4);
            case 5:
                return new y0((ih7.b) this.f116719y, this.f116717w, (InstallReferrerClient) this.f116718x, continuation, 5);
            case 6:
                return new y0((com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change.a) this.f116719y, (yvh.b) this.f116718x, this.f116717w, continuation, 6);
            case 7:
                y0 y0Var = new y0((kl9.d) this.f116718x, continuation, 7);
                y0Var.f116719y = obj2;
                return y0Var;
            case 8:
                return new y0((StateFlow) this.f116719y, (Function2) this.f116718x, this.f116717w, continuation, 8);
            case 9:
                y0 y0Var2 = new y0(this.f116717w, continuation, (l27.i) this.f116718x);
                y0Var2.f116719y = obj2;
                return y0Var2;
            case 10:
                return new y0((com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change.a) this.f116719y, (yvh.b) this.f116718x, this.f116717w, continuation, 10);
            case 11:
                return new y0((mn1.b0) this.f116718x, continuation, 11);
            case 12:
                return new y0((com.revolut.feature.rev_points.spare_change.impl.ui.screen.spare_change.a) this.f116719y, (yvh.b) this.f116718x, this.f116717w, continuation, 12);
            case 13:
                return new y0(this.f116717w, (pe0.q) this.f116719y, (pe0.f) this.f116718x, continuation);
            case 14:
                return new y0(this.v, (com.revolut.feature.workflow.engine.onboarding.impl.workflow.a) this.f116719y, this.f116717w, (Set) this.f116718x, continuation);
            case 15:
                return new y0((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b) this.f116719y, this.f116717w, (List) this.f116718x, continuation, 15);
            case 16:
                return new y0((com.revolut.feature.topup_screen.impl.flows.topup.flow.i) this.f116719y, (dj0.d) this.f116718x, this.f116717w, continuation, 16);
            case 17:
                return new y0((vo0.c) this.f116719y, (Drawable) this.f116718x, this.v, this.f116717w, continuation);
            case 18:
                return new y0((w31.e) this.f116719y, (String) this.f116718x, this.f116717w, continuation, 18);
            case 19:
                return new y0((xrg.d) this.f116719y, (oo0.l) this.f116718x, this.f116717w, continuation, 19);
            case 20:
                return new y0((yji.n) this.f116719y, continuation, 20);
            default:
                return new y0((yji.n) this.f116719y, continuation, 21);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((y0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0210 A[Catch: Exception -> 0x0154, CancellationException -> 0x0235, TRY_ENTER, TryCatch #16 {CancellationException -> 0x0235, Exception -> 0x0154, blocks: (B:85:0x014f, B:132:0x0221, B:129:0x0210), top: B:535:0x0142 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0893  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x08aa  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0114 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:537:0x023e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:576:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e6 A[Catch: Exception -> 0x0039, CancellationException -> 0x003c, TRY_ENTER, TryCatch #19 {CancellationException -> 0x003c, Exception -> 0x0039, blocks: (B:10:0x0034, B:60:0x00f7, B:57:0x00e6), top: B:519:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:580:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010e  */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v100 */
    /* JADX WARN: Type inference failed for: r5v101 */
    /* JADX WARN: Type inference failed for: r5v102 */
    /* JADX WARN: Type inference failed for: r5v103 */
    /* JADX WARN: Type inference failed for: r5v76 */
    /* JADX WARN: Type inference failed for: r5v77 */
    /* JADX WARN: Type inference failed for: r5v81 */
    /* JADX WARN: Type inference failed for: r5v83 */
    /* JADX WARN: Type inference failed for: r5v84 */
    /* JADX WARN: Type inference failed for: r5v85, types: [int] */
    /* JADX WARN: Type inference failed for: r5v86 */
    /* JADX WARN: Type inference failed for: r5v87, types: [int] */
    /* JADX WARN: Type inference failed for: r5v93 */
    /* JADX WARN: Type inference failed for: r5v96, types: [int] */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v55 */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r6v58 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:354:0x06d3 -> B:346:0x06a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:456:0x08a6 -> B:446:0x0875). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dp4.y0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(int i, Continuation continuation, l27.i iVar) {
        super(2, continuation);
        this.u = 9;
        this.f116718x = iVar;
        this.f116717w = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(int i, pe0.q qVar, pe0.f fVar, Continuation continuation) {
        super(2, continuation);
        this.u = 13;
        this.f116717w = i;
        this.f116719y = qVar;
        this.f116718x = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(egf.c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 1;
        this.f116719y = cVar;
        this.f116718x = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(Object obj2, int i, Object obj3, Continuation continuation, int i2) {
        super(2, continuation);
        this.u = i2;
        this.f116719y = obj2;
        this.f116717w = i;
        this.f116718x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(Object obj2, Object obj3, int i, Continuation continuation, int i2) {
        super(2, continuation);
        this.u = i2;
        this.f116719y = obj2;
        this.f116718x = obj3;
        this.f116717w = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f116718x = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(vo0.c cVar, Drawable drawable, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.u = 17;
        this.f116719y = cVar;
        this.f116718x = drawable;
        this.v = i;
        this.f116717w = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(yji.n nVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f116719y = nVar;
    }
}
