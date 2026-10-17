package kyl;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends gim.c {
    public String u;
    public Bitmap v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f191009w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ fl1.c f191010x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f191011y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(fl1.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f191010x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f191009w = obj2;
        this.f191011y |= Integer.MIN_VALUE;
        return this.f191010x.b(null, null, this);
    }
}
