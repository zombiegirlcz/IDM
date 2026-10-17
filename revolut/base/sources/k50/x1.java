package k50;

import android.widget.Space;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.chat.ui.messageslist.MessagesScreen;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class x1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MessagesScreen f181282b;

    public /* synthetic */ x1(MessagesScreen messagesScreen, int i) {
        this.f181281a = i;
        this.f181282b = messagesScreen;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f181281a;
        MessagesScreen messagesScreen = this.f181282b;
        switch (i) {
            case 0:
                MessagesScreen.a aVar = MessagesScreen.Companion;
                ScreenContentRecyclerView recyclerView = messagesScreen.f3().f1528l;
                Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null && linearLayoutManager.getItemCount() >= 1) {
                    if (linearLayoutManager.getItemCount() - 1 == linearLayoutManager.findLastVisibleItemPosition()) {
                        messagesScreen.n3(true);
                    } else if (!messagesScreen.i3()) {
                        messagesScreen.n3(true);
                    } else {
                        messagesScreen.m3(true);
                    }
                }
                break;
            default:
                MessagesScreen.a aVar2 = MessagesScreen.Companion;
                SmallActionButton fab2 = messagesScreen.f3().f;
                Intrinsics.checkNotNullExpressionValue(fab2, "fab");
                fab2.setVisibility(8);
                Space fabAnchor = messagesScreen.f3().f1525g;
                Intrinsics.checkNotNullExpressionValue(fabAnchor, "fabAnchor");
                fabAnchor.setVisibility(8);
                break;
        }
    }
}
