package iog;

import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.ResourceId;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.user_declarations.shared.flows.pep.models.PersonalDetails;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.pep_form.PepFormScreenConfiguration;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.pep_form.PepFormScreenContract$InputData;
import com.revolut.shared.feature.user_declarations.api.R$string;
import com.revolut.shared.feature.user_declarations.api.navigation.PepFlowControllerDescriptor$UseCase;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import yp0.r;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements cli.n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PepFormScreenConfiguration f163326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PepFlowControllerDescriptor$UseCase f163327b;

    public n(PepFormScreenContract$InputData inputData) {
        PepFormScreenConfiguration pepFormScreenConfiguration;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        PepFlowControllerDescriptor$UseCase pepFlowControllerDescriptor$UseCase = inputData.f94652b;
        Intrinsics.checkNotNullParameter(pepFlowControllerDescriptor$UseCase, "<this>");
        if (pepFlowControllerDescriptor$UseCase instanceof PepFlowControllerDescriptor$UseCase.CloseConnections) {
            pepFormScreenConfiguration = new PepFormScreenConfiguration(new ResourceId.IntResourceId(R$string.pep_close_connection_personal_details_header_title), new ResourceId.IntResourceId(R$string.pep_close_connection_personal_details_header_subtitle_text), new ResourceId.IntResourceId(R$string.pep_close_connection_personal_details_header_subtitle_link));
        } else {
            if (!(pepFlowControllerDescriptor$UseCase instanceof PepFlowControllerDescriptor$UseCase.BusinessAssociates)) {
                throw new NoWhenBranchMatchedException();
            }
            pepFormScreenConfiguration = new PepFormScreenConfiguration(new ResourceId.IntResourceId(R$string.pep_business_associates_personal_details_header_title), new ResourceId.IntResourceId(R$string.pep_business_associates_personal_details_header_subtitle_text), null);
        }
        this.f163326a = pepFormScreenConfiguration;
        this.f163327b = inputData.f94652b;
    }

    public static koi.j a(String str, TextLocalisedClause textLocalisedClause, Clause clause, boolean z, boolean z3) {
        InputTextDelegate.Model model = new InputTextDelegate.Model(str, clause, textLocalisedClause, null, false, null, false, z ? new TextLocalisedClause(R$string.pep_close_connection_personal_details_content_optional, null, null, 14) : null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, true, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -536871048, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        if (z3) {
            model = r.a(model);
        }
        InputTextDelegate.Model model2 = model;
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        return model2;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        ResourceId resourceIdA;
        ResourceId resourceIdA2;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        PepFormScreenConfiguration pepFormScreenConfiguration = this.f163326a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(pepFormScreenConfiguration.f94648a, (List) null, (Style) null, (Clause) null, 30);
        ResourceId resourceId = pepFormScreenConfiguration.f94649b;
        ResourceId resourceId2 = pepFormScreenConfiguration.f94650c;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(resourceId, v.l(resourceId2 != null ? new TextLocalisedClause(resourceId2, (List) null, new Click(14, Integer.valueOf(R$attr.uikit_colorAccent), (Object) null, "PEP_CONNECTION_HELP_CLICK_ID", false), (Clause) null, 26) : null), (Style) null, (Clause) null, 28);
        PersonalDetails personalDetails = domainState.f163318a;
        String str = personalDetails.f94645g;
        gog.a aVar = personalDetails.f;
        gog.b bVar = personalDetails.f94643b;
        boolean z = (d0.W(personalDetails.f94644c) || d0.W(personalDetails.d)) ? false : true;
        boolean z3 = this.f163327b instanceof PepFlowControllerDescriptor$UseCase.CloseConnections;
        boolean z4 = z && (!z3 || (bVar != null && aVar != null && str != null && (d0.W(str) ^ true)));
        aim.e eVarB = u.b();
        if (z3) {
            eVarB.add(a("RELATIONSHIP_FIELD_ID", new TextLocalisedClause(R$string.pep_close_connection_personal_details_content_relationship, null, null, 14), (bVar == null || (resourceIdA2 = bVar.a()) == null) ? null : new TextLocalisedClause(resourceIdA2, (List) null, (Style) null, (Clause) null, 30), false, true));
        }
        eVarB.add(a("FIRST_NAME_FIELD_ID", new TextLocalisedClause(R$string.pep_close_connection_personal_details_content_first_name, null, null, 14), new TextClause(personalDetails.f94644c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, false));
        eVarB.add(a("FIRST_SURNAME_FIELD_ID", new TextLocalisedClause(R$string.pep_close_connection_personal_details_content_first_surname, null, null, 14), new TextClause(personalDetails.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, false));
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.pep_close_connection_personal_details_content_second_surname, null, null, 14);
        String str2 = personalDetails.e;
        eVarB.add(a("SECOND_SURNAME_FIELD_ID", textLocalisedClause3, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, true, false));
        if (z3) {
            eVarB.add(a("DOCUMENT_TYPE_FIELD_ID", new TextLocalisedClause(R$string.pep_close_connection_personal_details_content_id_type, null, null, 14), (aVar == null || (resourceIdA = aVar.a()) == null) ? null : new TextLocalisedClause(resourceIdA, (List) null, (Style) null, (Clause) null, 30), false, true));
            eVarB.add(a("DOCUMENT_NUMBER_FIELD_ID", new TextLocalisedClause(R$string.pep_close_connection_personal_details_content_id_passport_number, null, null, 14), str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, false, false));
        }
        Unit unit = Unit.f186387a;
        return new i(u.a(eVarB), textLocalisedClause, textLocalisedClause2, z4);
    }
}
