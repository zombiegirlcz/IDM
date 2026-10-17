package com.revolut.feature.credit.loan.impl.ui.selector.module;

import android.os.Bundle;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.loan.impl.ui.selector.module.CreditSelectorActivity;
import com.revolut.feature.credit.loan.impl.ui.selector.module.CreditSelectorContract$Configuration;
import hpi.b;
import hpi.c;
import hpi.h;
import hpi.k;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import pri.e;
import te0.w;
import xpi.f;
import z4l.j;
import zhm.u;
import zqi.a;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/selector/module/CreditSelectorActivity;", "Lhpi/h;", "", "<init>", "()V", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditSelectorActivity extends h implements a {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final /* synthetic */ int f70605v0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Object f70606s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Object f70607t0 = w.y0(new v4a.a(8));
    public final Lazy u0;

    public CreditSelectorActivity() {
        final int i = 0;
        this.f70606s0 = w.y0(new Function0(this) { // from class: v85.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditSelectorActivity f286718b;

            {
                this.f286718b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditSelectorActivity creditSelectorActivity = this.f286718b;
                switch (i2) {
                    case 0:
                        int i3 = CreditSelectorActivity.f70605v0;
                        return ((CreditSelectorContract$Configuration) creditSelectorActivity.G0()).f70608a;
                    default:
                        return new j(7, u.c((RowDelegate) creditSelectorActivity.f70607t0.getValue()), false);
                }
            }
        });
        final int i2 = 1;
        this.u0 = yhm.j.b(new Function0(this) { // from class: v85.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditSelectorActivity f286718b;

            {
                this.f286718b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditSelectorActivity creditSelectorActivity = this.f286718b;
                switch (i22) {
                    case 0:
                        int i3 = CreditSelectorActivity.f70605v0;
                        return ((CreditSelectorContract$Configuration) creditSelectorActivity.G0()).f70608a;
                    default:
                        return new j(7, u.c((RowDelegate) creditSelectorActivity.f70607t0.getValue()), false);
                }
            }
        });
    }

    @Override // nri.b
    public final e F0() {
        Intrinsics.r("activityComponent");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF96906t0() {
        return (String) this.f70606s0.getValue();
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        Intrinsics.r("activityComponent");
        throw null;
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
        com.bumptech.glide.c.l(this).b(null, getF96906t0()).getClass();
        throw new ClassCastException();
    }
}
