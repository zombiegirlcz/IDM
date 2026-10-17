package androidx.compose.ui.graphics;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"setFrom", "", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "Landroid/graphics/Matrix;", "setFrom-tU-YjHk", "([FLandroid/graphics/Matrix;)V", "setFrom-EL8BTi8", "(Landroid/graphics/Matrix;[F)V", "ui-graphics"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class AndroidMatrixConversions_androidKt {
    /* JADX INFO: renamed from: setFrom-EL8BTi8, reason: not valid java name */
    public static final void m1893setFromEL8BTi8(@NotNull android.graphics.Matrix matrix, @NotNull float[] fArr) {
        float f = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[2];
        float f6 = fArr[3];
        float f32 = fArr[4];
        float f35 = fArr[5];
        float f36 = fArr[6];
        float f37 = fArr[7];
        float f41 = fArr[8];
        float f42 = fArr[12];
        float f57 = fArr[13];
        float f69 = fArr[15];
        fArr[0] = f;
        fArr[1] = f32;
        fArr[2] = f42;
        fArr[3] = f4;
        fArr[4] = f35;
        fArr[5] = f57;
        fArr[6] = f6;
        fArr[7] = f37;
        fArr[8] = f69;
        matrix.setValues(fArr);
        fArr[0] = f;
        fArr[1] = f4;
        fArr[2] = f5;
        fArr[3] = f6;
        fArr[4] = f32;
        fArr[5] = f35;
        fArr[6] = f36;
        fArr[7] = f37;
        fArr[8] = f41;
    }

    /* JADX INFO: renamed from: setFrom-tU-YjHk, reason: not valid java name */
    public static final void m1894setFromtUYjHk(@NotNull float[] fArr, @NotNull android.graphics.Matrix matrix) {
        matrix.getValues(fArr);
        float f = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[2];
        float f6 = fArr[3];
        float f32 = fArr[4];
        float f35 = fArr[5];
        float f36 = fArr[6];
        float f37 = fArr[7];
        float f41 = fArr[8];
        fArr[0] = f;
        fArr[1] = f6;
        fArr[2] = 0.0f;
        fArr[3] = f36;
        fArr[4] = f4;
        fArr[5] = f32;
        fArr[6] = 0.0f;
        fArr[7] = f37;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f5;
        fArr[13] = f35;
        fArr[14] = 0.0f;
        fArr[15] = f41;
    }
}
