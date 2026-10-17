package com.revolut.feature.insurance_pet.impl.ui.cancellation;

import an.c;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_pet.impl.R$string;
import cqi.d;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zw7.d0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f76242a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        d0 pet = (d0) obj2;
        Intrinsics.checkNotNullParameter(pet, "pet");
        an.a aVar = this.f76242a.f76243a;
        String petName = pet.d;
        String petId = pet.f325764a;
        List petIssues = pet.f325771m;
        Intrinsics.checkNotNullParameter(petName, "petName");
        Intrinsics.checkNotNullParameter(petId, "petId");
        Intrinsics.checkNotNullParameter(petIssues, "petIssues");
        return aVar.c0(new c(new d(new TextLocalisedClause(R$string.pets_cancellation_prompt_title, null, null, 14), new TextLocalisedClause(R$string.pets_cancellation_prompt_subtitle, u.c(new TextClause(petName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D051", null, null, null, 30), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14), new TextLocalisedClause(R$string.pets_cancellation_prompt_secondary_button, null, null, 14), new CancellationPromptActionHandler$PetParcel(petName, petId, petIssues), null, null, 1668)));
    }
}
