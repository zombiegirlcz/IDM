package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.CreditPromptFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class q1 implements xki.c, u74.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditPromptFlowContract$InputData f119559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f119560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q1 f119561c = this;
    public final e4m.e d;
    public final e4m.e e;

    public q1(c1 c1Var, CreditPromptFlowContract$InputData creditPromptFlowContract$InputData) {
        this.f119560b = c1Var;
        this.f119559a = creditPromptFlowContract$InputData;
        int i = 25;
        this.d = e4m.b.b(new cbb.b(this, 0, i));
        this.e = e4m.b.b(new cbb.b(this, 1, i));
    }

    @Override // u74.a
    public final b8 b() {
        return new b8(this.f119560b, this.f119561c, 1);
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
