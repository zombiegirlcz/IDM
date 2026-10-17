package dyl;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.ui_kit.payments.transition.TransferToChatTransitionFlowContainerLayout;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Ref$BooleanRef;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f121170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferToChatTransitionFlowContainerLayout f121171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f121172c;
    public final /* synthetic */ com.revolut.ui_kit.payments.transition.a d;
    public final /* synthetic */ ViewGroup e;

    public o(Ref$BooleanRef ref$BooleanRef, TransferToChatTransitionFlowContainerLayout transferToChatTransitionFlowContainerLayout, RecyclerView recyclerView, com.revolut.ui_kit.payments.transition.a aVar, ViewGroup viewGroup) {
        this.f121170a = ref$BooleanRef;
        this.f121171b = transferToChatTransitionFlowContainerLayout;
        this.f121172c = recyclerView;
        this.d = aVar;
        this.e = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f121170a.f186407a) {
            return;
        }
        TransferToChatTransitionFlowContainerLayout transferToChatTransitionFlowContainerLayout = this.f121171b;
        RuntimeException runtimeException = new RuntimeException(p.a.n(transferToChatTransitionFlowContainerLayout.getP2pChatBubbleAnimationTimeout(), "Message bubble wasn't rendered in ", "ms. Using fallback animation."));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, runtimeException, h0Var);
        this.f121172c.removeOnLayoutChangeListener(this.d);
        TransferToChatTransitionFlowContainerLayout.b(transferToChatTransitionFlowContainerLayout, this.e);
    }
}
