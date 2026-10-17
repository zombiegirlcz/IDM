package bt6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.freelancer.impl.ui.subaccount.create.flow.FreelancerCreateTaxPocketFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements xki.c, u27.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerCreateTaxPocketFlowContract$InputData f18288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f18289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f18290c = this;
    public final e4m.e d;

    public a(b bVar, FreelancerCreateTaxPocketFlowContract$InputData freelancerCreateTaxPocketFlowContract$InputData) {
        this.f18289b = bVar;
        this.f18288a = freelancerCreateTaxPocketFlowContract$InputData;
        this.d = e4m.b.b(new a0b.a(bVar, this, 24));
    }

    @Override // u27.a
    public final b0 b() {
        return new b0(this.f18289b, this.f18290c, 1);
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
