package of9;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import com.revolut.feature.apm.bills.core.api.model.BillInputV2;
import com.revolut.feature.apm.bills.core.api.model.form.RepeaterField;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f224759a;

    public f(w80.b amountFormatter, g validator) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(validator, "validator");
        this.f224759a = amountFormatter;
    }

    public static tf a() {
        return new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246)));
    }

    public static pf b() {
        return new pf(new TextLocalisedClause(R.string.common_action_edit, null, null, 14), null, null, false, null, null, 510);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r5v13 */
    public static List c(RepeaterField repeaterField, List list) {
        RepeaterField repeaterField2 = repeaterField;
        List list2 = list;
        Style style = null;
        if (list2 == null || list2.isEmpty()) {
            return yp0.b.i(new RowDelegate.Model("REPEATER_NEW_ITEM_ID", new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_plus, null, null, 6), null, null, false, null, false, 60), new TextClause(repeaterField2.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, repeaterField, null, 0, 0, 0, 0, 532676600), new ListSubheaderDelegate.Model("REPEATER_HEADER", (Image) null, (Clause) new TextClause(repeaterField.f61413b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        }
        BillFormField.BillFormFieldAttributes billFormFieldAttributes = repeaterField2.d;
        Integer num = billFormFieldAttributes != null ? billFormFieldAttributes.d : null;
        boolean z = true;
        boolean z3 = false;
        boolean z4 = num == null || list.size() < num.intValue();
        List list3 = list;
        ArrayList arrayList = new ArrayList(w.t(list3, 10));
        int i = 0;
        for (Object obj2 : list3) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            ArrayList arrayList2 = arrayList;
            repeaterField2 = repeaterField;
            arrayList2.add(new RowDelegate.Model(j6.a.q("REPEATER_ID_", ((BillInputV2) obj2).getF61319a()), null, new TextLocalisedClause(R$string.pay_bills_taxes_tax_form_repeater_item_title, u.c(Integer.valueOf(i2)), style, 12), null, 0, null, null, null, 0, a(), false, null, false, null, null, null, null, null, null, repeaterField, null, 0, 0, 0, 0, 532675578));
            arrayList = arrayList2;
            i = i2;
            style = null;
            z = true;
            z3 = false;
        }
        return yp0.b.g(arrayList, new ListSubheaderDelegate.Model("REPEATER_HEADER", (Image) null, (Clause) new TextClause(repeaterField2.f61413b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) (z4 ? new TextClause(repeaterField2.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : style), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, true, 3), false, false, (Object) repeaterField2, (Parcelable) null, 0, 0, 0, 0, 64426), null, 0, 0, 126);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0517 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x001b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0300  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList d(java.util.List r62, java.util.List r63) {
        /*
            Method dump skipped, instruction units count: 2851
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: of9.f.d(java.util.List, java.util.List):java.util.ArrayList");
    }
}
