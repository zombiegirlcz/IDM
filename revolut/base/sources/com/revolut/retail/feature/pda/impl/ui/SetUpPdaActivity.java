package com.revolut.retail.feature.pda.impl.ui;

import android.os.Bundle;
import com.revolut.retail.common.ui.R$id;
import hpi.c;
import hpi.h;
import ihm.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lak.b;
import lak.e;
import xoi.d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pda/impl/ui/SetUpPdaActivity;", "Lhpi/h;", "Llak/b;", "Llak/e;", "<init>", "()V", "feature_pda_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SetUpPdaActivity extends h implements e {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public jak.a f102378t0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final String f102377s0 = "SET_UP_PDA_FLOW";
    public final f u0 = v0.a.d("create(...)");

    @Override // nri.b
    public final pri.e F0() {
        jak.a aVar = this.f102378t0;
        if (aVar != null) {
            return (b) aVar.C.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF96906t0() {
        return this.f102377s0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        jak.a aVar = this.f102378t0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // hpi.d
    public final c b1() {
        c cVar = new c(new hpi.e((Object) null));
        xpi.f.Companion.getClass();
        xpi.f configuration = xpi.f.f307976c;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        cVar.f = configuration;
        c.b(cVar);
        return cVar;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        this.u0.onNext(Unit.f186387a);
    }

    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        jak.b bVar = ((jak.b) com.bumptech.glide.c.l(this).b(null, this.f102377s0)).f;
        d dVarG = rd0.e.g(this, bundle, Integer.valueOf(R$id.fragment_container));
        xpi.f.Companion.getClass();
        ypi.h.Companion.getClass();
        ypi.h hVar = ypi.h.e;
        hVar.getClass();
        this.f102378t0 = new jak.a(bVar, dVarG, hVar);
        super.onCreate(bundle);
    }
}
