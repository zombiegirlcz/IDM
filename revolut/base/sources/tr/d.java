package tr;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import rz.u;
import zhm.v;

/* JADX INFO: loaded from: classes17.dex */
public final class d {
    public static List a(rz.a cameraKitViewMetadata, int i, int i2) {
        Intrinsics.checkNotNullParameter(cameraKitViewMetadata, "cameraKitViewMetadata");
        u uVar = cameraKitViewMetadata.f258438a;
        if (uVar == null) {
            return null;
        }
        int i3 = uVar.d;
        int i5 = uVar.f258459c;
        if (cameraKitViewMetadata.f258439b == null) {
            return null;
        }
        float f = i5;
        float f4 = i;
        float f5 = i3;
        float f6 = i2;
        float fMax = Math.max(f / f4, f5 / f6);
        float f32 = f4 * fMax;
        float f35 = f6 * fMax;
        float f36 = 2;
        return v.k(v.k(Float.valueOf((r4.f258457a + ((f32 - f) / f36)) / f32), Float.valueOf((r4.f258458b + ((f35 - f5) / f36)) / f35)), v.k(Float.valueOf(r4.f258459c / f32), Float.valueOf(r4.d / f35)));
    }
}
