package s12;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.RawCutoutImageBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.domain.models.moneyrequest.MoneyRequestDirection;
import com.revolut.domain.models.moneyrequest.MoneyRequestState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements a12.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wv9.c f259044a;

    public g(wv9.c mrMapper) {
        Intrinsics.checkNotNullParameter(mrMapper, "mrMapper");
        this.f259044a = mrMapper;
    }

    public final RowDelegate.Model a(MoneyRequest moneyRequest) {
        Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
        v6k.c cVar = (v6k.c) this.f259044a;
        Clause name = cVar.i(moneyRequest);
        Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
        TimeClause timeClause = new TimeClause(moneyRequest.f60319j.getMillis(), new TimeClause.Format.Pretty(0), null, null, 12);
        MoneyRequestState moneyRequestState = moneyRequest.f60315b;
        MoneyRequestDirection direction = moneyRequest.f60322n;
        Custom custom = new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Clause clauseL = direction == MoneyRequestDirection.OUTGOING ? v6k.c.l(name, moneyRequestState, custom) : v6k.c.k(name, moneyRequestState, custom);
        Image imageE = cVar.e(moneyRequest, wv9.b.CIRCULAR);
        LayeredImage layeredImageB = cVar.b(moneyRequestState);
        return new RowDelegate.Model(moneyRequest.f60314a, new RowDelegate.Model.MainImage.Image40(imageE, layeredImageB != null ? new RawCutoutImageBadge(layeredImageB) : null, null, false, null, false, 60), name, null, 0, timeClause, clauseL, null, 0, new RowDelegate.Model.c.b(cVar.a(moneyRequest, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254)), null, null, false, 126), false, null, false, null, null, null, null, null, null, moneyRequest, null, 0, 0, 0, 0, 532675480);
    }
}
