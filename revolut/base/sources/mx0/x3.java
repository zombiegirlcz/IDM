package mx0;

import android.animation.Animator;
import com.revolut.core.ui_kit.views.ChatInputView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class x3 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChatInputView f210103b;

    public /* synthetic */ x3(ChatInputView chatInputView, int i) {
        this.f210102a = i;
        this.f210103b = chatInputView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f210102a;
        ChatInputView chatInputView = this.f210103b;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                int i2 = ChatInputView.I0;
                chatInputView.a0();
                return Unit.f186387a;
            case 1:
                int iIntValue = ((Integer) obj2).intValue();
                if (chatInputView.q0 != iIntValue) {
                    chatInputView.q0 = iIntValue;
                    chatInputView.a0();
                }
                return Unit.f186387a;
            case 2:
                gw0.h item = (gw0.h) obj2;
                int i3 = ChatInputView.I0;
                Intrinsics.checkNotNullParameter(item, "item");
                chatInputView.Q.onNext(item);
                return Unit.f186387a;
            case 3:
                gw0.h item2 = (gw0.h) obj2;
                int i5 = ChatInputView.I0;
                Intrinsics.checkNotNullParameter(item2, "item");
                chatInputView.R.onNext(item2);
                return Unit.f186387a;
            case 4:
                int iIntValue2 = ((Integer) obj2).intValue();
                if (chatInputView.f58465r0 != iIntValue2) {
                    chatInputView.f58465r0 = iIntValue2;
                    chatInputView.a0();
                }
                return Unit.f186387a;
            case 5:
                CharSequence it8 = (CharSequence) obj2;
                int i6 = ChatInputView.I0;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(chatInputView.f58448b0 == d4.IDLE);
            case 6:
                Animator it9 = (Animator) obj2;
                int i21 = ChatInputView.I0;
                Intrinsics.checkNotNullParameter(it9, "it");
                chatInputView.performHapticFeedback(1);
                chatInputView.Z(d4.IDLE, false);
                return Unit.f186387a;
            default:
                CharSequence it10 = (CharSequence) obj2;
                int i22 = ChatInputView.I0;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(chatInputView.f58448b0 == d4.IDLE);
        }
    }
}
