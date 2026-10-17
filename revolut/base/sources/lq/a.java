package lq;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bq.i;
import com.revolut.kompot.R$id;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pri.e;
import sri.m;
import vc.s;
import xoi.d;

/* JADX INFO: loaded from: classes17.dex */
public abstract class a extends BaseDelegatesActivity implements Function0 {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f199156r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public iq.c f199157s0;

    @Override // nri.b
    public final e F0() {
        if (this.f199156r0 == 0) {
            return null;
        }
        iq.c cVar = this.f199157s0;
        if (cVar == null) {
            Intrinsics.r("component");
            throw null;
        }
        d dVar = cVar.f167781a;
        m mVarL = i.l(dVar);
        iq.b bVar = cVar.d;
        asi.d dVarC = ((j51.a) bVar.f167776j).c();
        s.j(dVarC);
        c cVar2 = new c(mVarL, dVarC, bVar.k.a(), cVar.f167782b.intValue(), cVar.f167783c);
        kli.a.p(cVar2, i.d(dVar));
        return cVar2;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF85901s0() {
        return null;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        iq.c cVar = this.f199157s0;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.r("component");
        throw null;
    }

    public abstract KompotDestination Z0(int i);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Z0(this.f199156r0);
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        phm.a aVar = (phm.a) ue0.e.j(this).a().get(iq.b.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 == null) {
            throw new IllegalStateException(a0.d.q("Api ", iq.b.class, " is not found"));
        }
        iq.b bVar = ((iq.b) aVar2.b()).f167777l;
        this.f199156r0 = getIntent().getIntExtra("appWidgetId", 0);
        this.f199157s0 = new iq.c(bVar, rd0.e.g(this, bundle, Integer.valueOf(R$id.container)), Integer.valueOf(this.f199156r0), this);
        super.onCreate(bundle);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(R$id.container);
        setContentView(frameLayout);
        if (this.f199156r0 == 0) {
            finish();
        }
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        e eVar = this.f218652a0;
        c cVar = eVar instanceof c ? (c) eVar : null;
        if (cVar != null) {
            boolean z = false;
            if (!cVar.isAttached()) {
                int i = b.f199158a[cVar.k.a().ordinal()];
                if (i == 1 || i == 2 || i == 3) {
                    z = true;
                } else if (i != 4 && i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                z = !z;
            }
            if (z) {
                finish();
            }
        }
    }
}
