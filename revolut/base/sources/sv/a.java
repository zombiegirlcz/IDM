package sv;

import com.revolut.camerakit.client.api.R$string;
import com.revolut.camerakit.client.api.models.CameraCaptureSettings;
import com.revolut.camerakit.client.api.models.CameraKitClientSettings;
import com.revolut.camerakit.client.api.models.HintMessage;
import com.revolut.camerakit.client.api.models.VideoDuration;
import com.revolut.camerakit.ui.models.R$style;
import dv.m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lv.c;
import nvf.d;
import rz.f;
import rz.h;
import rz.k;
import rz.q;
import tv.j;
import tv.l;
import vkm.j2;

/* JADX INFO: loaded from: classes16.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f265806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraKitClientSettings f265807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f265808c;

    public a(m cameraKitUiDelegate, CameraKitClientSettings cameraKitClientSettings, l hintMessageMapper) {
        Intrinsics.checkNotNullParameter(cameraKitUiDelegate, "cameraKitUiDelegate");
        Intrinsics.checkNotNullParameter(cameraKitClientSettings, "cameraKitClientSettings");
        Intrinsics.checkNotNullParameter(hintMessageMapper, "hintMessageMapper");
        this.f265806a = cameraKitUiDelegate;
        this.f265807b = cameraKitClientSettings;
        this.f265808c = hintMessageMapper;
    }

    public final boolean a() {
        CameraCaptureSettings cameraCaptureSettings = this.f265807b.f50706a;
        if (cameraCaptureSettings instanceof CameraCaptureSettings.Compound) {
            return ((CameraCaptureSettings.Compound) cameraCaptureSettings).f50695b.f50701a instanceof VideoDuration.Custom;
        }
        if (cameraCaptureSettings instanceof CameraCaptureSettings.Photo) {
            return false;
        }
        if (cameraCaptureSettings instanceof CameraCaptureSettings.Video) {
            return ((CameraCaptureSettings.Video) cameraCaptureSettings).f50701a instanceof VideoDuration.Custom;
        }
        if (Intrinsics.f(cameraCaptureSettings, CameraCaptureSettings.FaceEmbedding.f50696a) || Intrinsics.f(cameraCaptureSettings, CameraCaptureSettings.CompactSelfie.f50693a)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void b(boolean z) {
        q qVar = new q(z);
        c cVar = (c) this.f265806a;
        cVar.a(qVar);
        if (a()) {
            cVar.f200270a.setShutterButtonContentDescription(R$string.vision_shutter_button_record_video_accessibility_label);
        } else {
            cVar.f200270a.setShutterButtonContentDescription(R$string.vision_shutter_button_take_picture_accessibility_label);
        }
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void c(xv.l detectorResult) {
        f fVarB;
        f fVar;
        l lVar = this.f265808c;
        j2 j2Var = lVar.i;
        c cVar = (c) this.f265806a;
        boolean z = cVar.f200270a.f50862j.getVisibility() == 0;
        boolean zIsEnabled = cVar.f200270a.f50862j.isEnabled();
        Intrinsics.checkNotNullParameter(detectorResult, "detectorResult");
        HintMessage hintMessage = (HintMessage) j2Var.getValue();
        f fVar2 = null;
        if (hintMessage == null || (hintMessage instanceof HintMessage.Empty)) {
            fVarB = null;
        } else {
            if (((d) lVar.f274656h.getValue()) != null) {
                Intrinsics.checkNotNullParameter(detectorResult, "detectorResult");
                fVarB = new f(new k(new h(com.revolut.feature.transport.api.R$string.transport_ticket_activate_qr_scan_label), null), null, null, 12);
            } else {
                fVarB = null;
            }
            if (fVarB == null) {
                j jVarA = lVar.a(hintMessage);
                fVarB = lVar.b(jVarA != null ? jVarA.a(detectorResult, z, zIsEnabled) : null);
            }
        }
        cVar.f200270a.setHint(fVarB, rz.l.Default);
        HintMessage hintMessage2 = (HintMessage) j2Var.getValue();
        if ((hintMessage2 instanceof HintMessage.QrCode) || (hintMessage2 instanceof HintMessage.Face) || (hintMessage2 instanceof HintMessage.DocumentFront) || (hintMessage2 instanceof HintMessage.DocumentBack)) {
            fVar = new f(null, null, null, 12);
        } else if (hintMessage2 instanceof HintMessage.ActiveLiveness) {
            fVar = new f(new k(new h(R$string.selfie_active_liveness_hint_position_your_face), Integer.valueOf(R$style.CameraKit_TextAppearance_H5)), null, null, 12);
        } else {
            if (!(hintMessage2 instanceof HintMessage.DocumentFrontTilt)) {
                if (!(hintMessage2 instanceof HintMessage.Processing) && !(hintMessage2 instanceof HintMessage.Empty) && hintMessage2 != null) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar.f200270a.setHint(fVar2, rz.l.Footer);
            }
            fVar = new f(null, null, null, 12);
        }
        fVar2 = fVar;
        cVar.f200270a.setHint(fVar2, rz.l.Footer);
    }
}
