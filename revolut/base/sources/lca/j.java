package lca;

import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.pix.api.navigation.PixTransferNavigation$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PixTransferNavigation$InputData.ApmTransfer f193812w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, PixTransferNavigation$InputData.ApmTransfer apmTransfer, Continuation continuation) {
        super(1, continuation);
        this.v = lVar;
        this.f193812w = apmTransfer;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j(this.v, this.f193812w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Exception {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            lx1.d dVar = this.v.f193815l;
            n02.b bVar = n02.b.PIX;
            ApmDescriptor apmDescriptor = this.f193812w.f80526a.f62141b;
            this.u = 1;
            obj2 = ((fy1.o) dVar).c(bVar, apmDescriptor, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        nx1.d dVar2 = (nx1.d) obj2;
        if (dVar2 instanceof nx1.b) {
            throw ((nx1.b) dVar2).f220054a;
        }
        return dVar2;
    }
}
