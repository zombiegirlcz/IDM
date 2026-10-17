package lf2;

import com.revolut.feature.apm.upi.api.UpiFeatureConfig;
import com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$Recipient;
import gim.i;
import jf2.f;
import jf2.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.apm.upi.impl.flow.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.apm.upi.impl.flow.b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.apm.upi.impl.flow.b bVar = this.v;
        yki.i iVar = bVar.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        f.b bVar2 = f.b.f173643a;
        if (i == 0) {
            o.b(obj2);
            jf2.a aVar2 = bVar.f62976q;
            UpiTransferFlowContract$Recipient upiTransferFlowContract$Recipient = bVar.f62979t;
            this.u = 1;
            jf2.d dVar = (jf2.d) aVar2;
            dVar.getClass();
            obj2 = upiTransferFlowContract$Recipient.getF62968b() ? bVar2 : dVar.b3(upiTransferFlowContract$Recipient, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        f fVar = (f) obj2;
        if (fVar instanceof jf2.e) {
            bVar.f62979t = ((jf2.e) fVar).f173641a;
            h.t2(bVar, bVar.v, com.revolut.feature.apm.upi.impl.flow.b.I2(bVar), true, null, false, 12);
        } else if (Intrinsics.f(fVar, bVar2)) {
            h.t2(bVar, bVar.v, com.revolut.feature.apm.upi.impl.flow.b.I2(bVar), true, null, false, 12);
        } else if (Intrinsics.f(fVar, f.a.f173642a)) {
            bVar.C1(UpiFeatureConfig.TransferInputIdOrMobile.f62954g.f98274b);
            h.D2(iVar);
        } else {
            if (!(fVar instanceof g)) {
                throw new NoWhenBranchMatchedException();
            }
            h.D2(iVar);
        }
        return Unit.f186387a;
    }
}
