package cx0;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends ShapeDrawable.ShaderFactory {
    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i, int i2) {
        return new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i * 1.2272727f, i2, new int[]{0, 0, Color.argb(80, 255, 255, 255), 0, 0}, new float[]{BitmapDescriptorFactory.HUE_RED, 0.35f, 0.5f, 0.65f, 1.0f}, Shader.TileMode.CLAMP);
    }
}
