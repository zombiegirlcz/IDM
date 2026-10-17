package k9a;

import cli.n;
import cli.y;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.payment_info.PixAuthorisationPaymentInfoScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends h implements dli.b {
    public final c70.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f182303p;

    public f(c70.a clipboard, n stateMapper, PixAuthorisationPaymentInfoScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = clipboard;
        this.f182303p = mra.d.b(this, new d(inputData.f80587a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f182303p;
    }
}
