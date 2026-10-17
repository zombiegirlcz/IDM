package k50;

import android.view.View;
import com.revolut.chat.ui.messageslist.MessagesScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e2 implements View.OnScrollChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MessagesScreen f181056a;

    public e2(MessagesScreen messagesScreen) {
        this.f181056a = messagesScreen;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view, int i, int i2, int i3, int i5) {
        MessagesScreen messagesScreen = this.f181056a;
        s1 s1Var = messagesScreen.C0;
        if (s1Var == null) {
            Intrinsics.r("paneCoordinator");
            throw null;
        }
        int scrollY = messagesScreen.f3().f1529m.getScrollY();
        int height = s1Var.f181229a.getHeight();
        v0 v0Var = scrollY < height / 10 ? v0.MESSAGES : scrollY > (height * 9) / 10 ? v0.PROMPT : s1Var.f181233h;
        int i6 = height / 2;
        s1Var.f181232g = scrollY < i6 ? yo0.a.TOP_GLOW : yo0.a.AIR_SPHERE;
        boolean z = scrollY < i6;
        if (z != s1Var.i) {
            s1Var.i = z;
            s1Var.e.setShadowVisible(z);
        }
        v0 v0Var2 = s1Var.f181233h;
        s1Var.f181233h = v0Var;
        s1Var.f.invoke(v0Var2, v0Var);
        s1Var.a();
    }
}
