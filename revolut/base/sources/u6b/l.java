package u6b;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import zhm.r0;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends oki.h implements i {
    public final c6b.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w6b.c f277537p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f277538q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f277539r;

    public l(n stateMapper, c6b.a accountsInteractor, w6b.c dialogsMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(accountsInteractor, "accountsInteractor");
        Intrinsics.checkNotNullParameter(dialogsMapper, "dialogsMapper");
        this.o = accountsInteractor;
        this.f277537p = dialogsMapper;
        this.f277538q = new vii.b();
        this.f277539r = mra.d.b(this, new e(r0.g(), r0.g(), new Data(null, null, true, 3, null), false), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f277538q, new tik.b(continuation, this, 24)), null, null, new tz6.e(this, continuation, 26), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f277539r;
    }
}
