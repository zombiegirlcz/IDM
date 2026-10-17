package ppd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.spending_analytics.impl.ui.rev10.select.SelectTransactionContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class r0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectTransactionContract$InputData f238535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f238536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f238537c;
    public final e4m.e d;
    public final e4m.e e;

    public r0(n nVar, SelectTransactionContract$InputData selectTransactionContract$InputData) {
        this.f238536b = nVar;
        this.f238535a = selectTransactionContract$InputData;
        int i = 2;
        this.f238537c = e4m.b.b(new i0(nVar, this, 1, i));
        this.d = e4m.b.b(new i0(nVar, this, 2, i));
        this.e = e4m.b.b(new i0(nVar, this, 0, i));
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
