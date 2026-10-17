package nm8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.junior_rewards.impl.ui.details_dialog.JuniorRewardDetailsDialogScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import nk7.k;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorRewardDetailsDialogScreenContract$InputData f217202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f217203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f217204c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public c(e eVar, ViewController viewController, JuniorRewardDetailsDialogScreenContract$InputData juniorRewardDetailsDialogScreenContract$InputData) {
        this.f217204c = eVar;
        this.f217202a = juniorRewardDetailsDialogScreenContract$InputData;
        this.f217203b = viewController;
        int i = 8;
        this.d = e4m.b.b(new k(eVar, this, 1, i));
        this.e = e4m.b.b(new k(eVar, this, 2, i));
        this.f = e4m.b.b(new k(eVar, this, 0, i));
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
