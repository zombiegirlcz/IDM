package sz7;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import ihm.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements zp0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f266772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputTextDelegate.Model f266773b;

    public c(f fVar, InputTextDelegate.Model model) {
        this.f266772a = fVar;
        this.f266773b = model;
    }

    @Override // zp0.c
    public final void k(String extractedValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        this.f266772a.onNext(new nqi.a(extractedValue, z, this.f266773b));
    }
}
