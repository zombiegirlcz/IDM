package bi0;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends gim.c {
    public Bitmap u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f15360w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f15361x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f15360w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f15361x |= Integer.MIN_VALUE;
        return this.f15360w.c(null, this);
    }
}
