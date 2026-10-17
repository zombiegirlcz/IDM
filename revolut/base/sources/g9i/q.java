package g9i;

import com.revolut.core_ui_custom_font.TypefaceTextView;
import com.revolut.feature_pdf_view.ui.PdfViewFragment;
import com.revolut.ui_kit_pdf.PdfView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PdfViewFragment f141892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f141893c;

    public /* synthetic */ q(PdfViewFragment pdfViewFragment, boolean z, int i) {
        this.f141891a = i;
        this.f141892b = pdfViewFragment;
        this.f141893c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f141891a;
        int i2 = 1;
        boolean z = this.f141893c;
        PdfViewFragment pdfViewFragment = this.f141892b;
        switch (i) {
            case 0:
                jyl.a setup = (jyl.a) obj2;
                KProperty[] kPropertyArr = PdfViewFragment.f97459h0;
                Intrinsics.checkNotNullParameter(setup, "$this$setup");
                setup.d = new q(pdfViewFragment, z, i2);
                break;
            default:
                Exception it8 = (Exception) obj2;
                KProperty[] kPropertyArr2 = PdfViewFragment.f97459h0;
                Intrinsics.checkNotNullParameter(it8, "it");
                w01.k.a(pdfViewFragment.E());
                j90.c cVar = pdfViewFragment.f97462e0;
                KProperty[] kPropertyArr3 = PdfViewFragment.f97459h0;
                w01.k.a((PdfView) cVar.getValue(pdfViewFragment, kPropertyArr3[3]));
                w01.k.d(pdfViewFragment.G());
                w01.k.e((TypefaceTextView) pdfViewFragment.c0.getValue(pdfViewFragment, kPropertyArr3[1]), z);
                break;
        }
        return Unit.f186387a;
    }
}
