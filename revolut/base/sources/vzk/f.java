package vzk;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class f extends kotlin.jvm.internal.q implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        u uVar = (u) ((m) this.receiver);
        uVar.getClass();
        if (Intrinsics.f(((FullScreenStateDelegate.Model) obj2).f52373a, "ERROR_STATE_ID")) {
            uVar.z2();
        }
        return Unit.f186387a;
    }
}
