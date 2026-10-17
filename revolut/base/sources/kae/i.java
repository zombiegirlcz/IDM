package kae;

import cli.y;
import com.revolut.feature.subscriptions.impl.label.SubscriptionLabelScreenContract$InputData;
import k7c.n;
import kotlin.jvm.internal.Intrinsics;
import qua.p;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends oki.h implements dli.b {
    public final SubscriptionLabelScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xua.a f182477p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f182478q;

    public i(j stateMapper, SubscriptionLabelScreenContract$InputData inputData, xua.a recurringPaymentInteractor) {
        String str;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        this.o = inputData;
        this.f182477p = recurringPaymentInteractor;
        p pVar = inputData.f89206a;
        String str2 = "";
        if (!pVar.f249314a.f160152c.c() ? (str = pVar.f249324l) != null : (str = pVar.f249325m) != null) {
            str2 = str;
        }
        this.f182478q = mra.d.b(this, new e(str2, str2, pVar.f249314a.f160152c), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        y yVar = this.f182478q;
        H2(yVar, new n(((e) ((j2) yVar.f22677a).getValue()).f182471b, 4));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f182478q;
    }
}
