package uj9;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import vim.f;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class a {
    public static List a(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        ComplexImage.Regular regular = new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14);
        new TextLocalisedClause(R.string.common_action_retry, null, null, 14);
        return u.c(new FullScreenStateDelegate.Model(listId, textLocalisedClause, null, regular, null, null, false, null, null, false, 0, 0, 32724));
    }

    public static ArrayList b(int i, String primaryId) {
        Intrinsics.checkNotNullParameter(primaryId, "primaryId");
        IntRange intRange = new IntRange(1, i, 1);
        ArrayList arrayList = new ArrayList(w.t(intRange, 10));
        f it8 = intRange.iterator();
        while (it8.f289625c) {
            pb0 pb0Var = new pb0(j6.a.m(it8.nextInt() - 1, "id_row_loading_", "_", primaryId));
            yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
            arrayList.add(pb0Var);
        }
        return arrayList;
    }
}
