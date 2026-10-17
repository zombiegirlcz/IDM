package p3c;

import kotlin.jvm.internal.Intrinsics;
import kpj.e;
import use.d;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f232730a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f232731b;

    public a(d original) {
        Intrinsics.checkNotNullParameter(original, "original");
        this.f232731b = original;
    }

    public a(e merchantRevolutShopInteractor, d ticketInteractor) {
        Intrinsics.checkNotNullParameter(merchantRevolutShopInteractor, "merchantRevolutShopInteractor");
        Intrinsics.checkNotNullParameter(ticketInteractor, "ticketInteractor");
        this.f232731b = ticketInteractor;
    }
}
