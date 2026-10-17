package aw;

import androidx.camera.core.CameraSelector;

/* JADX INFO: loaded from: classes16.dex */
public final class e extends gim.c {
    public CameraSelector u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f10152w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10153x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, gim.c cVar) {
        super(cVar);
        this.f10152w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f10153x |= Integer.MIN_VALUE;
        return this.f10152w.p(null, this);
    }
}
