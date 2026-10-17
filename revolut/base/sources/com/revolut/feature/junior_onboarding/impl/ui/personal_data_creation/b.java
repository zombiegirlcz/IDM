package com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation;

import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.JuniorPersonalDataCreationFlowContract$Step;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.details_confirmation.JuniorDetailsConfirmationScreenContract$UiConfiguration;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.model.PersonalDetailsForm;
import gim.i;
import hd.r;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PersonalDetailsForm f77016w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f77017x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, PersonalDetailsForm personalDetailsForm, boolean z, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
        this.f77016w = personalDetailsForm;
        this.f77017x = z;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f77016w, this.f77017x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        e eVar = this.v;
        if (i == 0) {
            o.b(obj2);
            r rVar = eVar.o;
            this.u = 1;
            obj2 = rVar.z(this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        vh8.e eVar2 = (vh8.e) obj2;
        h.t2(eVar, eVar.f77039t, new JuniorPersonalDataCreationFlowContract$Step.DetailsConfirmation(this.f77016w, new JuniorDetailsConfirmationScreenContract$UiConfiguration(eVar2.a(), eVar2.f(), eVar2.d(), eVar2.g())), this.f77017x, null, false, 12);
        return Unit.f186387a;
    }
}
