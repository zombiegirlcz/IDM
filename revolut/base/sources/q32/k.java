package q32;

import cli.y;
import com.revolut.feature.apm.core.ui.api.navigation.qr.QrData;
import com.revolut.feature.apm.core.ui.impl.ui.qr.details.screen.QrDetailsScreenContract$InputData;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zh9.u0;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends oki.h implements dli.b {

    @NotNull
    public static final j Companion = new j();
    public final c70.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final tqi.g f241779p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f241780q;

    public k(c70.a clipboard, tqi.g shareNaviCommandFactory, cli.n stateMapper, QrDetailsScreenContract$InputData inputData) {
        String str;
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(shareNaviCommandFactory, "shareNaviCommandFactory");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = clipboard;
        this.f241779p = shareNaviCommandFactory;
        List list = inputData.f62370a;
        QrData qrData = (QrData) d0.d0(list);
        if (qrData == null || (str = qrData.f62318a) == null) {
            m70.a.c(t0.f186434a);
            str = "";
        }
        this.f241780q = mra.d.b(this, new g(list, str), stateMapper, null, false, 12);
    }

    public final void I2(f fVar) {
        if (fVar instanceof d) {
            tqi.c cVar = new tqi.c(null, ((d) fVar).f241773a, null, null, 91);
            m70.a.c(t0.f186434a);
            C1(u0.b(this.f241779p.g(cVar, "")));
        } else if (!(fVar instanceof e)) {
            if (fVar != null) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            this.o.c(null, ((e) fVar).f241774a, false, new pyc.a(this, 12));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f241780q;
    }
}
