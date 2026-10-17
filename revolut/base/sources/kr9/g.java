package kr9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.GroupDetailsFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements xki.c, ct9.a, gt9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GroupDetailsFlowContract$InputData f188741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f188742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f188743c = this;
    public final e4m.e d = e4m.b.b(new k2e.g(this, 17));

    public g(l lVar, GroupDetailsFlowContract$InputData groupDetailsFlowContract$InputData) {
        this.f188742b = lVar;
        this.f188741a = groupDetailsFlowContract$InputData;
    }

    @Override // ct9.a
    public final o b() {
        return new o(this.f188742b, this.f188743c, 0);
    }

    @Override // gt9.a
    public final q c() {
        return new q(this.f188742b, this.f188743c, 0);
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
