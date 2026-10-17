package q3d;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n3d.a f241957a;

    public k(n3d.a customSymbolMapper) {
        Intrinsics.checkNotNullParameter(customSymbolMapper, "customSymbolMapper");
        this.f241957a = customSymbolMapper;
    }

    public static v1d.g a() {
        return new v1d.g(new TextLocalisedClause(R$string.shared_watchlist_widget_symbol_error_title, null, null, 14), new TextLocalisedClause(R$string.shared_watchlist_watchlist_screen_asset_section_buttons_try_again, null, null, 14));
    }
}
