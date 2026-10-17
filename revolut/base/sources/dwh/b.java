package dwh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature_autoinvest_ui_impl.ui.move.AutoInvestMoveScreenContract$InputData;
import dw3.v7;
import java.util.Set;
import xki.e;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AutoInvestMoveScreenContract$InputData f120396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f120397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f120398c;
    public final e4m.e d;

    public b(c cVar, AutoInvestMoveScreenContract$InputData autoInvestMoveScreenContract$InputData) {
        this.f120396a = autoInvestMoveScreenContract$InputData;
        this.f120397b = e4m.b.b(new v7(cVar, this, 2, 13));
        this.f120398c = e4m.b.b(new v7(cVar, this, 1, 13));
        this.d = e4m.b.b(new v7(cVar, this, 0, 13));
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
