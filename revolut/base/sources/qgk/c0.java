package qgk;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_documents_bottom_sheet.PlanDocumentsBottomSheetScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class c0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanDocumentsBottomSheetScreenContract$InputData f245899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f245900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f245901c;
    public final e4m.e d;

    public c0(i0 i0Var, PlanDocumentsBottomSheetScreenContract$InputData planDocumentsBottomSheetScreenContract$InputData) {
        this.f245900b = i0Var;
        this.f245899a = planDocumentsBottomSheetScreenContract$InputData;
        int i = 8;
        this.f245901c = e4m.b.b(new m(i0Var, this, 1, i));
        this.d = e4m.b.b(new m(i0Var, this, 0, i));
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
