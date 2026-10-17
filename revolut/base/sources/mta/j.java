package mta;

import cli.y;
import com.revolut.feature.raffle.impl.data.models.RaffleCampaign$ShareInfo;
import com.revolut.feature.raffle.impl.screen.share_raffle.ShareRaffleScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends oki.h implements f {

    @NotNull
    public static final h Companion = new h();
    public final nad.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f208787p;

    public j(k stateMapper, ShareRaffleScreenContract$InputData inputData, fkg.a qrCodeGenerator, nad.c shareMediaInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(qrCodeGenerator, "qrCodeGenerator");
        Intrinsics.checkNotNullParameter(shareMediaInteractor, "shareMediaInteractor");
        this.o = shareMediaInteractor;
        RaffleCampaign$ShareInfo raffleCampaign$ShareInfo = inputData.f81642a;
        String str = raffleCampaign$ShareInfo.d;
        this.f208787p = mra.d.b(this, new e(raffleCampaign$ShareInfo, str != null ? fkg.a.l(qrCodeGenerator, str, new h90.a(33, 33), null, i80.b.QR_CODE, null, 44) : null, shareMediaInteractor.b(false)), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f208787p;
    }
}
