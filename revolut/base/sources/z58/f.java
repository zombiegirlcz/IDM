package z58;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.junior.account_activation.impl.ui.flow.activation.AccountActivationFlowContract$InputData;
import java.util.Set;
import z0g.k0;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountActivationFlowContract$InputData f319559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f319560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f319561c;
    public final e4m.e d;

    public f(j jVar, AccountActivationFlowContract$InputData accountActivationFlowContract$InputData) {
        this.f319559a = accountActivationFlowContract$InputData;
        int i = 9;
        this.f319560b = e4m.b.b(new k0(jVar, this, 1, i));
        this.f319561c = e4m.b.b(new k0(jVar, this, 2, i));
        this.d = e4m.b.b(new k0(jVar, this, 0, i));
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
