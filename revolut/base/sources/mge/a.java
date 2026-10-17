package mge;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.tab.accounts.api.R$string;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    @NotNull
    public static final C1161a Companion = new C1161a();

    /* JADX INFO: renamed from: mge.a$a, reason: collision with other inner class name */
    public static final class C1161a {
        private C1161a() {
        }
    }

    public static y0 a() {
        return new y0("FAVOURITES_ERROR_DIALOG", new z(new TextLocalisedClause(R$string.account_switcher_favourites_limit_reached_dialog_title, null, null, 14), new TextLocalisedClause(R$string.account_switcher_favourites_limit_reached_dialog_subtitle, null, null, 14), new TextLocalisedClause(R$string.account_switcher_favourites_limit_reached_dialog_button_title, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32468), false, 4);
    }

    public static List b(ProductAccountDescriptor$Value descriptor, boolean z) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Pair pair = z ? new Pair(Integer.valueOf(R$string.account_switcher_favourites_action_unpin_favourite), Integer.valueOf(R$drawable.uikit_icn_24_unpin)) : new Pair(Integer.valueOf(R$string.account_switcher_favourites_action_pin_favourite), Integer.valueOf(R$drawable.uikit_icn_24_pin));
        return u.c(com.revolut.core.ui_kit.models.popup.a.a("POPUP_MENU_ITEM_ADD_TO_FAVORITES", new TextLocalisedClause(((Number) pair.f186385a).intValue(), null, null, 14), new ResourceImage(((Number) pair.f186386b).intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, descriptor, null, null, Constants.TAG_EMV_L2_CHECKSUM));
    }
}
