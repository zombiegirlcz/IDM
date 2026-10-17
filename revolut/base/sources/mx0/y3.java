package mx0;

import com.revolut.core.ui_kit.views.ChatInputView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class y3 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChatInputView f210122b;

    public /* synthetic */ y3(ChatInputView chatInputView, int i) {
        this.f210121a = i;
        this.f210122b = chatInputView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f210121a) {
            case 0:
                ihm.f fVar = this.f210122b.P;
                Unit unit = Unit.f186387a;
                fVar.onNext(unit);
                return unit;
            case 1:
                return ChatInputView.k(this.f210122b);
            default:
                return ChatInputView.e(this.f210122b);
        }
    }
}
