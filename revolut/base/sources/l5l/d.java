package l5l;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class d extends q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        LargeActionButtonDelegate.Model p0 = (LargeActionButtonDelegate.Model) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        e eVar = (e) this.receiver;
        eVar.getClass();
        if (Intrinsics.f(p0.getF52269a(), "DONT_SHOW_AGAIN")) {
            eVar.i.f128469a.f137264a.edit().putBoolean("skip_balance_hiding_dialog", true).apply();
        }
        eVar.k.b(false);
        return Unit.f186387a;
    }
}
