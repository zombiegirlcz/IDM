package ihg;

import aq4.i;
import aw0.d0;
import aw0.y4;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.youTransactor.uCube.rpc.Constants;
import ieg.y;
import ieg.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d0 f161406b = new d0(167, Constants.TAG_BLE_FIRMWARE_VERSION);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f161407a;

    public d(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f161407a = uiKitResources;
    }

    public static hg a(ArrayList arrayList) {
        hg hgVar = new hg("TOP_DESTINATIONS_VOUCHERS_LIST_ID", arrayList, 2, new y4(f161406b), null, new gg.c(0), false, false, null, null, 0, 0, 0, 0, 32720);
        int i = R$attr.uikit_dp0;
        yp0.b.p(hgVar, i, R$attr.uikit_dp8, i, i);
        return hgVar;
    }

    public final List b(Data topDestinations, TextLocalisedClause sectionTitle) {
        Intrinsics.checkNotNullParameter(topDestinations, "topDestinations");
        Intrinsics.checkNotNullParameter(sectionTitle, "sectionTitle");
        return (List) iii.c.f(topDestinations, new i(this, sectionTitle, 5), new y(19), new z(this, sectionTitle, 4));
    }
}
