package ft4;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.credit.card.impl.ui.instalment.transactions.InstalmentTransactionsScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import om4.r1;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes22.dex */
public final class i0 extends oki.h implements q {

    @NotNull
    public static final x Companion = new x();
    public final InstalmentTransactionsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final whf.b f137910p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final al4.m f137911q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final al4.e f137912r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ang.f f137913s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f137914t;
    public final j2 u;
    public final cli.y v;

    public i0(InstalmentTransactionsScreenContract$InputData inputData, whf.b transactionItemsProvider, al4.m creditCardInstalmentInteractor, al4.e creditCardDebitToInstalmentInteractor, ang.f userInteractor, b instalmentTransactionSelectionPolicy, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transactionItemsProvider, "transactionItemsProvider");
        Intrinsics.checkNotNullParameter(creditCardInstalmentInteractor, "creditCardInstalmentInteractor");
        Intrinsics.checkNotNullParameter(creditCardDebitToInstalmentInteractor, "creditCardDebitToInstalmentInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(instalmentTransactionSelectionPolicy, "instalmentTransactionSelectionPolicy");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f137910p = transactionItemsProvider;
        this.f137911q = creditCardInstalmentInteractor;
        this.f137912r = creditCardDebitToInstalmentInteractor;
        this.f137913s = userInteractor;
        this.f137914t = instalmentTransactionSelectionPolicy;
        this.u = vkm.q.c("");
        this.v = mra.d.b(this, new m(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.q(new f0(t1.g(this.u, 300L), 0)), null, null, new c0(this, continuation, 1), 3);
        Flow flowH = xam.a.h(new c0(this, continuation, 2), nim.a.v(((r1) this.f137911q).m(this.o.f69528a, w4l.i.f294643c), new w(1)));
        zhm.h0 h0Var = zhm.h0.f322473a;
        yji.l.a1(this, nim.a.v(u0.m(rd0.e.n(flowH, h0Var), rd0.e.n(xam.a.h(new c0(this, continuation, 4), nim.a.y(xam.a.h(new c0(this, continuation, 3), nim.a.v(this.f137913s.j(w4l.j.f294644c), d0.f)), new w(0))), h0Var)), new fo9.a(29)), null, null, new c0(this, continuation, 0), 3);
    }

    public final i I2() {
        k kVar;
        cli.y yVar = this.v;
        l lVar = (l) ((m) ((j2) yVar.f22677a).getValue()).f137920a.getContent();
        i iVar = null;
        if (lVar != null) {
            int i = b0.f137896a[((m) ((j2) yVar.f22677a).getValue()).f137921b.ordinal()];
            if (i == 1) {
                kVar = lVar.f137917a;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                kVar = lVar.f137918b;
            }
            if (kVar instanceof i) {
                iVar = (i) kVar;
            }
        }
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
