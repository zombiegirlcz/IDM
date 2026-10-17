package by6;

import bw4.s;
import cli.y;
import dy6.c;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends oki.h implements dli.b {
    public final dy6.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vii.b f19756p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f19757q;

    public k(dy6.e paymentMethodsExtension, m stateMapper) {
        Intrinsics.checkNotNullParameter(paymentMethodsExtension, "paymentMethodsExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = paymentMethodsExtension;
        this.f19756p = new vii.b();
        this.f19757q = mra.d.b(this, new g(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f19756p, new s(continuation, this, 3)), null, null, new btd.e(this, continuation, 19), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f19757q;
    }

    @Override // yji.l
    public final aii.n o2(aii.m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof c.a) {
            B2();
            return null;
        }
        if (!(event instanceof dy6.d)) {
            return super.o2(event);
        }
        H2(this.f19757q, new ax9.j(event, 1));
        return null;
    }
}
