package com.revolut.retail.feature.stockdetails.impl.ui.activities.statements;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import bq.i;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.feature.stockdetails.impl.R$id;
import com.revolut.retail.feature.stockdetails.impl.R$layout;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.StockFinancialsStatementsActivity;
import csk.d;
import csk.g;
import csk.j;
import csk.q;
import grl.k9;
import ihm.f;
import j90.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import le.u1;
import opi.b;
import te0.w;
import tri.c;
import zhm.f0;
import zhm.u;
import zrk.e;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/activities/statements/StockFinancialsStatementsActivity;", "Lcom/revolut/retail/core/ui/activity/BaseDelegatesActivity;", "", "Lcsk/g;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StockFinancialsStatementsActivity extends BaseDelegatesActivity implements g {
    public static final /* synthetic */ KProperty[] A0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AnalyticsProduct.Retail f103788r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public e f103789s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final a f103790t0;
    public final a u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final SingleChoiceDelegate f103791v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Object f103792w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Object f103793x0;
    public final f y0;
    public Object z0;

    static {
        h0 h0Var = new h0(StockFinancialsStatementsActivity.class, "tabs", "getTabs()Lcom/revolut/core/ui_kit/views/Tabs;", 0);
        p0 p0Var = o0.f186429a;
        A0 = new KProperty[]{p0Var.j(h0Var), p.a.y(StockFinancialsStatementsActivity.class, "viewPager", "getViewPager()Landroidx/viewpager/widget/ViewPager;", 0, p0Var)};
    }

    public StockFinancialsStatementsActivity() {
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137505r;
        this.f103788r0 = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.f103790t0 = u1.w(this, R$id.tabs);
        this.u0 = u1.w(this, R$id.viewPager);
        this.f103791v0 = new SingleChoiceDelegate();
        final int i = 0;
        this.f103792w0 = w.y0(new Function0(this) { // from class: csk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockFinancialsStatementsActivity f108510b;

            {
                this.f108510b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StockFinancialsStatementsActivity stockFinancialsStatementsActivity = this.f108510b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = StockFinancialsStatementsActivity.A0;
                        FragmentManager supportFragmentManager = stockFinancialsStatementsActivity.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                        return new vqi.c(stockFinancialsStatementsActivity, supportFragmentManager, sri.o.c(stockFinancialsStatementsActivity, null, null, 14).a());
                    default:
                        KProperty[] kPropertyArr2 = StockFinancialsStatementsActivity.A0;
                        return new b(stockFinancialsStatementsActivity);
                }
            }
        });
        final int i2 = 1;
        this.f103793x0 = w.y0(new Function0(this) { // from class: csk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockFinancialsStatementsActivity f108510b;

            {
                this.f108510b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StockFinancialsStatementsActivity stockFinancialsStatementsActivity = this.f108510b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StockFinancialsStatementsActivity.A0;
                        FragmentManager supportFragmentManager = stockFinancialsStatementsActivity.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                        return new vqi.c(stockFinancialsStatementsActivity, supportFragmentManager, sri.o.c(stockFinancialsStatementsActivity, null, null, 14).a());
                    default:
                        KProperty[] kPropertyArr2 = StockFinancialsStatementsActivity.A0;
                        return new b(stockFinancialsStatementsActivity);
                }
            }
        });
        this.y0 = v0.a.d("create(...)");
        this.z0 = f0.f322471a;
    }

    @Override // nri.b
    public final pri.e F0() {
        e eVar = this.f103789s0;
        if (eVar == null) {
            Intrinsics.r("component");
            throw null;
        }
        StockFinancialsStatementsContract$Configuration stockFinancialsStatementsContract$Configuration = eVar.f324770c;
        xpi.g gVar = (xpi.g) eVar.f324776n.get();
        c cVarE = i.e(eVar.f324768a);
        zrk.c cVar = eVar.d;
        return new q(stockFinancialsStatementsContract$Configuration, gVar, cVarE, (yrk.g) cVar.o.get(), (d) cVar.f324764n.get(), new j(), (opi.d) eVar.f324775m.get());
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF85901s0() {
        return ((StockFinancialsStatementsContract$Configuration) G0()).f103794a;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        e eVar = this.f103789s0;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // nri.b, no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getM() {
        return this.f103788r0;
    }

    public final Tabs Z0() {
        return (Tabs) this.f103790t0.getValue(this, A0[0]);
    }

    public final ViewPager b1() {
        return (ViewPager) this.u0.getValue(this, A0[1]);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        this.f103789s0 = new e(((zrk.c) com.bumptech.glide.c.l(this).b(null, getF85901s0())).f324760h, rd0.e.g(this, bundle, null), new xpi.f(R$id.navBar, false), (StockFinancialsStatementsContract$Configuration) G0());
        super.onCreate(bundle);
        setContentView(R$layout.activity_stock_financials_statements);
        e eVar = this.f103789s0;
        if (eVar == null) {
            Intrinsics.r("component");
            throw null;
        }
        ((b) eVar.f324775m.get()).Y("PERIOD_CHOOSER_DIALOG_DELEGATES_KEY", u.c(this.f103791v0));
        b1().setAdapter((vqi.c) this.f103792w0.getValue());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        b1().addOnPageChangeListener((ViewPager.OnPageChangeListener) this.f103793x0.getValue());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        b1().removeOnPageChangeListener((ViewPager.OnPageChangeListener) this.f103793x0.getValue());
    }
}
