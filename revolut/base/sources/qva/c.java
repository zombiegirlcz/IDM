package qva;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.recurringbuys.api.R$string;
import ip0.yt;
import ip0.z10;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t70.g;
import w01.h;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sa f249551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sa f249552b;

    public c(g localization) {
        Intrinsics.checkNotNullParameter(localization, "localization");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealthcore_recurringbuys_details_failed_info_title, null, null, 14);
        z10 z10Var = sa.Companion;
        ResourceImage resourceImage = h.f293612a;
        Intrinsics.checkNotNullParameter(z10Var, "<this>");
        ResourceImage resourceImage2 = h.f293613b;
        sa saVar = new sa("FAILED_ITEM_LIST_ID", textLocalisedClause, null, null, resourceImage2, 8080);
        yp0.b.l(saVar, 0, R$attr.uikit_dp16, 0, 0, null, false, 61);
        this.f249551a = saVar;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.wealthcore_recurringbuys_details_inactive_info_title, null, null, 14);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.wealthcore_recurringbuys_details_inactive_info_message, null, null, 14);
        Intrinsics.checkNotNullParameter(z10Var, "<this>");
        sa saVar2 = new sa("DEACTIVATE_ITEM_LIST_ID", textLocalisedClause2, textLocalisedClause3, null, resourceImage2, 8080);
        yp0.b.l(saVar2, 0, R$attr.uikit_dp16, 0, 0, null, false, 61);
        this.f249552b = saVar2;
        CellDetailsChevronDelegate.Model model = new CellDetailsChevronDelegate.Model("CONTACT_US_ITEM_LIST_ID", localization.getString(R$string.wealthcore_recurringbuys_get_help), null, null, 2044);
        int i = R$attr.uikit_dp16;
        yp0.b.l(model, i, i, 0, 0, null, false, 60);
        new TextDelegate.Model(R$attr.uikit_dp16, 0, 952, new TextLocalisedClause(R$string.wealthcore_recurringbuys_details_bottom_note_text_parametrised, u.c(new TextLocalisedClause(R$string.wealthcore_recurringbuys_details_bottom_note_link, null, new Click(30, (Integer) null, (Object) null, "FEES_PAGE_CLICK_ID", false), 10)), null, 12), "DISCLAIMER_LIST_ID");
    }

    public static ListCellDelegate.Model a(int i, int i2, int i3) {
        return new ListCellDelegate.Model(a0.d.n("IMPORTANT_SECTION_ITEM_LIST_ID_PREFIX", i), new j8(new ResourceImage(i3, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), yt.TOP), new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(i2, null, null, 14), false, null, null, 0, 0, 0, 0, 4064);
    }
}
