package zt7;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.AbstractList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static final List a(AbstractList abstractList, String listId, Clause clause, int i) {
        Intrinsics.checkNotNullParameter(abstractList, "<this>");
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (clause != null) {
            return yp0.b.g(abstractList, new ListSubheaderDelegate.Model(listId, (Image) null, clause, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) new AnalyticsContext(zw4.a.a(listId)), 0, 0, 0, 0, 63482), null, i, 0, 122);
        }
        yp0.b.k(abstractList, i, 0, 0, 0, 30);
        return abstractList;
    }
}
