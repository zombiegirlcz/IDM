package hba;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.pix.api.model.PixKey;
import com.revolut.feature.pix.api.model.PixKeyStatus;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.w1;
import org.jetbrains.annotations.NotNull;
import rp0.t;
import rp0.y;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j8a.a f150628a;

    public h(j8a.a pixKeyFormatter) {
        Intrinsics.checkNotNullParameter(pixKeyFormatter, "pixKeyFormatter");
        this.f150628a = pixKeyFormatter;
    }

    public static j0 d(int i, int i2, Integer num) {
        return new j0((Clause) new TextLocalisedClause(i, null, null, 14), (Clause) (num != null ? new TextLocalisedClause(num.intValue(), null, null, 14) : null), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(6, new TextLocalisedClause(i2, null, null, 14), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4076);
    }

    public final List a(PixKey pixKey) {
        List listC = u.c(new RowDelegate.Model(pixKey.getF80405a(), new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(c6d.b.j(pixKey), R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10), null, null, false, null, false, 62), new TextClause(((vca.f) this.f150628a).a(pixKey), (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), null, 0, new TextLocalisedClause(c6d.b.k(pixKey), null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }

    public final y b(PixKey pixKey, int i, int i2, List list, PixKeyStatus.UnderPortability underPortability, int i3) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(new TextLocalisedClause(c6d.b.k(pixKey), null, null, 14)), null, 12);
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            String str = DateTimeFormatter.ofPattern("d MMM").format((LocalDateTime) it8.next());
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            arrayList.add(new TextClause(str, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124));
        }
        t tVar = new t(textLocalisedClause, new TextLocalisedClause(i2, arrayList, null, 12), null, 28);
        List listA = a(pixKey);
        List listK = v.k(new LargeActionButtonDelegate.Model("CREATE_RANDOM_KEY_BUTTON_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.pix_migration_details_claimer_details_create_random_key, null, null, 14), false, null, null, underPortability, null, 744), new LargeActionButtonDelegate.Model("CANCEL_PORTABILITY_KEY_BUTTON_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(i3, null, null, 14), false, null, underPortability, R$attr.uikit_dp16, 0, 0, 0, 7536));
        int i5 = R$attr.uikit_dp16;
        yp0.b.q(listK, 0, i5, i5, i5, 1);
        return new y(d0.E0(listK, listA), tVar, rp0.l.WINDOW, null, null, null, 1016);
    }

    public final y c(PixKey pixKey, int i, int i2, int i3, Integer num, LocalDateTime localDateTime, PixKeyStatus.UnderPortability underPortability) {
        LargeActionButtonDelegate.Model model = null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        String str = DateTimeFormatter.ofPattern("d MMM").format(localDateTime);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        t tVar = new t(textLocalisedClause, new TextLocalisedClause(i2, u.c(new TextClause(str, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124)), null, 12), null, 28);
        List listA = a(pixKey);
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("DENY_PORTABILITY_BUTTON_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(i3, null, null, 14), false, null, null, underPortability, null, 744);
        if (num != null) {
            model = new LargeActionButtonDelegate.Model("ACCEPT_PORTABILITY_BUTTON_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(num.intValue(), null, null, 14), false, null, underPortability, R$attr.uikit_dp16, 0, 0, 0, 7536);
        }
        LargeActionButtonDelegate.Model[] elements = {model2, model};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        int i5 = R$attr.uikit_dp16;
        yp0.b.q(listL, 0, i5, i5, i5, 1);
        return new y(d0.E0(listL, listA), tVar, rp0.l.WINDOW, null, null, null, 1016);
    }
}
