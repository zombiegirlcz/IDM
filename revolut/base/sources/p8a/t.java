package p8a;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes5.dex */
public final class t implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableStateFlow f234085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f234086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f234087c;
    public final e4m.e d;
    public final e4m.e e;

    public t(d0 d0Var, s sVar, MutableStateFlow mutableStateFlow) {
        this.f234085a = mutableStateFlow;
        this.f234086b = e4m.b.b(new m(d0Var, this, 2, 2));
        this.f234087c = e4m.b.b(new m(d0Var, this, 3, 2));
        this.d = e4m.b.b(new m(d0Var, this, 1, 2));
        this.e = e4m.b.b(new m(d0Var, this, 0, 2));
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
