package fhd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared_separate_favourites.common.screen.add_asset_rev10.AddAssetRev10ScreenContract$InputData;
import e4m.e;
import fa0.q;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AddAssetRev10ScreenContract$InputData f135202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f135203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f135204c;

    public a(b bVar, c cVar, AddAssetRev10ScreenContract$InputData addAssetRev10ScreenContract$InputData) {
        this.f135202a = addAssetRev10ScreenContract$InputData;
        int i = 14;
        this.f135203b = e4m.b.b(new q(bVar, this, 1, i));
        this.f135204c = e4m.b.b(new q(bVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
