package bq8;

import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dj0.d f17789w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, dj0.d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
        this.f17789w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, this.f17789w, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (!(n1Var instanceof j1) && !(n1Var instanceof k1) && !(n1Var instanceof m1)) {
            if (!(n1Var instanceof l1)) {
                throw new NoWhenBranchMatchedException();
            }
            this.v.A2(new InitTopUpDestination(TopUpConfig.Companion.a(TopUpConfig.INSTANCE, this.f17789w, null, null, 30)));
        }
        return Unit.f186387a;
    }
}
