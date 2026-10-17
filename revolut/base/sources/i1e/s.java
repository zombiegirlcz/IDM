package i1e;

import com.revolut.data.model.Data;
import kl.b0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import x8h.n0;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends jki.g implements h {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n0 f157626p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zjh.j f157627q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r60.b f157628r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b0 f157629s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f157630t;
    public a2 u;
    public final g v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(jki.p stateMapper, n0 interactor, zjh.j transactionInteractor, r60.b promptViewControllerExtension, b0 footerDisclosureDelegatePresentationModel, f disablePromptMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(transactionInteractor, "transactionInteractor");
        Intrinsics.checkNotNullParameter(promptViewControllerExtension, "promptViewControllerExtension");
        Intrinsics.checkNotNullParameter(footerDisclosureDelegatePresentationModel, "footerDisclosureDelegatePresentationModel");
        Intrinsics.checkNotNullParameter(disablePromptMapper, "disablePromptMapper");
        this.f157626p = interactor;
        this.f157627q = transactionInteractor;
        this.f157628r = promptViewControllerExtension;
        this.f157629s = footerDisclosureDelegatePresentationModel;
        this.f157630t = disablePromptMapper;
        this.v = new g(new Data(null, null, true, 3, null), false, null);
    }

    @Override // yji.l
    public final void T1(long j2) {
        n2(new o(this, null, 1), new whi.b(6));
        y2();
        r60.d dVar = (r60.d) this.f157628r;
        yji.l.b1(this, rd0.e.b(dVar.d.d()), null, new q(this, null), 3);
        yji.l.b1(this, rd0.e.b(dVar.d.f()), null, new r(this, null), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.v;
    }

    public final void y2() {
        a2 a2Var = this.u;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.u = yji.l.b1(this, rd0.e.b(mo3.a.n(((f1e.d) this.f157627q.f322839a).e.f(Unit.f186387a, true))), null, new i13.d(this, continuation, 1), 3);
    }
}
