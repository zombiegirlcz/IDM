package zz9;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.views.ChatInputView;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.PeerToPeerChatScreen;
import com.revolut.ui_kit.payments.send_message_transition.SendingMessageAnimationContainerLayout;
import ix0.x0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f326596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PeerToPeerChatScreen f326597b;

    public /* synthetic */ a(PeerToPeerChatScreen peerToPeerChatScreen, int i) {
        this.f326596a = i;
        this.f326597b = peerToPeerChatScreen;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f326596a;
        PeerToPeerChatScreen peerToPeerChatScreen = this.f326597b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = PeerToPeerChatScreen.l0;
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return Boolean.valueOf(!peerToPeerChatScreen.e3().f11270p.isEnabled());
            case 1:
                RecyclerView.ViewHolder it8 = (RecyclerView.ViewHolder) obj2;
                KProperty[] kPropertyArr2 = PeerToPeerChatScreen.l0;
                Intrinsics.checkNotNullParameter(it8, "it");
                SendingMessageAnimationContainerLayout sendingMessageAnimationContainerLayout = peerToPeerChatScreen.e3().i;
                ChatInputView inputView = peerToPeerChatScreen.e3().f11270p;
                Intrinsics.checkNotNullExpressionValue(inputView, "inputView");
                sendingMessageAnimationContainerLayout.a(it8, inputView);
                return Unit.f186387a;
            default:
                WindowInsets newInsets = (WindowInsets) obj2;
                KProperty[] kPropertyArr3 = PeerToPeerChatScreen.l0;
                Intrinsics.checkNotNullParameter(newInsets, "newInsets");
                if (!x0.c(newInsets)) {
                    peerToPeerChatScreen.e3().f11270p.getInput$ui_kit_components_release().clearFocus();
                }
                WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(newInsets);
                Intrinsics.checkNotNullExpressionValue(windowInsetsCompat, "toWindowInsetsCompat(...)");
                int i2 = -Math.max(0, windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).bottom - windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()).bottom);
                ViewGroup.LayoutParams layoutParams = peerToPeerChatScreen.e3().d.getLayoutParams();
                Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                if (((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams)).bottomMargin != i2) {
                    View chatScreenBottomBackground = peerToPeerChatScreen.e3().d;
                    Intrinsics.checkNotNullExpressionValue(chatScreenBottomBackground, "chatScreenBottomBackground");
                    ViewGroup.LayoutParams layoutParams2 = chatScreenBottomBackground.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
                    ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = i2;
                    chatScreenBottomBackground.setLayoutParams(layoutParams3);
                }
                return Unit.f186387a;
        }
    }
}
