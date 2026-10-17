package com.revolut.feature.insurance_pet.impl.ui.hub.issues.address_not_supported;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aqe.a;
import az7.c;
import az7.g;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import hpi.h;
import hpi.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import pri.e;
import te0.w;
import wy7.b;
import xoi.d;
import xpi.f;
import yp0.y;
import z4l.j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/hub/issues/address_not_supported/AddressNotSupportedActivity;", "Lhpi/h;", "Laz7/g;", "Laz7/c;", "<init>", "()V", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddressNotSupportedActivity extends h implements c {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ int f76318w0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public b f76320t0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Object f76319s0 = w.y0(new a(this, 24));
    public final Object u0 = w.y0(new aw1.a(15));

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Object f76321v0 = w.y0(new aw1.a(16));

    @Override // nri.b
    public final e F0() {
        b bVar = this.f76320t0;
        if (bVar != null) {
            return (g) bVar.f301112p.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF71163r0() {
        return (String) this.f76319s0.getValue();
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        b bVar = this.f76320t0;
        if (bVar != null) {
            return bVar;
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
        cVar.e = true;
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        wy7.f fVar = ((wy7.f) com.bumptech.glide.c.l(this).b(null, getF71163r0())).d;
        d dVarG = rd0.e.g(this, bundle, null);
        f.Companion.getClass();
        ypi.h.Companion.getClass();
        this.f76320t0 = new b(fVar, dVarG);
        super.onCreate(bundle);
        RecyclerView recyclerViewZ0 = Z0();
        y.h(recyclerViewZ0, (j) this.f76321v0.getValue(), new LinearLayoutManager(recyclerViewZ0.getContext()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((j) this.f76321v0.getValue()).c(items);
    }
}
