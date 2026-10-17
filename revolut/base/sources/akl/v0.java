package akl;

import com.revolut.sso.impl.network.services.UserInfoService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class v0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e1 f6101w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ mkl.b f6102x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f6103y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(e1 e1Var, mkl.b bVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f6101w = e1Var;
        this.f6102x = bVar;
        this.f6103y = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new v0(this.f6101w, this.f6102x, this.f6103y, continuation, 0);
            default:
                return new v0(this.f6101w, this.f6102x, this.f6103y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((v0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                UserInfoService userInfoService = this.f6101w.f6003a;
                this.v = 1;
                Object userInfo = userInfoService.getUserInfo(this.f6102x, this.f6103y, this);
                return userInfo == aVar ? aVar : userInfo;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                UserInfoService userInfoService2 = this.f6101w.f6003a;
                this.v = 1;
                Object userInfoPicture = userInfoService2.getUserInfoPicture(this.f6102x, this.f6103y, this);
                return userInfoPicture == aVar2 ? aVar2 : userInfoPicture;
        }
    }
}
