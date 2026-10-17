package kp0;

import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class p implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChatBubbleDelegate f188051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ChatBubbleDelegate.Model f188052c;

    public /* synthetic */ p(ChatBubbleDelegate.Model model, ChatBubbleDelegate chatBubbleDelegate, int i) {
        this.f188050a = i;
        this.f188052c = model;
        this.f188051b = chatBubbleDelegate;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f188050a) {
            case 0:
                this.f188051b.f53807g.onNext(this.f188052c);
                break;
            case 1:
                this.f188051b.f53810l.onNext(this.f188052c);
                break;
            case 2:
                this.f188051b.f53806c.onNext(this.f188052c);
                break;
            case 3:
                this.f188051b.e.onNext(this.f188052c);
                break;
            case 4:
                this.f188051b.f.onNext(this.f188052c);
                break;
            case 5:
                this.f188051b.i.onNext(this.f188052c);
                break;
            case 6:
                this.f188051b.f53809j.onNext(this.f188052c.i);
                break;
            case 7:
                this.f188051b.f53810l.onNext(this.f188052c);
                break;
            case 8:
                this.f188051b.f53811m.onNext(this.f188052c);
                break;
            case 9:
                this.f188051b.f53812n.onNext(this.f188052c);
                break;
            case 10:
                this.f188051b.k.onNext(this.f188052c);
                break;
            case 11:
                this.f188051b.e.onNext(this.f188052c);
                break;
            case 12:
                ChatBubbleDelegate.Model model = this.f188052c;
                if (model.u) {
                    this.f188051b.f53806c.onNext(model);
                }
                break;
            case 13:
                ChatBubbleDelegate.Model model2 = this.f188052c;
                if (model2.u) {
                    this.f188051b.e.onNext(model2);
                }
                break;
            default:
                ChatBubbleDelegate.Model model3 = this.f188052c;
                if (model3.u) {
                    this.f188051b.f.onNext(model3);
                }
                break;
        }
        return Unit.f186387a;
    }

    public /* synthetic */ p(ChatBubbleDelegate chatBubbleDelegate, ChatBubbleDelegate.Model model, int i) {
        this.f188050a = i;
        this.f188051b = chatBubbleDelegate;
        this.f188052c = model;
    }
}
