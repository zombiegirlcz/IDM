package vch;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.q implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        x0 x0Var = (x0) ((v) this.receiver);
        x0Var.getClass();
        k0 k0Var = new k0((CellDetailsDelegate.Model) obj2, x0Var, null);
        return pu7.a.B(x0Var.k, "onCellDetailsTitleClick", k0Var, (Continuation) obj3);
    }
}
