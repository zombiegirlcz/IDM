package tij;

import aw0.n3;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import java.time.Instant;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z80.b f271546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f271547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rul.e f271548c;

    public f(z80.b phoneToolsProvider, ynj.m installationStateResolver, i portingStateDescriptionBuilder, xjj.a mobilePlanConnectedToDeviceClauseMapper, gte.a featureToggleInteractor, rul.e displayItemMapper) {
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(installationStateResolver, "installationStateResolver");
        Intrinsics.checkNotNullParameter(portingStateDescriptionBuilder, "portingStateDescriptionBuilder");
        Intrinsics.checkNotNullParameter(mobilePlanConnectedToDeviceClauseMapper, "mobilePlanConnectedToDeviceClauseMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(displayItemMapper, "displayItemMapper");
        this.f271546a = phoneToolsProvider;
        this.f271547b = featureToggleInteractor;
        this.f271548c = displayItemMapper;
    }

    public static n3 a(int i, int i2, int i3) {
        return new n3(new TextLocalisedClause(i, null, new Custom(Integer.valueOf(i3), false, null, false, null, 254), 10), new ResourceImage(i2, (Integer) null, (Integer) null, Integer.valueOf(i3), (List) null, (ImageTransformations) null, (Clause) null, 246));
    }

    public static n3 b(int i, Clause clause, Integer num) {
        new Custom(Integer.valueOf(i), false, null, false, null, 254);
        return new n3(clause, num != null ? new ResourceImage(num.intValue(), (Integer) null, (Integer) null, Integer.valueOf(i), (List) null, (ImageTransformations) null, (Clause) null, 246) : null);
    }

    public static n3 c(int i, Instant instant, TimeClause.Format format, Integer num, int i2) {
        return new n3(new TextLocalisedClause(i, zhm.u.c(new TimeClause(instant.toEpochMilli(), format, null, null, 12)), new Custom(Integer.valueOf(i2), false, null, false, null, 254), 8), new ResourceImage(num.intValue(), (Integer) null, (Integer) null, Integer.valueOf(i2), (List) null, (ImageTransformations) null, (Clause) null, 246));
    }
}
