package androidx.compose.ui.platform;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"invertTo", "", "Landroidx/compose/ui/graphics/Matrix;", "other", "invertTo-JiSxe2E", "([F[F)Z", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class InvertMatrixKt {
    /* JADX INFO: renamed from: invertTo-JiSxe2E, reason: not valid java name */
    public static final boolean m2800invertToJiSxe2E(@NotNull float[] fArr, @NotNull float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[2];
        float f6 = fArr[3];
        float f32 = fArr[4];
        float f35 = fArr[5];
        float f36 = fArr[6];
        float f37 = fArr[7];
        float f41 = fArr[8];
        float f42 = fArr[9];
        float f57 = fArr[10];
        float f69 = fArr[11];
        float f75 = fArr[12];
        float f77 = fArr[13];
        float f81 = fArr[14];
        float f82 = fArr[15];
        float f93 = (f * f35) - (f4 * f32);
        float f94 = (f * f36) - (f5 * f32);
        float f99 = (f * f37) - (f6 * f32);
        float f100 = (f4 * f36) - (f5 * f35);
        float f101 = (f4 * f37) - (f6 * f35);
        float f102 = (f5 * f37) - (f6 * f36);
        float f103 = (f41 * f77) - (f42 * f75);
        float f104 = (f41 * f81) - (f57 * f75);
        float f105 = (f41 * f82) - (f69 * f75);
        float f106 = (f42 * f81) - (f57 * f77);
        float f107 = (f42 * f82) - (f69 * f77);
        float f108 = (f57 * f82) - (f69 * f81);
        float f109 = (f102 * f103) + (((f100 * f105) + ((f99 * f106) + ((f93 * f108) - (f94 * f107)))) - (f101 * f104));
        if (f109 != BitmapDescriptorFactory.HUE_RED) {
            float f110 = 1.0f / f109;
            fArr2[0] = a0.d.a(f37, f106, (f35 * f108) - (f36 * f107), f110);
            fArr2[1] = kii.e.a(f6, f106, (f5 * f107) + ((-f4) * f108), f110);
            fArr2[2] = a0.d.a(f82, f100, (f77 * f102) - (f81 * f101), f110);
            fArr2[3] = kii.e.a(f69, f100, (f57 * f101) + ((-f42) * f102), f110);
            float f111 = -f32;
            fArr2[4] = kii.e.a(f37, f104, (f36 * f105) + (f111 * f108), f110);
            fArr2[5] = a0.d.a(f6, f104, (f108 * f) - (f5 * f105), f110);
            float f112 = -f75;
            fArr2[6] = kii.e.a(f82, f94, (f81 * f99) + (f112 * f102), f110);
            fArr2[7] = a0.d.a(f69, f94, (f41 * f102) - (f57 * f99), f110);
            fArr2[8] = a0.d.a(f37, f103, (f32 * f107) - (f35 * f105), f110);
            fArr2[9] = kii.e.a(f6, f103, (f105 * f4) + ((-f) * f107), f110);
            fArr2[10] = a0.d.a(f82, f93, (f75 * f101) - (f77 * f99), f110);
            fArr2[11] = kii.e.a(f69, f93, (f99 * f42) + ((-f41) * f101), f110);
            fArr2[12] = kii.e.a(f36, f103, (f35 * f104) + (f111 * f106), f110);
            fArr2[13] = a0.d.a(f5, f103, (f * f106) - (f4 * f104), f110);
            fArr2[14] = kii.e.a(f81, f93, (f77 * f94) + (f112 * f100), f110);
            fArr2[15] = a0.d.a(f57, f93, (f41 * f100) - (f42 * f94), f110);
        }
        return !(f109 == BitmapDescriptorFactory.HUE_RED);
    }
}
