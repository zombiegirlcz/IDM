package jef;

import com.revolut.feature.transaction.recogniser.impl.ui.flow.TransactionRecogniserFlowContract$InputData;
import com.revolut.kompot.navigable.flow.BaseFlow;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements qji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransactionRecogniserFlowContract$InputData f173379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f173380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f173381c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f173382g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f173383h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f173384j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f173385l;

    public g(e eVar, BaseFlow baseFlow, TransactionRecogniserFlowContract$InputData transactionRecogniserFlowContract$InputData) {
        this.f173380b = eVar;
        this.f173379a = transactionRecogniserFlowContract$InputData;
        int i = 6;
        this.d = e4m.b.b(new jdi.i(eVar, this, 0, i));
        this.e = e4m.b.b(new jdi.i(eVar, this, 3, i));
        this.f = e4m.b.b(new jdi.i(eVar, this, 4, i));
        this.f173382g = e4m.b.b(new jdi.i(eVar, this, 2, i));
        this.f173383h = e4m.b.b(new jdi.i(eVar, this, 1, i));
        this.i = e4m.b.b(new jdi.i(eVar, this, 5, i));
        int i2 = 6;
        this.f173384j = e4m.b.b(new jdi.i(eVar, this, i2, i));
        this.k = e4m.b.b(e4m.c.a(baseFlow));
        this.f173385l = e4m.b.b(new jdi.i(eVar, this, 7, i2));
    }

    @Override // dki.t
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // dki.q
    public final Set g() {
        return Collections.EMPTY_SET;
    }
}
