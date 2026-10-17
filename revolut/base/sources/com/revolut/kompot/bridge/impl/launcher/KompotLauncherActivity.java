package com.revolut.kompot.bridge.impl.launcher;

import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import androidx.core.view.WindowCompat;
import androidx.fragment.app.Fragment;
import aw0.y9;
import com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$Configuration;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import dx0.c;
import fsi.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jo0.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import no.d1;
import pri.e;
import thi.a;
import uhi.b;
import uhi.d;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/revolut/kompot/bridge/impl/launcher/KompotLauncherActivity;", "Lcom/revolut/retail/core/ui/activity/BaseDelegatesActivity;", "Lthi/c;", "Lthi/a;", "Ldri/a;", "Lno/d1;", "Lfsi/h;", "Lin0/h;", "<init>", "()V", "kompot_bridge_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class KompotLauncherActivity extends BaseDelegatesActivity implements a, dri.a, d1, h, in0.h {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final String f98252r0 = "KOMPOT_LAUNCHER_FLOW";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public d f98253s0;

    @Override // in0.h
    public final boolean C0() {
        return ((KompotFlowContract$Configuration) G0()).getF98266c();
    }

    public boolean D0() {
        return ((KompotFlowContract$Configuration) G0()).getF98265b();
    }

    @Override // nri.b
    public final e F0() {
        d dVar = this.f98253s0;
        if (dVar != null) {
            return ((b) dVar).o();
        }
        Intrinsics.r("launcherComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF98252r0() {
        return this.f98252r0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        d dVar = this.f98253s0;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.r("launcherComponent");
        throw null;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final void P0() {
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : fragments) {
            if (obj2 instanceof KompotLauncherFragment) {
                arrayList.add(obj2);
            }
        }
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            ((KompotLauncherFragment) it8.next()).onActivityResult(i, i2, intent);
        }
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        if (((Boolean) g.c().getValue()).booleanValue()) {
            Window window = getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
            rv0.h.a(window);
        }
        Intrinsics.checkNotNullParameter(this, "activity");
        Window window2 = getWindow();
        y9 y9Var = y9.THEME;
        Intrinsics.h(window2);
        y9Var.a(window2);
        window2.setStatusBarColor(0);
        dx0.e.c(window2, this, c.DEFAULT);
        k18.c cVar = new k18.c(((uhi.a) com.bumptech.glide.c.l(this).b(null, this.f98252r0)).f280234j);
        cVar.h(rd0.e.g(this, bundle, Integer.valueOf(R.id.content)));
        cVar.j((KompotFlowContract$Configuration) G0());
        this.f98253s0 = (d) cVar.build();
        super.onCreate(bundle);
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        KompotFlowContract$Configuration kompotFlowContract$Configuration = (KompotFlowContract$Configuration) nri.b.H0(intent);
        ParcelableDestination f98264a = kompotFlowContract$Configuration != null ? kompotFlowContract$Configuration.getF98264a() : null;
        if (f98264a != null) {
            intent.putExtra("intent_kompot_destination_key", f98264a);
        }
        super.onNewIntent(intent);
    }
}
