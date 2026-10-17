package fgd;

import com.revolut.feature.shared_separate_favourites.common.screen.asset_type_chooser.SharedFavouritesAssetTypeChooserScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import vc.s;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BaseScreen f135032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedFavouritesAssetTypeChooserScreenContract$InputData f135033c;
    public final Object d;
    public final Object e;

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f135031a = i;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f135031a) {
            case 0:
                this.f135032b = baseScreen;
                break;
            default:
                this.f135032b = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f135031a) {
            case 0:
                s.h(this.f135032b, BaseScreen.class);
                s.h(this.f135033c, SharedFavouritesAssetTypeChooserScreenContract$InputData.class);
                return new b((d) this.d, (c) this.e, this.f135032b, this.f135033c);
            default:
                s.h(this.f135032b, BaseScreen.class);
                s.h(this.f135033c, SharedFavouritesAssetTypeChooserScreenContract$InputData.class);
                return new b((ned.e) this.d, (ned.c) this.e, this.f135032b, this.f135033c);
        }
    }
}
