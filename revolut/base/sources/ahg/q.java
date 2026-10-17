package ahg;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.image.transformation.RoundedRectTransformation;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.rev_points.giftcards.api.model.UserVoucher;
import com.revolut.feature.travel.miles.api.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import yp0.e0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class q implements cli.n {

    @NotNull
    public static final o Companion = new o();

    public static ArrayList a(ArrayList arrayList, boolean z) {
        Clause textLocalisedClause;
        String str = z ? "AVAILABLE_VOUCHERS_PREFIX_LIST_ID" : "USED_VOUCHERS_PREFIX_LIST_ID";
        String str2 = z ? "AVAILABLE_VOUCHERS_SUB_HEADER_LIST_ID" : "USED_VOUCHERS_SUB_HEADER_LIST_ID";
        TextLocalisedClause textLocalisedClause2 = z ? new TextLocalisedClause(R$string.miles_my_cards_details_available_title, null, null, 14) : new TextLocalisedClause(R$string.miles_my_cards_details_used_title, null, null, 14);
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            UserVoucher userVoucher = (UserVoucher) it8.next();
            dj0.d dVar = userVoucher.f83623h;
            TextLocalisedClause textLocalisedClause3 = (dVar == null || dVar.f115082a <= 0) ? null : new TextLocalisedClause(R$string.miles_airline_details_your_giftcards_available_amount, u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
            String strO = com.google.android.gms.internal.mlkit_vision_face.a.o(str, " ", userVoucher.f83619a);
            TextClause textClause = new TextClause(userVoucher.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            RowDelegate.Model.c.b bVar = new RowDelegate.Model.c.b(new MoneyClause(userVoucher.f83622g, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 8), textLocalisedClause3, null, false, 124);
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new UrlImage(userVoucher.f, null, null, null, 0L, null, null, null, ez0.h.FitCenter, null, false, new ImageTransformations(null, new RoundedRectTransformation(4.0f), null, null, null, null, null, ISO781611.SMT_TAG), 44, 40, false, false, 409086), null, null, false, null, false, 60);
            tvb.d dVar2 = userVoucher.i;
            long j2 = userVoucher.f83621c;
            int i = p.f5128a[dVar2.ordinal()];
            if (i == 1) {
                textLocalisedClause = new TextLocalisedClause(R$string.miles_airline_details_your_giftcards_pending_description, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
            } else {
                if (i != 2 && i != 3 && i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TimeClause(j2, new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12);
            }
            arrayList2.add(new RowDelegate.Model(strO, image40, textClause, null, 1, textLocalisedClause, null, null, 0, bVar, false, null, false, null, null, null, null, null, null, userVoucher.f83619a, null, 0, 0, 0, 0, 532675528));
        }
        e0 e0Var = e0.OUTSIDE_BOX;
        int i2 = R$attr.uikit_dp8;
        int i3 = R$attr.uikit_dp16;
        return !arrayList2.isEmpty() ? yp0.b.d(arrayList2, new ListSubheaderDelegate.Model(str2, (Image) null, (Clause) textLocalisedClause2, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0Var, i2, i2, i3, i3) : arrayList2;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new l((List) iii.c.f(domainState.f5114b, new agh.h(19), new ah1.p(6), new a2g.m(this, 17)), (i) iii.c.f(domainState.f5113a, new agh.h(18), new ah1.p(5), new a2g.m(16)));
    }
}
