package com.revolut.feature.card_contactless_limit.impl.ui.mvp;

import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.c;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature.card_contactless_limit.impl.R$id;
import com.revolut.feature.card_contactless_limit.impl.R$layout;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import dx2.a;
import gvi.b;
import gx2.n;
import gx2.s;
import hqi.i;
import iqi.g;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import le.u1;
import pri.e;
import xoi.d;
import yhm.j;
import yp0.y;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/card_contactless_limit/impl/ui/mvp/RevolutCardResetScaActivity;", "Lcom/revolut/retail/core/ui/activity/BaseDelegatesActivity;", "Lgx2/n;", "Lgx2/s;", "<init>", "()V", "feature_card_contactless_limit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevolutCardResetScaActivity extends BaseDelegatesActivity implements s {
    public static final /* synthetic */ KProperty[] A0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public a f64525s0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final String f64524r0 = "RESET_CARD_SCA";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final j90.a f64526t0 = u1.w(this, R$id.resetSca_recyclerView);
    public final j90.a u0 = u1.w(this, R$id.bottomRecyclerView);

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final j90.a f64527v0 = u1.w(this, R$id.bottomContainer);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final j90.a f64528w0 = u1.w(this, R$id.bottomButtonContainer);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final j90.a f64529x0 = u1.w(this, R$id.navBar);
    public final Lazy y0 = j.b(new b(29));
    public final Lazy z0 = j.b(new gx2.a(0));

    static {
        h0 h0Var = new h0(RevolutCardResetScaActivity.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0);
        p0 p0Var = o0.f186429a;
        A0 = new KProperty[]{p0Var.j(h0Var), p.a.y(RevolutCardResetScaActivity.class, "bottomRecyclerView", "getBottomRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0, p0Var), p.a.y(RevolutCardResetScaActivity.class, "bottomContainer", "getBottomContainer()Landroid/widget/LinearLayout;", 0, p0Var), p.a.y(RevolutCardResetScaActivity.class, "bottomButtonContainer", "getBottomButtonContainer()Landroid/widget/LinearLayout;", 0, p0Var), p.a.y(RevolutCardResetScaActivity.class, "navBar", "getNavBar()Lcom/revolut/core/ui_kit/views/navbar/BasicNavBar;", 0, p0Var)};
    }

    @Override // nri.b
    public final e F0() {
        a aVar = this.f64525s0;
        if (aVar != null) {
            return (n) aVar.f120533t.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF82699s0() {
        return this.f64524r0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        a aVar = this.f64525s0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    public final BasicNavBar Z0() {
        return (BasicNavBar) this.f64529x0.getValue(this, A0[4]);
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        dx2.b bVar = ((dx2.b) c.l(this).b(null, this.f64524r0)).d;
        RevolutCardResetScaScreenContract$Configuration revolutCardResetScaScreenContract$Configuration = (RevolutCardResetScaScreenContract$Configuration) G0();
        d dVarG = rd0.e.g(this, bundle, null);
        i.Companion.getClass();
        i iVar = i.d;
        iVar.getClass();
        this.f64525s0 = new a(bVar, dVarG, iVar, new g(com.revolut.retail.common.ui.R$id.twinVerticalButton), revolutCardResetScaScreenContract$Configuration);
        super.onCreate(bundle);
        setContentView(R$layout.activity_revolut_card_reset_sca);
        KProperty[] kPropertyArr = A0;
        RecyclerView recyclerView = (RecyclerView) this.f64526t0.getValue(this, kPropertyArr[0]);
        y.h(recyclerView, (z4l.j) this.y0.getValue(), new LinearLayoutManager(recyclerView.getContext()));
        RecyclerView recyclerView2 = (RecyclerView) this.u0.getValue(this, kPropertyArr[1]);
        y.h(recyclerView2, (z4l.j) this.z0.getValue(), new LinearLayoutManager(recyclerView2.getContext()));
        ((LinearLayout) this.f64527v0.getValue(this, kPropertyArr[2])).addOnLayoutChangeListener(new androidx.camera.viewfinder.a(this, 8));
    }

    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((z4l.j) this.y0.getValue()).c(items);
    }
}
