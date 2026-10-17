package jxk;

import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;
import nel.p0;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnimationRequest f179247a;

    public f(vwk.a tradingHoursUiAssetMapper) {
        Intrinsics.checkNotNullParameter(tradingHoursUiAssetMapper, "tradingHoursUiAssetMapper");
        this.f179247a = new AnimationRequest(false);
    }

    public final TagViewData a(p0 tradingSession, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(tradingSession, "session");
        AnimationRequest animationRequest = !z ? this.f179247a : null;
        Intrinsics.checkNotNullParameter(tradingSession, "tradingSession");
        TagViewData.Companion companion = TagViewData.INSTANCE;
        ResourceImage resourceImageA = ixk.b.a(tradingSession);
        TextLocalisedClause textLocalisedClauseC = ixk.b.c(tradingSession);
        int iB = ixk.b.b(tradingSession);
        TagViewData.CollapseState collapseState = new TagViewData.CollapseState(z3, animationRequest);
        companion.getClass();
        return TagViewData.Companion.a(resourceImageA, textLocalisedClauseC, iB, collapseState, wwk.d.f300700a);
    }
}
