package akl;

import com.revolut.sso.api.models.UserInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes12.dex */
public final class d1 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ e1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s0 f5999w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(e1 e1Var, s0 s0Var, Continuation continuation) {
        super(2, continuation);
        this.v = e1Var;
        this.f5999w = s0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d1(this.v, this.f5999w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        try {
            if (i == 0) {
                yhm.o.b(obj2);
                e1 e1Var = this.v;
                s0 s0Var = this.f5999w;
                String str = s0Var.f6086a;
                String str2 = s0Var.f6087b;
                Integer num = s0Var.f6088c;
                this.u = 1;
                obj2 = skm.e0.J(skm.p0.f264003c, new w0(str2, e1Var, num, str, null), this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            return (UserInfo) obj2;
        } catch (HttpException unused) {
            UserInfo.INSTANCE.getClass();
            return UserInfo.k;
        }
    }
}
