package f5l;

import android.app.ApplicationStartInfo;
import android.graphics.pdf.LoadParams;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class f {
    public static /* bridge */ /* synthetic */ ApplicationStartInfo e(Object obj2) {
        return (ApplicationStartInfo) obj2;
    }

    public static /* synthetic */ LoadParams.Builder f() {
        return new LoadParams.Builder();
    }

    public static /* synthetic */ PdfRenderer i(ParcelFileDescriptor parcelFileDescriptor, LoadParams loadParams) {
        return new PdfRenderer(parcelFileDescriptor, loadParams);
    }

    public static /* synthetic */ void r() {
    }
}
