package i9e;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.subscriptions.impl.block_card_subscription.accept_conditions.AcceptConditionsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AcceptConditionsScreenContract$InputData f159675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f159676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f159677c;

    public g(o oVar, h hVar, AcceptConditionsScreenContract$InputData acceptConditionsScreenContract$InputData) {
        this.f159675a = acceptConditionsScreenContract$InputData;
        int i = 29;
        this.f159676b = e4m.b.b(new hjg.b(oVar, this, 1, i));
        this.f159677c = e4m.b.b(new hjg.b(oVar, this, 0, i));
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
