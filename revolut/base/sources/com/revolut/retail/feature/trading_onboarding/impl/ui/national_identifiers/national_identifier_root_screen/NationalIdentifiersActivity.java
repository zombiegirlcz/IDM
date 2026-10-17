package com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.national_identifier_root_screen;

import android.os.Bundle;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.retail.common.ui.R$id;
import com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.NationalIdentifiersContract$Configuration;
import com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.national_identifier_root_screen.NationalIdentifiersActivity;
import f0l.c;
import hpi.b;
import hpi.h;
import iqi.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pri.e;
import te0.w;
import xpi.f;
import xzk.d;
import yzk.a;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/ui/national_identifiers/national_identifier_root_screen/NationalIdentifiersActivity;", "Lhpi/h;", "Lf0l/c;", "Lxzk/d;", "Lno/m;", "<init>", "()V", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NationalIdentifiersActivity extends h implements d {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ int f104220w0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public a f104221s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Object f104222t0;
    public final String u0 = "TRADING_ONBOARDING_NATIONAL_IDENTIFIERS_FLOW";

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Object f104223v0;

    public NationalIdentifiersActivity() {
        final int i = 0;
        this.f104222t0 = w.y0(new Function0(this) { // from class: f0l.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NationalIdentifiersActivity f131125b;

            {
                this.f131125b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                NationalIdentifiersActivity nationalIdentifiersActivity = this.f131125b;
                switch (i2) {
                    case 0:
                        int i3 = NationalIdentifiersActivity.f104220w0;
                        return (NationalIdentifiersContract$Configuration) nationalIdentifiersActivity.G0();
                    default:
                        int i5 = NationalIdentifiersActivity.f104220w0;
                        return ((NationalIdentifiersContract$Configuration) nationalIdentifiersActivity.f104222t0.getValue()).f104206a.getE();
                }
            }
        });
        final int i2 = 1;
        this.f104223v0 = w.y0(new Function0(this) { // from class: f0l.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NationalIdentifiersActivity f131125b;

            {
                this.f131125b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                NationalIdentifiersActivity nationalIdentifiersActivity = this.f131125b;
                switch (i22) {
                    case 0:
                        int i3 = NationalIdentifiersActivity.f104220w0;
                        return (NationalIdentifiersContract$Configuration) nationalIdentifiersActivity.G0();
                    default:
                        int i5 = NationalIdentifiersActivity.f104220w0;
                        return ((NationalIdentifiersContract$Configuration) nationalIdentifiersActivity.f104222t0.getValue()).f104206a.getE();
                }
            }
        });
    }

    @Override // nri.b
    public final e F0() {
        a aVar = this.f104221s0;
        if (aVar != null) {
            return (c) aVar.B.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF76305t0() {
        return this.u0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        a aVar = this.f104221s0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // nri.b, no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getK() {
        return (AnalyticsProduct) this.f104223v0.getValue();
    }

    @Override // hpi.d
    public final hpi.c b1() {
        b bVar = new b(new hpi.e((Object) null));
        f.Companion.getClass();
        f configuration = f.d;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        bVar.f = configuration;
        g.Companion.getClass();
        g configuration2 = g.f167870b;
        Intrinsics.checkNotNullParameter(configuration2, "configuration");
        bVar.i = configuration2;
        bVar.e = true;
        return bVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        yzk.b bVar = ((yzk.b) com.bumptech.glide.c.l(this).b(null, this.u0)).f318137h;
        xoi.d dVarG = rd0.e.g(this, bundle, Integer.valueOf(R$id.fragment_container));
        NationalIdentifiersContract$Configuration nationalIdentifiersContract$Configuration = (NationalIdentifiersContract$Configuration) this.f104222t0.getValue();
        nationalIdentifiersContract$Configuration.getClass();
        f.Companion.getClass();
        g.Companion.getClass();
        this.f104221s0 = new a(bVar, dVarG, nationalIdentifiersContract$Configuration);
        super.onCreate(bundle);
    }
}
