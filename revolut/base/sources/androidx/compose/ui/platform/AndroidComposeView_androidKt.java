package androidx.compose.ui.platform;

import android.content.res.Configuration;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.contentcapture.ContentCaptureSessionWrapper;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import androidx.compose.ui.text.input.PlatformTextInputService;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001b\u0010\u0005\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\f\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\u0014\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0017\u001a\u00020\u0016*\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0019*\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001b\u0010\u001d\u001a\u00020\u0016*\u00020\u001c2\u0006\u0010\u0001\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\".\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006'"}, d2 = {"Landroidx/compose/ui/graphics/Matrix;", "other", "", "preTransform-JiSxe2E", "([F[F)V", "preTransform", "", "x", "y", "tmpMatrix", "preTranslate-cG2Xzmc", "([FFF[F)V", "preTranslate", "m1", "", "row", "m2", "column", "dot-p89u6pk", "([FI[FI)F", "dot", "Landroid/view/View;", "", "containsDescendant", "(Landroid/view/View;Landroid/view/View;)Z", "Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", "getContentCaptureSessionCompat", "(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", "Landroid/content/res/Configuration;", "diffForWindowMetricsChanged", "(Landroid/content/res/Configuration;Landroid/content/res/Configuration;)Z", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "platformTextInputServiceInterceptor", "Lkotlin/jvm/functions/Function1;", "getPlatformTextInputServiceInterceptor", "()Lkotlin/jvm/functions/Function1;", "setPlatformTextInputServiceInterceptor", "(Lkotlin/jvm/functions/Function1;)V", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class AndroidComposeView_androidKt {

    @NotNull
    private static Function1<? super PlatformTextInputService, ? extends PlatformTextInputService> platformTextInputServiceInterceptor = AndroidComposeView_androidKt$platformTextInputServiceInterceptor$1.INSTANCE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean containsDescendant(View view, View view2) {
        if (Intrinsics.f(view2, view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean diffForWindowMetricsChanged(Configuration configuration, Configuration configuration2) {
        return (configuration.diff(configuration2) & (-1342235264)) != 0;
    }

    /* JADX INFO: renamed from: dot-p89u6pk, reason: not valid java name */
    private static final float m2775dotp89u6pk(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3] * fArr2[i2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentCaptureSessionWrapper getContentCaptureSessionCompat(View view) {
        ViewCompatShims.setImportantForContentCapture(view, 1);
        return ViewCompatShims.getContentCaptureSession(view);
    }

    @NotNull
    public static final Function1<PlatformTextInputService, PlatformTextInputService> getPlatformTextInputServiceInterceptor() {
        return platformTextInputServiceInterceptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: preTransform-JiSxe2E, reason: not valid java name */
    public static final void m2776preTransformJiSxe2E(float[] fArr, float[] fArr2) {
        float fM2775dotp89u6pk = m2775dotp89u6pk(fArr2, 0, fArr, 0);
        float fM2775dotp89u6pk2 = m2775dotp89u6pk(fArr2, 0, fArr, 1);
        float fM2775dotp89u6pk3 = m2775dotp89u6pk(fArr2, 0, fArr, 2);
        float fM2775dotp89u6pk4 = m2775dotp89u6pk(fArr2, 0, fArr, 3);
        float fM2775dotp89u6pk5 = m2775dotp89u6pk(fArr2, 1, fArr, 0);
        float fM2775dotp89u6pk6 = m2775dotp89u6pk(fArr2, 1, fArr, 1);
        float fM2775dotp89u6pk7 = m2775dotp89u6pk(fArr2, 1, fArr, 2);
        float fM2775dotp89u6pk8 = m2775dotp89u6pk(fArr2, 1, fArr, 3);
        float fM2775dotp89u6pk9 = m2775dotp89u6pk(fArr2, 2, fArr, 0);
        float fM2775dotp89u6pk10 = m2775dotp89u6pk(fArr2, 2, fArr, 1);
        float fM2775dotp89u6pk11 = m2775dotp89u6pk(fArr2, 2, fArr, 2);
        float fM2775dotp89u6pk12 = m2775dotp89u6pk(fArr2, 2, fArr, 3);
        float fM2775dotp89u6pk13 = m2775dotp89u6pk(fArr2, 3, fArr, 0);
        float fM2775dotp89u6pk14 = m2775dotp89u6pk(fArr2, 3, fArr, 1);
        float fM2775dotp89u6pk15 = m2775dotp89u6pk(fArr2, 3, fArr, 2);
        float fM2775dotp89u6pk16 = m2775dotp89u6pk(fArr2, 3, fArr, 3);
        fArr[0] = fM2775dotp89u6pk;
        fArr[1] = fM2775dotp89u6pk2;
        fArr[2] = fM2775dotp89u6pk3;
        fArr[3] = fM2775dotp89u6pk4;
        fArr[4] = fM2775dotp89u6pk5;
        fArr[5] = fM2775dotp89u6pk6;
        fArr[6] = fM2775dotp89u6pk7;
        fArr[7] = fM2775dotp89u6pk8;
        fArr[8] = fM2775dotp89u6pk9;
        fArr[9] = fM2775dotp89u6pk10;
        fArr[10] = fM2775dotp89u6pk11;
        fArr[11] = fM2775dotp89u6pk12;
        fArr[12] = fM2775dotp89u6pk13;
        fArr[13] = fM2775dotp89u6pk14;
        fArr[14] = fM2775dotp89u6pk15;
        fArr[15] = fM2775dotp89u6pk16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: preTranslate-cG2Xzmc, reason: not valid java name */
    public static final void m2777preTranslatecG2Xzmc(float[] fArr, float f, float f4, float[] fArr2) {
        Matrix.m2058resetimpl(fArr2);
        Matrix.m2067translateimpl$default(fArr2, f, f4, BitmapDescriptorFactory.HUE_RED, 4, null);
        m2776preTransformJiSxe2E(fArr, fArr2);
    }
}
