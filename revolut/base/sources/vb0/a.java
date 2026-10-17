package vb0;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.backend_flow.domain.models.Action;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import yc0.f;
import yc0.g;
import yc0.p;
import yc0.q;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f287344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f287345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f287346c;
    public final p d;
    public final in0.g e;

    public a(q imageItemMapper, g analyticsMapper, f iconMapper, p htmlStringItemMapper, in0.g screenCapturingProtection) {
        Intrinsics.checkNotNullParameter(imageItemMapper, "imageItemMapper");
        Intrinsics.checkNotNullParameter(analyticsMapper, "analyticsMapper");
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        Intrinsics.checkNotNullParameter(htmlStringItemMapper, "htmlStringItemMapper");
        Intrinsics.checkNotNullParameter(screenCapturingProtection, "screenCapturingProtection");
        this.f287344a = imageItemMapper;
        this.f287345b = analyticsMapper;
        this.f287346c = iconMapper;
        this.d = htmlStringItemMapper;
        this.e = screenCapturingProtection;
    }

    public static PromptMarketingContentDelegate.Model.Button a(Action action, LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton) {
        return new PromptMarketingContentDelegate.Model.Button((Clause) new TextClause(action.getF63230b(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (ResourceImage) null, (LargeActionButton.ButtonStyle) defaultFilledButton, true, (String) null, 38);
    }
}
