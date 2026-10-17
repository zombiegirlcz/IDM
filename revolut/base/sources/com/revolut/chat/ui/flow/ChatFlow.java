package com.revolut.chat.ui.flow;

import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.ui.flow.ChatFlow;
import com.revolut.chat.ui.flow.ChatFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import h30.n;
import h30.o;
import in0.g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.d1;
import te0.w;
import yki.f;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/chat/ui/flow/ChatFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Lin0/g;", "Lno/d1;", "Lkji/e;", "Lyki/f;", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatFlow extends ViewController<Object> implements g, d1, kji.e, f {
    public final ChatTarget K;
    public final Object L;
    public final Object M;
    public final Object N;

    public ChatFlow(ChatTarget chatTarget) {
        Intrinsics.checkNotNullParameter(chatTarget, "chatTarget");
        this.K = chatTarget;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: a50.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChatFlow f1300b;

            {
                this.f1300b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ChatFlow chatFlow = this.f1300b;
                        return czi.c.d(0, 2, new a0.c(chatFlow, 20), chatFlow, (c) chatFlow.N.getValue());
                    case 1:
                        ChatFlow chatFlow2 = this.f1300b;
                        phm.a aVar = (phm.a) ue0.e.j(chatFlow2.m2()).a().get(h30.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new o(((n) ((h30.a) aVar2.b())).f148930w, chatFlow2, new ChatFlowContract$InputData(chatFlow2.K));
                        }
                        throw new IllegalStateException(a0.d.q("Api ", h30.a.class, " is not found"));
                    default:
                        return ((d50.a) this.f1300b.M.getValue()).B();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: a50.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChatFlow f1300b;

            {
                this.f1300b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ChatFlow chatFlow = this.f1300b;
                        return czi.c.d(0, 2, new a0.c(chatFlow, 20), chatFlow, (c) chatFlow.N.getValue());
                    case 1:
                        ChatFlow chatFlow2 = this.f1300b;
                        phm.a aVar = (phm.a) ue0.e.j(chatFlow2.m2()).a().get(h30.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new o(((n) ((h30.a) aVar2.b())).f148930w, chatFlow2, new ChatFlowContract$InputData(chatFlow2.K));
                        }
                        throw new IllegalStateException(a0.d.q("Api ", h30.a.class, " is not found"));
                    default:
                        return ((d50.a) this.f1300b.M.getValue()).B();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: a50.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChatFlow f1300b;

            {
                this.f1300b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ChatFlow chatFlow = this.f1300b;
                        return czi.c.d(0, 2, new a0.c(chatFlow, 20), chatFlow, (c) chatFlow.N.getValue());
                    case 1:
                        ChatFlow chatFlow2 = this.f1300b;
                        phm.a aVar = (phm.a) ue0.e.j(chatFlow2.m2()).a().get(h30.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new o(((n) ((h30.a) aVar2.b())).f148930w, chatFlow2, new ChatFlowContract$InputData(chatFlow2.K));
                        }
                        throw new IllegalStateException(a0.d.q("Api ", h30.a.class, " is not found"));
                    default:
                        return ((d50.a) this.f1300b.M.getValue()).B();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (d50.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (d50.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (a50.c) this.N.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        ChatTarget chatTarget = this.K;
        if (!(chatTarget instanceof ChatTarget.Messages)) {
            if (chatTarget instanceof ChatTarget.ChatList) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
        int i = a50.b.f1301a[((ChatTarget.Messages) chatTarget).f51049a.s0().ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: r2 */
    public final Boolean getN() {
        return Boolean.FALSE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.L.getValue();
    }
}
