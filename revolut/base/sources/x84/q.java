package x84;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.hub.DebtsHubScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class q extends jki.g implements m {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final DebtsHubScreenContract$InputData f303289p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ww3.c f303290q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f303291r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g f303292s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(DebtsHubScreenContract$InputData inputData, ww3.c interactor, j60.a bottomDialogExtension, jki.p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f303289p = inputData;
        this.f303290q = interactor;
        this.f303291r = bottomDialogExtension;
        this.f303292s = new g(new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        y2(this.f303289p.f67447b ? w4l.i.f294643c : w4l.h.f294642c);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f303292s;
    }

    public final void y2(w4l.k kVar) {
        yji.l.a1(this, pyd.c.m(this.f303290q.b(kVar, w0.F(this.f303289p.f67448c))), null, null, new x64.b(this, null, 4), 3);
    }
}
