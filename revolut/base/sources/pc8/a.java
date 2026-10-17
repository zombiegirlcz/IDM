package pc8;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import m93.d;
import m93.g;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f234830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f234831b;

    public a(g cardsSimplifiedItemMapper, d cardThumbnailImageProvider) {
        Intrinsics.checkNotNullParameter(cardsSimplifiedItemMapper, "cardsSimplifiedItemMapper");
        Intrinsics.checkNotNullParameter(cardThumbnailImageProvider, "cardThumbnailImageProvider");
        this.f234830a = cardsSimplifiedItemMapper;
        this.f234831b = cardThumbnailImageProvider;
    }

    public static boolean a(Clause clause) {
        String str;
        TextClause textClause = clause instanceof TextClause ? (TextClause) clause : null;
        if (textClause == null || (str = textClause.f57936a) == null) {
            return true;
        }
        return !d0.W(str);
    }
}
