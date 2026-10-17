package qjg;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.trusted_merchants.api.model.TrustedMerchant;
import com.revolut.feature.trusted_merchants.impl.ui.TrustedMerchantsFlowContract$MerchantsContent;
import ip0.gu;
import ip0.pb0;
import ip0.zj;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import zhm.a0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements b {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.c f246868a;

    public g(thf.c transactionCategoryResourcesMapper) {
        Intrinsics.checkNotNullParameter(transactionCategoryResourcesMapper, "transactionCategoryResourcesMapper");
        this.f246868a = transactionCategoryResourcesMapper;
    }

    public static List c() {
        gu guVar = new gu("SUB_HEADER_LOADING_LIST_ID", 0, R$attr.uikit_dp8, 26);
        pb0 pb0Var = new pb0("ROW_LOADING_LIST_ID");
        yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
        return v.k(guVar, pb0Var);
    }

    public final Image a(String str, String str2) {
        return str != null ? new UrlImage(str, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902) : ((wjf.e) this.f246868a).h(str2);
    }

    public final List b(TrustedMerchantsFlowContract$MerchantsContent content) {
        boolean z;
        int i;
        Intrinsics.checkNotNullParameter(content, "content");
        Throwable th10 = content.e;
        List list = content.f94418b;
        List list2 = content.f94417a;
        boolean z3 = content.d;
        boolean z4 = content.f94419c;
        if (th10 != null) {
            FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ERROR_ITEM_ID", new TextLocalisedClause(R$string.trusted_merchants_error_title, null, null, 14), null, null, null, new TextLocalisedClause(R$string.trusted_merchants_error_action, null, null, 14), false, null, null, false, 0, 0, 31708);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            return u.c(model);
        }
        if (!z4 && !z3 && list2.isEmpty() && list.isEmpty()) {
            List listC = u.c(new FullScreenStateDelegate.Model("EMPTY_STATE_ID", new TextLocalisedClause(R$string.trusted_merchants_empty_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D140", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 31716));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            return listC;
        }
        Float fValueOf = Float.valueOf(10.0f);
        ArrayList arrayList = new ArrayList();
        List list3 = list;
        int i2 = 12;
        if (list3.isEmpty()) {
            z = z4;
            i = 12;
            if (z3) {
                a0.x(c(), arrayList);
            }
        } else {
            ListSubheaderDelegate.Model model2 = new ListSubheaderDelegate.Model("TO_REVIEW_SUB_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.trusted_merchants_declined_section_title, v1.c.v(list), null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp16, 0, 0, 0, 61434);
            List<TrustedMerchant.ToReview> list4 = list;
            ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
            for (TrustedMerchant.ToReview toReview : list4) {
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(new RowDelegate.Model(toReview.f94411b, a(toReview.e, toReview.d), null, null, new TextClause(toReview.f94412c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.trusted_merchants_last_declined, u.c(new TimeClause(toReview.f94410a.toDateTime().getMillis(), TimeClause.Format.PrettyDayOfWeek.f57975b, null, null, 12)), new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 8), null, null, 0, null, false, false, LayeredImage.Companion.f(LayeredImage.INSTANCE, R$drawable.uikit_icn_16_exclamation_mark_sign, R$attr.uikit_colorRed, R$attr.uikit_colorWhite, null, 3.0f, 2.0f, fValueOf, 8), null, null, null, null, toReview, null, 0, 0, 0, 0, 1056948076));
                i2 = 12;
                arrayList2 = arrayList3;
                z4 = z4;
            }
            z = z4;
            ArrayList arrayList4 = arrayList2;
            i = i2;
            yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
            a0.x(i2b.a.q(model2, arrayList4), arrayList);
        }
        if (list2.isEmpty()) {
            if (z) {
                a0.x(c(), arrayList);
            }
            return arrayList;
        }
        ListSubheaderDelegate.Model model3 = new ListSubheaderDelegate.Model("TRUSTED_SUB_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.trusted_merchants_trusted_section_title, v1.c.v(list2), null, i), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, !list3.isEmpty() ? R$attr.uikit_dp32 : R$attr.uikit_dp16, 0, 0, 0, 61434);
        List<TrustedMerchant.Approved> list5 = list2;
        ArrayList arrayList5 = new ArrayList(w.t(list5, 10));
        for (TrustedMerchant.Approved approved : list5) {
            arrayList5.add(new RowDelegate.Model(approved.f94405b, a(approved.e, approved.d), null, null, new TextClause(approved.f94406c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.trusted_merchants_added, u.c(new TimeClause(approved.f94404a.toDateTime().getMillis(), TimeClause.Format.PrettyDayOfWeek.f57975b, null, null, 12)), null, i), null, null, 0, null, false, false, LayeredImage.Companion.f(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_shield, R$attr.uikit_colorAccent, R$attr.uikit_colorWhite, null, 3.0f, 2.0f, fValueOf, 8), null, null, null, null, approved, null, 0, 0, 0, 0, 1056948076));
        }
        yp0.b.k(arrayList5, 0, 0, 0, 0, 31);
        a0.x(i2b.a.q(model3, arrayList5), arrayList);
        return arrayList;
    }
}
