package com.revolut.feature.junior.account_activation.impl.ui.flow.activation;

import c68.h;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.junior.account_activation.impl.R$string;
import com.revolut.feature.junior.account_activation.impl.ui.flow.activation.AccountActivationFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends i implements Function2 {
    public int u;
    public final /* synthetic */ f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        f fVar = this.v;
        if (i == 0) {
            o.b(obj2);
            h hVar = new h(fVar, null, 3);
            this.u = 1;
            obj2 = fVar.p2(this, hVar);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        wi0.b.Companion.getClass();
        if (Intrinsics.f((wi0.b) obj2, wi0.b.y2)) {
            textLocalisedClause = new TextLocalisedClause(R$string.junior_signup_prompt_denial_confirmation_subtitle_sub_account, u.c(fVar.o.f76633a.f77099b), null, 12);
            textLocalisedClause2 = new TextLocalisedClause(R$string.junior_signup_prompt_denial_confirmation_action_approve_sub_account, u.c(fVar.o.f76633a.f77099b), null, 12);
        } else {
            textLocalisedClause = new TextLocalisedClause(R$string.junior_signup_prompt_denial_confirmation_subtitle, u.c(fVar.o.f76633a.f77099b), null, 12);
            textLocalisedClause2 = new TextLocalisedClause(R$string.junior_signup_prompt_denial_confirmation_action_approve, u.c(fVar.o.f76633a.f77099b), null, 12);
        }
        oki.h.t2(fVar, fVar.E, new AccountActivationFlowContract$Step.DenyConfirmation(textLocalisedClause, textLocalisedClause2), true, null, false, 12);
        return Unit.f186387a;
    }
}
