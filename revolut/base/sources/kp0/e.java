package kp0;

import com.revolut.core.ui_kit.delegates.chat.ChatAttachmentBubbleDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f187989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChatAttachmentBubbleDelegate f187990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ChatAttachmentBubbleDelegate.Model f187991c;

    public /* synthetic */ e(ChatAttachmentBubbleDelegate chatAttachmentBubbleDelegate, ChatAttachmentBubbleDelegate.Model model, int i) {
        this.f187989a = i;
        this.f187990b = chatAttachmentBubbleDelegate;
        this.f187991c = model;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f187989a) {
            case 0:
                this.f187990b.k.onNext(this.f187991c);
                break;
            default:
                this.f187990b.k.onNext(this.f187991c);
                break;
        }
        return Unit.f186387a;
    }
}
