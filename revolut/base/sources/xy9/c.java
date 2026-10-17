package xy9;

import com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias;
import com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends ry9.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ba2.e f309652l;

    public c(ba2.e payIdTransferExtension) {
        Intrinsics.checkNotNullParameter(payIdTransferExtension, "payIdTransferExtension");
        this.f309652l = payIdTransferExtension;
    }

    @Override // yji.n
    public final void D2() {
        w2(this.f309652l, null);
    }

    @Override // yji.n
    public final void E2() {
        m2(this.f309652l);
    }

    @Override // ry9.b
    public final boolean Z2(SendFromClipboardType type) {
        ResolveAlias resolveAlias;
        Intrinsics.checkNotNullParameter(type, "type");
        if (!(type instanceof SendFromClipboardType.PayIdType)) {
            return false;
        }
        SendFromClipboardType.PayIdType payIdType = (SendFromClipboardType.PayIdType) type;
        if (payIdType instanceof SendFromClipboardType.PayIdType.Email) {
            resolveAlias = new ResolveAlias(a02.a.EMAIL, ((SendFromClipboardType.PayIdType.Email) payIdType).f79702a, null);
        } else {
            if (!(payIdType instanceof SendFromClipboardType.PayIdType.Phone)) {
                throw new NoWhenBranchMatchedException();
            }
            resolveAlias = new ResolveAlias(a02.a.PHONE, ((SendFromClipboardType.PayIdType.Phone) payIdType).f79703a, null);
        }
        ba2.e.b3(this.f309652l, ba2.f.CLIPBOARD, resolveAlias, null, 4);
        return true;
    }
}
