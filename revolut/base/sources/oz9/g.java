package oz9;

import com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.PeerToPeerChatScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f231175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f231176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f231177c;
    public PeerToPeerChatScreenContract$InputData d;
    public ReactionsKeyboardView e;
    public final Object f;

    public /* synthetic */ g(c cVar, Object obj2, int i) {
        this.f231175a = i;
        this.f231176b = cVar;
        this.f = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f231175a) {
            case 0:
                this.f231177c = viewController;
                break;
            default:
                this.f231177c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f231175a) {
            case 0:
                s.h(this.f231177c, ViewController.class);
                s.h(this.d, PeerToPeerChatScreenContract$InputData.class);
                s.h(this.e, ReactionsKeyboardView.class);
                return new h(this.f231176b, (b) this.f, new o9i.a(), new o9i.b(), new o9i.c(), this.f231177c, this.d, this.e);
            default:
                s.h(this.f231177c, ViewController.class);
                s.h(this.d, PeerToPeerChatScreenContract$InputData.class);
                s.h(this.e, ReactionsKeyboardView.class);
                return new h(this.f231176b, (a) this.f, new o9i.a(), new o9i.b(), new o9i.c(), this.f231177c, this.d, this.e);
        }
    }
}
