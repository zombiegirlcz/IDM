package com.revolut.feature.insurance_pet.impl.ui.profile.petdetails;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import h08.a;
import hpi.h;
import hpi.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nwf.b;
import o08.c;
import org.jmrtd.cbeff.ISO781611;
import pri.e;
import te0.w;
import xoi.d;
import xpi.f;
import yp0.y;
import z4l.j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/profile/petdetails/PetDetailsActivity;", "Lhpi/h;", "Lo08/b;", "Lo08/c;", "<init>", "()V", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PetDetailsActivity extends h implements c {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ int f76405x0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public a f76406s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f76407t0 = "PET_PROFILE_FLOW";
    public final Object u0 = w.y0(new b(21));

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Object f76408v0 = w.y0(new b(22));

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Object f76409w0 = w.y0(new nmm.h(this, 28));

    @Override // nri.b
    public final e F0() {
        a aVar = this.f76406s0;
        if (aVar != null) {
            return (o08.b) aVar.f148211p.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF71163r0() {
        return this.f76407t0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        a aVar = this.f76406s0;
        if (aVar != null) {
            return aVar;
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
        hpi.c.b(cVar);
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        h08.h hVar = ((h08.h) com.bumptech.glide.c.l(this).b(null, this.f76407t0)).f148283h;
        d dVarG = rd0.e.g(this, bundle, null);
        f.Companion.getClass();
        ypi.h.Companion.getClass();
        this.f76406s0 = new a(hVar, dVarG);
        super.onCreate(bundle);
        RecyclerView recyclerViewZ0 = Z0();
        y.h(recyclerViewZ0, (j) this.f76409w0.getValue(), new LinearLayoutManager(recyclerViewZ0.getContext()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((j) this.f76409w0.getValue()).c(items);
    }
}
