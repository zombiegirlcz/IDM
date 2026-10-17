package ix0;

import com.revolut.core.ui_kit.views.AvatarView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169251a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f169252b;

    public k0(Function0 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f169252b = provider;
    }

    @Override // ix0.h0
    public final i0 getCutoutReceiverController() {
        switch (this.f169251a) {
            case 0:
                h0 h0Var = (h0) ((Function0) this.f169252b).invoke();
                if (h0Var != null) {
                    return h0Var.getCutoutReceiverController();
                }
                return null;
            default:
                return (jx0.a) this.f169252b;
        }
    }

    public k0(AvatarView avatarView) {
        this.f169252b = new jx0.a(avatarView);
    }
}
