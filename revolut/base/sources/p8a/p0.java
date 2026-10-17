package p8a;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes5.dex */
public final class p0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableStateFlow f234051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f234052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f234053c;
    public final e4m.e d;
    public final e4m.e e;

    public p0(d0 d0Var, o0 o0Var, ViewController viewController, MutableStateFlow mutableStateFlow) {
        this.f234052b = d0Var;
        this.f234051a = mutableStateFlow;
        this.f234053c = e4m.b.b(e4m.c.a(viewController));
        int i = 12;
        this.d = e4m.b.b(new m(d0Var, this, 1, i));
        this.e = e4m.b.b(new m(d0Var, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
