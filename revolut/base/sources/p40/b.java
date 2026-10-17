package p40;

import com.revolut.chat.ui.chat_profile.profile_screen.ChatProfileScreen;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.recyclerkit.ScreenGridLayoutManager;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends ScreenGridLayoutManager.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ChatProfileScreen f232772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScreenGridLayoutManager f232773b;

    public b(ChatProfileScreen chatProfileScreen, ScreenGridLayoutManager screenGridLayoutManager) {
        this.f232772a = chatProfileScreen;
        this.f232773b = screenGridLayoutManager;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i) {
        if (((tki.b) ((tki.a) this.f232772a.Y.getValue())).f271959b.f.a(i) instanceof SmallCardDelegate.Model) {
            return 1;
        }
        return this.f232773b.getSpanCount();
    }
}
