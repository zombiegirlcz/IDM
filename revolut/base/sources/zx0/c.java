package zx0;

import com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f325983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReactionsKeyboardView f325984b;

    public /* synthetic */ c(ReactionsKeyboardView reactionsKeyboardView, int i) {
        this.f325983a = i;
        this.f325984b = reactionsKeyboardView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f325983a) {
            case 0:
                this.f325984b.J = false;
                return Unit.f186387a;
            case 1:
                return ReactionsKeyboardView.l(this.f325984b);
            case 2:
                this.f325984b.K = false;
                return Unit.f186387a;
            default:
                return ReactionsKeyboardView.c(this.f325984b);
        }
    }
}
