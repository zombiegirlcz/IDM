package yze;

import android.content.Context;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import ni0.k;
import yhm.j;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f318094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f318095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Boolean f318096c;
    public volatile Boolean d;
    public final Lazy e;

    public c(Context context, ni0.d walletOptionsBuilderFactory, k walletPaymentClientFactory, ni0.b isReadyToPayRequestBuilderFactory, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(context, "context");
        ni0.a walletConstants = ni0.a.f215612a;
        Intrinsics.checkNotNullParameter(walletConstants, "walletConstants");
        Intrinsics.checkNotNullParameter(walletOptionsBuilderFactory, "walletOptionsBuilderFactory");
        Intrinsics.checkNotNullParameter(walletPaymentClientFactory, "walletPaymentClientFactory");
        Intrinsics.checkNotNullParameter(isReadyToPayRequestBuilderFactory, "isReadyToPayRequestBuilderFactory");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f318094a = walletPaymentClientFactory;
        this.f318095b = featureToggleInteractor;
        this.e = j.b(new ywi.b(this, context, 5));
    }
}
