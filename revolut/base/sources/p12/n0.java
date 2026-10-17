package p12;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.core.ui.impl.ui.breakdown.details.BreakdownDetailsContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class n0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BreakdownDetailsContract$InputData f231731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f231732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f231733c;

    public n0(v vVar, BreakdownDetailsContract$InputData breakdownDetailsContract$InputData) {
        this.f231731a = breakdownDetailsContract$InputData;
        int i = 4;
        this.f231732b = e4m.b.b(new f0(vVar, this, 1, i));
        this.f231733c = e4m.b.b(new f0(vVar, this, 0, i));
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
