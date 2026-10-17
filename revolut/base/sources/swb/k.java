package swb;

import a83.z;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.image.transformation.RoundedRectTransformation;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.rev_points.giftcards.api.R$string;
import com.revolut.feature.rev_points.giftcards.api.model.UserVoucher;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static ArrayList a(List list, RowDelegate.Model.b bVar) {
        List<UserVoucher> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (UserVoucher userVoucher : list2) {
            arrayList.add(new RowDelegate.Model(j6.a.q("SECTION_DOWNLOAD_PREFIX", userVoucher.f83619a), new RowDelegate.Model.MainImage.Image40(new UrlImage(userVoucher.f, null, null, null, 0L, null, null, null, ez0.h.FitCenter, null, false, new ImageTransformations(null, new RoundedRectTransformation(4.0f), null, null, null, null, null, ISO781611.SMT_TAG), 44, 40, false, false, 409086), null, null, false, null, false, 62), new TextClause(userVoucher.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 1, new TimeClause(userVoucher.f83621c, new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12), null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(userVoucher.f83622g, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 8), null, null, false, 126), false, null, false, bVar, null, null, null, null, null, userVoucher.f83619a, null, 0, 0, 0, 0, 532659144));
        }
        return arrayList;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.gift_cards_download_screen_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.gift_cards_download_screen_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.gift_cards_download_screen_only_internal_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.gift_cards_download_screen_action_title, null, null, 14);
        return (i) iii.c.f(domainState.f266173a, new s06.e(textLocalisedClause, textLocalisedClause2, textLocalisedClause4, this), new z(textLocalisedClause, textLocalisedClause2, textLocalisedClause4, this), new ccg.b(this, textLocalisedClause, textLocalisedClause3, textLocalisedClause2, textLocalisedClause4));
    }
}
