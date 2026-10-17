package com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow;

import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import skm.k0;
import xlb.k;
import xlb.n;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends i implements Function2 {
    public int u;
    public final /* synthetic */ Ref$ObjectRef v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f83269w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ SavingsOnboardingFlowContract$Step.Article f83270x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Ref$ObjectRef ref$ObjectRef, e eVar, SavingsOnboardingFlowContract$Step.Article article, Continuation continuation) {
        super(2, continuation);
        this.v = ref$ObjectRef;
        this.f83269w = eVar;
        this.f83270x = article;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.v, this.f83269w, this.f83270x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            this.u = 1;
            if (k0.b(50L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        Object obj3 = this.v.f186409a;
        e eVar = this.f83269w;
        yki.i iVar = eVar.C;
        yja.b bVar = (yja.b) obj3;
        SavingsOnboardingFlowContract$Step.Article article = this.f83270x;
        if (bVar != null) {
            int i2 = n.f306993b[bVar.ordinal()];
            if (i2 != 1) {
                if (i2 != 2 && i2 != 3 && i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar.l2(new a(article, eVar, null), new k(eVar, 2));
            } else if (!(article instanceof SavingsOnboardingFlowContract$Step.Article.InFlow)) {
                if (!(article instanceof SavingsOnboardingFlowContract$Step.Article.PreFlow)) {
                    throw new NoWhenBranchMatchedException();
                }
                h.D2(iVar);
            }
        } else if (!(article instanceof SavingsOnboardingFlowContract$Step.Article.InFlow)) {
            if (!(article instanceof SavingsOnboardingFlowContract$Step.Article.PreFlow)) {
                throw new NoWhenBranchMatchedException();
            }
            h.D2(iVar);
        }
        return Unit.f186387a;
    }
}
