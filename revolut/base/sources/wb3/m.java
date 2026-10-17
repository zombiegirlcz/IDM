package wb3;

import com.revolut.feature.cash_topup.impl.ui.entry.CashTopUpEntryScreenContract$InputData;
import e7l.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends jki.g implements e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fk3.a f296009p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final pre.c f296010q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CashTopUpEntryScreenContract$InputData f296011r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final nb3.c f296012s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f296013t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p mapper, fk3.a configurationInteractor, pre.c termsInteractor, CashTopUpEntryScreenContract$InputData inputData, nb3.c cashTopUpLocationExplanationProvider) {
        super(mapper);
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cashTopUpLocationExplanationProvider, "cashTopUpLocationExplanationProvider");
        this.f296009p = configurationInteractor;
        this.f296010q = termsInteractor;
        this.f296011r = inputData;
        this.f296012s = cashTopUpLocationExplanationProvider;
        this.f296013t = new d(null, null);
    }

    @Override // yji.l
    public final void I1() {
        int i = j.f296006a[this.f296011r.f65630a.ordinal()];
        Continuation continuation = null;
        if (i == 1) {
            yji.l.a1(this, q.P(rd0.e.b(m70.a.g(((ik3.c) this.f296009p).k(g.b.f123407a), null, null, 3)), 1), null, null, new w50.g(this, continuation, 12), 3);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            l2(new l(this, null), new yi5.b(26));
        }
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f296013t;
    }
}
