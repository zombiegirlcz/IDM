package lb1;

import com.revolut.data.model.Data;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;

/* JADX INFO: loaded from: classes20.dex */
public final class n extends jki.g implements f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xa1.a f193583p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wa1.a f193584q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a2 f193585r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f193586s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p stateMapper, xa1.a orderInteractor, wa1.a strings) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(orderInteractor, "orderInteractor");
        Intrinsics.checkNotNullParameter(strings, "strings");
        this.f193583p = orderInteractor;
        this.f193584q = strings;
        this.f193586s = new c(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null);
    }

    @Override // yji.l
    public final void I1() {
        l2(new m(this, null, 0), new yi5.b(26));
        l2(new m(this, null, 1), new yi5.b(26));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f193586s;
    }
}
