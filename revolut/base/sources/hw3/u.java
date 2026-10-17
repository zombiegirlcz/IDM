package hw3;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes22.dex */
public final class u extends gim.c {
    public Bitmap u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w f156087w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f156088x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(w wVar, gim.c cVar) {
        super(cVar);
        this.f156087w = wVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f156088x |= Integer.MIN_VALUE;
        return this.f156087w.a(null, this);
    }
}
