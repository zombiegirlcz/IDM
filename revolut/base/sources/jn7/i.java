package jn7;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.Benefit;
import com.revolut.feature.insurance_common.data.model.Document;
import hx7.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xl7.j;
import xl7.n;
import zhm.a0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static RowDelegate.Model b(int i, String str) {
        RowDelegate.Model.MainImage.Image24 image24I = n.i(i, Integer.valueOf(R$attr.uikit_colorForeground));
        TextClause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int i2 = R$attr.uikit_dp12;
        return new RowDelegate.Model(str, image24I, textClause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, i2, i2, 0, 0, 486537208);
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        int i;
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextClause textClause = new TextClause(domainState.f176652a.f75174c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Benefit benefit = domainState.f176652a;
        LayeredImage layeredImageK = LayeredImage.INSTANCE.k(l.H(benefit.f75173b), R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10);
        Benefit.Details details = benefit.e;
        aim.e eVarB = u.b();
        if (details != null) {
            ArrayList<Document> arrayList = details.d;
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            for (Document document : arrayList) {
                Intrinsics.checkNotNullParameter(document, "<this>");
                String str = document.f75713a;
                int i2 = j.f306949a[document.e.ordinal()];
                if (i2 == 1) {
                    i = R$drawable.uikit_icn_24_document;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$drawable.uikit_icn_24_link_external;
                }
                RowDelegate.Model.MainImage.Image40 image40K = n.k(i, false, null, 15);
                TextClause textClause2 = new TextClause(document.f75713a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str2 = document.f75714b;
                arrayList2.add(new RowDelegate.Model(str, image40K, textClause2, null, 0, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, 0, n.c(), false, null, false, null, null, null, null, null, null, document, null, 0, 0, 0, 0, 532675544));
            }
            a0.x(n.l(arrayList2, new ListSubheaderDelegate.Model("DOCUMENTS_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.car_insurance_benefit_details_sections_full_details_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530)), eVarB);
            ArrayList<Benefit.KeyParam> arrayList3 = details.f75176a;
            ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
            for (Benefit.KeyParam keyParam : arrayList3) {
                String str3 = keyParam.f75180b;
                RowDelegate.Model.MainImage.Image24 image24I = n.i(l.H(keyParam.f75179a), Integer.valueOf(R$attr.uikit_colorForeground));
                TextClause textClause3 = new TextClause(keyParam.f75180b, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
                RowDelegate.Model.c.b bVar = new RowDelegate.Model.c.b(new TextClause(keyParam.f75181c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 126);
                int i3 = R$attr.uikit_dp12;
                arrayList4.add(new RowDelegate.Model(str3, image24I, textClause3, null, 0, null, null, null, 0, bVar, false, null, false, null, null, null, null, null, null, null, null, i3, i3, 0, 0, 486536184));
            }
            a0.x(n.l(arrayList4, new ListSubheaderDelegate.Model("KEY_DETAILS_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.car_insurance_benefit_details_sections_key_details_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530)), eVarB);
            List list = details.f75177b;
            ArrayList arrayList5 = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList5.add(b(R$drawable.uikit_icn_24_check, (String) it8.next()));
            }
            a0.x(n.l(arrayList5, new ListSubheaderDelegate.Model("COVERED_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.car_insurance_benefit_details_sections_covered_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530)), eVarB);
            List list2 = details.f75178c;
            ArrayList arrayList6 = new ArrayList(w.t(list2, 10));
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                arrayList6.add(b(R$drawable.uikit_icn_24_cross, (String) it9.next()));
            }
            a0.x(n.l(arrayList6, new ListSubheaderDelegate.Model("NOT_COVERED_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.car_insurance_benefit_details_sections_not_covered_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530)), eVarB);
            CellDetailsChevronDelegate.Model model = new CellDetailsChevronDelegate.Model("GET_HELP", new TextLocalisedClause(R$string.car_insurance_common_have_questions, null, null, 14), 0, false, null, null, null, 2044);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model);
        }
        return new g(u.a(eVarB), textClause, layeredImageK);
    }
}
