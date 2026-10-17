package j96;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.direct_deposit.impl.ui_kompot.screen.setup.DirectDepositSetupScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements zp0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DirectDepositSetupScreen f172300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputTextDelegate.Model f172301b;

    public f(DirectDepositSetupScreen directDepositSetupScreen, InputTextDelegate.Model model) {
        this.f172300a = directDepositSetupScreen;
        this.f172301b = model;
    }

    @Override // zp0.c
    public final void k(String extractedValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        ((l) this.f172300a.R2()).I2(new InputTextDelegate.TextData(this.f172301b.f52580a, extractedValue));
    }
}
