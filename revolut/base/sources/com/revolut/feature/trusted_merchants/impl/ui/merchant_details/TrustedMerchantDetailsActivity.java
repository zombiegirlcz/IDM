package com.revolut.feature.trusted_merchants.impl.ui.merchant_details;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import hjg.a;
import hpi.h;
import hpi.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import opi.b;
import org.jmrtd.cbeff.ISO781611;
import pgk.f;
import pjg.c;
import pjg.d;
import pri.e;
import te0.w;
import yp0.y;
import z4l.j;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/trusted_merchants/impl/ui/merchant_details/TrustedMerchantDetailsActivity;", "Lhpi/h;", "Lpjg/c;", "Lpjg/d;", "<init>", "()V", "feature_trusted_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TrustedMerchantDetailsActivity extends h implements d {
    public static final /* synthetic */ int y0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public b f94434s0;
    public a u0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f94435t0 = "TRUSTED_MERCHANT_DETAILS_FLOW";

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Object f94436v0 = w.y0(new pgk.d(25));

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Object f94437w0 = w.y0(new pgk.d(26));

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Object f94438x0 = w.y0(new f(this, 6));

    @Override // nri.b
    public final e F0() {
        a aVar = this.u0;
        if (aVar != null) {
            return (c) aVar.z.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF71175s0() {
        return this.f94435t0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        a aVar = this.u0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // hpi.d
    public final hpi.c b1() {
        hpi.b bVar = new hpi.b(new k(BitmapDescriptorFactory.HUE_RED, R$attr.uikit_windowBackground, ISO781611.SMT_TAG));
        xpi.f.Companion.getClass();
        xpi.f configuration = xpi.f.f307976c;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        bVar.f = configuration;
        return bVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        TrustedMerchantDetailsContract$Configuration trustedMerchantDetailsContract$Configuration = (TrustedMerchantDetailsContract$Configuration) G0();
        hjg.d dVar = ((hjg.d) com.bumptech.glide.c.l(this).b(null, this.f94435t0)).f;
        xoi.d dVarG = rd0.e.g(this, bundle, null);
        xpi.f.Companion.getClass();
        a aVar = new a(dVar, dVarG, trustedMerchantDetailsContract$Configuration);
        this.u0 = aVar;
        this.f94434s0 = (b) aVar.v.get();
        super.onCreate(bundle);
        RecyclerView recyclerViewZ0 = Z0();
        y.h(recyclerViewZ0, (j) this.f94438x0.getValue(), new LinearLayoutManager(recyclerViewZ0.getContext()));
        b bVar = this.f94434s0;
        if (bVar != null) {
            bVar.Y("TRUSTED_MERCHANT_DETAILS_DELEGATES_KEY", u.c((TwinHorizontalButtonDelegate) this.f94437w0.getValue()));
        } else {
            Intrinsics.r("expandableDialogActivityDelegate");
            throw null;
        }
    }
}
