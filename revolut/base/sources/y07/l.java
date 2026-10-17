package y07;

import com.revolut.data.model.Data;
import et6.h1;
import jki.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends jki.g implements i {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h1 f310163p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ang.f f310164q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f310165r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g f310166s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(h1 freelancerInteractor, ang.f userInteractor, j60.a bottomDialogExtension, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(freelancerInteractor, "freelancerInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f310163p = freelancerInteractor;
        this.f310164q = userInteractor;
        this.f310165r = bottomDialogExtension;
        this.f310166s = new g(new Data(null, null, true, 3, null), null, null, false);
    }

    @Override // yji.l
    public final void I1() {
        y2();
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f310166s;
    }

    public final void y2() {
        yji.l.a1(this, rd0.e.b(kli.a.h(this.f310164q.k(false), this.f310163p.c())), null, null, new xv4.o(this, (Continuation) null, 13), 3);
    }
}
