package pkh;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;

/* JADX INFO: loaded from: classes10.dex */
public abstract class m {
    public static final koi.j a(String listId, Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        Intrinsics.checkNotNullParameter(listId, "listId");
        PlainTextDelegate.Model model = new PlainTextDelegate.Model(listId, (UrlImage) null, (Clause) pair.f186385a, (Clause) pair.f186386b, (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }
}
