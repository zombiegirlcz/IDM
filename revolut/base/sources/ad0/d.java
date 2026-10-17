package ad0;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.backend_flow.domain.models.BackendCard;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zc0.z2;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements c {
    public final RowDelegate.Model a(BackendCard backendCard, z2 z2Var) {
        Intrinsics.checkNotNullParameter(backendCard, "backendCard");
        return new RowDelegate.Model(backendCard.f63254a, new RowDelegate.Model.MainImage.Image40(new UrlImage(backendCard.f63255b, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), null, null, false, null, false, 62), new TextClause(backendCard.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextClause(backendCard.f63256c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, z2Var, null, 0, 0, 0, 0, 532676568);
    }
}
