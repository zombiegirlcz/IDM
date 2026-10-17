package kyl;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends gim.c {
    public int A;
    public String u;
    public Bitmap v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public hlm.a f191018w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f191019x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f191020y;
    public final /* synthetic */ i z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, gim.c cVar) {
        super(cVar);
        this.z = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f191020y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.d(null, null, this);
    }
}
