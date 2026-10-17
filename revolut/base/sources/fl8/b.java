package fl8;

import com.revolut.feature.junior_remote_login.impl.data.service.JuniorRemoteLoginService;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.HttpException;
import retrofit2.Response;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f135901w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f135902x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f135903y;
    public final /* synthetic */ dl8.d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, String str, dl8.d dVar2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f135902x = dVar;
        this.f135903y = str;
        this.z = dVar2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f135902x, this.f135903y, this.z, continuation, 0);
            default:
                return new b(this.f135902x, this.f135903y, this.z, continuation, 1);
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
        d dVar;
        d dVar2;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.f135901w;
                if (i == 0) {
                    o.b(obj2);
                    d dVar3 = this.f135902x;
                    JuniorRemoteLoginService juniorRemoteLoginService = dVar3.f135905a;
                    this.v = dVar3;
                    this.f135901w = 1;
                    Object objCreateRemoteLoginInvitation = juniorRemoteLoginService.createRemoteLoginInvitation(this.f135903y, this.z, this);
                    if (objCreateRemoteLoginInvitation == aVar) {
                        return aVar;
                    }
                    dVar = dVar3;
                    obj2 = objCreateRemoteLoginInvitation;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dVar = this.v;
                    o.b(obj2);
                }
                Response response = (Response) obj2;
                dVar.getClass();
                if (response.isSuccessful()) {
                    return Unit.f186387a;
                }
                throw new HttpException(response);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f135901w;
                if (i2 == 0) {
                    o.b(obj2);
                    d dVar4 = this.f135902x;
                    JuniorRemoteLoginService juniorRemoteLoginService2 = dVar4.f135905a;
                    this.v = dVar4;
                    this.f135901w = 1;
                    Object objUpdateRemoteLoginInvitation = juniorRemoteLoginService2.updateRemoteLoginInvitation(this.f135903y, this.z, this);
                    if (objUpdateRemoteLoginInvitation == aVar2) {
                        return aVar2;
                    }
                    dVar2 = dVar4;
                    obj2 = objUpdateRemoteLoginInvitation;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dVar2 = this.v;
                    o.b(obj2);
                }
                Response response2 = (Response) obj2;
                dVar2.getClass();
                if (response2.isSuccessful()) {
                    return Unit.f186387a;
                }
                throw new HttpException(response2);
        }
    }
}
