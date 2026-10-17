package com.revolut.feature.insurance_pet.impl.ui.planbuilder.confirmation;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import hpi.h;
import hpi.k;
import ihm.f;
import iqi.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import pri.e;
import te0.w;
import uz7.r;
import v0.a;
import xlb.o;
import xz7.b;
import xz7.c;
import yp0.y;
import z4l.j;
import zz7.d;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/planbuilder/confirmation/PetPlanConfirmPurchaseActivity;", "Lhpi/h;", "Lxz7/b;", "Lxz7/c;", "<init>", "()V", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PetPlanConfirmPurchaseActivity extends h implements c {
    public static final /* synthetic */ int z0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public d f76359s0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Object f76361v0;
    public final Object y0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f76360t0 = "PET_PLAN_BUILDER_FLOW";
    public final Object u0 = w.y0(new xsf.c(17));

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final InputChecklistDelegate f76362w0 = new InputChecklistDelegate();

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final f f76363x0 = a.d("create(...)");

    public PetPlanConfirmPurchaseActivity() {
        int i = 18;
        this.f76361v0 = w.y0(new xsf.c(i));
        this.y0 = w.y0(new xge.h(this, i));
    }

    @Override // nri.b
    public final e F0() {
        d dVar = this.f76359s0;
        if (dVar != null) {
            return (b) dVar.z.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF96913t0() {
        return this.f76360t0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        d dVar = this.f76359s0;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // hpi.d
    public final hpi.c b1() {
        hpi.c cVar = new hpi.c(new k(BitmapDescriptorFactory.HUE_RED, R$attr.uikit_windowBackground, ISO781611.SMT_TAG));
        xpi.f.Companion.getClass();
        xpi.f configuration = xpi.f.d;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        cVar.f = configuration;
        g.Companion.getClass();
        g configuration2 = g.f167870b;
        Intrinsics.checkNotNullParameter(configuration2, "configuration");
        cVar.i = configuration2;
        cVar.e = true;
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        zz7.c cVar = ((zz7.c) com.bumptech.glide.c.l(this).b(null, this.f76360t0)).f;
        xoi.d dVarG = rd0.e.g(this, bundle, null);
        xpi.f.Companion.getClass();
        g.Companion.getClass();
        this.f76359s0 = new d(cVar, dVarG);
        super.onCreate(bundle);
        PetPlanConfirmPurchaseContract$Configuration petPlanConfirmPurchaseContract$Configuration = (PetPlanConfirmPurchaseContract$Configuration) G0();
        d dVar = this.f76359s0;
        if (dVar == null) {
            Intrinsics.r("activityComponent");
            throw null;
        }
        r rVar = (r) ((uz7.c) dVar.f326561b.f326556t.get());
        rVar.x0().set(petPlanConfirmPurchaseContract$Configuration.f76364a);
        rVar.z0().set(petPlanConfirmPurchaseContract$Configuration.f76365b);
        rVar.f284618b.i0().set(petPlanConfirmPurchaseContract$Configuration.f76366c);
        rVar.C0().set(petPlanConfirmPurchaseContract$Configuration.d);
        rVar.D0().set(petPlanConfirmPurchaseContract$Configuration.e);
        RecyclerView recyclerViewZ0 = Z0();
        y.h(recyclerViewZ0, (j) this.y0.getValue(), new LinearLayoutManager(recyclerViewZ0.getContext()));
        new xv0.w(new o(1, this.f76363x0, f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 13), null).b(Z0());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((j) this.y0.getValue()).c(items);
    }
}
