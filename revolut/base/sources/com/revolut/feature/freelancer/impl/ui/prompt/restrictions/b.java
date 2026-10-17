package com.revolut.feature.freelancer.impl.ui.prompt.restrictions;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.prompt.restrictions.AccountRestrictionsPromptFlowContract$Step;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import gim.i;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import lr6.d;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements Function2 {
    public c u;
    public yki.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ct6.b f74105w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public d f74106x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f74107y;
    public final /* synthetic */ c z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(2, continuation);
        this.z = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        c cVar;
        yki.i iVar;
        ct6.b bVar;
        Object objI2;
        d promptType;
        int i;
        int i2;
        String str;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i3 = this.f74107y;
        if (i3 == 0) {
            o.b(obj2);
            cVar = this.z;
            iVar = cVar.f74110r;
            bVar = cVar.o;
            d dVar = cVar.f74108p.f74103a;
            this.u = cVar;
            this.v = iVar;
            this.f74105w = bVar;
            this.f74106x = dVar;
            this.f74107y = 1;
            objI2 = c.I2(cVar, this);
            if (objI2 == aVar) {
                return aVar;
            }
            promptType = dVar;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            promptType = this.f74106x;
            bVar = this.f74105w;
            iVar = this.v;
            cVar = this.u;
            o.b(obj2);
            objI2 = obj2;
        }
        yki.i iVar2 = iVar;
        c cVar2 = cVar;
        Clause clause = (Clause) objI2;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(promptType, "promptType");
        int[] iArr = ct6.a.f108619a;
        int i5 = iArr[promptType.ordinal()];
        if (i5 == 1) {
            i = R$string.freelancer_popup_inbound_blocked_title;
        } else if (i5 == 2) {
            i = R$string.freelancer_popup_outbound_blocked_v2_title;
        } else if (i5 == 3) {
            i = R$string.freelancer_popup_inbound_outbound_blocked_title;
        } else {
            if (i5 != 4 && i5 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.freelancer_popup_account_closed_v2_title;
        }
        PromptMarketingContentDelegate.Model.Footer footer = null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        int i6 = iArr[promptType.ordinal()];
        if (i6 == 1) {
            i2 = R$string.freelancer_popup_inbound_blocked_description;
        } else if (i6 == 2) {
            i2 = R$string.freelancer_popup_outbound_blocked_v2_description;
        } else if (i6 == 3) {
            i2 = R$string.freelancer_popup_inbound_outbound_blocked_description;
        } else if (i6 == 4) {
            i2 = R$string.freelancer_popup_account_closed_v2_description;
        } else {
            if (i6 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R$string.freelancer_popup_account_closed_description_short;
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i2, null, null, 14);
        int i21 = iArr[promptType.ordinal()];
        if (i21 == 1 || i21 == 2 || i21 == 3) {
            str = "3D028";
        } else {
            if (i21 != 4 && i21 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            str = "3D051";
        }
        CdnImage cdnImageC = com.revolut.core.ui_kit_core.displayers.image.models.b.c(str, null, null, null, 30);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        PromptMarketingContentDelegate.Model.Button button = new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62);
        d dVar2 = d.ACCOUNT_CLOSED;
        d dVar3 = d.ACCOUNT_CLOSED_MANUALLY;
        d[] elements = {dVar2, dVar3};
        Intrinsics.checkNotNullParameter(elements, "elements");
        TextLocalisedClause textLocalisedClause3 = kotlin.collections.d.y0(elements).contains(promptType) ? new TextLocalisedClause(R$string.freelancer_common_word_terms_and_conditions, null, null, 14) : null;
        if ((promptType == dVar2 || promptType == dVar3) && clause != null) {
            footer = new PromptMarketingContentDelegate.Model.Footer(clause);
        }
        h.t2(cVar2, iVar2, new AccountRestrictionsPromptFlowContract$Step.AccountRestrictionsPrompt(new PromptMarketingScreenContract$InputData(textLocalisedClause, textLocalisedClause2, cdnImageC, null, null, resourceImage, null, button, null, null, footer, null, null, textLocalisedClause3, 56152)), false, null, false, 12);
        return Unit.f186387a;
    }
}
