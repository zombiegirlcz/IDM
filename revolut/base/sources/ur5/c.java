package ur5;

import com.revolut.data.model.Data;
import efm.r;
import io3.k;
import io3.l;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.jetbrains.annotations.NotNull;
import ppk.f;
import toh.h;
import ue0.e;
import wsg.n;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f282248c = u.c(k.ACTIVE);
    public static final List d = u.c(l.REVX_FIAT);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f282249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f282250b;

    public c(f ratesInteractor, n walletInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        this.f282249a = walletInteractor;
        this.f282250b = ratesInteractor;
    }

    public final r c(xi0.b resultingCurrency, n9l.b period) {
        Intrinsics.checkNotNullParameter(resultingCurrency, "resultingCurrency");
        Intrinsics.checkNotNullParameter(period, "period");
        return nim.a.w(u1.d(a.a(this, null, resultingCurrency, 5), nim.a.w(e.E(pd.b.r(a.b(this, null, 3), new h(this, 26, period, resultingCurrency)), new Data(f0.f322471a, null, false, 6, null)), new upc.b(25))), new ou5.a(this, resultingCurrency, 28));
    }
}
