package com.revolut.feature.profile.impl.ui.confirmation;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.common.ui.R$id;
import hpi.h;
import hpi.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oma.e;
import opi.b;
import org.jmrtd.cbeff.ISO781611;
import pma.a;
import pma.c;
import pma.d;
import xpi.f;
import yp0.y;
import z4l.j;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/confirmation/ProfileDetailsConfirmationActivity;", "Lhpi/h;", "Loma/b;", "Loma/e;", "<init>", "()V", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProfileDetailsConfirmationActivity extends h implements e {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public c f81364t0;
    public b u0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final CellDetailsNoteDelegate f81366w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final FullScreenStateDelegate f81367x0;
    public final j y0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final String f81363s0 = "PROFILE_DETAILS_CONFIRMATION_FLOW";

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final LargeActionButtonDelegate f81365v0 = new LargeActionButtonDelegate();

    public ProfileDetailsConfirmationActivity() {
        CellDetailsNoteDelegate cellDetailsNoteDelegate = new CellDetailsNoteDelegate();
        this.f81366w0 = cellDetailsNoteDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.f81367x0 = fullScreenStateDelegate;
        this.y0 = new j(7, v.k(cellDetailsNoteDelegate, new CellDetailsLoadingDelegate(), fullScreenStateDelegate), false);
    }

    @Override // nri.b
    public final pri.e F0() {
        c cVar = this.f81364t0;
        if (cVar != null) {
            return (oma.b) ((a) cVar).F.get();
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF71175s0() {
        return this.f81363s0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        c cVar = this.f81364t0;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.r("component");
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

    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        lal.a aVarA = ((d) com.bumptech.glide.c.l(this).b(null, this.f81363s0)).a();
        aVarA.f193427c = rd0.e.g(this, bundle, Integer.valueOf(R$id.fragment_container));
        f.Companion.getClass();
        aVarA.d = f.d;
        ypi.h.Companion.getClass();
        ypi.h hVar = ypi.h.e;
        hVar.getClass();
        aVarA.e = hVar;
        c cVar = (c) aVarA.build();
        this.f81364t0 = cVar;
        a aVar = (a) cVar;
        this.u0 = (b) aVar.o.get();
        super.onCreate(bundle);
        RecyclerView recyclerViewZ0 = Z0();
        y.h(recyclerViewZ0, this.y0, new LinearLayoutManager(recyclerViewZ0.getContext()));
        b bVar = this.u0;
        if (bVar != null) {
            bVar.Y("ACTIVITY_DIALOG_DELEGATE_KEY", u.c(this.f81365v0));
        } else {
            Intrinsics.r("expandableDialogActivityDelegate");
            throw null;
        }
    }

    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.y0.c(items);
    }
}
