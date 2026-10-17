package zw1;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.youTransactor.uCube.rpc.Constants;
import gz0.b;

/* JADX INFO: loaded from: classes20.dex */
public final class a {
    private a() {
    }

    public static CdnImage a() {
        b bVar = b.CenterInside;
        Integer numValueOf = Integer.valueOf(SyslogConstants.LOG_LOCAL2);
        return new CdnImage("logo", "mobile/open_banking/ideal_prompt", null, new ImageTransformations(null, null, null, bVar, null, numValueOf, numValueOf, 23), null, null, Constants.TAG_F4);
    }
}
