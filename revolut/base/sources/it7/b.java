package it7;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.insurance_credit.impl.data.model.action.Button;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l9.l;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static final PromptMarketingContentDelegate.Model.Button a(Button button, int i) {
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton;
        Intrinsics.checkNotNullParameter(button, "<this>");
        TextLocalisedClause textLocalisedClauseS = l.s(i, button.f75752a);
        ps7.a aVar = button.f75753b;
        if (aVar != null) {
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            int i2 = a.f168356a[aVar.ordinal()];
            if (i2 == 1) {
                defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                defaultFilledButton = LargeActionButton.ButtonStyle.f58726b;
            }
        } else {
            defaultFilledButton = null;
        }
        return new PromptMarketingContentDelegate.Model.Button((Clause) textLocalisedClauseS, (ResourceImage) null, (LargeActionButton.ButtonStyle) defaultFilledButton, false, (String) null, 54);
    }
}
