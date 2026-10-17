package lm1;

import android.os.Parcelable;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.apm.bills.billers.api.model.Biller;
import com.revolut.feature.apm.bills.core.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lk7.m;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static List a(ArrayList arrayList, String str, xo1.g gVar, int i) {
        ArrayList arrayListE0 = null;
        if (!arrayList.isEmpty()) {
            List listC = u.c(new ListSubheaderDelegate.Model(str, (Image) null, (Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
            ArrayList arrayListB = b(arrayList, gVar);
            yp0.b.k(arrayListB, 0, 0, 0, 0, 31);
            arrayListE0 = d0.E0(arrayListB, listC);
        }
        return arrayListE0 == null ? f0.f322471a : arrayListE0;
    }

    public static ArrayList b(List list, xo1.g gVar) {
        TextClause textClause;
        String str;
        TextClause textClause2;
        List<Biller> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (Biller biller : list2) {
            String strQ = j6.a.q("ID_BILLER_", com.revolut.feature.apm.bills.billers.api.model.a.a(biller));
            RowDelegate.Model.MainImage.Image40 image40 = null;
            TextClause textClause3 = new TextClause(com.revolut.feature.apm.bills.billers.api.model.a.b(biller), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            int i = l.f196863a[gVar.ordinal()];
            if (i == 1 || i == 2) {
                textClause = null;
            } else {
                if (i == 3 || i == 4) {
                    Biller.Details details = biller.k;
                    if (details != null && (str = details.f61153c) != null) {
                        String str2 = !kotlin.text.d0.W(str) ? str : null;
                        if (str2 != null) {
                            textClause2 = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        }
                    }
                    textClause = null;
                } else {
                    textClause2 = new TextClause(com.revolut.feature.apm.bills.billers.api.model.a.a(biller), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                }
                textClause = textClause2;
            }
            if (v.k(xo1.g.TAPI, xo1.g.TAPI_CO, xo1.g.GIRO_HU_DIRECT_DEBIT, xo1.g.MASAV_IL_DIRECT_DEBIT, xo1.g.UAE_BILLS).contains(gVar)) {
                String str3 = biller.f61148g;
                image40 = new RowDelegate.Model.MainImage.Image40(str3 != null ? new UrlImage(str3, null, null, null, 0L, null, null, null, null, new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, com.revolut.feature.apm.bills.billers.api.model.a.b(biller), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063), false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 506878) : new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, com.revolut.feature.apm.bills.billers.api.model.a.b(biller), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063), null, null, false, null, false, 62);
            }
            arrayList.add(new RowDelegate.Model(strQ, image40, textClause3, null, 0, textClause, null, null, 0, null, false, null, false, null, null, null, null, null, null, biller, null, 0, 0, 0, 0, 532676568));
        }
        return arrayList;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.g(domainState.f196853a, new llb.e(this, 4), new m(this), new lk7.n(2, domainState, this));
        xo1.g gVar = domainState.f196855c;
        xo1.b bVar = domainState.d;
        int[] iArr = l.f196863a;
        int i = iArr[gVar.ordinal()];
        TextLocalisedClause textLocalisedClause = i != 1 ? i != 2 ? (i == 3 || i == 4) ? bVar == xo1.b.MOBILE_TOPUP ? new TextLocalisedClause(R$string.bills_biller_selection_phone_topups_title, null, null, 14) : new TextLocalisedClause(com.revolut.feature.apm.bills.billers.api.R$string.apm_billers_service_provider_search_tapi_title, null, null, 14) : null : new TextLocalisedClause(R$string.uae_bills_select_biller_title, null, null, 14) : new TextLocalisedClause(com.revolut.feature.apm.bills.billers.api.R$string.apm_billers_service_provider_search_title, null, null, 14);
        int i2 = iArr[gVar.ordinal()];
        return new f(textLocalisedClause, i2 != 1 ? (i2 == 3 || i2 == 4) ? new TextLocalisedClause(com.revolut.feature.apm.bills.billers.api.R$string.apm_billers_service_provider_search_search_bar_generic_placeholder, null, null, 14) : new TextLocalisedClause(com.revolut.feature.apm.bills.billers.api.R$string.apm_billers_service_provider_search_search_bar_placeholder, null, null, 14) : new TextLocalisedClause(com.revolut.feature.apm.bills.billers.api.R$string.apm_billers_service_provider_search_search_bar_payee_placeholder, null, null, 14), list);
    }
}
