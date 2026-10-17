package vzk;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.q implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        u uVar = (u) ((m) this.receiver);
        uVar.getClass();
        if (Intrinsics.f(((RowDelegate.Model) obj2).f53228a, "TRADING_KYC_NO_NATIONALITY_ITEM_ID")) {
            uVar.A2(new o(uVar, 1));
        }
        return Unit.f186387a;
    }
}
