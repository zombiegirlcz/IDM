package nme;

import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class l0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.tab.lifestyle.impl.ui.screen.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ HeroBannerDelegate.Model f217306w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar, HeroBannerDelegate.Model model, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
        this.f217306w = model;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l0(this.v, this.f217306w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            u29.m mVar = this.v.f89946p;
            Object obj3 = this.f217306w.i;
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.lifestyle.content_gateway.api.ui.HeroBannerSlotParcelWrapper");
            String str = ((m19.a) obj3).f201289a;
            this.u = 1;
            if (mVar.a(str, this) == aVar) {
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
