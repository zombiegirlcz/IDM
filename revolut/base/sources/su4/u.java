package su4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import su4.j;

/* JADX INFO: loaded from: classes22.dex */
public final class u extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f265667w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f265668x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f265669y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.a aVar, String str, h hVar, String str2, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f265667w = str;
        this.f265668x = hVar;
        this.f265669y = str2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new u(this.v, this.f265667w, this.f265668x, this.f265669y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((u) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.a aVar;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.a aVar3 = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            lic.a aVar4 = new lic.a(aVar3, 12);
            ku1.v vVar = new ku1.v(22);
            t tVar = new t(aVar3, this.f265667w, this.f265668x, this.f265669y, null, 1);
            aVar = aVar3;
            this.u = 1;
            obj2 = n14.k.S(aVar.X(), null, aVar4, vVar, tVar, this);
            if (obj2 == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            aVar = aVar3;
        }
        if (((nii.h) obj2) instanceof nii.g) {
            aVar.C2(j.a.f265650a);
        }
        return Unit.f186387a;
    }
}
