package g9i;

import com.revolut.core.model.FileExtension;
import com.revolut.data.model.Data;
import com.revolut.feature_pdf_view.ui.PdfViewContract$Source;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import te0.w;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_pdf_view.ui.b f141895b;

    public /* synthetic */ r(com.revolut.feature_pdf_view.ui.b bVar, int i) {
        this.f141894a = i;
        this.f141895b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f141894a) {
            case 0:
                com.revolut.feature_pdf_view.ui.b bVar = this.f141895b;
                n nVar = bVar.f97467c;
                od0.i optionalCachedFile = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optionalCachedFile, "optionalCachedFile");
                File file = (File) optionalCachedFile.f224257a;
                if (file != null) {
                    return zi0.c.j(file);
                }
                te0.e eVarY0 = ((u) nVar).y0();
                te0.s sVar = te0.s.f270018a;
                return w.l(eVarY0.c(sVar), ((u) nVar).z0().c(sVar)).flatMap(new g48.k(25, new r(bVar, 4)));
            case 1:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                com.revolut.feature_pdf_view.ui.b bVar2 = this.f141895b;
                ufm.c cVar = new ufm.c(new a31.l(bVar2, 28), 2);
                Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                efm.r rVarDoOnNext = new sfm.b(cVar, new g48.k(23, new r(bVar2, 0)), 2).doOnNext(new g48.k(24, new r(bVar2, 3)));
                Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
                return rVarDoOnNext;
            case 2:
                Data data = (Data) obj2;
                te0.r rVar = ((u) this.f141895b.f97467c).k;
                Intrinsics.h(data);
                rVar.set(data);
                return Unit.f186387a;
            case 3:
                n nVar2 = this.f141895b.f97467c;
                File file2 = (File) ((Data) obj2).getContent();
                if (file2 != null) {
                    ((u) nVar2).x0().set(file2);
                    u uVar = (u) nVar2;
                    if (uVar.x0().isInitialized()) {
                        te0.j jVar = uVar.f;
                        KProperty[] kPropertyArr = u.f141900l;
                        if (((Boolean) jVar.getValue(uVar, kPropertyArr[4]).get()).booleanValue()) {
                            uVar.e.getValue(uVar, kPropertyArr[3]).set(Boolean.TRUE);
                        }
                    }
                }
                return Unit.f186387a;
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                PdfViewContract$Source pdfViewContract$Source = (PdfViewContract$Source) pair.f186385a;
                boolean zBooleanValue = ((Boolean) pair.f186386b).booleanValue();
                if (!(pdfViewContract$Source instanceof PdfViewContract$Source.Remote)) {
                    if (pdfViewContract$Source instanceof PdfViewContract$Source.Local) {
                        return zi0.c.j(((PdfViewContract$Source.Local) pdfViewContract$Source).f97457a);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                ufm.i iVar = new ufm.i(this.f141895b.f97466b.b(((PdfViewContract$Source.Remote) pdfViewContract$Source).f97458a, zBooleanValue, FileExtension.Pdf.f51406b), new g48.k(26, new g64.c(15)), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                efm.r rVarStartWith = ue0.e.I(iVar, h0.f322473a, new g64.c(16)).x().startWith(new Data(null, null, true, 3, null));
                Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
                return rVarStartWith;
        }
    }
}
