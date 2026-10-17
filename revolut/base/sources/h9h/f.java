package h9h;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.api.declaration.AddMoneyFeatureConfig;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements kah.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AddMoneyFeatureConfig.CompositeAddMoney.InputData f150300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f150301b;

    public f(a aVar, AddMoneyFeatureConfig.CompositeAddMoney.InputData inputData) {
        this.f150300a = inputData;
        this.f150301b = e4m.b.b(new e(aVar, this));
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
