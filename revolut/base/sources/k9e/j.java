package k9e;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        c domainState = (c) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = R$drawable.uikit_icn_24_reverted;
        return new f(yp0.b.g(u.c(new RowDelegate.Model("LIST_ID_STEP_MAX_LIMITS", new RowDelegate.Model.MainImage.Image24(new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.block_future_payments_confirm_cell_requests, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904)), new ListSubheaderDelegate.Model("LIST_ID_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.block_future_payments_confirm_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
    }
}
