package mx;

import com.revolut.camerakit.core.errors.CameraKitException;
import dx.o;
import gim.c;
import xv.m;

/* JADX INFO: loaded from: classes16.dex */
public final class a extends c {
    public m u;
    public CameraKitException v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public o f209553w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f209554x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b f209555y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f209555y = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f209554x = obj2;
        this.z |= Integer.MIN_VALUE;
        return b.d(this.f209555y, null, this);
    }
}
