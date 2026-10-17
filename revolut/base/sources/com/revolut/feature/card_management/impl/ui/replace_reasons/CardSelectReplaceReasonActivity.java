package com.revolut.feature.card_management.impl.ui.replace_reasons;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.card_management.impl.ui.replace_reasons.CardSelectReplaceReasonContract;
import hpi.c;
import hpi.h;
import hpi.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import org.jmrtd.cbeff.ISO781611;
import te0.w;
import wp0.b;
import wyc.u;
import x03.e;
import x03.n;
import x03.r;
import xoi.d;
import xpi.f;
import y03.a;
import yp0.y;
import z4l.j;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/card_management/impl/ui/replace_reasons/CardSelectReplaceReasonActivity;", "Lx03/e;", "Lhpi/h;", "Lx03/n;", "<init>", "()V", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardSelectReplaceReasonActivity extends h implements e {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ int f64920w0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final String f64921s0 = "CARD_SELECT_REPLACE_REASON_FLOW";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public a f64922t0;
    public final Object u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Object f64923v0;

    public CardSelectReplaceReasonActivity() {
        int i = 14;
        this.u0 = w.y0(new u(i));
        this.f64923v0 = w.y0(new b(this, i));
    }

    @Override // nri.b
    public final pri.e F0() {
        a aVar = this.f64922t0;
        if (aVar != null) {
            return (n) aVar.o.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF64921s0() {
        return this.f64921s0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        a aVar = this.f64922t0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // hpi.d
    public final c b1() {
        hpi.b bVar = new hpi.b(new k(BitmapDescriptorFactory.HUE_RED, R$attr.uikit_colorTransparent, ISO781611.SMT_TAG));
        f.Companion.getClass();
        f configuration = f.f307976c;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        bVar.f = configuration;
        return bVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        y03.b bVar = ((y03.b) com.bumptech.glide.c.l(this).b(null, this.f64921s0)).f310122g;
        d dVarG = rd0.e.g(this, bundle, null);
        f.Companion.getClass();
        this.f64922t0 = new a(bVar, dVarG);
        super.onCreate(bundle);
        if (bundle == null) {
            CardSelectReplaceReasonContract.Configuration configuration = (CardSelectReplaceReasonContract.Configuration) G0();
            a aVar = this.f64922t0;
            if (aVar == null) {
                Intrinsics.r("activityComponent");
                throw null;
            }
            r rVar = (r) ((x03.d) aVar.f310111b.f310124j.get());
            rVar.w0().set(configuration.f64925a);
            te0.e value = rVar.f301485c.getValue(rVar, r.e[1]);
            od0.h hVar = i.Companion;
            wy2.d dVar = configuration.f64926b;
            hVar.getClass();
            value.set(od0.h.a(dVar));
        }
        RecyclerView recyclerViewZ0 = Z0();
        y.h(recyclerViewZ0, (j) this.f64923v0.getValue(), new LinearLayoutManager(recyclerViewZ0.getContext()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((j) this.f64923v0.getValue()).c(items);
    }
}
