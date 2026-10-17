package h30;

import com.revolut.chat.ui.chat_profile.ChatProfileInputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes19.dex */
public final class y implements q40.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f148986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f148987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f148988c;
    public ChatProfileInputData d;

    public y(n nVar, o oVar) {
        this.f148986a = nVar;
        this.f148987b = oVar;
    }

    @Override // q40.a
    public final q40.a I(ChatProfileInputData chatProfileInputData) {
        chatProfileInputData.getClass();
        this.d = chatProfileInputData;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f148988c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f148988c, ViewController.class);
        vc.s.h(this.d, ChatProfileInputData.class);
        return new z(this.f148986a, this.f148987b, this.f148988c, this.d);
    }
}
