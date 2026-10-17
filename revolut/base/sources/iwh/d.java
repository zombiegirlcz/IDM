package iwh;

import com.revolut.feature_cards_kompot_flows_api.navigation.CardDetailsFlowDestination;
import vc.s;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f169095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f169096b;

    public d(c cVar, e eVar) {
        this.f169095a = cVar;
        this.f169096b = eVar;
    }

    @Override // phm.a
    public final Object get() {
        CardDetailsFlowDestination.InputData inputData = this.f169096b.f169097a;
        gte.a aVarB = this.f169095a.d.b();
        s.j(aVarB);
        return new com.revolut.feature_cards_kompot_flows_impl.flow.a(inputData, aVarB);
    }
}
