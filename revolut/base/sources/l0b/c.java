package l0b;

import c1b.e;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.advanced_charts.impl.R$string;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        int i;
        int i2;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.trading_advanced_chart_drawings_title, null, null, 14), null, null, null, false, 30);
        EnumEntries<e> enumEntriesA = e.a();
        ArrayList arrayList = new ArrayList(w.t(enumEntriesA, 10));
        for (e eVar : enumEntriesA) {
            String str = "CHART_DRAWING_ITEM_ID_" + eVar;
            Intrinsics.checkNotNullParameter(eVar, "<this>");
            int[] iArr = a1b.a.f579a;
            switch (iArr[eVar.ordinal()]) {
                case 1:
                    i = R$string.trading_advanced_chart_drawings_content_measure;
                    break;
                case 2:
                    i = R$string.trading_advanced_chart_drawings_content_trendline;
                    break;
                case 3:
                    i = R$string.trading_advanced_chart_drawings_content_horizontal_line;
                    break;
                case 4:
                    i = R$string.trading_advanced_chart_drawings_content_vertical_line;
                    break;
                case 5:
                    i = R$string.trading_advanced_chart_drawings_content_fibonacci_time;
                    break;
                case 6:
                    i = R$string.trading_advanced_chart_drawings_content_elliott_impulsive_wave;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
            LayeredImage.Companion companion = LayeredImage.INSTANCE;
            Intrinsics.checkNotNullParameter(eVar, "<this>");
            switch (iArr[eVar.ordinal()]) {
                case 1:
                    i2 = R$drawable.uikit_icn_24_ruler_outline;
                    break;
                case 2:
                    i2 = R$drawable.uikit_icn_24_draw_trendline;
                    break;
                case 3:
                    i2 = R$drawable.uikit_icn_24_draw_horizontal_line;
                    break;
                case 4:
                    i2 = R$drawable.uikit_icn_24_draw_vertical_line;
                    break;
                case 5:
                    i2 = R$drawable.uikit_icn_24_draw_fibonacci_time;
                    break;
                case 6:
                    i2 = R$drawable.uikit_icn_16_timeline;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image24(LayeredImage.Companion.b(companion, i2, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorTransparent, 2.0f, Float.valueOf(28.0f), null, 32), false, false, 6), textLocalisedClause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, eVar, null, 0, 0, 0, 0, 532676600));
        }
        yp0.b.k(arrayList, 0, R$attr.uikit_dp24, 0, 0, 29);
        return new cii.b(null, arrayList, aVar);
    }
}
