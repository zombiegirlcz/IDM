package c52;

import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient;
import com.revolut.feature.transfer.models.transfer.TransferTrustData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ r v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ApmTransferRecipient.Contact f21366w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ iy9.d f21367x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ TransferTrustData f21368y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r rVar, ApmTransferRecipient.Contact contact, iy9.d dVar, TransferTrustData transferTrustData, Continuation continuation) {
        super(1, continuation);
        this.v = rVar;
        this.f21366w = contact;
        this.f21367x = dVar;
        this.f21368y = transferTrustData;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.v, this.f21366w, this.f21367x, this.f21368y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            bqf.d dVar = this.v.f21397r;
            String f62112a = this.f21366w.f62299a.getF62134a().getF62112a();
            this.u = 1;
            if (dVar.a(f62112a, this.f21367x, this.f21368y, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
