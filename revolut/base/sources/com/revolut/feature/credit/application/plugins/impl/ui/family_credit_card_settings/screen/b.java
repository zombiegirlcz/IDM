package com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen;

import com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen.FamilyCreditCardSettingsScreenContract$ModalStep;
import e54.p;
import gim.i;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;
import yhm.o;
import zhm.q0;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FamilyCreditCardSettingsScreenContract$ModalStep f67678w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p f67679x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, FamilyCreditCardSettingsScreenContract$ModalStep familyCreditCardSettingsScreenContract$ModalStep, p pVar, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
        this.f67678w = familyCreditCardSettingsScreenContract$ModalStep;
        this.f67679x = pVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f67678w, this.f67679x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            j2 j2Var = this.v.f67686s;
            qy3.a aVar2 = qy3.b.Companion;
            String parameterKey = ((FamilyCreditCardSettingsScreenContract$ModalStep.AmountInput) this.f67678w).f67676a.i;
            Long l2 = new Long(((e54.o) this.f67679x).f122757a);
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(parameterKey, "parameterKey");
            qy3.b bVar = new qy3.b(q0.c(new Pair(parameterKey, l2)));
            this.u = 1;
            j2Var.getClass();
            j2Var.g(null, bVar);
            if (Unit.f186387a == aVar) {
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
