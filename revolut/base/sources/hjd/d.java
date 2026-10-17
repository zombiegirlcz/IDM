package hjd;

import aw0.d0;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.youTransactor.uCube.rpc.Constants;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ImageTransformations f152705a = new ImageTransformations(null, new CircleTransformation(Float.valueOf(1.0f), Integer.valueOf(R$attr.uikit_colorGrey50_5), true, 4), null, null, null, null, null, ISO781611.SMT_TAG);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ImageTransformations f152706b = new ImageTransformations(null, null, null, gz0.b.CenterCrop, 8, null, null, 103);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f152707c = new d0(167, 172);
    public static final d0 d = new d0(LDSFile.EF_DG13_TAG, Constants.EMVTag.TAG_9C_TRANSACTION_TYPE);

    private d() {
    }
}
