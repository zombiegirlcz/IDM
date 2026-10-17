package com.revolut.feature.card_add_to_googlepay.impl;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.c;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.card_add_to_googlepay.api.NavigationIconConfig;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import es.e;
import ew2.f;
import ew2.g;
import ew2.v;
import iw2.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import le.u1;
import od0.h;
import od0.i;
import te0.j;
import te0.w;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/card_add_to_googlepay/impl/AddCardToGooglePayActivity;", "Lcom/revolut/retail/core/ui/activity/BaseDelegatesActivity;", "Lew2/e;", "Lew2/g;", "<init>", "()V", "feature_card_add_to_googlepay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddCardToGooglePayActivity extends BaseDelegatesActivity implements g {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f64445v0 = {o0.f186429a.j(new h0(AddCardToGooglePayActivity.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0))};

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public iw2.a f64446r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final j90.a f64447s0 = u1.w(this, R$id.recyclerView);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Object f64448t0 = w.y0(new euf.a(8));
    public final Object u0 = w.y0(new e(this, 7));

    @Override // nri.b
    public final pri.e F0() {
        iw2.a aVar = this.f64446r0;
        if (aVar != null) {
            return (ew2.e) aVar.f168917y.get();
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF71175s0() {
        return "ADD_CARD_TO_GOOGLE_PAY";
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        iw2.a aVar = this.f64446r0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // nri.b, no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return ((AddCardToGooglePayContract$Configuration) G0()).f;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        this.f64446r0 = new iw2.a(((b) c.l(this).b(null, "ADD_CARD_TO_GOOGLE_PAY")).f168926n, rd0.e.g(this, bundle, null));
        AddCardToGooglePayContract$Configuration addCardToGooglePayContract$Configuration = (AddCardToGooglePayContract$Configuration) G0();
        iw2.a aVar = this.f64446r0;
        if (aVar == null) {
            Intrinsics.r("component");
            throw null;
        }
        v vVar = (v) ((f) aVar.f168902b.f168928q.get());
        vVar.w0().set(addCardToGooglePayContract$Configuration.f64449a);
        j jVar = vVar.f130057c;
        KProperty[] kPropertyArr = v.f130055j;
        jVar.getValue(vVar, kPropertyArr[1]).set(Boolean.valueOf(addCardToGooglePayContract$Configuration.f64450b));
        vVar.d.getValue(vVar, kPropertyArr[2]).set(addCardToGooglePayContract$Configuration.f64451c);
        vVar.e.getValue(vVar, kPropertyArr[3]).set(addCardToGooglePayContract$Configuration.d);
        te0.e eVarX0 = vVar.x0();
        h hVar = i.Companion;
        NavigationIconConfig navigationIconConfig = addCardToGooglePayContract$Configuration.e;
        hVar.getClass();
        eVarX0.set(h.a(navigationIconConfig));
        vVar.f130058g.getValue(vVar, kPropertyArr[5]).set(Boolean.valueOf(addCardToGooglePayContract$Configuration.f64452g));
        vVar.f130059h.getValue(vVar, kPropertyArr[6]).set(Boolean.valueOf(addCardToGooglePayContract$Configuration.f64453h));
        super.onCreate(bundle);
        setContentView(R$layout.activity_add_card_to_google_pay);
        KProperty[] kPropertyArr2 = f64445v0;
        KProperty kProperty = kPropertyArr2[0];
        j90.a aVar2 = this.f64447s0;
        ((RecyclerView) aVar2.getValue(this, kProperty)).setLayoutManager(new LinearLayoutManager(this));
        ((RecyclerView) aVar2.getValue(this, kPropertyArr2[0])).setAdapter((z4l.j) this.u0.getValue());
        ((RecyclerView) aVar2.getValue(this, kPropertyArr2[0])).setOverScrollMode(2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((z4l.j) this.u0.getValue()).c(items);
    }
}
