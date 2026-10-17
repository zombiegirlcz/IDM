package fo9;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.R$string;
import ip0.ck0;
import ip0.yj0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class t implements cli.n {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b6k.c f136856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r2a.b f136857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final whf.n f136858c;

    public t(b6k.c analyticsItemMapper, r2a.b wallpaperSettingsMapper, whf.n transactionsListMapper) {
        Intrinsics.checkNotNullParameter(analyticsItemMapper, "analyticsItemMapper");
        Intrinsics.checkNotNullParameter(wallpaperSettingsMapper, "wallpaperSettingsMapper");
        Intrinsics.checkNotNullParameter(transactionsListMapper, "transactionsListMapper");
        this.f136856a = analyticsItemMapper;
        this.f136857b = wallpaperSettingsMapper;
        this.f136858c = transactionsListMapper;
    }

    public static koi.j a() {
        TextDelegate.Model model = new TextDelegate.Model("LIST_ID_TRANSACTIONS_EMPTY", new TextLocalisedClause(R$string.apm_recipient_details_transactions_empty, null, null, 14), false, new ck0(yj0.CENTER_HORIZONTAL), null, null, 0, 0, 0, 0, 2036);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (q) iii.c.f(domainState.f136843a, new a(1), new fk4.r(24), new f0e.i(this, domainState, 17));
    }
}
