package i9e;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.subscriptions.impl.block_card_subscription.screen.BlockSubscriptionScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlockSubscriptionScreenContract$InputData f159690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f159691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f159692c;

    public k(o oVar, h hVar, BlockSubscriptionScreenContract$InputData blockSubscriptionScreenContract$InputData) {
        this.f159690a = blockSubscriptionScreenContract$InputData;
        this.f159691b = e4m.b.b(new ehe.o(oVar, hVar, this, 1, 28));
        this.f159692c = e4m.b.b(new ehe.o(oVar, hVar, this, 0, 28));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
