package com.revolut.feature.card_order_new.impl.virtual;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.core.navigation.NaviCommand;
import hpi.b;
import hpi.c;
import hpi.h;
import hpi.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import od0.i;
import org.jmrtd.cbeff.ISO781611;
import pri.e;
import t33.g;
import t33.y;
import te0.j;
import te0.w;
import u33.a;
import xoi.d;
import xpi.f;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/virtual/IssueVirtualCardActivity;", "Lhpi/h;", "Lt33/e;", "Lt33/h;", "Lfsi/h;", "<init>", "()V", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IssueVirtualCardActivity extends h implements t33.h, fsi.h {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ int f65227x0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public a f65228s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public g f65229t0;
    public final Object u0 = w.y0(new szl.a(3));

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Object f65230v0 = w.y0(new szl.a(4));

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Object f65231w0 = w.y0(new sii.a(this, 17));

    @Override // nri.b
    public final e F0() {
        a aVar = this.f65228s0;
        if (aVar != null) {
            return (t33.e) aVar.A.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF71175s0() {
        return "ISSUE_VIRTUAL_CARD_FLOW_NAME";
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        a aVar = this.f65228s0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // hpi.d
    public final c b1() {
        b bVar = new b(new k(BitmapDescriptorFactory.HUE_RED, R$attr.uikit_windowBackground, ISO781611.SMT_TAG));
        f.Companion.getClass();
        f configuration = f.f307976c;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        bVar.f = configuration;
        c.b(bVar);
        return bVar;
    }

    public final g c1() {
        g gVar = this.f65229t0;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.r("state");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        IssueVirtualCardContract$Configuration issueVirtualCardContract$Configuration = (IssueVirtualCardContract$Configuration) G0();
        u33.b bVar = ((u33.b) com.bumptech.glide.c.l(this).b(null, "ISSUE_VIRTUAL_CARD_FLOW_NAME")).k;
        d dVarG = rd0.e.g(this, bundle, null);
        f.Companion.getClass();
        ypi.h.Companion.getClass();
        a aVar = new a(bVar, dVarG);
        this.f65228s0 = aVar;
        this.f65229t0 = (g) aVar.f276742b.A.get();
        ((y) c1()).B0().set(issueVirtualCardContract$Configuration.f65232a);
        y yVar = (y) c1();
        j jVar = yVar.f267641c;
        KProperty[] kPropertyArr = y.f267639l;
        jVar.getValue(yVar, kPropertyArr[1]).set(issueVirtualCardContract$Configuration.e);
        y yVar2 = (y) c1();
        yVar2.f267642g.getValue(yVar2, kPropertyArr[5]).set(Boolean.valueOf(issueVirtualCardContract$Configuration.f));
        ((y) c1()).w0().set(issueVirtualCardContract$Configuration.f65233b);
        y yVar3 = (y) c1();
        te0.e eVarC = yVar3.f267644j.getValue(yVar3, kPropertyArr[8]);
        od0.h hVar = i.Companion;
        e93.b bVar2 = issueVirtualCardContract$Configuration.f65235g;
        hVar.getClass();
        eVarC.set(od0.h.a(bVar2));
        ((y) c1()).x0().set(od0.h.a(issueVirtualCardContract$Configuration.f65236h));
        NaviCommand naviCommand = issueVirtualCardContract$Configuration.f65234c;
        if (naviCommand != null) {
            ((y) c1()).y0().set(naviCommand);
        }
        String str = issueVirtualCardContract$Configuration.d;
        if (str != null) {
            ((y) c1()).z0().set(str);
        }
        super.onCreate(bundle);
        RecyclerView recyclerViewZ0 = Z0();
        yp0.y.h(recyclerViewZ0, (z4l.j) this.f65231w0.getValue(), new LinearLayoutManager(recyclerViewZ0.getContext()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((z4l.j) this.f65231w0.getValue()).c(items);
    }
}
