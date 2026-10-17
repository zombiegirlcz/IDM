package ewj;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.impl.userauth.flow.UserOnboardingFlowContract$InputData;
import dw3.w3;
import e4m.e;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements xki.c, xwj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserOnboardingFlowContract$InputData f130316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f130317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f130318c = this;
    public final e d;

    public d(c cVar, UserOnboardingFlowContract$InputData userOnboardingFlowContract$InputData) {
        this.f130317b = cVar;
        this.f130316a = userOnboardingFlowContract$InputData;
        this.d = e4m.b.b(new w3(cVar, this, 25));
    }

    @Override // xwj.a
    public final a b() {
        return new a(this.f130317b, this.f130318c);
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
