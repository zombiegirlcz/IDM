package ez0;

import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.youTransactor.uCube.rpc.Constants;

/* JADX INFO: loaded from: classes20.dex */
public final class c {
    private c() {
    }

    public static CdnImage a(String str) {
        return new CdnImage(str, "mobile/cards", null, null, null, null, Constants.TAG_OS_VERSION);
    }
}
