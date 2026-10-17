package com.revolut.retail.feature.pricing_plans.ui.impl.flows.graduate_student;

import com.revolut.retail.feature.pricing_plans.ui.impl.flows.graduate_student.GraduateStudentFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.student.StudentProductArticleKey;
import gim.i;
import kka.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            zja.a aVar2 = bVar.f103040q;
            StudentProductArticleKey studentProductArticleKey = StudentProductArticleKey.STUDENT_GRADUATION;
            this.u = 1;
            obj2 = ((h) aVar2).d(studentProductArticleKey, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        if (!((Boolean) obj2).booleanValue()) {
            return bVar.I2();
        }
        oki.h.t2(bVar, bVar.f103042s, GraduateStudentFlowContract$Step.ProductArticle.f103038a, false, null, false, 12);
        return Unit.f186387a;
    }
}
