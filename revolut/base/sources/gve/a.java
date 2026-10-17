package gve;

import com.revolut.data.network.models.openbanking.TopUpResponseDto;
import com.revolut.data.network.models.openbanking.TopupRequestDto;
import com.revolut.data.network.models.openbanking.mapper.TopupUrlDataMapperKt;
import com.revolut.data.network.models.topup.mapper.TopUpContextMapperKt;
import com.revolut.domain.models.topup.TopUpContext;
import com.revolut.feature.topup_screen.impl.data.network.service.StoredMethodService;
import dj0.d;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f147148w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f147149x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f147150y;
    public final /* synthetic */ TopUpContext z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, String str, d dVar, TopUpContext topUpContext, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f147148w = bVar;
        this.f147149x = str;
        this.f147150y = dVar;
        this.z = topUpContext;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.f147148w, this.f147149x, this.f147150y, this.z, continuation, 0);
            default:
                return new a(this.f147148w, this.f147149x, this.f147150y, this.z, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    StoredMethodService storedMethodService = this.f147148w.f147151a;
                    d dVar = this.f147150y;
                    long j2 = dVar.f115082a;
                    String str = dVar.f115083b.f306286a;
                    TopUpContext topUpContext = this.z;
                    TopupRequestDto topupRequestDto = new TopupRequestDto(this.f147149x, j2, str, TopUpContextMapperKt.toWalletId(topUpContext), TopUpContextMapperKt.toDto(topUpContext));
                    this.v = 1;
                    if (storedMethodService.nonOauthTopUpViaAccountDetails(topupRequestDto, new wj0.b("TOPUP_IDEMPOTENCY_TAG"), this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    StoredMethodService storedMethodService2 = this.f147148w.f147151a;
                    d dVar2 = this.f147150y;
                    long j3 = dVar2.f115082a;
                    String str2 = dVar2.f115083b.f306286a;
                    TopUpContext topUpContext2 = this.z;
                    TopupRequestDto topupRequestDto2 = new TopupRequestDto(this.f147149x, j3, str2, TopUpContextMapperKt.toWalletId(topUpContext2), TopUpContextMapperKt.toDto(topUpContext2));
                    this.v = 1;
                    obj2 = storedMethodService2.topUpViaAccountDetails(topupRequestDto2, new wj0.b("TOPUP_IDEMPOTENCY_TAG"), this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return TopupUrlDataMapperKt.toDomain((TopUpResponseDto) obj2);
        }
    }
}
