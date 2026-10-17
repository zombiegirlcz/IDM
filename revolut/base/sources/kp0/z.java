package kp0;

import com.revolut.core.ui_kit.delegates.chat.ChatCallBubbleDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class z implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChatCallBubbleDelegate f188117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ChatCallBubbleDelegate.Model f188118c;

    public /* synthetic */ z(ChatCallBubbleDelegate chatCallBubbleDelegate, ChatCallBubbleDelegate.Model model, int i) {
        this.f188116a = i;
        this.f188117b = chatCallBubbleDelegate;
        this.f188118c = model;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f188116a) {
            case 0:
                this.f188117b.k.onNext(this.f188118c);
                break;
            default:
                this.f188117b.k.onNext(this.f188118c);
                break;
        }
        return Unit.f186387a;
    }
}
