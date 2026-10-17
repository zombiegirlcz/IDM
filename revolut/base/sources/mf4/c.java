package mf4;

import aw0.o9;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.api.models.config.DocumentViewerScreenConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.common.viewer.CreditApplicationDocumentViewerScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.common.viewer.CreditApplicationDocumentViewerScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import com.revolut.feature.credit.core.R$string;
import com.revolut.tracking.v3.CreditApplicationCommonContext;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final rx3.b f204843l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final PluginFlowContract$Input f204844m;

    public c(rx3.b offerDocumentsInteractor, PluginFlowContract$Input inputData) {
        Intrinsics.checkNotNullParameter(offerDocumentsInteractor, "offerDocumentsInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f204843l = offerDocumentsInteractor;
        this.f204844m = inputData;
    }

    @Override // mf4.a
    public final CreditApplicationDocumentViewerScreen Z2(String documentId, su3.a document, DocumentViewerScreenConfig screenConfig, String str) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        int i = R$string.credit_application_offer_agreement_action_title;
        String str2 = document.e;
        if (str2 == null) {
            str2 = documentId;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, zhm.u.c(new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        v44.f fVar = new v44.f(document.f265635a, document.f265636b);
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        CreditApplicationCommonContext creditApplicationCommonContextN = t1.N(this.f204844m.getF67796a());
        companion.getClass();
        return new CreditApplicationDocumentViewerScreen(new CreditApplicationDocumentViewerScreenContract$InputData(textLocalisedClause, documentId, fVar, screenConfig, str, new AnalyticsContext(AnalyticsContext.Companion.a(creditApplicationCommonContextN)), null, null, 192));
    }

    @Override // mf4.a
    public final void b3(String url2, ma2.s onDocumentContentLoaded) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(onDocumentContentLoaded, "onDocumentContentLoaded");
        T2(new lr.l(this, onDocumentContentLoaded, url2, (Continuation) null, 18), new yi5.b(27));
    }
}
