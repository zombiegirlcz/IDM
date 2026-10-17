package mth;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.kyc.api.R$string;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.DocumentSelectionControllerContract$InputData;
import com.revolut.shared.feature.workflow.engine.api.WorkflowEngineApi$Toggles$AlternativeDocuments;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.AlternativeDocumentGroups;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.ApplicableDocuments;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class r implements cli.n {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DocumentSelectionControllerContract$InputData f208841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final atb.b f208842b;

    public r(DocumentSelectionControllerContract$InputData inputData, atb.b workflowFeatureInteractor, kth.a documentGroupListItemMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(workflowFeatureInteractor, "workflowFeatureInteractor");
        Intrinsics.checkNotNullParameter(documentGroupListItemMapper, "documentGroupListItemMapper");
        this.f208841a = inputData;
        this.f208842b = workflowFeatureInteractor;
    }

    public static InputTextDelegate.Model a(wi0.b bVar, boolean z) {
        String str = bVar.f297794a;
        qd0.b.Companion.getClass();
        String lowerCase = str.toLowerCase(qd0.a.f244819b);
        InputTextDelegate.Model model = new InputTextDelegate.Model("CITIZENSHIP_DROP_DOWN_LIST_ID", new TextLocalisedClause(t61.a.p(lowerCase, "toLowerCase(...)", "nationality.", lowerCase), (List) null, (Clause) new CountryClause(bVar, null), false, 22), new TextLocalisedClause(R$string.kyc_select_document_simplified_citizenship, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, z, null, null, null, null, 0, 0, 0, 0, -8, 65471);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return yp0.r.a(model);
    }

    public static ListSubheaderDelegate.Model b() {
        return new ListSubheaderDelegate.Model("DOCUMENT_LIST_SUB_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.workflow.engine.R$string.workflow_document_selection_list_of_documents_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp24, 0, 0, 0, 61434);
    }

    public static boolean e(ApplicableDocuments applicableDocuments) {
        AlternativeDocumentGroups alternativeDocumentGroups;
        return (!applicableDocuments.f105573a.isEmpty() || (alternativeDocumentGroups = applicableDocuments.f105574b) == null || alternativeDocumentGroups.f105570a.isEmpty()) ? false : true;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        Clause clause;
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f208831b, new mqi.a(this, domainState), new mqg.a(17), new m88.c(this, domainState, 13));
        Data data = domainState.f208831b;
        boolean z = (data.getLoading() || domainState.f208832c == null) ? false : true;
        String str = this.f208841a.f96421a.f96392a.f96402c;
        if (str == null) {
            clause = null;
        } else {
            TextClause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            clause = (Clause) iii.c.f(data, new msb.c(7), new mnl.g(textClause, 16), new m88.c(this, textClause, 12));
        }
        return new n(clause, list, z);
    }

    public final Clause d(Clause clause) {
        return ((jte.d) this.f208842b.f9021a).c(WorkflowEngineApi$Toggles$AlternativeDocuments.f105372c) ? yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(com.revolut.feature.workflow.engine.R$string.workflow_document_selection_list_of_documents_no_methods_supported_description, null, null, 14), new TextLocalisedClause(com.revolut.feature.workflow.engine.R$string.workflow_document_selection_list_of_documents_action_learn_more, null, new Click(14, Integer.valueOf(R$attr.uikit_colorAccent), (Object) null, "LEARN_MORE_CLAUSE_ID", false), 10))) : clause;
    }
}
