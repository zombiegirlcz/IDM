package com.revolut.feature.trusted_merchants.impl.ui.trusted_merchants;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import gsi.a;
import hjg.c;
import hpi.h;
import hpi.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import opi.b;
import org.jmrtd.cbeff.ISO781611;
import pri.e;
import q97.p1;
import qjg.d;
import te0.w;
import xpi.f;
import yp0.y;
import z4l.j;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/trusted_merchants/impl/ui/trusted_merchants/TrustedMerchantsActivity;", "Lhpi/h;", "Lqjg/c;", "Lqjg/d;", "<init>", "()V", "feature_trusted_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TrustedMerchantsActivity extends h implements d {
    public static final /* synthetic */ int C0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public b f94440s0;
    public c u0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f94441t0 = "TRUSTED_MERCHANTS_FLOW";

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Object f94442v0 = w.y0(new qh0.d(20));

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Object f94443w0 = w.y0(new qh0.d(21));

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Object f94444x0 = w.y0(new qh0.d(22));
    public final Object y0 = w.y0(new qh0.d(23));
    public final Object z0 = w.y0(new qh0.d(24));
    public final Object A0 = w.y0(new qh0.d(25));
    public final Object B0 = w.y0(new p1(this, 10));

    @Override // nri.b
    public final e F0() {
        c cVar = this.u0;
        if (cVar != null) {
            return (qjg.c) cVar.f152804y.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF71175s0() {
        return this.f94441t0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final a L0() {
        c cVar = this.u0;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // hpi.d
    public final hpi.c b1() {
        hpi.b bVar = new hpi.b(new k(BitmapDescriptorFactory.HUE_RED, R$attr.uikit_windowBackground, ISO781611.SMT_TAG));
        f.Companion.getClass();
        f configuration = f.f307976c;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        bVar.f = configuration;
        return bVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        hjg.d dVar = ((hjg.d) com.bumptech.glide.c.l(this).b(null, this.f94441t0)).f;
        xoi.d dVarG = rd0.e.g(this, bundle, null);
        f.Companion.getClass();
        c cVar = new c(dVar, dVarG);
        this.u0 = cVar;
        this.f94440s0 = (b) cVar.u.get();
        super.onCreate(bundle);
        RecyclerView recyclerViewZ0 = Z0();
        y.h(recyclerViewZ0, (j) this.B0.getValue(), new LinearLayoutManager(recyclerViewZ0.getContext()));
        b bVar = this.f94440s0;
        if (bVar != null) {
            bVar.Y("TRUSTED_MERCHANTS_DELEGATES_KEY", u.c((LargeActionButtonDelegate) this.f94442v0.getValue()));
        } else {
            Intrinsics.r("expandableDialogActivityDelegate");
            throw null;
        }
    }
}
