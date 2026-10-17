package e2i;

import com.google.firebase.messaging.t;
import kotlin.jvm.internal.Intrinsics;
import wsg.n;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements mm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rea.m f122113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xua.a f122114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eli.j f122115c;
    public final n d;
    public final tm.g e;

    public m(rea.m pocketDetailsInteractor, xua.a recurringPaymentInteractor, eli.j twoFaErrorHandler, n walletInteractor, t actionFactory) {
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(twoFaErrorHandler, "twoFaErrorHandler");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(actionFactory, "actionFactory");
        this.f122113a = pocketDetailsInteractor;
        this.f122114b = recurringPaymentInteractor;
        this.f122115c = twoFaErrorHandler;
        this.d = walletInteractor;
        this.e = actionFactory.g(new l(this, 1));
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        b action = (b) aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        return this.e.a(action);
    }
}
