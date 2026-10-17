package t42;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class k extends kotlin.jvm.internal.q implements Function1 {
    public static final k f = new k();

    public k() {
        super(1, w02.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/apm/core/ui/api/databinding/ScreenTransferAmountBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return w02.b.a(p0);
    }
}
