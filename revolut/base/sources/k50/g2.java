package k50;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.chat.ui.messageslist.MessagesScreen;
import com.revolut.recyclerkit.layoutmanager.UIKitLinearLayoutManager;
import ip0.oa;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes19.dex */
public final class g2 extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MessagesScreen f181074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f181075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UIKitLinearLayoutManager f181076c;
    public final /* synthetic */ koi.h d;

    public g2(MessagesScreen messagesScreen, Ref$ObjectRef ref$ObjectRef, UIKitLinearLayoutManager uIKitLinearLayoutManager, koi.h hVar) {
        this.f181074a = messagesScreen;
        this.f181075b = ref$ObjectRef;
        this.f181076c = uIKitLinearLayoutManager;
        this.d = hVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        View childAt;
        RecyclerView.ViewHolder childViewHolder;
        UUID uuid;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        MessagesScreen.Companion aVar = MessagesScreen.INSTANCE;
        int scrollState = recyclerView.getScrollState();
        MessagesScreen messagesScreen = this.f181074a;
        if (scrollState == 0) {
            if (messagesScreen.f51189s0 == 0 && !messagesScreen.i3()) {
                messagesScreen.n3(true);
            }
        } else if (i2 != 0) {
            if (i2 < 0) {
                if (messagesScreen.f51189s0 == 1 && messagesScreen.i3()) {
                    messagesScreen.m3(false);
                }
            } else if (messagesScreen.f51189s0 == 0 && !messagesScreen.i3()) {
                messagesScreen.n3(false);
            }
        }
        Ref$ObjectRef ref$ObjectRef = this.f181075b;
        UUID uuid2 = (UUID) ref$ObjectRef.f186409a;
        if (this.f181076c.getItemCount() > 0 && (childAt = recyclerView.getChildAt(0)) != null && (childViewHolder = recyclerView.getChildViewHolder(childAt)) != null) {
            UUID id10 = null;
            if (childViewHolder.getBindingAdapterPosition() < 15) {
                koi.j jVarA = this.d.a(0);
                if (Intrinsics.f(jVarA.getF53929a(), "LIST_ID_LOADING") && (jVarA instanceof oa) && (uuid = ((oa) jVarA).f165645j) != null) {
                    id10 = uuid;
                }
            }
            if (id10 != null && !id10.equals(uuid2)) {
                j4 j4Var = (j4) messagesScreen.R2();
                j4Var.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                j4Var.l0.b(id10);
                uuid2 = id10;
            }
        }
        ref$ObjectRef.f186409a = uuid2;
    }
}
