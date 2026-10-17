package sbb;

import com.revolut.core.model.FileExtension;
import com.revolut.feature.retail.main_screen.container.models.action_payload.StatementsLoadPayload;
import com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionData;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import uyd.h0;
import vkm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes6.dex */
public final class a0 extends yji.n implements etb.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zxd.c f261527l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vyd.a f261528m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ij0.c f261529n;
    public final hk0.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n0e.b f261530p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f80.a f261531q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f261532r;

    public a0(zxd.c statementsInteractor, vyd.a dialogConfigurationFactory, ij0.c revolutHostChecker, hk0.a networkFileRepository, n0e.b statementsNaviCommandFactory, f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        Intrinsics.checkNotNullParameter(dialogConfigurationFactory, "dialogConfigurationFactory");
        Intrinsics.checkNotNullParameter(revolutHostChecker, "revolutHostChecker");
        Intrinsics.checkNotNullParameter(networkFileRepository, "networkFileRepository");
        Intrinsics.checkNotNullParameter(statementsNaviCommandFactory, "statementsNaviCommandFactory");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f261527l = statementsInteractor;
        this.f261528m = dialogConfigurationFactory;
        this.f261529n = revolutHostChecker;
        this.o = networkFileRepository;
        this.f261530p = statementsNaviCommandFactory;
        this.f261531q = uriHelper;
        this.f261532r = r0.k(new Pair(FileExtension.Pdf.f51406b, new rnb.u(1, this, a0.class, "openPdfFile", "openPdfFile(Ljava/io/File;)V", 0, 21)), new Pair(FileExtension.Csv.f51401b, new rnb.u(1, this, a0.class, "openCsvFile", "openCsvFile(Ljava/io/File;)V", 0, 22)));
    }

    @Override // etb.a
    public final void E(MainScreenContainerActionData actionData) {
        Intrinsics.checkNotNullParameter(actionData, "actionData");
        StatementsLoadPayload statementsLoadPayload = (StatementsLoadPayload) actionData.f83422b;
        String requestId = statementsLoadPayload != null ? statementsLoadPayload.f82760a : null;
        if (requestId == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ryd.w wVar = (ryd.w) this.f261527l;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        h0 h0Var = (h0) wVar.f258357a;
        h0Var.getClass();
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        efm.r rVarSwitchMapSingle = h0Var.k.f(new uyd.p(requestId), true).switchMapSingle(new sa6.a(new y(this, 0), 18));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMapSingle, "switchMapSingle(...)");
        yji.n.l2(this, mo3.a.g(byd.g.c(rd0.e.n(new q0(rd0.e.b(o70.a.f(rVarSwitchMapSingle)), new z(this, null, 1), 1), zhm.h0.f322473a), q2(), this.f261528m.d(), new y(this, 1), new y(this, 2)), null, new sa5.a(5), 1), null, new z(this, null, 0), 3);
    }

    @Override // etb.a
    public final boolean i2(MainScreenContainerActionData actionData) {
        Intrinsics.checkNotNullParameter(actionData, "actionData");
        return actionData.f83422b instanceof StatementsLoadPayload;
    }
}
