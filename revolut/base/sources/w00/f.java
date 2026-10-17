package w00;

import android.graphics.Rect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.camerakit.validators.config.ObjectPositionValidatorConfig;
import com.revolut.camerakit.validators.exceptions.CameraKitValidatorException;
import dx.l;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rz.u;
import xv.i;
import xv.m;
import xv.p;

/* JADX INFO: loaded from: classes16.dex */
public final class f implements p {

    @NotNull
    private static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ObjectPositionValidatorConfig f293601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f293602b;

    public f(ObjectPositionValidatorConfig config, l previewMetadata) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(previewMetadata, "previewMetadata");
        this.f293601a = config;
        this.f293602b = previewMetadata;
    }

    @Override // xv.p
    public final Object b(List list, Continuation continuation, i iVar, m mVar) {
        l lVar = this.f293602b;
        dx.m mVar2 = lVar instanceof dx.m ? (dx.m) lVar : null;
        if (mVar2 == null) {
            return new b(null, new CameraKitValidatorException("Unsupported instance of previewMetadata: " + lVar, null, 6));
        }
        u uVar = mVar2.a().f258439b;
        if (uVar == null) {
            return new b(null, new CameraKitValidatorException("Mask should be initialised", null, 6));
        }
        Rect rectA = uVar.a();
        if (!(iVar instanceof dx.a)) {
            return new b(null, new CameraKitValidatorException("Missing object rect", null, 6));
        }
        Rect anotherRect = ((dx.a) iVar).f120490a.e();
        int i = rectA.bottom;
        Rect rect = new Rect(rectA.left, i - ((int) (((double) (i - rectA.top)) * 0.9d)), rectA.right, rectA.bottom);
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Intrinsics.checkNotNullParameter(anotherRect, "anotherRect");
        int iMax = Math.max(rect.left, anotherRect.left);
        int iMax2 = Math.max(rect.top, anotherRect.top);
        int iMin = Math.min(rect.right, anotherRect.right);
        int iMin2 = Math.min(rect.bottom, anotherRect.bottom);
        int i2 = (iMin <= iMax || iMin2 <= iMax2) ? 0 : (iMin2 - iMax2) * (iMin - iMax);
        int iHeight = ((anotherRect.height() * anotherRect.width()) + (rect.height() * rect.width())) - i2;
        if ((iHeight > 0 ? i2 / iHeight : BitmapDescriptorFactory.HUE_RED) > this.f293601a.f50933a) {
            return new c(new g(anotherRect, rect, a.MATCH_MASK));
        }
        int i3 = anotherRect.left;
        int i5 = rect.left;
        return (i3 >= i5 || anotherRect.right <= rect.right || anotherRect.top >= rect.top || anotherRect.bottom <= rect.bottom) ? (i3 <= i5 || anotherRect.right >= rect.right || anotherRect.top <= rect.top || anotherRect.bottom >= rect.bottom) ? new b(new g(anotherRect, rect, a.NOT_MATCH_MASK), new CameraKitValidatorException("Object not match the mask", null, 6)) : new b(new g(anotherRect, rect, a.TOO_FAR), new CameraKitValidatorException("Object is too far away", null, 6)) : new b(new g(anotherRect, rect, a.TOO_CLOSE), new CameraKitValidatorException("Object is too close", null, 6));
    }
}
