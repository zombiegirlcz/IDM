package p00;

import android.graphics.Rect;
import com.revolut.camerakit.validators.config.FaceInFrameValidatorConfig;
import com.revolut.camerakit.validators.exceptions.CameraKitValidatorException;
import dx.l;
import dx.n;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import rz.u;
import xv.m;
import xv.p;

/* JADX INFO: loaded from: classes16.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FaceInFrameValidatorConfig f231393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f231394b;

    public a(FaceInFrameValidatorConfig config, l previewMetadata) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(previewMetadata, "previewMetadata");
        this.f231393a = config;
        this.f231394b = previewMetadata;
    }

    @Override // xv.p
    public final Object b(List list, Continuation continuation, xv.i iVar, m mVar) {
        Rect rectA;
        try {
            if (!(iVar instanceof dx.a)) {
                return new b(new CameraKitValidatorException("Missing face rect", null, 6), null);
            }
            Rect rectE = ((dx.a) iVar).f120490a.e();
            l lVar = this.f231394b;
            if (lVar instanceof dx.m) {
                u uVar = ((dx.m) lVar).a().f258438a;
                if (uVar == null) {
                    throw new CameraKitValidatorException("Preview should be initialised", null, 6);
                }
                rectA = uVar.a();
            } else {
                if (!(lVar instanceof n)) {
                    throw new NoWhenBranchMatchedException();
                }
                u f50856a = ((n) lVar).f120507a.getF50856a();
                if (f50856a == null) {
                    throw new CameraKitValidatorException("Preview should be initialised", null, 6);
                }
                rectA = f50856a.a();
            }
            float fWidth = rectE.left / rectA.width();
            float fWidth2 = 1.0f - (rectE.right / rectA.width());
            float fHeight = rectE.top / rectA.height();
            float fHeight2 = 1.0f - (rectE.bottom / rectA.height());
            float fWidth3 = (rectA.width() * rectA.height()) / (rectE.width() * rectE.height());
            FaceInFrameValidatorConfig faceInFrameValidatorConfig = this.f231393a;
            return fWidth3 < faceInFrameValidatorConfig.f ? new b(new CameraKitValidatorException("Face too close", null, 6), i.f231402a) : fWidth3 > faceInFrameValidatorConfig.e ? new b(new CameraKitValidatorException("Face too far", null, 6), j.f231403a) : fWidth < faceInFrameValidatorConfig.f50916b ? new b(new CameraKitValidatorException("Face violated left padding", null, 6), g.f231400a) : fWidth2 < faceInFrameValidatorConfig.f50917c ? new b(new CameraKitValidatorException("Face violated right padding", null, 6), f.f231399a) : fHeight < faceInFrameValidatorConfig.f50915a ? new b(new CameraKitValidatorException("Face violated top padding", null, 6), e.f231398a) : fHeight2 < faceInFrameValidatorConfig.d ? new b(new CameraKitValidatorException("Face violated bottom padding", null, 6), h.f231401a) : c.f231397a;
        } catch (Throwable th10) {
            return new b(new CameraKitValidatorException("Face in frame validation failed", th10, 4), null);
        }
    }
}
