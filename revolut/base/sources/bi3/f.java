package bi3;

import b6b.m;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.checkout.impl.resume.flow.ResumeCheckoutFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResumeCheckoutFlowContract$InputData f15419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f15420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f15421c;
    public final e4m.e d;

    public f(e eVar, ResumeCheckoutFlowContract$InputData resumeCheckoutFlowContract$InputData) {
        this.f15420b = eVar;
        this.f15419a = resumeCheckoutFlowContract$InputData;
        int i = 21;
        this.f15421c = e4m.b.b(new m(eVar, this, 1, i));
        this.d = e4m.b.b(new m(eVar, this, 0, i));
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
