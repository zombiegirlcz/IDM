package aw;

import androidx.camera.core.CameraSelector;
import androidx.camera.core.UseCaseGroup;

/* JADX INFO: loaded from: classes16.dex */
public final class d extends gim.c {
    public int A;
    public yw.b u;
    public CameraSelector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public UseCaseGroup.Builder f10146w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f10147x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f10148y;
    public final /* synthetic */ k z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k kVar, gim.c cVar) {
        super(cVar);
        this.z = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f10148y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.o(null, this);
    }
}
