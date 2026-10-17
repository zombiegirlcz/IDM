package com.revolut.feature.insurance_pet.impl.ui.profile.document;

import android.os.Bundle;
import androidx.recyclerview.widget.DefaultItemAnimator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import h08.f;
import h08.h;
import hpi.d;
import hpi.k;
import java.util.List;
import jxi.a;
import k08.b;
import k08.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import pri.e;
import te0.w;
import z4l.j;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/profile/document/PetPolicyDocumentActivity;", "Lhpi/d;", "Lk08/b;", "Lk08/c;", "Lcom/revolut/uicomponent/toolbar/app_bar/RevolutToolbar;", "<init>", "()V", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PetPolicyDocumentActivity extends d implements c {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ int f76387w0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public f f76388s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f76389t0 = "PET_PROFILE_FLOW";
    public final Object u0 = w.y0(new a(27));

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Object f76390v0 = w.y0(new jj2.a(this, 20));

    @Override // nri.b
    public final e F0() {
        f fVar = this.f76388s0;
        if (fVar != null) {
            return (b) fVar.o.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF71175s0() {
        return this.f76389t0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        f fVar = this.f76388s0;
        if (fVar != null) {
            return fVar;
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

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        h hVar = ((h) com.bumptech.glide.c.l(this).b(null, this.f76389t0)).f148283h;
        xoi.d dVarG = rd0.e.g(this, bundle, null);
        xpi.f.Companion.getClass();
        this.f76388s0 = new f(hVar, dVarG);
        PetPolicyDocumentContract$Configuration petPolicyDocumentContract$Configuration = (PetPolicyDocumentContract$Configuration) G0();
        f fVar = this.f76388s0;
        if (fVar == null) {
            Intrinsics.r("activityComponent");
            throw null;
        }
        ((f08.k) ((f08.e) fVar.f148254b.A.get())).y0().set(petPolicyDocumentContract$Configuration.f76391a);
        super.onCreate(bundle);
        vyl.a.a(Z0(), (j) this.f76390v0.getValue(), new DefaultItemAnimator(), u.c(new o31.b()), null, 24);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((j) this.f76390v0.getValue()).c(items);
    }
}
