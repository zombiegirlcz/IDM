package u7i;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature_move_money.impl.amount.order_settings.OrderSettingsScreenContract$InputData;
import java.util.Set;
import u45.w0;

/* JADX INFO: loaded from: classes10.dex */
public final class r implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OrderSettingsScreenContract$InputData f277891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f277892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f277893c;
    public final e4m.e d;

    public r(l lVar, OrderSettingsScreenContract$InputData orderSettingsScreenContract$InputData) {
        this.f277892b = lVar;
        this.f277891a = orderSettingsScreenContract$InputData;
        int i = 6;
        this.f277893c = e4m.b.b(new w0(lVar, this, 1, i));
        this.d = e4m.b.b(new w0(lVar, this, 0, i));
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
