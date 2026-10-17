package aw;

import androidx.camera.core.UseCaseGroup;

/* JADX INFO: loaded from: classes16.dex */
public final class o extends gim.c {
    public yw.b u;
    public UseCaseGroup.Builder v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f10193w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f10194x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ r f10195y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, gim.c cVar) {
        super(cVar);
        this.f10195y = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f10194x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f10195y.n(null, this);
    }
}
