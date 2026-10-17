package wcb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.private_banking.impl.ui.deposit_assets.screen.DepositAssetsScreenContract$Input;
import java.util.Set;
import xki.e;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DepositAssetsScreenContract$Input f296384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f296385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f296386c;

    public b(c cVar, a aVar, DepositAssetsScreenContract$Input depositAssetsScreenContract$Input) {
        this.f296384a = depositAssetsScreenContract$Input;
        int i = 9;
        this.f296385b = e4m.b.b(new vy9.a(this, 1, i));
        this.f296386c = e4m.b.b(new vy9.a(this, 0, i));
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
