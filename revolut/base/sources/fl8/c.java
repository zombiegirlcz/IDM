package fl8;

import com.revolut.feature.junior_remote_login.api.model.RemoteLoginInvitation;
import com.revolut.feature.junior_remote_login.impl.data.service.JuniorRemoteLoginService;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import retrofit2.HttpException;
import retrofit2.Response;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends i implements Function3 {
    public int u;
    public /* synthetic */ String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f135904w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation continuation) {
        super(3, continuation);
        this.f135904w = dVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        c cVar = new c(this.f135904w, (Continuation) obj4);
        cVar.v = (String) obj3;
        return cVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            JuniorRemoteLoginService juniorRemoteLoginService = this.f135904w.f135905a;
            this.v = null;
            this.u = 1;
            obj2 = juniorRemoteLoginService.getRemoteLoginInvitations(str, this);
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
        if (response.code() == 204) {
            return RemoteLoginInvitation.Absent.INSTANCE;
        }
        if (!response.isSuccessful()) {
            throw new HttpException(response);
        }
        Object objBody = response.body();
        if (objBody != null) {
            return (RemoteLoginInvitation) objBody;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
