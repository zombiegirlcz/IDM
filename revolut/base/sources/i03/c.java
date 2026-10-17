package i03;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u03.j;
import u03.l;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y43.a f157283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f157284b;

    public c(y43.a cardPaymentMethodWidget, j cardSettingsItemProvider, l securityItemViewFactory) {
        Intrinsics.checkNotNullParameter(cardPaymentMethodWidget, "cardPaymentMethodWidget");
        Intrinsics.checkNotNullParameter(cardSettingsItemProvider, "cardSettingsItemProvider");
        Intrinsics.checkNotNullParameter(securityItemViewFactory, "securityItemViewFactory");
        this.f157283a = cardPaymentMethodWidget;
        this.f157284b = cardSettingsItemProvider;
    }
}
