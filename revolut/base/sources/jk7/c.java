package jk7;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.insurance.impl.R$string;
import com.revolut.feature.insurance.impl.ui.cfac.claim.supporting_documents.CFACInsuranceSupportingDocumentsScreen;
import com.revolut.feature_document_view.declaration.DocumentViewFeatureConfiguration;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.tm0;
import ip0.um0;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import jec.p;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import rp0.t;
import rp0.y;
import yhm.o;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CFACInsuranceSupportingDocumentsScreen f175112w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CFACInsuranceSupportingDocumentsScreen cFACInsuranceSupportingDocumentsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f175112w = cFACInsuranceSupportingDocumentsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f175112w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(this.f175112w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            default:
                c cVar3 = new c(this.f175112w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((c) create((File) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        CFACInsuranceSupportingDocumentsScreen cFACInsuranceSupportingDocumentsScreen = this.f175112w;
        switch (i) {
            case 0:
                um0 um0Var = (um0) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Object obj3 = um0Var.d;
                if (obj3 instanceof File) {
                    File document = (File) obj3;
                    k kVar = (k) cFACInsuranceSupportingDocumentsScreen.T2();
                    kVar.getClass();
                    Intrinsics.checkNotNullParameter(document, "document");
                    ArrayList documents = d0.f1(((g) kVar.t2()).f175114b);
                    documents.remove(document);
                    mj7.b bVar = kVar.f175122t;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(documents, "documents");
                    bVar.f205936a.f("CACHE_KEY_CLAIM_DOCUMENTS", documents);
                    kVar.x2(new jeg.i(1, documents));
                    j60.a.v(kVar.f175119q, false, null, 3);
                }
                break;
            case 1:
                File document2 = (File) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVarH3 = cFACInsuranceSupportingDocumentsScreen.T2();
                Intrinsics.h(document2);
                k kVar2 = (k) iVarH3;
                kVar2.getClass();
                Intrinsics.checkNotNullParameter(document2, "document");
                if (Intrinsics.f(lim.o.n(document2), "pdf")) {
                    kVar2.A1(new p(kVar2, document2, continuation, 12), new yi5.b(25));
                } else {
                    String path = document2.getPath();
                    Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
                    m70.a.c(t0.f186434a);
                    kVar2.C1(new BridgeDestination(new FeatureCommand(new DocumentViewFeatureConfiguration(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), path))));
                }
                break;
            default:
                File file = (File) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVarH32 = cFACInsuranceSupportingDocumentsScreen.T2();
                Intrinsics.h(file);
                k kVar3 = (k) iVarH32;
                kVar3.getClass();
                Intrinsics.checkNotNullParameter(file, "document");
                j60.a aVar4 = kVar3.f175119q;
                kVar3.f175121s.getClass();
                Intrinsics.checkNotNullParameter(file, "file");
                aVar4.x(new y(u.c(new um0("ID_HORIZONTAL_BUTTONS_ITEM", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R.string.common_action_cancel, null, null, 14), false, null, null, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_action_remove, null, null, 14), false, null, null, 56), (Object) file, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1008)), new t(new TextLocalisedClause(R$string.cfac_claim_supporting_documents_remove_document_title, null, null, 14), new TextLocalisedClause(R$string.cfac_claim_supporting_documents_remove_document_subtitle, null, null, 14), null, 28), rp0.l.WINDOW, null, null, null, 1016));
                break;
        }
        return Unit.f186387a;
    }
}
