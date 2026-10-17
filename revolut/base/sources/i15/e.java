package i15;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.help.impl.ui.financial_difficulties.self_service.FinancialDifficultiesControllerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FinancialDifficultiesControllerContract$InputData f157565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f157566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f157567c;
    public final e4m.e d;

    public e(d dVar, FinancialDifficultiesControllerContract$InputData financialDifficultiesControllerContract$InputData) {
        this.f157566b = dVar;
        this.f157565a = financialDifficultiesControllerContract$InputData;
        int i = 20;
        this.f157567c = e4m.b.b(new hjg.b(dVar, this, 1, i));
        this.d = e4m.b.b(new hjg.b(dVar, this, 0, i));
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
