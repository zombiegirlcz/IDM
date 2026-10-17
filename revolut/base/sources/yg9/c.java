package yg9;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.SubformScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements zp0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SubformScreen f313579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputTextDelegate.Model f313580b;

    public c(SubformScreen subformScreen, InputTextDelegate.Model model) {
        this.f313579a = subformScreen;
        this.f313580b = model;
    }

    @Override // zp0.c
    public final void k(String extractedValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        if (extractedValue.length() <= 0 && !z) {
            return;
        }
        ((com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.a) this.f313579a.d()).L2(this.f313580b.f52580a, extractedValue, formattedValue);
    }
}
