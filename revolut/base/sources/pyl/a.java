package pyl;

import android.graphics.pdf.PdfRenderer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PdfRenderer.Page f240854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f240855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f240856c;

    public a(PdfRenderer.Page page) {
        Intrinsics.checkNotNullParameter(page, "page");
        this.f240854a = page;
        page.getIndex();
        this.f240855b = page.getWidth();
        this.f240856c = page.getHeight();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f240854a.close();
    }
}
