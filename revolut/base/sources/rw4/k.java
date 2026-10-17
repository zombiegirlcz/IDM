package rw4;

import kotlin.jvm.internal.Intrinsics;
import om4.n4;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements gm4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final al4.n f257832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n4 f257833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f257834c;
    public final n d;
    public final wie.a e;

    public k(al4.n creditCardInteractor, n4 securedCreditCardInteractor, o withdrawalWidgetMapper, n withdrawalWidgetDialogProvider, wie.a creditAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(securedCreditCardInteractor, "securedCreditCardInteractor");
        Intrinsics.checkNotNullParameter(withdrawalWidgetMapper, "withdrawalWidgetMapper");
        Intrinsics.checkNotNullParameter(withdrawalWidgetDialogProvider, "withdrawalWidgetDialogProvider");
        Intrinsics.checkNotNullParameter(creditAccountDestinationResolver, "creditAccountDestinationResolver");
        this.f257832a = creditCardInteractor;
        this.f257833b = securedCreditCardInteractor;
        this.f257834c = withdrawalWidgetMapper;
        this.d = withdrawalWidgetDialogProvider;
        this.e = creditAccountDestinationResolver;
    }
}
