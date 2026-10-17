package p9d;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.shared.help_centre.impl.R$string;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import yp0.e0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class j {
    public static final ListSubheaderDelegate.Model a(TextLocalisedClause label, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(label, "label");
        int i = R$attr.uikit_dp12;
        return new ListSubheaderDelegate.Model(listId, (Image) null, (Clause) label, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, i, i, 0, 0, 53242);
    }

    public static final ArrayList b(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return yp0.b.g(arrayList, a(new TextLocalisedClause(R$string.help_center_screen_faq_list_category_title, null, null, 14), "FAQ_SECTION_TITLE_ID"), e0.INSIDE_BOX, 0, 0, 124);
    }
}
