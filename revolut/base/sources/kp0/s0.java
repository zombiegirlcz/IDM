package kp0;

import android.view.View;
import androidx.core.view.GestureDetectorCompat;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.chat.ChatBubbleReactionView;
import com.revolut.core.ui_kit.internal.views.chat.ChatParentLayout;
import com.revolut.core.ui_kit.internal.views.chat.ChatPaymentView;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s0 extends koi.b {
    public final ChatSwipeToReplyLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ChatParentLayout f188087g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ChatPaymentView f188088h;
    public final ChatBubbleReactionView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xr0.i f188089j;
    public Function0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Function0 f188090l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Function0 f188091m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final GestureDetectorCompat f188092n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.chatPaymentBubbleDelegate_swipeToReplyLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ChatSwipeToReplyLayout chatSwipeToReplyLayout = (ChatSwipeToReplyLayout) viewFindViewById;
        this.f = chatSwipeToReplyLayout;
        View viewFindViewById2 = itemView.findViewById(R$id.chatPaymentBubbleDelegate_chatParentLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f188087g = (ChatParentLayout) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.chatPaymentBubbleDelegate_bubbleView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        ChatPaymentView chatPaymentView = (ChatPaymentView) viewFindViewById3;
        this.f188088h = chatPaymentView;
        View viewFindViewById4 = itemView.findViewById(R$id.chatPaymentBubbleDelegate_reactionsView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (ChatBubbleReactionView) viewFindViewById4;
        final int i = 0;
        final int i2 = 1;
        this.f188089j = new xr0.i(itemView, new Function1(this) { // from class: kp0.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s0 f188069b;

            {
                this.f188069b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) throws Throwable {
                NavBarWithContainerBackground navBarWithContainerBackground = (NavBarWithContainerBackground) obj2;
                switch (i) {
                    case 0:
                        this.f188069b.f188088h.setMediaBackground(navBarWithContainerBackground);
                        break;
                    default:
                        this.f188069b.f188088h.setMediaBackground(navBarWithContainerBackground);
                        break;
                }
                return Unit.f186387a;
            }
        }, new Function1(this) { // from class: kp0.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s0 f188069b;

            {
                this.f188069b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) throws Throwable {
                NavBarWithContainerBackground navBarWithContainerBackground = (NavBarWithContainerBackground) obj2;
                switch (i2) {
                    case 0:
                        this.f188069b.f188088h.setMediaBackground(navBarWithContainerBackground);
                        break;
                    default:
                        this.f188069b.f188088h.setMediaBackground(navBarWithContainerBackground);
                        break;
                }
                return Unit.f186387a;
            }
        }, null);
        this.k = new kl7.w0(17);
        this.f188090l = new kl7.w0(18);
        this.f188091m = new kl7.w0(19);
        this.f188092n = new GestureDetectorCompat(itemView.getContext(), new bx0.q(this, 5));
        chatPaymentView.setOnTouchListener(new gzl.b(this, 7));
        chatSwipeToReplyLayout.setAnchorViewId(Integer.valueOf(R$id.chatPaymentBubbleDelegate_chatParentLayout));
    }
}
