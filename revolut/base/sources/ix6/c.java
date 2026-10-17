package ix6;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.feature.freelancer.impl.ui.invoice.create.screen.InvoiceCreateScreen;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.q implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        InputTextDelegate.Model p0 = (InputTextDelegate.Model) obj2;
        InputText p17 = (InputText) obj3;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return InvoiceCreateScreen.d3((InvoiceCreateScreen) this.receiver, p0, p17);
    }
}
