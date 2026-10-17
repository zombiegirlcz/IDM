package qve;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.topup_screen.impl.flow.topup_methods.TopupMethodsFlowContract$InputData;
import java.util.Set;
import ql7.v1;

/* JADX INFO: loaded from: classes8.dex */
public final class x implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopupMethodsFlowContract$InputData f249682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f249683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f249684c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public x(w wVar, TopupMethodsFlowContract$InputData topupMethodsFlowContract$InputData) {
        this.f249683b = wVar;
        this.f249682a = topupMethodsFlowContract$InputData;
        int i = 20;
        this.d = e4m.b.b(new v1(wVar, this, 0, i));
        this.e = e4m.b.b(new v1(wVar, this, 2, i));
        this.f = e4m.b.b(new v1(wVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
