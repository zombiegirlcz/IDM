package raf;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n nVar = (n) ((h) this.receiver);
        nVar.getClass();
        m mVar = new m((RowDelegate.Model) obj2, nVar, null);
        return pu7.a.B(nVar.k, "NewTransferAccountSelectorScreenModel_onRowDelegateClick", mVar, (Continuation) obj3);
    }
}
