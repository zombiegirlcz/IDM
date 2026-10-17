package l7a;

import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends b.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ParcelFileDescriptor f192544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ufm.a f192545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ File f192546c;

    public b(ParcelFileDescriptor parcelFileDescriptor, ufm.a aVar, File file) {
        this.f192544a = parcelFileDescriptor;
        this.f192545b = aVar;
        this.f192546c = file;
    }

    @Override // android.print.PrintDocumentAdapter.WriteResultCallback
    public final void onWriteCancelled() throws IOException {
        super.onWriteCancelled();
        this.f192544a.close();
        this.f192545b.a(new Exception("Writing the data cancelled"));
    }

    @Override // android.print.PrintDocumentAdapter.WriteResultCallback
    public final void onWriteFailed(CharSequence charSequence) throws IOException {
        super.onWriteFailed(charSequence);
        this.f192544a.closeWithError("An error occurred while writing the data");
        this.f192545b.a(new Exception("Writing the data failed"));
    }

    @Override // android.print.PrintDocumentAdapter.WriteResultCallback
    public final void onWriteFinished(PageRange[] pages) throws IOException {
        Intrinsics.checkNotNullParameter(pages, "pages");
        super.onWriteFinished(pages);
        this.f192544a.close();
        int length = pages.length;
        ufm.a aVar = this.f192545b;
        if (length == 0) {
            aVar.a(new Exception("Pages length not found"));
        } else {
            aVar.b(this.f192546c.getAbsolutePath());
        }
    }
}
