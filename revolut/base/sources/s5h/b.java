package s5h;

import com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.position_details.CommodityPositionDetailsController;
import kotlin.jvm.internal.Intrinsics;
import ryj.w;
import s56.i;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d5h.a f260077c;
    public final gjh.e d;

    public b(d5h.a host, gjh.e controllerModelExtension) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f260077c = host;
        this.d = controllerModelExtension;
    }

    @Override // yji.d
    public final void M() {
        yji.d.H(this, new w(rd0.e.b(((CommodityPositionDetailsController) this.f260077c).N.f51821c), 11), new i(this, null, 1), 3);
    }
}
