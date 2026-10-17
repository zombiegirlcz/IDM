package c84;

import android.os.Bundle;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends fsi.c {

    @NotNull
    public static final d Companion = new d();
    public static final fsi.b k = new fsi.b("CREDIT_APPLICATION_PLUGIN_ACTIVITY_DELEGATE");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qv3.a f22079h;
    public final BaseDelegatesActivity i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xr3.y f22080j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(qv3.a state, BaseDelegatesActivity activity, xr3.y creditOnboardingLifecycleStorage) {
        super(k);
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(creditOnboardingLifecycleStorage, "creditOnboardingLifecycleStorage");
        this.f22079h = state;
        this.i = activity;
        this.f22080j = creditOnboardingLifecycleStorage;
    }

    public final String N() {
        ks3.b bVar;
        String simpleName = this.i.getClass().getSimpleName();
        CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration = (CreditApplicationPluginFlowContract$Configuration) te0.w.O(this.f22079h.n0());
        return com.google.android.gms.internal.mlkit_vision_face.a.o(simpleName, "_", (creditApplicationPluginFlowContract$Configuration == null || (bVar = creditApplicationPluginFlowContract$Configuration.f66894g) == null) ? null : bVar.name());
    }

    @Override // fsi.a
    public final void onCreate(Bundle bundle) {
        Parcelable parcelableG0 = this.i.G0();
        if (parcelableG0 instanceof CreditApplicationPluginFlowContract$PluginConfigurationContract) {
            this.f22079h.n0().set(((CreditApplicationPluginFlowContract$PluginConfigurationContract) parcelableG0).getF68243a());
        }
    }

    @Override // fsi.a
    public final void onStart() {
        String key = N();
        xr3.y yVar = this.f22080j;
        yVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        ne0.d dVar = yVar.f308246a;
        Collection collection = (List) dVar.get("KEY_CREDIT_ONBOARDING_FLOW_ACTIVE");
        if (collection == null) {
            collection = f0.f322471a;
        }
        dVar.f("KEY_CREDIT_ONBOARDING_FLOW_ACTIVE", d0.F0(key, collection));
    }

    @Override // fsi.c, fsi.a
    public final void onStop() {
        super.onStop();
        String key = N();
        xr3.y yVar = this.f22080j;
        yVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        ne0.d dVar = yVar.f308246a;
        Iterable iterable = (List) dVar.get("KEY_CREDIT_ONBOARDING_FLOW_ACTIVE");
        if (iterable == null) {
            iterable = f0.f322471a;
        }
        dVar.f("KEY_CREDIT_ONBOARDING_FLOW_ACTIVE", d0.A0(iterable, key));
    }
}
