package com.revolut.feature.insurance_pet.impl.ui.edit.planeditor;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.insurance_pet.impl.ui.edit.planeditor.PetEditQuoteActivity;
import gsi.a;
import hpi.h;
import hpi.k;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import opi.b;
import org.jmrtd.cbeff.ISO781611;
import pri.e;
import rwg.e0;
import ry7.c;
import ry7.d;
import te0.w;
import xpi.f;
import yp0.y;
import z4l.j;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/edit/planeditor/PetEditQuoteActivity;", "Lhpi/h;", "Lry7/c;", "Lry7/d;", "<init>", "()V", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PetEditQuoteActivity extends h implements d {
    public static final /* synthetic */ int A0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public qy7.d f76297s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f76298t0 = "PET_EDIT_DETAILS_FLOW";
    public final Object u0 = w.y0(new e0(7));

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Object f76299v0 = w.y0(new e0(8));

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Object f76300w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Object f76301x0;
    public final Object y0;
    public final List z0;

    public PetEditQuoteActivity() {
        Lazy lazyY0 = w.y0(new e0(9));
        this.f76300w0 = lazyY0;
        final int i = 0;
        this.f76301x0 = w.y0(new Function0(this) { // from class: ry7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PetEditQuoteActivity f258239b;

            {
                this.f258239b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PetEditQuoteActivity petEditQuoteActivity = this.f258239b;
                switch (i2) {
                    case 0:
                        int i3 = PetEditQuoteActivity.A0;
                        return new z4l.j(7, v.k((ListSubheaderDelegate) petEditQuoteActivity.f76299v0.getValue(), (InputChecklistDelegate) petEditQuoteActivity.u0.getValue()), false);
                    default:
                        qy7.d dVar = petEditQuoteActivity.f76297s0;
                        if (dVar != null) {
                            return (opi.b) dVar.k.get();
                        }
                        Intrinsics.r("activityComponent");
                        throw null;
                }
            }
        });
        final int i2 = 1;
        this.y0 = w.y0(new Function0(this) { // from class: ry7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PetEditQuoteActivity f258239b;

            {
                this.f258239b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PetEditQuoteActivity petEditQuoteActivity = this.f258239b;
                switch (i22) {
                    case 0:
                        int i3 = PetEditQuoteActivity.A0;
                        return new z4l.j(7, v.k((ListSubheaderDelegate) petEditQuoteActivity.f76299v0.getValue(), (InputChecklistDelegate) petEditQuoteActivity.u0.getValue()), false);
                    default:
                        qy7.d dVar = petEditQuoteActivity.f76297s0;
                        if (dVar != null) {
                            return (opi.b) dVar.k.get();
                        }
                        Intrinsics.r("activityComponent");
                        throw null;
                }
            }
        });
        this.z0 = u.c((LargeActionButtonDelegate) lazyY0.getValue());
    }

    @Override // nri.b
    public final e F0() {
        qy7.d dVar = this.f76297s0;
        if (dVar != null) {
            return (c) dVar.f250214q.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF71175s0() {
        return this.f76298t0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final a L0() {
        qy7.d dVar = this.f76297s0;
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
        hpi.c.b(cVar);
        cVar.e = true;
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        qy7.c cVar = ((qy7.c) com.bumptech.glide.c.l(this).b(null, this.f76298t0)).f250190g;
        xoi.d dVarG = rd0.e.g(this, bundle, null);
        f.Companion.getClass();
        ypi.h.Companion.getClass();
        this.f76297s0 = new qy7.d(cVar, dVarG);
        super.onCreate(bundle);
        PetEditQuoteContract$Configuration petEditQuoteContract$Configuration = (PetEditQuoteContract$Configuration) G0();
        qy7.d dVar = this.f76297s0;
        if (dVar == null) {
            Intrinsics.r("activityComponent");
            throw null;
        }
        ((ly7.k) ((ly7.c) dVar.f250205b.k.get())).w0().set(petEditQuoteContract$Configuration.f76303a);
        RecyclerView recyclerViewZ0 = Z0();
        y.h(recyclerViewZ0, (j) this.f76301x0.getValue(), new LinearLayoutManager(recyclerViewZ0.getContext()));
        ((b) this.y0.getValue()).Y("INFO_DIALOG_DELEGATE_KEY", this.z0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((j) this.f76301x0.getValue()).c(items);
    }
}
