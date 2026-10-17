package kp0;

import com.revolut.core.ui_kit.delegates.chat.ChatAttachmentGridBubbleDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChatAttachmentGridBubbleDelegate f188004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ChatAttachmentGridBubbleDelegate.Model f188005c;

    public /* synthetic */ g(ChatAttachmentGridBubbleDelegate chatAttachmentGridBubbleDelegate, ChatAttachmentGridBubbleDelegate.Model model, int i) {
        this.f188003a = i;
        this.f188004b = chatAttachmentGridBubbleDelegate;
        this.f188005c = model;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f188003a) {
            case 0:
                this.f188004b.f53776m.onNext(this.f188005c);
                break;
            default:
                this.f188004b.f53776m.onNext(this.f188005c);
                break;
        }
        return Unit.f186387a;
    }
}
