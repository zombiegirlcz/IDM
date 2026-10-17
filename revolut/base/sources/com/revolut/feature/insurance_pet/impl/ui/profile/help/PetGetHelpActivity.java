package com.revolut.feature.insurance_pet.impl.ui.profile.help;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import h08.c;
import h08.h;
import hpi.d;
import hpi.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m08.a;
import opi.b;
import org.jmrtd.cbeff.ISO781611;
import pri.e;
import te0.w;
import xpi.f;
import yp0.y;
import z4l.j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/profile/help/PetGetHelpActivity;", "Lhpi/d;", "Lm08/c;", "Lm08/d;", "Lcom/revolut/uicomponent/toolbar/app_bar/RevolutToolbar;", "<init>", "()V", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PetGetHelpActivity extends d implements m08.d {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ int f76392x0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public c f76393s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f76394t0 = "PET_PROFILE_FLOW";
    public final Object u0 = w.y0(new m05.d(4));

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Object f76395v0 = w.y0(new m05.d(5));

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Object f76396w0 = w.y0(new a(this, 1));

    @Override // nri.b
    public final e F0() {
        c cVar = this.f76393s0;
        if (cVar != null) {
            return (m08.c) cVar.z.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF71175s0() {
        return this.f76394t0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        c cVar = this.f76393s0;
        if (cVar != null) {
            return cVar;
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
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        h hVar = ((h) com.bumptech.glide.c.l(this).b(null, this.f76394t0)).f148283h;
        xoi.d dVarG = rd0.e.g(this, bundle, null);
        f.Companion.getClass();
        this.f76393s0 = new c(hVar, dVarG);
        PetGetHelpContract$Configuration petGetHelpContract$Configuration = (PetGetHelpContract$Configuration) G0();
        c cVar = this.f76393s0;
        if (cVar == null) {
            Intrinsics.r("activityComponent");
            throw null;
        }
        ((f08.k) ((f08.e) cVar.f148222b.A.get())).y0().set(petGetHelpContract$Configuration.f76397a);
        super.onCreate(bundle);
        RecyclerView recyclerViewZ0 = Z0();
        y.h(recyclerViewZ0, (j) this.f76396w0.getValue(), new LinearLayoutManager(recyclerViewZ0.getContext()));
        c cVar2 = this.f76393s0;
        if (cVar2 != null) {
            ((b) cVar2.k.get()).X(new a(this, 0));
        } else {
            Intrinsics.r("activityComponent");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((j) this.f76396w0.getValue()).c(items);
    }
}
