package hi2;

import aw0.f4;
import cli.y;
import com.revolut.feature.apm.wero.impl.ui.pay.create.CreateRequestLinkData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.q;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends oki.h implements dli.b {

    @NotNull
    public static final l Companion = new l();
    public final r10.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n60.a f152465p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ldd.b f152466q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w80.b f152467r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wj0.a f152468s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f152469t;

    public n(r10.f interactor, n60.a keyboardExtension, ldd.b focusRequesterDelegate, w80.b amountFormatter, wj0.a idempotencyKeyHolder, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = interactor;
        this.f152465p = keyboardExtension;
        this.f152466q = focusRequesterDelegate;
        this.f152467r = amountFormatter;
        this.f152468s = idempotencyKeyHolder;
        xi0.b bVar = hh2.a.f152244a;
        m70.a.c(t0.f186434a);
        CreateRequestLinkData createRequestLinkData = new CreateRequestLinkData(0L, "", bVar);
        hrf.h.Companion.getClass();
        this.f152469t = mra.d.b(this, new e(createRequestLinkData, new f(hrf.h.d, f0.f322471a), 0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        this.f152468s.a("payments_wero_request_link");
        ldd.b bVar = this.f152466q;
        bVar.f194072c = false;
        bVar.b(new f4("ITEM_AMOUNT_INPUT_ID", true));
        Continuation continuation = null;
        yji.l.a1(this, q.Q(new vkm.t0(this.f152469t.B(new hhd.n(3)), 1), new hcj.o(continuation, this, 4)), null, null, new hba.k(this, continuation, 18), 3);
    }

    public final CreateRequestLinkData I2() {
        CreateRequestLinkData createRequestLinkData = ((e) ((j2) this.f152469t.f22677a).getValue()).f152452a;
        if (createRequestLinkData != null) {
            return createRequestLinkData;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // yji.l
    public final void P1() {
        H2(this.f152469t, new hg4.a(this, 6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f152469t;
    }
}
