package rre;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.html_viewer.api.declaration.HtmlDocumentDescriptor;
import com.revolut.feature.html_viewer.api.declaration.HtmlViewerDestination;
import com.revolut.feature.terms.api.model.Terms;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature_pdf_view.PdfViewFeatureConfiguration;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import rgf.m;
import ufm.i;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements mre.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pre.c f256827a;

    public d(pre.c termsInteractor) {
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        this.f256827a = termsInteractor;
    }

    public final FeatureCommand b(Terms terms) {
        Intrinsics.checkNotNullParameter(terms, "terms");
        String str = terms.f90357c;
        String str2 = terms.d;
        TextClause textClause = new TextClause(terms.f90359h, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        return str != null ? gc0.c.f(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new HtmlViewerDestination(new HtmlViewerDestination.InputData(new HtmlDocumentDescriptor.TermsWebDocumentDescriptor(str, true), textClause)), false, (Integer) null, 0, 57)) : str2 != null ? new FeatureCommand(new PdfViewFeatureConfiguration(str2, textClause, false, false, 60)) : gc0.c.f(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new HtmlViewerDestination(new HtmlViewerDestination.InputData(new HtmlDocumentDescriptor.TermsDocumentDescriptor(terms.f90355a), textClause)), false, (Integer) null, 0, 57));
    }

    public final i c(TermsScope termsScope, wi0.b bVar) {
        Intrinsics.checkNotNullParameter(termsScope, "termsScope");
        d0 d0VarF = this.f256827a.f(termsScope, bVar);
        rpi.d dVar = new rpi.d(new m(this, p.a.p("Cannot navigate to terms. Couldn't be retrieved terms of type: TermsScope(name=", termsScope.f90390a, ")"), 27), 11);
        d0VarF.getClass();
        i iVar = new i(d0VarF, dVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
