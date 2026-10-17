package oi9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pay_later.impl.ui.right_to_cancel.summary.SummaryControllerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class x implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SummaryControllerContract$InputData f225581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f225582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f225583c;

    public x(f fVar, w wVar, SummaryControllerContract$InputData summaryControllerContract$InputData) {
        this.f225581a = summaryControllerContract$InputData;
        int i = 15;
        this.f225582b = e4m.g.a(new a(fVar, this, 1, i));
        this.f225583c = e4m.b.b(new a(fVar, this, 0, i));
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
