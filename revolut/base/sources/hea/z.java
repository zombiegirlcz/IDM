package hea;

import com.revolut.data.model.Data;
import com.revolut.feature_pdf_view.PdfViewFeatureConfiguration;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: classes5.dex */
public final class z extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.pockets.impl.details_v2.pocket_details.a f151678w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(int i, com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f151678w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                z zVar = new z(0, this.f151678w, continuation);
                zVar.v = obj2;
                return zVar;
            case 1:
                z zVar2 = new z(1, this.f151678w, continuation);
                zVar2.v = obj2;
                return zVar2;
            case 2:
                z zVar3 = new z(2, this.f151678w, continuation);
                zVar3.v = obj2;
                return zVar3;
            case 3:
                z zVar4 = new z(3, this.f151678w, continuation);
                zVar4.v = obj2;
                return zVar4;
            case 4:
                z zVar5 = new z(4, this.f151678w, continuation);
                zVar5.v = obj2;
                return zVar5;
            default:
                z zVar6 = new z(5, this.f151678w, continuation);
                zVar6.v = obj2;
                return zVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((z) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((z) create((d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((z) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((z) create((dda.k) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((z) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((z) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar = this.f151678w;
        switch (i) {
            case 0:
                String currencyCode = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                kea.c cVar = (kea.c) aVar.R;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
                ((MutableSharedFlow) cVar.f183063p.getValue()).k(currencyCode);
                break;
            case 1:
                d dVar = (d) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.U, new h56.a(dVar, 26));
                break;
            case 2:
                Data data = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.U, new e0(data, 0));
                break;
            case 3:
                dda.k kVar = (dda.k) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.L2(kVar);
                break;
            case 4:
                String str = (String) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.C1(new BridgeDestination(new FeatureCommand(new PdfViewFeatureConfiguration(str, null, ((ij0.d) aVar.f80863w).a(str), false, 58))));
                break;
            default:
                Data data2 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.U, new e0(data2, 1));
                break;
        }
        return Unit.f186387a;
    }
}
