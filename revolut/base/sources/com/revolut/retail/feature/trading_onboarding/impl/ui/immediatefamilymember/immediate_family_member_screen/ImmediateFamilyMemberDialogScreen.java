package com.revolut.retail.feature.trading_onboarding.impl.ui.immediatefamilymember.immediate_family_member_screen;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.trading_onboarding.impl.ui.immediatefamilymember.ImmediateFamilyMemberScreenContract$Configuration;
import hpi.b;
import hpi.h;
import hpi.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kzk.c;
import mw1.a;
import mzk.d;
import org.jmrtd.cbeff.ISO781611;
import pri.e;
import te0.w;
import xpi.f;
import xpi.g;
import yp0.y;
import ypi.i;
import z4l.j;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/ui/immediatefamilymember/immediate_family_member_screen/ImmediateFamilyMemberDialogScreen;", "Lhpi/h;", "Lmzk/d;", "Lkzk/c;", "<init>", "()V", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ImmediateFamilyMemberDialogScreen extends h implements c {
    public static final /* synthetic */ int u0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public lzk.c f104179s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Object f104180t0 = w.y0(new a(25));

    @Override // nri.b
    public final e F0() {
        lzk.c cVar = this.f104179s0;
        if (cVar != null) {
            return new d((g) cVar.f201022c.get(), (i) cVar.e.get(), new kzk.a((ln.a) cVar.f201021b.d.get()), new mzk.e());
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF82699s0() {
        return ((ImmediateFamilyMemberScreenContract$Configuration) G0()).f104178a;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        lzk.c cVar = this.f104179s0;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // hpi.d
    public final hpi.c b1() {
        b bVar = new b(new k(BitmapDescriptorFactory.HUE_RED, R$attr.uikit_windowBackground, ISO781611.SMT_TAG));
        hpi.c.b(bVar);
        f.Companion.getClass();
        f configuration = f.f307976c;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        bVar.f = configuration;
        return bVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        lzk.a aVar = ((lzk.a) com.bumptech.glide.c.l(this).b(null, getF82699s0())).f201014a;
        xoi.d dVarG = rd0.e.g(this, bundle, null);
        f.Companion.getClass();
        ypi.h.Companion.getClass();
        this.f104179s0 = new lzk.c(aVar, dVarG);
        super.onCreate(bundle);
        RecyclerView recyclerViewZ0 = Z0();
        y.h(recyclerViewZ0, (j) this.f104180t0.getValue(), new LinearLayoutManager(recyclerViewZ0.getContext()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((j) this.f104180t0.getValue()).c(items);
    }
}
