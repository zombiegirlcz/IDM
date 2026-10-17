package di0;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends gim.c {
    public Bitmap u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f114867w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f114868x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, gim.c cVar) {
        super(cVar);
        this.f114867w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f114868x |= Integer.MIN_VALUE;
        return this.f114867w.b(null, this);
    }
}
