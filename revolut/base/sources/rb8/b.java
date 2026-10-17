package rb8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.junior_allowance.impl.ui.flow.allowance.JuniorAllowanceFlowContract$InputData;
import java.util.Set;
import r6e.m;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorAllowanceFlowContract$InputData f252986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f252987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f252988c;

    public b(a aVar, JuniorAllowanceFlowContract$InputData juniorAllowanceFlowContract$InputData) {
        this.f252987b = aVar;
        this.f252986a = juniorAllowanceFlowContract$InputData;
        this.f252988c = e4m.b.b(new m(aVar, this, 5));
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
