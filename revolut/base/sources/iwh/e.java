package iwh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature_cards_kompot_flows_api.navigation.CardDetailsFlowDestination;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements kwh.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardDetailsFlowDestination.InputData f169097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f169098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f169099c = this;
    public final e4m.e d;

    public e(c cVar, CardDetailsFlowDestination.InputData inputData) {
        this.f169098b = cVar;
        this.f169097a = inputData;
        this.d = e4m.b.b(new d(cVar, this));
    }

    @Override // xv2.b
    public final xv2.a b() {
        return new i(this.f169098b, this.f169099c);
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
