package hw3;

import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;

/* JADX INFO: loaded from: classes22.dex */
public final class e0 extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ f0 B;
    public int C;
    public PdfRenderer u;
    public StringBuilder v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public PdfRenderer.Page f156062w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Bitmap f156063x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f156064y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, gim.c cVar) {
        super(cVar);
        this.B = f0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return f0.a(this.B, null, this);
    }
}
