package com.revolut.feature.support.impl.ui.troubleshooting.carddelivery;

import android.os.Bundle;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.retail.common.ui.R$id;
import grl.k9;
import hpi.c;
import hpi.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nee.d;
import nee.e;
import pee.a;
import xpi.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/support/impl/ui/troubleshooting/carddelivery/CardDeliveryActivity;", "Lhpi/h;", "Lnee/b;", "Lnee/e;", "<init>", "()V", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardDeliveryActivity extends h implements e {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final AnalyticsProduct.Retail f89424s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public a f89425t0;

    public CardDeliveryActivity() {
        AnalyticsProduct.Companion aVar = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137496c;
        this.f89424s0 = com.google.android.gms.internal.mlkit_vision_face.a.g(aVar, k9Var, k9Var);
    }

    @Override // nri.b
    public final pri.e F0() {
        return c1().l();
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF96906t0() {
        String str;
        CardDeliveryConfiguration cardDeliveryConfiguration = (CardDeliveryConfiguration) I0();
        return (cardDeliveryConfiguration == null || (str = cardDeliveryConfiguration.f89427b) == null) ? "SUPPORT_TROUBLESHOOTING_FLOW" : str;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        return c1();
    }

    @Override // nri.b, no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getG0() {
        return this.f89424s0;
    }

    @Override // hpi.d
    public final c b1() {
        c cVar = new c(new hpi.e((Object) null));
        f.Companion.getClass();
        f configuration = f.f307976c;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        cVar.f = configuration;
        return cVar;
    }

    public final a c1() {
        a aVar = this.f89425t0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x004e. Please report as an issue. */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        vee.a aVar;
        CardDeliveryConfiguration cardDeliveryConfiguration = (CardDeliveryConfiguration) G0();
        vee.c cVar = (vee.c) com.bumptech.glide.c.l(this).b(null, getF96906t0());
        switch (cVar.f288308a) {
            case 0:
                aVar = new vee.a((vee.c) cVar.o, 0);
                break;
            default:
                aVar = new vee.a((vee.c) cVar.o, 1);
                break;
        }
        f.Companion.getClass();
        vee.a aVar2 = (vee.a) ((vee.a) aVar.k()).h(rd0.e.g(this, bundle, Integer.valueOf(R$id.fragment_container)));
        String str = cardDeliveryConfiguration.f89426a;
        switch (aVar2.f288290a) {
        }
        uce.c cVar2 = cardDeliveryConfiguration.e;
        switch (aVar2.f288290a) {
            case 0:
                cVar2.getClass();
                aVar2.e = cVar2;
                break;
            default:
                cVar2.getClass();
                aVar2.e = cVar2;
                break;
        }
        e80.c cVar3 = new e80.c();
        switch (aVar2.f288290a) {
            case 0:
                aVar2.d = cVar3;
                break;
            default:
                aVar2.d = cVar3;
                break;
        }
        a aVar3 = (a) aVar2.build();
        Intrinsics.checkNotNullParameter(aVar3, "<set-?>");
        this.f89425t0 = aVar3;
        c1();
        d dVarState = c1().state();
        dVarState.f214489a.set(str);
        dVarState.f214490b.set(cardDeliveryConfiguration.f89428c);
        dVarState.f214491c.set(cardDeliveryConfiguration.d);
        super.onCreate(bundle);
    }
}
