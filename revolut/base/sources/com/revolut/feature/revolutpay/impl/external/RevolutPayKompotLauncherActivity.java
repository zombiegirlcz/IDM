package com.revolut.feature.revolutpay.impl.external;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import cn0.g;
import com.revolut.feature.revolutpay.impl.ui.flow.summary.SummaryFlowContract$PaymentResult;
import com.revolut.kompot.bridge.impl.launcher.KompotLauncherActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mm0.m;
import mm0.o;
import skm.e0;
import ue0.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/external/RevolutPayKompotLauncherActivity;", "Lcom/revolut/kompot/bridge/impl/launcher/KompotLauncherActivity;", "<init>", "()V", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevolutPayKompotLauncherActivity extends KompotLauncherActivity {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ int f84456t0 = 0;

    @Override // com.revolut.kompot.bridge.impl.launcher.KompotLauncherActivity, dri.a
    public final boolean D0() {
        return !isFinishing() && super.D0();
    }

    public final zm0.c Z0() {
        phm.a aVar = (phm.a) e.j(this).a().get(an0.c.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 != null) {
            return ((an0.c) aVar2.b()).j();
        }
        throw new IllegalStateException(a0.d.q("Api ", an0.c.class, " is not found"));
    }

    public final void b1(o session) {
        Intrinsics.checkNotNullParameter(session, "session");
        if (!(session instanceof m) || isFinishing()) {
            return;
        }
        setResult(-1, new Intent().putExtra("PAYMENT_RESULT_EXTRA_KEY", SummaryFlowContract$PaymentResult.DropOff.f84482a));
        finish();
    }

    @Override // com.revolut.kompot.bridge.impl.launcher.KompotLauncherActivity, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e0.C(LifecycleOwnerKt.getLifecycleScope(this), null, null, new cn0.d(this, null, 7), 3);
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        b1(((g) Z0()).d());
        super.onStart();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) {
        super.startActivity(intent, null);
    }
}
