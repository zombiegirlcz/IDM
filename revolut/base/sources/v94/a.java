package v94;

import com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.CreditPdfDocumentController;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f286971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreditPdfDocumentController f286972b;

    public /* synthetic */ a(CreditPdfDocumentController creditPdfDocumentController, int i) {
        this.f286971a = i;
        this.f286972b = creditPdfDocumentController;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f286971a;
        CreditPdfDocumentController creditPdfDocumentController = this.f286972b;
        switch (i) {
            case 0:
                jyl.a setup = (jyl.a) obj2;
                KProperty[] kPropertyArr = CreditPdfDocumentController.S;
                Intrinsics.checkNotNullParameter(setup, "$this$setup");
                setup.f179521c = false;
                setup.f179519a = false;
                setup.d = new a(creditPdfDocumentController, 1);
                break;
            default:
                Exception error = (Exception) obj2;
                KProperty[] kPropertyArr2 = CreditPdfDocumentController.S;
                Intrinsics.checkNotNullParameter(error, "error");
                com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.g gVar = (com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.g) creditPdfDocumentController.e3();
                gVar.getClass();
                Intrinsics.checkNotNullParameter(error, "error");
                gVar.H2(gVar.f67558t, new nd8.l(error, 14));
                break;
        }
        return Unit.f186387a;
    }
}
