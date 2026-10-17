package eql;

import android.net.Uri;
import com.revolut.feature.kyc.vendors.shared.api.uae_pass.UaePassFlowOutputData;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f128510b;

    public /* synthetic */ l(c0 c0Var, int i) {
        this.f128509a = i;
        this.f128510b = c0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f128509a;
        int i2 = 0;
        int i3 = 1;
        Continuation continuation = null;
        c0 c0Var = this.f128510b;
        switch (i) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "Revolut SSO", null, it8, h0Var);
                yji.n.j2(c0Var, c0Var.L2(((jol.c) c0Var.f128491m).e("GENERIC_ERROR")), null, null, 7);
                return Boolean.TRUE;
            case 1:
                UaePassFlowOutputData output = (UaePassFlowOutputData) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof UaePassFlowOutputData.Completed) {
                    String str = ((UaePassFlowOutputData.Completed) output).f77914a;
                    c0Var.getClass();
                    List<String> queryParameters = Uri.parse(str).getQueryParameters("challengeId");
                    Intrinsics.checkNotNullExpressionValue(queryParameters, "getQueryParameters(...)");
                    String str2 = (String) d0.M0(queryParameters);
                    if (str2 == null || str2.length() <= 0) {
                        str2 = null;
                    }
                    if (str2 == null) {
                        h0 h0Var2 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "Revolut SSO", "UAE PASS terminal URL has no single non-empty challengeId", null, h0Var2);
                        yji.n.j2(c0Var, c0Var.L2(((jol.c) c0Var.f128491m).e("GENERIC_ERROR")), null, null, 7);
                    } else {
                        c0Var.h3(true, hjl.c.UAE_PASS, new p(c0Var, str2, continuation, i2));
                    }
                } else if (!(output instanceof UaePassFlowOutputData.ApplicationUnavailable) && !(output instanceof UaePassFlowOutputData.Cancelled)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 2:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                yji.n.j2(c0Var, c0Var.L2(((jol.c) c0Var.f128491m).e("GENERIC_ERROR")), null, null, 7);
                return Unit.f186387a;
            case 3:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                yji.n.j2(c0Var, c0Var.L2(((jol.c) c0Var.f128491m).e("GENERIC_ERROR")), null, null, 7);
                return Unit.f186387a;
            case 4:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                h0 h0Var3 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "Revolut SSO", null, it9, h0Var3);
                yji.n.j2(c0Var, c0Var.L2(((jol.c) c0Var.f128491m).e("GENERIC_ERROR")), null, null, 7);
                return Boolean.TRUE;
            case 5:
                Throwable it10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                h0 h0Var4 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "Revolut SSO", null, it10, h0Var4);
                yji.n.j2(c0Var, c0Var.L2(((jol.c) c0Var.f128491m).e("GENERIC_ERROR")), null, null, 7);
                return Boolean.TRUE;
            case 6:
                if (((d67.u) obj2) instanceof d67.s) {
                    c0Var.T2(new q(c0Var, continuation, i2), new yi5.b(27));
                }
                return Unit.f186387a;
            case 7:
                if (((d67.u) obj2) instanceof d67.s) {
                    c0Var.T2(new q(c0Var, continuation, i3), new yi5.b(27));
                }
                return Unit.f186387a;
            default:
                if (((d67.u) obj2) instanceof d67.s) {
                    c0Var.T2(new q(c0Var, continuation, 2), new yi5.b(27));
                }
                return Unit.f186387a;
        }
    }
}
