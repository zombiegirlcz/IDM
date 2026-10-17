package anb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.savings.impl.ui.fund_information.FundInfoControllerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FundInfoControllerContract$InputData f6632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f6633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f6634c;

    public e(n nVar, FundInfoControllerContract$InputData fundInfoControllerContract$InputData) {
        this.f6632a = fundInfoControllerContract$InputData;
        int i = 4;
        this.f6633b = e4m.b.b(new ak5.f(nVar, this, 1, i));
        this.f6634c = e4m.b.b(new ak5.f(nVar, this, 0, i));
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
