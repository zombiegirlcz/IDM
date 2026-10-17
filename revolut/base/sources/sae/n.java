package sae;

import cli.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class n implements cli.n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vae.d f261394a;

    public n(vae.c paymentBalancePickerFooterMapper, vae.d paymentBalancePickerItemsMapper, vae.e paymentBalancePickerItemsPositionMapper) {
        Intrinsics.checkNotNullParameter(paymentBalancePickerFooterMapper, "paymentBalancePickerFooterMapper");
        Intrinsics.checkNotNullParameter(paymentBalancePickerItemsMapper, "paymentBalancePickerItemsMapper");
        Intrinsics.checkNotNullParameter(paymentBalancePickerItemsPositionMapper, "paymentBalancePickerItemsPositionMapper");
        this.f261394a = paymentBalancePickerItemsMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (k) iii.c.f(domainState.f261389a, new s78.d(this, domainState, 18), new s42.f(20, domainState, this), new rbe.c(this, domainState, 27));
    }
}
