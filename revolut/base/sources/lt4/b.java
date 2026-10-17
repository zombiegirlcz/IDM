package lt4;

import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.j2;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardCellModel;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardDialogModel;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardModelParcel;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardModelTextStyle;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.a0;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class b {
    public static int a(Integer num) {
        return (num == null || num.intValue() == 0) ? R$attr.uikit_dp16 : num.intValue() == 1 ? R$attr.uikit_dp32 : num.intValue() == 2 ? R$attr.uikit_dp48 : R$attr.uikit_dp16;
    }

    public static ResourceImage b(CreditCardCellModel creditCardCellModel) {
        List list = creditCardCellModel.f;
        if (list != null && !list.isEmpty()) {
            return new ResourceImage(creditCardCellModel.f68831g ? R$drawable.uikit_icn_16_chevron_up : R$drawable.uikit_icn_16_chevron_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
        }
        if (creditCardCellModel.d != null) {
            return new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
        }
        return null;
    }

    public static j2 c(tl4.e eVar) {
        int i = eVar == null ? -1 : a.f199792a[eVar.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? j2.CAPTION : j2.H6 : j2.H3 : j2.CAPTION;
    }

    public static List d(String listId, CreditCardCellModel item) {
        ResourceImage resourceImage;
        Object model;
        String str;
        TextClause textClause;
        Custom custom;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(item, "item");
        CreditCardCellModel.Accessory accessory = item.f68830c;
        Integer num = item.e;
        int i = 0;
        if (accessory instanceof CreditCardCellModel.Accessory.LabelsAccessory) {
            CreditCardCellModel.Accessory.LabelsAccessory labelsAccessory = (CreditCardCellModel.Accessory.LabelsAccessory) accessory;
            CreditCardModelParcel creditCardModelParcelE = e(item);
            t0 t0Var = new t0(new TextClause(item.f68829b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), b(item), 0, creditCardModelParcelE != null, 20);
            TextClause textClause2 = new TextClause(labelsAccessory.f68838a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            j2 j2VarC = c(labelsAccessory.f68839b.f68857b);
            String str2 = labelsAccessory.f68840c;
            if (str2 != null) {
                tl4.f fVar = labelsAccessory.d.f68856a;
                if (fVar == null) {
                    custom = null;
                } else {
                    custom = new Custom(null, fVar == tl4.f.STRIKETHROUGH, null, false, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
                }
                textClause = new TextClause(str2, (Style) custom, (Integer) null, false, (o9) null, (List) null, 124);
            } else {
                textClause = null;
            }
            model = new CellDetailsDelegate.Model(listId, t0Var, textClause2, textClause, null, null, j2VarC, null, 0, null, false, false, null, creditCardModelParcelE, null, null, 0, 0, a(num), 0, 50315120);
            str = listId;
        } else if (accessory instanceof CreditCardCellModel.Accessory.ActionAccessory) {
            CreditCardCellModel.Accessory.ActionAccessory actionAccessory = (CreditCardCellModel.Accessory.ActionAccessory) accessory;
            TextClause textClause3 = new TextClause(item.f68829b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            TextClause textClause4 = new TextClause(actionAccessory.f68832a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            tl4.d dVar = actionAccessory.f68833b;
            str = listId;
            model = new CellDetailsActionDelegate.Model(str, textClause3, 0, dVar != null ? new ResourceImage(g.c(dVar), (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246) : null, textClause4, null, false, false, null, null, g.d(actionAccessory.f68834c), 0, 0, a(num), 0, 3143652);
        } else {
            if (!(accessory instanceof CreditCardCellModel.Accessory.IconWithLabelAccessory)) {
                throw new NoWhenBranchMatchedException();
            }
            CreditCardCellModel.Accessory.IconWithLabelAccessory iconWithLabelAccessory = (CreditCardCellModel.Accessory.IconWithLabelAccessory) accessory;
            CreditCardModelParcel creditCardModelParcelE2 = e(item);
            t0 t0Var2 = new t0(new TextClause(item.f68829b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), b(item), 0, creditCardModelParcelE2 != null, 20);
            String str3 = iconWithLabelAccessory.f68835a;
            tl4.c cVar = iconWithLabelAccessory.f68836b;
            TextClause textClause5 = new TextClause(str3, (Style) (cVar != null ? new Custom(Integer.valueOf(g.b(cVar)), false, null, false, null, 254) : null), (Integer) null, false, (o9) null, (List) null, 124);
            CreditCardModelTextStyle creditCardModelTextStyle = iconWithLabelAccessory.f68837c;
            j2 j2VarC2 = c(creditCardModelTextStyle != null ? creditCardModelTextStyle.f68857b : null);
            tl4.d dVar2 = iconWithLabelAccessory.d;
            if (dVar2 != null) {
                resourceImage = new ResourceImage(g.c(dVar2), (Integer) null, (Integer) null, cVar != null ? Integer.valueOf(g.b(cVar)) : null, (List) null, (ImageTransformations) null, (Clause) null, 246);
            } else {
                resourceImage = null;
            }
            str = listId;
            model = new CellDetailsDelegate.Model(str, t0Var2, textClause5, null, null, null, j2VarC2, null, 0, resourceImage, false, false, null, creditCardModelParcelE2, null, null, 0, 0, a(num), 0, 50314104);
        }
        List list = item.f;
        List list2 = list;
        if (list2 == null || list2.isEmpty() || !item.f68831g) {
            return u.c(model);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (true) {
            int i2 = i;
            if (!it8.hasNext()) {
                return d0.E0(arrayList, u.c(model));
            }
            Object next = it8.next();
            i = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            a0.x(d(str + "_nested_" + i2, (CreditCardCellModel) next), arrayList);
        }
    }

    public static CreditCardModelParcel e(CreditCardCellModel creditCardCellModel) {
        CreditCardDialogModel creditCardDialogModel = creditCardCellModel.d;
        List list = creditCardCellModel.f;
        if (list != null && !list.isEmpty()) {
            return new CreditCardModelParcel.CollapsingParcel(creditCardCellModel.f68828a);
        }
        if (creditCardDialogModel != null) {
            return new CreditCardModelParcel.DialogParcel(creditCardDialogModel);
        }
        return null;
    }
}
