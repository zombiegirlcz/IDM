package oak;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import com.revolut.retail.feature.pda.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends bsi.a implements b {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // pri.a
    public final void N(rri.a aVar) {
        rri.a view = (c) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        ((BaseLayoutBuilderFragment) view).setItems(u.c(new FullScreenStateDelegate.Model("intro_list_id", new TextLocalisedClause(R$string.beneficiary_pda_intro_title, null, null, 14), new TextLocalisedClause(R$string.beneficiary_pda_intro_caption, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D029", null, null, null, 30)), null, null, false, null, null, false, 0, 0, 32752)));
    }
}
