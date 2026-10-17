package mx0;

import com.revolut.core.ui_kit.views.ChatInputLayoutView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class s3 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChatInputLayoutView f209990b;

    public /* synthetic */ s3(ChatInputLayoutView chatInputLayoutView, int i) {
        this.f209989a = i;
        this.f209990b = chatInputLayoutView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f209989a) {
            case 0:
                ChatInputLayoutView chatInputLayoutView = this.f209990b;
                if (!chatInputLayoutView.f58437p) {
                    chatInputLayoutView.a();
                }
                return Unit.f186387a;
            default:
                return Integer.valueOf(this.f209990b.k);
        }
    }
}
