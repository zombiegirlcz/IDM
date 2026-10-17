package p12;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.review.TransferReviewContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class w0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferReviewContract$InputData f231810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f231811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f231812c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f231813g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f231814h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f231815j;
    public final e4m.e k;

    public w0(v vVar, l0 l0Var, ViewController viewController, TransferReviewContract$InputData transferReviewContract$InputData) {
        this.f231811b = vVar;
        this.f231812c = l0Var;
        this.f231810a = transferReviewContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 22;
        this.e = e4m.b.b(new ned.h(vVar, l0Var, this, 2, i));
        this.f = e4m.b.b(new ned.h(vVar, l0Var, this, 1, i));
        this.f231813g = e4m.b.b(new ned.h(vVar, l0Var, this, 0, i));
        this.f231814h = e4m.b.b(new ned.h(vVar, l0Var, this, 4, i));
        this.i = e4m.b.b(new ned.h(vVar, l0Var, this, 3, i));
        this.f231815j = e4m.b.b(new ned.h(vVar, l0Var, this, 6, i));
        this.k = e4m.b.b(new ned.h(vVar, l0Var, this, 5, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.i.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f231813g.get());
    }
}
