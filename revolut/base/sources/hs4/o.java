package hs4;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.instalment.past.CreditCardInstalmentsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class o extends oki.h implements dli.b {

    @NotNull
    public static final m Companion = new m();
    public final CreditCardInstalmentsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final al4.m f154998p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final fm4.a f154999q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f155000r;

    public o(CreditCardInstalmentsScreenContract$InputData inputData, al4.m creditCardInstalmentInteractor, fm4.a creditCardInstalmentProvider, p stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardInstalmentInteractor, "creditCardInstalmentInteractor");
        Intrinsics.checkNotNullParameter(creditCardInstalmentProvider, "creditCardInstalmentProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f154998p = creditCardInstalmentInteractor;
        this.f154999q = creditCardInstalmentProvider;
        this.f155000r = mra.d.b(this, new e(new Data(null, null, true, 3, null), inputData.f69409b), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.n(nim.a.v(((xt4.c) this.f154999q).a(this.o.f69408a, w4l.h.f294642c), new l(this, 0)), h0.f322473a), null, null, new hp2.d(this, null, 5), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f155000r;
    }
}
