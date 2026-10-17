package fgd;

import com.revolut.feature.shared_separate_favourites.common.screen.add_asset.SharedFavouritesAddAssetScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import vc.s;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BaseScreen f135055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedFavouritesAddAssetScreenContract$InputData f135056c;
    public final Object d;
    public final Object e;

    public /* synthetic */ h(Object obj2, Object obj3, int i) {
        this.f135054a = i;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f135054a) {
            case 0:
                this.f135055b = baseScreen;
                break;
            default:
                this.f135055b = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f135054a) {
            case 0:
                s.h(this.f135055b, BaseScreen.class);
                s.h(this.f135056c, SharedFavouritesAddAssetScreenContract$InputData.class);
                return new i((d) this.d, (c) this.e, this.f135056c);
            default:
                s.h(this.f135055b, BaseScreen.class);
                s.h(this.f135056c, SharedFavouritesAddAssetScreenContract$InputData.class);
                return new i((ned.e) this.d, (ned.c) this.e, this.f135056c);
        }
    }
}
