package lt4;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardCellModel;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardDialogModel;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardModelTextStyle;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardSectionModel;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.core.ui.bottom_sheet.BottomSheet;
import com.revolut.feature.credit.core.ui.bottom_sheet.action.ActionsBottomSheetController;
import grl.k9;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class d {
    public static ActionsBottomSheetController a(CreditCardDialogModel dialog) {
        TextLocalisedClause textLocalisedClause;
        BottomSheet.ActionBlock.SingleAction singleAction;
        BottomSheet.Item.CellItem cellItem;
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_dialogue_title, u.c(new TextClause(dialog.f68841a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        String str = dialog.f68842b;
        TextLocalisedClause textLocalisedClause3 = str != null ? new TextLocalisedClause(R$string.credit_dialogue_description, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : null;
        String str2 = dialog.f68843c;
        if (str2 != null) {
            textLocalisedClause = textLocalisedClause2;
            singleAction = new BottomSheet.ActionBlock.SingleAction(new BottomSheet.ActionBlockItem(new TextLocalisedClause(R$string.credit_dialogue_action_primary, u.c(new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), BottomSheet.ActionStyle.Accent.f69824a), null);
        } else {
            textLocalisedClause = textLocalisedClause2;
            singleAction = null;
        }
        List list = dialog.d;
        int i = 10;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i2 = 0;
        for (Object obj2 : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            String strValueOf = String.valueOf(i2);
            List list2 = ((CreditCardSectionModel) obj2).f68858a;
            ArrayList arrayList2 = new ArrayList(w.t(list2, i));
            int i5 = 0;
            for (Object obj3 : list2) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    v.s();
                    throw null;
                }
                CreditCardCellModel creditCardCellModel = (CreditCardCellModel) obj3;
                String strK = com.google.android.gms.internal.mlkit_vision_face.a.k(i5, strValueOf, "_");
                CreditCardCellModel.Accessory accessory = creditCardCellModel.f68830c;
                CreditCardDialogModel creditCardDialogModel = creditCardCellModel.d;
                if (accessory instanceof CreditCardCellModel.Accessory.LabelsAccessory) {
                    TextClause textClause = new TextClause(creditCardCellModel.f68829b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    CreditCardCellModel.Accessory.LabelsAccessory labelsAccessory = (CreditCardCellModel.Accessory.LabelsAccessory) accessory;
                    TextClause textClause2 = new TextClause(labelsAccessory.f68838a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    String str3 = labelsAccessory.f68840c;
                    TextClause textClause3 = str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                    boolean z = creditCardDialogModel != null;
                    tl4.e eVar = labelsAccessory.f68839b.f68857b;
                    cellItem = new BottomSheet.Item.CellItem(strK, textClause, textClause2, textClause3, z, (eVar != null ? c.f199793a[eVar.ordinal()] : -1) == 1 ? com.revolut.feature.credit.core.ui.bottom_sheet.a.H3 : com.revolut.feature.credit.core.ui.bottom_sheet.a.CAPTION, 0, 64);
                } else if (accessory instanceof CreditCardCellModel.Accessory.ActionAccessory) {
                    cellItem = new BottomSheet.Item.CellItem(strK, new TextClause(creditCardCellModel.f68829b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(((CreditCardCellModel.Accessory.ActionAccessory) accessory).f68832a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, creditCardDialogModel != null, com.revolut.feature.credit.core.ui.bottom_sheet.a.CAPTION, 0, 64);
                } else {
                    if (!(accessory instanceof CreditCardCellModel.Accessory.IconWithLabelAccessory)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    TextClause textClause4 = new TextClause(creditCardCellModel.f68829b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    CreditCardCellModel.Accessory.IconWithLabelAccessory iconWithLabelAccessory = (CreditCardCellModel.Accessory.IconWithLabelAccessory) accessory;
                    TextClause textClause5 = new TextClause(iconWithLabelAccessory.f68835a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    boolean z3 = creditCardDialogModel != null;
                    CreditCardModelTextStyle creditCardModelTextStyle = iconWithLabelAccessory.f68837c;
                    tl4.e eVar2 = creditCardModelTextStyle != null ? creditCardModelTextStyle.f68857b : null;
                    cellItem = new BottomSheet.Item.CellItem(strK, textClause4, textClause5, null, z3, (eVar2 != null ? c.f199793a[eVar2.ordinal()] : -1) == 1 ? com.revolut.feature.credit.core.ui.bottom_sheet.a.H3 : com.revolut.feature.credit.core.ui.bottom_sheet.a.CAPTION, 0, 64);
                }
                arrayList2.add(cellItem);
                i5 = i6;
            }
            arrayList.add(new BottomSheet.ItemSection(arrayList2));
            i2 = i3;
            i = 10;
        }
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return BottomSheet.a(textLocalisedClause, textLocalisedClause3, null, arrayList, singleAction, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, 68);
    }
}
