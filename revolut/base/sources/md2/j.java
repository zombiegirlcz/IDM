package md2;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.ad;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.services.ideal.api.R$string;
import com.revolut.feature.apm.services.ideal.impl.ui.registration.IDealStartRegistrationScreenContract$InputData;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements n {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IDealStartRegistrationScreenContract$InputData f204474a;

    public j(IDealStartRegistrationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f204474a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        ResourceImage resourceImage;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        jd2.b bVar = this.f204474a.f62858a;
        int[] iArr = i.f204473a;
        int i = iArr[bVar.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.ideal_register_prompt_title, null, null, 14);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.ideal_payment_confirmation_register_prompt_title, null, null, 14);
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.ideal_register_prompt_subtitle, null, null, 14);
        ad adVar = new ad(zw1.a.a(), false);
        int i2 = iArr[bVar.ordinal()];
        if (i2 == 1) {
            resourceImage = new ResourceImage(R$drawable.uikit_icn_24_back, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        }
        return new e(u.c(new PromptContentDelegate.Model("REGISTRATION_PROMPT_ID", textLocalisedClause, textLocalisedClause2, null, adVar, resourceImage, null, null, false, new TextLocalisedClause(R$string.ideal_register_prompt_button_title, null, null, 14), null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, 536870344)));
    }
}
