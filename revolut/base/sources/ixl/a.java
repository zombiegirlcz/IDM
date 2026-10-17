package ixl;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import kotlinx.coroutines.flow.Flow;
import lxl.f;
import mxl.i;

/* JADX INFO: loaded from: classes12.dex */
public interface a {
    Flow a();

    void b(i iVar);

    void c(int i);

    void d(Lifecycle lifecycle);

    void e(f fVar);

    View getSceneView();

    void setCardNodePositionParams(float f, Float f4);

    void setLottieBackground(LottieImage lottieImage);
}
