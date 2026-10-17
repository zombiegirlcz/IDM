package us6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.freelancer.impl.ui.prompt.post_activation.ProPostActivationScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class m1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProPostActivationScreenContract$InputData f282627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f282628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f282629c;

    public m1(q qVar, ProPostActivationScreenContract$InputData proPostActivationScreenContract$InputData) {
        this.f282627a = proPostActivationScreenContract$InputData;
        int i = 10;
        this.f282628b = e4m.b.b(new q0(qVar, this, 1, i));
        this.f282629c = e4m.b.b(new q0(qVar, this, 0, i));
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
