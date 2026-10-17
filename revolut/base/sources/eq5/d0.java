package eq5;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements zp0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f128260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CenteredAmountDelegate.Model f128261b;

    public d0(e0 e0Var, CenteredAmountDelegate.Model model) {
        this.f128260a = e0Var;
        this.f128261b = model;
    }

    @Override // zp0.c
    public final void k(String extractedValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        this.f128260a.f128266c.onNext(new nqi.a(formattedValue, z, this.f128261b));
    }
}
