package xl7;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.data.model.Benefit;
import com.revolut.feature.insurance_car.impl.data.model.BenefitCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.a0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e {
    public static final ArrayList a(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            BenefitCategory benefitCategory = (BenefitCategory) it8.next();
            ArrayList arrayList2 = benefitCategory.f75182a;
            String str = benefitCategory.f75183b;
            a0.x(b(arrayList2, str, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), arrayList);
        }
        return arrayList;
    }

    public static final List b(ArrayList arrayList, String headerListId, TextClause headerClause) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(headerListId, "headerListId");
        Intrinsics.checkNotNullParameter(headerClause, "headerClause");
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            Benefit benefit = (Benefit) it8.next();
            String str = benefit.f75172a;
            nr7.b bVar = benefit.f75173b;
            boolean z = benefit.f75175g;
            Benefit.Details details = benefit.e;
            CompositeClause compositeClauseN = null;
            RowDelegate.Model.MainImage mainImageA = details == null ? sr7.e.a(bVar, R$attr.uikit_colorForeground) : sr7.e.b(bVar, z, null, 14);
            RowDelegate.Model.b bVar2 = z ? RowDelegate.Model.b.c.f53268a : RowDelegate.Model.b.a.f53266a;
            TextClause textClause = new TextClause(benefit.f75174c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            TextClause textClause2 = new TextClause(benefit.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            boolean z3 = details != null && z;
            String str2 = benefit.f;
            if (str2 != null) {
                TextClause textClause3 = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                int i = R$drawable.uikit_icn_16_warning;
                int i2 = R$attr.uikit_colorOrange;
                compositeClauseN = n.n(textClause3, i, i2, new Custom(Integer.valueOf(i2), false, null, false, null, 254), null, 8);
            }
            arrayList2.add(new RowDelegate.Model(str, mainImageA, textClause, null, 0, textClause2, compositeClauseN, null, 0, null, z3, null, false, bVar2, null, null, null, null, null, benefit, null, 0, 0, 0, 0, 532658072));
        }
        return n.l(arrayList2, new ListSubheaderDelegate.Model(headerListId, (Image) null, (Clause) headerClause, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
    }
}
