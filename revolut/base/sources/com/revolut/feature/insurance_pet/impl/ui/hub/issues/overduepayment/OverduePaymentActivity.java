package com.revolut.feature.insurance_pet.impl.ui.hub.issues.overduepayment;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.insurance_pet.impl.ui.hub.issues.overduepayment.OverduePaymentActivity;
import com.revolut.feature.insurance_pet.impl.ui.hub.issues.overduepayment.OverduePaymentContract$Configuration;
import dv9.r;
import gsi.a;
import hpi.h;
import hpi.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import pri.e;
import te0.w;
import wy7.c;
import xoi.d;
import xpi.f;
import yp0.y;
import z4l.j;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/hub/issues/overduepayment/OverduePaymentActivity;", "Lhpi/h;", "Ldz7/e;", "Ldz7/h;", "<init>", "()V", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OverduePaymentActivity extends h implements dz7.h {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ int f76323w0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Object f76324s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public c f76325t0;
    public final Object u0 = w.y0(new r(22));

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Object f76326v0;

    public OverduePaymentActivity() {
        final int i = 0;
        this.f76324s0 = w.y0(new Function0(this) { // from class: dz7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OverduePaymentActivity f121265b;

            {
                this.f121265b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                OverduePaymentActivity overduePaymentActivity = this.f121265b;
                switch (i2) {
                    case 0:
                        int i3 = OverduePaymentActivity.f76323w0;
                        return ((OverduePaymentContract$Configuration) overduePaymentActivity.G0()).f76327a;
                    default:
                        return new z4l.j(7, v.k((RowDelegate) overduePaymentActivity.u0.getValue(), new RowLoadingDelegate()), false);
                }
            }
        });
        final int i2 = 1;
        this.f76326v0 = w.y0(new Function0(this) { // from class: dz7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OverduePaymentActivity f121265b;

            {
                this.f121265b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                OverduePaymentActivity overduePaymentActivity = this.f121265b;
                switch (i22) {
                    case 0:
                        int i3 = OverduePaymentActivity.f76323w0;
                        return ((OverduePaymentContract$Configuration) overduePaymentActivity.G0()).f76327a;
                    default:
                        return new z4l.j(7, v.k((RowDelegate) overduePaymentActivity.u0.getValue(), new RowLoadingDelegate()), false);
                }
            }
        });
    }

    @Override // nri.b
    public final e F0() {
        c cVar = this.f76325t0;
        if (cVar != null) {
            return (dz7.e) cVar.f301123q.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF76305t0() {
        return (String) this.f76324s0.getValue();
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final a L0() {
        c cVar = this.f76325t0;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // hpi.d
    public final hpi.c b1() {
        hpi.c cVar = new hpi.c(new k(BitmapDescriptorFactory.HUE_RED, R$attr.uikit_windowBackground, ISO781611.SMT_TAG));
        f.Companion.getClass();
        f configuration = f.d;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        cVar.f = configuration;
        hpi.c.b(cVar);
        hpi.c.c(cVar);
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        wy7.f fVar = ((wy7.f) com.bumptech.glide.c.l(this).b(null, getF76305t0())).d;
        d dVarG = rd0.e.g(this, bundle, null);
        f.Companion.getClass();
        ypi.h.Companion.getClass();
        ypi.h hVar = ypi.h.f;
        hVar.getClass();
        this.f76325t0 = new c(fVar, dVarG, hVar);
        super.onCreate(bundle);
        RecyclerView recyclerViewZ0 = Z0();
        y.h(recyclerViewZ0, (j) this.f76326v0.getValue(), new LinearLayoutManager(recyclerViewZ0.getContext()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((j) this.f76326v0.getValue()).c(items);
    }
}
