package g9i;

import com.revolut.feature_pdf_view.ui.PdfViewContract$Source;
import efm.d0;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_pdf_view.ui.a f141880b;

    public /* synthetic */ c(com.revolut.feature_pdf_view.ui.a aVar, int i) {
        this.f141879a = i;
        this.f141880b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f141879a) {
            case 0:
                PdfViewContract$Source.Remote it8 = (PdfViewContract$Source.Remote) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f141880b.a(it8.f97458a);
            case 1:
                od0.i cachedFileOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(cachedFileOptional, "cachedFileOptional");
                boolean zD = cachedFileOptional.d();
                com.revolut.feature_pdf_view.ui.a aVar = this.f141880b;
                if (zD) {
                    return aVar.b((File) cachedFileOptional.c());
                }
                d0 d0VarFirstOrError = ((u) aVar.f97464b).y0().c(te0.s.f270018a).firstOrError();
                g48.k kVar = new g48.k(20, new c(aVar, 2));
                d0VarFirstOrError.getClass();
                return new ufm.i(d0VarFirstOrError, kVar, 0);
            default:
                PdfViewContract$Source source = (PdfViewContract$Source) obj2;
                Intrinsics.checkNotNullParameter(source, "source");
                boolean z = source instanceof PdfViewContract$Source.Local;
                com.revolut.feature_pdf_view.ui.a aVar2 = this.f141880b;
                if (z) {
                    return aVar2.b(((PdfViewContract$Source.Local) source).f97457a);
                }
                if (source instanceof PdfViewContract$Source.Remote) {
                    return aVar2.a(((PdfViewContract$Source.Remote) source).f97458a);
                }
                throw new NoWhenBranchMatchedException();
        }
    }
}
