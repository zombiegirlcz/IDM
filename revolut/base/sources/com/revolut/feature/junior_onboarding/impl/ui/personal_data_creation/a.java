package com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.junior_onboarding.impl.R$string;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.JuniorPersonalDataCreationFlowContract$Step;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.model.PersonalDetailsForm;
import gim.i;
import hd.r;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import yhm.o;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PersonalDetailsForm f77015w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, PersonalDetailsForm personalDetailsForm, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
        this.f77015w = personalDetailsForm;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f77015w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objZ;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        e eVar = this.v;
        if (i == 0) {
            o.b(obj2);
            r rVar = eVar.o;
            this.u = 1;
            objZ = rVar.z(this);
            if (objZ == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            objZ = obj2;
        }
        vh8.e eVar2 = (vh8.e) objZ;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.junior_signup_account_match_redesigned_prompt_title, null, null, 14);
        int i2 = R$string.junior_signup_account_match_redesigned_prompt_subtitle;
        PersonalDetailsForm personalDetailsForm = this.f77015w;
        h.u2(eVar, eVar.f77039t, new JuniorPersonalDataCreationFlowContract$Step.JuniorMatchPrompt(personalDetailsForm, new PromptMarketingScreenContract$InputData(textLocalisedClause, new TextLocalisedClause(i2, u.c(personalDetailsForm.f77040a), null, 12), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D023", null, null, null, 30), null, null, new ResourceImage(R$drawable.uikit_icn_24_back, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, new PromptMarketingContentDelegate.Model.Button((Clause) eVar2.e(), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, "PERSONAL_DETAIL_CREATION_MAIN_ACTION_TAG", 30), null, null, new PromptMarketingContentDelegate.Model.Footer(eVar2.b()), null, null, null, 64344)), null, 6);
        return Unit.f186387a;
    }
}
