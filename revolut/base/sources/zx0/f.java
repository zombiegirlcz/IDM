package zx0;

import com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f325991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReactionsKeyboardView f325992b;

    public /* synthetic */ f(ReactionsKeyboardView reactionsKeyboardView, int i) {
        this.f325991a = i;
        this.f325992b = reactionsKeyboardView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f325991a;
        ReactionsKeyboardView reactionsKeyboardView = this.f325992b;
        switch (i) {
            case 0:
                ReactionsKeyboardView.a aVar = ReactionsKeyboardView.Companion;
                reactionsKeyboardView.A();
                break;
            default:
                ReactionsKeyboardView.a aVar2 = ReactionsKeyboardView.Companion;
                reactionsKeyboardView.C();
                break;
        }
    }
}
