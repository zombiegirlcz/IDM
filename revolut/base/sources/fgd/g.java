package fgd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared_separate_favourites.converter.ui.screen.SharedConverterScreenContract$InputData;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import fa0.q;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenContentRecyclerView f135050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedConverterScreenContract$InputData f135051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f135052c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f135053g;

    public g(d dVar, f fVar, ScreenContentRecyclerView screenContentRecyclerView, SharedConverterScreenContract$InputData sharedConverterScreenContract$InputData) {
        this.f135052c = dVar;
        this.f135050a = screenContentRecyclerView;
        this.f135051b = sharedConverterScreenContract$InputData;
        int i = 12;
        this.d = e4m.b.b(new q(dVar, this, 1, i));
        this.e = e4m.b.b(new q(dVar, this, 0, i));
        this.f = e4m.b.b(new q(dVar, this, 3, i));
        this.f135053g = e4m.b.b(new q(dVar, this, 2, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
