package lca;

import com.revolut.feature.pix.api.navigation.PixTransferNavigation$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import nii.n1;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PixTransferNavigation$InputData.ApmTransfer f193807w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Function1 f193808x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, PixTransferNavigation$InputData.ApmTransfer apmTransfer, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.v = lVar;
        this.f193807w = apmTransfer;
        this.f193808x = function1;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, this.f193807w, this.f193808x, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        l.b3(this.v, n1Var, this.f193807w, this.f193808x);
        return Unit.f186387a;
    }
}
