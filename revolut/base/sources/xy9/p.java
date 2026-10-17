package xy9;

import com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias;
import com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends ry9.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ve2.a f309679l;

    public p(ve2.a upiTransferExtension) {
        Intrinsics.checkNotNullParameter(upiTransferExtension, "upiTransferExtension");
        this.f309679l = upiTransferExtension;
    }

    @Override // yji.n
    public final void D2() {
        w2(this.f309679l, null);
    }

    @Override // yji.n
    public final void E2() {
        m2(this.f309679l);
    }

    @Override // ry9.b
    public final boolean Z2(SendFromClipboardType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (!(type instanceof SendFromClipboardType.UpiType)) {
            return false;
        }
        SendFromClipboardType.UpiType upiType = (SendFromClipboardType.UpiType) type;
        if (!(upiType instanceof SendFromClipboardType.UpiType.UpiId)) {
            throw new NoWhenBranchMatchedException();
        }
        this.f309679l.Z2(new ResolveAlias(a02.a.UPI_ID, ((SendFromClipboardType.UpiType.UpiId) upiType).f79710a, null));
        return true;
    }
}
