package s3a;

import com.revolut.feature.payments.who_to_transfer.impl.ui.chats.ChatTransferScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes5.dex */
public final class o implements e5a.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f259579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f259580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public dte.c f259581c;
    public ChatTransferScreenContract$InputData d;
    public d5a.a e;

    public o(k kVar) {
        this.f259579a = kVar;
    }

    @Override // e5a.a
    public final e5a.a Q(d5a.a aVar) {
        this.e = aVar;
        return this;
    }

    @Override // e5a.a
    public final e5a.a X(dte.c cVar) {
        this.f259581c = cVar;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f259580b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f259580b, ViewController.class);
        vc.s.h(this.f259581c, dte.c.class);
        vc.s.h(this.d, ChatTransferScreenContract$InputData.class);
        vc.s.h(this.e, mkd.g.class);
        return new n(this.f259579a, this.f259580b, this.d, this.e);
    }

    @Override // e5a.a
    public final e5a.a g0(ChatTransferScreenContract$InputData chatTransferScreenContract$InputData) {
        chatTransferScreenContract$InputData.getClass();
        this.d = chatTransferScreenContract$InputData;
        return this;
    }
}
