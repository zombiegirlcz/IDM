package pyl;

import android.graphics.pdf.PdfRenderer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PdfRenderer f240857a;

    public b(PdfRenderer pdfRenderer) {
        Intrinsics.checkNotNullParameter(pdfRenderer, "pdfRenderer");
        this.f240857a = pdfRenderer;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f240857a.close();
    }
}
