package kc0;

import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Lifecycle;
import com.revolut.core.backend_flow.photo.R$id;
import com.revolut.core.backend_flow.photo.R$layout;
import com.revolut.core.backend_flow.photo.selfserve.selfie.common.selfiewithcard.selfiecamera.NumberCoverDrawable;
import com.revolut.core.backend_flow.photo.selfserve.selfie.common.selfiewithcard.selfiecamera.SelfieCameraContract$Configuration;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import io.fotoapparat.view.CameraView;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import yhm.j;

/* JADX INFO: loaded from: classes19.dex */
public abstract class c extends BaseDelegatesActivity {
    public static final /* synthetic */ int z0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Object f182640r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Lazy f182641s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Object f182642t0 = w.y0(new ka9.b(2));
    public final Object u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Object f182643v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Object f182644w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Object f182645x0;
    public final Object y0;

    public c() {
        final int i = 0;
        this.f182640r0 = w.y0(new Function0(this) { // from class: kc0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f182639b;

            {
                this.f182639b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                c cVar = this.f182639b;
                switch (i2) {
                    case 0:
                        int i3 = c.z0;
                        return ((SelfieCameraContract$Configuration) cVar.G0()).e;
                    case 1:
                        Object value = cVar.u0.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        cVar.c1();
                        throw null;
                    case 2:
                        int i5 = c.z0;
                        return (CameraView) cVar.findViewById(R$id.cameraView);
                    case 3:
                        int i6 = c.z0;
                        return (FrameLayout) cVar.findViewById(R$id.finderGroup);
                    case 4:
                        int i21 = c.z0;
                        return (ImageView) cVar.findViewById(R$id.previewView);
                    case 5:
                        int i22 = c.z0;
                        return (Button) cVar.findViewById(R$id.takePhotoButton);
                    default:
                        int i32 = c.z0;
                        return new NumberCoverDrawable(kli.a.k(cVar, 3.0f));
                }
            }
        });
        final int i2 = 1;
        this.f182641s0 = j.b(new Function0(this) { // from class: kc0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f182639b;

            {
                this.f182639b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                c cVar = this.f182639b;
                switch (i22) {
                    case 0:
                        int i3 = c.z0;
                        return ((SelfieCameraContract$Configuration) cVar.G0()).e;
                    case 1:
                        Object value = cVar.u0.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        cVar.c1();
                        throw null;
                    case 2:
                        int i5 = c.z0;
                        return (CameraView) cVar.findViewById(R$id.cameraView);
                    case 3:
                        int i6 = c.z0;
                        return (FrameLayout) cVar.findViewById(R$id.finderGroup);
                    case 4:
                        int i21 = c.z0;
                        return (ImageView) cVar.findViewById(R$id.previewView);
                    case 5:
                        int i222 = c.z0;
                        return (Button) cVar.findViewById(R$id.takePhotoButton);
                    default:
                        int i32 = c.z0;
                        return new NumberCoverDrawable(kli.a.k(cVar, 3.0f));
                }
            }
        });
        final int i3 = 2;
        this.u0 = w.y0(new Function0(this) { // from class: kc0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f182639b;

            {
                this.f182639b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                c cVar = this.f182639b;
                switch (i22) {
                    case 0:
                        int i32 = c.z0;
                        return ((SelfieCameraContract$Configuration) cVar.G0()).e;
                    case 1:
                        Object value = cVar.u0.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        cVar.c1();
                        throw null;
                    case 2:
                        int i5 = c.z0;
                        return (CameraView) cVar.findViewById(R$id.cameraView);
                    case 3:
                        int i6 = c.z0;
                        return (FrameLayout) cVar.findViewById(R$id.finderGroup);
                    case 4:
                        int i21 = c.z0;
                        return (ImageView) cVar.findViewById(R$id.previewView);
                    case 5:
                        int i222 = c.z0;
                        return (Button) cVar.findViewById(R$id.takePhotoButton);
                    default:
                        int i322 = c.z0;
                        return new NumberCoverDrawable(kli.a.k(cVar, 3.0f));
                }
            }
        });
        final int i5 = 3;
        this.f182643v0 = w.y0(new Function0(this) { // from class: kc0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f182639b;

            {
                this.f182639b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                c cVar = this.f182639b;
                switch (i22) {
                    case 0:
                        int i32 = c.z0;
                        return ((SelfieCameraContract$Configuration) cVar.G0()).e;
                    case 1:
                        Object value = cVar.u0.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        cVar.c1();
                        throw null;
                    case 2:
                        int i59 = c.z0;
                        return (CameraView) cVar.findViewById(R$id.cameraView);
                    case 3:
                        int i6 = c.z0;
                        return (FrameLayout) cVar.findViewById(R$id.finderGroup);
                    case 4:
                        int i21 = c.z0;
                        return (ImageView) cVar.findViewById(R$id.previewView);
                    case 5:
                        int i222 = c.z0;
                        return (Button) cVar.findViewById(R$id.takePhotoButton);
                    default:
                        int i322 = c.z0;
                        return new NumberCoverDrawable(kli.a.k(cVar, 3.0f));
                }
            }
        });
        final int i6 = 4;
        this.f182644w0 = w.y0(new Function0(this) { // from class: kc0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f182639b;

            {
                this.f182639b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                c cVar = this.f182639b;
                switch (i22) {
                    case 0:
                        int i32 = c.z0;
                        return ((SelfieCameraContract$Configuration) cVar.G0()).e;
                    case 1:
                        Object value = cVar.u0.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        cVar.c1();
                        throw null;
                    case 2:
                        int i59 = c.z0;
                        return (CameraView) cVar.findViewById(R$id.cameraView);
                    case 3:
                        int i66 = c.z0;
                        return (FrameLayout) cVar.findViewById(R$id.finderGroup);
                    case 4:
                        int i21 = c.z0;
                        return (ImageView) cVar.findViewById(R$id.previewView);
                    case 5:
                        int i222 = c.z0;
                        return (Button) cVar.findViewById(R$id.takePhotoButton);
                    default:
                        int i322 = c.z0;
                        return new NumberCoverDrawable(kli.a.k(cVar, 3.0f));
                }
            }
        });
        final int i21 = 5;
        this.f182645x0 = w.y0(new Function0(this) { // from class: kc0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f182639b;

            {
                this.f182639b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                c cVar = this.f182639b;
                switch (i22) {
                    case 0:
                        int i32 = c.z0;
                        return ((SelfieCameraContract$Configuration) cVar.G0()).e;
                    case 1:
                        Object value = cVar.u0.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        cVar.c1();
                        throw null;
                    case 2:
                        int i59 = c.z0;
                        return (CameraView) cVar.findViewById(R$id.cameraView);
                    case 3:
                        int i66 = c.z0;
                        return (FrameLayout) cVar.findViewById(R$id.finderGroup);
                    case 4:
                        int i212 = c.z0;
                        return (ImageView) cVar.findViewById(R$id.previewView);
                    case 5:
                        int i222 = c.z0;
                        return (Button) cVar.findViewById(R$id.takePhotoButton);
                    default:
                        int i322 = c.z0;
                        return new NumberCoverDrawable(kli.a.k(cVar, 3.0f));
                }
            }
        });
        final int i22 = 6;
        this.y0 = w.y0(new Function0(this) { // from class: kc0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f182639b;

            {
                this.f182639b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i222 = i22;
                c cVar = this.f182639b;
                switch (i222) {
                    case 0:
                        int i32 = c.z0;
                        return ((SelfieCameraContract$Configuration) cVar.G0()).e;
                    case 1:
                        Object value = cVar.u0.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        cVar.c1();
                        throw null;
                    case 2:
                        int i59 = c.z0;
                        return (CameraView) cVar.findViewById(R$id.cameraView);
                    case 3:
                        int i66 = c.z0;
                        return (FrameLayout) cVar.findViewById(R$id.finderGroup);
                    case 4:
                        int i212 = c.z0;
                        return (ImageView) cVar.findViewById(R$id.previewView);
                    case 5:
                        int i2222 = c.z0;
                        return (Button) cVar.findViewById(R$id.takePhotoButton);
                    default:
                        int i322 = c.z0;
                        return new NumberCoverDrawable(kli.a.k(cVar, 3.0f));
                }
            }
        });
        new LargeActionButtonDelegate();
        new ListCellDelegate();
    }

    @Override // nri.b
    public final pri.e F0() {
        Z0().e();
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF85962s0() {
        return (String) this.f182640r0.getValue();
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        return Z0();
    }

    public abstract sc0.a Z0();

    public abstract opi.b b1();

    public abstract void c1();

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            setContentView(R$layout.activity_cnp_selfie_camera);
            b1();
            throw null;
        }
        c1();
        throw null;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (i == 1 && getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED)) {
            if (grantResults.length == 0 || grantResults[0] != 0) {
                if (this.f218652a0 != null) {
                    throw new ClassCastException();
                }
            } else {
                ((iam.e) this.f182641s0.getValue()).a();
                if (this.f218652a0 != null) {
                    throw new ClassCastException();
                }
            }
        }
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        if (ContextCompat.checkSelfPermission(this, "android.permission.CAMERA") != 0) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.CAMERA"}, 1);
            return;
        }
        ((iam.e) this.f182641s0.getValue()).a();
        if (this.f218652a0 != null) {
            throw new ClassCastException();
        }
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        ((iam.e) this.f182641s0.getValue()).b();
        super.onStop();
    }
}
