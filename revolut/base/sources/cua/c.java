package cua;

import cc7.l;
import com.revolut.feature.rating.shared.impl.screen.AppRatingController;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;
import ujb.v;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f108933w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a f108934x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l lVar, a aVar, Continuation continuation) {
        super(2, continuation);
        this.f108933w = lVar;
        this.f108934x = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.f108933w, this.f108934x, continuation);
        cVar.v = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ProducerScope producerScope = (ProducerScope) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            AppRatingController appRatingController = new AppRatingController();
            a aVar2 = this.f108934x;
            l lVar = this.f108933w;
            c1g.o block = new c1g.o(producerScope, 23, aVar2, lVar);
            Intrinsics.checkNotNullParameter(block, "block");
            appRatingController.H = block;
            knm.b.j(lVar.r2(), new com.revolut.kompot.common.b(appRatingController, ModalDestination.Style.BOTTOM_DIALOG.f98301a, 4));
            this.v = null;
            this.u = 1;
            if (com.bumptech.glide.d.d(producerScope, new v(16), this) == aVar) {
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
