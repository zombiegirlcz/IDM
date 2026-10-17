package mq5;

import com.revolut.data.model.Data;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawFeesBreakdown;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ml3.y;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.crypto.withdraw.impl.ui_v3.fee_breakdown_dialog.a f207891w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(com.revolut.feature.crypto.withdraw.impl.ui_v3.fee_breakdown_dialog.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f207891w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j(this.f207891w, continuation, 0);
                jVar.v = obj2;
                return jVar;
            default:
                j jVar2 = new j(this.f207891w, continuation, 1);
                jVar2.v = obj2;
                return jVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j) create((CryptoWithdrawFeesBreakdown) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.crypto.withdraw.impl.ui_v3.fee_breakdown_dialog.a aVar = this.f207891w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.H2(aVar.f71306s, new me7.h(data, 23));
                break;
            default:
                CryptoWithdrawFeesBreakdown cryptoWithdrawFeesBreakdown = (CryptoWithdrawFeesBreakdown) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.H2(aVar.f71306s, new y(cryptoWithdrawFeesBreakdown, 25));
                break;
        }
        return Unit.f186387a;
    }
}
