package vuk;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import tuk.d;
import uuk.b;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements d {
    public static CellDetailsDelegate.Model a(Clause clause, TextLocalisedClause textLocalisedClause, String str) {
        return new CellDetailsDelegate.Model("SECTION_ROW_".concat(str), textLocalisedClause, clause, null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
    }

    public static ListSubheaderDelegate.Model b(TextLocalisedClause textLocalisedClause, String str, b.a aVar) {
        return new ListSubheaderDelegate.Model("SECTION_TITLE_".concat(str), (Image) null, (Clause) textLocalisedClause, (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(true, false, false, 6), false, false, (Object) aVar, (Parcelable) null, 0, 0, 0, 0, 64434);
    }
}
