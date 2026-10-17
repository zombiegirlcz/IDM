package jec;

import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        j jVar2 = domainState.f173258a;
        if (jVar2 instanceof h) {
            return new l(LottieImage.Companion.a(LottieImage.INSTANCE, uc0.b.a("mobile/animations/revpay", "terminal_payment_processing"), false, true, null, null, Constants.TAG_SUPPORTED_LOCALE_LIST));
        }
        if (jVar2 instanceof i) {
            return new l(LottieImage.Companion.a(LottieImage.INSTANCE, uc0.b.a("mobile/animations/revpay", "terminal_payment_approved"), false, false, null, null, Constants.TAG_SUPPORTED_LOCALE_LIST));
        }
        if (jVar2 instanceof g) {
            return new l(LottieImage.Companion.a(LottieImage.INSTANCE, uc0.b.a("mobile/animations/revpay", "terminal_payment_declined"), false, false, null, null, Constants.TAG_SUPPORTED_LOCALE_LIST));
        }
        throw new NoWhenBranchMatchedException();
    }
}
