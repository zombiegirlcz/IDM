package jv;

import com.revolut.camerakit.core.errors.CameraInitException;
import com.revolut.camerakit.core.errors.CameraKitException;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes16.dex */
public final class p implements xv.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraInitException f178714a = new CameraInitException("Object detection not initialised yet", null, r0.g());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f178715b = f0.f322471a;

    @Override // xv.l
    public final Iterable a() {
        return this.f178715b;
    }

    @Override // xv.l
    public final xv.n b() {
        return null;
    }

    @Override // xv.j
    public final CameraKitException getError() {
        return this.f178714a;
    }
}
