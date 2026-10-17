package ou7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import h93.f0;
import h93.h0;
import ia3.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m93.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TextClause f229849b = new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f229850a;

    public c(d cardThumbnailImageProvider) {
        Intrinsics.checkNotNullParameter(cardThumbnailImageProvider, "cardThumbnailImageProvider");
        this.f229850a = cardThumbnailImageProvider;
    }

    public final RowDelegate.Model a(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        String str = card.f150115j;
        LayeredImage layeredImageD = null;
        TextClause textClause = str != null ? new TextClause("··".concat(str), (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        String strC = h0.c(card);
        TextClause[] elements = {textClause, strC != null ? new TextClause(strC, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        String str2 = card.f150110a;
        CompositeClause compositeClauseJ = v04.b.J(card, card.f150111b, null, null, 14);
        CompositeClause compositeClauseM = !((ArrayList) listL).isEmpty() ? yoj.b.m(f229849b, listL) : null;
        Image imageB = ((h) this.f229850a).b(card.f150114h, h0.e(card));
        if (h0.e(card)) {
            int i = R$drawable.uikit_icn_24_snowflake;
            int i2 = R$attr.uikit_colorRed;
            int i3 = R$attr.uikit_colorForeground;
            layeredImageD = LayeredImage.INSTANCE.d(i, i2, i3, Integer.valueOf(i3), 2.0f, 2.0f, Float.valueOf(8.0f));
        }
        return new RowDelegate.Model(str2, new RowDelegate.Model.MainImage.Image40(imageB, layeredImageD, null, false, 28), compositeClauseJ, null, 0, compositeClauseM, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_copy, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, card, null, 0, 0, 0, 0, 532675544);
    }
}
