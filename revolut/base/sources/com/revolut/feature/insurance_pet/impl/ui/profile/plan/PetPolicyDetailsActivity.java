package com.revolut.feature.insurance_pet.impl.ui.profile.plan;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import h08.h;
import hpi.d;
import hpi.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import opi.b;
import org.jmrtd.cbeff.ISO781611;
import pri.e;
import rwg.e0;
import s08.a;
import s08.c;
import te0.w;
import xpi.f;
import yp0.y;
import z4l.j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/profile/plan/PetPolicyDetailsActivity;", "Lhpi/d;", "Ls08/c;", "Ls08/d;", "Lcom/revolut/uicomponent/toolbar/app_bar/RevolutToolbar;", "<init>", "()V", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PetPolicyDetailsActivity extends d implements s08.d {
    public static final /* synthetic */ int B0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public h08.d f76410s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Object f76411t0 = w.y0(new a(this, 0));
    public final String u0 = "PET_PROFILE_FLOW";

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Object f76412v0 = w.y0(new e0(21));

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Object f76413w0 = w.y0(new e0(22));

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Object f76414x0 = w.y0(new e0(23));
    public final Object y0 = w.y0(new e0(24));
    public final Object z0 = w.y0(new a(this, 1));
    public final Object A0 = w.y0(new a(this, 2));

    @Override // nri.b
    public final e F0() {
        h08.d dVar = this.f76410s0;
        if (dVar != null) {
            return (c) dVar.f148249r.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF71175s0() {
        return this.u0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        h08.d dVar = this.f76410s0;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // hpi.d
    public final hpi.c b1() {
        hpi.c cVar = new hpi.c(new k(BitmapDescriptorFactory.HUE_RED, R$attr.uikit_windowBackground, ISO781611.SMT_TAG));
        f.Companion.getClass();
        f configuration = f.d;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        cVar.f = configuration;
        cVar.e = true;
        hpi.c.b(cVar);
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        h hVar = ((h) com.bumptech.glide.c.l(this).b(null, this.u0)).f148283h;
        xoi.d dVarG = rd0.e.g(this, bundle, null);
        f.Companion.getClass();
        ypi.h.Companion.getClass();
        this.f76410s0 = new h08.d(hVar, dVarG);
        PetPolicyDetailsContract$Configuration petPolicyDetailsContract$Configuration = (PetPolicyDetailsContract$Configuration) G0();
        h08.d dVar = this.f76410s0;
        if (dVar == null) {
            Intrinsics.r("activityComponent");
            throw null;
        }
        ((f08.k) ((f08.e) dVar.f148239b.A.get())).d().set(petPolicyDetailsContract$Configuration.f76415a);
        super.onCreate(bundle);
        RecyclerView recyclerViewZ0 = Z0();
        y.h(recyclerViewZ0, (j) this.z0.getValue(), new LinearLayoutManager(recyclerViewZ0.getContext()));
        ((b) this.f76411t0.getValue()).W(new a(this, 3));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((j) this.z0.getValue()).c(items);
    }
}
