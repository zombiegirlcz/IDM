package com.revolut.feature.payments.groups.impl.ui_chat.flow;

import aii.q;
import com.revolut.feature.payments.groups.impl.ui_chat.flow.GroupChatFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import in0.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_chat/flow/GroupChatFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "Lin0/g;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GroupChatFlow extends ViewController<q> implements f, g {
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;

    public GroupChatFlow(GroupChatFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_transparent;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: ls9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupChatFlow f199651b;

            {
                this.f199651b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        GroupChatFlow groupChatFlow = this.f199651b;
                        return c.d(R$id.screen_transparent_container, 4, null, groupChatFlow, (b) groupChatFlow.N.getValue());
                    default:
                        return (b) ((kr9.a) this.f199651b.M.getValue()).e.get();
                }
            }
        });
        this.M = w.y0(new lea.b(this, inputData, 25));
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: ls9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupChatFlow f199651b;

            {
                this.f199651b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        GroupChatFlow groupChatFlow = this.f199651b;
                        return c.d(R$id.screen_transparent_container, 4, null, groupChatFlow, (b) groupChatFlow.N.getValue());
                    default:
                        return (b) ((kr9.a) this.f199651b.M.getValue()).e.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (kr9.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (kr9.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (ls9.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.K;
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.L.getValue();
    }
}
