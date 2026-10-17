package kog;

import aw0.o9;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.ResourceId;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.user_declarations.shared.flows.pep.models.PersonalDetails;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.PersonsListScreenConfiguration;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.PersonsListScreenContract$DomainState;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.PersonsListScreenContract$InputData;
import com.revolut.shared.feature.user_declarations.api.R$string;
import com.revolut.shared.feature.user_declarations.api.navigation.PepFlowControllerDescriptor$UseCase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements cli.n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PersonsListScreenContract$InputData f186363a;

    public n(PersonsListScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f186363a = inputData;
    }

    public static ListSubheaderDelegate.Model a(PersonsListScreenConfiguration personsListScreenConfiguration, boolean z) {
        return new ListSubheaderDelegate.Model("PEP_PERSONS_LIST_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(personsListScreenConfiguration.d, (List) null, (Style) null, (Clause) null, 30), (ResourceImage) null, false, false, (Clause) (z ? new TextLocalisedClause(R$string.pep_close_connection_home_content_header_add, null, null, 14) : new TextLocalisedClause(R$string.pep_close_connection_home_content_header_add_more, null, null, 14)), true, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 261946);
    }

    @Override // cli.n
    public final o c(cli.j jVar) throws IOException {
        PersonsListScreenConfiguration personsListScreenConfiguration;
        PersonsListScreenContract$DomainState domainState = (PersonsListScreenContract$DomainState) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        PepFlowControllerDescriptor$UseCase pepFlowControllerDescriptor$UseCase = this.f186363a.f94664a;
        Intrinsics.checkNotNullParameter(pepFlowControllerDescriptor$UseCase, "<this>");
        if (pepFlowControllerDescriptor$UseCase instanceof PepFlowControllerDescriptor$UseCase.CloseConnections) {
            personsListScreenConfiguration = new PersonsListScreenConfiguration(new ResourceId.IntResourceId(R$string.pep_close_connection_home_header_title), new ResourceId.IntResourceId(R$string.pep_close_connection_home_header_subtitle_text), new ResourceId.IntResourceId(R$string.pep_close_connection_home_header_subtitle_link), new ResourceId.IntResourceId(R$string.pep_close_connection_home_content_header_title), new ResourceId.IntResourceId(R$string.pep_close_connection_home_content_empty));
        } else {
            if (!(pepFlowControllerDescriptor$UseCase instanceof PepFlowControllerDescriptor$UseCase.BusinessAssociates)) {
                throw new NoWhenBranchMatchedException();
            }
            personsListScreenConfiguration = new PersonsListScreenConfiguration(new ResourceId.IntResourceId(R$string.pep_business_associates_home_header_title), new ResourceId.IntResourceId(R$string.pep_business_associates_home_header_subtitle_text), null, new ResourceId.IntResourceId(R$string.pep_business_associates_home_content_header_title), new ResourceId.IntResourceId(R$string.pep_business_associates_home_content_empty));
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(personsListScreenConfiguration.f94659a, (List) null, (Style) null, (Clause) null, 30);
        ResourceId resourceId = personsListScreenConfiguration.f94661c;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(personsListScreenConfiguration.f94660b, v.l(resourceId != null ? new TextLocalisedClause(resourceId, (List) null, new Click(14, Integer.valueOf(R$attr.uikit_colorAccent), (Object) null, "CLOSE_CONNECTIONS_DESCRIPTION_CLICK_ID", false), (Clause) null, 26) : null), (Style) null, (Clause) null, 28);
        Map map = domainState.f94663b;
        boolean z = !map.isEmpty();
        aim.e eVarB = u.b();
        if (map.isEmpty()) {
            eVarB.addAll(yp0.b.i(new FullScreenStateDelegate.Model("PEP_EMPTY_STATE_BANNER_ID", new TextLocalisedClause(personsListScreenConfiguration.e, (List) null, (Style) null, (Clause) null, 30), null, null, null, null, false, null, null, false, 0, 0, 32764), a(personsListScreenConfiguration, true), null, 0, 0, 126));
        } else {
            List listD1 = d0.d1(map.values());
            ArrayList arrayList = new ArrayList(w.t(listD1, 10));
            for (Iterator it8 = listD1.iterator(); it8.hasNext(); it8 = it8) {
                PersonalDetails personalDetails = (PersonalDetails) it8.next();
                String[] elements = {personalDetails.f94644c, personalDetails.d, personalDetails.e};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listL) {
                    if (!kotlin.text.d0.W((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                String strK0 = d0.k0(arrayList2, " ", null, null, 0, null, 62);
                arrayList.add(new RowDelegate.Model(personalDetails.f94642a, new RowDelegate.Model.MainImage.Image40(new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, strK0, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063), null, null, false, null, false, 62), new TextClause(strK0, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, new tf(new yy0.h(new TextLocalisedClause(R$string.pep_close_connection_home_content_accessibility_delete, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254))), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869880));
            }
            eVarB.addAll(yp0.b.g(arrayList, a(personsListScreenConfiguration, false), null, 0, 0, 126));
        }
        Unit unit = Unit.f186387a;
        return new j(u.a(eVarB), textLocalisedClause, textLocalisedClause2, z);
    }
}
