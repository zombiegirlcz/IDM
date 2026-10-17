package c92;

import aw0.o9;
import com.google.android.material.internal.ViewUtils;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.models.badge.InactiveCircleBadge;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.models.multibanco.MultibancoWithdrawalCode;
import com.revolut.feature.apm.multibanco.api.R$string;
import java.time.LocalDateTime;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import my0.e;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ky0.d f22267b = new ky0.d("ID_CODE_WIDGET");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f22268a;

    public d(e mainProductWidgetFactory) {
        Intrinsics.checkNotNullParameter(mainProductWidgetFactory, "mainProductWidgetFactory");
        this.f22268a = mainProductWidgetFactory;
    }

    public static RowDelegate.Model a(MultibancoWithdrawalCode code, long j2) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(code, "code");
        int i = c.f22266a[code.f61953c.ordinal()];
        RowDelegate.Model.b.c cVar = RowDelegate.Model.b.c.f53268a;
        if (i != 1) {
            if (i != 2) {
                if (i == 3 || i == 4 || i == 5) {
                    return b(code);
                }
                throw new NoWhenBranchMatchedException();
            }
            LocalDateTime localDateTime = code.f61955h;
            TextLocalisedClause textLocalisedClause2 = localDateTime != null ? new TextLocalisedClause(R$string.multibanco_withdrawal_cell_subtitle_used, u.c(new TimeClause(oi0.d.R(localDateTime), new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12)), null, 12) : null;
            String str = code.f61951a;
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_cash, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), new AccentCircleBadge(dw0.a.Checked), null, false, null, false, 56);
            TextClause textClause = new TextClause(a.c(code), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            int i2 = R$string.multibanco_withdrawal_cell_subtitle;
            Object[] elements = {a.b(code), textLocalisedClause2};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return new RowDelegate.Model(str, image40, textClause, null, 0, new TextLocalisedClause(i2, kotlin.collections.d.L(elements), null, 12), null, null, 0, null, true, null, false, cVar, null, null, null, null, null, code, null, 0, 0, 0, 0, 532648920);
        }
        long jA = code.a();
        long jMax = Math.max(0L, jA - (j2 - oi0.d.R(code.f61954g)));
        if (jMax < 1) {
            return b(code);
        }
        boolean z = 1 <= jMax && jMax < 300000;
        if (z) {
            textLocalisedClause = new TextLocalisedClause(R$string.multibanco_withdrawal_cell_subtitle_expiring, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10);
        } else {
            int i3 = R$string.multibanco_withdrawal_cell_subtitle_active;
            Intrinsics.checkNotNullParameter(code, "<this>");
            textLocalisedClause = new TextLocalisedClause(i3, u.c(new TimeClause(oi0.d.R(code.i), TimeClause.Format.TimeDefault.f57977b, null, null, 12)), null, 12);
        }
        int i5 = z ? R$attr.uikit_colorRed : R$attr.uikit_colorAccent;
        ProgressStyle progressStyle = new ProgressStyle((int) jMax, (int) jA, i5, i5, R$attr.uikit_colorBackground, 2.0f, 2.0f, null, ViewUtils.EDGE_TO_EDGE_FLAGS);
        RowDelegate.Model.c.b bVar = new RowDelegate.Model.c.b(new TimeClause(jMax, new TimeClause.Format.Duration(0), null, null, 12), null, null, false, 126);
        String str2 = code.f61951a;
        RowDelegate.Model.MainImage.Image40 image402 = new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_cash, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, progressStyle, false, null, false, 56);
        TextClause textClause2 = new TextClause(a.c(code), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int i6 = R$string.multibanco_withdrawal_cell_subtitle;
        Object[] elements2 = {a.b(code), textLocalisedClause};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        return new RowDelegate.Model(str2, image402, textClause2, null, 0, new TextLocalisedClause(i6, kotlin.collections.d.L(elements2), null, 12), null, null, 0, bVar, true, null, true, cVar, null, null, null, null, null, code, null, 0, 0, 0, 0, 532648920);
    }

    public static RowDelegate.Model b(MultibancoWithdrawalCode multibancoWithdrawalCode) {
        TextLocalisedClause textLocalisedClause;
        int i = c.f22266a[multibancoWithdrawalCode.f61953c.ordinal()];
        if (i == 1 || i == 2) {
            textLocalisedClause = null;
        } else if (i == 3) {
            textLocalisedClause = new TextLocalisedClause(R$string.multibanco_withdrawal_cell_subtitle_expired, null, null, 14);
        } else if (i != 4) {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = null;
        } else {
            textLocalisedClause = new TextLocalisedClause(R$string.multibanco_withdrawal_cell_subtitle_cancelled, null, null, 14);
        }
        String str = multibancoWithdrawalCode.f61951a;
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_cash, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), new InactiveCircleBadge(dw0.a.Cancelled), null, false, null, false, 56);
        TextClause textClause = new TextClause(a.c(multibancoWithdrawalCode), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int i2 = R$string.multibanco_withdrawal_cell_subtitle;
        Object[] elements = {a.b(multibancoWithdrawalCode), textLocalisedClause};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new RowDelegate.Model(str, image40, textClause, null, 0, new TextLocalisedClause(i2, kotlin.collections.d.L(elements), null, 12), null, null, 0, null, true, null, false, RowDelegate.Model.b.a.f53266a, null, null, null, null, null, multibancoWithdrawalCode, null, 0, 0, 0, 0, 532648920);
    }
}
