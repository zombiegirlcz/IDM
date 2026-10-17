package com.revolut.feature.credit.application.close.ui.legacy;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.Window;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import fp3.a;
import fq3.c;
import grl.k9;
import hpi.h;
import hpi.k;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import org.jmrtd.cbeff.ISO781611;
import pri.e;
import xg4.b;
import xg4.d;
import yhm.j;
import yp0.f0;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/credit/application/close/ui/legacy/CreditApplicationCloseLegacyActivity;", "Lhpi/h;", "Lfq3/b;", "Lfq3/c;", "Lno/m;", "Lfsi/h;", "Lin0/g;", "<init>", "()V", "feature_credit_application_close_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditApplicationCloseLegacyActivity extends h implements c, fsi.h {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final /* synthetic */ int f66215v0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public b f66217t0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final LargeActionButtonDelegate f66216s0 = new LargeActionButtonDelegate();
    public final Lazy u0 = j.b(new a(this, 2));

    @Override // nri.b
    public final e F0() {
        b bVar = this.f66217t0;
        if (bVar != null) {
            return (fq3.b) bVar.u.get();
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF82699s0() {
        return (String) this.u0.getValue();
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        b bVar = this.f66217t0;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // nri.b, no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
    }

    @Override // hpi.d
    public final hpi.c b1() {
        return new hpi.b(new k(BitmapDescriptorFactory.HUE_RED, R$attr.uikit_colorTransparent, ISO781611.SMT_TAG));
    }

    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        this.f66217t0 = new b(((d) ((xg4.e) com.bumptech.glide.c.l(this).b(null, getF82699s0()))).f305559p, rd0.e.g(this, bundle, null), (CreditApplicationCloseLegacyContract$Configuration) G0());
        super.onCreate(bundle);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        w0.p(window, f0.STATUS);
        b bVar = this.f66217t0;
        if (bVar != null) {
            ((opi.b) bVar.i.get()).Y("CLOSE_DELEGATES_KEY", u.c(this.f66216s0));
        } else {
            Intrinsics.r("component");
            throw null;
        }
    }

    @Override // nri.b, in0.g
    public final boolean p0() {
        return true;
    }
}
