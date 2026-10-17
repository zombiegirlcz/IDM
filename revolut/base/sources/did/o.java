package did;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shops.impl.ui.fullscreen_opt_in.ShopsPromptScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopsPromptScreenContract$InputData f115045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f115046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f115047c;
    public final e4m.e d;
    public final e4m.e e;

    public o(d dVar, ShopsPromptScreenContract$InputData shopsPromptScreenContract$InputData) {
        this.f115045a = shopsPromptScreenContract$InputData;
        int i = 13;
        this.f115046b = e4m.b.b(new db1.f(dVar, this, 1, i));
        this.f115047c = e4m.b.b(new db1.f(dVar, this, 0, i));
        this.d = e4m.b.b(new db1.f(dVar, this, 3, i));
        this.e = e4m.b.b(new db1.f(dVar, this, 2, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f115047c.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
