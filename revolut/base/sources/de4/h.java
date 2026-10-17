package de4;

import aw0.n6;
import aw0.o9;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.confirmation.ConfirmationBottomSheetContract$InputData;
import com.revolut.feature.credit.core.R$string;
import dx4.a1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfirmationBottomSheetContract$InputData f113291a;

    public h(ConfirmationBottomSheetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f113291a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        RowDelegate.Model.MainImage.Image24 image24;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        wy3.b bVar = this.f113291a.f67996a;
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.credit_application_mortgage_offer_confirmation_popup_title, u.c(new TextClause(bVar.f301067a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(R$string.credit_application_mortgage_offer_confirmation_popup_description, u.c(new TextClause(bVar.f301068b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, null, false, 28);
        ArrayList<wy3.a> arrayList = bVar.f301069c;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (wy3.a aVar2 : arrayList) {
            String str = aVar2.f301064a;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_mortgage_offer_confirmation_popup_item_title, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_application_mortgage_offer_confirmation_popup_item_description, u.c(new TextClause(aVar2.f301065b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
            a1 a1Var = aVar2.f301066c;
            if (a1Var != null) {
                boolean z = false;
                image24 = new RowDelegate.Model.MainImage.Image24(a1Var.T1(), z, z, 6);
            } else {
                image24 = null;
            }
            arrayList2.add(new RowDelegate.Model(str, image24, textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        return new cii.b(new aw0.h(false, new n6(new TextLocalisedClause(R$string.credit_application_mortgage_offer_confirmation_popup_button_primary, u.c(new TextClause(bVar.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.credit_application_mortgage_offer_confirmation_popup_button_secondary, u.c(new TextClause(bVar.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), arrayList2, aVar);
    }
}
