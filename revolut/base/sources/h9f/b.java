package h9f;

import com.revolut.feature.trading.transfer.investments.impl.data.network.TransferOutCreateService;
import com.revolut.feature.trading.transfer.investments.impl.data.network.TransferOutFlowService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import t90.g;
import u8f.h;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferOutFlowService f150238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferOutCreateService f150239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f150240c;

    public b(TransferOutFlowService transferOutFlowService, TransferOutCreateService transferOutCreateService, g backendFlowMapper) {
        Intrinsics.checkNotNullParameter(transferOutFlowService, "transferOutFlowService");
        Intrinsics.checkNotNullParameter(transferOutCreateService, "transferOutCreateService");
        Intrinsics.checkNotNullParameter(backendFlowMapper, "backendFlowMapper");
        this.f150238a = transferOutFlowService;
        this.f150239b = transferOutCreateService;
        this.f150240c = backendFlowMapper;
    }

    public static String a(h hVar) {
        switch (a.f150237a[hVar.ordinal()]) {
            case 1:
                return "ACAT_FULL";
            case 2:
                return "ACAT_PARTIAL";
            case 3:
                return "DRS";
            case 4:
                return "DTC";
            case 5:
                return "FOP";
            case 6:
                throw new IllegalStateException("ISA transfer out flow is not supported");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
