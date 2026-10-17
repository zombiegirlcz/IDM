package wbg;

import com.revolut.kompot.common.ExternalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class z0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ fgi.a f296217w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a aVar, fgi.a aVar2, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f296217w = aVar2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new z0(this.v, this.f296217w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((z0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a aVar2 = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            efm.d0 d0VarFirstOrError = aVar2.z.a(this.f296217w).firstOrError();
            Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
            this.u = 1;
            obj2 = nim.a.b(d0VarFirstOrError, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        fgi.b bVar = (fgi.b) ((od0.i) obj2).f224257a;
        if (bVar == null || (str = bVar.f135078g) == null) {
            return null;
        }
        return aVar2.C1(new ExternalDestination.Browser(str, null));
    }
}
