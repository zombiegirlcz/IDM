package pd4;

import aw0.o9;
import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.UploadDocumentsScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.models.DocumentValidationResult;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.models.DocumentWithValidation;
import com.revolut.feature.credit.core.R$string;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import nii.y0;
import om4.t3;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ UploadDocumentsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(UploadDocumentsScreen uploadDocumentsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = uploadDocumentsScreen;
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
        k kVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d dVar = (com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d) kVarE3;
        dVar.getClass();
        y yVar = dVar.f67938y;
        Intrinsics.checkNotNullParameter(model, "model");
        if (a0.H(model.f53228a, "view-id-document", false)) {
            Object obj3 = model.u;
            Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj3;
            DocumentWithValidation documentWithValidation = (DocumentWithValidation) ((i) ((j2) yVar.f22677a).getValue()).e.get(str);
            Continuation continuation = null;
            DocumentValidationResult documentValidationResult = documentWithValidation != null ? documentWithValidation.f67950c : null;
            if ((documentValidationResult instanceof DocumentValidationResult.PasswordProtected) || (documentValidationResult instanceof DocumentValidationResult.Error) || (documentValidationResult instanceof DocumentValidationResult.Invalid)) {
                dVar.H2(yVar, new t3(str, 23));
                dVar.M2();
            } else if (documentValidationResult instanceof DocumentValidationResult.Validating) {
                int i = jli.h.f175850a;
            } else {
                int i2 = R$string.credit_manual_underwriting_upload_screen_delete_alert_title;
                String name = new File(str).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                yji.l.a1(dVar, dVar.X1(new y0(null, new nii.v(new TextLocalisedClause(i2, zhm.u.c(new TextClause(name, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(R$string.credit_manual_underwriting_upload_screen_delete_alert_description, null, null, 14), null, new TextLocalisedClause(R$string.credit_manual_underwriting_upload_screen_delete_alert_primary_button, null, null, 14), new TextLocalisedClause(R$string.credit_manual_underwriting_upload_screen_delete_alert_secondary_button, null, null, 14), null, null, null, true, null, 3776), false, 5)), null, null, new o4a.b(dVar, str, continuation, 11), 3);
            }
        }
        return Unit.f186387a;
    }
}
