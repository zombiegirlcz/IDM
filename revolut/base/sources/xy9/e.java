package xy9;

import com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends ry9.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final cl3.a f309654l;

    public e(cl3.a contactsInteractor) {
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        this.f309654l = contactsInteractor;
    }

    @Override // ry9.b
    public final boolean Z2(SendFromClipboardType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (!(type instanceof SendFromClipboardType.P2PType)) {
            return false;
        }
        T2(new xnl.f(this, type, null, 19), new yi5.b(27));
        return true;
    }
}
