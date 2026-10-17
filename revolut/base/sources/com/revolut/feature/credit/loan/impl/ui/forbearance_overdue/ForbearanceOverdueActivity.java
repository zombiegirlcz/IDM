package com.revolut.feature.credit.loan.impl.ui.forbearance_overdue;

import android.os.Bundle;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import hpi.b;
import hpi.h;
import hpi.k;
import iqi.g;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import pri.e;
import xpi.f;
import y4f.c;
import yhm.j;
import zqi.a;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/forbearance_overdue/ForbearanceOverdueActivity;", "Lhpi/h;", "", "<init>", "()V", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ForbearanceOverdueActivity extends h implements a {
    public static final /* synthetic */ int u0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final String f70340s0 = "LOAN_FORBEARANCE_OVERDUE_FLOW";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Lazy f70341t0 = j.b(new c(6));

    @Override // nri.b
    public final e F0() {
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF81955s0() {
        return this.f70340s0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // hpi.d
    public final hpi.c b1() {
        b bVar = new b(new k(BitmapDescriptorFactory.HUE_RED, R$attr.uikit_colorGroupedBackground, ISO781611.SMT_TAG));
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

    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        com.bumptech.glide.c.l(this).b(null, this.f70340s0).getClass();
        throw new ClassCastException();
    }
}
