package com.revolut.feature.insurance_pet.impl.ui.planbuilder.plan;

import a08.j;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlanTileDelegate;
import com.revolut.core.ui_kit.delegates.PlanTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.insurance_pet.impl.ui.planbuilder.plan.PetPlanBuilderActivity;
import com.revolut.feature.insurance_pet.impl.ui.planbuilder.plan.PetPlanBuilderContract$Configuration;
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
import org.jmrtd.cbeff.ISO781611;
import pri.e;
import te0.w;
import uz7.r;
import v0.a;
import xoi.d;
import yp0.y;
import zhm.u;
import zhm.v;
import zz7.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/planbuilder/plan/PetPlanBuilderActivity;", "Lhpi/h;", "La08/h;", "La08/j;", "<init>", "()V", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PetPlanBuilderActivity extends h implements j {
    public static final /* synthetic */ int J0 = 0;
    public final Object A0;
    public final Object B0;
    public final Object C0;
    public final Object D0;
    public final List E0;
    public final List F0;
    public final List G0;
    public final f H0;
    public final Object I0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public b f76367s0;
    public final Object u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Object f76369v0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Object f76371x0;
    public final Object y0;
    public final Object z0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f76368t0 = "PET_PLAN_BUILDER_FLOW";

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Object f76370w0 = w.y0(new a08.b(2));

    public PetPlanBuilderActivity() {
        final int i = 0;
        this.u0 = w.y0(new a08.b(i));
        final int i2 = 1;
        this.f76369v0 = w.y0(new a08.b(i2));
        Lazy lazyY0 = w.y0(new a08.b(3));
        this.f76371x0 = lazyY0;
        this.y0 = w.y0(new a08.b(4));
        Lazy lazyY02 = w.y0(new a08.b(5));
        this.z0 = lazyY02;
        Lazy lazyY03 = w.y0(new a08.b(6));
        this.A0 = lazyY03;
        this.B0 = w.y0(new a08.b(7));
        Lazy lazyY04 = w.y0(new a08.b(8));
        this.C0 = lazyY04;
        this.D0 = w.y0(new Function0(this) { // from class: a08.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PetPlanBuilderActivity f167b;

            {
                this.f167b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                PetPlanBuilderActivity petPlanBuilderActivity = this.f167b;
                switch (i3) {
                    case 0:
                        zz7.b bVar = petPlanBuilderActivity.f76367s0;
                        if (bVar != null) {
                            return (opi.b) bVar.f326532l.get();
                        }
                        Intrinsics.r("activityComponent");
                        throw null;
                    default:
                        int i5 = PetPlanBuilderActivity.J0;
                        return new z4l.j(7, zhm.v.k((ListSubheaderDelegate) petPlanBuilderActivity.u0.getValue(), (TabsDelegate) petPlanBuilderActivity.f76369v0.getValue(), new PlanTileDelegate(0), new RowDelegate(null, null, 7), (InputChecklistDelegate) petPlanBuilderActivity.f76370w0.getValue(), (TextDelegate) petPlanBuilderActivity.y0.getValue(), (FullScreenStateDelegate) petPlanBuilderActivity.B0.getValue(), new FixedTabsLoadingDelegate(), new PlanTileLoadingDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate()), false);
                }
            }
        });
        this.E0 = u.c((LargeActionButtonDelegate) lazyY0.getValue());
        this.F0 = v.k((DatePickerDelegate) lazyY02.getValue(), (LargeActionButtonDelegate) lazyY03.getValue());
        this.G0 = u.c((TwinHorizontalButtonDelegate) lazyY04.getValue());
        this.H0 = a.d("create(...)");
        this.I0 = w.y0(new Function0(this) { // from class: a08.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PetPlanBuilderActivity f167b;

            {
                this.f167b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                PetPlanBuilderActivity petPlanBuilderActivity = this.f167b;
                switch (i3) {
                    case 0:
                        zz7.b bVar = petPlanBuilderActivity.f76367s0;
                        if (bVar != null) {
                            return (opi.b) bVar.f326532l.get();
                        }
                        Intrinsics.r("activityComponent");
                        throw null;
                    default:
                        int i5 = PetPlanBuilderActivity.J0;
                        return new z4l.j(7, zhm.v.k((ListSubheaderDelegate) petPlanBuilderActivity.u0.getValue(), (TabsDelegate) petPlanBuilderActivity.f76369v0.getValue(), new PlanTileDelegate(0), new RowDelegate(null, null, 7), (InputChecklistDelegate) petPlanBuilderActivity.f76370w0.getValue(), (TextDelegate) petPlanBuilderActivity.y0.getValue(), (FullScreenStateDelegate) petPlanBuilderActivity.B0.getValue(), new FixedTabsLoadingDelegate(), new PlanTileLoadingDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate()), false);
                }
            }
        });
    }

    @Override // nri.b
    public final e F0() {
        b bVar = this.f76367s0;
        if (bVar != null) {
            return (a08.h) bVar.A.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF96913t0() {
        return this.f76368t0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        b bVar = this.f76367s0;
        if (bVar != null) {
            return bVar;
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

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        zz7.c cVar = ((zz7.c) com.bumptech.glide.c.l(this).b(null, this.f76368t0)).f;
        d dVarG = rd0.e.g(this, bundle, null);
        xpi.f.Companion.getClass();
        g.Companion.getClass();
        this.f76367s0 = new b(cVar, dVarG, (PetPlanBuilderContract$Configuration) G0());
        super.onCreate(bundle);
        PetPlanBuilderContract$Configuration petPlanBuilderContract$Configuration = (PetPlanBuilderContract$Configuration) G0();
        b bVar = this.f76367s0;
        if (bVar == null) {
            Intrinsics.r("activityComponent");
            throw null;
        }
        r rVar = (r) ((uz7.c) bVar.f326528c.f326556t.get());
        rVar.x0().set(petPlanBuilderContract$Configuration.getF76376a());
        rVar.y0().set(petPlanBuilderContract$Configuration.getF76377b());
        rVar.z0().set(petPlanBuilderContract$Configuration.getF76378c());
        rVar.w0().set(petPlanBuilderContract$Configuration.getD());
        rVar.f284618b.i0().set(petPlanBuilderContract$Configuration.getE());
        PetPlanBuilderContract$Configuration.RenewalPlanConfig renewalPlanConfig = petPlanBuilderContract$Configuration instanceof PetPlanBuilderContract$Configuration.RenewalPlanConfig ? (PetPlanBuilderContract$Configuration.RenewalPlanConfig) petPlanBuilderContract$Configuration : null;
        if (renewalPlanConfig != null) {
            rVar.D0().set(renewalPlanConfig.f);
            rVar.f284623l.getValue(rVar, r.f284617m[9]).set(Boolean.valueOf(renewalPlanConfig.f76379g));
        }
        RecyclerView recyclerViewZ0 = Z0();
        y.h(recyclerViewZ0, (z4l.j) this.I0.getValue(), new LinearLayoutManager(recyclerViewZ0.getContext()));
        new xv0.w(new a08.e(1, this.H0, f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 0), null).b(Z0());
        ?? r112 = this.D0;
        ((opi.b) r112.getValue()).Y("INFO_DIALOG_DELEGATE_KEY", this.E0);
        ((opi.b) r112.getValue()).Y("DATE_PICKER_DIALOG_DELEGATE_KEY", this.F0);
        ((opi.b) r112.getValue()).Y("REJECT_RENEWAL_DIALOG_DELEGATE_KEY", this.G0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((z4l.j) this.I0.getValue()).c(items);
    }
}
