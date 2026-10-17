package zq2;

import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends gim.c {
    public final /* synthetic */ uc.d A;
    public int B;
    public PdfRenderer u;
    public ParcelFileDescriptor v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Bitmap f324353w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f324354x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f324355y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(uc.d dVar, gim.c cVar) {
        super(cVar);
        this.A = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return uc.d.h(this.A, null, this);
    }
}
