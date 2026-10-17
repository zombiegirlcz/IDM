package xf6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.external_accounts.impl.flow.link_result.LinkResultFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class p1 implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkResultFlowContract$InputData f304987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1 f304988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f304989c;

    public p1(o1 o1Var, LinkResultFlowContract$InputData linkResultFlowContract$InputData) {
        this.f304988b = o1Var;
        this.f304987a = linkResultFlowContract$InputData;
        this.f304989c = e4m.b.b(new i0(o1Var, this, 7));
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
