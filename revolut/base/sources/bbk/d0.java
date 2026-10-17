package bbk;

import bbk.o;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentContract$InputData;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentNotAvailableError;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class d0 extends oki.h implements r {

    @NotNull
    public static final t Companion = new t();
    public final PendingPaymentContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final cbk.g f14319p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tak.d f14320q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ebk.b f14321r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s42.c f14322s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final cli.y f14323t;

    public d0(PendingPaymentContract$InputData flowInputData, cbk.g balanceExtension, tak.d extension, ebk.b validatorExtension, s42.c expiryExtension, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(flowInputData, "flowInputData");
        Intrinsics.checkNotNullParameter(balanceExtension, "balanceExtension");
        Intrinsics.checkNotNullParameter(extension, "extension");
        Intrinsics.checkNotNullParameter(validatorExtension, "validatorExtension");
        Intrinsics.checkNotNullParameter(expiryExtension, "expiryExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = flowInputData;
        this.f14319p = balanceExtension;
        this.f14320q = extension;
        this.f14321r = validatorExtension;
        this.f14322s = expiryExtension;
        this.f14323t = mra.d.b(this, new i(((PendingPaymentContract$InputData.Apm) flowInputData).f102401b, new Data(null, null, true, 3, null), zhm.f0.f322471a, null, null), stateMapper, null, false, 12);
    }

    public static void I2(String str) {
        Intrinsics.checkNotNullExpressionValue("d0", "TAG");
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.INFO, "d0", "[X][PendingPaymentConfirmation] ".concat(str), null, null, 16);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, (j2) ((cbk.h) this.f14319p).o.f22677a, null, null, new a0(0, this, continuation), 3);
        bbh.a aVar = new bbh.a(2);
        cli.y yVar = this.f14323t;
        yji.l.a1(this, vkm.q.Q(new a35.d(yVar.B(aVar), 29), new w(0, this, continuation)), null, null, new a0(1, this, continuation), 3);
        yji.l.a1(this, vkm.q.Q(new z(yVar.B(new bbh.a(3)), 0), new w(1, this, continuation)), null, null, new a0(2, this, continuation), 3);
    }

    public final void J2(Object obj2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (!(obj2 instanceof cbk.f)) {
            this.f14320q.T1(new tak.c(listId, obj2));
        } else {
            sak.c cVarK2 = K2();
            this.f14319p.Z2((cbk.f) obj2, cVarK2);
        }
    }

    public final sak.c K2() {
        Object content = ((i) ((j2) this.f14323t.f22677a).getValue()).f14326b.getContent();
        if (content != null) {
            return (sak.c) content;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, vkm.q.Q(this.f14323t.B(new bbh.a(1)), new w(2, this, null)), null, new c0(this, null), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f14323t;
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (throwable instanceof PendingPaymentNotAvailableError) {
            C2(o.b.f14335a);
            return true;
        }
        if (this.f14320q.O0(throwable, (sak.c) ((i) ((j2) this.f14323t.f22677a).getValue()).f14326b.getContent())) {
            return true;
        }
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return false;
    }
}
