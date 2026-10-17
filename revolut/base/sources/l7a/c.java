package l7a;

import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import rd0.d;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends PrintDocumentAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PrintDocumentAdapter f192547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1k.a f192548b;

    public c(PrintDocumentAdapter delegate, h1k.a onFinishListener) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(onFinishListener, "onFinishListener");
        this.f192547a = delegate;
        this.f192548b = onFinishListener;
    }

    @Override // android.print.PrintDocumentAdapter
    public final void onFinish() {
        this.f192548b.invoke();
        this.f192547a.onFinish();
    }

    @Override // android.print.PrintDocumentAdapter
    public final void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
        if (cancellationSignal == null || !cancellationSignal.isCanceled()) {
            this.f192547a.onLayout(printAttributes, printAttributes2, cancellationSignal, layoutResultCallback, bundle);
        } else if (layoutResultCallback != null) {
            layoutResultCallback.onLayoutCancelled();
        }
    }

    @Override // android.print.PrintDocumentAdapter
    public final void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        if (cancellationSignal != null && cancellationSignal.isCanceled()) {
            if (writeResultCallback != null) {
                writeResultCallback.onWriteCancelled();
            }
        } else {
            try {
                this.f192547a.onWrite(pageRangeArr, parcelFileDescriptor, cancellationSignal, writeResultCallback);
            } catch (IllegalStateException e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                d.a(rd0.c.ERROR, null, null, e, h0Var);
            }
        }
    }
}
