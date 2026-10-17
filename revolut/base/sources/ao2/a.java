package ao2;

import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.youTransactor.uCube.rpc.Constants;

/* JADX INFO: loaded from: classes21.dex */
public final class a {
    private a() {
    }

    public static CdnImage a() {
        return new CdnImage("cass_logo_light", "mobile/account_switch", null, new ImageTransformations(null, null, null, null, null, null, 48, 63), null, "cass_logo_dark", Constants.TAG_GPI_VERSION);
    }
}
