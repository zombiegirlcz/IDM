package mrg;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.view.image.impl.flow.ViewImageFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements qji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewImageFlowContract$InputData f208128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f208129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f208130c = this;
    public final e4m.e d;
    public final e4m.e e;

    public d(c cVar, ViewImageFlowContract$InputData viewImageFlowContract$InputData) {
        this.f208129b = cVar;
        this.f208128a = viewImageFlowContract$InputData;
        int i = 25;
        this.d = e4m.b.b(new mjl.b(cVar, this, 1, i));
        this.e = e4m.b.b(new mjl.b(cVar, this, 0, i));
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }
}
