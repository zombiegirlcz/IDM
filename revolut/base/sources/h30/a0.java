package h30;

import com.revolut.chat.ui.chat_profile.ChatProfileInputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes19.dex */
public final class a0 implements q40.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f148872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f148873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ChatProfileInputData f148874c;

    public a0(n nVar) {
        this.f148872a = nVar;
    }

    @Override // q40.a
    public final q40.a I(ChatProfileInputData chatProfileInputData) {
        chatProfileInputData.getClass();
        this.f148874c = chatProfileInputData;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f148873b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f148873b, ViewController.class);
        vc.s.h(this.f148874c, ChatProfileInputData.class);
        return new z(this.f148872a, this.f148873b, this.f148874c);
    }
}
