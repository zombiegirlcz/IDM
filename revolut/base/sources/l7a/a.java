package l7a;

import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrintDocumentAdapter f192541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParcelFileDescriptor f192542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f192543c;

    public a(PrintDocumentAdapter printDocumentAdapter, ParcelFileDescriptor parcelFileDescriptor, b bVar) {
        this.f192541a = printDocumentAdapter;
        this.f192542b = parcelFileDescriptor;
        this.f192543c = bVar;
    }

    @Override // android.print.PrintDocumentAdapter.LayoutResultCallback
    public final void onLayoutFinished(PrintDocumentInfo info, boolean z) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.f192541a.onWrite(new PageRange[]{PageRange.ALL_PAGES}, this.f192542b, new CancellationSignal(), this.f192543c);
    }
}
