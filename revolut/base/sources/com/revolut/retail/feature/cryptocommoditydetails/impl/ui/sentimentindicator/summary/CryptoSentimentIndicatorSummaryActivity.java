package com.revolut.retail.feature.cryptocommoditydetails.impl.ui.sentimentindicator.summary;

import android.os.Bundle;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import grl.k9;
import hpi.b;
import hpi.c;
import hpi.h;
import hpi.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import pri.e;
import xpi.f;
import z4l.j;
import zhm.v;
import zqi.a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/cryptocommoditydetails/impl/ui/sentimentindicator/summary/CryptoSentimentIndicatorSummaryActivity;", "Lhpi/h;", "", "<init>", "()V", "feature_cryptocommodity_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoSentimentIndicatorSummaryActivity extends h implements a {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final AnalyticsProduct.Retail f100165s0;

    public CryptoSentimentIndicatorSummaryActivity() {
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137497g;
        this.f100165s0 = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        new j(7, v.k(new ListSubheaderDelegate(), new TextDelegate(), new RowDelegate(null, null, 7)), false);
    }

    @Override // nri.b
    public final e F0() {
        Intrinsics.r("component");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF81394t0() {
        return ((CryptoSentimentIndicatorSummaryContract$Configuration) G0()).f100166a;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        Intrinsics.r("component");
        throw null;
    }

    @Override // nri.b, no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getG0() {
        return this.f100165s0;
    }

    @Override // hpi.d
    public final c b1() {
        b bVar = new b(new k(BitmapDescriptorFactory.HUE_RED, R$attr.uikit_windowBackground, ISO781611.SMT_TAG));
        f.Companion.getClass();
        f configuration = f.d;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        bVar.f = configuration;
        return bVar;
    }

    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        com.bumptech.glide.c.l(this).b(null, getF81394t0()).getClass();
        throw new ClassCastException();
    }
}
