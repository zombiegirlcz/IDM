package g2j;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CurrencyChooserFlowDestination.InputData f140106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f140107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f140108c = this;
    public final e4m.e d = e4m.b.b(new g(this));

    public h(f fVar, CurrencyChooserFlowDestination.InputData inputData) {
        this.f140107b = fVar;
        this.f140106a = inputData;
    }

    @Override // j2j.b
    public final j2j.a b() {
        return new o(this.f140107b, this.f140108c);
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }
}
