package bg2;

import au6.a3;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.apm.upi.impl.flow.screen.amount.UpiTransferAmountScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import om4.k0;
import org.jetbrains.annotations.NotNull;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class x extends oki.h implements k {
    public static final long A;

    @NotNull
    public static final q Companion = new q();
    public final UpiTransferAmountScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wsg.n f15084p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w80.b f15085q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wf2.e f15086r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n60.b f15087s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l2j.a f15088t;
    public final rf2.a u;
    public final vo9.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l80.e f15089w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final zjh.c f15090x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final k0 f15091y;
    public final y z;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        A = kotlin.time.c.g(400, pkm.e.MILLISECONDS);
    }

    public x(UpiTransferAmountScreenContract$InputData inputData, wsg.n walletInteractor, w80.b amountFormatter, cli.n stateMapper, wf2.e interactor, n60.b keyboardViewControllerExtension, l2j.a currencyChooserFlowFactory, rf2.a dialogProvider, vo9.a pocketMapper, l80.e dateProvider, zjh.c scheduleScreenProvider, k0 creditCardFeatureInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(keyboardViewControllerExtension, "keyboardViewControllerExtension");
        Intrinsics.checkNotNullParameter(currencyChooserFlowFactory, "currencyChooserFlowFactory");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(pocketMapper, "pocketMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(scheduleScreenProvider, "scheduleScreenProvider");
        Intrinsics.checkNotNullParameter(creditCardFeatureInteractor, "creditCardFeatureInteractor");
        this.o = inputData;
        this.f15084p = walletInteractor;
        this.f15085q = amountFormatter;
        this.f15086r = interactor;
        this.f15087s = keyboardViewControllerExtension;
        this.f15088t = currencyChooserFlowFactory;
        this.u = dialogProvider;
        this.v = pocketMapper;
        this.f15089w = dateProvider;
        this.f15090x = scheduleScreenProvider;
        this.f15091y = creditCardFeatureInteractor;
        dj0.d dVar = inputData.f63001b;
        io3.d.Companion.getClass();
        this.z = mra.d.b(this, new g(dVar, inputData.f63000a, inputData.e, "", io3.d.f163144x, null, AccountId.Personal.f51414a, inputData.f63002c, inputData.i, false, inputData.f63005j, null, inputData.d == we2.a.QR_UPLOAD), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.b(this.f15087s.d), null, null, new v(this, null, 0), 3);
        l2(new u(this, continuation, 1), new yi5.b(26));
        bek.a aVar = new bek.a(3);
        y yVar = this.z;
        yji.l.a1(this, vkm.q.Q(vkm.q.q(yVar.B(aVar)), new a3(continuation, this, 18)), null, null, new v(this, null, 1), 3);
        yji.l.a1(this, vkm.q.H(new be7.s(this, continuation, 4), t1.f(vkm.q.q(yVar.B(new bek.a(4))), A)), null, null, new v(this, null, 2), 3);
    }

    public final void I2(String str) {
        y yVar = this.z;
        dj0.d dVar = ((g) ((j2) yVar.f22677a).getValue()).f15052a;
        j2 j2Var = (j2) yVar.f22677a;
        C2(new i(((g) j2Var.getValue()).i, dVar, ((g) j2Var.getValue()).e, ((g) j2Var.getValue()).d, str));
    }

    public final void J2() {
        y yVar = this.z;
        yji.l.g2(this, this.f15090x.l(((g) ((j2) yVar.f22677a).getValue()).k, ((g) ((j2) yVar.f22677a).getValue()).i), null, new o(this, 1), 1);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.z;
    }
}
