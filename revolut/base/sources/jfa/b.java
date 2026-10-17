package jfa;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.post_activation.impl.ui.flow.PostActivationFlowContract$InputData;
import iwh.k;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PostActivationFlowContract$InputData f173748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f173749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f173750c;

    public b(a aVar, PostActivationFlowContract$InputData postActivationFlowContract$InputData) {
        this.f173749b = aVar;
        this.f173748a = postActivationFlowContract$InputData;
        this.f173750c = e4m.b.b(new k(aVar, this, 7));
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
