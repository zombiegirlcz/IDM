package com.revolut.feature.card_management.impl.ui.expectations;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bu7.y;
import c03.c;
import c03.l;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import d03.a;
import hpi.b;
import hpi.h;
import hpi.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import pri.e;
import te0.w;
import xoi.d;
import xpi.f;
import z4l.j;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/card_management/impl/ui/expectations/ExpectationManagementActivity;", "Lhpi/h;", "Lc03/l;", "Lc03/c;", "<init>", "()V", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExpectationManagementActivity extends h implements c {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ int f64848w0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public a f64849s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Object f64850t0 = w.y0(new y(28));
    public final Object u0 = w.y0(new y(29));

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final String f64851v0 = "EXPECTATION_MANAGEMENT_FLOW";

    @Override // nri.b
    public final e F0() {
        a aVar = this.f64849s0;
        if (aVar != null) {
            return (l) aVar.z.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF71175s0() {
        return this.f64851v0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        a aVar = this.f64849s0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // hpi.d
    public final hpi.c b1() {
        b bVar = new b(new k(BitmapDescriptorFactory.HUE_RED, R$attr.uikit_colorTransparent, ISO781611.SMT_TAG));
        f.Companion.getClass();
        f configuration = f.f307976c;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        bVar.f = configuration;
        hpi.c.b(bVar);
        return bVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ExpectationManagementContract$Configuration expectationManagementContract$Configuration = (ExpectationManagementContract$Configuration) G0();
        d03.b bVar = ((d03.b) com.bumptech.glide.c.l(this).b(null, this.f64851v0)).d;
        d dVarG = rd0.e.g(this, bundle, null);
        f.Companion.getClass();
        ypi.h.Companion.getClass();
        this.f64849s0 = new a(bVar, dVarG, expectationManagementContract$Configuration);
        super.onCreate(bundle);
        RecyclerView recyclerViewZ0 = Z0();
        yp0.y.h(recyclerViewZ0, (j) this.u0.getValue(), new LinearLayoutManager(recyclerViewZ0.getContext()));
        a aVar = this.f64849s0;
        if (aVar != null) {
            ((opi.b) aVar.f110291l.get()).Y("TERMINATE_AND_REORDER_RECYCLER_DELEGATES_KEY", u.c((LargeActionButtonDelegate) this.f64850t0.getValue()));
        } else {
            Intrinsics.r("activityComponent");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((j) this.u0.getValue()).c(items);
    }
}
