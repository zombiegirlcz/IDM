package m8c;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class s implements jki.p {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c6c.a f203488a;

    public s(b deferredPaymentListItemFactory, c deferredPaymentNavBarActionFactory, c6c.a deferredPaymentMerchantIconMapper) {
        Intrinsics.checkNotNullParameter(deferredPaymentListItemFactory, "deferredPaymentListItemFactory");
        Intrinsics.checkNotNullParameter(deferredPaymentNavBarActionFactory, "deferredPaymentNavBarActionFactory");
        Intrinsics.checkNotNullParameter(deferredPaymentMerchantIconMapper, "deferredPaymentMerchantIconMapper");
        this.f203488a = deferredPaymentMerchantIconMapper;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        k domainState = (k) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (m) iii.c.f(domainState.f203473a, new m62.l(this), new m56.g(this, 16), new lk7.n(this, 22));
    }
}
