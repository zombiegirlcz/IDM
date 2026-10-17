package ehe;

import com.revolut.feature.tab.accounts.impl.total_wealth.category_list.TotalWealthCategoryListContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f126002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f126003c;
    public TotalWealthCategoryListContract$InputData d;
    public final hhe.d e;

    public /* synthetic */ d(c cVar, hhe.d dVar, int i) {
        this.f126001a = i;
        this.f126002b = cVar;
        this.e = dVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f126001a) {
            case 0:
                this.f126003c = viewController;
                break;
            default:
                this.f126003c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f126001a) {
            case 0:
                vc.s.h(this.f126003c, ViewController.class);
                vc.s.h(this.d, TotalWealthCategoryListContract$InputData.class);
                return new e(this.f126002b, (a) this.e, this.f126003c, this.d);
            default:
                vc.s.h(this.f126003c, ViewController.class);
                vc.s.h(this.d, TotalWealthCategoryListContract$InputData.class);
                return new f(this.f126002b, (b) this.e, this.f126003c, this.d);
        }
    }
}
