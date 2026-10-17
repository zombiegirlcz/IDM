package x97;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.globalsearch.api.R$string;
import ia3.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f303584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m93.d f303585b;

    public a(r cardsContentMapper, m93.d cardThumbnailImageProvider) {
        Intrinsics.checkNotNullParameter(cardsContentMapper, "cardsContentMapper");
        Intrinsics.checkNotNullParameter(cardThumbnailImageProvider, "cardThumbnailImageProvider");
        this.f303584a = cardsContentMapper;
        this.f303585b = cardThumbnailImageProvider;
    }

    public static TextLocalisedClause a(boolean z) {
        return z ? new TextLocalisedClause(R$string.search_block_wallet_title, null, null, 14) : new TextLocalisedClause(R$string.search_block_discover_cards_title, null, null, 14);
    }
}
