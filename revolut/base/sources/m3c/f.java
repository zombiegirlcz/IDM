package m3c;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.revolut_shop.ui.screen.product.IppShopProductScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IppShopProductScreenContract$InputData f202334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f202335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f202336c;
    public final e4m.e d;
    public final e4m.e e;

    public f(j jVar, e eVar, ViewController viewController, IppShopProductScreenContract$InputData ippShopProductScreenContract$InputData) {
        this.f202334a = ippShopProductScreenContract$InputData;
        this.f202335b = e4m.b.b(e4m.c.a(viewController));
        int i = 18;
        this.f202336c = e4m.b.b(new lzk.b(jVar, this, 2, i));
        this.d = e4m.b.b(new lzk.b(jVar, this, 1, i));
        this.e = e4m.b.b(new lzk.b(jVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
