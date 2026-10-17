package mba;

import cli.n;
import cli.y;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.additional_information.PixQrCodeAdditionalInformationScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends oki.h implements dli.b {

    @NotNull
    public static final h Companion = new h();
    public final c70.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f204190p;

    public i(PixQrCodeAdditionalInformationScreenContract$InputData inputData, c70.a clipboard, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = clipboard;
        this.f204190p = mra.d.b(this, new d(inputData.f80700a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f204190p;
    }
}
