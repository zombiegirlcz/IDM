package bi0;

import com.google.mlkit.vision.barcode.BarcodeScanner;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends gim.c {
    public BarcodeScanner u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f15353w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f15354x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, gim.c cVar) {
        super(cVar);
        this.f15353w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f15354x |= Integer.MIN_VALUE;
        return this.f15353w.a(this);
    }
}
