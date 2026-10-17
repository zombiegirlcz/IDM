package ms1;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.bizum.api.navigation.BizumFlowInputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements qji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BizumFlowInputData f208553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f208554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f208555c;
    public final e4m.e d;
    public final e4m.e e;

    public l(j jVar, BizumFlowInputData bizumFlowInputData) {
        this.f208554b = jVar;
        this.f208553a = bizumFlowInputData;
        int i = 27;
        this.f208555c = e4m.b.b(new mjl.b(jVar, this, 1, i));
        this.d = e4m.b.b(new mjl.b(jVar, this, 0, i));
        this.e = e4m.b.b(new mjl.b(jVar, this, 2, i));
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }
}
