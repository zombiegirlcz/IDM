package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class d7 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenContentRecyclerView f118591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f118592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f118593c;
    public final e4m.e d;
    public final e4m.e e;

    public d7(c1 c1Var, i5 i5Var, ScreenContentRecyclerView screenContentRecyclerView) {
        this.f118591a = screenContentRecyclerView;
        this.f118592b = e4m.b.b(new g5(c1Var, this, 1, 25));
        this.f118593c = e4m.b.b(new g5(c1Var, this, 0, 25));
        this.d = e4m.b.b(new g5(c1Var, this, 3, 25));
        this.e = e4m.b.b(new g5(c1Var, this, 2, 25));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f118593c.get());
    }
}
