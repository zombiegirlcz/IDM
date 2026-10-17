package w56;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.defi.remittances.impl.ui.send.review.DeFiSendReviewScreenContract$InputData;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r10.t;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends oki.h implements dli.b {

    @NotNull
    public static final m Companion = new m();
    public final t o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ap5.b f294712p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h56.c f294713q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wj0.a f294714r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l f294715s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f294716t;
    public final vii.b u;

    public p(r stateMapper, DeFiSendReviewScreenContract$InputData inputData, t deFiSendInteractor, ap5.b cryptoWithdrawInteractor, h56.c deFiSendSubmissionInteractor, wj0.a idempotencyKeyHolder, l dialogMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deFiSendInteractor, "deFiSendInteractor");
        Intrinsics.checkNotNullParameter(cryptoWithdrawInteractor, "cryptoWithdrawInteractor");
        Intrinsics.checkNotNullParameter(deFiSendSubmissionInteractor, "deFiSendSubmissionInteractor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        this.o = deFiSendInteractor;
        this.f294712p = cryptoWithdrawInteractor;
        this.f294713q = deFiSendSubmissionInteractor;
        this.f294714r = idempotencyKeyHolder;
        this.f294715s = dialogMapper;
        this.f294716t = mra.d.b(this, new g(inputData.f71851a, new Data(null, null, false, 7, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.u = new vii.b();
    }

    @Override // yji.l
    public final void I1() {
        this.f294714r.a("IDEMPOTENCY_TAG_DEFI_TRANSFER_SUBMIT");
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, vkm.q.Q(this.u, new w2a.q((Continuation) null, this, 5)), null, new n(this, null, 0), 3);
        String str = ((g) ((j2) this.f294716t.f22677a).getValue()).f294701a.f71801j;
        if (str != null) {
            yji.l.b1(this, rd0.e.b(this.f294712p.c(str, false, ho5.a.NONE)), null, new n(this, null, 1), 3);
            return;
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "DeFiSendReviewScreenModel", "Attempting to load wallet while beneficiary ID is missing", null, h0Var);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f294716t;
    }
}
