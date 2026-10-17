package jt7;

import android.os.Parcelable;
import aw0.m6;
import aw0.n6;
import aw0.t0;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.insurance_credit.impl.data.model.action.Button;
import com.revolut.feature.insurance_credit.impl.data.model.action.ShowConfirmationAction;
import com.revolut.feature.insurance_credit.impl.ui.screen.cancellation_confirmation.CancellationConfirmationScreenContract$InputData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l9.l;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements n {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellationConfirmationScreenContract$InputData f178425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f01.c f178426b;

    public k(CancellationConfirmationScreenContract$InputData inputData, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f178425a = inputData;
        this.f178426b = uiKitResources;
    }

    public static n6 a(Button button, int i) {
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton;
        m6 m6Var = n6.Companion;
        TextLocalisedClause textLocalisedClauseS = l.s(i, button.f75752a);
        ps7.a aVar = button.f75753b;
        int i2 = aVar == null ? -1 : j.f178424a[aVar.ordinal()];
        if (i2 == -1) {
            defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        } else if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        } else {
            defaultFilledButton = LargeActionButton.ButtonStyle.f58726b;
        }
        return m6.c(m6Var, textLocalisedClauseS, defaultFilledButton, null, null, false, null, null, null, 1020);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        RandomAccess randomAccess;
        Collection collectionG;
        cli.k state = (cli.k) jVar;
        Intrinsics.checkNotNullParameter(state, "state");
        ShowConfirmationAction.ConfirmationScreenContent confirmationScreenContent = this.f178425a.f75820a;
        String str = confirmationScreenContent.f75773a;
        TextLocalisedClause textLocalisedClauseS = str != null ? l.s(R$string.credit_loan_insurance_withdrawal_confirmation_title, str) : null;
        String str2 = confirmationScreenContent.f75774b;
        TextLocalisedClause textLocalisedClauseS2 = str2 != null ? l.s(R$string.credit_loan_insurance_withdrawal_confirmation_subtitle, str2) : null;
        Button button = confirmationScreenContent.e;
        Button button2 = confirmationScreenContent.f;
        aw0.i eVar = (button == null || button2 == null) ? button != null ? new aw0.e(false, null, null, a(button, R$string.credit_loan_insurance_withdrawal_confirmation_primary_button), null, null, 55) : null : new aw0.h(false, a(button, R$string.credit_loan_insurance_withdrawal_confirmation_primary_button), a(button2, R$string.credit_loan_insurance_withdrawal_confirmation_secondary_button), null, null, null, 121);
        aim.e eVarB = u.b();
        List list = confirmationScreenContent.f75775c;
        if (list == null) {
            list = f0.f322471a;
        }
        if (list.isEmpty()) {
            randomAccess = f0.f322471a;
        } else {
            List list2 = list;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            int i = 0;
            for (Object obj2 : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                ShowConfirmationAction.InfoItem infoItem = (ShowConfirmationAction.InfoItem) obj2;
                String strN = a0.d.n("INFO_ITEM_", i);
                t0 t0Var = new t0((Clause) l.s(R$string.credit_loan_insurance_withdrawal_confirmation_info_item_title, infoItem.f75781a), (Image) null, 0, false, 30);
                int i3 = R$string.credit_loan_insurance_withdrawal_confirmation_info_item_value;
                String str3 = infoItem.f75782b;
                if (str3 == null) {
                    str3 = "";
                }
                arrayList.add(new CellDetailsDelegate.Model(strN, t0Var, l.s(i3, str3), null, null, null, null, 0, null, false, false, null, null, 32760));
                i = i2;
            }
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
            randomAccess = arrayList;
        }
        eVarB.addAll((Collection) randomAccess);
        ShowConfirmationAction.Details details = confirmationScreenContent.d;
        if (details == null) {
            collectionG = f0.f322471a;
        } else {
            List list3 = details.f75780b;
            if (list3 == null) {
                list3 = f0.f322471a;
            }
            if (list3.isEmpty()) {
                collectionG = f0.f322471a;
            } else {
                List list4 = list3;
                ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                int i5 = 0;
                for (Object obj3 : list4) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        v.s();
                        throw null;
                    }
                    ShowConfirmationAction.DetailItem detailItem = (ShowConfirmationAction.DetailItem) obj3;
                    String strN2 = a0.d.n("DETAIL_ITEM_", i5);
                    String str4 = detailItem.f75776a;
                    RowDelegate.Model.MainImage.Image24 image24A = str4 != null ? zt7.c.a(this.f178426b, str4, null) : null;
                    TextLocalisedClause textLocalisedClauseS3 = l.s(R$string.credit_loan_insurance_withdrawal_confirmation_details_item_title, detailItem.f75777b);
                    String str5 = detailItem.f75778c;
                    arrayList2.add(new RowDelegate.Model(strN2, image24A, textLocalisedClauseS3, null, 0, str5 != null ? l.s(R$string.credit_loan_insurance_withdrawal_confirmation_details_item_subtitle, str5) : null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
                    i5 = i6;
                }
                String str6 = details.f75779a;
                collectionG = yp0.b.g(arrayList2, new ListSubheaderDelegate.Model("DETAILS_HEADER", (Image) null, (Clause) (str6 != null ? l.s(R$string.credit_loan_insurance_withdrawal_confirmation_details_header, str6) : null), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
            }
        }
        eVarB.addAll(collectionG);
        Unit unit = Unit.f186387a;
        return new g(textLocalisedClauseS, textLocalisedClauseS2, eVar, u.a(eVarB));
    }
}
