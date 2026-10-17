package ia7;

import android.graphics.Path;
import android.graphics.PointF;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    @NotNull
    private static final C0915a Companion = new C0915a();

    /* JADX INFO: renamed from: ia7.a$a, reason: collision with other inner class name */
    public static final class C0915a {
        private C0915a() {
        }
    }

    public static void a(Path path, JSONArray jSONArray, int i, int i2) throws JSONException {
        float f;
        int i3;
        float f4 = i;
        int length = jSONArray.length();
        int i5 = 0;
        int i6 = 0;
        while (i6 < length) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i6);
            int length2 = jSONArray2.length();
            Float fValueOf = null;
            int i21 = i5;
            while (i21 < length2) {
                JSONArray jSONArray3 = jSONArray2.getJSONArray(i21);
                double d = jSONArray3.getDouble(i5);
                double d5 = jSONArray3.getDouble(1);
                float f5 = i2;
                if (d < -172.0d) {
                    f = f4;
                    i3 = length;
                    d += (double) 360;
                } else {
                    f = f4;
                    i3 = length;
                }
                PointF pointF = new PointF((float) ((d + ((double) 172)) * ((double) (f / 360.0f))), (float) (((d5 * ((double) (-1))) + ((double) 90)) * ((double) (f5 / 180.0f))));
                if (i21 == 0) {
                    path.moveTo(pointF.x, pointF.y);
                } else {
                    float f6 = pointF.x;
                    Intrinsics.h(fValueOf);
                    if (Math.abs(f6 - fValueOf.floatValue()) > 0.8f * f) {
                        path.moveTo(pointF.x, pointF.y);
                    } else {
                        path.lineTo(pointF.x, pointF.y);
                    }
                }
                fValueOf = Float.valueOf(pointF.x);
                i21++;
                f4 = f;
                length = i3;
                i5 = 0;
            }
            path.close();
            i6++;
            i5 = 0;
        }
    }
}
