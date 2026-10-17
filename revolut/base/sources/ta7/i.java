package ta7;

import com.revolut.feature.hidden_accounts.impl.ui.screens.hidden_accounts_list.HiddenAccountsListScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import vc.s;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f269133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f269134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f269135c;
    public HiddenAccountsListScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ i(d dVar, Object obj2, int i) {
        this.f269133a = i;
        this.f269134b = dVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f269133a) {
            case 0:
                this.f269135c = viewController;
                break;
            default:
                this.f269135c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f269133a) {
            case 0:
                s.h(this.f269135c, ViewController.class);
                s.h(this.d, HiddenAccountsListScreenContract$InputData.class);
                return new j(this.f269134b, (g) this.e, this.d);
            default:
                s.h(this.f269135c, ViewController.class);
                s.h(this.d, HiddenAccountsListScreenContract$InputData.class);
                return new j(this.f269134b, (e) this.e, this.d);
        }
    }
}
