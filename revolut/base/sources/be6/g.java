package be6;

import com.revolut.feature.extension_auth.api.model.ExtensionAuthRequestData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ExtensionAuthRequestData f14685w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, ExtensionAuthRequestData extensionAuthRequestData, Continuation continuation) {
        super(2, continuation);
        this.v = jVar;
        this.f14685w = extensionAuthRequestData;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.v, this.f14685w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            akl.c cVar = this.v.f14688b;
            String str = ((ExtensionAuthRequestData.AppChallenge) this.f14685w).f72178a;
            this.u = 1;
            p0 p0Var = p0.f264001a;
            obj2 = e0.J(elm.f.f127540b, new akl.a(cVar, str, null), this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        bjl.d dVar = (bjl.d) obj2;
        if (dVar instanceof bjl.a) {
            return Unit.f186387a;
        }
        if ((dVar instanceof bjl.b) || (dVar instanceof bjl.c)) {
            throw new IllegalStateException(dVar.getClass().getName().concat(" is not supported in a legacy consent screen, which must not be used for SSO consent").toString());
        }
        throw new NoWhenBranchMatchedException();
    }
}
