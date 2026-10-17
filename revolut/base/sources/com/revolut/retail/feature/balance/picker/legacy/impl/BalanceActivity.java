package com.revolut.retail.feature.balance.picker.legacy.impl;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bq.i;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.feature.balance.picker.legacy.R$id;
import com.revolut.retail.feature.balance.picker.legacy.R$layout;
import fk3.b;
import grl.k9;
import j90.a;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kpi.c;
import le.u1;
import ppk.f;
import pri.e;
import q2j.a0;
import q2j.x;
import q2j.z;
import rea.m;
import s2j.d;
import t70.g;
import vc.s;
import wsg.n;
import yhm.j;
import yp0.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003:\u0001\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/legacy/impl/BalanceActivity;", "Lcom/revolut/retail/core/ui/activity/BaseDelegatesActivity;", "", "Lq2j/a0;", "<init>", "()V", "Companion", "a", "feature_balance_picker_legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BalanceActivity extends BaseDelegatesActivity implements a0 {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AnalyticsProduct.Retail f99567r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public d f99568s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f99569t0;
    public final AccountCellItemDelegate u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Lazy f99570v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final a f99571w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f99566x0 = {o0.f186429a.j(new h0(BalanceActivity.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0))};

    public BalanceActivity() {
        AnalyticsProduct.Companion aVar = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137495b;
        this.f99567r0 = com.google.android.gms.internal.mlkit_vision_face.a.g(aVar, k9Var, k9Var);
        this.f99569t0 = "BALANCE_PICKER_FLOW";
        this.u0 = new AccountCellItemDelegate();
        this.f99570v0 = j.b(new pyc.a(this, 11));
        this.f99571w0 = u1.w(this, R$id.recyclerView);
    }

    @Override // nri.b
    public final e F0() {
        d dVar = this.f99568s0;
        if (dVar == null) {
            Intrinsics.r("activityComponent");
            throw null;
        }
        BalanceScreenContract$Configuration balanceScreenContract$Configuration = dVar.f259369b;
        ada.a aVar = (ada.a) dVar.o.get();
        s2j.e eVar = dVar.f259370c;
        n nVarB = eVar.f259378b.b();
        f fVarA = eVar.f259379c.a();
        m mVarF = eVar.d.f();
        b bVarB = eVar.e.b();
        s.j(bVarB);
        l70.e eVar2 = eVar.f259377a;
        g gVarO = eVar2.o();
        s.j(gVarO);
        t70.b bVarG = eVar2.g();
        s.j(bVarG);
        ang.f fVarE = eVar.f.e();
        vte.a aVarC = eVar.f259380g.c();
        s.j(aVarC);
        q2j.a aVar2 = new q2j.a(balanceScreenContract$Configuration, eVar.f259381h.g(), eVar.i.f175963a.i());
        sri.m mVarL = i.l(dVar.f259368a);
        npi.f fVar = (npi.f) dVar.e.get();
        tpi.j jVar = (tpi.j) dVar.f259371g.get();
        f9b.f fVar2 = (f9b.f) dVar.f259376n.get();
        al4.n nVarS = eVar.f259382j.s();
        s.j(nVarS);
        return new x(balanceScreenContract$Configuration, aVar, nVarB, fVarA, mVarF, bVarB, gVarO, bVarG, fVarE, aVarC, aVar2, mVarL, fVar, jVar, fVar2, nVarS, (k3l.b) dVar.i.get(), new wq4.b(), (xpi.g) dVar.d.get(), vd0.d.a(), (c) dVar.f259375m.get(), (z) eVar.f259385n.get());
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF96958s0() {
        return this.f99569t0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        d dVar = this.f99568s0;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b, no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return this.f99567r0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        setContentView(R$layout.balance_activity);
        s2j.e eVar = ((s2j.e) com.bumptech.glide.c.l(this).b(null, this.f99569t0)).k;
        xoi.d dVarG = rd0.e.g(this, null, null);
        BalanceScreenContract$Configuration balanceScreenContract$Configuration = (BalanceScreenContract$Configuration) G0();
        xpi.f.Companion.getClass();
        this.f99568s0 = new d(eVar, dVarG, balanceScreenContract$Configuration);
        super.onCreate(bundle);
        RecyclerView recyclerView = (RecyclerView) this.f99571w0.getValue(this, f99566x0[0]);
        y.h(recyclerView, (z4l.j) this.f99570v0.getValue(), new LinearLayoutManager(recyclerView.getContext()));
    }

    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((z4l.j) this.f99570v0.getValue()).c(items);
    }
}
