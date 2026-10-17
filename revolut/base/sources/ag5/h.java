package ag5;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFeesDialogMode;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vf0.p;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends oki.h implements c {

    @NotNull
    public static final e Companion = new e();
    public final vf5.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final sd5.c f4793p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CryptoExchangeFeesDialogMode f4794q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f4795r;

    public h(n stateMapper, vf5.d cryptoExchangeFeesInteractor, sd5.c cryptoConfigInteractor, CryptoExchangeFeesDialogMode mode) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(cryptoExchangeFeesInteractor, "cryptoExchangeFeesInteractor");
        Intrinsics.checkNotNullParameter(cryptoConfigInteractor, "cryptoConfigInteractor");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.o = cryptoExchangeFeesInteractor;
        this.f4793p = cryptoConfigInteractor;
        this.f4794q = mode;
        this.f4795r = mra.d.b(this, new d(new Data(null, null, true, 3, null), mode, null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, rd0.e.b(m70.a.g(this.f4793p.a(false), null, null, 3)), null, new g(this, null, 0), 3);
        if (this.f4794q == CryptoExchangeFeesDialogMode.INFORMATIONAL) {
            return;
        }
        vf5.d dVar = this.o;
        dVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        nf5.d dVar2 = dVar.f288509b;
        dVar2.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l.b1(this, nim.a.v(dVar2.e.b(Unit.f186387a, loadingStrategy), new p(6)), null, new g(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f4795r;
    }
}
