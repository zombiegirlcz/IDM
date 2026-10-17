package oz9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.chat_only_flow.PeerToPeerChatOnlyFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements xki.c, a0a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PeerToPeerChatOnlyFlowContract$InputData f231125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yz9.c f231126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f231127c;
    public final b d = this;
    public final e4m.e e = e4m.b.b(new ogf.b(this, 11));

    public b(c cVar, PeerToPeerChatOnlyFlowContract$InputData peerToPeerChatOnlyFlowContract$InputData, yz9.c cVar2) {
        this.f231127c = cVar;
        this.f231125a = peerToPeerChatOnlyFlowContract$InputData;
        this.f231126b = cVar2;
    }

    @Override // a0a.c
    public final g b() {
        return new g(this.f231127c, this.d, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
