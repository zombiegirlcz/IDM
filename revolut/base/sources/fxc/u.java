package fxc;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.select.payment.impl.ui.select_card.SelectPaymentScreenContract$InputData;
import e0f.z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class u extends oki.h implements l {

    @NotNull
    public static final q Companion = new q();
    public final SelectPaymentScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y51.a f138805p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ang.f f138806q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f138807r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f138808s;

    public u(p stateMapper, SelectPaymentScreenContract$InputData inputData, y51.a externalCardsInteractor, ang.f userInteractor, b externalCardStatusMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(externalCardsInteractor, "externalCardsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(externalCardStatusMapper, "externalCardStatusMapper");
        this.o = inputData;
        this.f138805p = externalCardsInteractor;
        this.f138806q = userInteractor;
        this.f138807r = externalCardStatusMapper;
        this.f138808s = mra.d.b(this, new i(new Data(null, null, true, 3, null), inputData.f85820a, inputData.d), stateMapper, null, false, 12);
    }

    public final void I2() {
        yji.l.b1(this, rd0.e.b(nim.a.w(kli.a.h(((z) this.f138805p).d(), this.f138806q.k(false)), new fwf.n(8))), null, new fna.f(this, null, 24), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        I2();
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f138808s;
    }
}
