package pd4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.UploadDocumentsScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.a;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.models.DocumentValidationResult;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.models.DocumentWithValidation;
import com.revolut.feature.credit.core.R$string;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.l0;
import nii.y0;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ UploadDocumentsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(UploadDocumentsScreen uploadDocumentsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = uploadDocumentsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            default:
                return new e(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        UploadDocumentsScreen uploadDocumentsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d) uploadDocumentsScreen.R2()).C2(a.C0473a.f67927a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d dVar = (com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d) uploadDocumentsScreen.R2();
                Collection collectionValues = ((i) ((j2) dVar.f67938y.f22677a).getValue()).e.values();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : collectionValues) {
                    if (((DocumentWithValidation) obj3).f67950c instanceof DocumentValidationResult.Invalid) {
                        arrayList.add(obj3);
                    }
                }
                if (arrayList.isEmpty()) {
                    dVar.N2();
                } else {
                    yji.l.a1(dVar, dVar.X1(new y0(null, new l0(new TextLocalisedClause(R$string.credit_manual_underwriting_issues_popup_title, null, null, 14), new TextLocalisedClause(R$string.credit_manual_underwriting_issues_popup_description, null, null, 14), null, new TextLocalisedClause(R$string.credit_manual_underwriting_issues_popup_primary_button, null, null, 14), new TextLocalisedClause(R$string.credit_manual_underwriting_issues_popup_secondary_button, null, null, 14), null, true, null, 932), false, 5)), null, null, new o4a.b(dVar, new File(((DocumentWithValidation) d0.b0(arrayList)).f67948a), null, 12), 3);
                }
                break;
        }
        return Unit.f186387a;
    }
}
