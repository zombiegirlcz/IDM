package com.revolut.feature.insurance_pet.impl.ui.hub.issues.renewal;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.insurance_pet.impl.ui.hub.issues.renewal.RenewalDetailsActivity;
import com.revolut.feature.insurance_pet.impl.ui.hub.issues.renewal.RenewalDetailsContract$Configuration;
import gx2.a;
import gz7.i;
import hpi.c;
import hpi.h;
import hpi.k;
import iqi.g;
import java.util.List;
import jz7.b;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import pri.e;
import te0.w;
import xpi.f;
import yp0.y;
import z4l.j;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/hub/issues/renewal/RenewalDetailsActivity;", "Lhpi/h;", "Lgz7/d;", "Lgz7/i;", "<init>", "()V", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RenewalDetailsActivity extends h implements i {
    public static final /* synthetic */ int B0 = 0;
    public final Object A0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Object f76328s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public b f76329t0;
    public final Object u0 = w.y0(new a(6));

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Object f76330v0 = w.y0(new a(7));

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Object f76331w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Object f76332x0;
    public final Object y0;
    public final List z0;

    public RenewalDetailsActivity() {
        final int i = 0;
        this.f76328s0 = w.y0(new Function0(this) { // from class: gz7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RenewalDetailsActivity f147940b;

            {
                this.f147940b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RenewalDetailsActivity renewalDetailsActivity = this.f147940b;
                switch (i2) {
                    case 0:
                        int i3 = RenewalDetailsActivity.B0;
                        return ((RenewalDetailsContract$Configuration) renewalDetailsActivity.G0()).f76333a;
                    case 1:
                        jz7.b bVar = renewalDetailsActivity.f76329t0;
                        if (bVar != null) {
                            return bVar.c();
                        }
                        Intrinsics.r("activityComponent");
                        throw null;
                    default:
                        int i5 = RenewalDetailsActivity.B0;
                        return new z4l.j(7, zhm.v.k(new HeaderLoadingDelegate(), (ListSubheaderDelegate) renewalDetailsActivity.u0.getValue(), (RowDelegate) renewalDetailsActivity.f76330v0.getValue(), new RowLoadingDelegate(), new CellDetailsDelegate(), (CellDetailsSwitcherDelegate) renewalDetailsActivity.f76332x0.getValue(), new CellDetailsLoadingDelegate()), false);
                }
            }
        });
        Lazy lazyY0 = w.y0(new a(8));
        this.f76331w0 = lazyY0;
        this.f76332x0 = w.y0(new a(9));
        final int i2 = 1;
        this.y0 = w.y0(new Function0(this) { // from class: gz7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RenewalDetailsActivity f147940b;

            {
                this.f147940b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RenewalDetailsActivity renewalDetailsActivity = this.f147940b;
                switch (i22) {
                    case 0:
                        int i3 = RenewalDetailsActivity.B0;
                        return ((RenewalDetailsContract$Configuration) renewalDetailsActivity.G0()).f76333a;
                    case 1:
                        jz7.b bVar = renewalDetailsActivity.f76329t0;
                        if (bVar != null) {
                            return bVar.c();
                        }
                        Intrinsics.r("activityComponent");
                        throw null;
                    default:
                        int i5 = RenewalDetailsActivity.B0;
                        return new z4l.j(7, zhm.v.k(new HeaderLoadingDelegate(), (ListSubheaderDelegate) renewalDetailsActivity.u0.getValue(), (RowDelegate) renewalDetailsActivity.f76330v0.getValue(), new RowLoadingDelegate(), new CellDetailsDelegate(), (CellDetailsSwitcherDelegate) renewalDetailsActivity.f76332x0.getValue(), new CellDetailsLoadingDelegate()), false);
                }
            }
        });
        this.z0 = u.c((LargeActionButtonDelegate) lazyY0.getValue());
        final int i3 = 2;
        this.A0 = w.y0(new Function0(this) { // from class: gz7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RenewalDetailsActivity f147940b;

            {
                this.f147940b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RenewalDetailsActivity renewalDetailsActivity = this.f147940b;
                switch (i22) {
                    case 0:
                        int i32 = RenewalDetailsActivity.B0;
                        return ((RenewalDetailsContract$Configuration) renewalDetailsActivity.G0()).f76333a;
                    case 1:
                        jz7.b bVar = renewalDetailsActivity.f76329t0;
                        if (bVar != null) {
                            return bVar.c();
                        }
                        Intrinsics.r("activityComponent");
                        throw null;
                    default:
                        int i5 = RenewalDetailsActivity.B0;
                        return new z4l.j(7, zhm.v.k(new HeaderLoadingDelegate(), (ListSubheaderDelegate) renewalDetailsActivity.u0.getValue(), (RowDelegate) renewalDetailsActivity.f76330v0.getValue(), new RowLoadingDelegate(), new CellDetailsDelegate(), (CellDetailsSwitcherDelegate) renewalDetailsActivity.f76332x0.getValue(), new CellDetailsLoadingDelegate()), false);
                }
            }
        });
    }

    @Override // nri.b
    public final e F0() {
        b bVar = this.f76329t0;
        if (bVar != null) {
            return bVar.b();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF82699s0() {
        return (String) this.f76328s0.getValue();
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        b bVar = this.f76329t0;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // hpi.d
    public final c b1() {
        c cVar = new c(new k(BitmapDescriptorFactory.HUE_RED, R$attr.uikit_windowBackground, ISO781611.SMT_TAG));
        f.Companion.getClass();
        f configuration = f.d;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        cVar.f = configuration;
        g.Companion.getClass();
        g configuration2 = g.f167870b;
        Intrinsics.checkNotNullParameter(configuration2, "configuration");
        cVar.i = configuration2;
        cVar.e = true;
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        h08.i iVar = (h08.i) ((jz7.a) com.bumptech.glide.c.l(this).b(null, getF82699s0())).a().h(rd0.e.g(this, bundle, null));
        f.Companion.getClass();
        h08.i iVar2 = (h08.i) iVar.k();
        g.Companion.getClass();
        h08.i iVar3 = (h08.i) iVar2.a(g.f167870b);
        RenewalDetailsContract$Configuration renewalDetailsContract$Configuration = (RenewalDetailsContract$Configuration) G0();
        switch (iVar3.f148296a) {
            case 0:
                iVar3.e = renewalDetailsContract$Configuration;
                break;
            default:
                iVar3.e = renewalDetailsContract$Configuration;
                break;
        }
        this.f76329t0 = (b) iVar3.build();
        super.onCreate(bundle);
        RecyclerView recyclerViewZ0 = Z0();
        y.h(recyclerViewZ0, (j) this.A0.getValue(), new LinearLayoutManager(recyclerViewZ0.getContext()));
        ((opi.b) this.y0.getValue()).Y("INFO_DIALOG_DELEGATE_KEY", this.z0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((j) this.A0.getValue()).c(items);
    }
}
