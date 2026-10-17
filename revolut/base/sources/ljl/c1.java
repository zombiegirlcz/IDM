package ljl;

import com.google.common.collect.ImmutableSet;
import com.revolut.sso.impl.ui.common.accounts_to_apply_changes.AccountsToApplyChangesBottomSheetContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class c1 implements xki.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountsToApplyChangesBottomSheetContract$InputData f195912b;
    public final Object d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f195911a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f195913c = e4m.b.b(new n(this, 5));

    public c1(q0 q0Var, f fVar, AccountsToApplyChangesBottomSheetContract$InputData accountsToApplyChangesBottomSheetContract$InputData) {
        this.d = fVar;
        this.f195912b = accountsToApplyChangesBottomSheetContract$InputData;
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f195911a) {
        }
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f195911a) {
            case 0:
                return ImmutableSet.of((yji.d) ((h) this.d).f195963p.get());
            default:
                return ImmutableSet.of((yji.d) ((f) this.d).f195937l.get());
        }
    }

    public c1(q0 q0Var, h hVar, AccountsToApplyChangesBottomSheetContract$InputData accountsToApplyChangesBottomSheetContract$InputData) {
        this.d = hVar;
        this.f195912b = accountsToApplyChangesBottomSheetContract$InputData;
    }
}
