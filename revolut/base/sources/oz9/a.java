package oz9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.flow.PeerToPeerChatFlowContract$InputData;
import java.util.Set;
import ove.w;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements xki.c, a0a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PeerToPeerChatFlowContract$InputData f231122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f231123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f231124c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public a(c cVar, PeerToPeerChatFlowContract$InputData peerToPeerChatFlowContract$InputData) {
        this.f231123b = cVar;
        this.f231122a = peerToPeerChatFlowContract$InputData;
        int i = 11;
        this.d = e4m.b.b(new w(cVar, this, 1, i));
        this.e = e4m.b.b(new w(cVar, this, 0, i));
        this.f = e4m.b.b(cVar.Z);
    }

    @Override // a0a.c
    public final g b() {
        return new g(this.f231123b, this.f231124c, 1);
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
