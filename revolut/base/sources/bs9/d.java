package bs9;

import android.view.WindowInsets;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.views.ChatInputView;
import com.revolut.feature.payments.groups.impl.ui_chat.chat.GroupChatScreen;
import com.revolut.ui_kit.payments.send_message_transition.SendingMessageAnimationContainerLayout;
import ix0.x0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupChatScreen f18095b;

    public /* synthetic */ d(GroupChatScreen groupChatScreen, int i) {
        this.f18094a = i;
        this.f18095b = groupChatScreen;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f18094a;
        GroupChatScreen groupChatScreen = this.f18095b;
        switch (i) {
            case 0:
                RecyclerView.ViewHolder it8 = (RecyclerView.ViewHolder) obj2;
                KProperty[] kPropertyArr = GroupChatScreen.j0;
                Intrinsics.checkNotNullParameter(it8, "it");
                SendingMessageAnimationContainerLayout sendingMessageAnimationContainerLayout = groupChatScreen.e3().k;
                ChatInputView groupChatConversationInputView = groupChatScreen.e3().f11257g;
                Intrinsics.checkNotNullExpressionValue(groupChatConversationInputView, "groupChatConversationInputView");
                sendingMessageAnimationContainerLayout.a(it8, groupChatConversationInputView);
                return Unit.f186387a;
            case 1:
                KProperty[] kPropertyArr2 = GroupChatScreen.j0;
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return Boolean.valueOf(!groupChatScreen.e3().f11257g.isEnabled());
            default:
                WindowInsets newInsets = (WindowInsets) obj2;
                KProperty[] kPropertyArr3 = GroupChatScreen.j0;
                Intrinsics.checkNotNullParameter(newInsets, "newInsets");
                if (!x0.c(newInsets)) {
                    groupChatScreen.e3().f11257g.getInput$ui_kit_components_release().clearFocus();
                }
                return Unit.f186387a;
        }
    }
}
