package xy9;

import com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends ry9.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final oy1.b f309651l;

    public a(oy1.b apmNavigationProvider) {
        Intrinsics.checkNotNullParameter(apmNavigationProvider, "apmNavigationProvider");
        this.f309651l = apmNavigationProvider;
    }

    @Override // ry9.b
    public final boolean Z2(SendFromClipboardType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (!(type instanceof SendFromClipboardType.ApmType)) {
            return false;
        }
        A2(this.f309651l.g(((SendFromClipboardType.ApmType) type).getF79695b(), hrf.f.OUTGOING, new TransferMoneyPocket(null, null, 3)));
        return true;
    }
}
