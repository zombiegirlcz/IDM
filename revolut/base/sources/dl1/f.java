package dl1;

import cli.y;
import com.revolut.feature.alipay.impl.ui.supportedqrs.SupportedQRsScreenContract$SupportedQR;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends h implements c {

    @NotNull
    private static final e Companion = new e();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final List f115693p;
    public final y o;

    static {
        wi0.a aVar = wi0.b.Companion;
        aVar.getClass();
        SupportedQRsScreenContract$SupportedQR supportedQRsScreenContract$SupportedQR = new SupportedQRsScreenContract$SupportedQR("ALIPAY", "Alipay", "https://assets.revolut.com/apm/alipay.png", wi0.b.N);
        aVar.getClass();
        SupportedQRsScreenContract$SupportedQR supportedQRsScreenContract$SupportedQR2 = new SupportedQRsScreenContract$SupportedQR("DANA", "Dana", "https://assets.revolut.com/apm/dana.png", wi0.b.K0);
        aVar.getClass();
        SupportedQRsScreenContract$SupportedQR supportedQRsScreenContract$SupportedQR3 = new SupportedQRsScreenContract$SupportedQR("DAVIPLATA", "DaviPlata", "https://assets.revolut.com/apm/daviplata.png", wi0.b.O);
        aVar.getClass();
        SupportedQRsScreenContract$SupportedQR supportedQRsScreenContract$SupportedQR4 = new SupportedQRsScreenContract$SupportedQR("EASYPAISA", "EasyPaisa", "https://assets.revolut.com/apm/easypaisa.png", wi0.b.s2);
        aVar.getClass();
        SupportedQRsScreenContract$SupportedQR supportedQRsScreenContract$SupportedQR5 = new SupportedQRsScreenContract$SupportedQR("ESEWA", "ESewa", "https://assets.revolut.com/apm/esewa.png", wi0.b.j2);
        aVar.getClass();
        SupportedQRsScreenContract$SupportedQR supportedQRsScreenContract$SupportedQR6 = new SupportedQRsScreenContract$SupportedQR("ETISALAT_CASH", "EtisalatCash", "https://assets.revolut.com/apm/etisalat.png", wi0.b.f0);
        aVar.getClass();
        SupportedQRsScreenContract$SupportedQR supportedQRsScreenContract$SupportedQR7 = new SupportedQRsScreenContract$SupportedQR("EZ_CASH", "EzCash", "https://assets.revolut.com/apm/ezcash.png", wi0.b.f297767p1);
        aVar.getClass();
        f115693p = v.k(supportedQRsScreenContract$SupportedQR, supportedQRsScreenContract$SupportedQR2, supportedQRsScreenContract$SupportedQR3, supportedQRsScreenContract$SupportedQR4, supportedQRsScreenContract$SupportedQR5, supportedQRsScreenContract$SupportedQR6, supportedQRsScreenContract$SupportedQR7, new SupportedQRsScreenContract$SupportedQR("GCASH", "GCash", "https://assets.revolut.com/apm/gcash.png", wi0.b.r2));
    }

    public f(g stateMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new b(f115693p), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
