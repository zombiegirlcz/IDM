package hm9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payees.impl.ui.payees_confirmation_bottom_sheet.PayeesConfirmationBottomSheetScreenContract$InputData;
import hc2.r;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayeesConfirmationBottomSheetScreenContract$InputData f153551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f153552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f153553c;

    public c(b bVar, e eVar, PayeesConfirmationBottomSheetScreenContract$InputData payeesConfirmationBottomSheetScreenContract$InputData) {
        this.f153552b = bVar;
        this.f153551a = payeesConfirmationBottomSheetScreenContract$InputData;
        this.f153553c = e4m.b.b(new r(bVar, this, 4));
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
