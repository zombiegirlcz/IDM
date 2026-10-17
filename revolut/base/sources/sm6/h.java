package sm6;

import com.revolut.feature.external_accounts.impl.domain.india.upi.model.IndiaUpiProvider;
import com.revolut.feature.external_accounts.impl.ui.india.upi.screen.applications.UpiApplicationsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ UpiApplicationsScreen f264367w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(UpiApplicationsScreen upiApplicationsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f264367w = upiApplicationsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f264367w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            default:
                h hVar2 = new h(this.f264367w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((IndiaUpiProvider) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        UpiApplicationsScreen upiApplicationsScreen = this.f264367w;
        switch (i) {
            case 0:
                IndiaUpiProvider indiaUpiProvider = (IndiaUpiProvider) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVarD3 = upiApplicationsScreen.R2();
                String appId = indiaUpiProvider.f72374a;
                boolean z = indiaUpiProvider.e;
                pVarD3.getClass();
                Intrinsics.checkNotNullParameter(appId, "appId");
                pVarD3.n2(new l10.m(z, pVarD3, appId, (Continuation) null, 21), new whi.b(6));
                break;
            default:
                String query = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVarD32 = upiApplicationsScreen.R2();
                Intrinsics.h(query);
                pVarD32.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                pVarD32.H2(pVarD32.f264380r, new sef.j(query, 2));
                break;
        }
        return Unit.f186387a;
    }
}
