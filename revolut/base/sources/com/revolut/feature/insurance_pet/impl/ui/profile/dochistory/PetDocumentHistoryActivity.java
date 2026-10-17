package com.revolut.feature.insurance_pet.impl.ui.profile.dochistory;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import h08.b;
import hpi.h;
import hpi.k;
import hq1.f;
import hzl.a;
import i08.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import pri.e;
import te0.w;
import xoi.d;
import yp0.y;
import z4l.j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/profile/dochistory/PetDocumentHistoryActivity;", "Lhpi/h;", "Li08/b;", "Li08/c;", "<init>", "()V", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PetDocumentHistoryActivity extends h implements c {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ int f76381w0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public b f76382s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f76383t0 = "PET_PROFILE_FLOW";
    public final Object u0 = w.y0(new a(2));

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Object f76384v0 = w.y0(new f(this, 14));

    @Override // nri.b
    public final e F0() {
        b bVar = this.f76382s0;
        if (bVar != null) {
            return (i08.b) bVar.o.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF71175s0() {
        return this.f76383t0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        b bVar = this.f76382s0;
        if (bVar != null) {
            return bVar;
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
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        h08.h hVar = ((h08.h) com.bumptech.glide.c.l(this).b(null, this.f76383t0)).f148283h;
        d dVarG = rd0.e.g(this, bundle, null);
        xpi.f.Companion.getClass();
        this.f76382s0 = new b(hVar, dVarG);
        PetDocumentHistoryContract$Configuration petDocumentHistoryContract$Configuration = (PetDocumentHistoryContract$Configuration) G0();
        b bVar = this.f76382s0;
        if (bVar == null) {
            Intrinsics.r("activityComponent");
            throw null;
        }
        f08.k kVar = (f08.k) ((f08.e) bVar.f148213b.A.get());
        kVar.y0().set(petDocumentHistoryContract$Configuration.f76385a);
        kVar.w0().set(petDocumentHistoryContract$Configuration.f76386b);
        super.onCreate(bundle);
        RecyclerView recyclerViewZ0 = Z0();
        y.h(recyclerViewZ0, (j) this.f76384v0.getValue(), new LinearLayoutManager(recyclerViewZ0.getContext()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((j) this.f76384v0.getValue()).c(items);
    }
}
