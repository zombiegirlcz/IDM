package tml;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.sso.impl.ui.email.change_flow.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f272257w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ tni.f f272258x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.sso.impl.ui.email.change_flow.a aVar, String str, tni.f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f272257w = str;
        this.f272258x = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.v, this.f272257w, this.f272258x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            String secret = ((tni.e) this.f272258x).f272457a;
            Intrinsics.checkNotNullParameter(secret, "secret");
            this.u = 1;
            if (this.v.N2(this.f272257w, secret, true, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
