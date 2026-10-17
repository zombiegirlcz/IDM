package ft6;

import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import pcd.l0;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class n {
    public static CdnImage a(l0 vaultType) {
        String str;
        Intrinsics.checkNotNullParameter(vaultType, "vaultType");
        int i = m.f137949a[vaultType.ordinal()];
        if (i != 1) {
            str = "3d204";
            if (i != 2) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Given " + vaultType + " is not a Pro vault type. Applying default icon.");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
            }
        } else {
            str = "3d048";
        }
        return com.revolut.core.ui_kit_core.displayers.image.models.b.c(str, null, null, null, 30);
    }
}
