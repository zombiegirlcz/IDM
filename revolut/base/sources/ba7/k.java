package ba7;

import com.revolut.core.ui_kit.delegates.SmartTileAssetViewLoadingDelegate;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import ofm.q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class k {

    @NotNull
    private static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nwh.b f13982a;

    public k(nwh.b chartDataMapper) {
        Intrinsics.checkNotNullParameter(chartDataMapper, "chartDataMapper");
        this.f13982a = chartDataMapper;
    }

    public static koi.j b() {
        SmartTileAssetViewLoadingDelegate.Model model = new SmartTileAssetViewLoadingDelegate.Model("CRYPTO_ASSET_SMART_TILE_LOADING_LIST_ID");
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public final BigDecimal a(qta.c cVar, qta.d dVar) {
        BigDecimal bigDecimalM = q.m(cVar);
        if (bigDecimalM != null) {
            return bigDecimalM;
        }
        double d = dVar.f249051a;
        return new BigDecimal(String.valueOf((float) ((((double) 100) * this.f13982a.b(dVar.e, d, null, Double.valueOf(cVar.f249048c.doubleValue()))) / d)));
    }
}
