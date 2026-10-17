package s12;

import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.apm.core.ui.api.mapper.ApmFooterContent;
import ip0.qe0;
import ip0.we0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class n implements a12.s {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public final List a(ApmFooterContent apmFooterContent) {
        if (apmFooterContent != null && !(apmFooterContent instanceof ApmFooterContent.TextOnly) && !(apmFooterContent instanceof ApmFooterContent.Expiry)) {
            if (!(apmFooterContent instanceof ApmFooterContent.ImageOnly)) {
                throw new NoWhenBranchMatchedException();
            }
            List listC = u.c(new we0("ITEM_FOOTER_IMAGE_ID", new qe0(-2, ((ApmFooterContent.ImageOnly) apmFooterContent).f62232a)));
            int i = R$attr.uikit_dp32;
            yp0.b.q(listC, i, i, 0, 0, 12);
            return listC;
        }
        return f0.f322471a;
    }
}
