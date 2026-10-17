package kz;

import com.revolut.camerakit.validators.config.BlurValidatorConfig;
import com.revolut.camerakit.validators.config.BrightnessValidatorConfig;
import com.revolut.camerakit.validators.config.FaceInFrameValidatorConfig;
import com.revolut.camerakit.validators.config.StraightFaceValidatorConfig;
import com.revolut.camerakit.validators.config.ValidatorConfig;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes16.dex */
public final class e implements e4m.e {
    public static Set a() {
        d.Companion.getClass();
        ValidatorConfig[] elements = {new BrightnessValidatorConfig(0.78f, 0.11f), new BlurValidatorConfig(7), new StraightFaceValidatorConfig(10.0f, 7.5f, 10.0f), new FaceInFrameValidatorConfig(0.1f, 0.1f, 0.1f, 0.1f, 12.0f, 3.0f)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        s.k(setY0);
        return setY0;
    }

    @Override // phm.a
    public final Object get() {
        return a();
    }
}
