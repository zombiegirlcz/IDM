package com.revolut.feature.semi_independent_onboarding.impl.ui.details;

import aw0.n6;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.semi_independent_onboarding.impl.R$string;
import com.revolut.feature.semi_independent_onboarding.impl.ui.details.SemiIndependentOnboardingDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import elm.f;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import mii.k;
import oki.h;
import skm.e0;
import skm.p0;
import x0d.d;
import x0d.e;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ n6 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f85989w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(n6 n6Var, b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = n6Var;
        this.f85989w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f85989w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.f85989w;
        if (i == 0) {
            o.b(obj2);
            Object obj3 = this.v.k;
            String str = obj3 instanceof String ? (String) obj3 : null;
            if (str == null) {
                throw new IllegalStateException("Invitation is null");
            }
            o7.b bVar2 = bVar.o;
            this.u = 1;
            e eVar = (e) bVar2.f222639b;
            p0 p0Var = p0.f264001a;
            obj2 = e0.J(f.f127540b, new d(eVar, str, (Continuation) null), this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        String str2 = ((z0d.i) obj2).f318223a;
        if (str2 == null) {
            bVar.f85991q.getClass();
            return l.b1(bVar, bVar.X1(new k("SUCCESS_DIALOG_ID", new TextLocalisedClause(R$string.guardian_invitation_details_action_success, null, null, 14), null, null, null, 28)), null, null, 7);
        }
        h.v2(bVar.f85994t, new SemiIndependentOnboardingDetailsScreenContract$ModalStep.GuardianNeedsCreateAccountPrompt(str2), ModalDestination.Style.POPUP.f98311a);
        return Unit.f186387a;
    }
}
