package qce;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f0 extends kotlin.jvm.internal.q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        rp0.y yVarF;
        InputChecklistDelegate.Model p0 = (InputChecklistDelegate.Model) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        o0 o0Var = (o0) this.receiver;
        i iVar = o0Var.f244750r;
        qua.p pVarF = ((sce.f) o0Var.f244743h).f();
        String str = p0.f52519a;
        boolean z = p0.f52521c;
        if (Intrinsics.f(str, "CHECKBOX_NZ_DIRECT_DEBIT_CONTACTED_LIST_ID")) {
            yVarF = ((f) iVar).e(pVarF, !z);
        } else {
            if (!Intrinsics.f(str, "CHECKBOX_NZ_DIRECT_DEBIT_REACTIVATED_LIST_ID")) {
                pfm.m mVar = pfm.m.f235744a;
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            }
            yVarF = ((f) iVar).f(pVarF, !z);
        }
        return ((opi.b) o0Var.f244749q).a0(yVarF);
    }
}
