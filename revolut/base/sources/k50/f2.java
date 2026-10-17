package k50;

import androidx.core.graphics.Insets;
import com.revolut.chat.ui.messageslist.MessagesScreen;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.PeerToPeerChatScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f2 extends dq0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewController f181062b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f2(ViewController viewController, int i, int i2, int i3) {
        super(i, i2);
        this.f181061a = i3;
        this.f181062b = viewController;
    }

    private final void e() {
    }

    private final void f() {
    }

    @Override // dq0.b
    public final void a() {
        switch (this.f181061a) {
            case 0:
                break;
            default:
                ((PeerToPeerChatScreen) this.f181062b).f79765e0 = false;
                break;
        }
    }

    @Override // dq0.b
    public void b() {
        switch (this.f181061a) {
            case 1:
                ((PeerToPeerChatScreen) this.f181062b).f79765e0 = true;
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // dq0.b
    public final void c(Insets diff, float f) {
        switch (this.f181061a) {
        }
        Intrinsics.checkNotNullParameter(diff, "diff");
    }

    @Override // dq0.b
    public final void d() {
        switch (this.f181061a) {
            case 0:
                MessagesScreen messagesScreen = (MessagesScreen) this.f181062b;
                MessagesScreen.a aVar = MessagesScreen.Companion;
                ap0.j jVarE3 = messagesScreen.e3();
                if (jVarE3 != null) {
                    jVarE3.F().e();
                }
                break;
        }
    }
}
