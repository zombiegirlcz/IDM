package vo0;

import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends gim.c {
    public BitmapDrawable u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f290832w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f290833x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f290834y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f290834y = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f290833x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f290834y.a(null, 0, 0, this);
    }
}
