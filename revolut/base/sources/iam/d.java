package iam;

import hx7.q;
import i26.l;
import io.fotoapparat.exception.camera.CameraException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import nd.k;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends u implements Function0 {
    public final /* synthetic */ e f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fbm.d f160063h;
    public final /* synthetic */ nam.b i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, fbm.d dVar, nam.b bVar) {
        super(0);
        this.f = eVar;
        this.f160063h = dVar;
        this.i = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Throwable {
        qam.b oldCameraDevice;
        e eVar = this.f;
        qam.e eVar2 = eVar.d;
        sam.e orientationSensor = (sam.e) eVar.e.getValue();
        c2m.b mainThreadErrorCallback = eVar.f160066c;
        Intrinsics.checkNotNullParameter(eVar2, "<this>");
        fbm.d newLensPosition = this.f160063h;
        Intrinsics.checkNotNullParameter(newLensPosition, "newLensPositionSelector");
        nam.b newConfiguration = this.i;
        Intrinsics.checkNotNullParameter(newConfiguration, "newConfiguration");
        Intrinsics.checkNotNullParameter(mainThreadErrorCallback, "mainThreadErrorCallback");
        Intrinsics.checkNotNullParameter(orientationSensor, "orientationSensor");
        try {
            oldCameraDevice = eVar2.c();
        } catch (IllegalStateException unused) {
            oldCameraDevice = null;
        }
        if (oldCameraDevice == null) {
            eVar2.getClass();
            Intrinsics.checkNotNullParameter(newLensPosition, "newLensPosition");
            eVar2.f244067a.getClass();
            k.k();
            eVar2.f244070g = newLensPosition;
            eVar2.d(newConfiguration);
        } else if (!Intrinsics.f(eVar2.f244070g, newLensPosition)) {
            Intrinsics.checkNotNullParameter(newLensPosition, "newLensPosition");
            eVar2.f244067a.getClass();
            k.k();
            eVar2.f244070g = newLensPosition;
            eVar2.d(newConfiguration);
            Intrinsics.checkNotNullParameter(eVar2, "<this>");
            Intrinsics.checkNotNullParameter(oldCameraDevice, "oldCameraDevice");
            Intrinsics.checkNotNullParameter(orientationSensor, "orientationSensor");
            Intrinsics.checkNotNullParameter(mainThreadErrorCallback, "mainThreadErrorCallback");
            l.t(eVar2, oldCameraDevice);
            try {
                q.X(eVar2, orientationSensor);
            } catch (CameraException e) {
                mainThreadErrorCallback.invoke(e);
            }
        }
        return Unit.f186387a;
    }
}
