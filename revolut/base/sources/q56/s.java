package q56;

import cli.y;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.a f242315w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f242316x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f242317y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.a aVar, i iVar, String str, String str2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f242315w = aVar;
        this.f242316x = iVar;
        this.f242317y = str;
        this.z = str2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s(this.f242315w, this.f242316x, this.f242317y, this.z, continuation, 0);
            default:
                return new s(this.f242315w, this.f242316x, this.f242317y, this.z, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((s) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.a aVar = this.f242315w;
                y yVar = aVar.f71820t;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                try {
                    if (i == 0) {
                        yhm.o.b(obj2);
                        aVar.H2(yVar, new q3d.i(15));
                        ap5.b bVar = aVar.f71817q;
                        i iVar = this.f242316x;
                        ufm.n nVarA = bVar.a(iVar.f242302b, iVar.f242301a, this.f242317y, null, this.z, null);
                        this.v = 1;
                        obj2 = nim.a.b(nVarA, this);
                        if (obj2 == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    CryptoAddress cryptoAddress = (CryptoAddress) obj2;
                    Intrinsics.h(cryptoAddress);
                    l lVar = new l(cryptoAddress);
                    q qVar = com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.a.Companion;
                    aVar.C2(lVar);
                    return Unit.f186387a;
                } catch (Throwable th10) {
                    aVar.H2(yVar, new q3d.i(16));
                    throw th10;
                }
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.a aVar4 = this.f242315w;
                    s sVar = new s(aVar4, this.f242316x, this.f242317y, this.z, null, 0);
                    this.v = 1;
                    if (do3.q.t(aVar4, sVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
