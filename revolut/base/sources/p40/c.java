package p40;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.chat.ui.chat_profile.profile_screen.ChatProfileScreen;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ChatProfileScreen f232774a;

    public c(ChatProfileScreen chatProfileScreen) {
        this.f232774a = chatProfileScreen;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (i2 <= 0) {
            return;
        }
        KProperty[] kPropertyArr = ChatProfileScreen.f51125a0;
        this.f232774a.d3();
    }
}
