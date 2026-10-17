package com.revolut.feature.insurance_pet.impl.ui.edit.details;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.insurance_pet.impl.ui.edit.PetEditFlowContract$Configuration;
import com.revolut.feature.insurance_pet.impl.ui.edit.details.PetEditDetailsActivity;
import efm.r;
import hpi.c;
import hpi.h;
import hpi.k;
import ihm.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ny7.g;
import org.jmrtd.cbeff.ISO781611;
import pri.e;
import qy7.b;
import te0.j;
import te0.w;
import v0.a;
import xoi.d;
import yp0.y;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/edit/details/PetEditDetailsActivity;", "Lhpi/h;", "Lny7/e;", "Lny7/g;", "<init>", "()V", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PetEditDetailsActivity extends h implements g {
    public static final /* synthetic */ int C0 = 0;
    public final Object A0;
    public final Object B0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public b f76282s0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Object f76286x0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f76283t0 = "PET_EDIT_DETAILS_FLOW";
    public final f u0 = a.d("create(...)");

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final f f76284v0 = a.d("create(...)");

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final nx2.f f76285w0 = new nx2.f(this, 3);
    public final Object y0 = w.y0(new nwf.b(9));
    public final Object z0 = w.y0(new nwf.b(10));

    public PetEditDetailsActivity() {
        final int i = 0;
        this.f76286x0 = w.y0(new Function0(this) { // from class: ny7.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PetEditDetailsActivity f220689b;

            {
                this.f220689b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PetEditDetailsActivity petEditDetailsActivity = this.f220689b;
                switch (i2) {
                    case 0:
                        return new InputTextDelegate(petEditDetailsActivity.f76285w0);
                    case 1:
                        qy7.b bVar = petEditDetailsActivity.f76282s0;
                        if (bVar != null) {
                            return (opi.b) bVar.f250176l.get();
                        }
                        Intrinsics.r("activityComponent");
                        throw null;
                    default:
                        int i3 = PetEditDetailsActivity.C0;
                        return new z4l.j(7, zhm.v.k((InputTextDelegate) petEditDetailsActivity.f76286x0.getValue(), (InputChecklistDelegate) petEditDetailsActivity.y0.getValue(), (RowDelegate) petEditDetailsActivity.z0.getValue()), false);
                }
            }
        });
        final int i2 = 1;
        this.A0 = w.y0(new Function0(this) { // from class: ny7.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PetEditDetailsActivity f220689b;

            {
                this.f220689b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PetEditDetailsActivity petEditDetailsActivity = this.f220689b;
                switch (i22) {
                    case 0:
                        return new InputTextDelegate(petEditDetailsActivity.f76285w0);
                    case 1:
                        qy7.b bVar = petEditDetailsActivity.f76282s0;
                        if (bVar != null) {
                            return (opi.b) bVar.f250176l.get();
                        }
                        Intrinsics.r("activityComponent");
                        throw null;
                    default:
                        int i3 = PetEditDetailsActivity.C0;
                        return new z4l.j(7, zhm.v.k((InputTextDelegate) petEditDetailsActivity.f76286x0.getValue(), (InputChecklistDelegate) petEditDetailsActivity.y0.getValue(), (RowDelegate) petEditDetailsActivity.z0.getValue()), false);
                }
            }
        });
        final int i3 = 2;
        this.B0 = w.y0(new Function0(this) { // from class: ny7.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PetEditDetailsActivity f220689b;

            {
                this.f220689b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PetEditDetailsActivity petEditDetailsActivity = this.f220689b;
                switch (i22) {
                    case 0:
                        return new InputTextDelegate(petEditDetailsActivity.f76285w0);
                    case 1:
                        qy7.b bVar = petEditDetailsActivity.f76282s0;
                        if (bVar != null) {
                            return (opi.b) bVar.f250176l.get();
                        }
                        Intrinsics.r("activityComponent");
                        throw null;
                    default:
                        int i32 = PetEditDetailsActivity.C0;
                        return new z4l.j(7, zhm.v.k((InputTextDelegate) petEditDetailsActivity.f76286x0.getValue(), (InputChecklistDelegate) petEditDetailsActivity.y0.getValue(), (RowDelegate) petEditDetailsActivity.z0.getValue()), false);
                }
            }
        });
    }

    @Override // nri.b
    public final e F0() {
        b bVar = this.f76282s0;
        if (bVar != null) {
            return (ny7.e) bVar.B.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF102377s0() {
        return this.f76283t0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // rx7.e
    public final f K0() {
        return ((RowDelegate) this.z0.getValue()).f53218h;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        b bVar = this.f76282s0;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ux7.d
    public final r X0() {
        return ((InputTextDelegate) this.f76286x0.getValue()).e.f121375b;
    }

    @Override // hpi.d
    public final c b1() {
        c cVar = new c(new k(BitmapDescriptorFactory.HUE_RED, R$attr.uikit_windowBackground, ISO781611.SMT_TAG));
        xpi.f.Companion.getClass();
        xpi.f configuration = xpi.f.d;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        cVar.f = configuration;
        iqi.g.Companion.getClass();
        iqi.g configuration2 = iqi.g.f167870b;
        Intrinsics.checkNotNullParameter(configuration2, "configuration");
        cVar.i = configuration2;
        cVar.e = true;
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        qy7.c cVar = ((qy7.c) com.bumptech.glide.c.l(this).b(null, this.f76283t0)).f250190g;
        d dVarG = rd0.e.g(this, bundle, null);
        xpi.f.Companion.getClass();
        iqi.g.Companion.getClass();
        this.f76282s0 = new b(cVar, dVarG, (PetEditFlowContract$Configuration) G0());
        PetEditFlowContract$Configuration petEditFlowContract$Configuration = (PetEditFlowContract$Configuration) G0();
        b bVar = this.f76282s0;
        if (bVar == null) {
            Intrinsics.r("activityComponent");
            throw null;
        }
        ly7.c cVar2 = (ly7.c) bVar.f250172c.k.get();
        if (petEditFlowContract$Configuration instanceof PetEditFlowContract$Configuration.EditPetFields) {
            PetEditFlowContract$Configuration.EditPetFields editPetFields = (PetEditFlowContract$Configuration.EditPetFields) petEditFlowContract$Configuration;
            ly7.k kVar = (ly7.k) cVar2;
            j jVar = kVar.f200741c;
            KProperty[] kPropertyArr = ly7.k.f200739m;
            jVar.getValue(kVar, kPropertyArr[1]).set(editPetFields.f76276a);
            kVar.d.getValue(kVar, kPropertyArr[2]).set(editPetFields.f76277b);
            kVar.e.getValue(kVar, kPropertyArr[3]).set(editPetFields.f76278c);
            kVar.f200743h.getValue(kVar, kPropertyArr[6]).set(editPetFields.d);
            kVar.i.getValue(kVar, kPropertyArr[7]).set(editPetFields.e);
            kVar.f.getValue(kVar, kPropertyArr[4]).set(editPetFields.f);
            kVar.f200742g.getValue(kVar, kPropertyArr[5]).set(editPetFields.f76279g);
            kVar.f200744j.getValue(kVar, kPropertyArr[8]).set(Boolean.valueOf(editPetFields.f76280h));
        } else if (petEditFlowContract$Configuration instanceof PetEditFlowContract$Configuration.EditPet) {
            ((ly7.k) cVar2).w0().set(((PetEditFlowContract$Configuration.EditPet) petEditFlowContract$Configuration).f76275a);
        } else {
            if (!(petEditFlowContract$Configuration instanceof PetEditFlowContract$Configuration.EditQuote)) {
                throw new NoWhenBranchMatchedException();
            }
            ((ly7.k) cVar2).w0().set(((PetEditFlowContract$Configuration.EditQuote) petEditFlowContract$Configuration).f76281a);
        }
        super.onCreate(bundle);
        RecyclerView recyclerViewZ0 = Z0();
        y.h(recyclerViewZ0, (z4l.j) this.B0.getValue(), new LinearLayoutManager(recyclerViewZ0.getContext()));
        ((opi.b) this.A0.getValue()).Y("BREED_SELECTION_DIALOG_DELEGATE_KEY", u.c((RowDelegate) this.z0.getValue()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // rx7.e
    public final f q1() {
        return ((InputChecklistDelegate) this.y0.getValue()).f52518c;
    }

    @Override // px7.c
    public final r s0() {
        r rVarDistinctUntilChanged = this.u0.hide().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((z4l.j) this.B0.getValue()).c(items);
    }

    @Override // rx7.e
    public final r t1() {
        r rVarDistinctUntilChanged = this.f76284v0.hide().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // rx7.e
    public final r y0() {
        ?? r06 = this.f76286x0;
        r rVarMerge = r.merge(((InputTextDelegate) r06.getValue()).f52575g.f121375b, ((InputTextDelegate) r06.getValue()).i.f121375b);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        return rVarMerge;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ux7.d
    public final f y1() {
        return ((InputChecklistDelegate) this.y0.getValue()).f52518c;
    }
}
