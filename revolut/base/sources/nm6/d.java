package nm6;

import com.revolut.feature.external_accounts.impl.domain.india.netbanking.model.IndiaNetBankingProvider;
import com.revolut.feature.external_accounts.impl.ui.india.netbanking.screen.institutions.IndiaNetBankingInstitutionsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njj.n0;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ IndiaNetBankingInstitutionsScreen f217182w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(IndiaNetBankingInstitutionsScreen indiaNetBankingInstitutionsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f217182w = indiaNetBankingInstitutionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f217182w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f217182w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((IndiaNetBankingProvider) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        IndiaNetBankingInstitutionsScreen indiaNetBankingInstitutionsScreen = this.f217182w;
        switch (i) {
            case 0:
                IndiaNetBankingProvider indiaNetBankingProvider = (IndiaNetBankingProvider) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVar = (j) indiaNetBankingInstitutionsScreen.N.getValue();
                String id10 = indiaNetBankingProvider.f72369a;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                jVar.n2(new n0(jVar, id10, null, 6), new whi.b(6));
                break;
            default:
                String query = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVar2 = (j) indiaNetBankingInstitutionsScreen.N.getValue();
                Intrinsics.h(query);
                jVar2.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                jVar2.H2(jVar2.f217193r, new nj8.b(query, 4));
                break;
        }
        return Unit.f186387a;
    }
}
