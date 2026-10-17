package com.revolut.feature.insurance_pet.impl.ui.profile.pet;

import ae7.i;
import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.insurance_pet.impl.ui.profile.pet.PetProfileActivity;
import h08.g;
import hpi.c;
import hpi.d;
import hpi.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mw1.a;
import n08.b;
import n08.f;
import n08.h;
import org.jmrtd.cbeff.ISO781611;
import pri.e;
import te0.w;
import yp0.y;
import z4l.j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/profile/pet/PetProfileActivity;", "Lhpi/d;", "Ln08/f;", "Ln08/h;", "Lcom/revolut/uicomponent/toolbar/app_bar/RevolutToolbar;", "<init>", "()V", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PetProfileActivity extends d implements h {
    public static final /* synthetic */ int F0 = 0;
    public final Object D0;
    public final Object E0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public g f76398s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Object f76399t0;
    public final Object u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final String f76400v0 = "PET_PROFILE_FLOW";

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Object f76401w0 = w.y0(new a(28));

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Object f76402x0 = w.y0(new a(29));
    public final Object y0 = w.y0(new b(0));
    public final Object z0 = w.y0(new b(1));
    public final Object A0 = w.y0(new b(2));
    public final Object B0 = w.y0(new b(3));
    public final Object C0 = w.y0(new b(4));

    public PetProfileActivity() {
        final int i = 0;
        this.f76399t0 = w.y0(new Function0(this) { // from class: n08.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PetProfileActivity f210881b;

            {
                this.f210881b = this;
            }

            /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PetProfileActivity petProfileActivity = this.f210881b;
                switch (i2) {
                    case 0:
                        h08.g gVar = petProfileActivity.f76398s0;
                        if (gVar != null) {
                            return (opi.b) gVar.k.get();
                        }
                        Intrinsics.r("activityComponent");
                        throw null;
                    case 1:
                        int i3 = PetProfileActivity.F0;
                        return new z4l.j(5, zhm.v.k((ListSubheaderDelegate) petProfileActivity.f76401w0.getValue(), (RowDelegate) petProfileActivity.f76402x0.getValue(), new CellDetailsDelegate(), (CellDetailsActionDelegate) petProfileActivity.z0.getValue(), (TextDelegate) petProfileActivity.y0.getValue(), (PlainTextWarningDelegate) petProfileActivity.B0.getValue()), false);
                    case 2:
                        int i5 = PetProfileActivity.F0;
                        return zhm.v.k(new ListCellDelegate(), (LargeActionButtonDelegate) petProfileActivity.A0.getValue(), (TwinHorizontalButtonDelegate) petProfileActivity.C0.getValue(), (TextDelegate) petProfileActivity.y0.getValue(), (RowDelegate) petProfileActivity.f76402x0.getValue());
                    default:
                        h08.g gVar2 = petProfileActivity.f76398s0;
                        if (gVar2 != null) {
                            return (zd7.b) gVar2.J.get();
                        }
                        Intrinsics.r("activityComponent");
                        throw null;
                }
            }
        });
        final int i2 = 3;
        this.u0 = w.y0(new Function0(this) { // from class: n08.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PetProfileActivity f210881b;

            {
                this.f210881b = this;
            }

            /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PetProfileActivity petProfileActivity = this.f210881b;
                switch (i22) {
                    case 0:
                        h08.g gVar = petProfileActivity.f76398s0;
                        if (gVar != null) {
                            return (opi.b) gVar.k.get();
                        }
                        Intrinsics.r("activityComponent");
                        throw null;
                    case 1:
                        int i3 = PetProfileActivity.F0;
                        return new z4l.j(5, zhm.v.k((ListSubheaderDelegate) petProfileActivity.f76401w0.getValue(), (RowDelegate) petProfileActivity.f76402x0.getValue(), new CellDetailsDelegate(), (CellDetailsActionDelegate) petProfileActivity.z0.getValue(), (TextDelegate) petProfileActivity.y0.getValue(), (PlainTextWarningDelegate) petProfileActivity.B0.getValue()), false);
                    case 2:
                        int i5 = PetProfileActivity.F0;
                        return zhm.v.k(new ListCellDelegate(), (LargeActionButtonDelegate) petProfileActivity.A0.getValue(), (TwinHorizontalButtonDelegate) petProfileActivity.C0.getValue(), (TextDelegate) petProfileActivity.y0.getValue(), (RowDelegate) petProfileActivity.f76402x0.getValue());
                    default:
                        h08.g gVar2 = petProfileActivity.f76398s0;
                        if (gVar2 != null) {
                            return (zd7.b) gVar2.J.get();
                        }
                        Intrinsics.r("activityComponent");
                        throw null;
                }
            }
        });
        final int i3 = 1;
        this.D0 = w.y0(new Function0(this) { // from class: n08.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PetProfileActivity f210881b;

            {
                this.f210881b = this;
            }

            /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PetProfileActivity petProfileActivity = this.f210881b;
                switch (i22) {
                    case 0:
                        h08.g gVar = petProfileActivity.f76398s0;
                        if (gVar != null) {
                            return (opi.b) gVar.k.get();
                        }
                        Intrinsics.r("activityComponent");
                        throw null;
                    case 1:
                        int i32 = PetProfileActivity.F0;
                        return new z4l.j(5, zhm.v.k((ListSubheaderDelegate) petProfileActivity.f76401w0.getValue(), (RowDelegate) petProfileActivity.f76402x0.getValue(), new CellDetailsDelegate(), (CellDetailsActionDelegate) petProfileActivity.z0.getValue(), (TextDelegate) petProfileActivity.y0.getValue(), (PlainTextWarningDelegate) petProfileActivity.B0.getValue()), false);
                    case 2:
                        int i5 = PetProfileActivity.F0;
                        return zhm.v.k(new ListCellDelegate(), (LargeActionButtonDelegate) petProfileActivity.A0.getValue(), (TwinHorizontalButtonDelegate) petProfileActivity.C0.getValue(), (TextDelegate) petProfileActivity.y0.getValue(), (RowDelegate) petProfileActivity.f76402x0.getValue());
                    default:
                        h08.g gVar2 = petProfileActivity.f76398s0;
                        if (gVar2 != null) {
                            return (zd7.b) gVar2.J.get();
                        }
                        Intrinsics.r("activityComponent");
                        throw null;
                }
            }
        });
        final int i5 = 2;
        this.E0 = w.y0(new Function0(this) { // from class: n08.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PetProfileActivity f210881b;

            {
                this.f210881b = this;
            }

            /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                PetProfileActivity petProfileActivity = this.f210881b;
                switch (i22) {
                    case 0:
                        h08.g gVar = petProfileActivity.f76398s0;
                        if (gVar != null) {
                            return (opi.b) gVar.k.get();
                        }
                        Intrinsics.r("activityComponent");
                        throw null;
                    case 1:
                        int i32 = PetProfileActivity.F0;
                        return new z4l.j(5, zhm.v.k((ListSubheaderDelegate) petProfileActivity.f76401w0.getValue(), (RowDelegate) petProfileActivity.f76402x0.getValue(), new CellDetailsDelegate(), (CellDetailsActionDelegate) petProfileActivity.z0.getValue(), (TextDelegate) petProfileActivity.y0.getValue(), (PlainTextWarningDelegate) petProfileActivity.B0.getValue()), false);
                    case 2:
                        int i59 = PetProfileActivity.F0;
                        return zhm.v.k(new ListCellDelegate(), (LargeActionButtonDelegate) petProfileActivity.A0.getValue(), (TwinHorizontalButtonDelegate) petProfileActivity.C0.getValue(), (TextDelegate) petProfileActivity.y0.getValue(), (RowDelegate) petProfileActivity.f76402x0.getValue());
                    default:
                        h08.g gVar2 = petProfileActivity.f76398s0;
                        if (gVar2 != null) {
                            return (zd7.b) gVar2.J.get();
                        }
                        Intrinsics.r("activityComponent");
                        throw null;
                }
            }
        });
    }

    @Override // nri.b
    public final e F0() {
        g gVar = this.f76398s0;
        if (gVar != null) {
            return (f) gVar.K.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF71175s0() {
        return this.f76400v0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        g gVar = this.f76398s0;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // hpi.d
    public final c b1() {
        c cVar = new c(new k(BitmapDescriptorFactory.HUE_RED, R$attr.uikit_windowBackground, ISO781611.SMT_TAG));
        wpi.d.Companion.getClass();
        wpi.d configuration = wpi.d.f299342b;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        cVar.f154551g = configuration;
        c.b(cVar);
        return cVar;
    }

    public final void c1() {
        PetProfileContract$Configuration petProfileContract$Configuration = (PetProfileContract$Configuration) G0();
        g gVar = this.f76398s0;
        if (gVar == null) {
            Intrinsics.r("activityComponent");
            throw null;
        }
        f08.k kVar = (f08.k) ((f08.e) gVar.f148263b.A.get());
        kVar.d().set(petProfileContract$Configuration.f76403a);
        kVar.z0().set(petProfileContract$Configuration.f76404b);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        h08.h hVar = ((h08.h) com.bumptech.glide.c.l(this).b(null, this.f76400v0)).f148283h;
        xoi.d dVarG = rd0.e.g(this, bundle, null);
        wpi.d.Companion.getClass();
        ypi.h.Companion.getClass();
        this.f76398s0 = new g(hVar, dVarG);
        c1();
        super.onCreate(bundle);
        RecyclerView recyclerViewZ0 = Z0();
        y.h(recyclerViewZ0, (j) this.D0.getValue(), new LinearLayoutManager(recyclerViewZ0.getContext()));
        ((opi.b) this.f76399t0.getValue()).Y("DEFAULT_LEGACY_DIALOG_DELEGATES_KEY", (List) this.E0.getValue());
        ((i) ((zd7.b) this.u0.getValue())).a(this);
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        c1();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((j) this.D0.getValue()).c(items);
    }
}
