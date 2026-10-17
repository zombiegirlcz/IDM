package i72;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.multibanco.api.navigation.MultibancoCodeDetailsInputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class b0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultibancoCodeDetailsInputData f159060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f159061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f159062c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f159063g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f159064h;
    public final e4m.e i;

    public b0(m mVar, ari.b bVar, MultibancoCodeDetailsInputData.ByCode byCode) {
        this.f159061b = mVar;
        this.f159060a = byCode;
        int i = 27;
        this.f159062c = e4m.b.b(new hjg.b(mVar, this, 0, i));
        this.d = e4m.b.b(new hjg.b(mVar, this, 2, i));
        this.e = e4m.b.b(new hjg.b(mVar, this, 1, i));
        this.f = e4m.b.b(new hjg.b(mVar, this, 6, i));
        this.f159063g = e4m.b.b(new hjg.b(mVar, this, 5, i));
        this.f159064h = e4m.b.b(new hjg.b(mVar, this, 4, i));
        this.i = e4m.b.b(new hjg.b(mVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f159062c.get(), (yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
