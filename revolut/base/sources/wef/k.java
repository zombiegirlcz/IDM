package wef;

import com.revolut.data.model.Data;
import com.revolut.feature.transaction.recogniser.api.domain.models.Location;
import com.revolut.feature.transaction.recogniser.api.domain.models.TransactionRecogniserDetails;
import efm.n;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f296774w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(l lVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f296774w = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k kVar = new k(this.f296774w, continuation, 0);
                kVar.v = obj2;
                return kVar;
            default:
                k kVar2 = new k(this.f296774w, continuation, 1);
                kVar2.v = obj2;
                return kVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((k) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((k) create((Location) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        l lVar = this.f296774w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                lVar.x2(new w56.o(data, 16));
                TransactionRecogniserDetails transactionRecogniserDetails = (TransactionRecogniserDetails) data.getContent();
                String address = transactionRecogniserDetails != null ? transactionRecogniserDetails.f : null;
                if (address == null) {
                    return new go.g(null, 2);
                }
                hff.c cVar = lVar.f296778s;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(address, "address");
                z39.b bVar = (z39.b) cVar.f151800a;
                Intrinsics.checkNotNullParameter(address, "address");
                n nVarD = bVar.f319221b.d(address);
                efm.i iVarB = nVarD instanceof nfm.b ? ((nfm.b) nVarD).b() : new qfm.c(nVarD, 2);
                Intrinsics.checkNotNullExpressionValue(iVarB, "toFlowable(...)");
                return new exe.j(blm.g.a(iVarB), 13);
            default:
                Location location = (Location) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                lVar.x2(new wdb.b(location, 5));
                return Unit.f186387a;
        }
    }
}
