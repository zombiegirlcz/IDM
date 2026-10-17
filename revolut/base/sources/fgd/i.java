package fgd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared_separate_favourites.common.screen.add_asset.SharedFavouritesAddAssetScreenContract$InputData;
import fa0.q;
import java.util.Set;
import ms1.s;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135057a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedFavouritesAddAssetScreenContract$InputData f135058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f135059c;
    public final e4m.e d;

    public i(d dVar, c cVar, SharedFavouritesAddAssetScreenContract$InputData sharedFavouritesAddAssetScreenContract$InputData) {
        this.f135058b = sharedFavouritesAddAssetScreenContract$InputData;
        int i = 13;
        this.f135059c = e4m.b.b(new q(dVar, this, 1, i));
        this.d = e4m.b.b(new q(dVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        switch (this.f135057a) {
        }
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        switch (this.f135057a) {
        }
        return ImmutableSet.of();
    }

    public i(ned.e eVar, ned.c cVar, SharedFavouritesAddAssetScreenContract$InputData sharedFavouritesAddAssetScreenContract$InputData) {
        this.f135058b = sharedFavouritesAddAssetScreenContract$InputData;
        int i = 21;
        this.f135059c = e4m.b.b(new s(eVar, this, 1, i));
        this.d = e4m.b.b(new s(eVar, this, 0, i));
    }
}
