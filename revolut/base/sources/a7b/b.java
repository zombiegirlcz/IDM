package a7b;

import com.revolut.feature.retail.cobranded_cards.impl.presentation.mappers.CobrandedCardsCardFeesItemMapper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c7b.a f1813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r6b.a f1814b;

    public b(c7b.a iconMapper, r6b.a termsItemsMapper, CobrandedCardsCardFeesItemMapper cardFeesItemMapper) {
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        Intrinsics.checkNotNullParameter(termsItemsMapper, "termsItemsMapper");
        Intrinsics.checkNotNullParameter(cardFeesItemMapper, "cardFeesItemMapper");
        this.f1813a = iconMapper;
        this.f1814b = termsItemsMapper;
    }
}
