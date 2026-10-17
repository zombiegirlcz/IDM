package bxc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.select.payment.impl.ui.select_card.SelectPaymentScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectPaymentScreenContract$InputData f19665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f19666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f19667c;
    public final e4m.e d;

    public c(a aVar, b bVar, SelectPaymentScreenContract$InputData selectPaymentScreenContract$InputData) {
        this.f19666b = aVar;
        this.f19665a = selectPaymentScreenContract$InputData;
        int i = 4;
        this.f19667c = e4m.b.b(new bt7.e(aVar, this, 1, i));
        this.d = e4m.b.b(new bt7.e(aVar, this, 0, i));
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
