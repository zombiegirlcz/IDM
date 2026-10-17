package com.revolut.feature.insurance_pet.impl.ui.edit.review;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.insurance_pet.impl.ui.edit.review.PetEditReviewChangesActivity;
import hpi.c;
import hpi.h;
import hpi.k;
import ihm.f;
import iqi.g;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import opi.b;
import org.jmrtd.cbeff.ISO781611;
import te0.w;
import tx0.g4;
import ty.a;
import ty7.d;
import ty7.e;
import yp0.y;
import z4l.j;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/edit/review/PetEditReviewChangesActivity;", "Lhpi/h;", "Lty7/d;", "Lty7/e;", "<init>", "()V", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PetEditReviewChangesActivity extends h implements e {
    public static final /* synthetic */ int B0 = 0;
    public final f A0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public qy7.e f76304s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f76305t0 = "PET_EDIT_DETAILS_FLOW";
    public final Object u0 = w.y0(new a(6));

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Object f76306v0 = w.y0(new a(7));

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Object f76307w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Object f76308x0;
    public final Object y0;
    public final List z0;

    public PetEditReviewChangesActivity() {
        Lazy lazyY0 = w.y0(new a(8));
        this.f76307w0 = lazyY0;
        final int i = 0;
        this.f76308x0 = w.y0(new Function0(this) { // from class: ty7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PetEditReviewChangesActivity f275489b;

            {
                this.f275489b = this;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PetEditReviewChangesActivity petEditReviewChangesActivity = this.f275489b;
                switch (i2) {
                    case 0:
                        int i3 = PetEditReviewChangesActivity.B0;
                        return new z4l.j(7, v.k(new RowDelegate(null, null, 7), new ListSubheaderDelegate(), (CellDetailsDelegate) petEditReviewChangesActivity.u0.getValue(), (TextDelegate) petEditReviewChangesActivity.f76306v0.getValue()), false);
                    default:
                        qy7.e eVar = petEditReviewChangesActivity.f76304s0;
                        if (eVar != null) {
                            return (opi.b) eVar.k.get();
                        }
                        Intrinsics.r("activityComponent");
                        throw null;
                }
            }
        });
        final int i2 = 1;
        this.y0 = w.y0(new Function0(this) { // from class: ty7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PetEditReviewChangesActivity f275489b;

            {
                this.f275489b = this;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PetEditReviewChangesActivity petEditReviewChangesActivity = this.f275489b;
                switch (i22) {
                    case 0:
                        int i3 = PetEditReviewChangesActivity.B0;
                        return new z4l.j(7, v.k(new RowDelegate(null, null, 7), new ListSubheaderDelegate(), (CellDetailsDelegate) petEditReviewChangesActivity.u0.getValue(), (TextDelegate) petEditReviewChangesActivity.f76306v0.getValue()), false);
                    default:
                        qy7.e eVar = petEditReviewChangesActivity.f76304s0;
                        if (eVar != null) {
                            return (opi.b) eVar.k.get();
                        }
                        Intrinsics.r("activityComponent");
                        throw null;
                }
            }
        });
        this.z0 = u.c((LargeActionButtonDelegate) lazyY0.getValue());
        this.A0 = v0.a.d("create(...)");
    }

    @Override // nri.b
    public final pri.e F0() {
        qy7.e eVar = this.f76304s0;
        if (eVar != null) {
            return (d) eVar.A.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF81394t0() {
        return this.f76305t0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        qy7.e eVar = this.f76304s0;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // hpi.d
    public final c b1() {
        c cVar = new c(new k(BitmapDescriptorFactory.HUE_RED, R$attr.uikit_windowBackground, ISO781611.SMT_TAG));
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
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        qy7.c cVar = ((qy7.c) com.bumptech.glide.c.l(this).b(null, this.f76305t0)).f250190g;
        xoi.d dVarG = rd0.e.g(this, bundle, null);
        xpi.f.Companion.getClass();
        g.Companion.getClass();
        this.f76304s0 = new qy7.e(cVar, dVarG);
        super.onCreate(bundle);
        PetEditReviewChangesContract$Configuration petEditReviewChangesContract$Configuration = (PetEditReviewChangesContract$Configuration) G0();
        qy7.e eVar = this.f76304s0;
        if (eVar == null) {
            Intrinsics.r("activityComponent");
            throw null;
        }
        ((ly7.k) ((ly7.c) eVar.f250216b.k.get())).w0().set(petEditReviewChangesContract$Configuration.f76309a);
        RecyclerView recyclerViewZ0 = Z0();
        y.h(recyclerViewZ0, (j) this.f76308x0.getValue(), new LinearLayoutManager(recyclerViewZ0.getContext()));
        new xv0.w(new g4(1, this.A0, f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 1), null).b(Z0());
        ((b) this.y0.getValue()).Y("INFO_DIALOG_DELEGATE_KEY", this.z0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((j) this.f76308x0.getValue()).c(items);
    }
}
