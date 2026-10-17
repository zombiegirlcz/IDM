package tg7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import java.util.List;
import kf7.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ug7.d;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f271103a;

    public b(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f271103a = uiKitResources;
    }

    public final ug7.a a(g gVar, LargeActionButton.ButtonStyle.FilledButton filledButton, String str) {
        ug7.c cVar;
        TextClause textClause = new TextClause(gVar.f183294a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str2 = gVar.f183295b;
        PromptMarketingContentDelegate.Model.Button button = new PromptMarketingContentDelegate.Model.Button((Clause) textClause, str2 != null ? new ResourceImage(this.f271103a.a(str2), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null, (LargeActionButton.ButtonStyle) filledButton, false, str, 20);
        int i = a.f271102a[gVar.f183296c.ordinal()];
        if (i == 1) {
            cVar = ug7.c.CLAIM;
        } else if (i == 2) {
            cVar = ug7.c.REJECT;
        } else if (i == 3) {
            cVar = ug7.c.SHARE;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            cVar = ug7.c.GO_TO_ACCOUNT;
        }
        return new ug7.a(button, new d(str, cVar));
    }
}
