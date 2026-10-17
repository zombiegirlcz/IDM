package mx0;

import com.revolut.core.ui_kit.views.ChatInputView;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class w3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChatInputView f210070b;

    public /* synthetic */ w3(ChatInputView chatInputView, int i) {
        this.f210069a = i;
        this.f210070b = chatInputView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f210069a;
        ChatInputView chatInputView = this.f210070b;
        switch (i) {
            case 0:
                ChatInputView.r(chatInputView);
                break;
            case 1:
                ChatInputView.l(chatInputView);
                break;
            case 2:
                ChatInputView.p(chatInputView);
                break;
            case 3:
                ChatInputView.i(chatInputView);
                break;
            case 4:
                ChatInputView.b(chatInputView);
                break;
            case 5:
                ChatInputView.q(chatInputView);
                break;
            case 6:
                ChatInputView.g(chatInputView);
                break;
            case 7:
                ChatInputView.f(chatInputView);
                break;
            case 8:
                ChatInputView.d(chatInputView);
                break;
            case 9:
                ChatInputView.o(chatInputView);
                break;
            case 10:
                int i2 = ChatInputView.I0;
                chatInputView.getInput$ui_kit_components_release().setVisibility(4);
                break;
            case 11:
                ChatInputView.a(chatInputView);
                break;
            case 12:
                ChatInputView.j(chatInputView);
                break;
            default:
                ChatInputView.n(chatInputView);
                break;
        }
    }
}
