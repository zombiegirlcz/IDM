package xf7;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;
import uf7.t;

/* JADX INFO: loaded from: classes22.dex */
public final class a {
    public static ListSubheaderDelegate.Model a(String listId, TextClause startLabel, TextLocalisedClause textLocalisedClause, t tVar) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(startLabel, "startLabel");
        return new ListSubheaderDelegate.Model(listId, (Image) null, (Clause) startLabel, (Image) null, (Clause) textLocalisedClause, (String) null, (ListSubheaderDelegate.Model.a) (textLocalisedClause != null ? new ListSubheaderDelegate.Model.a.b(false, false, true, 3) : null), false, false, (Object) tVar, (Parcelable) null, 0, 0, 0, 0, 64426);
    }
}
