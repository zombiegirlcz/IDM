package com.revolut.feature.in_app_calls;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import be7.f;
import be7.k;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.in_app_calls.declaration.InAppCallDestination;
import com.revolut.feature.in_app_calls.declaration.InAppCallInputData;
import com.revolut.kompot.bridge.impl.launcher.KompotLauncherActivity;
import com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$Configuration;
import de7.d;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ue0.e;
import vc.s;

/* JADX INFO: loaded from: classes21.dex */
@f
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00052\u00020\u00012\u00020\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/in_app_calls/CallActivity;", "Lcom/revolut/kompot/bridge/impl/launcher/KompotLauncherActivity;", "Lno/m;", "<init>", "()V", "Companion", "a", "feature_in_app_calls_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CallActivity extends KompotLauncherActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public k f74774t0;
    public final AnalyticsProduct.Retail u0;

    /* JADX INFO: renamed from: com.revolut.feature.in_app_calls.CallActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static Intent a(int i, Context context) {
            Intent intent = new Intent(context, (Class<?>) CallActivity.class);
            intent.addFlags(336068608);
            intent.putExtra("EXTRA_CALL_MODE", i);
            intent.putExtra("CONFIGURATION_ARG", new KompotFlowContract$Configuration.Standalone(new InAppCallDestination(new InAppCallInputData(i != 1 ? i != 2 ? d.RINGING : d.OPEN_ACTIVE : d.ACCEPT)), true, false));
            return intent;
        }
    }

    public CallActivity() {
        k9 k9Var = k9.Chat;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.u0 = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
    }

    @Override // com.revolut.kompot.bridge.impl.launcher.KompotLauncherActivity, dri.a
    public final boolean D0() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O0() {
        /*
            r6 = this;
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r6.getSystemService(r0)
            boolean r1 = r0 instanceof android.app.ActivityManager
            r2 = 0
            if (r1 == 0) goto Le
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            goto Lf
        Le:
            r0 = r2
        Lf:
            r1 = 0
            r3 = 1
            if (r0 == 0) goto L5d
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r4 < r5) goto L5d
            java.util.List r0 = r0.getAppTasks()
            java.lang.String r4 = "getAppTasks(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r4 = r0 instanceof java.util.Collection
            if (r4 == 0) goto L33
            r4 = r0
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L33
            r4 = r1
            goto L59
        L33:
            java.util.Iterator r0 = r0.iterator()
            r4 = r1
        L38:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L59
            java.lang.Object r5 = r0.next()
            android.app.ActivityManager$AppTask r5 = (android.app.ActivityManager.AppTask) r5
            android.app.ActivityManager$RecentTaskInfo r5 = r5.getTaskInfo()
            if (r5 == 0) goto L38
            boolean r5 = a41.g.q(r5)
            if (r5 != r3) goto L38
            int r4 = r4 + 1
            if (r4 < 0) goto L55
            goto L38
        L55:
            zhm.v.r()
            throw r2
        L59:
            if (r4 <= r3) goto L6c
        L5b:
            r1 = r3
            goto L6c
        L5d:
            if (r0 == 0) goto L6c
            java.util.List r0 = r0.getAppTasks()
            if (r0 == 0) goto L6c
            int r0 = r0.size()
            if (r0 <= r3) goto L6c
            goto L5b
        L6c:
            super.O0()
            if (r1 != 0) goto L87
            android.content.pm.PackageManager r0 = r6.getPackageManager()
            java.lang.String r1 = r6.getPackageName()
            android.content.Intent r0 = r0.getLaunchIntentForPackage(r1)
            if (r0 == 0) goto L87
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r1)
            r6.startActivity(r0)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.in_app_calls.CallActivity.O0():void");
    }

    @Override // nri.b, no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getT() {
        return this.u0;
    }

    public final void Z0(Intent intent) {
        if (intent.getIntExtra("EXTRA_CALL_MODE", 0) == 1) {
            k kVar = this.f74774t0;
            if (kVar == null) {
                Intrinsics.r("inAppCallsInteractor");
                throw null;
            }
            b bVar = (b) kVar;
            InAppCallStateWithData inAppCallStateWithData = (InAppCallStateWithData) bVar.f74794b.f();
            if ((inAppCallStateWithData != null ? inAppCallStateWithData.f74785a : null) == be7.a.RINGING) {
                bVar.e(new bbh.a(17));
            }
        }
    }

    @Override // com.revolut.kompot.bridge.impl.launcher.KompotLauncherActivity, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        phm.a aVar = (phm.a) e.j(this).a().get(ee7.a.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 == null) {
            throw new IllegalStateException(a0.d.q("Api ", ee7.a.class, " is not found"));
        }
        ee7.a aVar3 = (ee7.a) aVar2.b();
        this.f74774t0 = (k) aVar3.f125115h.get();
        l70.e eVar = aVar3.f125111a;
        z70.a contextProvider = eVar.f();
        s.j(contextProvider);
        s70.a intentProvider = eVar.m();
        s.j(intentProvider);
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        setTheme(R$style.InAppCall_Screen);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        Z0(intent);
    }

    @Override // com.revolut.kompot.bridge.impl.launcher.KompotLauncherActivity, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Z0(intent);
    }
}
