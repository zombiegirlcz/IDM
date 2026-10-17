package l0k;

import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.assettype.WealthAssetTypeNewsScreenContract$InputData;
import vc.s;
import z0h.s1;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f191300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f191301c;
    public u0k.a d;
    public s1 e;
    public WealthAssetTypeNewsScreenContract$InputData f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f191302g;

    public /* synthetic */ j(c cVar, Object obj2, int i) {
        this.f191299a = i;
        this.f191300b = cVar;
        this.f191302g = obj2;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f191299a) {
            case 0:
                this.f191301c = baseScreen;
                break;
            default:
                this.f191301c = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f191299a) {
            case 0:
                s.h(this.f191301c, BaseScreen.class);
                s.h(this.d, u0k.a.class);
                s.h(this.e, s1.class);
                s.h(this.f, WealthAssetTypeNewsScreenContract$InputData.class);
                return new k(this.f191300b, (i) this.f191302g, this.d, this.e, this.f);
            default:
                s.h(this.f191301c, BaseScreen.class);
                s.h(this.d, u0k.a.class);
                s.h(this.e, s1.class);
                s.h(this.f, WealthAssetTypeNewsScreenContract$InputData.class);
                return new k(this.f191300b, (e) this.f191302g, this.d, this.e, this.f);
        }
    }
}
