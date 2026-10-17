package t17;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.freelancer.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class p {
    public static ListSubheaderDelegate.Model a(int i, int i2, int i3, int i5, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        return i2 > 0 ? new ListSubheaderDelegate.Model(listId, (Image) null, (Clause) new TextLocalisedClause(i3, v.k(Integer.valueOf(i2), Integer.valueOf(i)), null, 12), (Image) null, (Clause) new TextLocalisedClause(R$string.freelancer_common_action_reset, null, null, 14), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, true), false, false, (Object) Boolean.TRUE, (Parcelable) null, 0, 0, 0, 0, 64426) : new ListSubheaderDelegate.Model(listId, (Image) null, (Clause) new TextLocalisedClause(i5, u.c(Integer.valueOf(i)), null, 12), (Image) null, (Clause) new TextLocalisedClause(R$string.freelancer_common_action_select_all, null, null, 14), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, true), false, false, (Object) Boolean.FALSE, (Parcelable) null, 0, 0, 0, 0, 64426);
    }
}
