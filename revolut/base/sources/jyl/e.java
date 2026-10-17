package jyl;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends gim.c {
    public int u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Bitmap f179526w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f179527x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g f179528y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, gim.c cVar) {
        super(cVar);
        this.f179528y = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f179527x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f179528y.b(0, this);
    }
}
