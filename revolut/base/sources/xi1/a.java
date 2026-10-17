package xi1;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.address.common.api.R$string;
import ip0.bf0;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import te0.w;
import xda.z;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    @NotNull
    public static final C1699a Companion = new C1699a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f306296a = w.y0(new z(26));

    /* JADX INFO: renamed from: xi1.a$a, reason: collision with other inner class name */
    public static final class C1699a {
        private C1699a() {
        }
    }

    public static List a() {
        return v.k(new bf0("LOADING_ITEM_1"), new bf0("LOADING_ITEM_2"), new bf0("LOADING_ITEM_3"));
    }

    public static RowDelegate.Model b() {
        return new RowDelegate.Model("USE_LOCATION_SEARCH_ITEM_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_location_pin, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.address_picker_location_action, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
    }
}
