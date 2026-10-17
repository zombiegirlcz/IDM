package com.revolut.feature.credit.core.ui.progress;

import android.os.Bundle;
import android.os.Parcelable;
import com.revolut.feature.credit.core.R$id;
import com.revolut.feature.credit.core.R$layout;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import hq1.f;
import hy4.b;
import j90.a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import le.u1;
import od0.h;
import od0.i;
import pri.e;
import vz4.m;
import xz4.c;
import xz4.d;
import yhm.j;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/core/ui/progress/CreditProgressActivity;", "Lcom/revolut/retail/core/ui/activity/BaseDelegatesActivity;", "Lhy4/a;", "Lhy4/b;", "<init>", "()V", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditProgressActivity extends BaseDelegatesActivity implements b {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f69843v0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public c f69846t0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final a f69844r0 = u1.w(this, R$id.titleView);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final a f69845s0 = u1.w(this, R$id.subtitleView);
    public final Lazy u0 = j.b(new f(this, 12));

    static {
        h0 h0Var = new h0(CreditProgressActivity.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0);
        p0 p0Var = o0.f186429a;
        f69843v0 = new KProperty[]{p0Var.j(h0Var), p.a.y(CreditProgressActivity.class, "subtitleView", "getSubtitleView()Landroid/widget/TextView;", 0, p0Var)};
    }

    @Override // nri.b
    public final e F0() {
        c cVar = this.f69846t0;
        if (cVar != null) {
            return (hy4.a) cVar.A.get();
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
        c cVar = this.f69846t0;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        CreditProgressContract$Configuration creditProgressContract$Configuration = (CreditProgressContract$Configuration) G0();
        d dVar = ((d) ((xz4.e) com.bumptech.glide.c.l(this).b(null, getF82699s0()))).f309851l;
        this.f69846t0 = new c(dVar, rd0.e.g(this, bundle, null), creditProgressContract$Configuration);
        m mVar = (m) ((vz4.b) dVar.f309860s.get());
        te0.e eVarC = mVar.e.getValue(mVar, m.f[2]);
        h hVar = i.Companion;
        Parcelable parcelableB = creditProgressContract$Configuration.getD();
        hVar.getClass();
        eVarC.set(h.a(parcelableB));
        super.onCreate(bundle);
        setContentView(R$layout.activity_credit_progress);
    }
}
