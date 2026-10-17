package ith;

import android.os.Parcelable;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.workflow.engine.R$string;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.alternative_documents.AlternativeDocumentsControllerContract$InputData;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.AlternativeDocumentSection;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.DocumentGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements n {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AlternativeDocumentsControllerContract$InputData f168392a;

    public l(kth.a documentGroupListItemMapper, AlternativeDocumentsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(documentGroupListItemMapper, "documentGroupListItemMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f168392a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        List list = domainState.f168386b;
        DocumentGroup documentGroup = domainState.f168385a;
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            AlternativeDocumentSection alternativeDocumentSection = (AlternativeDocumentSection) obj2;
            eVarB.add(new ListSubheaderDelegate.Model(a0.d.n("ALTERNATIVE_SECTION_TITLE_", i), (Image) null, (Clause) new TextClause(alternativeDocumentSection.f105571a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp24, 0, 0, 0, 61434));
            ArrayList arrayListA = kth.a.a(documentGroup, alternativeDocumentSection.f105572b);
            yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
            eVarB.addAll(arrayListA);
            i = i2;
        }
        aim.e eVarA = u.a(eVarB);
        List listC = u.c(new RowDelegate.Model("FAQ_ROW_LIST_ITEM_ID", null, new TextLocalisedClause(R$string.workflow_alternative_documents_screen_unsure_which_document_button_placeholder, u.c(this.f168392a.f96413a.f96396c), null, 12), null, 0, null, null, null, 0, new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254))), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869882));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return new i(d0.E0(listC, eVarA), documentGroup != null);
    }
}
