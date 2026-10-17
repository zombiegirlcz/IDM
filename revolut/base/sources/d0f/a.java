package d0f;

import android.app.Activity;
import cvi.b;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import ni0.h;
import ni0.k;
import yhm.j;
import yze.d;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f110355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f110356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f110357c;
    public final WeakReference d;

    public a(Activity activity, d paymentConfigurationRepository, k walletPaymentsClientFactory, ni0.d walletOptionsBuilderFactory, mi0.a autoResolveHelperProvider, h walletPaymentDataRequestFactory) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(paymentConfigurationRepository, "paymentConfigurationRepository");
        Intrinsics.checkNotNullParameter(walletPaymentsClientFactory, "walletPaymentsClientFactory");
        Intrinsics.checkNotNullParameter(walletOptionsBuilderFactory, "walletOptionsBuilderFactory");
        Intrinsics.checkNotNullParameter(autoResolveHelperProvider, "autoResolveHelperProvider");
        Intrinsics.checkNotNullParameter(walletPaymentDataRequestFactory, "walletPaymentDataRequestFactory");
        this.f110355a = paymentConfigurationRepository;
        this.f110356b = walletPaymentsClientFactory;
        this.f110357c = j.b(new b(this, activity, 8));
        this.d = new WeakReference(activity);
    }
}
