package eic;

import cli.y;
import com.revolut.data.model.Data;
import e8e.w;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import wli.x;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends oki.h implements r {
    public final ugc.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f126484p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f126485q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f126486r;

    public t(ugc.a conciergeAlbertineInteractor, x deeplinkHandler, bof.r stateMapper) {
        Intrinsics.checkNotNullParameter(conciergeAlbertineInteractor, "conciergeAlbertineInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = conciergeAlbertineInteractor;
        this.f126484p = deeplinkHandler;
        this.f126485q = new vii.b();
        this.f126486r = mra.d.b(this, new h(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.n(vkm.q.Q(this.f126485q, new dz6.n(continuation, this, 12)), h0.f322473a), null, null, new ea4.d(this, continuation, 18), 3);
    }

    public final void I2(Object obj2, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Continuation continuation = null;
        if (obj2 instanceof q) {
            n2(new w(this, ((q) obj2).f126480a, continuation, 27), new whi.b(6));
        } else if (obj2 instanceof bic.c) {
            n2(new w(this, ((bic.c) obj2).f15468a, continuation, 27), new whi.b(6));
        } else if (obj2 instanceof p) {
            C2(new n(((p) obj2).f126479a));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f126486r;
    }
}
