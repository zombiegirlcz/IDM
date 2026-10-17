package j17;

import com.revolut.data.model.Data;
import gr6.j;
import iyi.i;
import jki.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j f170135p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f170136q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j interactor, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f170135p = interactor;
        this.f170136q = new d(new Data(null, null, false, 7, null));
    }

    @Override // yji.l
    public final void T1(long j2) {
        x2(new j1.e(1));
        n2(new af3.f((Object) this, false, (Continuation) null, 21), new i(this, 7));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f170136q;
    }
}
