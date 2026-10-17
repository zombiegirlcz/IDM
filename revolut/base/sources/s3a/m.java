package s3a;

import com.revolut.feature.payments.who_to_transfer.impl.ui.chats.ChatTransferScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements e5a.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f259559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f259560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f259561c;
    public dte.c d;
    public ChatTransferScreenContract$InputData e;
    public d5a.a f;

    public m(k kVar, j jVar) {
        this.f259559a = kVar;
        this.f259560b = jVar;
    }

    @Override // e5a.a
    public final e5a.a Q(d5a.a aVar) {
        this.f = aVar;
        return this;
    }

    @Override // e5a.a
    public final e5a.a X(dte.c cVar) {
        this.d = cVar;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f259561c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f259561c, ViewController.class);
        vc.s.h(this.d, dte.c.class);
        vc.s.h(this.e, ChatTransferScreenContract$InputData.class);
        vc.s.h(this.f, mkd.g.class);
        return new n(this.f259559a, this.f259560b, this.f259561c, this.e, this.f);
    }

    @Override // e5a.a
    public final e5a.a g0(ChatTransferScreenContract$InputData chatTransferScreenContract$InputData) {
        chatTransferScreenContract$InputData.getClass();
        this.e = chatTransferScreenContract$InputData;
        return this;
    }
}
