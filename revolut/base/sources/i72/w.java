package i72;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.multibanco.api.navigation.MultibancoWithdrawalInputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class w implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultibancoWithdrawalInputData f159172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f159173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f159174c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f159175g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f159176h;
    public final e4m.e i;

    public w(m mVar, MultibancoWithdrawalInputData multibancoWithdrawalInputData) {
        this.f159173b = mVar;
        this.f159172a = multibancoWithdrawalInputData;
        int i = 26;
        this.d = e4m.b.b(new hjg.b(mVar, this, 1, i));
        this.e = e4m.b.b(new hjg.b(mVar, this, 0, i));
        this.f = e4m.b.b(new hjg.b(mVar, this, 3, i));
        this.f159175g = e4m.b.b(new hjg.b(mVar, this, 2, i));
        this.f159176h = e4m.b.b(new hjg.b(mVar, this, 4, i));
        this.i = e4m.b.b(new hjg.b(mVar, this, 5, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get(), (yji.n) this.f159175g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
