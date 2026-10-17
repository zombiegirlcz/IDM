package lb0;

import com.revolut.core.backend_flow.impl.ui.form_screen.FormController;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements zp0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FormController f193526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AmountEditDelegate.Model f193527b;

    public c(FormController formController, AmountEditDelegate.Model model) {
        this.f193526a = formController;
        this.f193527b = model;
    }

    @Override // zp0.c
    public final void k(String extractedValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        this.f193526a.f51269k0.onNext(new Pair(this.f193527b.f51624a, formattedValue));
    }
}
