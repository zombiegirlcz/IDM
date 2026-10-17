package fe8;

import com.revolut.feature.junior_coparent.impl.services.JuniorCoparentService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.HttpException;
import retrofit2.Response;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f134463w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f134464x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(i iVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f134463w = iVar;
        this.f134464x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.f134463w, this.f134464x, continuation, 0);
            default:
                return new e(this.f134463w, this.f134464x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                JuniorCoparentService juniorCoparentService = this.f134463w.f134469a;
                this.v = 1;
                Object objAcceptInvitation = juniorCoparentService.acceptInvitation(this.f134464x, this);
                return objAcceptInvitation == aVar ? aVar : objAcceptInvitation;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    JuniorCoparentService juniorCoparentService2 = this.f134463w.f134469a;
                    this.v = 1;
                    obj2 = juniorCoparentService2.declineCoparentRequest(this.f134464x, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                Response response = (Response) obj2;
                if (response.isSuccessful()) {
                    return Unit.f186387a;
                }
                throw new HttpException(response);
        }
    }
}
