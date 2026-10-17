package fgd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared_separate_favourites.common.screen.asset_type_chooser.SharedFavouritesAssetTypeChooserScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import fa0.q;
import java.util.Set;
import ms1.s;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135034a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedFavouritesAssetTypeChooserScreenContract$InputData f135035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f135036c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f135037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f135038h;
    public final e4m.e i;

    public b(d dVar, c cVar, BaseScreen baseScreen, SharedFavouritesAssetTypeChooserScreenContract$InputData sharedFavouritesAssetTypeChooserScreenContract$InputData) {
        this.f135035b = sharedFavouritesAssetTypeChooserScreenContract$InputData;
        this.f135036c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 11;
        this.d = e4m.b.b(new q(dVar, this, 2, i));
        this.e = e4m.b.b(new q(dVar, this, 1, i));
        this.f = e4m.b.b(new q(dVar, this, 0, i));
        this.f135037g = e4m.b.b(new q(dVar, this, 4, i));
        this.f135038h = e4m.b.b(new q(dVar, this, 5, i));
        this.i = e4m.b.b(new q(dVar, this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        switch (this.f135034a) {
        }
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        switch (this.f135034a) {
        }
        return ImmutableSet.of((yji.d) this.f.get());
    }

    public b(ned.e eVar, ned.c cVar, BaseScreen baseScreen, SharedFavouritesAssetTypeChooserScreenContract$InputData sharedFavouritesAssetTypeChooserScreenContract$InputData) {
        this.f135035b = sharedFavouritesAssetTypeChooserScreenContract$InputData;
        this.f135036c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 16;
        this.d = e4m.b.b(new s(eVar, this, 2, i));
        this.e = e4m.b.b(new s(eVar, this, 1, i));
        this.f = e4m.b.b(new s(eVar, this, 0, i));
        this.f135037g = e4m.b.b(new s(eVar, this, 4, i));
        this.f135038h = e4m.b.b(new s(eVar, this, 5, i));
        this.i = e4m.b.b(new s(eVar, this, 3, i));
    }
}
