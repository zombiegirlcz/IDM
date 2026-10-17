package i72;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.multibanco.api.navigation.MultibancoFlowInputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class q implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultibancoFlowInputData f159149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f159150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f159151c;
    public final e4m.e d;
    public final e4m.e e;

    public q(m mVar, MultibancoFlowInputData multibancoFlowInputData) {
        this.f159150b = mVar;
        this.f159149a = multibancoFlowInputData;
        int i = 23;
        this.f159151c = e4m.b.b(new hjg.b(mVar, this, 1, i));
        this.d = e4m.b.b(new hjg.b(mVar, this, 0, i));
        this.e = e4m.b.b(new hjg.b(mVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
