package dok;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import dnk.l;
import ggk.j0;
import ggk.k0;
import ggk.l0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f116584a;

    public i(l iconMapper) {
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        this.f116584a = iconMapper;
    }

    public final NavBarMenuItem a(l0 forward) {
        Intrinsics.checkNotNullParameter(forward, "forward");
        if (forward instanceof j0) {
            return IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "ID_NAV_BAR_ITEM", this.f116584a.c(((j0) forward).f143734a), null, null, null, 124);
        }
        if (forward instanceof k0) {
            return new TextNavBarMenuItem("ID_NAV_BAR_ITEM", new TextClause(((k0) forward).f143739a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        }
        throw new NoWhenBranchMatchedException();
    }
}
