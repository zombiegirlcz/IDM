package com.revolut.feature.credit.application.plugins.impl.ui.backendflow;

import android.os.Bundle;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.credit.application.plugins.impl.ui.backendflow.CreditBackendFlowActivity;
import com.revolut.feature.credit.application.plugins.impl.ui.backendflow.CreditBackendFlowContract$Configuration;
import com.revolut.retail.common.ui.R$id;
import hqi.i;
import iqi.g;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import na4.c;
import no.k;
import p54.e;
import p54.f;
import qc0.b;
import r54.a;
import yhm.j;
import zc0.h;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/backendflow/CreditBackendFlowActivity;", "Lqc0/b;", "Lp54/d;", "Lp54/f;", "Lno/k;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditBackendFlowActivity extends b implements f, k {
    public static final /* synthetic */ int L0 = 0;
    public AnalyticsContext G0;
    public e H0;
    public final Lazy I0;
    public final Lazy J0;
    public a K0;

    public CreditBackendFlowActivity() {
        final int i = 0;
        this.I0 = j.b(new Function0(this) { // from class: p54.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditBackendFlowActivity f233002b;

            {
                this.f233002b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditBackendFlowActivity creditBackendFlowActivity = this.f233002b;
                switch (i2) {
                    case 0:
                        int i3 = CreditBackendFlowActivity.L0;
                        return (CreditBackendFlowContract$Configuration) creditBackendFlowActivity.G0();
                    default:
                        int i5 = CreditBackendFlowActivity.L0;
                        return creditBackendFlowActivity.b1().getE().f66891a;
                }
            }
        });
        final int i2 = 1;
        this.J0 = j.b(new Function0(this) { // from class: p54.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditBackendFlowActivity f233002b;

            {
                this.f233002b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditBackendFlowActivity creditBackendFlowActivity = this.f233002b;
                switch (i22) {
                    case 0:
                        int i3 = CreditBackendFlowActivity.L0;
                        return (CreditBackendFlowContract$Configuration) creditBackendFlowActivity.G0();
                    default:
                        int i5 = CreditBackendFlowActivity.L0;
                        return creditBackendFlowActivity.b1().getE().f66891a;
                }
            }
        });
    }

    @Override // nri.b
    public final pri.e F0() {
        a aVar = this.K0;
        if (aVar != null) {
            return aVar.b();
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF81955s0() {
        return (String) this.J0.getValue();
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.G0 = analyticsContext;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        a aVar = this.K0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getK() {
        return this.G0;
    }

    @Override // qc0.b
    public final h Z0() {
        a aVar = this.K0;
        if (aVar != null) {
            return aVar.j();
        }
        Intrinsics.r("component");
        throw null;
    }

    public final CreditBackendFlowContract$Configuration b1() {
        return (CreditBackendFlowContract$Configuration) this.I0.getValue();
    }

    @Override // qc0.b, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c cVar = (c) ((r54.b) com.bumptech.glide.c.l(this).b(null, getF81955s0())).a().h(rd0.e.g(this, bundle, Integer.valueOf(R$id.fragment_container)));
        CreditBackendFlowContract$Configuration creditBackendFlowContract$ConfigurationB1 = b1();
        switch (cVar.f213724a) {
            case 0:
                creditBackendFlowContract$ConfigurationB1.getClass();
                cVar.f213727g = creditBackendFlowContract$ConfigurationB1;
                break;
            case 1:
                creditBackendFlowContract$ConfigurationB1.getClass();
                cVar.f213727g = creditBackendFlowContract$ConfigurationB1;
                break;
            default:
                creditBackendFlowContract$ConfigurationB1.getClass();
                cVar.f213727g = creditBackendFlowContract$ConfigurationB1;
                break;
        }
        i.Companion.getClass();
        c cVar2 = (c) cVar.g(i.d);
        xpi.f.Companion.getClass();
        c cVar3 = (c) cVar2.k();
        int i = R$id.bottom_layout;
        a aVar = (a) ((c) ((c) cVar3.b(new ypi.h(Integer.valueOf(R$id.next_button), Integer.valueOf(i), Integer.valueOf(com.revolut.core.backend_flow.R$id.next_button_above_note_text)))).a(new g(R$id.twinVerticalButton))).build();
        this.K0 = aVar;
        if (aVar == null) {
            Intrinsics.r("component");
            throw null;
        }
        aVar.B(this);
        if (bundle == null) {
            e eVar = this.H0;
            if (eVar == null) {
                Intrinsics.r("state");
                throw null;
            }
            eVar.J().set(b1().f67153a);
            e eVar2 = this.H0;
            if (eVar2 == null) {
                Intrinsics.r("state");
                throw null;
            }
            eVar2.V().set(Boolean.valueOf(b1().f67154b));
            e eVar3 = this.H0;
            if (eVar3 == null) {
                Intrinsics.r("state");
                throw null;
            }
            eVar3.n().set(Boolean.valueOf(b1().f));
            e eVar4 = this.H0;
            if (eVar4 == null) {
                Intrinsics.r("state");
                throw null;
            }
            te0.e eVarA = eVar4.a();
            od0.h hVar = od0.i.Companion;
            Parcelable parcelable = b1().d;
            hVar.getClass();
            eVarA.set(od0.h.a(parcelable));
        }
        super.onCreate(bundle);
    }

    @Override // nri.b, in0.g
    public final boolean p0() {
        return true;
    }
}
