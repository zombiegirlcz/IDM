package be6;

import com.revolut.feature.extension_auth.api.model.ExtensionAuthRequestData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ExtensionAuthRequestData f14686w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, ExtensionAuthRequestData extensionAuthRequestData, Continuation continuation) {
        super(2, continuation);
        this.v = jVar;
        this.f14686w = extensionAuthRequestData;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.v, this.f14686w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            akl.c cVar = this.v.f14688b;
            String str = ((ExtensionAuthRequestData.AppChallenge) this.f14686w).f72178a;
            this.u = 1;
            p0 p0Var = p0.f264001a;
            if (e0.J(elm.f.f127540b, new ad4.c(cVar, str, null, 25), this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
