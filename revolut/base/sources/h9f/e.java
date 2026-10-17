package h9f;

import com.revolut.feature.trading.transfer.investments.impl.data.network.TransferService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x4l.c f150244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x4l.c f150245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransferService f150246c;

    public e(x4l.c transferBrokersListDod, x4l.c transferInstrumentsListDod, TransferService transferService) {
        Intrinsics.checkNotNullParameter(transferBrokersListDod, "transferBrokersListDod");
        Intrinsics.checkNotNullParameter(transferInstrumentsListDod, "transferInstrumentsListDod");
        Intrinsics.checkNotNullParameter(transferService, "transferService");
        this.f150244a = transferBrokersListDod;
        this.f150245b = transferInstrumentsListDod;
        this.f150246c = transferService;
    }
}
