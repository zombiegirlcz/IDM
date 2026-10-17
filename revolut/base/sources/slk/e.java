package slk;

import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit.models.badge.WarningCircleBadge;
import dnk.l;
import ggk.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ojk.n0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f264228a;

    public e(l iconMapper, n0 badgeIconMapper) {
        Intrinsics.checkNotNullParameter(badgeIconMapper, "badgeIconMapper");
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        this.f264228a = iconMapper;
    }

    public final CircleIconBadge a(r rVar) {
        dw0.a aVarA;
        if (rVar == null || (aVarA = n0.a(rVar.f143773a)) == null) {
            return null;
        }
        int i = d.f264227a[rVar.f143774b.ordinal()];
        if (i == 1) {
            return new AccentCircleBadge(aVarA);
        }
        if (i == 2) {
            return new WarningCircleBadge(aVarA);
        }
        if (i == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
