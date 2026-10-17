package xf6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.MandateSetupBottomSheetContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class x1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MandateSetupBottomSheetContract$InputData f305158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f305159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f305160c;
    public final e4m.e d;

    public x1(y1 y1Var, MandateSetupBottomSheetContract$InputData mandateSetupBottomSheetContract$InputData) {
        this.f305158a = mandateSetupBottomSheetContract$InputData;
        int i = 3;
        this.f305159b = e4m.b.b(new t1(y1Var, this, 1, i));
        this.f305160c = e4m.b.b(new t1(y1Var, this, 2, i));
        this.d = e4m.b.b(new t1(y1Var, this, 0, i));
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
