package f96;

import a94.q;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.q0;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends oki.h implements c {

    @NotNull
    public static final h Companion = new h();
    public final b96.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final tqi.e f132842p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t70.g f132843q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c70.a f132844r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f132845s;

    public i(j stateMapper, b96.e directDepositInteractor, tqi.e shareExternalDestinationFactory, t70.g localization, c70.a clipboard) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(directDepositInteractor, "directDepositInteractor");
        Intrinsics.checkNotNullParameter(shareExternalDestinationFactory, "shareExternalDestinationFactory");
        Intrinsics.checkNotNullParameter(localization, "localization");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        this.o = directDepositInteractor;
        this.f132842p = shareExternalDestinationFactory;
        this.f132843q = localization;
        this.f132844r = clipboard;
        this.f132845s = mra.d.b(this, new a(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        xi0.b.Companion.getClass();
        xi0.b currency = xi0.b.i;
        b96.e eVar = this.o;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        Continuation continuation = null;
        l.a1(this, new q0(nim.a.v(rd0.e.b(z71.a.b(eVar.f13671a, true, null, null, 6)), new q(5, currency)), new b96.d(eVar, currency, continuation, 0), 1), null, null, new ew1.d(this, continuation, 29), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f132845s;
    }
}
