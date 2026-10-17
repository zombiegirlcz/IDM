package m64;

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
import com.revolut.core.ui_kit.models.badge.RetailBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.application.plugins.api.models.co_borrower.consent.CoBorrower;
import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.initiator.request_consent.RequestConsentScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.a0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements n {

    @NotNull
    private static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RequestConsentScreenContract$InputData f203009a;

    public m(RequestConsentScreenContract$InputData inputData, q74.b creditNavigationIconMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditNavigationIconMapper, "creditNavigationIconMapper");
        this.f203009a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        String strQ;
        cli.k domainState = (cli.k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        RequestConsentScreenContract$InputData requestConsentScreenContract$InputData = this.f203009a;
        ResourceImage resourceImageA = q74.b.a(requestConsentScreenContract$InputData.f67227b);
        int i = R$string.co_borrower_consent_initiator_request_consent_title;
        iu3.g gVar = requestConsentScreenContract$InputData.f67228c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(new TextClause(gVar.f168471a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.co_borrower_consent_initiator_request_consent_button, u.c(new TextClause(gVar.f168473c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        aim.e eVarB = u.b();
        CoBorrower coBorrower = requestConsentScreenContract$InputData.d;
        boolean z = coBorrower instanceof CoBorrower.InternalPhone;
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(coBorrower.getF66325b(), (z || (coBorrower instanceof CoBorrower.InternalUsername)) ? RetailBadge.f58066a : null, null, false, null, false, 60);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.co_borrower_consent_initiator_request_consent_co_borrower_title, u.c(new TextClause(coBorrower.getF66324a(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        int i2 = R$string.co_borrower_consent_initiator_request_consent_co_borrower_description;
        if (z) {
            strQ = ((CoBorrower.InternalPhone) coBorrower).f66323c;
        } else if (coBorrower instanceof CoBorrower.ExternalPhone) {
            strQ = ((CoBorrower.ExternalPhone) coBorrower).f66320c;
        } else {
            if (!(coBorrower instanceof CoBorrower.InternalUsername)) {
                throw new NoWhenBranchMatchedException();
            }
            strQ = j6.a.q("@", ((CoBorrower.InternalUsername) coBorrower).f66326c);
        }
        RowDelegate.Model model = new RowDelegate.Model("id-co-borrower", image40, textLocalisedClause3, null, 0, new TextLocalisedClause(i2, u.c(new TextClause(strQ, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        ArrayList arrayList = gVar.f168472b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            iu3.f fVar = (iu3.f) it8.next();
            ArrayList arrayList3 = fVar.f168470b;
            ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
            int i3 = 0;
            for (Object obj2 : arrayList3) {
                int i5 = i3 + 1;
                if (i3 < 0) {
                    v.s();
                    throw null;
                }
                iu3.e eVar = (iu3.e) obj2;
                arrayList4.add(new RowDelegate.Model(j6.a.q("id-section-item-", eVar.f168467a), new RowDelegate.Model.MainImage.Image24(com.revolut.core.ui_kit_core.displayers.image.models.a.b(i5, Integer.valueOf(R$attr.uikit_colorBackground), Integer.valueOf(R$attr.uikit_colorForeground), null, 8), false, false, 6), new TextLocalisedClause(R$string.co_borrower_consent_initiator_request_consent_section_item_title, u.c(new TextClause(eVar.f168467a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, 0, new TextLocalisedClause(R$string.co_borrower_consent_initiator_request_consent_section_item_description, u.c(new TextClause(eVar.f168468b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
                i3 = i5;
                it8 = it8;
            }
            a0.x(yp0.b.g(arrayList4, new ListSubheaderDelegate.Model(j6.a.q("id-section-title-", fVar.f168469a), (Image) null, (Clause) new TextLocalisedClause(R$string.co_borrower_consent_initiator_request_consent_section_title, u.c(new TextClause(fVar.f168469a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126), arrayList2);
            it8 = it8;
        }
        eVarB.addAll(arrayList2);
        Unit unit = Unit.f186387a;
        return new g(resourceImageA, textLocalisedClause, textLocalisedClause2, u.a(eVarB));
    }
}
