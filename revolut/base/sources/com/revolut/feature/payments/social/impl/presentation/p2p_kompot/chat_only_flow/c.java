package com.revolut.feature.payments.social.impl.presentation.p2p_kompot.chat_only_flow;

import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import om4.d0;
import xb4.e;
import yji.l;
import yki.i;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends h implements xz9.b {
    public final PeerToPeerChatOnlyFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d0 f79747p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ChatTransferRecipient.ContactRecipient f79748q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f79749r;

    public c(PeerToPeerChatOnlyFlowContract$InputData inputData, d0 backgroundInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(backgroundInteractor, "backgroundInteractor");
        this.o = inputData;
        this.f79747p = backgroundInteractor;
        this.f79748q = new ChatTransferRecipient.ContactRecipient(inputData.f79738a);
        this.f79749r = d.a(this, new xwd.a(this, 7));
    }

    @Override // yji.l
    public final void I1() {
        if (this.f226127l) {
            l.a1(this, this.f79747p.e(this.f79748q), null, null, new a(this, null), 3);
        }
    }

    @Override // yki.j
    public final void M0() {
        l2(new e(this, null, 18), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f79749r;
    }
}
