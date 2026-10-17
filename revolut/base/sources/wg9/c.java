package wg9;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.FormScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements zp0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FormScreen f297245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputTextDelegate.Model f297246b;

    public c(FormScreen formScreen, InputTextDelegate.Model model) {
        this.f297245a = formScreen;
        this.f297246b = model;
    }

    @Override // zp0.c
    public final void k(String extractedValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        if (extractedValue.length() <= 0 && !z) {
            return;
        }
        ((com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.a) this.f297245a.d()).M2(this.f297246b.f52580a, extractedValue, formattedValue);
    }
}
