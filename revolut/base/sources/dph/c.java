package dph;

import aii.q;
import aii.r;
import au4.e;
import cc3.f;
import com.revolut.feature.apm.bills.boleto.impl.finder.flow.BoletoFinderFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.flow.OutstandingDebtsV3FlowContract$Step;
import com.revolut.feature.wealth_discovery.impl.screener.flows.screener.ScreenerRedesignFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import dii.g;
import gq4.j;
import gwe.f;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import ryi.d;
import s65.g;
import wpc.i;
import xoh.l;
import xoh.m;
import xoh.n;
import y5i.b;
import zhm.h0;
import zx4.d;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yki.b f116882b;

    public /* synthetic */ c(h hVar, yki.b bVar, int i) {
        this.f116881a = i;
        this.f116882b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f116881a;
        yki.b bVar = this.f116882b;
        switch (i) {
            case 0:
                n output = (n) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (Intrinsics.f(output, l.f307840a)) {
                    h.D2(bVar);
                } else {
                    if (!(output instanceof m)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    m mVar = (m) output;
                    h.w2(bVar, new ScreenerRedesignFlowContract$Step.Result(mVar.f307841a, mVar.f307842b), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
                }
                return Unit.f186387a;
            case 1:
                d it8 = (d) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                h.D2(bVar);
                return Unit.f186387a;
            case 2:
                q it9 = (q) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                h.D2(bVar);
                return Unit.f186387a;
            case 3:
                g it10 = (g) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                h.D2(bVar);
                return Unit.f186387a;
            case 4:
                g it11 = (g) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                h.D2(bVar);
                return Unit.f186387a;
            case 5:
                g it12 = (g) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                h.D2(bVar);
                return Unit.f186387a;
            case 6:
                j it13 = (j) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                h.D2(bVar);
                return Unit.f186387a;
            case 7:
                wpc.j result = (wpc.j) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof wpc.g) {
                    h.D2(bVar);
                } else if (!Intrinsics.f(result, wpc.h.f299222a) && !Intrinsics.f(result, i.f299223a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 8:
                r it14 = (r) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                h.D2(bVar);
                return Unit.f186387a;
            case 9:
                q it15 = (q) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                h.D2(bVar);
                return Unit.f186387a;
            case 10:
                com.revolut.feature.full_screen_prompt.c it16 = (com.revolut.feature.full_screen_prompt.c) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                h.D2(bVar);
                return Unit.f186387a;
            case 11:
                e result2 = (e) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (!(result2 instanceof au4.d) && !(result2 instanceof au4.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                h.D2(bVar);
                return Unit.f186387a;
            case 12:
                hw4.c result3 = (hw4.c) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (!(result3 instanceof hw4.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                h.D2(bVar);
                return Unit.f186387a;
            case 13:
                yja.b productArticleOutput = (yja.b) obj2;
                Intrinsics.checkNotNullParameter(productArticleOutput, "productArticleOutput");
                int i2 = f.f147325a[productArticleOutput.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    h.D2(bVar);
                } else {
                    if (i2 != 3 && i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalStateException illegalStateException = new IllegalStateException("Unexpected product article output for disabled BGN " + productArticleOutput);
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    h.D2(bVar);
                }
                return Unit.f186387a;
            case 14:
                g it17 = (g) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                h.D2(bVar);
                return Unit.f186387a;
            case 15:
                g it18 = (g) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                h.D2(bVar);
                return Unit.f186387a;
            case 16:
                g output2 = (g) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (!(output2 instanceof dii.b) && !(output2 instanceof dii.c) && !(output2 instanceof dii.d) && !Intrinsics.f(output2, dii.e.f115068a)) {
                    if (!Intrinsics.f(output2, dii.f.f115069a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h.D2(bVar);
                }
                return Unit.f186387a;
            case 17:
                p94.e output3 = (p94.e) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                if (output3 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                h.w2(bVar, new OutstandingDebtsV3FlowContract$Step.DebtDetails(null, output3.f234272a), ModalDestination.Style.POPUP.f98311a);
                return Unit.f186387a;
            case 18:
                y5i.b result4 = (y5i.b) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                if (!(result4 instanceof b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                h.D2(bVar);
                return Unit.f186387a;
            case 19:
                y5i.b result5 = (y5i.b) obj2;
                Intrinsics.checkNotNullParameter(result5, "result");
                if (!(result5 instanceof b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                h.D2(bVar);
                return Unit.f186387a;
            case 20:
                s65.g result6 = (s65.g) obj2;
                Intrinsics.checkNotNullParameter(result6, "result");
                if (!(result6 instanceof g.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                h.D2(bVar);
                return Unit.f186387a;
            case 21:
                q it19 = (q) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                h.D2(bVar);
                return Unit.f186387a;
            case 22:
                ryi.d it20 = (ryi.d) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                if (!(it20 instanceof d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                h.D2(bVar);
                return Unit.f186387a;
            case 23:
                com.revolut.feature.full_screen_prompt.c it21 = (com.revolut.feature.full_screen_prompt.c) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                h.D2(bVar);
                return Unit.f186387a;
            case 24:
                tm1.d result7 = (tm1.d) obj2;
                Intrinsics.checkNotNullParameter(result7, "result");
                if (!Intrinsics.f(result7, tm1.d.f272152a)) {
                    throw new NoWhenBranchMatchedException();
                }
                h.w2(bVar, BoletoFinderFlowContract$Step.BoletosInfo.f61168a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return Unit.f186387a;
            case 25:
                r it22 = (r) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                h.D2(bVar);
                return Unit.f186387a;
            case 26:
                jda.a it23 = (jda.a) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                h.D2(bVar);
                return Unit.f186387a;
            case 27:
                cc3.f result8 = (cc3.f) obj2;
                Intrinsics.checkNotNullParameter(result8, "result");
                if (result8 instanceof f.b) {
                    h.D2(bVar);
                } else if (!(result8 instanceof f.a) && !(result8 instanceof cc3.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 28:
                q it24 = (q) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                h.D2(bVar);
                return Unit.f186387a;
            default:
                dii.g result9 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result9, "result");
                if (result9 instanceof dii.e) {
                    h.D2(bVar);
                } else {
                    if (!(result9 instanceof dii.f) && !(result9 instanceof dii.b) && !(result9 instanceof dii.c) && !(result9 instanceof dii.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i3 = jli.h.f175850a;
                }
                return Unit.f186387a;
        }
    }
}
