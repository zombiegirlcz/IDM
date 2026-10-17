package ch6;

import com.revolut.feature.external_accounts.impl.mandate.create_mandate.a;
import hh6.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import we6.z0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f24135b;

    public /* synthetic */ l(z0 z0Var, int i) {
        this.f24134a = i;
        this.f24135b = z0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f24134a) {
            case 0:
                com.revolut.feature.external_accounts.impl.mandate.create_mandate.a update = (com.revolut.feature.external_accounts.impl.mandate.create_mandate.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                if (update instanceof i) {
                    z0 z0Var = this.f24135b;
                    return i.a((i) update, z0Var.f296698a, z0Var.f296699b, false, 57);
                }
                if (Intrinsics.f(update, a.C0482a.f72441a)) {
                    return update;
                }
                throw new NoWhenBranchMatchedException();
            default:
                hh6.j updateState = (hh6.j) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                if (updateState instanceof hh6.i) {
                    z0 z0Var2 = this.f24135b;
                    return hh6.i.a((hh6.i) updateState, z0Var2.f296698a, z0Var2.f296699b, false, 25);
                }
                if (Intrinsics.f(updateState, j.a.f152262a)) {
                    return updateState;
                }
                throw new NoWhenBranchMatchedException();
        }
    }
}
