package com.revolut.retail.feature.trading_onboarding.impl.ui.completed.screen;

import android.os.Bundle;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.trading_onboarding.impl.ui.completed.CompletedContract$Configuration;
import com.revolut.retail.feature.trading_onboarding.impl.ui.completed.screen.CompletedActivity;
import hpi.h;
import k3l.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pri.e;
import syk.c;
import syk.f;
import syk.p;
import te0.w;
import tyk.a;
import uyk.g;
import vc.s;
import xoi.d;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/ui/completed/screen/CompletedActivity;", "Lsyk/c;", "Lhpi/h;", "Luyk/g;", "Lno/m;", "<init>", "()V", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CompletedActivity extends h implements c {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ int f104146w0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final String f104147s0 = "TRADING_ONBOARDING_COMPLETED";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public a f104148t0;
    public final Object u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Object f104149v0;

    public CompletedActivity() {
        final int i = 0;
        this.u0 = w.y0(new Function0(this) { // from class: uyk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CompletedActivity f284442b;

            {
                this.f284442b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CompletedActivity completedActivity = this.f284442b;
                switch (i2) {
                    case 0:
                        int i3 = CompletedActivity.f104146w0;
                        return (CompletedContract$Configuration) completedActivity.G0();
                    default:
                        int i5 = CompletedActivity.f104146w0;
                        return ((CompletedContract$Configuration) completedActivity.u0.getValue()).f104145a.getE();
                }
            }
        });
        final int i2 = 1;
        this.f104149v0 = w.y0(new Function0(this) { // from class: uyk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CompletedActivity f284442b;

            {
                this.f284442b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CompletedActivity completedActivity = this.f284442b;
                switch (i22) {
                    case 0:
                        int i3 = CompletedActivity.f104146w0;
                        return (CompletedContract$Configuration) completedActivity.G0();
                    default:
                        int i5 = CompletedActivity.f104146w0;
                        return ((CompletedContract$Configuration) completedActivity.u0.getValue()).f104145a.getE();
                }
            }
        });
    }

    @Override // nri.b
    public final e F0() {
        a aVar = this.f104148t0;
        if (aVar == null) {
            Intrinsics.r("activityComponent");
            throw null;
        }
        b bVar = (b) aVar.o.get();
        tyk.b bVar2 = aVar.f275686c;
        p pVar = (p) bVar2.f275717y.get();
        sf0.h hVarB = bVar2.f275703c.b();
        s.j(hVarB);
        v60.e eVarA = bVar2.d.a();
        s.j(eVarA);
        gte.a aVarB = bVar2.f275704g.b();
        s.j(aVarB);
        return new g(bVar, pVar, new f(hVarB, eVarA, aVarB), aVar.f275685b, (syk.b) bVar2.z.get());
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF71163r0() {
        return this.f104147s0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        a aVar = this.f104148t0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // nri.b, no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return (AnalyticsProduct) this.f104149v0.getValue();
    }

    @Override // hpi.d
    public final hpi.c b1() {
        return new hpi.b(new hpi.e(R$attr.uikit_colorTransparent));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        tyk.b bVar = ((tyk.b) com.bumptech.glide.c.l(this).b(null, this.f104147s0)).f275706j;
        d dVarG = rd0.e.g(this, bundle, null);
        CompletedContract$Configuration completedContract$Configuration = (CompletedContract$Configuration) this.u0.getValue();
        completedContract$Configuration.getClass();
        this.f104148t0 = new a(bVar, dVarG, completedContract$Configuration);
        super.onCreate(bundle);
    }
}
