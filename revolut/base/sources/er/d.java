package er;

import com.revolut.biometric_verification.api.models.BiometricVerificationVisionResource;
import com.revolut.biometric_verification.api.models.DocumentClassificationResource;
import com.revolut.biometric_verification.api.models.DocumentDetectionResource;
import com.revolut.biometric_verification.api.models.DocumentMrzResource;
import com.revolut.biometric_verification.api.models.DocumentQualityResource;
import com.revolut.biometric_verification.api.models.DocumentSegmentationResource;
import com.revolut.biometric_verification.api.models.FaceDetectionResource;
import com.revolut.biometric_verification.api.models.FaceQualityResource;
import jr.b1;
import jr.c1;
import jr.d1;
import jr.p0;
import jr.q0;
import jr.r0;
import jr.s0;
import jr.v0;
import jr.w0;
import jr.x0;
import jr.y0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes17.dex */
public abstract class d {
    public static String a(String str) {
        String strW0 = d0.w0('/', str, str);
        if (strW0.length() <= 0) {
            strW0 = null;
        }
        if (strW0 != null) {
            return strW0;
        }
        throw new IllegalStateException("Can't extract model filename");
    }

    public static final BiometricVerificationVisionResource b(d1 d1Var) {
        Intrinsics.checkNotNullParameter(d1Var, "<this>");
        if (d1Var instanceof w0) {
            w0 w0Var = (w0) d1Var;
            String str = w0Var.f177859a;
            String strW0 = d0.w0('/', str, str);
            String str2 = strW0.length() > 0 ? strW0 : null;
            if (str2 == null) {
                str2 = "computer_vision_document_fit_model.tflite";
            }
            return new DocumentSegmentationResource(str, str2, w0Var.f177860b, w0Var.f177861c);
        }
        if (d1Var instanceof r0) {
            return new DocumentMrzResource(((r0) d1Var).f177833a);
        }
        if (d1Var instanceof q0) {
            q0 q0Var = (q0) d1Var;
            return new DocumentDetectionResource(q0Var.f177827a, a(q0Var.f177827a), q0Var.f177828b, q0Var.f177829c, q0Var.d);
        }
        if (d1Var instanceof y0) {
            y0 y0Var = (y0) d1Var;
            String str3 = y0Var.f177872a;
            String strA = a(str3);
            String str4 = y0Var.f177873b;
            b1 b1Var = y0Var.f177874c;
            return new FaceQualityResource(str3, strA, str4, new FaceQualityResource.Thresholds(b1Var.f177764a, b1Var.f177765b, b1Var.f177766c, b1Var.d, b1Var.e, b1Var.f, b1Var.f177767g, b1Var.f177768h, b1Var.i, b1Var.f177769j, b1Var.k));
        }
        if (d1Var instanceof s0) {
            s0 s0Var = (s0) d1Var;
            String str5 = s0Var.f177839a;
            String strA2 = a(str5);
            String str6 = s0Var.f177840b;
            v0 v0Var = s0Var.f177841c;
            return new DocumentQualityResource(str5, strA2, str6, new DocumentQualityResource.Thresholds(v0Var.f177854a, v0Var.f177855b, v0Var.f177856c, v0Var.d));
        }
        if (d1Var instanceof p0) {
            p0 p0Var = (p0) d1Var;
            String str7 = p0Var.f177823a;
            return new DocumentClassificationResource(str7, a(str7), p0Var.f177824b);
        }
        if (d1Var instanceof x0) {
            x0 x0Var = (x0) d1Var;
            String str8 = x0Var.f177863a;
            return new FaceDetectionResource(str8, a(str8), x0Var.f177864b);
        }
        if (d1Var instanceof c1) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
