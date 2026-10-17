package uwa;

import com.revolut.feature.referrals.common.data.api.domain.model.common.InviteeStatus;
import com.revolut.feature.referrals.common.data.impl.network.services.InviteCampaignService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import le.u1;
import retrofit2.HttpException;
import retrofit2.Response;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends gim.i implements Function3 {
    public int u;
    public /* synthetic */ pwa.n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f283588w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, Continuation continuation) {
        super(3, continuation);
        this.f283588w = qVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        o oVar = new o(this.f283588w, (Continuation) obj4);
        oVar.v = (pwa.n) obj3;
        return oVar.invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        pwa.n nVar = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            InviteCampaignService inviteCampaignService = this.f283588w.f283590b;
            String strG = u1.g(nVar, pwa.l.f240369a);
            this.v = null;
            this.u = 1;
            obj2 = inviteCampaignService.getInviteeStatus(strG, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        Response response = (Response) obj2;
        int iCode = response.code();
        if (iCode != 200) {
            if (iCode == 404) {
                return InviteeStatus.Absent.f81733a;
            }
            throw new HttpException(response);
        }
        zwa.j jVar = (zwa.j) response.body();
        if (jVar != null) {
            return axa.a.a(jVar);
        }
        throw new IllegalStateException("Invitee status response body was corrupted");
    }
}
