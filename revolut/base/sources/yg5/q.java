package yg5;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.gift.asset.api.model.CryptoGiftAssetError;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yed.g0;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f313534w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(u uVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f313534w = uVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                q qVar = new q(this.f313534w, continuation, 0);
                qVar.v = obj2;
                return qVar;
            default:
                q qVar2 = new q(this.f313534w, continuation, 1);
                qVar2.v = obj2;
                return qVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((q) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        u uVar = this.f313534w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                uVar.H2(uVar.f313545w, new yfd.u(data, 1));
                break;
            default:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVar = uVar.f313545w;
                uVar.H2(yVar, new yfd.u(data2, 2));
                Throwable error = data2.getError();
                ng5.a aVar3 = (ng5.a) data2.getContent();
                if (!data2.getLoading()) {
                    i iVar = i.f313528a;
                    if (error != null) {
                        if ((error instanceof CryptoGiftAssetError.NotAvailable) || (error instanceof CryptoGiftAssetError.AlreadyClaimed)) {
                            uVar.C2(iVar);
                        } else {
                            uVar.B2();
                        }
                    } else if (aVar3 != null && aVar3.f215112a != ng5.b.NOT_STARTED) {
                        uVar.C2(iVar);
                    } else if (aVar3 != null) {
                        uVar.H2(yVar, new g0(aVar3, 7));
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
