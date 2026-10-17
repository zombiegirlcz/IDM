package wj7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance.impl.R$string;
import com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.CFACInsuranceExpenseDetailsScreen;
import com.revolut.feature_document_view.declaration.DocumentViewFeatureConfiguration;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import ip0.u00;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import wgb.v;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CFACInsuranceExpenseDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CFACInsuranceExpenseDetailsScreen cFACInsuranceExpenseDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cFACInsuranceExpenseDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.e3();
        Intrinsics.h(model);
        com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.b bVar = (com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.b) mVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        Continuation continuation = null;
        if (obj3 instanceof File) {
            File file = (File) obj3;
            if (Intrinsics.f(lim.o.n(file), "pdf")) {
                bVar.A1(new v(bVar, file, continuation, 9), new yi5.b(25));
            } else {
                String path = file.getPath();
                Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
                m70.a.c(t0.f186434a);
                bVar.C1(new BridgeDestination(new FeatureCommand(new DocumentViewFeatureConfiguration(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), path))));
            }
        }
        if (Intrinsics.f(model.f53228a, "ID_ADD_DOCUMENT_ITEM")) {
            e60.a aVar2 = bVar.f75082p;
            e60.s sVar = (e60.s) aVar2;
            sVar.T(new e60.i(null, new TextLocalisedClause(R$string.cfac_claim_supporting_documents_upload_document_title, null, null, 14), new TextLocalisedClause(R$string.cfac_claim_supporting_documents_upload_document_subtitle, u.c(10), null, 12), true, com.revolut.feature.image_picker.R$string.photo_picker_sources_document, 0, zhm.v.k(t80.f.JPEG, t80.f.PNG, t80.f.PDF), null, false, u00.BACK, null, 15777));
        }
        return Unit.f186387a;
    }
}
