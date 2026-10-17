package qam;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.Surface;
import io.fotoapparat.exception.camera.CameraException;
import ip0.jp;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nd.k;
import skm.e0;
import skm.r;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f244056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lam.a f244057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f244058c;
    public final oam.a d;
    public uvl.c e;
    public Surface f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Camera f244059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Camera.Parameters f244060h;
    public jp i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public jp f244061j;
    public jp k;

    public b(k logger, lam.a characteristics) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(characteristics, "characteristics");
        this.f244056a = logger;
        this.f244057b = characteristics;
        this.f244058c = e0.b();
        this.d = new oam.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object d(qam.b r7, vam.a r8, gim.c r9) {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qam.b.d(qam.b, vam.a, gim.c):java.lang.Object");
    }

    public final void a(sam.f orientationState) {
        Intrinsics.checkNotNullParameter(orientationState, "orientationState");
        this.f244056a.getClass();
        k.k();
        jp deviceOrientation = orientationState.f261464a;
        jp screenOrientation = orientationState.f261465b;
        int i = screenOrientation.f164899a;
        lam.a aVar = this.f244057b;
        jp cameraOrientation = aVar.f193470c;
        boolean z = aVar.d;
        Intrinsics.checkNotNullParameter(deviceOrientation, "deviceOrientation");
        Intrinsics.checkNotNullParameter(cameraOrientation, "cameraOrientation");
        int i2 = deviceOrientation.f164899a;
        int i3 = cameraOrientation.f164899a;
        this.f244061j = xam.a.D(360 - (z ? ((i3 - i2) + 360) % 360 : (i3 + i2) % 360));
        Intrinsics.checkNotNullParameter(screenOrientation, "screenOrientation");
        Intrinsics.checkNotNullParameter(cameraOrientation, "cameraOrientation");
        int i5 = cameraOrientation.f164899a;
        this.i = xam.a.D(z ? (360 - ((i5 + i) % 360)) % 360 : ((i5 - i) + 360) % 360);
        Intrinsics.checkNotNullParameter(screenOrientation, "screenOrientation");
        Intrinsics.checkNotNullParameter(cameraOrientation, "cameraOrientation");
        this.k = xam.a.D(((((z ? -1 : 1) * i) + 720) - cameraOrientation.f164899a) % 360);
        StringBuilder sb6 = new StringBuilder("Orientations: ");
        String str = gbm.b.f142275a;
        sb6.append(str);
        sb6.append("Screen orientation (preview) is: ");
        sb6.append(screenOrientation);
        sb6.append(". ");
        sb6.append(str);
        sb6.append("Camera sensor orientation is always at: ");
        sb6.append(cameraOrientation);
        sb6.append(". ");
        sb6.append(str);
        sb6.append("Camera is ");
        sb6.append(z ? "mirrored." : "not mirrored.");
        k.h(sb6.toString());
        StringBuilder sb9 = new StringBuilder("Orientation adjustments: ");
        sb9.append(str);
        sb9.append("Image orientation will be adjusted by: ");
        jp jpVar = this.f244061j;
        if (jpVar == null) {
            Intrinsics.r("imageOrientation");
            throw null;
        }
        sb9.append(jpVar.f164899a);
        sb9.append(" degrees. ");
        sb9.append(str);
        sb9.append("Display orientation will be adjusted by: ");
        jp jpVar2 = this.i;
        if (jpVar2 == null) {
            Intrinsics.r("displayOrientation");
            throw null;
        }
        sb9.append(jpVar2.f164899a);
        sb9.append(" degrees. ");
        sb9.append(str);
        sb9.append("Preview orientation will be adjusted by: ");
        jp jpVar3 = this.k;
        if (jpVar3 == null) {
            Intrinsics.r("previewOrientation");
            throw null;
        }
        sb9.append(jpVar3.f164899a);
        sb9.append(" degrees.");
        k.h(sb9.toString());
        uvl.c cVar = this.e;
        if (cVar == null) {
            Intrinsics.r("previewStream");
            throw null;
        }
        jp jpVar4 = this.k;
        if (jpVar4 == null) {
            Intrinsics.r("previewOrientation");
            throw null;
        }
        Intrinsics.checkNotNullParameter(jpVar4, "<set-?>");
        cVar.d = jpVar4;
        Camera camera = this.f244059g;
        if (camera == null) {
            Intrinsics.r("camera");
            throw null;
        }
        jp jpVar5 = this.i;
        if (jpVar5 != null) {
            camera.setDisplayOrientation(jpVar5.f164899a);
        } else {
            Intrinsics.r("displayOrientation");
            throw null;
        }
    }

    public final void b(hbm.d preview) {
        Intrinsics.checkNotNullParameter(preview, "preview");
        this.f244056a.getClass();
        k.k();
        Camera camera = this.f244059g;
        if (camera == null) {
            Intrinsics.r("camera");
            throw null;
        }
        if (!(preview instanceof hbm.c)) {
            throw new NoWhenBranchMatchedException();
        }
        SurfaceTexture surfaceTexture = ((hbm.c) preview).f150760a;
        camera.setPreviewTexture(surfaceTexture);
        this.f = new Surface(surfaceTexture);
    }

    public final void c() {
        this.f244056a.getClass();
        k.k();
        try {
            Camera camera = this.f244059g;
            if (camera != null) {
                camera.startPreview();
            } else {
                Intrinsics.r("camera");
                throw null;
            }
        } catch (RuntimeException e) {
            StringBuilder sb6 = new StringBuilder("Failed to start preview for camera with lens position: ");
            lam.a aVar = this.f244057b;
            sb6.append(aVar.f193469b);
            sb6.append(" and id: ");
            sb6.append(aVar.f193468a);
            throw new CameraException(e, sb6.toString());
        }
    }
}
