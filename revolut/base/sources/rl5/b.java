package rl5;

import com.revolut.feature.crypto.spare.change.impl.data.service.CryptoSpareChangeService;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import ll5.d;
import retrofit2.HttpException;
import retrofit2.Response;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f254915w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ xi0.b f254916x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f254917y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, xi0.b bVar, int i, Continuation continuation, int i2) {
        super(2, continuation);
        this.u = i2;
        this.f254915w = cVar;
        this.f254916x = bVar;
        this.f254917y = i;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f254915w, this.f254916x, this.f254917y, continuation, 0);
            default:
                return new b(this.f254915w, this.f254916x, this.f254917y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                c cVar = this.f254915w;
                if (i == 0) {
                    o.b(obj2);
                    CryptoSpareChangeService cryptoSpareChangeService = cVar.f254918a;
                    ll5.a aVar2 = new ll5.a(this.f254916x.f306286a, this.f254917y);
                    this.v = 1;
                    obj2 = cryptoSpareChangeService.createCryptoSpareChange(aVar2, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                Response response = (Response) obj2;
                int iCode = response.code();
                if (iCode != 200) {
                    if (iCode == 409) {
                        return il5.c.f162086a;
                    }
                    throw new HttpException(response);
                }
                ll5.b bVar = (ll5.b) response.body();
                if (bVar == null) {
                    throw new IllegalStateException("Error during parsing body getCryptoSpareChangeDetails");
                }
                cVar.f254919b.getClass();
                ql5.a.a(bVar);
                return il5.b.f162085a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                c cVar2 = this.f254915w;
                if (i2 == 0) {
                    o.b(obj2);
                    CryptoSpareChangeService cryptoSpareChangeService2 = cVar2.f254918a;
                    d dVar = new d(this.f254916x.f306286a, this.f254917y);
                    this.v = 1;
                    obj2 = cryptoSpareChangeService2.updateCryptoSpareChange(dVar, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                Response response2 = (Response) obj2;
                int iCode2 = response2.code();
                if (iCode2 != 200) {
                    if (iCode2 == 409) {
                        return il5.c.f162086a;
                    }
                    throw new HttpException(response2);
                }
                ll5.b bVar2 = (ll5.b) response2.body();
                if (bVar2 == null) {
                    throw new IllegalStateException("Error during parsing body getCryptoSpareChangeDetails");
                }
                cVar2.f254919b.getClass();
                ql5.a.a(bVar2);
                return il5.b.f162085a;
        }
    }
}
