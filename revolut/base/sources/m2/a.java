package m2;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.view.SurfaceControl;

/* JADX INFO: loaded from: classes15.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ BlendModeColorFilter c(int i, BlendMode blendMode) {
        return new BlendModeColorFilter(i, blendMode);
    }

    public static /* synthetic */ SurfaceControl.Transaction e() {
        return new SurfaceControl.Transaction();
    }

    public static /* synthetic */ void f() {
    }
}
