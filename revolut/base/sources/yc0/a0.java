package yc0;

import aw0.o9;
import com.revolut.core.backend_flow.R$string;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.backend_flow.domain.models.Action;
import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.InfoMessageItem;
import com.revolut.feature.backend_flow.domain.models.LinkItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class a0 implements y {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bd0.d f312412a;

    public a0(bd0.d searchDetector) {
        Intrinsics.checkNotNullParameter(searchDetector, "searchDetector");
        this.f312412a = searchDetector;
    }

    @Override // yc0.y
    public final int b(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        return Integer.parseInt(kotlin.text.d0.e0(listId, "MENU_ITEM_"));
    }

    @Override // yc0.y
    public final List c(FormScreen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        aim.e eVarB = zhm.u.b();
        eVarB.add(this.f312412a.a(screen) ? IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "SEARCH_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_search, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124) : null);
        List list = screen.f63468b;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            Integer numValueOf = Integer.valueOf(i);
            if (!(((BackendItem) obj2) instanceof LinkItem)) {
                numValueOf = null;
            }
            IconNavBarMenuItem iconNavBarMenuItemA = numValueOf != null ? IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, a0.d.n("MENU_ITEM_", i), new ResourceImage(R$drawable.uikit_icn_24_question_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124) : null;
            if (iconNavBarMenuItemA != null) {
                arrayList.add(iconNavBarMenuItemA);
            }
            i = i2;
        }
        zhm.a0.x(arrayList, eVarB);
        Action action = screen.d;
        TextNavBarMenuItem textNavBarMenuItem = action == null ? null : new TextNavBarMenuItem("ACTION_MENU_ID", new TextClause(action.getF63230b(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        if (textNavBarMenuItem == null) {
            textNavBarMenuItem = !pd.b.k(screen.f63471h) ? new TextNavBarMenuItem("SKIP_MENU_ID", new TextLocalisedClause(R$string.form_builder_skip, null, null, 14), null, null, 12) : null;
        }
        eVarB.add(textNavBarMenuItem);
        InfoMessageItem infoMessageItem = screen.f63475n;
        eVarB.add(infoMessageItem != null ? new TextNavBarMenuItem("SHOW_INFO_MESSAGE", new TextClause(infoMessageItem.f63509a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12) : null);
        return zhm.d0.Z(zhm.u.a(eVarB));
    }
}
