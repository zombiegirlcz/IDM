package zzd;

import aw0.o9;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserNamePlaceholder;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.statements.R$string;
import com.revolut.feature.statements.api.StatementsApi$FeatureToggles;
import com.revolut.feature.statements.api.navigation.DocumentsHubProduct;
import com.revolut.feature.statements.api.navigation.DocumentsHubType;
import com.revolut.feature.statements.impl.ui.documents_hub.DocumentsHubScreenContract$InputData;
import com.revolut.tracking.v3.DocumentsHubContext;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class k0 implements cli.n {

    @NotNull
    public static final j0 Companion = new j0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Set f326682h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f326683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f326684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0e.t f326685c;
    public final c d;
    public final a e;
    public final gte.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DocumentsHubScreenContract$InputData f326686g;

    static {
        DocumentsHubType.Companion companion = DocumentsHubType.INSTANCE;
        companion.getClass();
        DocumentsHubType documentsHubType = new DocumentsHubType("account-statements");
        companion.getClass();
        DocumentsHubType[] elements = {documentsHubType, new DocumentsHubType("statement-of-fees")};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f326682h = kotlin.collections.d.y0(elements);
    }

    public k0(f01.c uiKitResources, e loadingStateMapper, l0 sectionsMapper, d footerMapper, a0e.t customFilterMapper, b emptyItemsMapper, a0e.y generatePayloadBuilder, c errorItemsMapper, a analyticsContextMapper, gte.a featureToggleInteractor, DocumentsHubScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(loadingStateMapper, "loadingStateMapper");
        Intrinsics.checkNotNullParameter(sectionsMapper, "sectionsMapper");
        Intrinsics.checkNotNullParameter(footerMapper, "footerMapper");
        Intrinsics.checkNotNullParameter(customFilterMapper, "customFilterMapper");
        Intrinsics.checkNotNullParameter(emptyItemsMapper, "emptyItemsMapper");
        Intrinsics.checkNotNullParameter(generatePayloadBuilder, "generatePayloadBuilder");
        Intrinsics.checkNotNullParameter(errorItemsMapper, "errorItemsMapper");
        Intrinsics.checkNotNullParameter(analyticsContextMapper, "analyticsContextMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f326683a = uiKitResources;
        this.f326684b = sectionsMapper;
        this.f326685c = customFilterMapper;
        this.d = errorItemsMapper;
        this.e = analyticsContextMapper;
        this.f = featureToggleInteractor;
        this.f326686g = inputData;
    }

    public static wxd.r d(q qVar) {
        boolean zEquals;
        wxd.s sVar = qVar.f326689b;
        Object obj2 = null;
        if (sVar == null) {
            return null;
        }
        Iterator it8 = sVar.f300884b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            String str = ((wxd.r) next).f300880a;
            String str2 = qVar.f326690c;
            if (str2 == null) {
                zEquals = false;
            } else {
                DocumentsHubProduct.Companion companion = DocumentsHubProduct.INSTANCE;
                zEquals = str.equals(str2);
            }
            if (zEquals) {
                obj2 = next;
                break;
            }
        }
        return (wxd.r) obj2;
    }

    public final RowDelegate.Model a(wxd.r rVar, q qVar, w0 w0Var) {
        Image imageJ;
        String strI;
        String str = rVar.f300880a;
        DocumentsHubProduct.INSTANCE.getClass();
        if (str.equals("PERSONAL_CURRENT")) {
            do3.n nVar = qVar.f;
            imageJ = new UserAvatarImage((nVar == null || (strI = te0.w.I(nVar)) == null) ? null : new UserNamePlaceholder.Default(strI, UserNamePlaceholder.PlaceholderSize.Default.f60052a), null, null, 6);
        } else {
            LayeredImage.Companion companion = LayeredImage.INSTANCE;
            String str2 = rVar.f300882c;
            int iIntValue = R$drawable.uikit_icn_24_document;
            int iA = this.f326683a.a(str2);
            Integer numValueOf = Integer.valueOf(iA);
            if (iA == 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            }
            imageJ = companion.j(iIntValue, new Color.Solid(R$attr.uikit_colorForeground), new Color.Solid(R$attr.uikit_colorActionBackgroundNeutral_40));
        }
        RowDelegate.Model model = new RowDelegate.Model("documents-hub:selected-product", new RowDelegate.Model.MainImage.Image40(imageJ, null, null, false, null, false, 62), new TextClause(rVar.f300881b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, ((jte.d) this.f).c(StatementsApi$FeatureToggles.DocumentsHub.f88209c) ? new pf(new TextLocalisedClause(R$string.documents_hub_product_selection_action_change, null, null, 14), null, null, false, null, null, 510) : null, false, null, false, null, null, null, null, null, null, new DocumentsHubProduct(str), new AnalyticsContext(w0Var), 0, 0, 0, 0, 524284920);
        yp0.b.l(model, R$attr.uikit_dp24, R$attr.uikit_dp8, 0, 0, null, false, 60);
        return model;
    }

    public final boolean b() {
        String str = this.f326686g.f88356a;
        DocumentsHubType.INSTANCE.getClass();
        if (Intrinsics.f(str, "root")) {
            return true;
        }
        return ((jte.d) this.f).c(StatementsApi$FeatureToggles.DocumentsHubMvp.f88210c);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        q domainState = (q) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        DocumentsHubContext.a aVarNewBuilder = DocumentsHubContext.newBuilder();
        String str = this.e.f326670a.f88356a;
        aVarNewBuilder.c();
        ((DocumentsHubContext) aVarNewBuilder.f49761b).setPath(str);
        String str2 = domainState.f326690c;
        if (str2 != null) {
            aVarNewBuilder.c();
            ((DocumentsHubContext) aVarNewBuilder.f49761b).setProduct(str2);
        }
        String str3 = domainState.d;
        if (str3 != null) {
            aVarNewBuilder.c();
            ((DocumentsHubContext) aVarNewBuilder.f49761b).setTab(str3);
        }
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        w0 w0VarA2 = AnalyticsContext.Companion.a(w0VarA);
        return (t) iii.c.f(domainState.f326688a, new yrk.e(this, 26, domainState, w0VarA2), new zaf.d(this, w0VarA2, 5), new soc.f(this, 24, domainState, w0VarA2));
    }
}
